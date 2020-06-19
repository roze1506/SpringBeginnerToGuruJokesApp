package jr.springframework.SpringBeginnerToGuruJokesApp.controllers;

import jr.springframework.SpringBeginnerToGuruJokesApp.services.JokesService;
import jr.springframework.SpringBeginnerToGuruJokesApp.services.JokesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String makeReaderLaugh(Model model) {
        final String joke = jokesService.makeMeLaugh();
        model.addAttribute("joke", joke);
        return joke;
    }
}
