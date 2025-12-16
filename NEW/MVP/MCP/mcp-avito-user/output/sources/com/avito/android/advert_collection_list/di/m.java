package com.avito.android.advert_collection_list.di;

import android.content.Context;
import androidx.recyclerview.widget.C;
import com.avito.android.account.E;
import com.avito.android.advert_collection_list.AdvertCollectionListFragment;
import com.avito.android.advert_collection_list.di.a;
import com.avito.android.advert_collection_list.di.h;
import com.avito.android.advert_collection_list.mvi.p;
import com.avito.android.advert_collection_list.mvi.r;
import com.avito.android.advert_collection_list.u;
import com.avito.android.advert_collection_list.v;
import com.avito.android.advert_collection_list.w;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.receiver.CollectionSharingReceiver;
import com.avito.android.remote.H;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerAdvertCollectionListComponent.java */
@dagger.internal.e
/* loaded from: classes10.dex */
public final class m {

    /* compiled from: DaggerAdvertCollectionListComponent.java */
    public static final class b implements com.avito.android.advert_collection_list.di.a {

        /* renamed from: A, reason: collision with root package name */
        public final u<InterfaceC28481c> f82095A;

        /* renamed from: B, reason: collision with root package name */
        public final u<C28478k> f82096B;

        /* renamed from: C, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f82097C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.l f82098D;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.advert_collection_list.di.b f82099a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f82100b;

        /* renamed from: c, reason: collision with root package name */
        public final u<Context> f82101c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.advert_collection_list.i> f82102d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.advert_collection_list.adapter.advert_collection.d> f82103e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.f f82104f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f82105g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f82106h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.advert_collection_list.adapter.advert_collection.skeleton.c> f82107i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f82108j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f82109k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f82110l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C> f82111m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f82112n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ZC.f> f82113o;

        /* renamed from: p, reason: collision with root package name */
        public final u<O7.a> f82114p;

        /* renamed from: q, reason: collision with root package name */
        public final u<R0> f82115q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.advert_collection_list.f> f82116r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f82117s;

        /* renamed from: t, reason: collision with root package name */
        public final u<E> f82118t;

        /* renamed from: u, reason: collision with root package name */
        public final u<H> f82119u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.l f82120v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.advert_collection_list.mvi.m f82121w;

        /* renamed from: x, reason: collision with root package name */
        public final u<x> f82122x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.advert_collection_list.mvi.i f82123y;

        /* renamed from: z, reason: collision with root package name */
        public final r f82124z;

        /* compiled from: DaggerAdvertCollectionListComponent.java */
        public static final class a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_collection_list.di.b f82125a;

            public a(com.avito.android.advert_collection_list.di.b bVar) {
                this.f82125a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f82125a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerAdvertCollectionListComponent.java */
        /* renamed from: com.avito.android.advert_collection_list.di.m$b$b, reason: collision with other inner class name */
        public static final class C2437b implements u<O7.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_collection_list.di.b f82126a;

            public C2437b(com.avito.android.advert_collection_list.di.b bVar) {
                this.f82126a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                O7.a aVarX8 = this.f82126a.x8();
                t.c(aVarX8);
                return aVarX8;
            }
        }

        /* compiled from: DaggerAdvertCollectionListComponent.java */
        public static final class c implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_collection_list.di.b f82127a;

            public c(com.avito.android.advert_collection_list.di.b bVar) {
                this.f82127a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f82127a.g();
            }
        }

        /* compiled from: DaggerAdvertCollectionListComponent.java */
        public static final class d implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_collection_list.di.b f82128a;

