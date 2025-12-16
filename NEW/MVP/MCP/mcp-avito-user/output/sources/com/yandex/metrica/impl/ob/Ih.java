package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class Ih {

    /* renamed from: a, reason: collision with root package name */
    private long f378503a;

    /* renamed from: b, reason: collision with root package name */
    private long f378504b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f378505c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38837gm f378506d;

    public Ih() {
        this(new com.yandex.metrica.coreutils.services.e(), new C38837gm());
    }

    public synchronized double a() {
        return this.f378506d.b(this.f378504b, TimeUnit.MILLISECONDS);
    }

    public synchronized double b() {
        return this.f378506d.b(this.f378503a, TimeUnit.MILLISECONDS);
    }

    public synchronized void c() {
        this.f378504b = this.f378505c.b();
    }

    public synchronized void d() {
        this.f378503a = this.f378505c.b();
    }

    public synchronized void e() {
        this.f378504b = 0L;
    }

    @j.k0
    public Ih(@j.N com.yandex.metrica.coreutils.services.f fVar, @j.N C38837gm c38837gm) {
        this.f378505c = fVar;
        this.f378506d = c38837gm;
    }
}
