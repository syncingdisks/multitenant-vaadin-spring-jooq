package de.eiswind.vaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 *
 */
@Theme("valo")
@SpringUI
public class MyUI extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("Hello! I'm the root UI!"));
    }
}
