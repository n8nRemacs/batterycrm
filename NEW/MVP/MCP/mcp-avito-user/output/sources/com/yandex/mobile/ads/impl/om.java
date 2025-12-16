package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* loaded from: classes8.dex */
public final class om {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final nm f388585a = new nm();

    @Y61.k
    public final oi1 a(@Y61.k im imVar) {
        return new O(13, this, imVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map a(om omVar, im imVar) {
        omVar.f388585a.getClass();
        lm lmVarA = nm.a(imVar);
        List<ia1> listC = lmVarA != null ? lmVarA.c() : null;
        if (listC == null) {
            listC = C42784z0.f406748b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listC) {
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
