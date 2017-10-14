/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-10-13 01:43:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.zhiyou.clouddisk.model.FileIndex;
import com.github.pagehelper.Page;

public final class searchResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/top.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"panel panel-warning\">\r\n");
      out.write("  <div class=\"panel-heading\">\r\n");
      out.write("    <form class=\"form-inline\" action=\"searchFiles\" method=\"post\">\r\n");
      out.write("    \t<label>查询条件：文件名称</label>\r\n");
      out.write("    \t<input class=\"form-control\" name=\"keyWord\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${keyWord}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("    \t<input type=\"hidden\" name=\"pageNum\">\r\n");
      out.write("    \t<button type=\"submit\" class=\"btn btn-default\">搜索</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"panel-body\">\r\n");
      out.write("    <table class=\"table table-bordered table-striped table-hover\">\r\n");
      out.write("       <thead>\r\n");
      out.write("\t   <tr>\r\n");
      out.write("\t       <th>ID</th>\r\n");
      out.write("\t       <th>名称</th>\r\n");
      out.write("\t       <th>路径</th>\r\n");
      out.write("\t       <th>是否文件</th>\r\n");
      out.write("\t   </tr>\r\n");
      out.write("\t   </thead>\r\n");

Page<FileIndex> result = (Page<FileIndex>)request.getAttribute("result");
int nowPage = result.getPageNum();
if(result!=null){
	for(FileIndex r:result){


      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print(r.getFileIndexId() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(r.getName() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(r.getPath() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(r.getIsFile() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");

	}
}

      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<nav aria-label=\"Page navigation\">\r\n");
      out.write("\t  <ul class=\"pagination\">\r\n");
      out.write("\t    <li>\r\n");
      out.write("\t      <a href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("\t        <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("\t      </a>\r\n");
      out.write("\t    </li>\r\n");

//当前页前面两个页码小于2个
if(result.getPageNum()<3){
	for(int i=1;i<=5&&i<=result.getPages();i++){

      out.write("\r\n");
      out.write("\t\t<li class=\"");
      out.print(result.getPageNum()==i?"active":"" );
      out.write("\"><a href=\"#\" onclick=\"pageTo('");
      out.print(i );
      out.write("')\">");
      out.print(i );
      out.write("</a></li>\r\n");

	}
}else if((result.getPages()-result.getPageNum())<=2){
	//当前页后面两个页码小于2个
	for(long i=((result.getPages()-4)<=1?1:(result.getPages()-4));i<=result.getPages();i++){

      out.write("\r\n");
      out.write("\t\t<li class=\"");
      out.print(result.getPageNum()==i?"active":"" );
      out.write("\"><a href=\"#\" onclick=\"pageTo('");
      out.print(i );
      out.write("')\">");
      out.print(i );
      out.write("</a></li>\r\n");

	}
}else{
	for(int i=result.getPageNum()-2;i<=result.getPageNum()+2;i++){

      out.write("\r\n");
      out.write("\t\t<li class=\"");
      out.print(result.getPageNum()==i?"active":"" );
      out.write("\"><a href=\"#\" onclick=\"pageTo('");
      out.print(i );
      out.write("')\">");
      out.print(i );
      out.write("</a></li>\r\n");

	}
}

      out.write("\r\n");
      out.write("\t    <li>\r\n");
      out.write("\t      <a href=\"#\" aria-label=\"Next\">\r\n");
      out.write("\t        <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("\t      </a>\r\n");
      out.write("\t    </li>\r\n");
      out.write("\t  </ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function pageTo(pageNum){\r\n");
      out.write("\t$(\"input[name='pageNum']\").val(pageNum);\r\n");
      out.write("\t$(\"form[action='searchFiles']\").submit();\r\n");
      out.write("}\n");
      out.write("</script>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/bottom.jsp", out, false);
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
