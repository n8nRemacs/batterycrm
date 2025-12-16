package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ox0;
import java.util.List;

/* loaded from: classes8.dex */
public final class rx0 implements ox0.b {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final qx0 f389693a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ox0 f389694b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final p3 f389695c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final yx0 f389696d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final tx0 f389697e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f389698f;

    public rx0(@j.N Context context, @j.N e5 e5Var, @j.N AdResponse adResponse, @j.N n2 n2Var, @j.N p3 p3Var, @j.N n30 n30Var, @j.P tx0 tx0Var, @j.P List list) {
        this.f389695c = p3Var;
        this.f389696d = n30Var;
        this.f389697e = tx0Var;
        this.f389693a = new qx0(context, adResponse, n2Var, list);
        this.f389694b = new ox0(e5Var, this);
    }

    public final void a(@j.N tm0 tm0Var) {
        this.f389693a.a(tm0Var);
    }

    public final void b() {
        if (this.f389698f) {
            return;
        }
        this.f389698f = true;
        this.f389694b.a();
    }

    public final void c() {
        this.f389698f = false;
        this.f389694b.b();
    }

    public final void a() {
        tx0 tx0Var = this.f389697e;
        if (tx0Var != null) {
            tx0Var.b();
        }
        this.f389693a.a();
        this.f389695c.b();
        this.f389696d.e();
    }
}
