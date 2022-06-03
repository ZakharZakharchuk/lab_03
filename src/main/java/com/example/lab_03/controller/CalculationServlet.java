package com.example.lab_03.controller;

import com.example.lab_03.model.Answer;
import com.example.lab_03.model.Calculator;
import com.example.lab_03.model.Param;
import com.example.lab_03.model.Validator;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CalculationServlet", value = "/calculation")
public class CalculationServlet extends HttpServlet {

    Calculator calculator = new Calculator();
    Validator validator = new Validator();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> names = List.of("a", "b", "c", "d");
        List<Param> params = names.stream().map(x -> new Param(
                        Integer.parseInt(request.getParameter(x + "From")),
                        Integer.parseInt(request.getParameter(x + "To")),
                        Integer.parseInt(request.getParameter(x + "Step"))))
                .toList();

//        request.getParameterNames();
//        String from = request.getParameter("dFrom");
//        String to = request.getParameter("dTo");
//        String step = request.getParameter("dStep");
//        request.setAttribute("from", from);
//        request.setAttribute("to", to);
//        request.setAttribute("step", step);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("deno.jsp");
//        dispatcher.forward(request, response);
//        System.out.println(params);
//        Param a = new Param(Integer.parseInt(request.getParameter("aFrom")),
//                Integer.parseInt(request.getParameter("aTo")),
//                Integer.parseInt(request.getParameter("aStep")));
//        Param b = new Param(Integer.parseInt(request.getParameter("bFrom")),
//                Integer.parseInt(request.getParameter("bTo")),
//                Integer.parseInt(request.getParameter("bStep")));
//        Param c = new Param(Integer.parseInt(request.getParameter("cFrom")),
//                Integer.parseInt(request.getParameter("cTo")),
//                Integer.parseInt(request.getParameter("cStep")));
//        Param d = new Param(Integer.parseInt(request.getParameter("dFrom")),
//                Integer.parseInt(request.getParameter("dTo")),
//                Integer.parseInt(request.getParameter("dStep")));

//        List<Param> params = List.of(a, b, c, d);
        List<Answer> answers = calculator.calculateTask(params);
        request.setAttribute("answers", answers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("answer.jsp");
        dispatcher.forward(request, response);
//        Map<String, String> map = new HashMap<>();
//        for (int i = 0; i < names.size(); i++) {
//            map.put(names.get(i), params.get(i));
//        }
//        HttpSession session = request.getSession();
//        session.setMaxInactiveInterval(172800);
//
//        map.forEach(session::setAttribute);
//
//        if (validator.isNumeric(params)) {
//            List<Double> list = params.stream().map(Double::parseDouble).toList();
//            double result = calculator.calculateTask(list.get(0), list.get(1), list.get(2), list.get(3));
//            if (Double.isNaN(result))
//                response.sendRedirect("view/nan-message.jsp");
//            else {
//                request.setAttribute("result", result);
//                RequestDispatcher dispatcher = request.getRequestDispatcher("view/answer.jsp");
//                dispatcher.forward(request, response);
//            }
//        } else {
//            response.sendRedirect("view/error-message.jsp");
//        }
    }
}
