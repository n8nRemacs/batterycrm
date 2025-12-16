package com.avito.android.passport.profile_add.onboarding;

import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30065i;
import com.avito.android.passport.profile_add.onboarding.k;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPassportOnboardingComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPassportOnboardingComponent.java */
    public static final class b implements k.a {
        public b() {
        }
    }

    /* compiled from: DaggerPassportOnboardingComponent.java */
    public static final class c implements k {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f213559a;

        /* renamed from: b, reason: collision with root package name */
        public final l f213560b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f213561c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.onboarding.mvi.e f213562d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28481c> f213563e;

        /* renamed from: f, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f213564f;

        /* renamed from: g, reason: collision with root package name */
        public final r f213565g;

        /* compiled from: DaggerPassportOnboardingComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.onboarding.a$c$a, reason: collision with other inner class name */
        public static final class C6404a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f213566a;

            public C6404a(cv.b bVar) {
                this.f213566a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f213566a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerPassportOnboardingComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final l f213567a;

            public b(l lVar) {
                this.f213567a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f213567a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(cv.b bVar, l lVar, com.avito.android.analytics.screens.r rVar, C6403a c6403a) {
            this.f213559a = bVar;
            this.f213560b = lVar;
            this.f213562d = new com.avito.android.passport.profile_add.onboarding.mvi.e(new C6404a(bVar));
            this.f213563e = new b(lVar);
            this.f213564f = dagger.internal.g.d(new C30065i(this.f213563e, new n(dagger.internal.l.a(rVar))));
            this.f213565g = new r(new com.avito.android.passport.profile_add.onboarding.mvi.h(this.f213562d, com.avito.android.passport.profile_add.onboarding.mvi.b.a(), com.avito.android.passport.profile_add.onboarding.mvi.j.a(), com.avito.android.passport.profile_add.onboarding.mvi.l.a(), this.f213564f));
        }
    }
}
