package com.avito.android.autoteka.di.reportGeneration;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.deeplinks.ReportGenerationDetails;
import com.avito.android.autoteka.di.reportGeneration.a;
import com.avito.android.autoteka.presentation.reportGeneration.AutotekaReportGenerationActivity;
import com.avito.android.autoteka.presentation.reportGeneration.mvi.i;
import com.avito.android.autoteka.presentation.reportGeneration.mvi.k;
import com.avito.android.autoteka.presentation.reportGeneration.mvi.m;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import yf.l;
import yj0.InterfaceC50257a;

/* compiled from: DaggerAutotekaReportGenerationComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class f {

    /* compiled from: DaggerAutotekaReportGenerationComponent.java */
    public static final class b implements com.avito.android.autoteka.di.reportGeneration.a {

        /* renamed from: a, reason: collision with root package name */
        public final l f96584a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC50257a> f96585b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.autoteka.data.reportStatus.a> f96586c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.reportGeneration.mvi.f f96587d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.reportGeneration.mvi.d f96588e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f96589f;

        /* renamed from: g, reason: collision with root package name */
        public final k f96590g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f96591h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f96592i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.reportGeneration.e f96593j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.autoteka.items.reportGeneration.b f96594k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f96595l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f96596m;

        /* renamed from: n, reason: collision with root package name */
        public final u<j> f96597n;

        /* compiled from: DaggerAutotekaReportGenerationComponent.java */
        public static final class a implements u<InterfaceC50257a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96598a;

            public a(l lVar) {
                this.f96598a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50257a interfaceC50257aKl = this.f96598a.kl();
                t.c(interfaceC50257aKl);
                return interfaceC50257aKl;
            }
        }

        /* compiled from: DaggerAutotekaReportGenerationComponent.java */
        /* renamed from: com.avito.android.autoteka.di.reportGeneration.f$b$b, reason: collision with other inner class name */
        public static final class C2868b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96599a;

            public C2868b(l lVar) {
                this.f96599a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f96599a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerAutotekaReportGenerationComponent.java */
        public static final class c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f96600a;

            public c(cv.b bVar) {
                this.f96600a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f96600a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        public b() {
            throw null;
        }

        public b(l lVar, cv.b bVar, ReportGenerationDetails reportGenerationDetails, Y41.l lVar2, C28478k c28478k, a aVar) {
            this.f96584a = lVar;
            this.f96586c = g.d(new com.avito.android.autoteka.data.reportStatus.e(new a(lVar)));
            dagger.internal.l lVarA = dagger.internal.l.a(reportGenerationDetails);
            u<com.avito.android.autoteka.data.reportStatus.a> uVar = this.f96586c;
            this.f96587d = new com.avito.android.autoteka.presentation.reportGeneration.mvi.f(lVarA, uVar);
            this.f96588e = new com.avito.android.autoteka.presentation.reportGeneration.mvi.d(lVarA, uVar);
            this.f96590g = new k(lVarA, new c(bVar));
            this.f96591h = new C2868b(lVar);
            this.f96592i = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f96591h);
            this.f96593j = new com.avito.android.autoteka.presentation.reportGeneration.e(new i(this.f96587d, this.f96588e, this.f96590g, m.a(), this.f96592i));
            this.f96594k = new com.avito.android.autoteka.items.reportGeneration.b(com.avito.android.autoteka.items.reportGeneration.e.a());
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar2);
            u<com.avito.konveyor.a> uVarD = g.d(new d(this.f96594k, new com.avito.android.autoteka.items.fullScreenError.reportGenerationError.b(new com.avito.android.autoteka.items.fullScreenError.reportGenerationError.f(lVarA2)), new com.avito.android.autoteka.items.reportGenerationResponse.b(new com.avito.android.autoteka.items.reportGenerationResponse.g(lVarA2))));
            this.f96595l = uVarD;
            u<com.avito.konveyor.adapter.a> uVarD2 = g.d(new com.avito.android.autoteka.di.reportGeneration.c(uVarD));
            this.f96596m = uVarD2;
            this.f96597n = g.d(new e(uVarD2, this.f96595l));
        }

        @Override // com.avito.android.autoteka.di.reportGeneration.a
        public final void a(AutotekaReportGenerationActivity autotekaReportGenerationActivity) {
            autotekaReportGenerationActivity.f97757m = this.f96593j;
            autotekaReportGenerationActivity.f97759o = this.f96597n.get();
            autotekaReportGenerationActivity.f97760p = this.f96596m.get();
            autotekaReportGenerationActivity.f97761q = this.f96584a.x();
            autotekaReportGenerationActivity.f97762r = this.f96592i.get();
        }
    }

    /* compiled from: DaggerAutotekaReportGenerationComponent.java */
    public static final class c implements a.InterfaceC2867a {
        public c() {
        }

        @Override // com.avito.android.autoteka.di.reportGeneration.a.InterfaceC2867a
        public final com.avito.android.autoteka.di.reportGeneration.a a(l lVar, InterfaceC39417a interfaceC39417a, ReportGenerationDetails reportGenerationDetails, Y41.l lVar2, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new b(lVar, interfaceC39417a, reportGenerationDetails, lVar2, c28478k, null);
        }
    }

    public static a.InterfaceC2867a a() {
        return new c();
    }
}
