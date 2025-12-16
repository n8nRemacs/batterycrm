package com.avito.android.passport.profiles_list.di;

import Y41.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30065i;
import com.avito.android.passport.profiles_list.PassportProfilesListActivity;
import com.avito.android.passport.profiles_list.di.c;
import com.avito.android.passport.profiles_list.mvi.m;
import com.avito.android.passport.profiles_list.o;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import hz.InterfaceC41196a;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.Z1;
import l60.InterfaceC43550a;

/* compiled from: DaggerPassportProfilesListComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPassportProfilesListComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.passport.profiles_list.di.c.a
        public final com.avito.android.passport.profiles_list.di.c a(d dVar, InterfaceC39417a interfaceC39417a, boolean z12, r rVar, l lVar) {
            interfaceC39417a.getClass();
            return new c(new e(), new com.avito.android.passport.profiles_list.recycler.g(), dVar, interfaceC39417a, Boolean.valueOf(z12), rVar, lVar, null);
        }
    }

    /* compiled from: DaggerPassportProfilesListComponent.java */
    public static final class c implements com.avito.android.passport.profiles_list.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.passport.profiles_list.di.d f213756a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f213757b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f213758c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_list_item.e> f213759d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f213760e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.passport.profiles_list.recycler.e> f213761f;

        /* renamed from: g, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f213762g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f213763h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f213764i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f213765j;

        /* renamed from: k, reason: collision with root package name */
        public final u<j> f213766k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC43550a> f213767l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC41196a> f213768m;

        /* renamed from: n, reason: collision with root package name */
        public final u<o> f213769n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f213770o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.passport.profiles_list.mvi.e f213771p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.l f213772q;

        /* renamed from: r, reason: collision with root package name */
        public final u<Z1<String>> f213773r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.passport.profiles_list.mvi.b f213774s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.passport.profiles_list.mvi.j f213775t;

        /* renamed from: u, reason: collision with root package name */
        public final m f213776u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC28481c> f213777v;

        /* renamed from: w, reason: collision with root package name */
        public final u<C28478k> f213778w;

        /* renamed from: x, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f213779x;

        /* renamed from: y, reason: collision with root package name */
        public final u<InterfaceC28373a> f213780y;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.passport.profiles_list.j f213781z;

        /* compiled from: DaggerPassportProfilesListComponent.java */
        /* renamed from: com.avito.android.passport.profiles_list.di.a$c$a, reason: collision with other inner class name */
        public static final class C6408a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profiles_list.di.d f213782a;

            public C6408a(com.avito.android.passport.profiles_list.di.d dVar) {
                this.f213782a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f213782a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPassportProfilesListComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f213783a;

            public b(cv.b bVar) {
                this.f213783a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f213783a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerPassportProfilesListComponent.java */
        /* renamed from: com.avito.android.passport.profiles_list.di.a$c$c, reason: collision with other inner class name */
        public static final class C6409c implements u<InterfaceC41196a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profiles_list.di.d f213784a;

            public C6409c(com.avito.android.passport.profiles_list.di.d dVar) {
                this.f213784a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41196a interfaceC41196aE0 = this.f213784a.E0();
                t.c(interfaceC41196aE0);
                return interfaceC41196aE0;
            }
        }

        /* compiled from: DaggerPassportProfilesListComponent.java */
        public static final class d implements u<InterfaceC43550a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profiles_list.di.d f213785a;

            public d(com.avito.android.passport.profiles_list.di.d dVar) {
                this.f213785a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC43550a interfaceC43550aD5 = this.f213785a.D5();
                t.c(interfaceC43550aD5);
                return interfaceC43550aD5;
            }
        }

        /* compiled from: DaggerPassportProfilesListComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profiles_list.di.d f213786a;

            public e(com.avito.android.passport.profiles_list.di.d dVar) {
                this.f213786a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f213786a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.passport.profiles_list.di.e eVar, com.avito.android.passport.profiles_list.recycler.g gVar, com.avito.android.passport.profiles_list.di.d dVar, cv.b bVar, Boolean bool, r rVar, l lVar, C6407a c6407a) {
            this.f213756a = dVar;
            this.f213757b = B.a(com.avito.android.konveyor_adapter_module.d.a());
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f213758c = lVarA;
            u<com.avito.android.passport.profile_list_item.e> uVarD = dagger.internal.g.d(new com.avito.android.passport.profile_list_item.h(lVarA));
            this.f213759d = uVarD;
            this.f213760e = dagger.internal.g.d(new com.avito.android.passport.profile_list_item.c(uVarD));
            u<com.avito.android.passport.profiles_list.recycler.e> uVarD2 = dagger.internal.g.d(new com.avito.android.passport.profiles_list.recycler.h(gVar, this.f213758c));
            this.f213761f = uVarD2;
            this.f213762g = dagger.internal.g.d(new com.avito.android.passport.profiles_list.recycler.c(uVarD2));
            this.f213763h = dagger.internal.g.d(new com.avito.android.passport.profiles_list.recycler.j(com.avito.android.passport.profiles_list.recycler.l.a()));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f213757b);
            u<TV0.b<?, ?>> uVar = this.f213760e;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f213762g);
            list.add(this.f213763h);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f213764i = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f213765j = uVarH;
            this.f213766k = dagger.internal.g.d(new f(eVar, uVarH, this.f213764i));
            u<o> uVarD3 = dagger.internal.g.d(new com.avito.android.passport.profiles_list.u(new d(dVar), new C6409c(dVar)));
            this.f213769n = uVarD3;
            b bVar2 = new b(bVar);
            this.f213770o = bVar2;
            this.f213771p = new com.avito.android.passport.profiles_list.mvi.e(uVarD3, bVar2);
            this.f213772q = dagger.internal.l.a(bool);
            u<Z1<String>> uVarD4 = dagger.internal.g.d(new h(eVar));
            this.f213773r = uVarD4;
            dagger.internal.l lVar2 = this.f213772q;
            this.f213774s = new com.avito.android.passport.profiles_list.mvi.b(lVar2, uVarD4, this.f213769n);
            this.f213775t = new com.avito.android.passport.profiles_list.mvi.j(this.f213770o);
            this.f213776u = new m(lVar2);
            this.f213777v = new e(dVar);
            u<C28478k> uVarD5 = dagger.internal.g.d(new g(eVar, dagger.internal.l.a(rVar)));
            this.f213778w = uVarD5;
            u<ScreenPerformanceTracker> uVarD6 = dagger.internal.g.d(new C30065i(this.f213777v, uVarD5));
            this.f213779x = uVarD6;
            this.f213781z = new com.avito.android.passport.profiles_list.j(new com.avito.android.passport.profiles_list.mvi.h(this.f213771p, this.f213774s, this.f213775t, this.f213776u, uVarD6), this.f213773r, new C6408a(dVar));
        }

        @Override // com.avito.android.passport.profiles_list.di.c
        public final void a(PassportProfilesListActivity passportProfilesListActivity) {
            passportProfilesListActivity.f213731o = this.f213766k.get();
            passportProfilesListActivity.f213732p = this.f213765j.get();
            passportProfilesListActivity.f213733q = this.f213781z;
            passportProfilesListActivity.f213735s = this.f213779x.get();
            com.avito.android.ui.status_bar.e eVarB0 = this.f213756a.b0();
            t.c(eVarB0);
            passportProfilesListActivity.f213736t = eVarB0;
        }
    }

    public static c.a a() {
        return new b();
    }
}
