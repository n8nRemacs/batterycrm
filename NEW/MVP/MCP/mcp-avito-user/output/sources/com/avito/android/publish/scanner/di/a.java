package com.avito.android.publish.scanner.di;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.device_orientation.p;
import com.avito.android.permissions.C33033c;
import com.avito.android.permissions.x;
import com.avito.android.photo_camera_view.C;
import com.avito.android.photo_camera_view.F;
import com.avito.android.photo_camera_view.InterfaceC33170a;
import com.avito.android.photo_camera_view.InterfaceC33173d;
import com.avito.android.photo_picker.InterfaceC33232f;
import com.avito.android.photo_picker.InterfaceC33237k;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.publish.C0;
import com.avito.android.publish.R0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.scanner.ScannerFragment;
import com.avito.android.publish.scanner.ScannerParams;
import com.avito.android.publish.scanner.di.d;
import com.avito.android.publish.scanner.r;
import com.avito.android.publish.scanner.s;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import yc.C50213a;

/* compiled from: DaggerScannerComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerScannerComponent.java */
    public static final class b implements d.a {
        public b() {
        }

        @Override // com.avito.android.publish.scanner.di.d.a
        public final d a(e eVar, F70.a aVar, ScannerFragment scannerFragment, ScannerParams scannerParams, C28478k c28478k, int i12) {
            scannerParams.getClass();
            return new c(new f(), new l(), aVar, eVar, scannerFragment, scannerParams, c28478k, Integer.valueOf(i12), null);
        }
    }

    /* compiled from: DaggerScannerComponent.java */
    public static final class c implements com.avito.android.publish.scanner.di.d {

        /* renamed from: A, reason: collision with root package name */
        public final u<SharedPhotosStorage> f239152A;

        /* renamed from: B, reason: collision with root package name */
        public final u<InterfaceC33173d> f239153B;

        /* renamed from: C, reason: collision with root package name */
        public final u<InterfaceC28481c> f239154C;

        /* renamed from: D, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f239155D;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.scanner.di.e f239156a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC33237k> f239157b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC33232f> f239158c;

        /* renamed from: d, reason: collision with root package name */
        public final u<Application> f239159d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.photo_storage.a> f239160e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Context> f239161f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.device_orientation.i> f239162g;

        /* renamed from: h, reason: collision with root package name */
        public final u<C0> f239163h;

        /* renamed from: i, reason: collision with root package name */
        public final u<H0> f239164i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C50213a> f239165j;

        /* renamed from: k, reason: collision with root package name */
        public final u<CategoryParametersConverter> f239166k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f239167l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.publish.scanner.i> f239168m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f239169n;

        /* renamed from: o, reason: collision with root package name */
        public final u<R0> f239170o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.util.R0> f239171p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC33535v> f239172q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.l f239173r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.publish.scanner.di.c> f239174s;

        /* renamed from: t, reason: collision with root package name */
        public final u<r> f239175t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC35745a5> f239176u;

        /* renamed from: v, reason: collision with root package name */
        public final u<x> f239177v;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC33170a> f239178w;

        /* renamed from: x, reason: collision with root package name */
        public final u<C> f239179x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.device_orientation.f> f239180y;

        /* renamed from: z, reason: collision with root package name */
        public final u<F> f239181z;

        /* compiled from: DaggerScannerComponent.java */
        /* renamed from: com.avito.android.publish.scanner.di.a$c$a, reason: collision with other inner class name */
        public static final class C7188a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner.di.e f239182a;

            public C7188a(com.avito.android.publish.scanner.di.e eVar) {
                this.f239182a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f239182a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerScannerComponent.java */
        public static final class b implements u<CategoryParametersConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner.di.e f239183a;

            public b(com.avito.android.publish.scanner.di.e eVar) {
                this.f239183a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CategoryParametersConverter categoryParametersConverterI = this.f239183a.I();
                t.c(categoryParametersConverterI);
                return categoryParametersConverterI;
            }
        }

        /* compiled from: DaggerScannerComponent.java */
        /* renamed from: com.avito.android.publish.scanner.di.a$c$c, reason: collision with other inner class name */
        public static final class C7189c implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner.di.e f239184a;

            public C7189c(com.avito.android.publish.scanner.di.e eVar) {
                this.f239184a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f239184a.g();
            }
        }

        /* compiled from: DaggerScannerComponent.java */
        public static final class d implements u<com.avito.android.util.R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner.di.e f239185a;

            public d(com.avito.android.publish.scanner.di.e eVar) {
                this.f239185a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.R0 r0C = this.f239185a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerScannerComponent.java */
        public static final class e implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner.di.e f239186a;

            public e(com.avito.android.publish.scanner.di.e eVar) {
                this.f239186a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f239186a.D1();
                t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerScannerComponent.java */
        public static final class f implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner.di.e f239187a;

            public f(com.avito.android.publish.scanner.di.e eVar) {
                this.f239187a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0I3 = this.f239187a.I3();
                t.c(h0I3);
                return h0I3;
            }
        }

        /* compiled from: DaggerScannerComponent.java */
        public static final class g implements u<InterfaceC33535v> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner.di.e f239188a;

            public g(com.avito.android.publish.scanner.di.e eVar) {
                this.f239188a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f239188a.P();
            }
        }

        /* compiled from: DaggerScannerComponent.java */
        public static final class h implements u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner.di.e f239189a;

            public h(com.avito.android.publish.scanner.di.e eVar) {
                this.f239189a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f239189a.u();
                t.c(c0U);
                return c0U;
            }
        }

        /* compiled from: DaggerScannerComponent.java */
        public static final class i implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner.di.e f239190a;

            public i(com.avito.android.publish.scanner.di.e eVar) {
                this.f239190a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f239190a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerScannerComponent.java */
        public static final class j implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner.di.e f239191a;

            public j(com.avito.android.publish.scanner.di.e eVar) {
                this.f239191a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f239191a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerScannerComponent.java */
        public static final class k implements u<SharedPhotosStorage> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner.di.e f239192a;

            public k(com.avito.android.publish.scanner.di.e eVar) {
                this.f239192a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f239192a.b2();
            }
        }

        /* compiled from: DaggerScannerComponent.java */
        public static final class l implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner.di.e f239193a;

            public l(com.avito.android.publish.scanner.di.e eVar) {
                this.f239193a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f239193a.o();
            }
        }

        public c(com.avito.android.publish.scanner.di.f fVar, com.avito.android.publish.scanner.di.l lVar, F70.a aVar, com.avito.android.publish.scanner.di.e eVar, Fragment fragment, ScannerParams scannerParams, C28478k c28478k, Integer num, C7187a c7187a) {
            this.f239156a = eVar;
            u<InterfaceC33237k> uVarA = B.a(new F70.e(aVar));
            this.f239157b = uVarA;
            this.f239158c = B.a(new F70.b(aVar, uVarA));
            this.f239160e = B.a(new F70.f(aVar, new C7188a(eVar)));
            C7189c c7189c = new C7189c(eVar);
            this.f239161f = c7189c;
            this.f239162g = dagger.internal.g.d(new p(c7189c));
            this.f239163h = new h(eVar);
            this.f239164i = new f(eVar);
            this.f239165j = new e(eVar);
            this.f239166k = new b(eVar);
            dagger.internal.l lVarA = dagger.internal.l.a(scannerParams);
            this.f239167l = lVarA;
            u<com.avito.android.publish.scanner.i> uVarA2 = B.a(new com.avito.android.publish.scanner.di.j(fVar, this.f239161f, lVarA));
            this.f239168m = uVarA2;
            this.f239170o = B.a(new com.avito.android.publish.scanner.di.i(fVar, this.f239164i, this.f239165j, this.f239166k, uVarA2, new l(eVar)));
            this.f239171p = new d(eVar);
            this.f239172q = new g(eVar);
            dagger.internal.l lVarA2 = dagger.internal.l.a(num);
            this.f239173r = lVarA2;
            u<com.avito.android.publish.scanner.di.c> uVarD = dagger.internal.g.d(new m(lVar, this.f239163h, lVarA2));
            this.f239174s = uVarD;
            this.f239175t = dagger.internal.g.d(new s(this.f239163h, new com.avito.android.publish.scanner.mvi.g(new com.avito.android.publish.scanner.mvi.d(this.f239167l, this.f239173r, uVarD, this.f239170o, this.f239171p, this.f239172q), com.avito.android.publish.scanner.mvi.k.a(), com.avito.android.publish.scanner.mvi.i.a())));
            this.f239176u = new i(eVar);
            u<x> uVarD2 = dagger.internal.g.d(new C33033c(dagger.internal.l.a(fragment)));
            this.f239177v = uVarD2;
            this.f239178w = B.a(new F70.g(aVar, uVarD2));
            this.f239179x = B.a(new F70.d(aVar));
            this.f239180y = B.a(new F70.h(aVar));
            u<F> uVarD3 = dagger.internal.g.d(new com.avito.android.publish.scanner.di.h(fVar, this.f239176u));
            this.f239181z = uVarD3;
            this.f239153B = B.a(new F70.c(aVar, this.f239158c, this.f239160e, this.f239162g, this.f239175t, this.f239176u, this.f239178w, this.f239179x, this.f239180y, uVarD3, new k(eVar)));
            this.f239154C = new j(eVar);
            this.f239155D = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f239154C);
        }

        @Override // com.avito.android.publish.scanner.di.d
        public final void a(ScannerFragment scannerFragment) {
            com.avito.android.publish.scanner.di.e eVar = this.f239156a;
            com.avito.android.publish.view.result_handler.a aVarF1 = eVar.F1();
            t.c(aVarF1);
            scannerFragment.f245673n0 = aVarF1;
            InterfaceC28373a interfaceC28373aA = eVar.a();
            t.c(interfaceC28373aA);
            scannerFragment.f239121p0 = interfaceC28373aA;
            scannerFragment.f239122q0 = this.f239153B.get();
            scannerFragment.f239123r0 = this.f239162g.get();
            scannerFragment.f239124s0 = eVar.h();
            scannerFragment.f239125t0 = this.f239155D.get();
            u3.l<SimpleTestGroupWithNone> lVarO0 = eVar.O0();
            t.c(lVarO0);
            scannerFragment.f239126u0 = lVarO0;
            scannerFragment.f239127v0 = this.f239175t;
        }
    }

    public static d.a a() {
        return new b();
    }
}
