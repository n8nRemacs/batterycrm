package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class cf1 {
    @Y61.k
    public static oi1 a(@Y61.k ne1 ne1Var) {
        return new G0(ne1Var, 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(ne1 ne1Var) {
        List<ia1> listB = ne1Var.l().b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listB) {
            String strA = ((ia1) obj).a();
            Object objR = linkedHashMap.get(strA);
            if (objR == null) {
                objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, strA);
            }
            ((List) objR).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.P0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((ia1) it.next()).c());
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }
}
