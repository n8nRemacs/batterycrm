package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class wi1 {
    @Y61.k
    public static ArrayList a(@Y61.k ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!kotlin.jvm.internal.L.f((String) next, "about:blank")) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
