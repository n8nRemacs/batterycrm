package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class yi0 {
    public static double a(@Y61.k List list) {
        Object next;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            double dE2 = 0.0d;
            if (!it.hasNext()) {
                break;
            }
            if (((b30) it.next()).a() != 0) {
                dE2 = r2.e() / r2.a();
            }
            arrayList.add(Double.valueOf(dE2));
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(kotlin.math.b.a(((Number) it2.next()).doubleValue() * 1000)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            int iIntValue = 1;
            if (!it3.hasNext()) {
                break;
            }
            int iIntValue2 = ((Number) it3.next()).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue2);
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(iIntValue2));
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(numValueOf, Integer.valueOf(iIntValue));
        }
        Iterator it4 = linkedHashMap.entrySet().iterator();
        if (it4.hasNext()) {
            next = it4.next();
            if (it4.hasNext()) {
                int iIntValue3 = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it4.next();
                    int iIntValue4 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (iIntValue3 < iIntValue4) {
                        next = next2;
                        iIntValue3 = iIntValue4;
                    }
                } while (it4.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        Integer num2 = entry != null ? (Integer) entry.getValue() : null;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            int iIntValue5 = ((Number) entry2.getValue()).intValue();
            if (num2 != null && iIntValue5 == num2.intValue()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
        Iterator it5 = linkedHashMap2.entrySet().iterator();
        while (it5.hasNext()) {
            arrayList3.add(Double.valueOf(((Number) ((Map.Entry) it5.next()).getKey()).intValue() / 1000));
        }
        List listA0 = C42745f0.A0(arrayList3);
        int size = listA0.size();
        int i12 = size / 2;
        if (arrayList3.isEmpty()) {
            return 0.0d;
        }
        int i13 = size % 2;
        if (i13 + ((((i13 ^ 2) & ((-i13) | i13)) >> 31) & 2) == 1) {
            return ((Number) listA0.get(i12)).doubleValue();
        }
        return (((Number) listA0.get(i12 - 1)).doubleValue() + ((Number) listA0.get(i12)).doubleValue()) / 2;
    }
}
