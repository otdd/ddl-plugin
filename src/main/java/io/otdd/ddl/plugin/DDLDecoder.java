package io.otdd.ddl.plugin;

import java.util.Map;

public interface DDLDecoder {
	
	public String decodeRequest(byte[] bytes,Map<String,String> protocolSettings);
	public String decodeResponse(byte[] bytes,Map<String,String> protocolSettings);
	
}
