package com.avito.android.travel_onboarding.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.travel_onboarding.TravelOnboardingFragment;
import com.avito.android.travel_onboarding.di.b;
import com.avito.android.travel_onboarding.i;
import com.avito.android.travel_onboarding.mvi.h;
import com.avito.android.travel_onboarding.mvi.j;
import com.avito.android.travel_onboarding.mvi.n;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTravelOnboardingComponent.java */
@e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTravelOnboardingComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.travel_onboarding.di.b.a
        public final com.avito.android.travel_onboarding.di.b a(d dVar, InterfaceC39417a interfaceC39417a, String str, DeepLink deepLink, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, str, deepLink, c28478k, null);
        }
    }

    /* compiled from: DaggerTravelOnboardingComponent.java */
    public static final class c implements com.avito.android.travel_onboarding.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f302237a;

        /* renamed from: b, reason: collision with root package name */
        public final l f302238b;

        /* renamed from: c, reason: collision with root package name */
        public final u<WE0.a> f302239c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f302240d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f302241e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.travel_onboarding.mvi.e f302242f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.travel_onboarding.mvi.c f302243g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.travel_onboarding.mvi.l f302244h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f302245i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f302246j;

        /* renamed from: k, reason: collision with root package name */
        public final i f302247k;

        /* compiled from: DaggerTravelOnboardingComponent.java */
        /* renamed from: com.avito.android.travel_onboarding.di.a$c$a, reason: collision with other inner class name */
        public static final class C9256a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_onboarding.di.d f302248a;

            public C9256a(com.avito.android.travel_onboarding.di.d dVar) {
                this.f302248a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f302248a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerTravelOnboardingComponent.java */
        public static final class b implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_onboarding.di.d f302249a;

            public b(com.avito.android.travel_onboarding.di.d dVar) {
                this.f302249a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f302249a.v();
                t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerTravelOnboardingComponent.java */
        /* renamed from: com.avito.android.travel_onboarding.di.a$c$c, reason: collision with other inner class name */
        public static final class C9257c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_onboarding.di.d f302250a;

            public C9257c(com.avito.android.travel_onboarding.di.d dVar) {
                this.f302250a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f302250a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTravelOnboardingComponent.java */
        public static final class d implements u<WE0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_onboarding.di.d f302251a;

            public d(com.avito.android.travel_onboarding.di.d dVar) {
                this.f302251a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                WE0.a aVarA8 = this.f302251a.a8();
                t.c(aVarA8);
                return aVarA8;
            }
        }

        public c(com.avito.android.travel_onboarding.di.d dVar, cv.b bVar, String str, DeepLink deepLink, C28478k c28478k, C9255a c9255a) {
            this.f302237a = bVar;
            this.f302238b = l.a(str);
            l lVarA = l.a(deepLink);
            com.avito.android.travel_onboarding.domain.interactors.d dVar2 = new com.avito.android.travel_onboarding.domain.interactors.d(new d(dVar));
            com.avito.android.travel_onboarding.domain.interactors.b bVar2 = new com.avito.android.travel_onboarding.domain.interactors.b(new C9256a(dVar), new b(dVar));
            this.f302242f = new com.avito.android.travel_onboarding.mvi.e(this.f302238b, lVarA, dVar2, bVar2);
            this.f302243g = new com.avito.android.travel_onboarding.mvi.c(dVar2, bVar2);
            this.f302244h = new com.avito.android.travel_onboarding.mvi.l(n.a());
            this.f302245i = new C9257c(dVar);
            this.f302246j = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f302245i);
            this.f302247k = new i(new h(this.f302242f, this.f302243g, j.a(), this.f302244h, this.f302246j));
        }

        @Override // com.avito.android.travel_onboarding.di.b
        public final void a(TravelOnboardingFragment travelOnboardingFragment) {
            travelOnboardingFragment.f302218h0 = this.f302247k;
            travelOnboardingFragment.f302220j0 = this.f302246j.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f302237a.u4();
            t.c(aVarU4);
            travelOnboardingFragment.f302222l0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
