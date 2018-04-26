import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InterestServlet", urlPatterns = "/info")
public class InterestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double money = Double.parseDouble(request.getParameter("money"));
        int month = Integer.parseInt(request.getParameter("month"));
        double interest_rate = Double.parseDouble(request.getParameter("interest_rate"));

        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (interest_rate / 100) / 12 * month;
        }

        request.setAttribute("money", money);
        request.setAttribute("month", month);
        request.setAttribute("interest_rate", interest_rate);
        request.setAttribute("total", total);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/info.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
