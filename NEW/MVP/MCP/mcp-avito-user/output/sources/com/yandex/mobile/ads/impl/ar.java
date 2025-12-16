package com.yandex.mobile.ads.impl;

import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ke f383630a = new ke();

    @j.P
    public final vq a(@j.N tp tpVar) {
        if ("divkit".equals(tpVar.d())) {
            try {
                String strC = tpVar.c();
                String strB = tpVar.b();
                this.f383630a.getClass();
                JSONObject jSONObject = new JSONObject(ke.a(strB.getBytes()));
                return new vq(strC, jSONObject.getJSONObject(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CARD), jSONObject.has("templates") ? jSONObject.getJSONObject("templates") : null, tpVar.a());
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
