package jr.springframework.SpringBeginnerToGuruJokesApp.controllers;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import jr.springframework.SpringBeginnerToGuruJokesApp.services.JokesService;
import jr.springframework.SpringBeginnerToGuruJokesApp.services.JokesServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController() {
        this.jokesService = new JokesServiceImpl();
    }

    public void makeReaderLaugh() {
        System.out.println(jokesService.letMeLaugh());
    }
}
