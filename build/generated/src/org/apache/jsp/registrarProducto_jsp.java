package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <table border=\"0\" width=\"1000\" align=\"center\">\n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th><a href=\"index.jsp\">Catálogo</a></th>\n");
      out.write("                <th><a href=\"registrarProducto.jsp\">Registrar Producto</a></th>\n");
      out.write("                <th><a href=\"registrarVenta.jsp\">Registrar ventas</a></th>\n");
      out.write("                <th><a href=\"consultarVentas.jsp\">Consultar Ventas</a></th>\n");
      out.write("                <th><a href=\"ServletLogueo?accion=cerrar\">Cerrar Sesión</a></th>\n");
      out.write("                <th width=\"200\"></th>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("         <h2 align=\"center\">Cargar Imagen</h2>\n");
      out.write("         <table border=\"0\" width=\"400\" align=\"center\">\n");
      out.write("        <form action=\"subirImagen.jsp\" enctype=\"multipart/form-data\" method=\"post\">\n");
      out.write("            <tr bgcolor=\"skyblue\">                         \n");
      out.write("                <th>Imagen</th>\n");
      out.write("                <th><input type=\"file\" name=\"file\"/></th>\n");
      out.write("            </tr><tr> \n");
      out.write("                <th colspan=\"2\">                                                                                                       \n");
      out.write("                    <input type=\"submit\" value=\"Registrar\" name=\"CargarImagen\"/>\n");
      out.write("                </th></tr>\n");
      out.write("        </form>                \n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
