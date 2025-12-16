package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
class Hh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38837gm f378268a;

    /* renamed from: b, reason: collision with root package name */
    private final long f378269b;

    /* renamed from: c, reason: collision with root package name */
    private long f378270c;

    /* renamed from: d, reason: collision with root package name */
    private long f378271d;

    /* renamed from: e, reason: collision with root package name */
    private long f378272e;

    @j.k0
    public Hh(@j.N com.yandex.metrica.coreutils.services.f fVar, @j.N C38837gm c38837gm) {
        this.f378269b = fVar.b();
        this.f378268a = c38837gm;
    }

    public void a() {
        this.f378270c = this.f378268a.b(this.f378269b, TimeUnit.MILLISECONDS);
    }

    public void b() {
        this.f378271d = this.f378268a.b(this.f378269b, TimeUnit.MILLISECONDS);
    }

    public void c() {
        this.f378272e = this.f378268a.b(this.f378269b, TimeUnit.MILLISECONDS);
    }

    public long d() {
        return this.f378270c;
    }

    public long e() {
        return this.f378271d;
    }

    public long f() {
        return this.f378272e;
    }
}
