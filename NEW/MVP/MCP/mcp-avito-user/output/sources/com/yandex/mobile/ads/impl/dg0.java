package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.zf0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
final class dg0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final yf0 f384602a = new yf0();

    @j.P
    public final zf0 a(@j.N JSONObject jSONObject) throws JSONException {
        try {
            String strB = m80.b("adapter", jSONObject);
            JSONObject jSONObject2 = jSONObject.getJSONObject("network_data");
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.getString(next));
            }
            if (!map.isEmpty()) {
                zf0.a aVar = new zf0.a(strB, map);
                ArrayList arrayListC = m80.c("click_tracking_urls", jSONObject);
                ArrayList arrayListC2 = m80.c("impression_tracking_urls", jSONObject);
                ArrayList arrayListC3 = m80.c("ad_response_tracking_urls", jSONObject);
                aVar.b(arrayListC).c(arrayListC2).a(arrayListC3).a(m80.a(jSONObject));
                if (jSONObject.has("impression_data")) {
                    this.f384602a.getClass();
                    aVar.a(yf0.a(jSONObject));
                }
                return aVar.a();
            }
        } catch (JSONException unused) {
        }
        return null;
    }
}
