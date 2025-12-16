package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class m7 {
    @Y61.l
    public static String a(@Y61.l List list) {
        Object next;
        Object obj;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((y3) next).a() == z3.f392161a) {
                break;
            }
        }
        y3 y3Var = (y3) next;
        if (y3Var == null || (obj = y3Var.b().get("adapter_loading_duration")) == null) {
            return null;
        }
        return obj.toString();
    }
}
