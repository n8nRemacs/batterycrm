package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.util.InterfaceC23123n;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.AbstractC23150a;
import androidx.media3.exoplayer.source.C23167s;
import androidx.media3.exoplayer.source.C23169u;
import androidx.media3.exoplayer.source.C23170v;
import androidx.media3.exoplayer.source.C23171w;
import androidx.media3.exoplayer.source.InterfaceC23174z;
import androidx.media3.exoplayer.source.S;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: MediaSourceList.java */
/* loaded from: classes.dex */
final class U {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.analytics.w f48566a;

    /* renamed from: e, reason: collision with root package name */
    public final d f48570e;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.media3.exoplayer.analytics.a f48573h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC23123n f48574i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f48576k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public androidx.media3.datasource.B f48577l;

    /* renamed from: j, reason: collision with root package name */
    public androidx.media3.exoplayer.source.S f48575j = new S.a();

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap<InterfaceC23174z, c> f48568c = new IdentityHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f48569d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f48567b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap<c, b> f48571f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f48572g = new HashSet();

    /* compiled from: MediaSourceList.java */
    public final class a implements androidx.media3.exoplayer.source.D, androidx.media3.exoplayer.drm.f {

        /* renamed from: b, reason: collision with root package name */
        public final c f48578b;

        public a(c cVar) {
            this.f48578b = cVar;
        }

