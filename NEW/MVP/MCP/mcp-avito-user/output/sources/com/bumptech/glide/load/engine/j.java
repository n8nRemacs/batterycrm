package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.core.util.y;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.engine.m;
import com.bumptech.glide.load.engine.n;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.util.pool.a;
import j.N;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: DecodeJob.java */
/* loaded from: classes5.dex */
class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {

    /* renamed from: A, reason: collision with root package name */
    public com.bumptech.glide.load.data.d<?> f339031A;

    /* renamed from: B, reason: collision with root package name */
    public volatile com.bumptech.glide.load.engine.h f339032B;

    /* renamed from: C, reason: collision with root package name */
    public volatile boolean f339033C;

    /* renamed from: D, reason: collision with root package name */
    public volatile boolean f339034D;

    /* renamed from: e, reason: collision with root package name */
    public final m.c f339038e;

    /* renamed from: f, reason: collision with root package name */
    public final y.a<j<?>> f339039f;

    /* renamed from: i, reason: collision with root package name */
    public com.bumptech.glide.e f339042i;

    /* renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.load.h f339043j;

    /* renamed from: k, reason: collision with root package name */
    public Priority f339044k;

    /* renamed from: l, reason: collision with root package name */
    public p f339045l;

    /* renamed from: m, reason: collision with root package name */
    public int f339046m;

    /* renamed from: n, reason: collision with root package name */
    public int f339047n;

    /* renamed from: o, reason: collision with root package name */
    public l f339048o;

    /* renamed from: p, reason: collision with root package name */
    public com.bumptech.glide.load.k f339049p;

    /* renamed from: q, reason: collision with root package name */
    public n f339050q;

    /* renamed from: r, reason: collision with root package name */
    public int f339051r;

    /* renamed from: s, reason: collision with root package name */
    public h f339052s;

    /* renamed from: t, reason: collision with root package name */
    public g f339053t;

    /* renamed from: u, reason: collision with root package name */
    public Object f339054u;

    /* renamed from: v, reason: collision with root package name */
    public Thread f339055v;

    /* renamed from: w, reason: collision with root package name */
    public com.bumptech.glide.load.h f339056w;

    /* renamed from: x, reason: collision with root package name */
    public com.bumptech.glide.load.h f339057x;

    /* renamed from: y, reason: collision with root package name */
    public Object f339058y;

    /* renamed from: z, reason: collision with root package name */
    public DataSource f339059z;

    /* renamed from: b, reason: collision with root package name */
    public final i<R> f339035b = new i<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f339036c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.util.pool.e f339037d = com.bumptech.glide.util.pool.e.a();

    /* renamed from: g, reason: collision with root package name */
    public final d<?> f339040g = new d<>();

    /* renamed from: h, reason: collision with root package name */
    public final f f339041h = new f();

    /* compiled from: DecodeJob.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f339060a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f339061b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f339062c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f339062c = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339062c[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            f339061b = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339061b[2] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f339061b[3] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f339061b[5] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f339061b[0] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f339060a = iArr3;
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f339060a[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f339060a[2] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: DecodeJob.java */
    public interface b<R> {
    }

    /* compiled from: DecodeJob.java */
    public final class c<Z> implements k.a<Z> {

        /* renamed from: a, reason: collision with root package name */
        public final DataSource f339063a;

        public c(DataSource dataSource) {
            this.f339063a = dataSource;
        }

