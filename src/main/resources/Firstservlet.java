5n
import javax.servlet.*;
import java.io.IOException;

public class Firstservlets  implements Servlet{
    //lifecycle methods

    //    we store the values from prmeter in variable
    ServletConfig conf;
    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.println("creating an object");
    }
    public void service(ServletRequest request,ServletResponse response) throws ServletException, IOException {
        System.out.println("logic processing");
    }
    public void destroy(){
        System.out.println("lgoing to destroy");
    }
    //non life cycle methods

    public ServletConfig getServletConfig() {
        return this.conf;
    }

    public String  getServletInfo() {
        return "this is created by-------";
    }
}
