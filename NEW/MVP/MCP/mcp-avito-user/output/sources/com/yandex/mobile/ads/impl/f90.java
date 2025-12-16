package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e90;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes8.dex */
public final class f90 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final zb f385226a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final sm1 f385227b = new sm1();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final i90 f385228c = new i90();

    public f90(@Y61.k zb zbVar) {
        this.f385226a = zbVar;
    }

    @Y61.k
    public final e90 a(@Y61.k XmlPullParser xmlPullParser) throws JSONException {
        try {
            e90.a aVar = new e90.a();
            this.f385227b.getClass();
            JSONObject jSONObject = new JSONObject(sm1.c(xmlPullParser));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if ("assets".equals(next)) {
                    aVar.a(this.f385226a.a(jSONObject));
                } else if ("link".equals(next)) {
                    aVar.a(this.f385228c.a(jSONObject.getJSONObject(next)));
                }
            }
            return aVar.a();
        } catch (Exception e12) {
            throw new JSONException(e12.getMessage());
        }
    }
}
