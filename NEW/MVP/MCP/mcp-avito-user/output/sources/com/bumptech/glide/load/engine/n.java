package com.bumptech.glide.load.engine;

import androidx.core.util.y;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.util.pool.a;
import j.N;
import j.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: EngineJob.java */
/* loaded from: classes5.dex */
class n<R> implements j.b<R>, a.d {

    /* renamed from: w, reason: collision with root package name */
    public static final c f339116w = new c();

    /* renamed from: b, reason: collision with root package name */
    public final e f339117b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.util.pool.e f339118c;

    /* renamed from: d, reason: collision with root package name */
    public final m f339119d;

    /* renamed from: e, reason: collision with root package name */
    public final y.a<n<?>> f339120e;

    /* renamed from: f, reason: collision with root package name */
    public final c f339121f;

    /* renamed from: g, reason: collision with root package name */
    public final m f339122g;

    /* renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.executor.a f339123h;

    /* renamed from: i, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.executor.a f339124i;

    /* renamed from: j, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.executor.a f339125j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f339126k;

    /* renamed from: l, reason: collision with root package name */
    public com.bumptech.glide.load.h f339127l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f339128m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f339129n;

    /* renamed from: o, reason: collision with root package name */
    public w<?> f339130o;

    /* renamed from: p, reason: collision with root package name */
    public DataSource f339131p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f339132q;

    /* renamed from: r, reason: collision with root package name */
    public GlideException f339133r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f339134s;

    /* renamed from: t, reason: collision with root package name */
    public r<?> f339135t;

    /* renamed from: u, reason: collision with root package name */
    public j<R> f339136u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f339137v;

    /* compiled from: EngineJob.java */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.request.i f339138b;

        public a(com.bumptech.glide.request.i iVar) {
            this.f339138b = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f339138b.e()) {
                synchronized (n.this) {
                    try {
                        e eVar = n.this.f339117b;
                        com.bumptech.glide.request.i iVar = this.f339138b;
                        eVar.getClass();
                        if (eVar.f339144b.contains(new d(iVar, com.bumptech.glide.util.e.f339639b))) {
                            n nVar = n.this;
                            com.bumptech.glide.request.i iVar2 = this.f339138b;
                            nVar.getClass();
                            try {
                                iVar2.h(nVar.f339133r, 5);
                            } catch (Throwable th2) {
                                throw new com.bumptech.glide.load.engine.d(th2);
                            }
                        }
                        n.this.c();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.request.i f339140b;

        public b(com.bumptech.glide.request.i iVar) {
            this.f339140b = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f339140b.e()) {
                synchronized (n.this) {
                    try {
                        e eVar = n.this.f339117b;
                        com.bumptech.glide.request.i iVar = this.f339140b;
                        eVar.getClass();
                        if (eVar.f339144b.contains(new d(iVar, com.bumptech.glide.util.e.f339639b))) {
                            n.this.f339135t.a();
                            n nVar = n.this;
                            com.bumptech.glide.request.i iVar2 = this.f339140b;
                            nVar.getClass();
                            try {
                                iVar2.i(nVar.f339135t, nVar.f339131p);
                                n.this.g(this.f339140b);
                            } catch (Throwable th2) {
                                throw new com.bumptech.glide.load.engine.d(th2);
                            }
                        }
                        n.this.c();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    @k0
    public static class c {
    }

    /* compiled from: EngineJob.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.request.i f339142a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f339143b;

        public d(com.bumptech.glide.request.i iVar, Executor executor) {
            this.f339142a = iVar;
            this.f339143b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f339142a.equals(((d) obj).f339142a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f339142a.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    public static final class e implements Iterable<d> {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f339144b = new ArrayList(2);

        @Override // java.lang.Iterable
        @N
        public final Iterator<d> iterator() {
            return this.f339144b.iterator();
        }
    }

    @k0
    public n() {
        throw null;
    }

    public n(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, m mVar2, y.a aVar5) {
        c cVar = f339116w;
        this.f339117b = new e();
        this.f339118c = com.bumptech.glide.util.pool.e.a();
        this.f339126k = new AtomicInteger();
        this.f339123h = aVar;
        this.f339124i = aVar2;
        this.f339125j = aVar4;
        this.f339122g = mVar;
        this.f339119d = mVar2;
        this.f339120e = aVar5;
        this.f339121f = cVar;
    }

    @Override // com.bumptech.glide.util.pool.a.d
    @N
    public final com.bumptech.glide.util.pool.e a() {
        return this.f339118c;
    }

    public final synchronized void b(com.bumptech.glide.request.i iVar, Executor executor) {
        try {
            this.f339118c.b();
            e eVar = this.f339117b;
            eVar.getClass();
            eVar.f339144b.add(new d(iVar, executor));
            if (this.f339132q) {
                d(1);
                executor.execute(new b(iVar));
            } else if (this.f339134s) {
                d(1);
                executor.execute(new a(iVar));
            } else {
                com.bumptech.glide.util.k.a("Cannot add callbacks to a cancelled EngineJob", !this.f339137v);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        r<?> rVar;
        synchronized (this) {
            try {
                this.f339118c.b();
                com.bumptech.glide.util.k.a("Not yet complete!", e());
                int iDecrementAndGet = this.f339126k.decrementAndGet();
                com.bumptech.glide.util.k.a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    rVar = this.f339135t;
                    f();
                } else {
                    rVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (rVar != null) {
            rVar.d();
        }
    }

    public final synchronized void d(int i12) {
        r<?> rVar;
        com.bumptech.glide.util.k.a("Not yet complete!", e());
        if (this.f339126k.getAndAdd(i12) == 0 && (rVar = this.f339135t) != null) {
            rVar.a();
        }
    }

    public final boolean e() {
        return this.f339134s || this.f339132q || this.f339137v;
    }

    public final synchronized void f() {
        boolean zA2;
        if (this.f339127l == null) {
            throw new IllegalArgumentException();
        }
        this.f339117b.f339144b.clear();
        this.f339127l = null;
        this.f339135t = null;
        this.f339130o = null;
        this.f339134s = false;
        this.f339137v = false;
        this.f339132q = false;
        j<R> jVar = this.f339136u;
        j.f fVar = jVar.f339041h;
        synchronized (fVar) {
            fVar.f339068a = true;
            zA2 = fVar.a();
        }
        if (zA2) {
            jVar.k();
        }
        this.f339136u = null;
        this.f339133r = null;
        this.f339131p = null;
        this.f339120e.a(this);
    }

    public final synchronized void g(com.bumptech.glide.request.i iVar) {
        try {
            this.f339118c.b();
            e eVar = this.f339117b;
            eVar.getClass();
            eVar.f339144b.remove(new d(iVar, com.bumptech.glide.util.e.f339639b));
            if (this.f339117b.f339144b.isEmpty()) {
                if (!e()) {
                    this.f339137v = true;
                    j<R> jVar = this.f339136u;
                    jVar.f339034D = true;
                    h hVar = jVar.f339032B;
                    if (hVar != null) {
                        hVar.cancel();
                    }
                    m mVar = this.f339122g;
                    com.bumptech.glide.load.h hVar2 = this.f339127l;
                    synchronized (mVar) {
                        t tVar = mVar.f339092a;
                        tVar.getClass();
                        HashMap map = tVar.f339161a;
                        if (equals(map.get(hVar2))) {
                            map.remove(hVar2);
                        }
                    }
                }
                if (this.f339132q || this.f339134s) {
                    if (this.f339126k.get() == 0) {
                        f();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void h(j<?> jVar) {
        (this.f339129n ? this.f339125j : this.f339124i).execute(jVar);
    }
}
