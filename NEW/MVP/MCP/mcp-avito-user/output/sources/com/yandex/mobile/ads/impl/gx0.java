package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bx0;
import com.yandex.mobile.ads.impl.ts0;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class gx0 {

    /* renamed from: b, reason: collision with root package name */
    private final long f385852b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final n81 f385853c;

    /* renamed from: a, reason: collision with root package name */
    private final int f385851a = 5;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final fx0 f385854d = new fx0(this, AK.c.s(new StringBuilder(), qc1.f389149g, " ConnectionPool"));

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final ConcurrentLinkedQueue<cx0> f385855e = new ConcurrentLinkedQueue<>();

    public gx0(@Y61.k o81 o81Var, @Y61.k TimeUnit timeUnit) {
        this.f385852b = timeUnit.toNanos(5L);
        this.f385853c = o81Var.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0024 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(@Y61.k com.yandex.mobile.ads.impl.r7 r4, @Y61.k com.yandex.mobile.ads.impl.bx0 r5, @Y61.l java.util.List<com.yandex.mobile.ads.impl.w01> r6, boolean r7) {
        /*
            r3 = this;
            java.util.concurrent.ConcurrentLinkedQueue<com.yandex.mobile.ads.impl.cx0> r0 = r3.f385855e
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            com.yandex.mobile.ads.impl.cx0 r1 = (com.yandex.mobile.ads.impl.cx0) r1
            monitor-enter(r1)
            if (r7 == 0) goto L1e
            boolean r2 = r1.h()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L2a
            goto L1e
        L1c:
            r4 = move-exception
            goto L2e
        L1e:
            boolean r2 = r1.a(r4, r6)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L2a
            r5.a(r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)
            r4 = 1
            return r4
        L2a:
            kotlin.G0 r2 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)
            goto L6
        L2e:
            monitor-exit(r1)
            throw r4
        L30:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gx0.a(com.yandex.mobile.ads.impl.r7, com.yandex.mobile.ads.impl.bx0, java.util.List, boolean):boolean");
    }

    public final void b(@Y61.k cx0 cx0Var) {
        if (!qc1.f389148f || Thread.holdsLock(cx0Var)) {
            this.f385855e.add(cx0Var);
            this.f385853c.a(this.f385854d, 0L);
        } else {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(cx0Var);
            throw new AssertionError(sbA.toString());
        }
    }

    public final long a(long j12) throws IOException {
        Iterator<cx0> it = this.f385855e.iterator();
        int i12 = 0;
        long j13 = Long.MIN_VALUE;
        cx0 cx0Var = null;
        int i13 = 0;
        while (it.hasNext()) {
            cx0 next = it.next();
            synchronized (next) {
                if (a(next, j12) > 0) {
                    i13++;
                } else {
                    i12++;
                    long jC2 = j12 - next.c();
                    if (jC2 > j13) {
                        cx0Var = next;
                        j13 = jC2;
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                }
            }
        }
        long j14 = this.f385852b;
        if (j13 < j14 && i12 <= this.f385851a) {
            if (i12 > 0) {
                return j14 - j13;
            }
            if (i13 > 0) {
                return j14;
            }
            return -1L;
        }
        synchronized (cx0Var) {
            if (!cx0Var.b().isEmpty()) {
                return 0L;
            }
            if (cx0Var.c() + j13 != j12) {
                return 0L;
            }
            cx0Var.l();
            this.f385855e.remove(cx0Var);
            qc1.a(cx0Var.m());
            if (this.f385855e.isEmpty()) {
                this.f385853c.a();
            }
            return 0L;
        }
    }

    public final boolean a(@Y61.k cx0 cx0Var) {
        if (qc1.f389148f && !Thread.holdsLock(cx0Var)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(cx0Var);
            throw new AssertionError(sbA.toString());
        }
        if (!cx0Var.d() && this.f385851a != 0) {
            this.f385853c.a(this.f385854d, 0L);
            return false;
        }
        cx0Var.l();
        this.f385855e.remove(cx0Var);
        if (this.f385855e.isEmpty()) {
            this.f385853c.a();
        }
        return true;
    }

    private final int a(cx0 cx0Var, long j12) {
        if (qc1.f389148f && !Thread.holdsLock(cx0Var)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(cx0Var);
            throw new AssertionError(sbA.toString());
        }
        ArrayList arrayListB = cx0Var.b();
        int i12 = 0;
        while (i12 < arrayListB.size()) {
            Reference reference = (Reference) arrayListB.get(i12);
            if (reference.get() != null) {
                i12++;
            } else {
                StringBuilder sbA2 = Cif.a("A connection to ");
                sbA2.append(cx0Var.k().a().k());
                sbA2.append(" was leaked. Did you forget to close a response body?");
                String string = sbA2.toString();
                int i13 = ts0.f390303c;
                ts0.a.b().a(((bx0.b) reference).a(), string);
                arrayListB.remove(i12);
                cx0Var.l();
                if (arrayListB.isEmpty()) {
                    cx0Var.a(j12 - this.f385852b);
                    return 0;
                }
            }
        }
        return arrayListB.size();
    }
}
