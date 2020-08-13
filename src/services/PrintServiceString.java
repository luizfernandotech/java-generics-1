package services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceString {

    List<String> list = new ArrayList<>();

    public void addValue(String value) {
        list.add(value);
    }

    public void print() {
        System.out.println(list.toString());
    }

    public String first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }
}
