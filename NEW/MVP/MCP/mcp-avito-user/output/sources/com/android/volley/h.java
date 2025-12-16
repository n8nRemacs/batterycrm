package com.android.volley;

import android.os.SystemClock;
import com.android.volley.AbstractC27620a;
import com.android.volley.b;
import com.android.volley.j;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: AsyncRequestQueue.java */
/* loaded from: classes10.dex */
public class h extends u {

    /* renamed from: l, reason: collision with root package name */
    @P
    public final AbstractC27620a f67047l;

    /* renamed from: m, reason: collision with root package name */
    public final com.android.volley.b f67048m;

    /* renamed from: n, reason: collision with root package name */
    public ExecutorService f67049n;

    /* renamed from: o, reason: collision with root package name */
    public ScheduledExecutorService f67050o;

    /* renamed from: p, reason: collision with root package name */
    public ExecutorService f67051p;

    /* renamed from: q, reason: collision with root package name */
    public final A f67052q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f67053r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f67054s;

    /* renamed from: t, reason: collision with root package name */
    public final Object[] f67055t;

    /* compiled from: AsyncRequestQueue.java */
    public static class a {
    }

    /* compiled from: AsyncRequestQueue.java */
    public class b<T> extends v<T> {

        /* renamed from: c, reason: collision with root package name */
        public final j.a f67056c;

        /* renamed from: d, reason: collision with root package name */
        public final long f67057d;

