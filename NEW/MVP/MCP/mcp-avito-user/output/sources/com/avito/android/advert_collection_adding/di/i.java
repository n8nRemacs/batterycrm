package com.avito.android.advert_collection_adding.di;

import com.avito.android.advert_collection_adding.A;
import com.avito.android.advert_collection_adding.AdvertCollectionAddingDialog;
import com.avito.android.advert_collection_adding.B;
import com.avito.android.advert_collection_adding.C;
import com.avito.android.advert_collection_adding.di.d;
import com.avito.android.advert_collection_adding.k;
import com.avito.android.advert_collection_adding.mvi.m;
import com.avito.android.advert_collection_adding.mvi.o;
import com.avito.android.advert_collection_adding.mvi.s;
import com.avito.android.advert_collection_adding.q;
import com.avito.android.advert_collection_adding.w;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.favorite.x;
import com.avito.android.favorites.V;
import com.avito.android.favorites.W;
import com.avito.android.util.R0;
import com.avito.konveyor.adapter.j;
import dagger.internal.A;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerAdvertCollectionAddingComponent.java */
@dagger.internal.e
/* loaded from: classes10.dex */
public final class i {

    /* compiled from: DaggerAdvertCollectionAddingComponent.java */
    public static final class b implements com.avito.android.advert_collection_adding.di.d {

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f81797a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.advert_collection_adding.di.e f81798b;

        /* renamed from: c, reason: collision with root package name */
        public final l f81799c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ZC.f> f81800d;

        /* renamed from: e, reason: collision with root package name */
        public final u<W> f81801e;

        /* renamed from: f, reason: collision with root package name */
        public final u<V> f81802f;

        /* renamed from: g, reason: collision with root package name */
        public final u<x> f81803g;

        /* renamed from: h, reason: collision with root package name */
        public final u<R0> f81804h;

        /* renamed from: i, reason: collision with root package name */
        public final u<k> f81805i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.advert_collection_adding.mvi.h f81806j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.advert_collection_adding.mvi.f f81807k;

        /* renamed from: l, reason: collision with root package name */
        public final o f81808l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f81809m;

        /* renamed from: n, reason: collision with root package name */
        public final u<C28478k> f81810n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f81811o;

        /* renamed from: p, reason: collision with root package name */
        public final l f81812p;

        /* renamed from: q, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f81813q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.advert_collection_adding.adapter.advert_collection.c> f81814r;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f81815s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.advert_collection_adding.adapter.advert_collection.skeleton.c> f81816t;

        /* renamed from: u, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f81817u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f81818v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f81819w;

        /* renamed from: x, reason: collision with root package name */
        public final u<j> f81820x;

        /* compiled from: DaggerAdvertCollectionAddingComponent.java */
        public static final class a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_collection_adding.di.e f81821a;

            public a(com.avito.android.advert_collection_adding.di.e eVar) {
                this.f81821a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f81821a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerAdvertCollectionAddingComponent.java */
        /* renamed from: com.avito.android.advert_collection_adding.di.i$b$b, reason: collision with other inner class name */
        public static final class C2425b implements u<V> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_collection_adding.di.e f81822a;

            public C2425b(com.avito.android.advert_collection_adding.di.e eVar) {
                this.f81822a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                V vA3 = this.f81822a.a3();
                t.c(vA3);
                return vA3;
            }
        }

        /* compiled from: DaggerAdvertCollectionAddingComponent.java */
        public static final class c implements u<W> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_collection_adding.di.e f81823a;

            public c(com.avito.android.advert_collection_adding.di.e eVar) {
                this.f81823a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f81823a.Q6();
            }
        }

        /* compiled from: DaggerAdvertCollectionAddingComponent.java */
        public static final class d implements u<ZC.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_collection_adding.di.e f81824a;

