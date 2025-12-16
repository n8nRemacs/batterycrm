package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.cl;

/* loaded from: classes8.dex */
public final class q21 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f389065h = new Object();

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private static volatile q21 f389066i;

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private v11 f389067a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private Boolean f389068b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private Boolean f389069c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private Integer f389070d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f389072f;

    /* renamed from: e, reason: collision with root package name */
    private boolean f389071e = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f389073g = true;

    private q21() {
    }

    public static q21 b() {
        if (f389066i == null) {
            synchronized (f389065h) {
                try {
                    if (f389066i == null) {
                        f389066i = new q21();
                    }
                } finally {
                }
            }
        }
        return f389066i;
    }

    @j.P
    public final v11 a(@j.N Context context) {
        v11 v11Var;
        synchronized (f389065h) {
            try {
                if (this.f389067a == null) {
                    cl.f384324a.getClass();
                    this.f389067a = cl.a.a(context).a();
                }
                v11Var = this.f389067a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v11Var;
    }

    public final Integer c() {
        Integer num;
        synchronized (f389065h) {
            num = this.f389070d;
        }
        return num;
    }

    public final void d(boolean z12) {
        synchronized (f389065h) {
            this.f389068b = Boolean.valueOf(z12);
        }
    }

    public final boolean e() {
        boolean z12;
        synchronized (f389065h) {
            z12 = this.f389072f;
        }
        return z12;
    }

    public final boolean f() {
        boolean z12;
        synchronized (f389065h) {
            z12 = this.f389071e;
        }
        return z12;
    }

    @j.P
    public final Boolean g() {
        Boolean bool;
        synchronized (f389065h) {
            bool = this.f389068b;
        }
        return bool;
    }

    public final boolean h() {
        boolean z12;
        synchronized (f389065h) {
            z12 = this.f389073g;
        }
        return z12;
    }

    public final void c(boolean z12) {
        synchronized (f389065h) {
            this.f389071e = z12;
        }
    }

    @j.P
    public final Boolean d() {
        Boolean bool;
        synchronized (f389065h) {
            bool = this.f389069c;
        }
        return bool;
    }

    public final void a(@j.N Context context, @j.N v11 v11Var) {
        synchronized (f389065h) {
            this.f389067a = v11Var;
            cl.f384324a.getClass();
            cl.a.a(context).a(v11Var);
        }
    }

    public final void b(boolean z12) {
        synchronized (f389065h) {
            this.f389069c = Boolean.valueOf(z12);
        }
    }

    @j.P
    public static void a() {
        synchronized (f389065h) {
        }
    }

    public final void a(boolean z12) {
        synchronized (f389065h) {
            this.f389072f = z12;
            this.f389073g = z12;
        }
    }

    public final void a(int i12) {
        synchronized (f389065h) {
            this.f389070d = Integer.valueOf(i12);
        }
    }
}
