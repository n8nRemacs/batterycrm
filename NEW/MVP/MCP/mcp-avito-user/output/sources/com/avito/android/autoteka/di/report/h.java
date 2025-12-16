package com.avito.android.autoteka.di.report;

import android.webkit.CookieManager;
import com.avito.android.H0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.data.j;
import com.avito.android.autoteka.deeplinks.ReportDetails;
import com.avito.android.autoteka.di.report.a;
import com.avito.android.autoteka.di.report.d;
import com.avito.android.autoteka.presentation.report.AutotekaReportActivity;
import com.avito.android.autoteka.presentation.report.mvi.n;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.util.C;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import xj0.InterfaceC49957a;
import yf.l;
import yj0.InterfaceC50257a;

/* compiled from: DaggerAutotekaReportComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class h {

    /* compiled from: DaggerAutotekaReportComponent.java */
    public static final class b implements com.avito.android.autoteka.di.report.a {

        /* renamed from: a, reason: collision with root package name */
        public final l f96546a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC49957a> f96547b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC50257a> f96548c;

        /* renamed from: d, reason: collision with root package name */
        public final j f96549d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.report.mvi.g f96550e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.report.mvi.e f96551f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.autoteka.data.a> f96552g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.report.mvi.l f96553h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f96554i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f96555j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.report.f f96556k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.autoteka.items.fullScreenError.report.b f96557l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f96558m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f96559n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f96560o;

        /* renamed from: p, reason: collision with root package name */
        public final u<CookieManager> f96561p;

        /* renamed from: q, reason: collision with root package name */
        public final u<B0> f96562q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f96563r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.b> f96564s;

        /* renamed from: t, reason: collision with root package name */
        public final u<C> f96565t;

        /* renamed from: u, reason: collision with root package name */
        public final u<H0> f96566u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.e> f96567v;

        /* compiled from: DaggerAutotekaReportComponent.java */
        public static final class a implements u<com.avito.android.autoteka.data.a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96568a;

            public a(l lVar) {
                this.f96568a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.autoteka.data.a aVarT1 = this.f96568a.T1();
                t.c(aVarT1);
                return aVarT1;
            }
        }

        /* compiled from: DaggerAutotekaReportComponent.java */
        /* renamed from: com.avito.android.autoteka.di.report.h$b$b, reason: collision with other inner class name */
        public static final class C2865b implements u<InterfaceC50257a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96569a;

            public C2865b(l lVar) {
                this.f96569a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50257a interfaceC50257aKl = this.f96569a.kl();
                t.c(interfaceC50257aKl);
                return interfaceC50257aKl;
            }
        }

        /* compiled from: DaggerAutotekaReportComponent.java */
        public static final class c implements u<InterfaceC49957a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96570a;

            public c(l lVar) {
                this.f96570a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49957a interfaceC49957aZa = this.f96570a.Za();
                t.c(interfaceC49957aZa);
                return interfaceC49957aZa;
            }
        }

        /* compiled from: DaggerAutotekaReportComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96571a;

            public d(l lVar) {
                this.f96571a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f96571a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerAutotekaReportComponent.java */
        public static final class e implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96572a;

            public e(l lVar) {
                this.f96572a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f96572a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerAutotekaReportComponent.java */
        public static final class f implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96573a;

            public f(l lVar) {
                this.f96573a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0M = this.f96573a.M();
                t.c(h0M);
                return h0M;
            }
        }

        /* compiled from: DaggerAutotekaReportComponent.java */
        public static final class g implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96574a;

            public g(l lVar) {
                this.f96574a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f96574a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerAutotekaReportComponent.java */
        /* renamed from: com.avito.android.autoteka.di.report.h$b$h, reason: collision with other inner class name */
        public static final class C2866h implements u<B0> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96575a;

            public C2866h(l lVar) {
                this.f96575a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f96575a.s5();
            }
        }

        public b() {
            throw null;
        }

        public b(l lVar, cv.b bVar, Y41.l lVar2, ReportDetails reportDetails, C28478k c28478k, a aVar) {
            this.f96546a = lVar;
            this.f96549d = new j(new c(lVar), new C2865b(lVar));
            dagger.internal.l lVarA = dagger.internal.l.a(reportDetails);
            j jVar = this.f96549d;
            this.f96550e = new com.avito.android.autoteka.presentation.report.mvi.g(jVar, lVarA);
            this.f96551f = new com.avito.android.autoteka.presentation.report.mvi.e(jVar, lVarA);
            this.f96553h = new com.avito.android.autoteka.presentation.report.mvi.l(lVarA, new a(lVar));
            this.f96554i = new d(lVar);
            u<ScreenPerformanceTracker> uVarD = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f96554i);
            this.f96555j = uVarD;
            this.f96556k = new com.avito.android.autoteka.presentation.report.f(new com.avito.android.autoteka.presentation.report.mvi.j(this.f96550e, this.f96551f, this.f96553h, uVarD, n.a()));
            this.f96557l = new com.avito.android.autoteka.items.fullScreenError.report.b(new com.avito.android.autoteka.items.fullScreenError.report.f(dagger.internal.l.a(lVar2)));
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new com.avito.android.autoteka.di.report.f(this.f96557l, new com.avito.android.autoteka.items.skeleton.report.b(com.avito.android.autoteka.items.skeleton.report.e.a())));
            this.f96558m = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new com.avito.android.autoteka.di.report.c(uVarD2));
            this.f96559n = uVarD3;
            this.f96560o = dagger.internal.g.d(new com.avito.android.autoteka.di.report.g(uVarD3, this.f96558m));
            this.f96561p = dagger.internal.g.d(d.a.f96537a);
            this.f96562q = new C2866h(lVar);
            u<com.avito.android.cookie_provider.b> uVarD4 = dagger.internal.g.d(new com.avito.android.cookie_provider.d(new g(lVar)));
            this.f96564s = uVarD4;
            this.f96567v = dagger.internal.g.d(new com.avito.android.autoteka.di.report.e(uVarD4, this.f96562q, new e(lVar), new f(lVar)));
        }

        @Override // com.avito.android.autoteka.di.report.a
        public final void a(AutotekaReportActivity autotekaReportActivity) {
            autotekaReportActivity.f97672m = this.f96556k;
            autotekaReportActivity.f97674o = this.f96560o.get();
            autotekaReportActivity.f97675p = this.f96559n.get();
            l lVar = this.f96546a;
            autotekaReportActivity.f97676q = lVar.x();
            autotekaReportActivity.f97677r = lVar.h();
            autotekaReportActivity.f97678s = this.f96555j.get();
            autotekaReportActivity.f97679t = this.f96561p.get();
            autotekaReportActivity.f97680u = this.f96567v.get();
        }
    }

    /* compiled from: DaggerAutotekaReportComponent.java */
    public static final class c implements a.InterfaceC2864a {
        public c() {
        }

        @Override // com.avito.android.autoteka.di.report.a.InterfaceC2864a
        public final com.avito.android.autoteka.di.report.a a(l lVar, InterfaceC39417a interfaceC39417a, Y41.l lVar2, ReportDetails reportDetails, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new b(lVar, interfaceC39417a, lVar2, reportDetails, c28478k, null);
        }
    }

    public static a.InterfaceC2864a a() {
        return new c();
    }
}