        @Override // androidx.media3.exoplayer.drm.f
        public final void A(int i12, @j.P A.b bVar, final int i13) {
            final Pair<Integer, A.b> pairA = a(i12, bVar);
            if (pairA != null) {
                U.this.f48574i.d(new Runnable() { // from class: androidx.media3.exoplayer.S
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.analytics.a aVar = U.this.f48573h;
                        Pair pair = pairA;
                        aVar.A(((Integer) pair.first).intValue(), (A.b) pair.second, i13);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.f
        public final void B(int i12, @j.P A.b bVar, Exception exc) {
            Pair<Integer, A.b> pairA = a(i12, bVar);
            if (pairA != null) {
                U.this.f48574i.d(new L(this, pairA, exc, 1));
            }
        }

        @j.P
        public final Pair<Integer, A.b> a(int i12, @j.P A.b bVar) {
            A.b bVarB;
            c cVar = this.f48578b;
            A.b bVar2 = null;
            if (bVar != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= cVar.f48585c.size()) {
                        bVarB = null;
                        break;
                    }
                    if (((A.b) cVar.f48585c.get(i13)).f47215d == bVar.f47215d) {
                        Object obj = cVar.f48584b;
                        int i14 = AbstractC23132a.f48622i;
                        bVarB = bVar.b(Pair.create(obj, bVar.f47212a));
                        break;
                    }
                    i13++;
                }
                if (bVarB == null) {
                    return null;
                }
                bVar2 = bVarB;
            }
            return Pair.create(Integer.valueOf(i12 + cVar.f48586d), bVar2);
        }

        @Override // androidx.media3.exoplayer.drm.f
        public final void f(int i12, @j.P A.b bVar) {
            Pair<Integer, A.b> pairA = a(i12, bVar);
            if (pairA != null) {
                U.this.f48574i.d(new Q(this, pairA, 2));
            }
        }

        @Override // androidx.media3.exoplayer.source.D
        public final void h(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
            Pair<Integer, A.b> pairA = a(i12, bVar);
            if (pairA != null) {
                U.this.f48574i.d(new P(this, pairA, c23167s, c23171w, 0));
            }
        }

        @Override // androidx.media3.exoplayer.drm.f
        public final void l(int i12, @j.P A.b bVar) {
            Pair<Integer, A.b> pairA = a(i12, bVar);
            if (pairA != null) {
                U.this.f48574i.d(new Q(this, pairA, 0));
            }
        }

        @Override // androidx.media3.exoplayer.source.D
        public final void n(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
            Pair<Integer, A.b> pairA = a(i12, bVar);
            if (pairA != null) {
                U.this.f48574i.d(new P(this, pairA, c23167s, c23171w, 2));
            }
        }

        @Override // androidx.media3.exoplayer.drm.f
        public final void o(int i12, @j.P A.b bVar) {
            Pair<Integer, A.b> pairA = a(i12, bVar);
            if (pairA != null) {
                U.this.f48574i.d(new Q(this, pairA, 1));
            }
        }

        @Override // androidx.media3.exoplayer.source.D
        public final void r(int i12, @j.P A.b bVar, final C23167s c23167s, final C23171w c23171w, final IOException iOException, final boolean z12) {
            final Pair<Integer, A.b> pairA = a(i12, bVar);
            if (pairA != null) {
                U.this.f48574i.d(new Runnable() { // from class: androidx.media3.exoplayer.T
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.analytics.a aVar = U.this.f48573h;
                        Pair pair = pairA;
                        aVar.r(((Integer) pair.first).intValue(), (A.b) pair.second, c23167s, c23171w, iOException, z12);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.D
        public final void u(int i12, @j.P A.b bVar, C23171w c23171w) {
            Pair<Integer, A.b> pairA = a(i12, bVar);
            if (pairA != null) {
                U.this.f48574i.d(new L(this, pairA, c23171w, 2));
            }
        }

        @Override // androidx.media3.exoplayer.source.D
        public final void x(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
            Pair<Integer, A.b> pairA = a(i12, bVar);
            if (pairA != null) {
                U.this.f48574i.d(new P(this, pairA, c23167s, c23171w, 1));
            }
        }
    }

    /* compiled from: MediaSourceList.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.A f48580a;

        /* renamed from: b, reason: collision with root package name */
        public final O f48581b;

        /* renamed from: c, reason: collision with root package name */
        public final a f48582c;

        public b(androidx.media3.exoplayer.source.A a12, O o12, a aVar) {
            this.f48580a = a12;
            this.f48581b = o12;
            this.f48582c = aVar;
        }
    }

    /* compiled from: MediaSourceList.java */
    public static final class c implements N {

        /* renamed from: a, reason: collision with root package name */
        public final C23170v f48583a;

        /* renamed from: d, reason: collision with root package name */
        public int f48586d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f48587e;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f48585c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f48584b = new Object();

        public c(androidx.media3.exoplayer.source.A a12, boolean z12) {
            this.f48583a = new C23170v(a12, z12);
        }

        @Override // androidx.media3.exoplayer.N
        public final Object c() {
            return this.f48584b;
        }

        @Override // androidx.media3.exoplayer.N
        public final androidx.media3.common.P d() {
            return this.f48583a.f49843p;
        }
    }

    /* compiled from: MediaSourceList.java */
    public interface d {
    }

    public U(d dVar, androidx.media3.exoplayer.analytics.a aVar, InterfaceC23123n interfaceC23123n, androidx.media3.exoplayer.analytics.w wVar) {
        this.f48566a = wVar;
        this.f48570e = dVar;
        this.f48573h = aVar;
        this.f48574i = interfaceC23123n;
    }

    public final androidx.media3.common.P a(int i12, List<c> list, androidx.media3.exoplayer.source.S s5) {
        if (!list.isEmpty()) {
            this.f48575j = s5;
            for (int i13 = i12; i13 < list.size() + i12; i13++) {
                c cVar = list.get(i13 - i12);
                ArrayList arrayList = this.f48567b;
                if (i13 > 0) {
                    c cVar2 = (c) arrayList.get(i13 - 1);
                    cVar.f48586d = cVar2.f48583a.f49843p.f49820g.w() + cVar2.f48586d;
                    cVar.f48587e = false;
                    cVar.f48585c.clear();
                } else {
                    cVar.f48586d = 0;
                    cVar.f48587e = false;
                    cVar.f48585c.clear();
                }
                int iW2 = cVar.f48583a.f49843p.f49820g.w();
                for (int i14 = i13; i14 < arrayList.size(); i14++) {
                    ((c) arrayList.get(i14)).f48586d += iW2;
                }
                arrayList.add(i13, cVar);
                this.f48569d.put(cVar.f48584b, cVar);
                if (this.f48576k) {
                    e(cVar);
                    if (this.f48568c.isEmpty()) {
                        this.f48572g.add(cVar);
                    } else {
                        b bVar = this.f48571f.get(cVar);
                        if (bVar != null) {
                            bVar.f48580a.i(bVar.f48581b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final androidx.media3.common.P b() {
        ArrayList arrayList = this.f48567b;
        if (arrayList.isEmpty()) {
            return androidx.media3.common.P.f47368b;
        }
        int iW2 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            c cVar = (c) arrayList.get(i12);
            cVar.f48586d = iW2;
            iW2 += cVar.f48583a.f49843p.f49820g.w();
        }
        return new a0(arrayList, this.f48575j);
    }

    public final void c() {
        Iterator it = this.f48572g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f48585c.isEmpty()) {
                b bVar = this.f48571f.get(cVar);
                if (bVar != null) {
                    bVar.f48580a.i(bVar.f48581b);
                }
                it.remove();
            }
        }
    }

    public final void d(c cVar) {
        if (cVar.f48587e && cVar.f48585c.isEmpty()) {
            b bVarRemove = this.f48571f.remove(cVar);
            bVarRemove.getClass();
            O o12 = bVarRemove.f48581b;
            androidx.media3.exoplayer.source.A a12 = bVarRemove.f48580a;
            a12.d(o12);
            a aVar = bVarRemove.f48582c;
            a12.p(aVar);
            a12.q(aVar);
            this.f48572g.remove(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.O, androidx.media3.exoplayer.source.A$c] */
    public final void e(c cVar) {
        C23170v c23170v = cVar.f48583a;
        ?? r12 = new A.c() { // from class: androidx.media3.exoplayer.O
            @Override // androidx.media3.exoplayer.source.A.c
            public final void m(AbstractC23150a abstractC23150a, androidx.media3.common.P p12) {
                ((E) this.f48548b.f48570e).f48450i.f(22);
            }
        };
        a aVar = new a(cVar);
        this.f48571f.put(cVar, new b(c23170v, r12, aVar));
        int i12 = androidx.media3.common.util.M.f47887a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        c23170v.c(new Handler(looperMyLooper, null), aVar);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        c23170v.f49715e.a(new Handler(looperMyLooper2, null), aVar);
        c23170v.s(r12, this.f48577l, this.f48566a);
    }

    public final void f(InterfaceC23174z interfaceC23174z) {
        IdentityHashMap<InterfaceC23174z, c> identityHashMap = this.f48568c;
        c cVarRemove = identityHashMap.remove(interfaceC23174z);
        cVarRemove.getClass();
        cVarRemove.f48583a.k(interfaceC23174z);
        cVarRemove.f48585c.remove(((C23169u) interfaceC23174z).f49831b);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(cVarRemove);
    }

    public final void g(int i12, int i13) {
        for (int i14 = i13 - 1; i14 >= i12; i14--) {
            ArrayList arrayList = this.f48567b;
            c cVar = (c) arrayList.remove(i14);
            this.f48569d.remove(cVar.f48584b);
            int i15 = -cVar.f48583a.f49843p.f49820g.w();
            for (int i16 = i14; i16 < arrayList.size(); i16++) {
                ((c) arrayList.get(i16)).f48586d += i15;
            }
            cVar.f48587e = true;
            if (this.f48576k) {
                d(cVar);
            }
        }
    }
}
