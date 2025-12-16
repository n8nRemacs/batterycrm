package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jp1;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ip1 implements jp1.b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f386666a;

    /* renamed from: b, reason: collision with root package name */
    private final op1 f386667b;

    public ip1(op1 op1Var) {
        this.f386667b = op1Var;
    }

    public final void a() {
        this.f386667b.a(new sp1(this));
    }

    @j.k0
    public final JSONObject b() {
        return this.f386666a;
    }

    @j.k0
    public final void a(JSONObject jSONObject) {
        this.f386666a = jSONObject;
    }

    public final void b(JSONObject jSONObject, HashSet<String> hashSet, long j12) {
        this.f386667b.a(new yp1(this, hashSet, jSONObject, j12));
    }

    public final void a(JSONObject jSONObject, HashSet<String> hashSet, long j12) {
        this.f386667b.a(new bq1(this, hashSet, jSONObject, j12));
    }
}
