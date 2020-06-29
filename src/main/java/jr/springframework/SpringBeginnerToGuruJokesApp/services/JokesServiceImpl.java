package jr.springframework.SpringBeginnerToGuruJokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String makeMeLaugh() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
