package com.avito.android.calltracking.di;

import am.InterfaceC19907a;
import android.content.res.Resources;
import cm.InterfaceC27217c;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.calltracking.C29284l;
import com.avito.android.calltracking.C29288p;
import com.avito.android.calltracking.CalltrackingFragment;
import com.avito.android.calltracking.CalltrackingScreenType;
import com.avito.android.calltracking.F;
import com.avito.android.calltracking.H;
import com.avito.android.calltracking.I;
import com.avito.android.calltracking.InterfaceC29279g;
import com.avito.android.calltracking.InterfaceC29287o;
import com.avito.android.calltracking.InterfaceC29293v;
import com.avito.android.calltracking.M;
import com.avito.android.calltracking.O;
import com.avito.android.calltracking.di.e;
import com.avito.android.calltracking.di.k;
import com.avito.android.calltracking.x;
import com.avito.android.calltracking.y;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCalltrackingFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class q {

    /* compiled from: DaggerCalltrackingFragmentComponent.java */
    public static final class b implements com.avito.android.calltracking.di.e {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC19907a> f113678a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f113679b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f113680c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC29293v> f113681d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.calltracking_core.f> f113682e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f113683f;

        /* renamed from: g, reason: collision with root package name */
        public final u<E> f113684g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f113685h;

        /* renamed from: i, reason: collision with root package name */
        public final O f113686i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f113687j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC27217c> f113688k;

        /* renamed from: l, reason: collision with root package name */
        public final u<M> f113689l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.jakewharton.rxrelay3.c<I>> f113690m;

        /* renamed from: n, reason: collision with root package name */
        public final u<F> f113691n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.calltracking.item.a> f113692o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.calltracking.item.k f113693p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f113694q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f113695r;

        /* renamed from: s, reason: collision with root package name */
        public final u<y> f113696s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f113697t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC29279g> f113698u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f113699v;

        /* compiled from: DaggerCalltrackingFragmentComponent.java */
        public static final class a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.calltracking.di.f f113700a;

            public a(com.avito.android.calltracking.di.f fVar) {
                this.f113700a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f113700a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerCalltrackingFragmentComponent.java */
        /* renamed from: com.avito.android.calltracking.di.q$b$b, reason: collision with other inner class name */
        public static final class C3330b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.calltracking.di.f f113701a;

            public C3330b(com.avito.android.calltracking.di.f fVar) {
                this.f113701a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f113701a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCalltrackingFragmentComponent.java */
        public static final class c implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.calltracking.di.f f113702a;

            public c(com.avito.android.calltracking.di.f fVar) {
                this.f113702a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f113702a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerCalltrackingFragmentComponent.java */
        public static final class d implements u<com.avito.android.calltracking_core.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.calltracking.di.f f113703a;

            public d(com.avito.android.calltracking.di.f fVar) {
                this.f113703a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.calltracking_core.f fVarOc = this.f113703a.oc();
                t.c(fVarOc);
                return fVarOc;
            }
        }

        /* compiled from: DaggerCalltrackingFragmentComponent.java */
        public static final class e implements u<InterfaceC19907a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.calltracking.di.f f113704a;

            public e(com.avito.android.calltracking.di.f fVar) {
                this.f113704a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19907a interfaceC19907aZh = this.f113704a.zh();
                t.c(interfaceC19907aZh);
                return interfaceC19907aZh;
            }
        }

        /* compiled from: DaggerCalltrackingFragmentComponent.java */
        public static final class f implements u<InterfaceC27217c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.calltracking.di.d f113705a;

            public f(com.avito.android.calltracking.di.d dVar) {
                this.f113705a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC27217c interfaceC27217cRi = this.f113705a.Ri();
                t.c(interfaceC27217cRi);
                return interfaceC27217cRi;
            }
        }

        /* compiled from: DaggerCalltrackingFragmentComponent.java */
        public static final class g implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f113706a;

            public g(cv.b bVar) {
                this.f113706a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f113706a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCalltrackingFragmentComponent.java */
        public static final class h implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.calltracking.di.f f113707a;

            public h(com.avito.android.calltracking.di.f fVar) {
                this.f113707a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f113707a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerCalltrackingFragmentComponent.java */
        public static final class i implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.calltracking.di.f f113708a;

            public i(com.avito.android.calltracking.di.f fVar) {
                this.f113708a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f113708a.o();
            }
        }

        public b(com.avito.android.calltracking.di.d dVar, com.avito.android.calltracking.di.f fVar, cv.b bVar, Resources resources, InterfaceC29287o interfaceC29287o, CalltrackingScreenType calltrackingScreenType, a aVar) {
            e eVar = new e(fVar);
            i iVar = new i(fVar);
            h hVar = new h(fVar);
            this.f113680c = hVar;
            this.f113681d = dagger.internal.g.d(new x(eVar, iVar, hVar));
            this.f113682e = new d(fVar);
            this.f113683f = new g(bVar);
            this.f113686i = new O(dagger.internal.l.a(calltrackingScreenType), this.f113681d, this.f113682e, this.f113680c, this.f113683f, new a(fVar), new C3330b(fVar));
            dagger.internal.l lVarA = dagger.internal.l.a(interfaceC29287o);
            this.f113687j = lVarA;
            this.f113689l = dagger.internal.g.d(new l(this.f113686i, lVarA, new f(dVar)));
            this.f113690m = dagger.internal.g.d(k.a.f113670a);
            u<F> uVarD = dagger.internal.g.d(new H(dagger.internal.l.a(resources)));
            this.f113691n = uVarD;
            u<com.avito.android.calltracking.item.a> uVarD2 = dagger.internal.g.d(new com.avito.android.calltracking.item.c(uVarD));
            this.f113692o = uVarD2;
            com.avito.android.calltracking.item.k kVar = new com.avito.android.calltracking.item.k(uVarD2, this.f113690m);
            this.f113693p = kVar;
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new j(new com.avito.android.calltracking.item.g(kVar)));
            this.f113694q = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new com.avito.android.calltracking.di.i(uVarD3));
            this.f113695r = uVarD4;
            this.f113696s = dagger.internal.g.d(new com.avito.android.calltracking.E(this.f113687j, uVarD4, this.f113689l));
            this.f113698u = dagger.internal.g.d(new C29284l(this.f113689l, this.f113687j, new c(fVar), this.f113690m, this.f113693p));
            this.f113699v = dagger.internal.g.d(new com.avito.android.calltracking.di.h(this.f113695r, this.f113694q));
        }

        @Override // com.avito.android.calltracking.di.e
        public final void a(CalltrackingFragment calltrackingFragment) {
            calltrackingFragment.f113555n0 = this.f113689l.get();
            calltrackingFragment.f113556o0 = this.f113690m.get();
            calltrackingFragment.f113557p0 = this.f113696s.get();
            calltrackingFragment.f113558q0 = this.f113698u.get();
            calltrackingFragment.f113559r0 = this.f113699v.get();
        }
    }

    /* compiled from: DaggerCalltrackingFragmentComponent.java */
    public static final class c implements e.a {
        public c() {
        }

        @Override // com.avito.android.calltracking.di.e.a
        public final e a(d dVar, f fVar, InterfaceC39417a interfaceC39417a, Resources resources, C29288p c29288p, CalltrackingScreenType calltrackingScreenType) {
            interfaceC39417a.getClass();
            calltrackingScreenType.getClass();
            return new b(dVar, fVar, interfaceC39417a, resources, c29288p, calltrackingScreenType, null);
        }
    }

    public static e.a a() {
        return new c();
    }
}
