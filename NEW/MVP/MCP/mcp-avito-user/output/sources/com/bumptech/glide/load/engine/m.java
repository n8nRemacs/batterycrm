package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.core.util.y;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.cache.o;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.util.pool.a;
import j.N;
import j.P;
import j.k0;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: Engine.java */
/* loaded from: classes5.dex */
public class m implements o, o.a, r.a {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f339091h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final t f339092a;

    /* renamed from: b, reason: collision with root package name */
    public final q f339093b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.cache.n f339094c;

    /* renamed from: d, reason: collision with root package name */
    public final b f339095d;

    /* renamed from: e, reason: collision with root package name */
    public final z f339096e;

    /* renamed from: f, reason: collision with root package name */
    public final a f339097f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.c f339098g;

    /* compiled from: Engine.java */
    @k0
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final c f339099a;

        /* renamed from: b, reason: collision with root package name */
        public final y.a<j<?>> f339100b = com.bumptech.glide.util.pool.a.a(150, new C10507a());

        /* renamed from: c, reason: collision with root package name */
        public int f339101c;

        /* compiled from: Engine.java */
        /* renamed from: com.bumptech.glide.load.engine.m$a$a, reason: collision with other inner class name */
        public class C10507a implements a.b<j<?>> {
            public C10507a() {
            }

            @Override // com.bumptech.glide.util.pool.a.b
            public final j<?> create() {
                a aVar = a.this;
                return new j<>(aVar.f339099a, aVar.f339100b);
            }
        }

