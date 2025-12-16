package com.yandex.mobile.ads.impl;

import android.os.Process;
import com.yandex.mobile.ads.impl.zg;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes8.dex */
public final class eh extends Thread {

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f384926h = pk1.f388875a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<qy0<?>> f384927b;

    /* renamed from: c, reason: collision with root package name */
    private final BlockingQueue<qy0<?>> f384928c;

    /* renamed from: d, reason: collision with root package name */
    private final zg f384929d;

    /* renamed from: e, reason: collision with root package name */
    private final sz0 f384930e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f384931f = false;

    /* renamed from: g, reason: collision with root package name */
    private final al1 f384932g;

    public eh(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, zg zgVar, sz0 sz0Var) {
        this.f384927b = priorityBlockingQueue;
        this.f384928c = priorityBlockingQueue2;
        this.f384929d = zgVar;
        this.f384930e = sz0Var;
        this.f384932g = new al1(this, priorityBlockingQueue2, sz0Var);
    }

    public final void b() {
        this.f384931f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (f384926h) {
            boolean z12 = pk1.f388875a;
        }
        Process.setThreadPriority(10);
        this.f384929d.a();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f384931f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                boolean z13 = pk1.f388875a;
            } catch (Throwable unused2) {
                boolean z14 = pk1.f388875a;
                return;
            }
        }
    }

    private void a() throws InterruptedException {
        qy0<?> qy0VarTake = this.f384927b.take();
        qy0VarTake.a("cache-queue-take");
        qy0VarTake.a(1);
        try {
            if (qy0VarTake.o()) {
                qy0VarTake.c("cache-discard-canceled");
                return;
            }
            zg.a aVar = this.f384929d.get(qy0VarTake.e());
            if (aVar == null) {
                qy0VarTake.a("cache-miss");
                if (!this.f384932g.a(qy0VarTake)) {
                    this.f384928c.put(qy0VarTake);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (aVar.f392258e < jCurrentTimeMillis) {
                    qy0VarTake.a("cache-hit-expired");
                    qy0VarTake.a(aVar);
                    if (!this.f384932g.a(qy0VarTake)) {
                        this.f384928c.put(qy0VarTake);
                    }
                } else {
                    qy0VarTake.a("cache-hit");
                    kz0<?> kz0VarA = qy0VarTake.a(new zo0(aVar.f392254a, aVar.f392260g));
                    qy0VarTake.a("cache-hit-parsed");
                    if (kz0VarA.f387336c != null) {
                        qy0VarTake.a("cache-parsing-failed");
                        this.f384929d.a(qy0VarTake.e());
                        qy0VarTake.a((zg.a) null);
                        if (!this.f384932g.a(qy0VarTake)) {
                            this.f384928c.put(qy0VarTake);
                        }
                    } else if (aVar.f392259f < jCurrentTimeMillis) {
                        qy0VarTake.a("cache-hit-refresh-needed");
                        qy0VarTake.a(aVar);
                        kz0VarA.f387337d = true;
                        if (this.f384932g.a(qy0VarTake)) {
                            ((gt) this.f384930e).a(qy0VarTake, kz0VarA, null);
                        } else {
                            ((gt) this.f384930e).a(qy0VarTake, kz0VarA, new dh(this, qy0VarTake));
                        }
                    } else {
                        ((gt) this.f384930e).a(qy0VarTake, kz0VarA, null);
                    }
                }
            }
        } finally {
            qy0VarTake.a(2);
        }
    }
}
