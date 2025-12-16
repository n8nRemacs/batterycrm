package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class l80 {
    @Y61.k
    public static HashMap a(@Y61.k JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objA = i11.a(next, jSONObject);
            if (objA != null) {
                if (objA instanceof JSONObject) {
                    map.put(next, a((JSONObject) objA));
                } else {
                    map.put(next, objA);
                }
            }
        }
        return map;
    }
}