        public a(c cVar) {
            this.f339099a = cVar;
        }
    }

    /* compiled from: Engine.java */
    @k0
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.executor.a f339103a;

        /* renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.executor.a f339104b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.executor.a f339105c;

        /* renamed from: d, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.executor.a f339106d;

        /* renamed from: e, reason: collision with root package name */
        public final m f339107e;

        /* renamed from: f, reason: collision with root package name */
        public final m f339108f;

        /* renamed from: g, reason: collision with root package name */
        public final y.a<n<?>> f339109g = com.bumptech.glide.util.pool.a.a(150, new a());

        /* compiled from: Engine.java */
        public class a implements a.b<n<?>> {
            public a() {
            }

            @Override // com.bumptech.glide.util.pool.a.b
            public final n<?> create() {
                b bVar = b.this;
                com.bumptech.glide.load.engine.executor.a aVar = bVar.f339103a;
                y.a<n<?>> aVar2 = bVar.f339109g;
                return new n<>(aVar, bVar.f339104b, bVar.f339105c, bVar.f339106d, bVar.f339107e, bVar.f339108f, aVar2);
            }
        }

        public b(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, m mVar2) {
            this.f339103a = aVar;
            this.f339104b = aVar2;
            this.f339105c = aVar3;
            this.f339106d = aVar4;
            this.f339107e = mVar;
            this.f339108f = mVar2;
        }
    }

    /* compiled from: Engine.java */
    public static class c implements j.e {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.cache.m f339111a;

        /* renamed from: b, reason: collision with root package name */
        public volatile com.bumptech.glide.load.engine.cache.a f339112b;

        public c(com.bumptech.glide.load.engine.cache.m mVar) {
            this.f339111a = mVar;
        }

        public final com.bumptech.glide.load.engine.cache.a a() {
            if (this.f339112b == null) {
                synchronized (this) {
                    try {
                        if (this.f339112b == null) {
                            this.f339112b = this.f339111a.a();
                        }
                        if (this.f339112b == null) {
                            this.f339112b = new com.bumptech.glide.load.engine.cache.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f339112b;
        }
    }

    /* compiled from: Engine.java */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final n<?> f339113a;

        /* renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.request.i f339114b;

        public d(com.bumptech.glide.request.i iVar, n nVar) {
            this.f339114b = iVar;
            this.f339113a = nVar;
        }

        public final void a() {
            synchronized (m.this) {
                this.f339113a.g(this.f339114b);
            }
        }
    }

    public m(com.bumptech.glide.load.engine.cache.n nVar, com.bumptech.glide.load.engine.cache.m mVar, com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4) {
        this.f339094c = nVar;
        c cVar = new c(mVar);
        com.bumptech.glide.load.engine.c cVar2 = new com.bumptech.glide.load.engine.c();
        this.f339098g = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.f338955d = this;
            }
        }
        this.f339093b = new q();
        this.f339092a = new t();
        this.f339095d = new b(aVar, aVar2, aVar3, aVar4, this, this);
        this.f339097f = new a(cVar);
        this.f339096e = new z();
        nVar.f338971d = this;
    }

    public static void f(w wVar) {
        if (!(wVar instanceof r)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((r) wVar).d();
    }

    public final d a(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.h hVar, int i12, int i13, Class cls, Class cls2, Priority priority, l lVar, com.bumptech.glide.util.b bVar, boolean z12, boolean z13, com.bumptech.glide.load.k kVar, boolean z14, boolean z15, com.bumptech.glide.request.i iVar, Executor executor) {
        long jElapsedRealtimeNanos;
        if (f339091h) {
            int i14 = com.bumptech.glide.util.g.f339641a;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j12 = jElapsedRealtimeNanos;
        this.f339093b.getClass();
        p pVar = new p(obj, hVar, i12, i13, bVar, cls, cls2, kVar);
        synchronized (this) {
            try {
                r<?> rVarB = b(pVar, z14, j12);
                if (rVarB == null) {
                    return g(eVar, obj, hVar, i12, i13, cls, cls2, priority, lVar, bVar, z12, z13, kVar, z14, z15, iVar, executor, pVar, j12);
                }
                iVar.i(rVarB, DataSource.f338831f);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @P
    public final r<?> b(p pVar, boolean z12, long j12) {
        r<?> rVar;
        Object objRemove;
        if (!z12) {
            return null;
        }
        com.bumptech.glide.load.engine.c cVar = this.f339098g;
        synchronized (cVar) {
            c.b bVar = (c.b) cVar.f338953b.get(pVar);
            if (bVar == null) {
                rVar = null;
            } else {
                rVar = bVar.get();
                if (rVar == null) {
                    cVar.b(bVar);
                }
            }
        }
        if (rVar != null) {
            rVar.a();
        }
        if (rVar != null) {
            if (f339091h) {
                int i12 = com.bumptech.glide.util.g.f339641a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(pVar);
            }
            return rVar;
        }
        com.bumptech.glide.load.engine.cache.n nVar = this.f339094c;
        synchronized (nVar) {
            objRemove = nVar.f339642a.remove(pVar);
            if (objRemove != null) {
                nVar.f339644c -= nVar.c(objRemove);
            }
        }
        w wVar = (w) objRemove;
        r<?> rVar2 = wVar == null ? null : wVar instanceof r ? (r) wVar : new r<>(wVar, true, true, pVar, this);
        if (rVar2 != null) {
            rVar2.a();
            this.f339098g.a(pVar, rVar2);
        }
        if (rVar2 == null) {
            return null;
        }
        if (f339091h) {
            int i13 = com.bumptech.glide.util.g.f339641a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(pVar);
        }
        return rVar2;
    }

    public final synchronized void c(n<?> nVar, com.bumptech.glide.load.h hVar, r<?> rVar) {
        if (rVar != null) {
            try {
                if (rVar.f339154b) {
                    this.f339098g.a(hVar, rVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t tVar = this.f339092a;
        tVar.getClass();
        nVar.getClass();
        HashMap map = tVar.f339161a;
        if (nVar.equals(map.get(hVar))) {
            map.remove(hVar);
        }
    }

    public final void d(com.bumptech.glide.load.h hVar, r<?> rVar) {
        com.bumptech.glide.load.engine.c cVar = this.f339098g;
        synchronized (cVar) {
            c.b bVar = (c.b) cVar.f338953b.remove(hVar);
            if (bVar != null) {
                bVar.f338958c = null;
                bVar.clear();
            }
        }
        if (rVar.f339154b) {
            this.f339094c.e(hVar, rVar);
        } else {
            this.f339096e.a(rVar, false);
        }
    }

    public final void e(@N w<?> wVar) {
        this.f339096e.a(wVar, true);
    }

    public final d g(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.h hVar, int i12, int i13, Class cls, Class cls2, Priority priority, l lVar, com.bumptech.glide.util.b bVar, boolean z12, boolean z13, com.bumptech.glide.load.k kVar, boolean z14, boolean z15, com.bumptech.glide.request.i iVar, Executor executor, p pVar, long j12) {
        n nVar = (n) this.f339092a.f339161a.get(pVar);
        if (nVar != null) {
            nVar.b(iVar, executor);
            if (f339091h) {
                int i14 = com.bumptech.glide.util.g.f339641a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(pVar);
            }
            return new d(iVar, nVar);
        }
        n<?> nVarB = this.f339095d.f339109g.b();
        com.bumptech.glide.util.k.c(nVarB, "Argument must not be null");
        synchronized (nVarB) {
            nVarB.f339127l = pVar;
            nVarB.f339128m = z14;
            nVarB.f339129n = z15;
        }
        a aVar = this.f339097f;
        j<R> jVar = (j) aVar.f339100b.b();
        com.bumptech.glide.util.k.c(jVar, "Argument must not be null");
        int i15 = aVar.f339101c;
        aVar.f339101c = i15 + 1;
        i<R> iVar2 = jVar.f339035b;
        iVar2.f339015c = eVar;
        iVar2.f339016d = obj;
        iVar2.f339026n = hVar;
        iVar2.f339017e = i12;
        iVar2.f339018f = i13;
        iVar2.f339028p = lVar;
        iVar2.f339019g = cls;
        iVar2.f339020h = jVar.f339038e;
        iVar2.f339023k = cls2;
        iVar2.f339027o = priority;
        iVar2.f339021i = kVar;
        iVar2.f339022j = bVar;
        iVar2.f339029q = z12;
        iVar2.f339030r = z13;
        jVar.f339042i = eVar;
        jVar.f339043j = hVar;
        jVar.f339044k = priority;
        jVar.f339045l = pVar;
        jVar.f339046m = i12;
        jVar.f339047n = i13;
        jVar.f339048o = lVar;
        jVar.f339049p = kVar;
        jVar.f339050q = nVarB;
        jVar.f339051r = i15;
        jVar.f339053t = j.g.f339071b;
        jVar.f339054u = obj;
        t tVar = this.f339092a;
        tVar.getClass();
        tVar.f339161a.put(pVar, nVarB);
        nVarB.b(iVar, executor);
        synchronized (nVarB) {
            nVarB.f339136u = jVar;
            j.h hVarI = jVar.i(j.h.f339075b);
            ((hVarI == j.h.f339076c || hVarI == j.h.f339077d) ? nVarB.f339123h : nVarB.f339129n ? nVarB.f339125j : nVarB.f339124i).execute(jVar);
        }
        if (f339091h) {
            int i16 = com.bumptech.glide.util.g.f339641a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(pVar);
        }
        return new d(iVar, nVarB);
    }
}
