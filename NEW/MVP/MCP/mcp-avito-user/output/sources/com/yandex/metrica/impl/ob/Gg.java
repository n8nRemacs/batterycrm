package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C38816g1;
import com.yandex.metrica.impl.ob.Dg;
import com.yandex.metrica.impl.ob.Eg;
import com.yandex.metrica.impl.ob.Eg.d;

/* loaded from: classes7.dex */
public abstract class Gg<T extends Eg, IA, A extends Dg<IA, A>, L extends Eg.d<T, Eg.c<A>>> implements C38816g1.a {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private T f378188a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private L f378189b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private Eg.c<A> f378190c;

    public Gg(@j.N L l12, @j.N C39057pi c39057pi, @j.N A a12) {
        this.f378189b = l12;
        C38816g1.a(F0.g().e()).a(this);
        a((Eg.c) new Eg.c<>(c39057pi, a12));
    }

    @Override // com.yandex.metrica.impl.ob.C38816g1.a
    public void a() {
        synchronized (this) {
            this.f378188a = null;
        }
    }

    @j.N
    public synchronized T b() {
        try {
            if (this.f378188a == null) {
                this.f378188a = (T) this.f378189b.a(this.f378190c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f378188a;
    }

    @j.N
    @j.k0
    public synchronized A c() {
        return this.f378190c.f378072b;
    }

    @j.N
    public synchronized C39057pi d() {
        return this.f378190c.f378071a;
    }

    public synchronized void e() {
        this.f378188a = null;
    }

    public synchronized void a(@j.N Eg.c<A> cVar) {
        this.f378190c = cVar;
    }

    public synchronized void a(@j.N IA ia2) {
        try {
            if (!this.f378190c.f378072b.b(ia2)) {
                synchronized (this) {
                    Eg.c<A> cVar = this.f378190c;
                    Eg.c<A> cVar2 = new Eg.c<>(cVar.f378071a, cVar.f378072b.a(ia2));
                    synchronized (this) {
                        this.f378190c = cVar2;
                    }
                }
                synchronized (this) {
                    this.f378188a = null;
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(@j.N com.yandex.metrica.impl.ob.C39057pi r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.Eg$c r0 = new com.yandex.metrica.impl.ob.Eg$c     // Catch: java.lang.Throwable -> L19
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L19
            com.yandex.metrica.impl.ob.Eg$c<A extends com.yandex.metrica.impl.ob.Dg<IA, A>> r1 = r2.f378190c     // Catch: java.lang.Throwable -> L21
            A r1 = r1.f378072b     // Catch: java.lang.Throwable -> L21
            com.yandex.metrica.impl.ob.Dg r1 = (com.yandex.metrica.impl.ob.Dg) r1     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L19
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L19
            r2.f378190c = r0     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L19
            r3 = 0
            r2.f378188a = r3     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return
        L19:
            r3 = move-exception
            goto L24
        L1b:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3     // Catch: java.lang.Throwable -> L19
        L1e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3     // Catch: java.lang.Throwable -> L19
        L21:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3     // Catch: java.lang.Throwable -> L19
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Gg.a(com.yandex.metrica.impl.ob.pi):void");
    }
}
