package jr.springframework.SpringBeginnerToGuruJokesApp.controllers;

import jr.springframework.SpringBeginnerToGuruJokesApp.services.JokesService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.ui.Model;

@RunWith(MockitoJUnitRunner.class)
public class JokesControllerTest {

    @InjectMocks
    private JokesController jokesController;

    @Mock
    private JokesService jokesService;

    @Test
    public void testMakeReaderLaugh() {
        final Model model = Mockito.mock(Model.class);
        Assertions.assertThat(jokesController.makeReaderLaugh(model)).isEqualTo("chucknorris");
    }
}