            public d(com.avito.android.advert_collection_list.di.b bVar) {
                this.f82128a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f82128a.t();
                t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerAdvertCollectionListComponent.java */
        public static final class e implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f82129a;

            public e(cv.b bVar) {
                this.f82129a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f82129a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerAdvertCollectionListComponent.java */
        public static final class f implements u<H> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_collection_list.di.b f82130a;

            public f(com.avito.android.advert_collection_list.di.b bVar) {
                this.f82130a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H hK2 = this.f82130a.K();
                t.c(hK2);
                return hK2;
            }
        }

        /* compiled from: DaggerAdvertCollectionListComponent.java */
        public static final class g implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_collection_list.di.b f82131a;

            public g(com.avito.android.advert_collection_list.di.b bVar) {
                this.f82131a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f82131a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerAdvertCollectionListComponent.java */
        public static final class h implements u<ZC.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_collection_list.di.b f82132a;

            public h(com.avito.android.advert_collection_list.di.b bVar) {
                this.f82132a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ZC.f fVarD3 = this.f82132a.D3();
                t.c(fVarD3);
                return fVarD3;
            }
        }

        /* compiled from: DaggerAdvertCollectionListComponent.java */
        public static final class i implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f82133a;

            public i(InterfaceC30106l7 interfaceC30106l7) {
                this.f82133a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f82133a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.advert_collection_list.di.b bVar, cv.b bVar2, InterfaceC30106l7 interfaceC30106l7, com.avito.android.analytics.screens.r rVar, Boolean bool, String str, a aVar) {
            this.f82099a = bVar;
            this.f82100b = bVar2;
            u<com.avito.android.advert_collection_list.i> uVarD = dagger.internal.g.d(new com.avito.android.advert_collection_list.k(new k(new c(bVar))));
            this.f82102d = uVarD;
            this.f82103e = dagger.internal.g.d(new com.avito.android.advert_collection_list.adapter.advert_collection.h(uVarD));
            this.f82104f = new dagger.internal.f();
            this.f82105g = dagger.internal.g.d(h.a.f82091a);
            this.f82106h = dagger.internal.g.d(new com.avito.android.advert_collection_list.adapter.advert_collection.b(this.f82103e));
            u<com.avito.android.advert_collection_list.adapter.advert_collection.skeleton.c> uVarD2 = dagger.internal.g.d(com.avito.android.advert_collection_list.adapter.advert_collection.skeleton.e.a());
            this.f82107i = uVarD2;
            this.f82108j = dagger.internal.g.d(new com.avito.android.advert_collection_list.adapter.advert_collection.skeleton.b(uVarD2));
            A.b bVarA = A.a(2, 1);
            bVarA.f393938b.add(this.f82105g);
            u<TV0.b<?, ?>> uVar = this.f82106h;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f82108j);
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new com.avito.android.advert_collection_list.di.g(bVarA.b()));
            this.f82109k = uVarD3;
            u<com.avito.konveyor.adapter.j> uVarD4 = dagger.internal.g.d(new com.avito.android.advert_collection_list.di.d(this.f82104f, uVarD3));
            this.f82110l = uVarD4;
            this.f82111m = dagger.internal.g.d(new com.avito.android.advert_collection_list.di.i(uVarD4));
            u<com.avito.android.recycler.data_aware.e> uVarD5 = dagger.internal.g.d(new com.avito.android.advert_collection_list.di.f(com.avito.android.advert_collection_list.adapter.b.a()));
            this.f82112n = uVarD5;
            dagger.internal.f.a(this.f82104f, dagger.internal.g.d(new com.avito.android.advert_collection_list.di.e(uVarD5, this.f82111m, this.f82109k)));
            this.f82116r = dagger.internal.g.d(new com.avito.android.advert_collection_list.h(new h(bVar), new C2437b(bVar), new g(bVar)));
            this.f82117s = new e(bVar2);
            this.f82118t = new a(bVar);
            this.f82119u = new f(bVar);
            this.f82120v = dagger.internal.l.a(bool);
            dagger.internal.l lVarB = dagger.internal.l.b(str);
            u<com.avito.android.advert_collection_list.f> uVar2 = this.f82116r;
            u<com.avito.android.deeplink_handler.handler.composite.a> uVar3 = this.f82117s;
            u<E> uVar4 = this.f82118t;
            u<H> uVar5 = this.f82119u;
            this.f82121w = new com.avito.android.advert_collection_list.mvi.m(this.f82120v, lVarB, uVar2, uVar3, uVar4, uVar5);
            d dVar = new d(bVar);
            u<com.avito.android.advert_collection_list.i> uVar6 = this.f82102d;
            this.f82123y = new com.avito.android.advert_collection_list.mvi.i(uVar2, uVar4, uVar5, uVar6, dVar);
            this.f82124z = new r(uVar6);
            this.f82095A = new i(interfaceC30106l7);
            u<C28478k> uVarD6 = dagger.internal.g.d(new j(dagger.internal.l.a(rVar)));
            this.f82096B = uVarD6;
            this.f82097C = com.avito.android.advert.item.delivery_suggests.l.i(this.f82095A, uVarD6);
            this.f82098D = dagger.internal.l.a(new w(new v(new p(this.f82121w, this.f82123y, this.f82124z, com.avito.android.advert_collection_list.mvi.t.a(), this.f82097C))));
        }

        @Override // com.avito.android.advert_collection_list.di.a
        public final void a(AdvertCollectionListFragment advertCollectionListFragment) {
            com.avito.android.advert_collection_list.adapter.advert_collection.d dVar = this.f82103e.get();
            com.avito.android.advert_collection_list.di.b bVar = this.f82099a;
            com.avito.android.advert_collection_core.d dVarHk = bVar.Hk();
            t.c(dVarHk);
            advertCollectionListFragment.f81968n0 = new com.avito.android.advert_collection_list.r(dVar, dVarHk, (com.avito.konveyor.adapter.a) this.f82104f.get(), this.f82110l.get());
            advertCollectionListFragment.f81969o0 = bVar.h();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f82100b.u4();
            t.c(aVarU4);
            advertCollectionListFragment.f81970p0 = aVarU4;
            E eI2 = bVar.i();
            t.c(eI2);
            advertCollectionListFragment.f81971q0 = eI2;
            advertCollectionListFragment.f81972r0 = (u.a) this.f82098D.f393949a;
            advertCollectionListFragment.f81973s0 = this.f82097C.get();
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            advertCollectionListFragment.f81974t0 = interfaceC28373aA;
            M7.a aVarZ5 = bVar.z5();
            t.c(aVarZ5);
            advertCollectionListFragment.f81975u0 = aVarZ5;
            bVar.f4();
            advertCollectionListFragment.f81976v0 = CollectionSharingReceiver.class;
        }
    }

    /* compiled from: DaggerAdvertCollectionListComponent.java */
    public static final class c implements a.InterfaceC2436a {
        public c() {
        }

        @Override // com.avito.android.advert_collection_list.di.a.InterfaceC2436a
        public final com.avito.android.advert_collection_list.di.a a(com.avito.android.advert_collection_list.di.b bVar, InterfaceC39417a interfaceC39417a, InterfaceC30106l7 interfaceC30106l7, com.avito.android.analytics.screens.r rVar, boolean z12, String str) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, interfaceC30106l7, rVar, Boolean.valueOf(z12), str, null);
        }
    }

    public static a.InterfaceC2436a a() {
        return new c();
    }
}
