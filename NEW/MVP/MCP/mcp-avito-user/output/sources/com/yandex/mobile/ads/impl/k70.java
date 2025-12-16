package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
final class k70 {
    @j.N
    public static j70 a(@j.N dn0 dn0Var, @j.N List list) {
        int i12;
        if (list.isEmpty()) {
            i12 = 50;
        } else {
            int iC2 = ((q31) list.get(0)).c();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iC2 = Math.max(iC2, ((q31) it.next()).c());
            }
            i12 = iC2;
        }
        return new j70(dn0Var, i12);
    }
}
