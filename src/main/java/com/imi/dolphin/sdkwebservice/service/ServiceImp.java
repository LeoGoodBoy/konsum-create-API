package com.imi.dolphin.sdkwebservice.service;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imi.dolphin.sdkwebservice.model.Blog;
import com.imi.dolphin.sdkwebservice.model.EasyMap;
import com.imi.dolphin.sdkwebservice.model.ExtensionRequest;
import com.imi.dolphin.sdkwebservice.property.AppProperties;
import com.imi.dolphin.sdkwebservice.util.OkHttpUtil;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
//import org.slf4j.LoggerFactory;

@Service
public class ServiceImp implements IService {

//    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ServiceImp.class);
    public static final String OUTPUT = "output";
//    private static final String SAMPLE_IMAGE_PATH = "https://goo.gl/SHdL8D";
    private static final String SAMPLE_IMAGE_PATH = "";
//    private static final String SAMPLE_IMAGE_PATH = "data:image/jpeg;base64,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";
    private static final String Image_cuti = "https://image.ibb.co/eAshTV/bot.jpg";
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String CONSTANT_SPLIT_SYNTAX = "&split&";
    private static final String API_PARAM_NAME_COLLNAME = "?collName=";
    private static final String API_PARAM_NAME_FIELDNAME = "&fieldName=";
    private static final String API_PARAM_NAME_LATLONG = "&latlong=";
    private static final String API_PARAM_NAME_DISTANCE = "&d=";
    private static final String API_PARAM_NAME_COUNT = "&count=";
    @Autowired
    AppProperties appProperties;

    @Autowired
    IMailService svcMailService;

    private String getEasyMapValueByName(ExtensionRequest extensionRequest, String name) {
        EasyMap easyMap = extensionRequest.getParameters().stream().filter(x -> x.getName().equals(name)).findAny()
                .orElse(null);
        if (easyMap != null) {
            return easyMap.getValue();
        }
        return "";
    }

    public int konvert_time(int a) {
        int hasil = a;
        int leng = 0;
        try {
            OkHttpUtil okHttpUtil = new OkHttpUtil();
            okHttpUtil.init(true);
            Request request = new Request.Builder().url("http://leokrisnoto.com/api_ocbc/apiMaster.php?konverter").get().build();
            Response response = okHttpUtil.getClient().newCall(request).execute();
            JSONObject jsonobj = new JSONObject(response.body().string());
            JSONArray data = jsonobj.getJSONArray("data");
            leng = data.length();
            for (int i = 0; i < leng; i++) {
                JSONObject jObj = data.getJSONObject(i);
                String nilai = jObj.getString("nilai");
                int min = jObj.getInt("min");
                int max = jObj.getInt("max");
                if (hasil > min && hasil <= max) {
                    hasil = Integer.parseInt(nilai);
                }
            }
        } catch (Exception e) {
        }
        return hasil;
    }
    
    @Override
    public Blog cobaCustom(ExtensionRequest extensionRequest){
        Blog blog = new Blog();
        String content = getEasyMapValueByName(extensionRequest, "content");
        String title = getEasyMapValueByName(extensionRequest, "title");
        blog.setContent(content);
        blog.setTitle(title);
        return blog;
    }
}
