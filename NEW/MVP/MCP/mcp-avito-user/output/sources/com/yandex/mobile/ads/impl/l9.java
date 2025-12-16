package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class l9 {
    @Y61.k
    public static HashMap a(@Y61.k String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.get(next));
            }
        } catch (Throwable unused) {
        }
        return map;
    }
}
