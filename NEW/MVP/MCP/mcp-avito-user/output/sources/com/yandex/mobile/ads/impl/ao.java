package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ao implements InterfaceC39353p<yn> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final pu0 f383606a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final bc1 f383607b;

    public ao(@j.N bc1 bc1Var) {
        this.f383607b = bc1Var;
        this.f383606a = new pu0(bc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39353p
    @j.N
    public final AbstractC39344m a(@j.N JSONObject jSONObject) throws JSONException, yk0 {
        String strA = mm0.a("type", jSONObject);
        this.f383607b.getClass();
        return new yn(strA, bc1.a("fallbackUrl", jSONObject), this.f383606a.a(jSONObject.optJSONArray("preferredPackages")));
    }
}
