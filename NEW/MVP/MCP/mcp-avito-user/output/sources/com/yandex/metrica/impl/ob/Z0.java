package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes7.dex */
public class Z0 {

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    @j.N
    public static String a(int i12) {
        Map<String, Integer> map = C38817g2.f380615a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : C38817g2.f380615a.entrySet()) {
            if (entry.getValue().intValue() == i12) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList.size() == 1 ? (String) arrayList.get(0) : arrayList.size() != 0 ? String.format("One of %s", arrayList) : "unknown";
    }

    public static boolean a(String str) throws ClassNotFoundException {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
