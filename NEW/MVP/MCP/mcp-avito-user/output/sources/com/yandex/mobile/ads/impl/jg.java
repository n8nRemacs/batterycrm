package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class jg {
    @Y61.k
    public static ArrayList a(@Y61.k com.yandex.mobile.ads.nativeads.w wVar) {
        Map<String, fb<?>> mapC = wVar.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((HashMap) mapC).entrySet()) {
            fb fbVar = (fb) entry.getValue();
            if (fbVar != null ? fbVar.b() : false) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }
}
