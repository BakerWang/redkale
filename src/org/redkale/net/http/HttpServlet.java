/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redkale.net.http;

import org.redkale.net.Servlet;

/**
 *
 * <p>
 * 详情见: https://redkale.org
 *
 * @author zhangjx
 */
public abstract class HttpServlet extends Servlet<HttpContext, HttpRequest, HttpResponse> {

    String _prefix = ""; //当前HttpServlet的path前缀

}
