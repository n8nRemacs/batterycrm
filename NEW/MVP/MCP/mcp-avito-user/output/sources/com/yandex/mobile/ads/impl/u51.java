package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class u51 implements qb<t51> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final v20 f390451a;

    public u51(@j.N bc1 bc1Var) {
        this.f390451a = new v20(bc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qb
    @j.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final t51 a(@j.N JSONObject jSONObject) throws JSONException, yk0 {
        return new t51(this.f390451a.a(jSONObject.getJSONObject("image")), mm0.a("title", jSONObject));
    }
}
