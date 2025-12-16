package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* loaded from: classes8.dex */
public final class cm1 {
    @Y61.k
    public static uj1 a(@Y61.k ne1 ne1Var, @Y61.k ne1 ne1Var2) {
        List listU = C42745f0.U(ne1Var, ne1Var2);
        ArrayList arrayList = new ArrayList();
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            uj1 uj1VarM = ((ne1) it.next()).m();
            List<String> listA = uj1VarM != null ? uj1VarM.a() : null;
            if (listA == null) {
                listA = C42784z0.f406748b;
            }
            C42745f0.h(listA, arrayList);
        }
        return new uj1(arrayList);
    }
}
