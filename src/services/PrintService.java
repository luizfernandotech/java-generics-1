package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public void print() {
        System.out.println(list.toString());
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }
}
