package com.yandex.mobile.ads.impl;

import com.yandex.div2.H0;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class mq {
    @j.P
    public static com.yandex.div2.H0 a(@j.N vq vqVar) {
        try {
            JSONObject jSONObjectA = vqVar.a();
            JSONObject jSONObjectD = vqVar.d();
            C21.c cVar = new C21.c(com.yandex.div.json.i.f370578a, null, 2, null);
            if (jSONObjectD != null) {
                cVar.c(jSONObjectD);
            }
            com.yandex.div2.H0.f372502h.getClass();
            return H0.c.a(cVar, jSONObjectA);
        } catch (Throwable unused) {
            return null;
        }
    }
}
