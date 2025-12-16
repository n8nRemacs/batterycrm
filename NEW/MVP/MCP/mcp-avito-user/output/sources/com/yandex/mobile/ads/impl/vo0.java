package com.yandex.mobile.ads.impl;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes8.dex */
public final class vo0 extends Thread {

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<qy0<?>> f390958b;

    /* renamed from: c, reason: collision with root package name */
    private final uo0 f390959c;

    /* renamed from: d, reason: collision with root package name */
    private final zg f390960d;

    /* renamed from: e, reason: collision with root package name */
    private final sz0 f390961e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f390962f = false;

    public vo0(PriorityBlockingQueue priorityBlockingQueue, uo0 uo0Var, zg zgVar, sz0 sz0Var) {
        this.f390958b = priorityBlockingQueue;
        this.f390959c = uo0Var;
        this.f390960d = zgVar;
        this.f390961e = sz0Var;
    }

    private void a() throws InterruptedException {
        qy0<?> qy0VarTake = this.f390958b.take();
        SystemClock.elapsedRealtime();
        qy0VarTake.a(3);
        try {
            try {
                qy0VarTake.a("network-queue-take");
            } catch (ok1 e12) {
                SystemClock.elapsedRealtime();
                ((gt) this.f390961e).a(qy0VarTake, qy0VarTake.b(e12));
                qy0VarTake.q();
            } catch (Exception e13) {
                boolean z12 = pk1.f388875a;
                ok1 ok1Var = new ok1((Throwable) e13);
                SystemClock.elapsedRealtime();
                ((gt) this.f390961e).a(qy0VarTake, ok1Var);
                qy0VarTake.q();
            }
            if (qy0VarTake.o()) {
                qy0VarTake.c("network-discard-cancelled");
                qy0VarTake.q();
            } else {
                TrafficStats.setThreadStatsTag(qy0VarTake.l());
                zo0 zo0VarA = ((lf) this.f390959c).a(qy0VarTake);
                qy0VarTake.a("network-http-complete");
                if (!zo0VarA.f392319e || !qy0VarTake.n()) {
                    kz0<?> kz0VarA = qy0VarTake.a(zo0VarA);
                    qy0VarTake.a("network-parse-complete");
                    if (qy0VarTake.s() && kz0VarA.f387335b != null) {
                        this.f390960d.a(qy0VarTake.e(), kz0VarA.f387335b);
                        qy0VarTake.a("network-cache-written");
                    }
                    qy0VarTake.p();
                    ((gt) this.f390961e).a(qy0VarTake, kz0VarA, null);
                    qy0VarTake.a(kz0VarA);
                    qy0VarTake.a(4);
                    return;
                }
                qy0VarTake.c("not-modified");
                qy0VarTake.q();
            }
            qy0VarTake.a(4);
        } catch (Throwable th2) {
            qy0VarTake.a(4);
            throw th2;
        }
    }

    public final void b() {
        this.f390962f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f390962f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                boolean z12 = pk1.f388875a;
            } catch (Throwable unused2) {
                boolean z13 = pk1.f388875a;
                return;
            }
        }
    }
}
