package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.fm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38812fm implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private volatile long f380605a;

    /* renamed from: b, reason: collision with root package name */
    private C38774e9 f380606b;

    /* renamed from: c, reason: collision with root package name */
    private com.yandex.metrica.coreutils.services.f f380607c;

    /* renamed from: com.yandex.metrica.impl.ob.fm$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        static C38812fm f380608a = new C38812fm();
    }

    public static C38812fm c() {
        return b.f380608a;
    }

    @Override // com.yandex.metrica.impl.ob.Q0
    public synchronized long a() {
        return this.f380605a;
    }

    public synchronized void b() {
        this.f380606b.c(false);
        this.f380606b.d();
    }

    public synchronized void d() {
        C38774e9 c38774e9S = F0.g().s();
        com.yandex.metrica.coreutils.services.e eVar = new com.yandex.metrica.coreutils.services.e();
        this.f380606b = c38774e9S;
        this.f380605a = c38774e9S.b(0);
        this.f380607c = eVar;
    }

    public synchronized boolean e() {
        return this.f380606b.a(true);
    }

    private C38812fm() {
    }

    public synchronized void a(long j12, @j.P Long l12) {
        try {
            this.f380605a = (j12 - this.f380607c.b()) / 1000;
            boolean z12 = true;
            if (this.f380606b.a(true)) {
                if (l12 != null) {
                    long jAbs = Math.abs(j12 - this.f380607c.b());
                    C38774e9 c38774e9 = this.f380606b;
                    if (jAbs <= TimeUnit.SECONDS.toMillis(l12.longValue())) {
                        z12 = false;
                    }
                    c38774e9.c(z12);
                } else {
                    this.f380606b.c(false);
                }
            }
            this.f380606b.l(this.f380605a);
            this.f380606b.d();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
