package com.avito.android.passport.profile_add.merge.profiles_list;

import android.app.Activity;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.profile_add.merge.domain.MergeFlow;
import com.avito.android.passport.profile_add.merge.profiles_list.b;
import d60.InterfaceC39512a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.u;
import java.util.List;
import java.util.Set;
import l60.InterfaceC43550a;

/* compiled from: DaggerProfilesListComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerProfilesListComponent.java */
    public static final class b implements b.a {
        public b() {
        }
    }

    /* compiled from: DaggerProfilesListComponent.java */
    public static final class c implements com.avito.android.passport.profile_add.merge.profiles_list.b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC39512a f213214a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f213215b = B.a(com.avito.android.konveyor_adapter_module.d.a());

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.merge.profiles_list.recycler.p> f213216c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f213217d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.merge.profiles_list.recycler.d> f213218e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f213219f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_list_item.n> f213220g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_list_item.a> f213221h;

        /* renamed from: i, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f213222i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f213223j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f213224k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f213225l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f213226m;

        /* renamed from: n, reason: collision with root package name */
        public final u<C28478k> f213227n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f213228o;

        /* renamed from: p, reason: collision with root package name */
        public final u<I50.a> f213229p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC43550a> f213230q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.server_time.a> f213231r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.passport_lib.h> f213232s;

        /* renamed from: t, reason: collision with root package name */
        public final u<r60.d> f213233t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.merge.domain.i f213234u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC28373a> f213235v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f213236w;

        /* renamed from: x, reason: collision with root package name */
        public final t f213237x;

        /* compiled from: DaggerProfilesListComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.merge.profiles_list.a$c$a, reason: collision with other inner class name */
        public static final class C6389a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC39512a f213238a;

            public C6389a(InterfaceC39512a interfaceC39512a) {
                this.f213238a = interfaceC39512a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f213238a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerProfilesListComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f213239a;

            public b(cv.b bVar) {
                this.f213239a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f213239a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerProfilesListComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.merge.profiles_list.a$c$c, reason: collision with other inner class name */
        public static final class C6390c implements u<com.avito.android.server_time.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC39512a f213240a;

            public C6390c(InterfaceC39512a interfaceC39512a) {
                this.f213240a = interfaceC39512a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.a aVarT = this.f213240a.T();
                dagger.internal.t.c(aVarT);
                return aVarT;
            }
        }

        /* compiled from: DaggerProfilesListComponent.java */
        public static final class d implements u<r60.d> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC39512a f213241a;

            public d(InterfaceC39512a interfaceC39512a) {
                this.f213241a = interfaceC39512a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f213241a.X1();
            }
        }

        /* compiled from: DaggerProfilesListComponent.java */
        public static final class e implements u<I50.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC39512a f213242a;

            public e(InterfaceC39512a interfaceC39512a) {
                this.f213242a = interfaceC39512a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                I50.a aVarX3 = this.f213242a.X3();
                dagger.internal.t.c(aVarX3);
                return aVarX3;
            }
        }

        /* compiled from: DaggerProfilesListComponent.java */
        public static final class f implements u<InterfaceC43550a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC39512a f213243a;

            public f(InterfaceC39512a interfaceC39512a) {
                this.f213243a = interfaceC39512a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC43550a interfaceC43550aD5 = this.f213243a.D5();
                dagger.internal.t.c(interfaceC43550aD5);
                return interfaceC43550aD5;
            }
        }

        /* compiled from: DaggerProfilesListComponent.java */
        public static final class g implements u<com.avito.android.passport_lib.h> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC39512a f213244a;

            public g(InterfaceC39512a interfaceC39512a) {
                this.f213244a = interfaceC39512a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.passport_lib.h hVarAf = this.f213244a.Af();
                dagger.internal.t.c(hVarAf);
                return hVarAf;
            }
        }

        /* compiled from: DaggerProfilesListComponent.java */
        public static final class h implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC39512a f213245a;

            public h(InterfaceC39512a interfaceC39512a) {
                this.f213245a = interfaceC39512a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f213245a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(o oVar, InterfaceC39512a interfaceC39512a, cv.b bVar, com.avito.android.analytics.screens.r rVar, Activity activity, MergeFlow mergeFlow, C6388a c6388a) {
            this.f213214a = interfaceC39512a;
            u<com.avito.android.passport.profile_add.merge.profiles_list.recycler.p> uVarD = dagger.internal.g.d(com.avito.android.passport.profile_add.merge.profiles_list.recycler.s.a());
            this.f213216c = uVarD;
            this.f213217d = dagger.internal.g.d(new com.avito.android.passport.profile_add.merge.profiles_list.recycler.n(uVarD));
            u<com.avito.android.passport.profile_add.merge.profiles_list.recycler.d> uVarD2 = dagger.internal.g.d(com.avito.android.passport.profile_add.merge.profiles_list.recycler.h.a());
            this.f213218e = uVarD2;
            this.f213219f = dagger.internal.g.d(new com.avito.android.passport.profile_add.merge.profiles_list.recycler.l(uVarD2));
            this.f213220g = dagger.internal.g.d(com.avito.android.passport.profile_list_item.q.a());
            u<com.avito.android.passport.profile_list_item.a> uVarD3 = dagger.internal.g.d(com.avito.android.passport.profile_add.merge.profiles_list.recycler.b.a());
            this.f213221h = uVarD3;
            this.f213222i = dagger.internal.g.d(new com.avito.android.passport.profile_list_item.l(uVarD3, this.f213220g));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f213215b);
            u<TV0.b<?, ?>> uVar = this.f213217d;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f213219f);
            list.add(this.f213222i);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f213223j = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f213224k = uVarH;
            this.f213225l = dagger.internal.g.d(new p(oVar, uVarH, this.f213223j));
            this.f213226m = new h(interfaceC39512a);
            u<C28478k> uVarD4 = dagger.internal.g.d(new r(dagger.internal.l.a(rVar)));
            this.f213227n = uVarD4;
            this.f213228o = com.avito.android.advert.item.delivery_suggests.l.i(this.f213226m, uVarD4);
            e eVar = new e(interfaceC39512a);
            f fVar = new f(interfaceC39512a);
            C6390c c6390c = new C6390c(interfaceC39512a);
            g gVar = new g(interfaceC39512a);
            d dVar = new d(interfaceC39512a);
            this.f213233t = dVar;
            this.f213234u = new com.avito.android.passport.profile_add.merge.domain.i(eVar, fVar, c6390c, gVar, dVar);
            dagger.internal.l lVarA = dagger.internal.l.a(mergeFlow);
            com.avito.android.passport.profile_add.merge.domain.i iVar = this.f213234u;
            this.f213237x = new t(new com.avito.android.passport.profile_add.merge.profiles_list.mvi.l(new com.avito.android.passport.profile_add.merge.profiles_list.mvi.d(iVar, lVarA), new com.avito.android.passport.profile_add.merge.profiles_list.mvi.g(iVar, lVarA, new C6389a(interfaceC39512a), this.f213233t), new com.avito.android.passport.profile_add.merge.profiles_list.mvi.i(new b(bVar)), this.f213228o, com.avito.android.passport.profile_add.merge.profiles_list.mvi.n.a()));
        }
    }
}
