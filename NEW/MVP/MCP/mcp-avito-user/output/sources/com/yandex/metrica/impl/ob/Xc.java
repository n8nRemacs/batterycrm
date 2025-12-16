package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class Xc implements J0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38774e9 f379903a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39232x2 f379904b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private Xb f379905c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final H2 f379906d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f379907e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final a f379908f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final Wc f379909g;

    public static class a {
    }

    public Xc(@j.N Context context, @j.P Xb xb2) {
        this(xb2, H2.a(context));
    }

    public void a(@j.P Xb xb2) {
        if (A2.a(this.f379905c, xb2)) {
            return;
        }
        this.f379905c = xb2;
        if (xb2 == null || !xb2.f379901a.f379255a) {
            return;
        }
        this.f379909g.a(this.f379906d.b());
    }

    public void b() {
        Xb xb2 = this.f379905c;
        if (xb2 == null || xb2.f379902b == null || !this.f379904b.b(this.f379903a.f(0L), this.f379905c.f379902b.f379816b, "last wifi scan attempt time")) {
            return;
        }
        this.f379908f.getClass();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.f379906d.a(countDownLatch, this.f379909g)) {
            this.f379903a.k(this.f379907e.c());
            try {
                countDownLatch.await(5L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
    }

    private Xc(@j.P Xb xb2, @j.N H2 h22) {
        this(h22, F0.g().s(), new C39232x2(), new com.yandex.metrica.coreutils.services.e(), new a(), xb2, new Wc(null, h22.a()));
    }

    @j.k0
    public Xc(@j.N H2 h22, @j.N C38774e9 c38774e9, @j.N C39232x2 c39232x2, @j.N com.yandex.metrica.coreutils.services.f fVar, @j.N a aVar, @j.P Xb xb2, @j.N Wc wc2) {
        this.f379906d = h22;
        this.f379903a = c38774e9;
        this.f379904b = c39232x2;
        this.f379908f = aVar;
        this.f379905c = xb2;
        this.f379907e = fVar;
        this.f379909g = wc2;
    }

    @Override // com.yandex.metrica.impl.ob.J0
    public void a() {
        Xb xb2 = this.f379905c;
        if (xb2 == null || !xb2.f379901a.f379255a) {
            return;
        }
        this.f379909g.a(this.f379906d.b());
    }
}
