package ke.co.safaricom;

import ke.co.safaricom.Dao.LoginDao;
import spark.ModelAndView;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
import spark.template.handlebars.HandlebarsTemplateEngine;


public class Main {
    public static void main(String[] args) {
        get("/", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "index.hbs");
        }, new HandlebarsTemplateEngine());
        get("/login",(request, response) -> {
            Map<String, String> payload = new HashMap<>();
            return new ModelAndView(payload,"login.hbs");

        },new HandlebarsTemplateEngine());
        post("/processlogin",(request, response) -> {
            Map<String, String> payload = new HashMap<>();
            String email = request.queryParams("email");
String name=LoginDao.findLoginIdById(email).get(0).getName();
payload.put( "name",name );
           System.out.println(LoginDao.findLoginIdById(email).get(0));
            return new ModelAndView(payload,"main-dashboard.hbs");
        },new HandlebarsTemplateEngine());
        get("/login-legit", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "login-legit.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/login-reveal-password", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "login-reveal-password.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/forgot-password", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "forgot-password.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/reset-password", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "reset-password.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/register", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "register.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/admin-dashboard", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "admin-dashboard.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/main-dashboard", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "main-dashboard.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());

        get("/main-dashboard",(request, response) -> {
            Map<String, String> payload = new HashMap<>();
            return new ModelAndView(payload,"main-dashboard.hbs");

        },new HandlebarsTemplateEngine());
        post("/main-dashboard",(request, response) -> {
            Map<String, String> payload = new HashMap<>();
            System.out.println(request.body());
            return new ModelAndView(payload,"halaal.hbs");
        },new HandlebarsTemplateEngine());

        get("/anonymous-dashboard", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "anonymous-dashboard.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/all", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "all.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/chefs-special", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "chefs-special.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/breakfast", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "breakfast.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/lunch", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "lunch.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/halaal", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "halaal.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/vegetarian", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "vegetarian.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/make-payments", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "make-payments.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());

        get("/login",(request, response) -> {
            Map<String, String> payload = new HashMap<>();
            return new ModelAndView(payload,"login.hbs");

        },new HandlebarsTemplateEngine());

        post("/processlogin",(request, response) -> {
            Map<String, String> payload = new HashMap<>();
            System.out.println(request.body());
            return new ModelAndView(payload,"success.hbs");
        },new HandlebarsTemplateEngine());
    }
}