        /* compiled from: AsyncRequestQueue.java */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                h.this.d(bVar.f67161b);
            }
        }

        public b(Request<T> request, j.a aVar, long j12) {
            super(request);
            this.f67056c = aVar;
            this.f67057d = j12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Request<T> request = this.f67161b;
            request.a("cache-hit");
            j.a aVar = this.f67056c;
            w<T> wVarM = request.m(new r(200, aVar.f67066a, false, aVar.f67073h));
            request.a("cache-hit-parsed");
            boolean z12 = aVar.f67071f < this.f67057d;
            h hVar = h.this;
            if (!z12) {
                hVar.f67156g.b(request, wVarM);
                return;
            }
            request.a("cache-hit-refresh-needed");
            request.f67037n = aVar;
            wVarM.f67165d = true;
            boolean zA2 = hVar.f67052q.a(request);
            x xVar = hVar.f67156g;
            if (zA2) {
                xVar.b(request, wVarM);
            } else {
                xVar.a(request, wVarM, new a());
            }
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    public class c<T> extends v<T> {

        /* renamed from: c, reason: collision with root package name */
        public final w<?> f67060c;

        /* compiled from: AsyncRequestQueue.java */
        public class a implements AbstractC27620a.b {
            public a() {
            }

            @Override // com.android.volley.AbstractC27620a.b
            public final void a() {
                c cVar = c.this;
                h.g(h.this, cVar.f67161b, cVar.f67060c, true);
            }
        }

        public c(Request<T> request, w<?> wVar) {
            super(request);
            this.f67060c = wVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h hVar = h.this;
            AbstractC27620a abstractC27620a = hVar.f67047l;
            w<?> wVar = this.f67060c;
            Request<T> request = this.f67161b;
            if (abstractC27620a != null) {
                request.h();
                abstractC27620a.b(new a());
            } else {
                hVar.f67154e.b(request.h(), wVar.f67163b);
                h.g(hVar, request, wVar, true);
            }
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    public class d<T> extends v<T> {

        /* compiled from: AsyncRequestQueue.java */
        public class a implements AbstractC27620a.InterfaceC2122a {
            public a() {
            }

            @Override // com.android.volley.AbstractC27620a.InterfaceC2122a
            public final void a() {
                d dVar = d.this;
                h.f(h.this, null, dVar.f67161b);
            }
        }

        public d(Request<T> request) {
            super(request);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Request<T> request = this.f67161b;
            if (request.k()) {
                request.d("cache-discard-canceled");
                return;
            }
            request.a("cache-queue-take");
            h hVar = h.this;
            AbstractC27620a abstractC27620a = hVar.f67047l;
            if (abstractC27620a != null) {
                request.h();
                abstractC27620a.a(new a());
            } else {
                h.f(hVar, hVar.f67154e.get(request.h()), request);
            }
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    public static abstract class e {
    }

    /* compiled from: AsyncRequestQueue.java */
    public class f<T> extends v<T> {
        @Override // java.lang.Runnable
        public final void run() {
            Request<T> request = this.f67161b;
            w<T> wVarM = request.m(null);
            request.a("network-parse-complete");
            if (request.f67033j && wVarM.f67163b != null) {
                throw null;
            }
            h.g(null, request, wVarM, false);
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    public class g<T> extends v<T> {

        /* compiled from: AsyncRequestQueue.java */
        public class a implements b.InterfaceC2123b {
        }

        public g(Request<T> request) {
            super(request);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Request<T> request = this.f67161b;
            if (request.k()) {
                request.d("network-discard-cancelled");
                request.l();
            } else {
                SystemClock.elapsedRealtime();
                request.a("network-queue-take");
                h.this.f67048m.b(request, new a());
            }
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    /* renamed from: com.android.volley.h$h, reason: collision with other inner class name */
    public class C2124h<T> extends v<T> {
        @Override // java.lang.Runnable
        public final void run() {
            this.f67161b.getClass();
            throw null;
        }
    }

    /* compiled from: AsyncRequestQueue.java */
    public static class i implements j {
        public i() {
        }

        @Override // com.android.volley.j
        public final void a() {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.j
        public final void b(String str, j.a aVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.j
        public final j.a get(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.j
        public final void invalidate(String str) {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ i(com.android.volley.c cVar) {
            this();
        }
    }

    public h(j jVar, com.android.volley.b bVar, AbstractC27620a abstractC27620a, x xVar, e eVar, com.android.volley.c cVar) {
        super(jVar, bVar, 0, xVar);
        this.f67052q = new A(this);
        this.f67053r = new ArrayList();
        this.f67054s = false;
        this.f67055t = new Object[0];
        this.f67047l = abstractC27620a;
        this.f67048m = bVar;
    }

    public static void f(h hVar, j.a aVar, Request request) {
        A a12 = hVar.f67052q;
        if (aVar == null) {
            request.a("cache-miss");
            if (a12.a(request)) {
                return;
            }
            hVar.d(request);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (aVar.f67070e >= jCurrentTimeMillis) {
            hVar.f67051p.execute(hVar.new b(request, aVar, jCurrentTimeMillis));
            return;
        }
        request.a("cache-hit-expired");
        request.f67037n = aVar;
        if (a12.a(request)) {
            return;
        }
        hVar.d(request);
    }

    public static void g(h hVar, Request request, w wVar, boolean z12) {
        A a12;
        List list;
        hVar.getClass();
        if (z12) {
            request.a("network-cache-written");
        }
        synchronized (request.f67029f) {
            request.f67035l = true;
        }
        hVar.f67156g.b(request, wVar);
        synchronized (request.f67029f) {
            a12 = request.f67038o;
        }
        if (a12 != null) {
            j.a aVar = wVar.f67163b;
            if (aVar != null) {
                if (aVar.f67070e >= System.currentTimeMillis()) {
                    String strH = request.h();
                    synchronized (a12) {
                        list = (List) a12.f67020a.remove(strH);
                    }
                    if (list != null) {
                        if (z.f67166a) {
                            z.b("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strH);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            a12.f67021b.b((Request) it.next(), wVar);
                        }
                        return;
                    }
                    return;
                }
            }
            a12.b(request);
        }
    }

    @Override // com.android.volley.u
    public final <T> void b(Request<T> request) {
        if (!this.f67054s) {
            synchronized (this.f67055t) {
                try {
                    if (!this.f67054s) {
                        this.f67053r.add(request);
                        return;
                    }
                } finally {
                }
            }
        }
        if (!request.f67033j) {
            d(request);
        } else if (this.f67047l != null) {
            this.f67049n.execute(new d(request));
        } else {
            this.f67051p.execute(new d(request));
        }
    }

    @Override // com.android.volley.u
    public final <T> void d(Request<T> request) {
        this.f67049n.execute(new g(request));
    }

    @Override // com.android.volley.u
    public final void e() {
        ExecutorService executorService = this.f67049n;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f67049n = null;
        }
        ExecutorService executorService2 = this.f67051p;
        if (executorService2 != null) {
            executorService2.shutdownNow();
            this.f67051p = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.f67050o;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f67050o = null;
        }
    }
}