        @N
        public final w<Z> a(@N w<Z> wVar) {
            w<Z> wVarA;
            com.bumptech.glide.load.n<Z> nVar;
            EncodeStrategy encodeStrategyB;
            boolean z12;
            com.bumptech.glide.load.h fVar;
            j jVar = j.this;
            jVar.getClass();
            Class<?> cls = wVar.get().getClass();
            DataSource dataSource = DataSource.f338830e;
            DataSource dataSource2 = this.f339063a;
            i<R> iVar = jVar.f339035b;
            com.bumptech.glide.load.m<Z> mVarB = null;
            if (dataSource2 != dataSource) {
                com.bumptech.glide.load.n<Z> nVarD = iVar.d(cls);
                nVar = nVarD;
                wVarA = nVarD.a(jVar.f339042i, wVar, jVar.f339046m, jVar.f339047n);
            } else {
                wVarA = wVar;
                nVar = null;
            }
            if (!wVar.equals(wVarA)) {
                wVar.c();
            }
            if (iVar.f339015c.f338742b.f338673d.b(wVarA.b()) != null) {
                Registry registry = iVar.f339015c.f338742b;
                registry.getClass();
                mVarB = registry.f338673d.b(wVarA.b());
                if (mVarB == null) {
                    throw new Registry.NoResultEncoderAvailableException(wVarA.b());
                }
                encodeStrategyB = mVarB.b(jVar.f339049p);
            } else {
                encodeStrategyB = EncodeStrategy.f338839d;
            }
            com.bumptech.glide.load.m<Z> mVar = mVarB;
            com.bumptech.glide.load.h hVar = jVar.f339056w;
            ArrayList arrayListB = iVar.b();
            int size = arrayListB.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z12 = false;
                    break;
                }
                if (((n.a) arrayListB.get(i12)).f339240a.equals(hVar)) {
                    z12 = true;
                    break;
                }
                i12++;
            }
            if (!jVar.f339048o.d(!z12, dataSource2, encodeStrategyB)) {
                return wVarA;
            }
            if (mVar == null) {
                throw new Registry.NoResultEncoderAvailableException(wVarA.get().getClass());
            }
            int iOrdinal = encodeStrategyB.ordinal();
            if (iOrdinal == 0) {
                fVar = new com.bumptech.glide.load.engine.f(jVar.f339056w, jVar.f339043j);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyB);
                }
                fVar = new y(iVar.f339015c.f338741a, jVar.f339056w, jVar.f339043j, jVar.f339046m, jVar.f339047n, nVar, cls, jVar.f339049p);
            }
            v<Z> vVar = (v) v.f339165f.b();
            com.bumptech.glide.util.k.c(vVar, "Argument must not be null");
            vVar.f339169e = false;
            vVar.f339168d = true;
            vVar.f339167c = wVarA;
            d<?> dVar = jVar.f339040g;
            dVar.f339065a = fVar;
            dVar.f339066b = mVar;
            dVar.f339067c = vVar;
            return vVar;
        }
    }

    /* compiled from: DecodeJob.java */
    public static class d<Z> {

        /* renamed from: a, reason: collision with root package name */
        public com.bumptech.glide.load.h f339065a;

        /* renamed from: b, reason: collision with root package name */
        public com.bumptech.glide.load.m<Z> f339066b;

        /* renamed from: c, reason: collision with root package name */
        public v<Z> f339067c;
    }

    /* compiled from: DecodeJob.java */
    public interface e {
    }

    /* compiled from: DecodeJob.java */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public boolean f339068a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f339069b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f339070c;

        public final boolean a() {
            return (this.f339070c || this.f339069b) && this.f339068a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DecodeJob.java */
    public static final class g {

        /* renamed from: b, reason: collision with root package name */
        public static final g f339071b;

        /* renamed from: c, reason: collision with root package name */
        public static final g f339072c;

        /* renamed from: d, reason: collision with root package name */
        public static final g f339073d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ g[] f339074e;

        static {
            g gVar = new g("INITIALIZE", 0);
            f339071b = gVar;
            g gVar2 = new g("SWITCH_TO_SOURCE_SERVICE", 1);
            f339072c = gVar2;
            g gVar3 = new g("DECODE_DATA", 2);
            f339073d = gVar3;
            f339074e = new g[]{gVar, gVar2, gVar3};
        }

        public g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f339074e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DecodeJob.java */
    public static final class h {

        /* renamed from: b, reason: collision with root package name */
        public static final h f339075b;

        /* renamed from: c, reason: collision with root package name */
        public static final h f339076c;

        /* renamed from: d, reason: collision with root package name */
        public static final h f339077d;

        /* renamed from: e, reason: collision with root package name */
        public static final h f339078e;

        /* renamed from: f, reason: collision with root package name */
        public static final h f339079f;

        /* renamed from: g, reason: collision with root package name */
        public static final h f339080g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ h[] f339081h;

        static {
            h hVar = new h("INITIALIZE", 0);
            f339075b = hVar;
            h hVar2 = new h("RESOURCE_CACHE", 1);
            f339076c = hVar2;
            h hVar3 = new h("DATA_CACHE", 2);
            f339077d = hVar3;
            h hVar4 = new h("SOURCE", 3);
            f339078e = hVar4;
            h hVar5 = new h("ENCODE", 4);
            f339079f = hVar5;
            h hVar6 = new h("FINISHED", 5);
            f339080g = hVar6;
            f339081h = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
        }

        public h() {
            throw null;
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f339081h.clone();
        }
    }

    public j(m.c cVar, y.a aVar) {
        this.f339038e = cVar;
        this.f339039f = aVar;
    }

    @Override // com.bumptech.glide.util.pool.a.d
    @N
    public final com.bumptech.glide.util.pool.e a() {
        return this.f339037d;
    }

    @Override // com.bumptech.glide.load.engine.h.a
    public final void b(com.bumptech.glide.load.h hVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class<?> clsA = dVar.a();
        glideException.f338904c = hVar;
        glideException.f338905d = dataSource;
        glideException.f338906e = clsA;
        this.f339036c.add(glideException);
        if (Thread.currentThread() == this.f339055v) {
            m();
        } else {
            this.f339053t = g.f339072c;
            this.f339050q.h(this);
        }
    }

    @Override // com.bumptech.glide.load.engine.h.a
    public final void c(com.bumptech.glide.load.h hVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, com.bumptech.glide.load.h hVar2) {
        this.f339056w = hVar;
        this.f339058y = obj;
        this.f339031A = dVar;
        this.f339059z = dataSource;
        this.f339057x = hVar2;
        if (Thread.currentThread() == this.f339055v) {
            f();
        } else {
            this.f339053t = g.f339073d;
            this.f339050q.h(this);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(@N j<?> jVar) {
        j<?> jVar2 = jVar;
        int iOrdinal = this.f339044k.ordinal() - jVar2.f339044k.ordinal();
        return iOrdinal == 0 ? this.f339051r - jVar2.f339051r : iOrdinal;
    }

    public final <Data> w<R> d(com.bumptech.glide.load.data.d<?> dVar, Data data, DataSource dataSource) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i12 = com.bumptech.glide.util.g.f339641a;
            SystemClock.elapsedRealtimeNanos();
            w<R> wVarE = e(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                wVarE.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.f339045l);
                Thread.currentThread().getName();
            }
            return wVarE;
        } finally {
            dVar.b();
        }
    }

    public final <Data> w<R> e(Data data, DataSource dataSource) {
        com.bumptech.glide.load.data.e<?> eVarB;
        u<Data, ?, R> uVarC = this.f339035b.c(data.getClass());
        com.bumptech.glide.load.k kVar = this.f339049p;
        boolean z12 = dataSource == DataSource.f338830e || this.f339035b.f339030r;
        com.bumptech.glide.load.j<Boolean> jVar = com.bumptech.glide.load.resource.bitmap.o.f339378i;
        Boolean bool = (Boolean) kVar.c(jVar);
        if (bool == null || (bool.booleanValue() && !z12)) {
            kVar = new com.bumptech.glide.load.k();
            kVar.f339200b.g(this.f339049p.f339200b);
            kVar.f339200b.put(jVar, Boolean.valueOf(z12));
        }
        com.bumptech.glide.load.k kVar2 = kVar;
        com.bumptech.glide.load.data.f fVar = this.f339042i.f338742b.f338674e;
        synchronized (fVar) {
            try {
                e.a<?> aVar = (e.a) fVar.f338857a.get(data.getClass());
                if (aVar == null) {
                    Iterator it = fVar.f338857a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        e.a<?> aVar2 = (e.a) it.next();
                        if (aVar2.a().isAssignableFrom(data.getClass())) {
                            aVar = aVar2;
                            break;
                        }
                    }
                }
                if (aVar == null) {
                    aVar = com.bumptech.glide.load.data.f.f338856b;
                }
                eVarB = aVar.b(data);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            int i12 = this.f339046m;
            int i13 = this.f339047n;
            c cVar = new c(dataSource);
            y.a<List<Throwable>> aVar3 = uVarC.f339162a;
            List<Throwable> listB = aVar3.b();
            com.bumptech.glide.util.k.c(listB, "Argument must not be null");
            List<Throwable> list = listB;
            try {
                return uVarC.a(eVarB, kVar2, i12, i13, cVar, list);
            } finally {
                aVar3.a(list);
            }
        } finally {
            eVarB.b();
        }
    }

    public final void f() {
        v<?> vVarD;
        boolean zA2;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.f339058y + ", cache key: " + this.f339056w + ", fetcher: " + this.f339031A;
            int i12 = com.bumptech.glide.util.g.f339641a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.f339045l);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        v<?> vVarB = null;
        try {
            vVarD = d(this.f339031A, this.f339058y, this.f339059z);
        } catch (GlideException e12) {
            com.bumptech.glide.load.h hVar = this.f339057x;
            DataSource dataSource = this.f339059z;
            e12.f338904c = hVar;
            e12.f338905d = dataSource;
            e12.f338906e = null;
            this.f339036c.add(e12);
            vVarD = null;
        }
        if (vVarD == null) {
            m();
            return;
        }
        DataSource dataSource2 = this.f339059z;
        if (vVarD instanceof s) {
            ((s) vVarD).a();
        }
        if (this.f339040g.f339067c != null) {
            vVarB = v.f339165f.b();
            com.bumptech.glide.util.k.c(vVarB, "Argument must not be null");
            vVarB.f339169e = false;
            vVarB.f339168d = true;
            vVarB.f339167c = vVarD;
            vVarD = vVarB;
        }
        o();
        n<?> nVar = this.f339050q;
        synchronized (nVar) {
            nVar.f339130o = vVarD;
            nVar.f339131p = dataSource2;
        }
        synchronized (nVar) {
            try {
                nVar.f339118c.b();
                if (nVar.f339137v) {
                    nVar.f339130o.c();
                    nVar.f();
                } else {
                    if (nVar.f339117b.f339144b.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (nVar.f339132q) {
                        throw new IllegalStateException("Already have resource");
                    }
                    n.c cVar = nVar.f339121f;
                    w<?> wVar = nVar.f339130o;
                    boolean z12 = nVar.f339128m;
                    com.bumptech.glide.load.h hVar2 = nVar.f339127l;
                    m mVar = nVar.f339119d;
                    cVar.getClass();
                    nVar.f339135t = new r<>(wVar, z12, true, hVar2, mVar);
                    nVar.f339132q = true;
                    n.e eVar = nVar.f339117b;
                    eVar.getClass();
                    ArrayList arrayList = new ArrayList(eVar.f339144b);
                    nVar.d(arrayList.size() + 1);
                    nVar.f339122g.c(nVar, nVar.f339127l, nVar.f339135t);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        n.d dVar = (n.d) it.next();
                        dVar.f339143b.execute(new n.b(dVar.f339142a));
                    }
                    nVar.c();
                }
            } finally {
            }
        }
        this.f339052s = h.f339079f;
        try {
            d<?> dVar2 = this.f339040g;
            if (dVar2.f339067c != null) {
                m.c cVar2 = this.f339038e;
                com.bumptech.glide.load.k kVar = this.f339049p;
                dVar2.getClass();
                try {
                    cVar2.a().a(dVar2.f339065a, new com.bumptech.glide.load.engine.g(dVar2.f339066b, dVar2.f339067c, kVar));
                    dVar2.f339067c.d();
                } catch (Throwable th2) {
                    dVar2.f339067c.d();
                    throw th2;
                }
            }
            f fVar = this.f339041h;
            synchronized (fVar) {
                fVar.f339069b = true;
                zA2 = fVar.a();
            }
            if (zA2) {
                k();
            }
        } finally {
            if (vVarB != null) {
                vVarB.d();
            }
        }
    }

    public final com.bumptech.glide.load.engine.h h() {
        int iOrdinal = this.f339052s.ordinal();
        i<R> iVar = this.f339035b;
        if (iOrdinal == 1) {
            return new x(iVar, this);
        }
        if (iOrdinal == 2) {
            return new com.bumptech.glide.load.engine.e(iVar.a(), iVar, this);
        }
        if (iOrdinal == 3) {
            return new B(iVar, this);
        }
        if (iOrdinal == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f339052s);
    }

    public final h i(h hVar) {
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 0) {
            boolean zB2 = this.f339048o.b();
            h hVar2 = h.f339076c;
            return zB2 ? hVar2 : i(hVar2);
        }
        if (iOrdinal == 1) {
            boolean zA2 = this.f339048o.a();
            h hVar3 = h.f339077d;
            return zA2 ? hVar3 : i(hVar3);
        }
        h hVar4 = h.f339080g;
        if (iOrdinal == 2) {
            return h.f339078e;
        }
        if (iOrdinal == 3 || iOrdinal == 5) {
            return hVar4;
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    public final void j() {
        boolean zA2;
        o();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f339036c));
        n<?> nVar = this.f339050q;
        synchronized (nVar) {
            nVar.f339133r = glideException;
        }
        synchronized (nVar) {
            try {
                nVar.f339118c.b();
                if (nVar.f339137v) {
                    nVar.f();
                } else {
                    if (nVar.f339117b.f339144b.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (nVar.f339134s) {
                        throw new IllegalStateException("Already failed once");
                    }
                    nVar.f339134s = true;
                    com.bumptech.glide.load.h hVar = nVar.f339127l;
                    n.e eVar = nVar.f339117b;
                    eVar.getClass();
                    ArrayList arrayList = new ArrayList(eVar.f339144b);
                    nVar.d(arrayList.size() + 1);
                    nVar.f339122g.c(nVar, hVar, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        n.d dVar = (n.d) it.next();
                        dVar.f339143b.execute(new n.a(dVar.f339142a));
                    }
                    nVar.c();
                }
            } finally {
            }
        }
        f fVar = this.f339041h;
        synchronized (fVar) {
            fVar.f339070c = true;
            zA2 = fVar.a();
        }
        if (zA2) {
            k();
        }
    }

    public final void k() {
        f fVar = this.f339041h;
        synchronized (fVar) {
            fVar.f339069b = false;
            fVar.f339068a = false;
            fVar.f339070c = false;
        }
        d<?> dVar = this.f339040g;
        dVar.f339065a = null;
        dVar.f339066b = null;
        dVar.f339067c = null;
        i<R> iVar = this.f339035b;
        iVar.f339015c = null;
        iVar.f339016d = null;
        iVar.f339026n = null;
        iVar.f339019g = null;
        iVar.f339023k = null;
        iVar.f339021i = null;
        iVar.f339027o = null;
        iVar.f339022j = null;
        iVar.f339028p = null;
        iVar.f339013a.clear();
        iVar.f339024l = false;
        iVar.f339014b.clear();
        iVar.f339025m = false;
        this.f339033C = false;
        this.f339042i = null;
        this.f339043j = null;
        this.f339049p = null;
        this.f339044k = null;
        this.f339045l = null;
        this.f339050q = null;
        this.f339052s = null;
        this.f339032B = null;
        this.f339055v = null;
        this.f339056w = null;
        this.f339058y = null;
        this.f339059z = null;
        this.f339031A = null;
        this.f339034D = false;
        this.f339036c.clear();
        this.f339039f.a(this);
    }

    public final void l() {
        this.f339053t = g.f339072c;
        this.f339050q.h(this);
    }

    public final void m() {
        this.f339055v = Thread.currentThread();
        int i12 = com.bumptech.glide.util.g.f339641a;
        SystemClock.elapsedRealtimeNanos();
        boolean zA2 = false;
        while (!this.f339034D && this.f339032B != null && !(zA2 = this.f339032B.a())) {
            this.f339052s = i(this.f339052s);
            this.f339032B = h();
            if (this.f339052s == h.f339078e) {
                l();
                return;
            }
        }
        if ((this.f339052s == h.f339080g || this.f339034D) && !zA2) {
            j();
        }
    }

    public final void n() {
        int iOrdinal = this.f339053t.ordinal();
        if (iOrdinal == 0) {
            this.f339052s = i(h.f339075b);
            this.f339032B = h();
            m();
        } else if (iOrdinal == 1) {
            m();
        } else if (iOrdinal == 2) {
            f();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f339053t);
        }
    }

    public final void o() {
        this.f339037d.b();
        if (this.f339033C) {
            throw new IllegalStateException("Already notified", this.f339036c.isEmpty() ? null : (Throwable) androidx.appcompat.app.r.j(1, this.f339036c));
        }
        this.f339033C = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.f339031A;
        try {
            try {
                if (this.f339034D) {
                    j();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                n();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (Throwable th2) {
                if (dVar != null) {
                    dVar.b();
                }
                throw th2;
            }
        } catch (com.bumptech.glide.load.engine.d e12) {
            throw e12;
        } catch (Throwable th3) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Objects.toString(this.f339052s);
            }
            if (this.f339052s != h.f339079f) {
                this.f339036c.add(th3);
                j();
            }
            if (!this.f339034D) {
                throw th3;
            }
            throw th3;
        }
    }
}
