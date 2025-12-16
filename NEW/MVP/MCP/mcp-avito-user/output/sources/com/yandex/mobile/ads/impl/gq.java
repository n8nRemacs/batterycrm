package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bx0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes8.dex */
public final class gq {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private ThreadPoolExecutor f385808a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ArrayDeque<bx0.a> f385809b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ArrayDeque<bx0.a> f385810c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final ArrayDeque<bx0> f385811d = new ArrayDeque<>();

    public final void a(@Y61.k bx0.a aVar) {
        bx0.a next;
        synchronized (this) {
            try {
                this.f385809b.add(aVar);
                if (!aVar.a().f()) {
                    String strC = aVar.c();
                    Iterator<bx0.a> it = this.f385810c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<bx0.a> it2 = this.f385809b.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                } else {
                                    next = it2.next();
                                    if (kotlin.jvm.internal.L.f(next.c(), strC)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            next = it.next();
                            if (kotlin.jvm.internal.L.f(next.c(), strC)) {
                                break;
                            }
                        }
                    }
                    if (next != null) {
                        aVar.a(next);
                    }
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a();
    }

    public final void b(@Y61.k bx0.a aVar) {
        aVar.b().decrementAndGet();
        a(this.f385810c, aVar);
    }

    public final void b(@Y61.k bx0 bx0Var) {
        ArrayDeque<bx0> arrayDeque = this.f385811d;
        synchronized (this) {
            if (arrayDeque.remove(bx0Var)) {
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        a();
    }

    public final synchronized void a(@Y61.k bx0 bx0Var) {
        this.f385811d.add(bx0Var);
    }

    private final void a(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (arrayDeque.remove(obj)) {
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a() {
        /*
            r14 = this;
            boolean r0 = com.yandex.mobile.ads.impl.qc1.f389148f
            if (r0 == 0) goto L2e
            boolean r0 = java.lang.Thread.holdsLock(r14)
            if (r0 != 0) goto Lb
            goto L2e
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Thread "
            java.lang.StringBuilder r1 = com.yandex.mobile.ads.impl.Cif.a(r1)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r14)
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.bx0$a> r1 = r14.f385809b     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6e
        L3a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L70
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L6e
            com.yandex.mobile.ads.impl.bx0$a r2 = (com.yandex.mobile.ads.impl.bx0.a) r2     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.bx0$a> r3 = r14.f385810c     // Catch: java.lang.Throwable -> L6e
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L6e
            r4 = 64
            if (r3 >= r4) goto L70
            java.util.concurrent.atomic.AtomicInteger r3 = r2.b()     // Catch: java.lang.Throwable -> L6e
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L6e
            r4 = 5
            if (r3 >= r4) goto L3a
            r1.remove()     // Catch: java.lang.Throwable -> L6e
            java.util.concurrent.atomic.AtomicInteger r3 = r2.b()     // Catch: java.lang.Throwable -> L6e
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L6e
            r0.add(r2)     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.bx0$a> r3 = r14.f385810c     // Catch: java.lang.Throwable -> L6e
            r3.add(r2)     // Catch: java.lang.Throwable -> L6e
            goto L3a
        L6e:
            r0 = move-exception
            goto Ld0
        L70:
            monitor-enter(r14)     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.bx0$a> r1 = r14.f385810c     // Catch: java.lang.Throwable -> Lcd
            r1.size()     // Catch: java.lang.Throwable -> Lcd
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.bx0> r1 = r14.f385811d     // Catch: java.lang.Throwable -> Lcd
            r1.size()     // Catch: java.lang.Throwable -> Lcd
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L6e
            kotlin.G0 r1 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r14)
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L85:
            if (r3 >= r1) goto Lcc
            java.lang.Object r4 = r0.get(r3)
            com.yandex.mobile.ads.impl.bx0$a r4 = (com.yandex.mobile.ads.impl.bx0.a) r4
            monitor-enter(r14)
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f385808a     // Catch: java.lang.Throwable -> Lbf
            if (r5 != 0) goto Lc1
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> Lbf
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Lbf
            java.util.concurrent.SynchronousQueue r12 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> Lbf
            r12.<init>()     // Catch: java.lang.Throwable -> Lbf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbf
            r6.<init>()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = com.yandex.mobile.ads.impl.qc1.f389149g     // Catch: java.lang.Throwable -> Lbf
            r6.append(r7)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = " Dispatcher"
            r6.append(r7)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lbf
            java.util.concurrent.ThreadFactory r13 = com.yandex.mobile.ads.impl.qc1.a(r6, r2)     // Catch: java.lang.Throwable -> Lbf
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 60
            r7 = 0
            r6 = r5
            r6.<init>(r7, r8, r9, r11, r12, r13)     // Catch: java.lang.Throwable -> Lbf
            r14.f385808a = r5     // Catch: java.lang.Throwable -> Lbf
            goto Lc1
        Lbf:
            r0 = move-exception
            goto Lca
        Lc1:
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f385808a     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r14)
            r4.a(r5)
            int r3 = r3 + 1
            goto L85
        Lca:
            monitor-exit(r14)
            throw r0
        Lcc:
            return
        Lcd:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L6e
            throw r0     // Catch: java.lang.Throwable -> L6e
        Ld0:
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gq.a():void");
    }
}
