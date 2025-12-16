package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class cb0 {
    @X41.n
    @Y61.k
    public static final LinkedHashMap a(@Y61.k Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.P0.f(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), new WeakReference(entry2.getValue()));
        }
        return linkedHashMap2;
    }
}
