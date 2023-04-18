package com.example.testsparcial;




import org.junit.Test;
import org.junit.runner.RunWith;



import static androidx.test.espresso.Espresso.onView;

import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;



import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class MainActivityEspressoTest {


    @Test
    public void textoUsuario() {
        onView(withId(R.id.usuario))
                .perform(typeText("slopez404"), ViewActions.closeSoftKeyboard());
    }


    @Test
    public void textoPassword() {
        onView(withId(R.id.usuario))
                .perform(typeText("12435"), ViewActions.closeSoftKeyboard());
    }
}



