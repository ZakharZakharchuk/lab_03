package com.example.lab_03.controller;

import com.example.lab_03.model.Answer;
import com.example.lab_03.model.Calculator;
import com.example.lab_03.model.Param;
import com.example.lab_03.model.Validator;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
                        Double.parseDouble(request.getParameter(x + "From")),
                        Double.parseDouble(request.getParameter(x + "To")),
                        Double.parseDouble(request.getParameter(x + "Step"))))
                .toList();

        List<Answer> answers = calculator.calculateTask(params);
        request.setAttribute("answers", answers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/answer.jsp");
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
