package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ph1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final me f388840a = new me();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final if1<yn0> f388841b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final vd1 f388842c;

    public ph1(@j.N Context context) {
        this.f388841b = new if1<>(context, new zn0());
        this.f388842c = new vd1(context);
    }

    @j.N
    public final Object a(@j.N JSONObject jSONObject) throws JSONException, yk0 {
        zc1 zc1VarA;
        try {
            zc1VarA = this.f388842c.a(this.f388840a.a("vast", jSONObject));
        } catch (Exception unused) {
            zc1VarA = null;
        }
        if (zc1VarA == null || zc1VarA.b().isEmpty()) {
            throw new yk0("Invalid VAST in response");
        }
        ArrayList arrayListA = this.f388841b.a(zc1VarA.b());
        if (arrayListA.isEmpty()) {
            throw new yk0("Invalid VAST in response");
        }
        return new me1(arrayListA);
    }
}
