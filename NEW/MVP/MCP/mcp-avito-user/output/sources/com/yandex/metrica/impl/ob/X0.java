package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class X0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f379832a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39232x2 f379833b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38774e9 f379834c;

    /* renamed from: d, reason: collision with root package name */
    private long f379835d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private Zh f379836e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final M0 f379837f;

    @j.k0
    public X0(@j.N C38774e9 c38774e9, @j.P Zh zh2, @j.N com.yandex.metrica.coreutils.services.f fVar, @j.N C39232x2 c39232x2, @j.N M0 m02) {
        this.f379834c = c38774e9;
        this.f379836e = zh2;
        this.f379835d = c38774e9.d(0L);
        this.f379832a = fVar;
        this.f379833b = c39232x2;
        this.f379837f = m02;
    }

    public void a() {
        Zh zh2 = this.f379836e;
        if (zh2 == null || !this.f379833b.b(this.f379835d, zh2.f380013a, "should send EVENT_IDENTITY_LIGHT")) {
            return;
        }
        this.f379837f.b();
        long jC2 = this.f379832a.c();
        this.f379835d = jC2;
        this.f379834c.i(jC2);
    }

    public void a(@j.P Zh zh2) {
        this.f379836e = zh2;
    }
}