            public d(com.avito.android.advert_collection_adding.di.e eVar) {
                this.f81824a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ZC.f fVarD3 = this.f81824a.D3();
                t.c(fVarD3);
                return fVarD3;
            }
        }

        /* compiled from: DaggerAdvertCollectionAddingComponent.java */
        public static final class e implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_collection_adding.di.e f81825a;

            public e(com.avito.android.advert_collection_adding.di.e eVar) {
                this.f81825a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f81825a.m0();
            }
        }

        /* compiled from: DaggerAdvertCollectionAddingComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f81826a;

            public f(InterfaceC30106l7 interfaceC30106l7) {
                this.f81826a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f81826a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.advert_collection_adding.di.f fVar, com.avito.android.advert_collection_adding.di.e eVar, InterfaceC30106l7 interfaceC30106l7, r rVar, List list, Boolean bool, String str, a aVar) {
            this.f81797a = list;
            this.f81798b = eVar;
            this.f81799c = l.a(list);
            this.f81800d = new d(eVar);
            this.f81801e = new c(eVar);
            this.f81802f = new C2425b(eVar);
            this.f81803g = new e(eVar);
            this.f81804h = new a(eVar);
            this.f81805i = dagger.internal.g.d(new q(this.f81799c, l.b(str), this.f81800d, this.f81801e, this.f81802f, this.f81803g, this.f81804h));
            l lVarA = l.a(bool);
            u<k> uVar = this.f81805i;
            this.f81806j = new com.avito.android.advert_collection_adding.mvi.h(this.f81799c, lVarA, uVar);
            this.f81807k = new com.avito.android.advert_collection_adding.mvi.f(new com.avito.android.advert_collection_adding.mvi.b(uVar), new com.avito.android.advert_collection_adding.mvi.q(uVar));
            this.f81808l = new o(com.avito.android.advert_collection_adding.mvi.d.a(), s.a());
            this.f81809m = new f(interfaceC30106l7);
            u<C28478k> uVarD = dagger.internal.g.d(new g(fVar, l.a(rVar)));
            this.f81810n = uVarD;
            this.f81811o = com.avito.android.advert.item.delivery_suggests.l.i(this.f81809m, uVarD);
            this.f81812p = l.a(new C(new B(new com.avito.android.advert_collection_adding.mvi.k(this.f81806j, this.f81807k, m.a(), this.f81808l, this.f81811o))));
            this.f81813q = dagger.internal.B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.avito.android.advert_collection_adding.adapter.advert_collection.c> uVarD2 = dagger.internal.g.d(com.avito.android.advert_collection_adding.adapter.advert_collection.f.a());
            this.f81814r = uVarD2;
            this.f81815s = dagger.internal.g.d(new com.avito.android.advert_collection_adding.adapter.advert_collection.b(uVarD2));
            u<com.avito.android.advert_collection_adding.adapter.advert_collection.skeleton.c> uVarD3 = dagger.internal.g.d(com.avito.android.advert_collection_adding.adapter.advert_collection.skeleton.e.a());
            this.f81816t = uVarD3;
            this.f81817u = dagger.internal.g.d(new com.avito.android.advert_collection_adding.adapter.advert_collection.skeleton.b(uVarD3));
            A.b bVarA = A.a(2, 1);
            bVarA.f393938b.add(this.f81813q);
            u<TV0.b<?, ?>> uVar2 = this.f81815s;
            List<u<T>> list2 = bVarA.f393937a;
            list2.add(uVar2);
            list2.add(this.f81817u);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f81818v = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f81819w = uVarH;
            this.f81820x = dagger.internal.g.d(new h(fVar, uVarH, this.f81818v));
        }

        @Override // com.avito.android.advert_collection_adding.di.d
        public final void a(AdvertCollectionAddingDialog advertCollectionAddingDialog) {
            advertCollectionAddingDialog.f81725h0 = (A.a) this.f81812p.f393949a;
            advertCollectionAddingDialog.f81726i0 = new w(this.f81819w.get(), this.f81820x.get(), this.f81814r.get(), this.f81797a);
            com.avito.android.advert_collection_core.c cVarR9 = this.f81798b.r9();
            t.c(cVarR9);
            advertCollectionAddingDialog.f81727j0 = cVarR9;
            advertCollectionAddingDialog.f81728k0 = this.f81811o.get();
        }
    }

    /* compiled from: DaggerAdvertCollectionAddingComponent.java */
    public static final class c implements d.a {
        public c() {
        }

        @Override // com.avito.android.advert_collection_adding.di.d.a
        public final d a(e eVar, InterfaceC30106l7 interfaceC30106l7, r rVar, List<String> list, boolean z12, String str) {
            list.getClass();
            return new b(new f(), eVar, interfaceC30106l7, rVar, list, Boolean.valueOf(z12), str, null);
        }
    }

    public static d.a a() {
        return new c();
    }
}
