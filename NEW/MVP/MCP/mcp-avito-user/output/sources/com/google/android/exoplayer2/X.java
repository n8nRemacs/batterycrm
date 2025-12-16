package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.AbstractC36538a;
import com.google.android.exoplayer2.source.C36554q;
import com.google.android.exoplayer2.source.C36555s;
import com.google.android.exoplayer2.source.C36556t;
import com.google.android.exoplayer2.source.C36557u;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.source.O;
import com.google.android.exoplayer2.source.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: MediaSourceList.java */
/* loaded from: classes6.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.analytics.p f343711a;

    /* renamed from: e, reason: collision with root package name */
    public final d f343715e;

    /* renamed from: f, reason: collision with root package name */
    public final A.a f343716f;

    /* renamed from: g, reason: collision with root package name */
    public final e.a f343717g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap<c, b> f343718h;

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f343719i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f343721k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public com.google.android.exoplayer2.upstream.M f343722l;

    /* renamed from: j, reason: collision with root package name */
    public com.google.android.exoplayer2.source.O f343720j = new O.a();

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap<InterfaceC36559w, c> f343713c = new IdentityHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f343714d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f343712b = new ArrayList();

    /* compiled from: MediaSourceList.java */
    public final class a implements com.google.android.exoplayer2.source.A, com.google.android.exoplayer2.drm.e {

        /* renamed from: b, reason: collision with root package name */
        public final c f343723b;

        /* renamed from: c, reason: collision with root package name */
        public A.a f343724c;

        /* renamed from: d, reason: collision with root package name */
        public e.a f343725d;

        public a(c cVar) {
            this.f343724c = X.this.f343716f;
            this.f343725d = X.this.f343717g;
            this.f343723b = cVar;
        }

        public final boolean a(int i12, @j.P y.b bVar) {
            c cVar = this.f343723b;
            y.b bVarB = null;
            if (bVar != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= cVar.f343732c.size()) {
                        break;
                    }
                    if (((y.b) cVar.f343732c.get(i13)).f346699d == bVar.f346699d) {
                        Object obj = cVar.f343731b;
                        int i14 = AbstractC36502a.f343739e;
                        bVarB = bVar.b(Pair.create(obj, bVar.f346696a));
                        break;
                    }
                    i13++;
                }
                if (bVarB == null) {
                    return false;
                }
            }
            int i15 = i12 + cVar.f343733d;
            A.a aVar = this.f343724c;
            int i16 = aVar.f345902a;
            X x12 = X.this;
            if (i16 != i15 || !com.google.android.exoplayer2.util.U.a(aVar.f345903b, bVarB)) {
                this.f343724c = new A.a(x12.f343716f.f345904c, i15, bVarB);
            }
            e.a aVar2 = this.f343725d;
            if (aVar2.f344336a != i15 || !com.google.android.exoplayer2.util.U.a(aVar2.f344337b, bVarB)) {
                this.f343725d = new e.a(x12.f343717g.f344338c, i15, bVarB);
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.source.A
        public final void d(int i12, @j.P y.b bVar, C36557u c36557u) {
            if (a(i12, bVar)) {
                this.f343724c.m(c36557u);
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void e(int i12, @j.P y.b bVar, int i13) {
            if (a(i12, bVar)) {
                this.f343725d.d(i13);
            }
        }

        @Override // com.google.android.exoplayer2.source.A
        public final void f(int i12, @j.P y.b bVar, C36554q c36554q, C36557u c36557u, IOException iOException, boolean z12) {
            if (a(i12, bVar)) {
                this.f343724c.j(c36554q, c36557u, iOException, z12);
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void g(int i12, @j.P y.b bVar) {
            if (a(i12, bVar)) {
                this.f343725d.c();
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void i(int i12, @j.P y.b bVar, Exception exc) {
            if (a(i12, bVar)) {
                this.f343725d.e(exc);
            }
        }

        @Override // com.google.android.exoplayer2.source.A
        public final void k(int i12, @j.P y.b bVar, C36554q c36554q, C36557u c36557u) {
            if (a(i12, bVar)) {
                this.f343724c.g(c36554q, c36557u);
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void l(int i12, @j.P y.b bVar) {
            if (a(i12, bVar)) {
                this.f343725d.f();
            }
        }

        @Override // com.google.android.exoplayer2.source.A
        public final void m(int i12, @j.P y.b bVar, C36554q c36554q, C36557u c36557u) {
            if (a(i12, bVar)) {
                this.f343724c.e(c36554q, c36557u);
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void p(int i12, @j.P y.b bVar) {
            if (a(i12, bVar)) {
                this.f343725d.b();
            }
        }

        @Override // com.google.android.exoplayer2.source.A
        public final void q(int i12, @j.P y.b bVar, C36557u c36557u) {
            if (a(i12, bVar)) {
                this.f343724c.c(c36557u);
            }
        }

        @Override // com.google.android.exoplayer2.source.A
        public final void r(int i12, @j.P y.b bVar, C36554q c36554q, C36557u c36557u) {
            if (a(i12, bVar)) {
                this.f343724c.l(c36554q, c36557u);
            }
        }
    }

    /* compiled from: MediaSourceList.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.y f343727a;

        /* renamed from: b, reason: collision with root package name */
        public final W f343728b;

        /* renamed from: c, reason: collision with root package name */
        public final a f343729c;

        public b(com.google.android.exoplayer2.source.y yVar, W w12, a aVar) {
            this.f343727a = yVar;
            this.f343728b = w12;
            this.f343729c = aVar;
        }
    }

    /* compiled from: MediaSourceList.java */
    public static final class c implements V {

        /* renamed from: a, reason: collision with root package name */
        public final C36556t f343730a;

        /* renamed from: d, reason: collision with root package name */
        public int f343733d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f343734e;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f343732c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f343731b = new Object();

        public c(com.google.android.exoplayer2.source.y yVar, boolean z12) {
            this.f343730a = new C36556t(yVar, z12);
        }

        @Override // com.google.android.exoplayer2.V
        public final Object c() {
            return this.f343731b;
        }

        @Override // com.google.android.exoplayer2.V
        public final s0 d() {
            return this.f343730a.f346679p;
        }
    }

    /* compiled from: MediaSourceList.java */
    public interface d {
    }

    public X(d dVar, com.google.android.exoplayer2.analytics.a aVar, Handler handler, com.google.android.exoplayer2.analytics.p pVar) {
        this.f343711a = pVar;
        this.f343715e = dVar;
        A.a aVar2 = new A.a();
        this.f343716f = aVar2;
        e.a aVar3 = new e.a();
        this.f343717g = aVar3;
        this.f343718h = new HashMap<>();
        this.f343719i = new HashSet();
        aVar2.a(handler, aVar);
        aVar3.a(handler, aVar);
    }

    public final s0 a(int i12, List<c> list, com.google.android.exoplayer2.source.O o12) {
        if (!list.isEmpty()) {
            this.f343720j = o12;
            for (int i13 = i12; i13 < list.size() + i12; i13++) {
                c cVar = list.get(i13 - i12);
                ArrayList arrayList = this.f343712b;
                if (i13 > 0) {
                    c cVar2 = (c) arrayList.get(i13 - 1);
                    cVar.f343733d = cVar2.f343730a.f346679p.f346655c.o() + cVar2.f343733d;
                    cVar.f343734e = false;
                    cVar.f343732c.clear();
                } else {
                    cVar.f343733d = 0;
                    cVar.f343734e = false;
                    cVar.f343732c.clear();
                }
                int iO2 = cVar.f343730a.f346679p.f346655c.o();
                for (int i14 = i13; i14 < arrayList.size(); i14++) {
                    ((c) arrayList.get(i14)).f343733d += iO2;
                }
                arrayList.add(i13, cVar);
                this.f343714d.put(cVar.f343731b, cVar);
                if (this.f343721k) {
                    e(cVar);
                    if (this.f343713c.isEmpty()) {
                        this.f343719i.add(cVar);
                    } else {
                        b bVar = this.f343718h.get(cVar);
                        if (bVar != null) {
                            bVar.f343727a.w(bVar.f343728b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final s0 b() {
        ArrayList arrayList = this.f343712b;
        if (arrayList.isEmpty()) {
            return s0.f345869b;
        }
        int iO2 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            c cVar = (c) arrayList.get(i12);
            cVar.f343733d = iO2;
            iO2 += cVar.f343730a.f346679p.f346655c.o();
        }
        return new f0(arrayList, this.f343720j);
    }

    public final void c() {
        Iterator it = this.f343719i.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f343732c.isEmpty()) {
                b bVar = this.f343718h.get(cVar);
                if (bVar != null) {
                    bVar.f343727a.w(bVar.f343728b);
                }
                it.remove();
            }
        }
    }

    public final void d(c cVar) {
        if (cVar.f343734e && cVar.f343732c.isEmpty()) {
            b bVarRemove = this.f343718h.remove(cVar);
            bVarRemove.getClass();
            W w12 = bVarRemove.f343728b;
            com.google.android.exoplayer2.source.y yVar = bVarRemove.f343727a;
            yVar.n(w12);
            a aVar = bVarRemove.f343729c;
            yVar.o(aVar);
            yVar.x(aVar);
            this.f343719i.remove(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.exoplayer2.W, com.google.android.exoplayer2.source.y$c] */
    public final void e(c cVar) {
        C36556t c36556t = cVar.f343730a;
        ?? r12 = new y.c() { // from class: com.google.android.exoplayer2.W
            @Override // com.google.android.exoplayer2.source.y.c
            public final void v(AbstractC36538a abstractC36538a, s0 s0Var) {
                ((G) this.f343710b.f343715e).f343416i.f(22);
            }
        };
        a aVar = new a(cVar);
        this.f343718h.put(cVar, new b(c36556t, r12, aVar));
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        c36556t.getClass();
        c36556t.f346160d.a(handler, aVar);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        c36556t.f346161e.a(new Handler(looperMyLooper2, null), aVar);
        c36556t.s(r12, this.f343722l, this.f343711a);
    }

    public final void f(InterfaceC36559w interfaceC36559w) {
        IdentityHashMap<InterfaceC36559w, c> identityHashMap = this.f343713c;
        c cVarRemove = identityHashMap.remove(interfaceC36559w);
        cVarRemove.getClass();
        cVarRemove.f343730a.t(interfaceC36559w);
        cVarRemove.f343732c.remove(((C36555s) interfaceC36559w).f346666b);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(cVarRemove);
    }

    public final void g(int i12, int i13) {
        for (int i14 = i13 - 1; i14 >= i12; i14--) {
            ArrayList arrayList = this.f343712b;
            c cVar = (c) arrayList.remove(i14);
            this.f343714d.remove(cVar.f343731b);
            int i15 = -cVar.f343730a.f346679p.f346655c.o();
            for (int i16 = i14; i16 < arrayList.size(); i16++) {
                ((c) arrayList.get(i16)).f343733d += i15;
            }
            cVar.f343734e = true;
            if (this.f343721k) {
                d(cVar);
            }
        }
    }
}
