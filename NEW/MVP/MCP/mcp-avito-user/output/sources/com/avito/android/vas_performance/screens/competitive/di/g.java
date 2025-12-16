package com.avito.android.vas_performance.screens.competitive.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.util.R0;
import com.avito.android.vas_performance.screens.competitive.di.c;
import com.avito.android.vas_performance.screens.competitive.mvi.j;
import com.avito.android.vas_performance.screens.competitive.ui.CompetitiveVasV2Fragment;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import zL0.InterfaceC50482a;

/* compiled from: DaggerCompetitiveVasV2Component.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class g {

    /* compiled from: DaggerCompetitiveVasV2Component.java */
    public static final class b implements com.avito.android.vas_performance.screens.competitive.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f320409a;

        /* renamed from: b, reason: collision with root package name */
        public final l f320410b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC50482a> f320411c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f320412d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.competitive.mvi.e f320413e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.competitive.mvi.c f320414f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f320415g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.competitive.mvi.l f320416h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f320417i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f320418j;

        /* renamed from: k, reason: collision with root package name */
        public final l f320419k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.competitive.ui.g f320420l;

        /* compiled from: DaggerCompetitiveVasV2Component.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.competitive.di.d f320421a;

            public a(com.avito.android.vas_performance.screens.competitive.di.d dVar) {
                this.f320421a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f320421a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCompetitiveVasV2Component.java */
        /* renamed from: com.avito.android.vas_performance.screens.competitive.di.g$b$b, reason: collision with other inner class name */
        public static final class C9931b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.competitive.di.d f320422a;

            public C9931b(com.avito.android.vas_performance.screens.competitive.di.d dVar) {
                this.f320422a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f320422a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCompetitiveVasV2Component.java */
        public static final class c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.competitive.di.d f320423a;

            public c(com.avito.android.vas_performance.screens.competitive.di.d dVar) {
                this.f320423a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f320423a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerCompetitiveVasV2Component.java */
        public static final class d implements u<InterfaceC50482a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.competitive.di.d f320424a;

            public d(com.avito.android.vas_performance.screens.competitive.di.d dVar) {
                this.f320424a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50482a interfaceC50482aO0 = this.f320424a.o0();
                t.c(interfaceC50482aO0);
                return interfaceC50482aO0;
            }
        }

        public b(com.avito.android.vas_performance.screens.competitive.di.d dVar, cv.b bVar, String str, String str2, Boolean bool, r rVar, PaidServicesResultRepository paidServicesResultRepository, a aVar) {
            this.f320409a = bVar;
            this.f320410b = l.a(str);
            l lVarA = l.a(str2);
            d dVar2 = new d(dVar);
            C9931b c9931b = new C9931b(dVar);
            l lVar = this.f320410b;
            com.avito.android.vas_performance.screens.competitive.domain.b bVar2 = new com.avito.android.vas_performance.screens.competitive.domain.b(lVar, lVarA, dVar2, c9931b);
            this.f320413e = new com.avito.android.vas_performance.screens.competitive.mvi.e(bVar2);
            this.f320414f = new com.avito.android.vas_performance.screens.competitive.mvi.c(bVar2);
            this.f320416h = new com.avito.android.vas_performance.screens.competitive.mvi.l(lVar, new a(dVar));
            this.f320417i = new c(dVar);
            this.f320418j = dagger.internal.g.d(new C30060h5(this.f320417i, new f(l.a(rVar))));
            this.f320419k = l.a(bool);
            this.f320420l = new com.avito.android.vas_performance.screens.competitive.ui.g(new com.avito.android.vas_performance.screens.competitive.mvi.h(this.f320413e, this.f320414f, j.a(), this.f320416h, this.f320418j, this.f320419k));
        }

        @Override // com.avito.android.vas_performance.screens.competitive.di.c
        public final void a(CompetitiveVasV2Fragment competitiveVasV2Fragment) {
            competitiveVasV2Fragment.f320470n0 = this.f320420l;
            competitiveVasV2Fragment.f320472p0 = this.f320418j.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f320409a.u4();
            t.c(aVarU4);
            competitiveVasV2Fragment.f320473q0 = aVarU4;
        }
    }

    /* compiled from: DaggerCompetitiveVasV2Component.java */
    public static final class c implements c.a {
        public c() {
        }

        @Override // com.avito.android.vas_performance.screens.competitive.di.c.a
        public final com.avito.android.vas_performance.screens.competitive.di.c a(String str, String str2, boolean z12, r rVar, PaidServicesResultRepository paidServicesResultRepository, d dVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(dVar, interfaceC39417a, str, str2, Boolean.valueOf(z12), rVar, paidServicesResultRepository, null);
        }
    }

    public static c.a a() {
        return new c();
    }
}
