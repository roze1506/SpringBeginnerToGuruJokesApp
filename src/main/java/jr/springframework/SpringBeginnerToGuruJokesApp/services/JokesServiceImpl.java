package jr.springframework.SpringBeginnerToGuruJokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    @Autowired
    private ChuckNorrisQuotes chuckNorrisQuotes;

    @Override
    public String letMeLaugh() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
