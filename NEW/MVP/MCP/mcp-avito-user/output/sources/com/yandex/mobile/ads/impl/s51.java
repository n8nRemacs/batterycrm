package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class s51 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final i90 f389792a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final u51 f389793b;

    public s51(@j.N i90 i90Var, @j.N bc1 bc1Var) {
        this.f389792a = i90Var;
        this.f389793b = new u51(bc1Var);
    }

    @j.N
    public final r51 a(@j.N JSONObject jSONObject) throws JSONException, yk0 {
        String strA = mm0.a("name", jSONObject);
        return new r51(this.f389792a.a(jSONObject.getJSONObject("link")), strA, this.f389793b.a(jSONObject.getJSONObject("value")));
    }
}
