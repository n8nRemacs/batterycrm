package com.yandex.mobile.ads.impl;

import org.json.JSONException;

/* loaded from: classes8.dex */
public final class ap0 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final yw0 f383623b = yw0.a();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ww0 f383622a = new ww0();

    @j.P
    public final zo0 a(@j.N qy0<?> qy0Var) {
        String strA = this.f383623b.a(qy0Var);
        if (strA != null) {
            try {
                vw0 vw0VarA = this.f383622a.a(strA);
                return new zo0(vw0VarA.a().getBytes(), vw0VarA.b());
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
