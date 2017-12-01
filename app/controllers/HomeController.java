package controllers;

import play.mvc.*;
import play.data.*;


import javax.inject.Inject;

import views.html.*;

import models.Filme;
import java.util.List;
import java.util.Date;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    @Inject
    FormFactory formFactory;


    
    public Result index() {
        return ok(index.render("Projeto Pop Films POOW"));
    }

    public Result sobre() {
        return ok(sobre.render("Projeto Pop Films POOW"));
    }

    public Result cadastroDeFilme(){
        Form<Filme> formFilme = formFactory.form(Filme.class).bindFromRequest();
    	return ok(cadastroDeFilme.render("Cadastro", formFilme));

    }

    public Result listaTudo(){
        List<Filme> listDeFilme = Filme.find.all();        
        return ok(listagem.render(listDeFilme));

    }

    public Result cadastroDeNovoFilme(){
        Form<Filme> formFilme = formFactory.form(Filme.class).bindFromRequest();
        Filme e = formFilme.get();
        e.save();

        flash("success", e.nome + " Salvo com sucesso");

        return redirect(routes.HomeController.index());
    }
       
}

