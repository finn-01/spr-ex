package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component là một Annotation (chú thích) đánh dấu trên các Class để giúp Spring biết nó
// là một Bean.
@Component
//Tao ra bean moi
//@Scope("prototype")
public class Bikini implements Outfit{
    @Override
    public void wear() {
        System.out.println("Mac bikini");
    }
}
