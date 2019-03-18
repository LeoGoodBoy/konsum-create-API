package com.imi.dolphin.sdkwebservice.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {

    @Value("${server.port}")
    String servicePort;

    @Value("${app.form.id}")
    String formId;

    @Value("${mail.username}")
    String mailUsername;

    @Value("${mail.password}")
    String mailPassword;

    @Value("${mail.smtp.auth}")
    String mailStmpAuth;

    @Value("${mail.smtp.starttls.enable}")
    String mailSmtpTls;

    @Value("${mail.smtp.host}")
    String mailSmtpHost;

    @Value("${mail.smtp.port}")
    String mailSmtpPort;

    @Value("${email.recipient1}")
    String emailrecipient1;

    @Value("${email.recipient2}")
    String emailrecipient2;

    @Value("${email.recipient1.name}")
    String namerecipient1;

    @Value("${email.recipient2.name}")
    String namerecipient2;

    @Value("${dolphin.url.base}")
    String baseUrl;

    @Value("${dolphin.api.token}")
    String apiToken;

    @Value("${dolphin.api.form}")
    String apiForm;

    @Value("${fieldName.ticketNumber}")
    String ticketNumber;

    @Value("${dolphin.form.id.cuti}")
    String formIdCuti;

    @Value("${dolphin.url.api}")
    String url;

    @Value("${dolphin.url.path}")
    String path;

    @Value("${dolphin.url.param.collName}")
    String collName;

    @Value("${dolphin.url.param.fieldName}")
    String fieldName;

    @Value("${dolphin.url.param.distance}")
    String distance;

    @Value("${dolphin.url.param.start}")
    String start;

    @Value("${dolphin.url.param.count}")
    String count;

    @Value("${dolphin.google.map.url.query}")
    String googleMapUrl;

    @Value("${dolphin.atm.image.url}")
    String atmUrl;

    @Value("${dolphin.error.atm.not.found}")
    String atmNotFoundMessage;

    @Value("${dolphin.button.title}")
    String buttonTitlePayload;

    @Value("${app.form.id.request}")
    String formRequest;

    @Value("${Api.Key.Satu}")
    String apikeySatu;

    @Value("${Api.Key.SatuDua}")
    String apikeySatuDua;

    @Value("${Api.Key.Dua}")
    String apikeyDua;

    @Value("${Api.Key.DuaDua}")
    String apikeyDuaDua;

    @Value("${img.sami}")
    String imgSami;

    @Value("${img.metrodata}")
    String imgMetrodata;

    @Value("${img.miibigger}")
    String imgMiibigger;

    @Value("${img.synnex}")
    String imgSynnex;

    @Value("${img.xerindo}")
    String imgXerindo;

    @Value("${img.packetsystems}")
    String imgPacketsystems;

    @Value("${img.soltius}")
    String imgSoltius;

    @Value("${img.mii}")
    String imgMii;

    @Value("${img.candra}")
    String imgCandra;

    @Value("${img.ben}")
    String imgBen;

    @Value("${img.agus}")
    String imgAgus;

    @Value("${img.lulu}")
    String imgLulu;

    @Value("${img.randy}")
    String imgRandy;

    @Value("${img.susanto}")
    String imgSusanto;

    @Value("${img.sjafril}")
    String imgSjafril;

    @Value("${img.susanto2}")
    String imgSusanto2;

    @Value("${img.sjafril2}")
    String imgSjafril2;

    @Value("${img.ira}")
    String imgIra;

    @Value("${img.titi}")
    String imgTiti;

    @Value("${img.alex}")
    String imgAlex;
    
    @Value("${siloam.api.specialistbyname}")
    String apiSpecialistbyname;
    
    @Value("${img.ocbc.opsi_1}")
    String imgOcbcOpsi_1;
    
    @Value("${img.ocbc.opsi_2}")
    String imgOcbcOpsi_2;
    
    @Value("${img.ocbc.opsi_3}")
    String imgOcbcOpsi_3;
    
    @Value("${img.ocbc.opsi_4}")
    String imgOcbcOpsi_4;
    
    @Value("${img.ocbc.opsi_5}")
    String imgOcbcOpsi_5;
    
    @Value("${img.ocbc.alternatif_1}")
    String imgOcbcAlternatif_1;
    
    @Value("${img.ocbc.alternatif_2}")
    String imgOcbcAlternatif_2;
    
    @Value("${img.ocbc.alternatif_3}")
    String imgOcbcAlternatif_3;
    
    @Value("${img.ocbc.alternatif_4}")
    String imgOcbcAlternatif_4;
    
    @Value("${img.ocbc.alternatif_5}")
    String imgOcbcAlternatif_5;

    public String getImgOcbcOpsi_1() {
        return imgOcbcOpsi_1;
    }

    public void setImgOcbcOpsi_1(String imgOcbcOpsi_1) {
        this.imgOcbcOpsi_1 = imgOcbcOpsi_1;
    }

    public String getImgOcbcOpsi_2() {
        return imgOcbcOpsi_2;
    }

    public void setImgOcbcOpsi_2(String imgOcbcOpsi_2) {
        this.imgOcbcOpsi_2 = imgOcbcOpsi_2;
    }

    public String getImgOcbcOpsi_3() {
        return imgOcbcOpsi_3;
    }

    public void setImgOcbcOpsi_3(String imgOcbcOpsi_3) {
        this.imgOcbcOpsi_3 = imgOcbcOpsi_3;
    }

    public String getImgOcbcOpsi_4() {
        return imgOcbcOpsi_4;
    }

    public void setImgOcbcOpsi_4(String imgOcbcOpsi_4) {
        this.imgOcbcOpsi_4 = imgOcbcOpsi_4;
    }

    public String getImgOcbcOpsi_5() {
        return imgOcbcOpsi_5;
    }

    public void setImgOcbcOpsi_5(String imgOcbcOpsi_5) {
        this.imgOcbcOpsi_5 = imgOcbcOpsi_5;
    }

    public String getImgOcbcAlternatif_1() {
        return imgOcbcAlternatif_1;
    }

    public void setImgOcbcAlternatif_1(String imgOcbcAlternatif_1) {
        this.imgOcbcAlternatif_1 = imgOcbcAlternatif_1;
    }

    public String getImgOcbcAlternatif_2() {
        return imgOcbcAlternatif_2;
    }

    public void setImgOcbcAlternatif_2(String imgOcbcAlternatif_2) {
        this.imgOcbcAlternatif_2 = imgOcbcAlternatif_2;
    }

    public String getImgOcbcAlternatif_3() {
        return imgOcbcAlternatif_3;
    }

    public void setImgOcbcAlternatif_3(String imgOcbcAlternatif_3) {
        this.imgOcbcAlternatif_3 = imgOcbcAlternatif_3;
    }

    public String getImgOcbcAlternatif_4() {
        return imgOcbcAlternatif_4;
    }

    public void setImgOcbcAlternatif_4(String imgOcbcAlternatif_4) {
        this.imgOcbcAlternatif_4 = imgOcbcAlternatif_4;
    }

    public String getImgOcbcAlternatif_5() {
        return imgOcbcAlternatif_5;
    }

    public void setImgOcbcAlternatif_5(String imgOcbcAlternatif_5) {
        this.imgOcbcAlternatif_5 = imgOcbcAlternatif_5;
    }
    
    

    public String getApiSpecialistbyname() {
        return apiSpecialistbyname;
    }

    public void setApiSpecialistbyname(String apiSpecialistbyname) {
        this.apiSpecialistbyname = apiSpecialistbyname;
    }

    public String getImgSami() {
        return imgSami;
    }

    public void setImgSami(String imgSami) {
        this.imgSami = imgSami;
    }

    public String getImgMetrodata() {
        return imgMetrodata;
    }

    public void setImgMetrodata(String imgMetrodata) {
        this.imgMetrodata = imgMetrodata;
    }

    public String getImgMiibigger() {
        return imgMiibigger;
    }

    public void setImgMiibigger(String imgMiibigger) {
        this.imgMiibigger = imgMiibigger;
    }

    public String getImgSynnex() {
        return imgSynnex;
    }

    public void setImgSynnex(String imgSynnex) {
        this.imgSynnex = imgSynnex;
    }

    public String getImgXerindo() {
        return imgXerindo;
    }

    public void setImgXerindo(String imgXerindo) {
        this.imgXerindo = imgXerindo;
    }

    public String getImgPacketsystems() {
        return imgPacketsystems;
    }

    public void setImgPacketsystems(String imgPacketsystems) {
        this.imgPacketsystems = imgPacketsystems;
    }

    public String getImgSoltius() {
        return imgSoltius;
    }

    public void setImgSoltius(String imgSoltius) {
        this.imgSoltius = imgSoltius;
    }

    public String getImgMii() {
        return imgMii;
    }

    public void setImgMii(String imgMii) {
        this.imgMii = imgMii;
    }

    public String getImgCandra() {
        return imgCandra;
    }

    public void setImgCandra(String imgCandra) {
        this.imgCandra = imgCandra;
    }

    public String getImgBen() {
        return imgBen;
    }

    public void setImgBen(String imgBen) {
        this.imgBen = imgBen;
    }

    public String getImgAgus() {
        return imgAgus;
    }

    public void setImgAgus(String imgAgus) {
        this.imgAgus = imgAgus;
    }

    public String getImgLulu() {
        return imgLulu;
    }

    public void setImgLulu(String imgLulu) {
        this.imgLulu = imgLulu;
    }

    public String getImgRandy() {
        return imgRandy;
    }

    public void setImgRandy(String imgRandy) {
        this.imgRandy = imgRandy;
    }

    public String getImgSusanto() {
        return imgSusanto;
    }

    public void setImgSusanto(String imgSusanto) {
        this.imgSusanto = imgSusanto;
    }

    public String getImgSjafril() {
        return imgSjafril;
    }

    public void setImgSjafril(String imgSjafril) {
        this.imgSjafril = imgSjafril;
    }

    public String getImgSusanto2() {
        return imgSusanto2;
    }

    public void setImgSusanto2(String imgSusanto2) {
        this.imgSusanto2 = imgSusanto2;
    }

    public String getImgSjafril2() {
        return imgSjafril2;
    }

    public void setImgSjafril2(String imgSjafril2) {
        this.imgSjafril2 = imgSjafril2;
    }

    public String getImgIra() {
        return imgIra;
    }

    public void setImgIra(String imgIra) {
        this.imgIra = imgIra;
    }

    public String getImgTiti() {
        return imgTiti;
    }

    public void setImgTiti(String imgTiti) {
        this.imgTiti = imgTiti;
    }

    public String getImgAlex() {
        return imgAlex;
    }

    public void setImgAlex(String imgAlex) {
        this.imgAlex = imgAlex;
    }
    
    

    public String getApikeySatuDua() {
        return apikeySatuDua;
    }

    public void setApikeySatuDua(String apikeySatuDua) {
        this.apikeySatuDua = apikeySatuDua;
    }

    public String getApikeyDuaDua() {
        return apikeyDuaDua;
    }

    public void setApikeyDuaDua(String apikeyDuaDua) {
        this.apikeyDuaDua = apikeyDuaDua;
    }

    public String getApikeySatu() {
        return apikeySatu;
    }

    public void setApikeySatu(String apikeySatu) {
        this.apikeySatu = apikeySatu;
    }

    public String getApikeyDua() {
        return apikeyDua;
    }

    public void setApikeyDua(String apikeyDua) {
        this.apikeyDua = apikeyDua;
    }

    public String getFormRequest() {
        return formRequest;
    }

    public void setFormRequest(String formRequest) {
        this.formRequest = formRequest;
    }

    public String getButtonTitlePayload() {
        return buttonTitlePayload;
    }

    public void setButtonTitlePayload(String buttonTitlePayload) {
        this.buttonTitlePayload = buttonTitlePayload;
    }

    public String getAtmNotFoundMessage() {
        return atmNotFoundMessage;
    }

    public void setAtmNotFoundMessage(String atmNotFoundMessage) {
        this.atmNotFoundMessage = atmNotFoundMessage;
    }

    public String getGoogleMapUrl() {
        return googleMapUrl;
    }

    public void setGoogleMapUrl(String googleMapUrl) {
        this.googleMapUrl = googleMapUrl;
    }

    public String getAtmUrl() {
        return atmUrl;
    }

    public void setAtmUrl(String atmUrl) {
        this.atmUrl = atmUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCollName() {
        return collName;
    }

    public void setCollName(String collName) {
        this.collName = collName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getServicePort() {
        return servicePort;
    }

    public void setServicePort(String servicePort) {
        this.servicePort = servicePort;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getFormIdCuti() {
        return formIdCuti;
    }

    public void setFormIdCuti(String formIdCuti) {
        this.formIdCuti = formIdCuti;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getApiForm() {
        return apiForm;
    }

    public void setApiForm(String apiForm) {
        this.apiForm = apiForm;
    }

    public String getNamerecipient1() {
        return namerecipient1;
    }

    public void setNamerecipient1(String namerecipient1) {
        this.namerecipient1 = namerecipient1;
    }

    public String getEmailrecipient1() {
        return emailrecipient1;
    }

    public void setEmailrecipient1(String emailrecipient1) {
        this.emailrecipient1 = emailrecipient1;
    }

    public String getEmailrecipient2() {
        return emailrecipient2;
    }

    public void setEmailrecipient2(String emailrecipient2) {
        this.emailrecipient2 = emailrecipient2;
    }

    public String getNamerecipient2() {
        return namerecipient2;
    }

    public void setNamerecipient2(String namerecipient2) {
        this.namerecipient2 = namerecipient2;
    }

    public String getMailUsername() {
        return mailUsername;
    }

    public void setMailUsername(String mailUsername) {
        this.mailUsername = mailUsername;
    }

    public String getMailPassword() {
        return mailPassword;
    }

    public void setMailPassword(String mailPassword) {
        this.mailPassword = mailPassword;
    }

    public String getMailStmpAuth() {
        return mailStmpAuth;
    }

    public void setMailStmpAuth(String mailStmpAuth) {
        this.mailStmpAuth = mailStmpAuth;
    }

    public String getMailSmtpTls() {
        return mailSmtpTls;
    }

    public void setMailSmtpTls(String mailSmtpTls) {
        this.mailSmtpTls = mailSmtpTls;
    }

    public String getMailSmtpHost() {
        return mailSmtpHost;
    }

    public void setMailSmtpHost(String mailSmtpHost) {
        this.mailSmtpHost = mailSmtpHost;
    }

    public String getMailSmtpPort() {
        return mailSmtpPort;
    }

    public void setMailSmtpPort(String mailSmtpPort) {
        this.mailSmtpPort = mailSmtpPort;
    }

}
