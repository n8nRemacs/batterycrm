package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class vg1 {
    @j.N
    public static ug1 a(@j.N List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ne1 ne1Var = (ne1) it.next();
            if (ne1Var.o()) {
                arrayList2.add(ne1Var);
            } else {
                arrayList.add(ne1Var);
            }
        }
        return new ug1(arrayList, arrayList2);
    }
}
