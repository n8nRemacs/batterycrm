package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.di;

import Y41.l;
import Za0.InterfaceC19524a;
import androidx.view.S0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.ReAgentSetProfileNameArgs;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.ReAgentSetProfileNameFragment;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.di.b;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.j;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.n;
import com.avito.android.passport.profile_add.perf_const.ReAgentSetProfileNameScreen;
import com.avito.android.remote.A1;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerReAgentSetProfileNameComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerReAgentSetProfileNameComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.di.b.a
        public final com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.di.b a(ReAgentSetProfileNameArgs reAgentSetProfileNameArgs, S0 s02, InterfaceC39417a interfaceC39417a, com.avito.android.passport.profile_add.di.a aVar, r rVar, ReAgentSetProfileNameScreen reAgentSetProfileNameScreen, l lVar) {
            reAgentSetProfileNameArgs.getClass();
            interfaceC39417a.getClass();
            reAgentSetProfileNameScreen.getClass();
            return new c(aVar, interfaceC39417a, reAgentSetProfileNameArgs, s02, rVar, reAgentSetProfileNameScreen, lVar, null);
        }
    }

    /* compiled from: DaggerReAgentSetProfileNameComponent.java */
    public static final class c implements com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f211413a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.di.a f211414b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f211415c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f211416d;

        /* renamed from: e, reason: collision with root package name */
        public final u<I50.a> f211417e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC34401z0> f211418f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.passport_lib.h> f211419g;

        /* renamed from: h, reason: collision with root package name */
        public final u<r60.d> f211420h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC19524a> f211421i;

        /* renamed from: j, reason: collision with root package name */
        public final u<A1> f211422j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28373a> f211423k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.domain.interactor.a> f211424l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.g f211425m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f211426n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f211427o;

        /* renamed from: p, reason: collision with root package name */
        public final u<C28478k> f211428p;

        /* renamed from: q, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f211429q;

        /* renamed from: r, reason: collision with root package name */
        public final j f211430r;

        /* compiled from: DaggerReAgentSetProfileNameComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.di.a$c$a, reason: collision with other inner class name */
        public static final class C6317a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211431a;

            public C6317a(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211431a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f211431a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerReAgentSetProfileNameComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211432a;

            public b(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211432a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f211432a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerReAgentSetProfileNameComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.di.a$c$c, reason: collision with other inner class name */
        public static final class C6318c implements u<r60.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211433a;

            public C6318c(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211433a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f211433a.X1();
            }
        }

        /* compiled from: DaggerReAgentSetProfileNameComponent.java */
        public static final class d implements u<com.avito.android.passport_lib.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211434a;

            public d(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211434a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.passport_lib.h hVarD4 = this.f211434a.d4();
                t.c(hVarD4);
                return hVarD4;
            }
        }

        /* compiled from: DaggerReAgentSetProfileNameComponent.java */
        public static final class e implements u<I50.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211435a;

            public e(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211435a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                I50.a aVarX3 = this.f211435a.X3();
                t.c(aVarX3);
                return aVarX3;
            }
        }

        /* compiled from: DaggerReAgentSetProfileNameComponent.java */
        public static final class f implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211436a;

            public f(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211436a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0P5 = this.f211436a.P5();
                t.c(interfaceC34401z0P5);
                return interfaceC34401z0P5;
            }
        }

        /* compiled from: DaggerReAgentSetProfileNameComponent.java */
        public static final class g implements u<InterfaceC19524a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211437a;

            public g(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211437a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19524a interfaceC19524aE7 = this.f211437a.e7();
                t.c(interfaceC19524aE7);
                return interfaceC19524aE7;
            }
        }

        /* compiled from: DaggerReAgentSetProfileNameComponent.java */
        public static final class h implements u<A1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211438a;

            public h(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211438a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A1 a1Xg = this.f211438a.xg();
                t.c(a1Xg);
                return a1Xg;
            }
        }

        /* compiled from: DaggerReAgentSetProfileNameComponent.java */
        public static final class i implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211439a;

            public i(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211439a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f211439a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.passport.profile_add.di.a aVar, cv.b bVar, ReAgentSetProfileNameArgs reAgentSetProfileNameArgs, S0 s02, r rVar, Screen screen, l lVar, C6316a c6316a) {
            this.f211413a = bVar;
            this.f211414b = aVar;
            dagger.internal.l lVarA = dagger.internal.l.a(reAgentSetProfileNameArgs);
            this.f211415c = lVarA;
            this.f211416d = new b(aVar);
            e eVar = new e(aVar);
            f fVar = new f(aVar);
            com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.di.d dVar = new com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.di.d(lVarA);
            d dVar2 = new d(aVar);
            C6318c c6318c = new C6318c(aVar);
            com.avito.android.passport.profile_add.domain.interactor.g gVar = new com.avito.android.passport.profile_add.domain.interactor.g(eVar, fVar, dVar, dVar2, c6318c);
            g gVar2 = new g(aVar);
            com.avito.android.passport.profile_add.domain.interactor.d dVar3 = new com.avito.android.passport.profile_add.domain.interactor.d(dVar, fVar, gVar2, c6318c);
            h hVar = new h(aVar);
            C6317a c6317a = new C6317a(aVar);
            this.f211423k = c6317a;
            u<com.avito.android.passport.profile_add.domain.interactor.a> uVarA = B.a(new com.avito.android.passport.profile_add.di.c(gVar, dVar3, new com.avito.android.passport.profile_add.domain.interactor.r(fVar, hVar, gVar2, dVar, c6317a, c6318c), dVar));
            this.f211424l = uVarA;
            this.f211425m = new com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.g(this.f211415c, uVarA, this.f211416d, this.f211423k);
            this.f211426n = new i(aVar);
            this.f211427o = dagger.internal.l.a(screen);
            u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.passport.profile_add.di.d(dagger.internal.l.a(rVar), this.f211427o));
            this.f211428p = uVarD;
            this.f211429q = com.avito.android.advert.item.delivery_suggests.l.i(this.f211426n, uVarD);
            this.f211430r = new j(new com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.j(this.f211425m, com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.l.a(), n.a(), this.f211429q));
        }

        @Override // com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.di.b
        public final void a(ReAgentSetProfileNameFragment reAgentSetProfileNameFragment) {
            reAgentSetProfileNameFragment.f211386n0 = this.f211430r;
            reAgentSetProfileNameFragment.f211388p0 = this.f211429q.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f211413a.u4();
            t.c(aVarU4);
            reAgentSetProfileNameFragment.f211389q0 = aVarU4;
            com.avito.android.passport.profile_add.l lVarB3 = this.f211414b.B3();
            t.c(lVarB3);
            reAgentSetProfileNameFragment.f211390r0 = lVarB3;
        }
    }

    public static b.a a() {
        return new b();
    }
}
