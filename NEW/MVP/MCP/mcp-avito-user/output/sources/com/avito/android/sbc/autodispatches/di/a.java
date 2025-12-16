package com.avito.android.sbc.autodispatches.di;

import Qo0.C14917b;
import Qo0.C14918c;
import Qo0.InterfaceC14919d;
import Xo0.InterfaceC17032a;
import com.avito.android.C30566f2;
import com.avito.android.sbc.autodispatches.InterfaceC34468d;
import com.avito.android.sbc.autodispatches.SbcAutoDispatchesFragment;
import com.avito.android.sbc.autodispatches.di.b;
import com.avito.android.sbc.autodispatches.m;
import com.avito.android.sbc.autodispatches.mvi.j;
import com.avito.android.sbc.autodispatches.mvi.l;
import com.avito.android.sbc.autodispatches.mvi.n;
import com.avito.android.sbc.autodispatches.w;
import com.avito.android.sbc.autodispatcheslist.AutoDispatchListInfo;
import com.avito.android.sbc.autodispatcheslist.SbcAutoDispatchesListFragment;
import com.avito.android.sbc.autodispatcheslist.adapter.c;
import com.avito.android.sbc.autodispatcheslist.adapter.h;
import com.avito.android.sbc.autodispatcheslist.adapter.i;
import com.avito.android.sbc.autodispatcheslist.adapter.q;
import com.avito.android.sbc.autodispatcheslist.mvi.f;
import com.avito.android.sbc.autodispatcheslist.mvi.k;
import com.avito.android.sbc.di.v;
import com.avito.android.sbc.di.x;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: DaggerSbcAutoDispatchesFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSbcAutoDispatchesFragmentComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.sbc.autodispatches.di.b.a
        public final com.avito.android.sbc.autodispatches.di.b a(com.avito.android.sbc.autodispatches.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, null);
        }
    }

    /* compiled from: DaggerSbcAutoDispatchesFragmentComponent.java */
    public static final class c implements com.avito.android.sbc.autodispatches.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f258850a;

        /* renamed from: b, reason: collision with root package name */
        public final c f258851b = this;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC34468d> f258852c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC17032a> f258853d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f258854e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f258855f;

        /* renamed from: g, reason: collision with root package name */
        public final u<m> f258856g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.sbc.autodispatches.mvi.e f258857h;

        /* renamed from: i, reason: collision with root package name */
        public final n f258858i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Locale> f258859j;

        /* renamed from: k, reason: collision with root package name */
        public final u<C30566f2> f258860k;

        /* compiled from: DaggerSbcAutoDispatchesFragmentComponent.java */
        /* renamed from: com.avito.android.sbc.autodispatches.di.a$c$a, reason: collision with other inner class name */
        public static final class C7769a implements u<InterfaceC34468d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.autodispatches.di.c f258861a;

            public C7769a(com.avito.android.sbc.autodispatches.di.c cVar) {
                this.f258861a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34468d interfaceC34468dSf = this.f258861a.sf();
                t.c(interfaceC34468dSf);
                return interfaceC34468dSf;
            }
        }

        /* compiled from: DaggerSbcAutoDispatchesFragmentComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.autodispatches.di.c f258862a;

            public b(com.avito.android.sbc.autodispatches.di.c cVar) {
                this.f258862a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0I0 = this.f258862a.i0();
                t.c(r0I0);
                return r0I0;
            }
        }

        /* compiled from: DaggerSbcAutoDispatchesFragmentComponent.java */
        /* renamed from: com.avito.android.sbc.autodispatches.di.a$c$c, reason: collision with other inner class name */
        public static final class C7770c implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.autodispatches.di.c f258863a;

            public C7770c(com.avito.android.sbc.autodispatches.di.c cVar) {
                this.f258863a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f258863a.locale();
            }
        }

        /* compiled from: DaggerSbcAutoDispatchesFragmentComponent.java */
        public static final class d implements u<InterfaceC17032a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.autodispatches.di.c f258864a;

            public d(com.avito.android.sbc.autodispatches.di.c cVar) {
                this.f258864a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC17032a interfaceC17032aN2 = this.f258864a.N2();
                t.c(interfaceC17032aN2);
                return interfaceC17032aN2;
            }
        }

        /* compiled from: DaggerSbcAutoDispatchesFragmentComponent.java */
        public static final class e implements u<C30566f2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.autodispatches.di.c f258865a;

            public e(com.avito.android.sbc.autodispatches.di.c cVar) {
                this.f258865a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f258865a.z2();
            }
        }

        /* compiled from: DaggerSbcAutoDispatchesFragmentComponent.java */
        public static final class f implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.autodispatches.di.c f258866a;

            public f(com.avito.android.sbc.autodispatches.di.c cVar) {
                this.f258866a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f258866a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        public c(com.avito.android.sbc.autodispatches.di.c cVar, cv.b bVar, C7768a c7768a) {
            this.f258850a = bVar;
            C7769a c7769a = new C7769a(cVar);
            this.f258852c = c7769a;
            d dVar = new d(cVar);
            this.f258853d = dVar;
            b bVar2 = new b(cVar);
            this.f258854e = bVar2;
            f fVar = new f(cVar);
            this.f258855f = fVar;
            u<m> uVarD = g.d(new w(c7769a, dVar, bVar2, fVar));
            this.f258856g = uVarD;
            com.avito.android.sbc.autodispatches.mvi.g gVar = new com.avito.android.sbc.autodispatches.mvi.g(uVarD);
            this.f258857h = new com.avito.android.sbc.autodispatches.mvi.e(uVarD);
            this.f258858i = new n(new j(gVar, l.a(), this.f258857h, com.avito.android.sbc.autodispatches.mvi.b.a()));
            this.f258859j = new C7770c(cVar);
            this.f258860k = new e(cVar);
        }

        @Override // com.avito.android.sbc.autodispatches.di.b
        public final InterfaceC14919d.a a() {
            return new d(this.f258851b, null);
        }

        @Override // com.avito.android.sbc.autodispatches.di.b
        public final void b(SbcAutoDispatchesFragment sbcAutoDispatchesFragment) {
            sbcAutoDispatchesFragment.f258823n0 = this.f258858i;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f258850a.u4();
            t.c(aVarU4);
            sbcAutoDispatchesFragment.f258825p0 = aVarU4;
        }
    }

    /* compiled from: DaggerSbcAutoDispatchesFragmentComponent.java */
    public static final class d implements InterfaceC14919d.a {

        /* renamed from: a, reason: collision with root package name */
        public final c f258867a;

        public d(c cVar, C7768a c7768a) {
            this.f258867a = cVar;
        }

        @Override // Qo0.InterfaceC14919d.a
        public final InterfaceC14919d a(AutoDispatchListInfo autoDispatchListInfo, i.a aVar, c.a aVar2) {
            aVar.getClass();
            aVar2.getClass();
            return new e(this.f258867a, new C14917b(), autoDispatchListInfo, aVar, aVar2, null);
        }
    }

    /* compiled from: DaggerSbcAutoDispatchesFragmentComponent.java */
    public static final class e implements InterfaceC14919d {

        /* renamed from: a, reason: collision with root package name */
        public final c f258868a;

        /* renamed from: b, reason: collision with root package name */
        public final f f258869b;

        /* renamed from: c, reason: collision with root package name */
        public final k f258870c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.sbc.autodispatcheslist.c> f258871d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.sbc.autodispatcheslist.mvi.m f258872e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f258873f;

        /* renamed from: g, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f258874g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f258875h;

        /* renamed from: i, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f258876i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f258877j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f258878k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f258879l;

        public e(c cVar, C14917b c14917b, AutoDispatchListInfo autoDispatchListInfo, i.a aVar, c.a aVar2, C7768a c7768a) {
            this.f258868a = cVar;
            dagger.internal.l lVarA = dagger.internal.l.a(autoDispatchListInfo);
            u<InterfaceC34468d> uVar = cVar.f258852c;
            this.f258869b = new f(lVarA, uVar);
            u<Locale> uVar2 = cVar.f258859j;
            v vVar = new v(uVar2);
            x xVar = new x(uVar2);
            this.f258870c = new k(vVar, xVar, new com.avito.android.sbc.di.w(xVar), lVarA);
            u<com.avito.android.sbc.autodispatcheslist.c> uVarD = g.d(new com.avito.android.sbc.autodispatcheslist.g(lVarA, uVar, cVar.f258853d, cVar.f258854e, cVar.f258855f));
            this.f258871d = uVarD;
            this.f258872e = new com.avito.android.sbc.autodispatcheslist.mvi.m(new com.avito.android.sbc.autodispatcheslist.mvi.i(this.f258869b, this.f258870c, new com.avito.android.sbc.autodispatcheslist.mvi.d(uVarD), com.avito.android.sbc.autodispatcheslist.mvi.b.a()));
            this.f258873f = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f258874g = g.d(new h(new com.avito.android.sbc.autodispatcheslist.adapter.m(dagger.internal.l.a(aVar)), cVar.f258860k));
            this.f258875h = g.d(q.a());
            this.f258876i = g.d(new com.avito.android.sbc.autodispatcheslist.adapter.e(dagger.internal.l.a(aVar2)));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f258873f);
            u<TV0.b<?, ?>> uVar3 = this.f258874g;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar3);
            list.add(this.f258875h);
            list.add(this.f258876i);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f258877j = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f258878k = uVarH;
            this.f258879l = g.d(new C14918c(c14917b, uVarH, this.f258877j));
        }

        @Override // Qo0.InterfaceC14919d
        public final void a(SbcAutoDispatchesListFragment sbcAutoDispatchesListFragment) {
            sbcAutoDispatchesListFragment.f258991n0 = this.f258872e;
            sbcAutoDispatchesListFragment.f258993p0 = this.f258879l.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f258868a.f258850a.u4();
            t.c(aVarU4);
            sbcAutoDispatchesListFragment.f258994q0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
