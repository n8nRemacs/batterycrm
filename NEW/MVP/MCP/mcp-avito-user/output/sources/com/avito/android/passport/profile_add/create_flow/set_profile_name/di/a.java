package com.avito.android.passport.profile_add.create_flow.set_profile_name.di;

import Y41.l;
import Za0.InterfaceC19524a;
import androidx.view.S0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameArgs;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameFragment;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.di.b;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.n;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.p;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.o;
import com.avito.android.passport.profile_add.perf_const.SetProfileNameScreen;
import com.avito.android.remote.A1;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import com.avito.android.util.architecture_components.D;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import kotlinx.coroutines.flow.Z1;

/* compiled from: DaggerSetProfileNameComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerSetProfileNameComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.passport.profile_add.create_flow.set_profile_name.di.b.a
        public final com.avito.android.passport.profile_add.create_flow.set_profile_name.di.b a(SetProfileNameArgs setProfileNameArgs, S0 s02, InterfaceC39417a interfaceC39417a, com.avito.android.passport.profile_add.di.a aVar, Z1 z12, Z1 z13, D d12, r rVar, SetProfileNameScreen setProfileNameScreen, l lVar, boolean z14) {
            setProfileNameArgs.getClass();
            interfaceC39417a.getClass();
            z12.getClass();
            z13.getClass();
            d12.getClass();
            setProfileNameScreen.getClass();
            return new c(aVar, interfaceC39417a, setProfileNameArgs, s02, z12, z13, d12, rVar, setProfileNameScreen, lVar, Boolean.valueOf(z14), null);
        }
    }

    /* compiled from: DaggerSetProfileNameComponent.java */
    public static final class c implements com.avito.android.passport.profile_add.create_flow.set_profile_name.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f212071a;

        /* renamed from: b, reason: collision with root package name */
        public final D<Navigation> f212072b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.di.a f212073c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f212074d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f212075e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.i f212076f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f212077g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f212078h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f212079i;

        /* renamed from: j, reason: collision with root package name */
        public final M50.c f212080j;

        /* renamed from: k, reason: collision with root package name */
        public final u<R0> f212081k;

        /* renamed from: l, reason: collision with root package name */
        public final u<I50.a> f212082l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC34401z0> f212083m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.passport_lib.h> f212084n;

        /* renamed from: o, reason: collision with root package name */
        public final u<r60.d> f212085o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC19524a> f212086p;

        /* renamed from: q, reason: collision with root package name */
        public final u<A1> f212087q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.domain.interactor.a> f212088r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.g f212089s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.create_flow.set_profile_name.b> f212090t;

        /* renamed from: u, reason: collision with root package name */
        public final p f212091u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC28481c> f212092v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.l f212093w;

        /* renamed from: x, reason: collision with root package name */
        public final u<C28478k> f212094x;

        /* renamed from: y, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f212095y;

        /* renamed from: z, reason: collision with root package name */
        public final o f212096z;

        /* compiled from: DaggerSetProfileNameComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.create_flow.set_profile_name.di.a$c$a, reason: collision with other inner class name */
        public static final class C6339a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f212097a;

            public C6339a(com.avito.android.passport.profile_add.di.a aVar) {
                this.f212097a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f212097a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSetProfileNameComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f212098a;

            public b(com.avito.android.passport.profile_add.di.a aVar) {
                this.f212098a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f212098a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSetProfileNameComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.create_flow.set_profile_name.di.a$c$c, reason: collision with other inner class name */
        public static final class C6340c implements u<r60.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f212099a;

            public C6340c(com.avito.android.passport.profile_add.di.a aVar) {
                this.f212099a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f212099a.X1();
            }
        }

        /* compiled from: DaggerSetProfileNameComponent.java */
        public static final class d implements u<com.avito.android.passport_lib.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f212100a;

            public d(com.avito.android.passport.profile_add.di.a aVar) {
                this.f212100a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.passport_lib.h hVarD4 = this.f212100a.d4();
                t.c(hVarD4);
                return hVarD4;
            }
        }

        /* compiled from: DaggerSetProfileNameComponent.java */
        public static final class e implements u<I50.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f212101a;

            public e(com.avito.android.passport.profile_add.di.a aVar) {
                this.f212101a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                I50.a aVarX3 = this.f212101a.X3();
                t.c(aVarX3);
                return aVarX3;
            }
        }

        /* compiled from: DaggerSetProfileNameComponent.java */
        public static final class f implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f212102a;

            public f(com.avito.android.passport.profile_add.di.a aVar) {
                this.f212102a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0P5 = this.f212102a.P5();
                t.c(interfaceC34401z0P5);
                return interfaceC34401z0P5;
            }
        }

        /* compiled from: DaggerSetProfileNameComponent.java */
        public static final class g implements u<InterfaceC19524a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f212103a;

            public g(com.avito.android.passport.profile_add.di.a aVar) {
                this.f212103a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19524a interfaceC19524aE7 = this.f212103a.e7();
                t.c(interfaceC19524aE7);
                return interfaceC19524aE7;
            }
        }

        /* compiled from: DaggerSetProfileNameComponent.java */
        public static final class h implements u<A1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f212104a;

            public h(com.avito.android.passport.profile_add.di.a aVar) {
                this.f212104a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A1 a1Xg = this.f212104a.xg();
                t.c(a1Xg);
                return a1Xg;
            }
        }

        /* compiled from: DaggerSetProfileNameComponent.java */
        public static final class i implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f212105a;

            public i(com.avito.android.passport.profile_add.di.a aVar) {
                this.f212105a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f212105a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.passport.profile_add.di.a aVar, cv.b bVar, SetProfileNameArgs setProfileNameArgs, S0 s02, Z1 z12, Z1 z13, D d12, r rVar, Screen screen, l lVar, Boolean bool, C6338a c6338a) {
            this.f212071a = bVar;
            this.f212072b = d12;
            this.f212073c = aVar;
            this.f212074d = dagger.internal.l.a(bool);
            dagger.internal.l lVarA = dagger.internal.l.a(z12);
            this.f212075e = lVarA;
            this.f212076f = new com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.i(this.f212074d, lVarA);
            this.f212077g = new C6339a(aVar);
            this.f212078h = dagger.internal.l.a(z13);
            dagger.internal.l lVarA2 = dagger.internal.l.a(setProfileNameArgs);
            this.f212079i = lVarA2;
            com.avito.android.passport.profile_add.create_flow.set_profile_name.di.d dVar = new com.avito.android.passport.profile_add.create_flow.set_profile_name.di.d(lVarA2);
            u<InterfaceC28373a> uVar = this.f212077g;
            this.f212080j = new M50.c(uVar, this.f212078h, this.f212075e, dVar);
            this.f212081k = new b(aVar);
            e eVar = new e(aVar);
            f fVar = new f(aVar);
            d dVar2 = new d(aVar);
            C6340c c6340c = new C6340c(aVar);
            com.avito.android.passport.profile_add.domain.interactor.g gVar = new com.avito.android.passport.profile_add.domain.interactor.g(eVar, fVar, dVar, dVar2, c6340c);
            g gVar2 = new g(aVar);
            u<com.avito.android.passport.profile_add.domain.interactor.a> uVarA = B.a(new com.avito.android.passport.profile_add.di.c(gVar, new com.avito.android.passport.profile_add.domain.interactor.d(dVar, fVar, gVar2, c6340c), new com.avito.android.passport.profile_add.domain.interactor.r(fVar, new h(aVar), gVar2, dVar, uVar, c6340c), dVar));
            this.f212088r = uVarA;
            this.f212089s = new com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.g(this.f212080j, this.f212079i, this.f212075e, this.f212081k, uVarA);
            u<com.avito.android.passport.profile_add.create_flow.set_profile_name.b> uVarD = dagger.internal.g.d(com.avito.android.passport.profile_add.create_flow.set_profile_name.d.a());
            this.f212090t = uVarD;
            this.f212091u = new p(this.f212079i, uVarD);
            this.f212092v = new i(aVar);
            this.f212093w = dagger.internal.l.a(screen);
            u<C28478k> uVarD2 = dagger.internal.g.d(new com.avito.android.passport.profile_add.di.d(dagger.internal.l.a(rVar), this.f212093w));
            this.f212094x = uVarD2;
            this.f212095y = dagger.internal.g.d(new C30060h5(this.f212092v, uVarD2));
            this.f212096z = new o(new com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.l(this.f212076f, this.f212089s, n.a(), this.f212091u, this.f212095y));
        }

        @Override // com.avito.android.passport.profile_add.create_flow.set_profile_name.di.b
        public final void a(SetProfileNameFragment setProfileNameFragment) {
            setProfileNameFragment.f212045n0 = this.f212096z;
            setProfileNameFragment.f212047p0 = this.f212095y.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f212071a.u4();
            t.c(aVarU4);
            setProfileNameFragment.f212048q0 = aVarU4;
            setProfileNameFragment.f212049r0 = this.f212072b;
            G50.a aVarD6 = this.f212073c.D6();
            t.c(aVarD6);
            setProfileNameFragment.f212050s0 = aVarD6;
        }
    }

    public static b.a a() {
        return new b();
    }
}
