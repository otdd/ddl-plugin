package io.otdd.ddl.plugin;

import java.util.Map;

import org.pf4j.ExtensionPoint;

public interface DDLCodecFactory extends ExtensionPoint {

	/*
	 * the settings that needed. e.g. the thrift protocol and transport type. 
	 * these setting will be displayed on web that can be set by user.
	 * the key is the setting itself, the value is the hint.
	 */
	public Map<String,String> getReqProtocolSettings();
	
	public Map<String,String> getRespProtocolSettings();
	
	public boolean init(Map<String,String> reqProtocolSettings,Map<String,String> respProtocolSettings);
	
	public boolean updateSettings(Map<String,String> reqProtocolSettings,Map<String,String> respProtocolSettings);
	
	void destroy();
	
	public String getProtocolName();
	
	public String getPluginName();

	public String getPluginVersion();

	public DDLDecoder getDecoder();
	
	public DDLEncoder getEncoder();
	
}
