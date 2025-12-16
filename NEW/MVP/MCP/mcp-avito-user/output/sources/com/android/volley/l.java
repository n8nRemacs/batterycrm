package com.android.volley;

import android.os.Process;
import com.android.volley.j;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: CacheDispatcher.java */
/* loaded from: classes10.dex */
public class l extends Thread {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f67076h = z.f67166a;

    /* renamed from: b, reason: collision with root package name */
    public final PriorityBlockingQueue f67077b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue f67078c;

    /* renamed from: d, reason: collision with root package name */
    public final j f67079d;

    /* renamed from: e, reason: collision with root package name */
    public final x f67080e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f67081f = false;

    /* renamed from: g, reason: collision with root package name */
    public final A f67082g;

    public l(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, j jVar, x xVar) {
        this.f67077b = priorityBlockingQueue;
        this.f67078c = priorityBlockingQueue2;
        this.f67079d = jVar;
        this.f67080e = xVar;
        this.f67082g = new A(this, priorityBlockingQueue2, xVar);
    }

    private void a() {
        Request<?> request = (Request) this.f67077b.take();
        j jVar = this.f67079d;
        request.a("cache-queue-take");
        request.n(1);
        try {
            if (request.k()) {
                request.d("cache-discard-canceled");
            } else {
                j.a aVar = jVar.get(request.h());
                PriorityBlockingQueue priorityBlockingQueue = this.f67078c;
                A a12 = this.f67082g;
                if (aVar == null) {
                    request.a("cache-miss");
                    if (!a12.a(request)) {
                        priorityBlockingQueue.put(request);
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (aVar.f67070e < jCurrentTimeMillis) {
                        request.a("cache-hit-expired");
                        request.f67037n = aVar;
                        if (!a12.a(request)) {
                            priorityBlockingQueue.put(request);
                        }
                    } else {
                        request.a("cache-hit");
                        w<?> wVarM = request.m(new r(aVar.f67066a, aVar.f67072g));
                        request.a("cache-hit-parsed");
                        if (wVarM.f67164c == null) {
                            boolean z12 = aVar.f67071f < jCurrentTimeMillis;
                            x xVar = this.f67080e;
                            if (z12) {
                                request.a("cache-hit-refresh-needed");
                                request.f67037n = aVar;
                                wVarM.f67165d = true;
                                if (a12.a(request)) {
                                    xVar.b(request, wVarM);
                                } else {
                                    xVar.a(request, wVarM, new k(this, request));
                                }
                            } else {
                                xVar.b(request, wVarM);
                            }
                        } else {
                            request.a("cache-parsing-failed");
                            jVar.invalidate(request.h());
                            request.f67037n = null;
                            if (!a12.a(request)) {
                                priorityBlockingQueue.put(request);
                            }
                        }
                    }
                }
            }
        } finally {
            request.n(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (f67076h) {
            z.b("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f67079d.a();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f67081f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                z.a("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
