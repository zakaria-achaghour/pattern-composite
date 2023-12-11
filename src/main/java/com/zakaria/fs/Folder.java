package com.zakaria.fs;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{

    private List<Component> components=new ArrayList<>();

    public Folder(String name) {
        super(name);
    }
    @Override
    public void show() {
        System.out.println(getTab()+"- Folder : "+name);
        for (Component c : components){
            c.show();
        }
    }

    public Component add(Component c){
        this.components.add(c);
        c.level = this.level +1;
        return c;
    }
    public void remove(Component component){
        components.remove(component);
    }
}
