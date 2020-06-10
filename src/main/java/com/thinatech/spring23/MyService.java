package com.thinatech.spring23;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class MyService {

    public Collection<MyRecord> list(Type type) {
        var x = Math.random() < .5 ? type.name() : Double.valueOf(2.3);
        if (x instanceof String str) {
            System.out.println(str.length());
        } else if (x instanceof Double i) {
            System.out.println(i);
        }
        return switch (type) {
            case female -> Collections.singletonList(new MyRecord("Mrs Ichir", type));
            case male, none -> Collections.singletonList(new MyRecord("Mr ichir", type));
        };
    }
}
