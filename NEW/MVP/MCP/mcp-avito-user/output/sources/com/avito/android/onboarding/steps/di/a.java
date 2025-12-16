package com.avito.android.onboarding.steps.di;

import Y41.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.onboarding.steps.OnboardingStepsFragment;
import com.avito.android.onboarding.steps.analytics.OnboardingStepsAnalyticsParams;
import com.avito.android.onboarding.steps.di.b;
import com.avito.android.onboarding.steps.mvi.i;
import com.avito.android.onboarding.steps.mvi.p;
import com.avito.android.onboarding.steps.n;
import com.avito.android.onboarding.steps.q;
import com.avito.android.onboarding.steps.t;
import com.avito.android.remote.InterfaceC34389t0;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.u;
import kotlin.G0;

/* compiled from: DaggerOnboardingStepsComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerOnboardingStepsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.onboarding.steps.di.b.a
        public final com.avito.android.onboarding.steps.di.b a(C28478k c28478k, String str, OnboardingStepsAnalyticsParams onboardingStepsAnalyticsParams, l lVar, InterfaceC39417a interfaceC39417a, e eVar) {
            str.getClass();
            onboardingStepsAnalyticsParams.getClass();
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, c28478k, str, onboardingStepsAnalyticsParams, lVar, null);
        }
    }

    /* compiled from: DaggerOnboardingStepsComponent.java */
    public static final class c implements com.avito.android.onboarding.steps.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.onboarding.steps.di.e f209284a;

        /* renamed from: b, reason: collision with root package name */
        public final l<? super H40.b, G0> f209285b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f209286c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f209287d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC34389t0> f209288e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f209289f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.onboarding.steps.l> f209290g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f209291h;

        /* renamed from: i, reason: collision with root package name */
        public final i f209292i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28373a> f209293j;

        /* renamed from: k, reason: collision with root package name */
        public final u<G40.c> f209294k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f209295l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f209296m;

        /* renamed from: n, reason: collision with root package name */
        public final t f209297n;

        /* compiled from: DaggerOnboardingStepsComponent.java */
        /* renamed from: com.avito.android.onboarding.steps.di.a$c$a, reason: collision with other inner class name */
        public static final class C6239a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.onboarding.steps.di.e f209298a;

            public C6239a(com.avito.android.onboarding.steps.di.e eVar) {
                this.f209298a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f209298a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerOnboardingStepsComponent.java */
        public static final class b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.onboarding.steps.di.e f209299a;

            public b(com.avito.android.onboarding.steps.di.e eVar) {
                this.f209299a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f209299a.e();
                dagger.internal.t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerOnboardingStepsComponent.java */
        /* renamed from: com.avito.android.onboarding.steps.di.a$c$c, reason: collision with other inner class name */
        public static final class C6240c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f209300a;

            public C6240c(cv.b bVar) {
                this.f209300a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f209300a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerOnboardingStepsComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.onboarding.steps.di.e f209301a;

            public d(com.avito.android.onboarding.steps.di.e eVar) {
                this.f209301a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f209301a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerOnboardingStepsComponent.java */
        public static final class e implements u<InterfaceC34389t0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.onboarding.steps.di.e f209302a;

            public e(com.avito.android.onboarding.steps.di.e eVar) {
                this.f209302a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34389t0 interfaceC34389t0C4 = this.f209302a.c4();
                dagger.internal.t.c(interfaceC34389t0C4);
                return interfaceC34389t0C4;
            }
        }

        /* compiled from: DaggerOnboardingStepsComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.onboarding.steps.di.e f209303a;

            public f(com.avito.android.onboarding.steps.di.e eVar) {
                this.f209303a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f209303a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.onboarding.steps.di.e eVar, cv.b bVar, C28478k c28478k, String str, OnboardingStepsAnalyticsParams onboardingStepsAnalyticsParams, l lVar, C6238a c6238a) {
            this.f209284a = eVar;
            this.f209285b = lVar;
            this.f209286c = new f(eVar);
            this.f209287d = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f209286c);
            this.f209290g = g.d(new n(new e(eVar), new d(eVar)));
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            this.f209291h = lVarA;
            this.f209292i = new i(lVarA, this.f209290g);
            this.f209293j = new C6239a(eVar);
            u<G40.c> uVarD = g.d(new G40.e(dagger.internal.l.a(onboardingStepsAnalyticsParams), this.f209293j));
            this.f209294k = uVarD;
            C6240c c6240c = new C6240c(bVar);
            b bVar2 = new b(eVar);
            this.f209297n = new t(new com.avito.android.onboarding.steps.mvi.l(this.f209292i, new com.avito.android.onboarding.steps.mvi.f(this.f209291h, uVarD, this.f209290g, c6240c, bVar2), com.avito.android.onboarding.steps.mvi.n.a(), p.a(), this.f209287d));
        }

        @Override // com.avito.android.onboarding.steps.di.b
        public final void a(OnboardingStepsFragment onboardingStepsFragment) {
            onboardingStepsFragment.f209260n0 = this.f209287d.get();
            onboardingStepsFragment.f209261o0 = this.f209297n;
            com.avito.android.util.text.a aVarE = this.f209284a.e();
            dagger.internal.t.c(aVarE);
            onboardingStepsFragment.f209263q0 = new q(aVarE, this.f209285b);
        }
    }

    public static b.a a() {
        return new b();
    }
}
