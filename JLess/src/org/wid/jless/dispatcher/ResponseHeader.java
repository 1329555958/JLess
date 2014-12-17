/**
 * Create at Dec 13, 2014 by wid
 */
package org.wid.jless.dispatcher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.wid.jless.json.JLessJson;
import org.wid.jless.log.JLessLog;

/**
 * 响应头信息设置
 * @author wid
 * Create at Dec 13, 2014
 */
class ResponseHeader {
	private static Log log = JLessLog.getLog(ResponseHeader.class);
	/**
	 * 根据请求头信息设置响应头信息
	 * @param request
	 * @param response
	 * add at Dec 16, 2014
	 */
	public static void setResposeHeader(HttpServletRequest request,HttpServletResponse response){
		log.debug("请求信息:"+JLessJson.stringify(request));
	}
}
