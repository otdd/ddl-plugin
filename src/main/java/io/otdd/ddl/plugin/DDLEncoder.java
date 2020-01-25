package io.otdd.ddl.plugin;

import java.util.Map;

public interface DDLEncoder {

	public byte[] encodeRequest(String ddl,Map<String,String> protocolSettings);
	public byte[] encodeResponse(String ddl,Map<String,String> protocolSettings);

}
