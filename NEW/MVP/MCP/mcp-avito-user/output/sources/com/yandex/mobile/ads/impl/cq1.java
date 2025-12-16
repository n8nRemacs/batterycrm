package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.yandex.mobile.ads.impl.ep1;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class cq1 implements pp1, ep1.a {

    /* renamed from: f, reason: collision with root package name */
    private static cq1 f384388f;

    /* renamed from: a, reason: collision with root package name */
    private float f384389a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final zp1 f384390b;

    /* renamed from: c, reason: collision with root package name */
    private final dp1 f384391c;

    /* renamed from: d, reason: collision with root package name */
    private tp1 f384392d;

    /* renamed from: e, reason: collision with root package name */
    private uo1 f384393e;

    public cq1(zp1 zp1Var, dp1 dp1Var) {
        this.f384390b = zp1Var;
        this.f384391c = dp1Var;
    }

    public static cq1 a() {
        if (f384388f == null) {
            f384388f = new cq1(new zp1(), new dp1());
        }
        return f384388f;
    }

    public final void b() {
        ep1.a().a(this);
        ep1.a().b();
        wa1.g().getClass();
        wa1.a();
        this.f384392d.a();
    }

    public final void c() {
        wa1.g().b();
        ep1.a().c();
        this.f384392d.b();
    }

    public final float d() {
        return this.f384389a;
    }

    public final void a(float f12) {
        this.f384389a = f12;
        if (this.f384393e == null) {
            this.f384393e = uo1.a();
        }
        Iterator<to1> it = this.f384393e.c().iterator();
        while (it.hasNext()) {
            wp1.a(it.next().i().e(), f12);
        }
    }

    public final void a(Context context) {
        this.f384391c.getClass();
        so1 so1Var = new so1();
        zp1 zp1Var = this.f384390b;
        Handler handler = new Handler();
        zp1Var.getClass();
        this.f384392d = new tp1(handler, context, so1Var, this);
    }
}
