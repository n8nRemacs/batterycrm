package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42784z0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class Th {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, ? extends List<String>> f379529a = kotlin.collections.P0.c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private Map<String, ? extends W0> f379530b = kotlin.collections.P0.c();

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private W0 f379531c;

    @Y61.l
    public final W0 a() {
        return this.f379531c;
    }

    @Y61.k
    public final Map<String, W0> b() {
        return this.f379530b;
    }

    public final synchronized void a(@Y61.k W0 w02) {
        HashMap map;
        Map mapC;
        List<String> listB;
        String str;
        try {
            W0 w03 = this.f379531c;
            String str2 = w03 != null ? w03.f379795a : null;
            if (str2 == null || str2.length() == 0 || ((str = w02.f379795a) != null && str.length() != 0)) {
                this.f379531c = w02;
                String str3 = w02.f379795a;
                if (str3 == null) {
                    map = null;
                } else {
                    map = new HashMap();
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            try {
                                List<String> listB2 = Tl.b(new JSONArray(jSONObject.optString(next)));
                                if (listB2 != null) {
                                    map.put(next, listB2);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (map != null) {
                    mapC = new LinkedHashMap(kotlin.collections.P0.f(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        mapC.put(entry.getKey(), new W0(String.valueOf(Tl.b((List<?>) entry.getValue())), w02.f379796b, w02.f379797c));
                    }
                } else {
                    mapC = kotlin.collections.P0.c();
                }
                this.f379530b = mapC;
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.P0.f(mapC.size()));
                for (Map.Entry entry2 : mapC.entrySet()) {
                    Object key = entry2.getKey();
                    String str4 = ((W0) entry2.getValue()).f379795a;
                    if (str4 == null) {
                        listB = null;
                    } else {
                        try {
                            listB = Tl.b(new JSONArray(str4));
                        } catch (Throwable unused3) {
                        }
                    }
                    if (listB == null) {
                        listB = C42784z0.f406748b;
                    }
                    linkedHashMap.put(key, listB);
                }
                this.f379529a = linkedHashMap;
            }
        } finally {
        }
    }

    public final synchronized void a(@Y61.k List<String> list, @Y61.k Map<String, W0> map) {
        U0 u02;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : list) {
                List<String> list2 = this.f379529a.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            String strB = Tl.b(linkedHashMap);
            W0 w02 = this.f379531c;
            if (w02 == null || (u02 = w02.f379796b) == null) {
                u02 = U0.UNKNOWN;
            }
            map.put("yandex_mobile_metrica_custom_sdk_hosts", new W0(strB, u02, w02 != null ? w02.f379797c : null));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
