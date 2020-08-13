package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    List<Integer> list = new ArrayList<>();

    public void addValue(Integer value) {
        list.add(value);
    }

    public void print() {
        System.out.println(list.toString());
    }

    public Integer first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }
}
