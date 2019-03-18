package com.imi.dolphin.sdkwebservice.model;

import java.io.Serializable;
import java.util.List;
public class ExtensionRequest implements Serializable {
	private static final long serialVersionUID = -4421653972044575567L;
	private List<EasyMap> parameters;
	private String commandName;
	private String promptVariable;
	private String integrationType;

	/**
	 * @return Get the parameters
	 */
	public List<EasyMap> getParameters() {
		return parameters;
	}

	/**
	 * @param parameters
	 *            the parameters to set
	 */
	public void setParameters(List<EasyMap> parameters) {
		this.parameters = parameters;
	}

	/**
	 * @return Get the commandName
	 */
	public String getCommandName() {
		return commandName;
	}

	/**
	 * @param commandName
	 *            the commandName to set
	 */
	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}

	/**
	 * @return Get the promptVariable
	 */
	public String getPromptVariable() {
		return promptVariable;
	}

	/**
	 * @param promptVariable
	 *            the promptVariable to set
	 */
	public void setPromptVariable(String promptVariable) {
		this.promptVariable = promptVariable;
	}

	/**
	 * @return Get the integrationType
	 */
	public String getIntegrationType() {
		return integrationType;
	}

	/**
	 * @param integrationType
	 * the integrationType to set
	 */
	public void setIntegrationType(String integrationType) {
		this.integrationType = integrationType;
	}
	
	
}
