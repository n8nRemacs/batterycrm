package com.avito.android.beduin.di.screen;

import Hr.InterfaceC14024a;
import Xi.C17013a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.screens.w;
import com.avito.android.analytics.screens.x;
import com.avito.android.beduin.common.actionhandler.C28764l0;
import com.avito.android.beduin.di.InterfaceC28862y;
import com.avito.android.beduin.di.screen.b;
import com.avito.android.beduin.network.model.screen.BottomSheetScreenModel;
import com.avito.android.beduin.network.model.screen.BottomSheetWithTabsScreenModel;
import com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet.BottomSheetScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.BottomSheetWithTabsScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.tab.BeduinTabFragment;
import com.avito.android.beduin.ui.screen.fragment.tabs.TabsScreenFragment;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import com.avito.android.beduin.ui.screen.fragment.tabs.q;
import com.avito.android.beduin.ui.screen.perf.BaseBeduinScreen;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.util.InterfaceC35745a5;
import com.google.common.collect.AbstractC37412t1;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import gj.InterfaceC40691b;
import zi.C50569a;
import zi.C50570b;

/* compiled from: DaggerBeduinScreenFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class p {

    /* compiled from: DaggerBeduinScreenFragmentComponent.java */
    public static final class b implements com.avito.android.beduin.di.screen.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.beduin.di.screen.c f103981a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC28862y f103982b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.universal_map.j f103983c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.beduin.common.local_deeplink.e> f103984d = dagger.internal.g.d(com.avito.android.beduin.common.local_deeplink.g.a());

        /* renamed from: e, reason: collision with root package name */
        public final u<gj.d> f103985e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f103986f;

        /* renamed from: g, reason: collision with root package name */
        public final u<a.b> f103987g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.beduin.common.local_deeplink.b> f103988h;

        /* renamed from: i, reason: collision with root package name */
        public final C28764l0 f103989i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C17013a> f103990j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.beduin.common.actionhandler.update_navbar_title.a> f103991k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f103992l;

        /* renamed from: m, reason: collision with root package name */
        public final u<w> f103993m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.l f103994n;

        /* renamed from: o, reason: collision with root package name */
        public final u<C28478k> f103995o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f103996p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC40691b> f103997q;

        /* compiled from: DaggerBeduinScreenFragmentComponent.java */
        public static final class a implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28862y f103998a;

            public a(InterfaceC28862y interfaceC28862y) {
                this.f103998a = interfaceC28862y;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f103998a.El();
            }
        }

        /* compiled from: DaggerBeduinScreenFragmentComponent.java */
        /* renamed from: com.avito.android.beduin.di.screen.p$b$b, reason: collision with other inner class name */
        public static final class C3115b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f103999a;

            public C3115b(cv.b bVar) {
                this.f103999a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f103999a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerBeduinScreenFragmentComponent.java */
        public static final class c implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f104000a;

            public c(cv.b bVar) {
                this.f104000a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f104000a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerBeduinScreenFragmentComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f104001a;

            public d(InterfaceC30106l7 interfaceC30106l7) {
                this.f104001a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f104001a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(InterfaceC28862y interfaceC28862y, com.avito.android.beduin.di.screen.c cVar, InterfaceC30106l7 interfaceC30106l7, cv.b bVar, com.avito.android.universal_map.j jVar, Screen screen, r rVar, a aVar) {
            this.f103981a = cVar;
            this.f103982b = interfaceC28862y;
            this.f103983c = jVar;
            this.f103985e = new a(interfaceC28862y);
            this.f103986f = new C3115b(bVar);
            this.f103987g = new c(bVar);
            u<com.avito.android.beduin.common.local_deeplink.b> uVarD = dagger.internal.g.d(com.avito.android.beduin.common.local_deeplink.d.a());
            this.f103988h = uVarD;
            this.f103989i = new C28764l0(uVarD, this.f103984d);
            this.f103990j = dagger.internal.g.d(Xi.b.f19041a);
            this.f103991k = dagger.internal.g.d(com.avito.android.beduin.common.actionhandler.update_navbar_title.b.a());
            d dVar = new d(interfaceC30106l7);
            this.f103992l = dVar;
            this.f103993m = dagger.internal.g.d(new x(dVar));
            this.f103994n = dagger.internal.l.a(screen);
            u<C28478k> uVarD2 = dagger.internal.g.d(new m(this.f103994n, dagger.internal.l.a(rVar)));
            this.f103995o = uVarD2;
            u<ScreenPerformanceTracker> uVarD3 = dagger.internal.g.d(new n(uVarD2, this.f103992l));
            this.f103996p = uVarD3;
            this.f103997q = dagger.internal.g.d(new f(this.f103985e, this.f103986f, this.f103987g, this.f103989i, this.f103990j, this.f103991k, new C50570b(uVarD3, this.f103993m), this.f103994n));
        }

        @Override // com.avito.android.beduin.di.screen.b
        public final void a(BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment) {
            bottomSheetWithTabsScreenFragment.f104119n0 = g();
            InterfaceC28862y interfaceC28862y = this.f103982b;
            bottomSheetWithTabsScreenFragment.f104120o0 = interfaceC28862y.g1();
            bottomSheetWithTabsScreenFragment.f104121p0 = interfaceC28862y.h();
            InterfaceC28373a interfaceC28373aA = interfaceC28862y.a();
            t.c(interfaceC28373aA);
            bottomSheetWithTabsScreenFragment.f104122q0 = interfaceC28373aA;
            bottomSheetWithTabsScreenFragment.f104123r0 = f();
            bottomSheetWithTabsScreenFragment.f104124s0 = interfaceC28862y.Ad();
            InterfaceC28373a interfaceC28373aA2 = interfaceC28862y.a();
            t.c(interfaceC28373aA2);
            bottomSheetWithTabsScreenFragment.f104218N0 = new com.avito.android.beduin.domain.screen.analytics.a(interfaceC28373aA2);
        }

        @Override // com.avito.android.beduin.di.screen.b
        public final void b(BottomSheetScreenFragment bottomSheetScreenFragment) {
            bottomSheetScreenFragment.f104119n0 = g();
            InterfaceC28862y interfaceC28862y = this.f103982b;
            bottomSheetScreenFragment.f104120o0 = interfaceC28862y.g1();
            bottomSheetScreenFragment.f104121p0 = interfaceC28862y.h();
            InterfaceC28373a interfaceC28373aA = interfaceC28862y.a();
            t.c(interfaceC28373aA);
            bottomSheetScreenFragment.f104122q0 = interfaceC28373aA;
            bottomSheetScreenFragment.f104123r0 = f();
            bottomSheetScreenFragment.f104124s0 = interfaceC28862y.Ad();
            bottomSheetScreenFragment.f104161K0 = f();
            bottomSheetScreenFragment.f104162L0 = interfaceC28862y.z4();
        }

        @Override // com.avito.android.beduin.di.screen.b
        public final void c(BeduinBaseScreenFragment<com.avito.android.beduin.ui.screen.fragment.i> beduinBaseScreenFragment) {
            beduinBaseScreenFragment.f104119n0 = g();
            InterfaceC28862y interfaceC28862y = this.f103982b;
            beduinBaseScreenFragment.f104120o0 = interfaceC28862y.g1();
            beduinBaseScreenFragment.f104121p0 = interfaceC28862y.h();
            InterfaceC28373a interfaceC28373aA = interfaceC28862y.a();
            t.c(interfaceC28373aA);
            beduinBaseScreenFragment.f104122q0 = interfaceC28373aA;
            beduinBaseScreenFragment.f104123r0 = f();
            beduinBaseScreenFragment.f104124s0 = interfaceC28862y.Ad();
        }

        @Override // com.avito.android.beduin.di.screen.b
        public final void d(TabsScreenFragment tabsScreenFragment) {
            tabsScreenFragment.f104119n0 = g();
            InterfaceC28862y interfaceC28862y = this.f103982b;
            tabsScreenFragment.f104120o0 = interfaceC28862y.g1();
            tabsScreenFragment.f104121p0 = interfaceC28862y.h();
            InterfaceC28373a interfaceC28373aA = interfaceC28862y.a();
            t.c(interfaceC28373aA);
            tabsScreenFragment.f104122q0 = interfaceC28373aA;
            tabsScreenFragment.f104123r0 = f();
            tabsScreenFragment.f104124s0 = interfaceC28862y.Ad();
            tabsScreenFragment.f104313F0 = new com.avito.android.beduin.common.navigation_bar.b();
            tabsScreenFragment.f104314G0 = this.f103983c.y4();
            com.avito.android.ui.status_bar.e eVarB0 = interfaceC28862y.b0();
            t.c(eVarB0);
            tabsScreenFragment.f104315H0 = eVarB0;
            tabsScreenFragment.f104316I0 = new q();
            InterfaceC14024a interfaceC14024aL = interfaceC28862y.L();
            t.c(interfaceC14024aL);
            tabsScreenFragment.f104317J0 = interfaceC14024aL;
        }

        @Override // com.avito.android.beduin.di.screen.b
        public final void e(BeduinTabFragment beduinTabFragment) {
            beduinTabFragment.f104279n0 = this.f103997q.get();
            InterfaceC35745a5 interfaceC35745a5D = this.f103982b.d();
            t.c(interfaceC35745a5D);
            beduinTabFragment.f104280o0 = interfaceC35745a5D;
        }

        public final C50569a f() {
            return new C50569a(this.f103993m.get(), this.f103996p.get());
        }

        public final com.avito.android.beduin.ui.screen.fragment.o g() {
            com.avito.android.beduin.domain.screen.a aVarNc = this.f103981a.nc();
            t.c(aVarNc);
            com.avito.android.beduin.common.local_deeplink.e eVar = this.f103984d.get();
            InterfaceC35745a5 interfaceC35745a5D = this.f103982b.d();
            t.c(interfaceC35745a5D);
            com.avito.android.beduin.ui.screen.fragment.l lVar = new com.avito.android.beduin.ui.screen.fragment.l(aVarNc, eVar, interfaceC35745a5D, this.f103997q.get(), this.f103990j.get(), this.f103991k.get());
            com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.l lVar2 = new com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.l(this.f103997q.get());
            com.avito.android.beduin.di.screen.d.f103959a.getClass();
            return new com.avito.android.beduin.ui.screen.fragment.o(lVar, AbstractC37412t1.p(BottomSheetWithTabsScreenModel.class, lVar2, BottomSheetScreenModel.class, new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.o(this.f103997q.get()), TabsScreenModel.class, new com.avito.android.beduin.ui.screen.fragment.tabs.t(this.f103997q.get())));
        }
    }

    /* compiled from: DaggerBeduinScreenFragmentComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.beduin.di.screen.b.a
        public final com.avito.android.beduin.di.screen.b a(InterfaceC28862y interfaceC28862y, com.avito.android.beduin.di.screen.c cVar, InterfaceC30106l7 interfaceC30106l7, InterfaceC39417a interfaceC39417a, com.avito.android.universal_map.j jVar, BaseBeduinScreen baseBeduinScreen, r rVar) {
            interfaceC39417a.getClass();
            return new b(interfaceC28862y, cVar, interfaceC30106l7, interfaceC39417a, jVar, baseBeduinScreen, rVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
