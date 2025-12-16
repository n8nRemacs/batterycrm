package com.fasterxml.jackson.databind.ser.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: SimpleFilterProvider.java */
/* loaded from: classes4.dex */
public class o extends com.fasterxml.jackson.databind.ser.l implements Serializable {
    private static final long serialVersionUID = 1;

    public o() {
        HashMap map = new HashMap();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof com.fasterxml.jackson.databind.ser.n)) {
                HashMap map2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof com.fasterxml.jackson.databind.ser.n) {
                        map2.put(entry.getKey(), (com.fasterxml.jackson.databind.ser.n) value);
                    } else {
                        if (!(value instanceof com.fasterxml.jackson.databind.ser.c)) {
                            throw new IllegalArgumentException("Unrecognized filter type (" + value.getClass().getName() + ")");
                        }
                        map2.put(entry.getKey(), new m((com.fasterxml.jackson.databind.ser.c) value));
                    }
                }
                return;
            }
        }
    }
}
