package com.avito.android.publish.scanner_v2.di;

import Be0.InterfaceC13140a;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
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
import com.avito.android.publish.scanner_v2.ScannerOpenParams;
import com.avito.android.publish.scanner_v2.di.b;
import com.avito.android.publish.scanner_v2.vinscanner.VinScannerFragment;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.VinScanner;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import oe0.C44766c;
import oe0.InterfaceC44764a;
import oe0.InterfaceC44767d;
import yc.C50213a;

/* compiled from: DaggerVinScannerComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerVinScannerComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.publish.scanner_v2.di.b.a
        public final com.avito.android.publish.scanner_v2.di.b a(F70.a aVar, com.avito.android.publish.scanner_v2.di.c cVar, InterfaceC39417a interfaceC39417a, VinScannerFragment vinScannerFragment, VinScannerFragment vinScannerFragment2, VinScanner vinScanner, int i12, ScannerOpenParams scannerOpenParams, C28478k c28478k) {
            interfaceC39417a.getClass();
            vinScanner.getClass();
            scannerOpenParams.getClass();
            return new c(aVar, interfaceC39417a, cVar, vinScannerFragment, vinScannerFragment2, vinScanner, Integer.valueOf(i12), scannerOpenParams, c28478k, null);
        }
    }

    /* compiled from: DaggerVinScannerComponent.java */
    public static final class c implements com.avito.android.publish.scanner_v2.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f239368A;

        /* renamed from: B, reason: collision with root package name */
        public final u<R0> f239369B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.l f239370C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.util.R0> f239371D;

        /* renamed from: E, reason: collision with root package name */
        public final com.avito.android.publish.scanner_v2.vinscanner.mvi.m f239372E;

        /* renamed from: F, reason: collision with root package name */
        public final com.avito.android.publish.scanner_v2.vinscanner.l f239373F;

        /* renamed from: G, reason: collision with root package name */
        public final u<C0> f239374G;

        /* renamed from: H, reason: collision with root package name */
        public final u<InterfaceC28481c> f239375H;

        /* renamed from: I, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f239376I;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.scanner_v2.di.c f239377a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC33237k> f239378b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC33232f> f239379c;

        /* renamed from: d, reason: collision with root package name */
        public final u<Application> f239380d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.photo_storage.a> f239381e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Context> f239382f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.device_orientation.i> f239383g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC33173d.a> f239384h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC35745a5> f239385i;

        /* renamed from: j, reason: collision with root package name */
        public final u<x> f239386j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC33170a> f239387k;

        /* renamed from: l, reason: collision with root package name */
        public final u<C> f239388l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.device_orientation.f> f239389m;

        /* renamed from: n, reason: collision with root package name */
        public final u<F> f239390n;

        /* renamed from: o, reason: collision with root package name */
        public final u<SharedPhotosStorage> f239391o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC33173d> f239392p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f239393q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC44767d> f239394r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC44764a> f239395s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.publish.scanner_v2.scanner_manual_bottom_sheet.a> f239396t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC28373a> f239397u;

        /* renamed from: v, reason: collision with root package name */
        public final u<C50213a> f239398v;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC13140a> f239399w;

        /* renamed from: x, reason: collision with root package name */
        public final u<H0> f239400x;

        /* renamed from: y, reason: collision with root package name */
        public final u<CategoryParametersConverter> f239401y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.publish.scanner.i> f239402z;

        /* compiled from: DaggerVinScannerComponent.java */
        /* renamed from: com.avito.android.publish.scanner_v2.di.a$c$a, reason: collision with other inner class name */
        public static final class C7199a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner_v2.di.c f239403a;

            public C7199a(com.avito.android.publish.scanner_v2.di.c cVar) {
                this.f239403a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f239403a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerVinScannerComponent.java */
        public static final class b implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner_v2.di.c f239404a;

            public b(com.avito.android.publish.scanner_v2.di.c cVar) {
                this.f239404a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f239404a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerVinScannerComponent.java */
        /* renamed from: com.avito.android.publish.scanner_v2.di.a$c$c, reason: collision with other inner class name */
        public static final class C7200c implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner_v2.di.c f239405a;

            public C7200c(com.avito.android.publish.scanner_v2.di.c cVar) {
                this.f239405a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f239405a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerVinScannerComponent.java */
        public static final class d implements u<CategoryParametersConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner_v2.di.c f239406a;

            public d(com.avito.android.publish.scanner_v2.di.c cVar) {
                this.f239406a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CategoryParametersConverter categoryParametersConverterI = this.f239406a.I();
                t.c(categoryParametersConverterI);
                return categoryParametersConverterI;
            }
        }

        /* compiled from: DaggerVinScannerComponent.java */
        public static final class e implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner_v2.di.c f239407a;

            public e(com.avito.android.publish.scanner_v2.di.c cVar) {
                this.f239407a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f239407a.g();
            }
        }

        /* compiled from: DaggerVinScannerComponent.java */
        public static final class f implements u<com.avito.android.util.R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner_v2.di.c f239408a;

            public f(com.avito.android.publish.scanner_v2.di.c cVar) {
                this.f239408a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.R0 r0C = this.f239408a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVinScannerComponent.java */
        public static final class g implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner_v2.di.c f239409a;

            public g(com.avito.android.publish.scanner_v2.di.c cVar) {
                this.f239409a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f239409a.D1();
                t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerVinScannerComponent.java */
        public static final class h implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner_v2.di.c f239410a;

            public h(com.avito.android.publish.scanner_v2.di.c cVar) {
                this.f239410a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0I3 = this.f239410a.I3();
                t.c(h0I3);
                return h0I3;
            }
        }

        /* compiled from: DaggerVinScannerComponent.java */
        public static final class i implements u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner_v2.di.c f239411a;

            public i(com.avito.android.publish.scanner_v2.di.c cVar) {
                this.f239411a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f239411a.u();
                t.c(c0U);
                return c0U;
            }
        }

        /* compiled from: DaggerVinScannerComponent.java */
        public static final class j implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner_v2.di.c f239412a;

            public j(com.avito.android.publish.scanner_v2.di.c cVar) {
                this.f239412a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f239412a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerVinScannerComponent.java */
        public static final class k implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner_v2.di.c f239413a;

            public k(com.avito.android.publish.scanner_v2.di.c cVar) {
                this.f239413a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f239413a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerVinScannerComponent.java */
        public static final class l implements u<SharedPhotosStorage> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner_v2.di.c f239414a;

            public l(com.avito.android.publish.scanner_v2.di.c cVar) {
                this.f239414a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f239414a.b2();
            }
        }

        /* compiled from: DaggerVinScannerComponent.java */
        public static final class m implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.scanner_v2.di.c f239415a;

            public m(com.avito.android.publish.scanner_v2.di.c cVar) {
                this.f239415a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f239415a.o();
            }
        }

        public c(F70.a aVar, cv.b bVar, com.avito.android.publish.scanner_v2.di.c cVar, VinScannerFragment vinScannerFragment, Fragment fragment, VinScanner vinScanner, Integer num, ScannerOpenParams scannerOpenParams, C28478k c28478k, C7198a c7198a) {
            this.f239377a = cVar;
            u<InterfaceC33237k> uVarA = B.a(new F70.e(aVar));
            this.f239378b = uVarA;
            this.f239379c = B.a(new F70.b(aVar, uVarA));
            this.f239381e = B.a(new F70.f(aVar, new b(cVar)));
            e eVar = new e(cVar);
            this.f239382f = eVar;
            this.f239383g = dagger.internal.g.d(new p(eVar));
            this.f239384h = dagger.internal.g.d(dagger.internal.l.a(vinScannerFragment));
            this.f239385i = new j(cVar);
            u<x> uVarD = dagger.internal.g.d(new C33033c(dagger.internal.l.a(fragment)));
            this.f239386j = uVarD;
            this.f239387k = B.a(new F70.g(aVar, uVarD));
            this.f239388l = B.a(new F70.d(aVar));
            this.f239389m = B.a(new F70.h(aVar));
            u<F> uVarD2 = dagger.internal.g.d(new com.avito.android.publish.scanner_v2.di.f(this.f239385i));
            this.f239390n = uVarD2;
            this.f239392p = B.a(new F70.c(aVar, this.f239379c, this.f239381e, this.f239383g, this.f239384h, this.f239385i, this.f239387k, this.f239388l, this.f239389m, uVarD2, new l(cVar)));
            u<InterfaceC44767d> uVarD3 = dagger.internal.g.d(new oe0.f(new C7200c(cVar)));
            this.f239394r = uVarD3;
            this.f239395s = dagger.internal.g.d(new C44766c(uVarD3));
            this.f239396t = dagger.internal.g.d(com.avito.android.publish.scanner_v2.scanner_manual_bottom_sheet.c.a());
            C7199a c7199a = new C7199a(cVar);
            g gVar = new g(cVar);
            this.f239398v = gVar;
            this.f239399w = dagger.internal.g.d(new Be0.c(c7199a, gVar, this.f239386j));
            this.f239400x = new h(cVar);
            this.f239401y = new d(cVar);
            u<com.avito.android.publish.scanner.i> uVarA2 = B.a(new com.avito.android.publish.scanner_v2.di.h(dagger.internal.l.a(scannerOpenParams), this.f239382f));
            this.f239402z = uVarA2;
            this.f239369B = B.a(new com.avito.android.publish.scanner_v2.di.g(uVarA2, this.f239400x, this.f239398v, this.f239401y, new m(cVar)));
            dagger.internal.l lVarA = dagger.internal.l.a(vinScanner);
            this.f239370C = lVarA;
            com.avito.android.publish.scanner_v2.vinscanner.mvi.f fVar = new com.avito.android.publish.scanner_v2.vinscanner.mvi.f(lVarA, this.f239369B, new f(cVar));
            this.f239372E = new com.avito.android.publish.scanner_v2.vinscanner.mvi.m(lVarA);
            this.f239373F = new com.avito.android.publish.scanner_v2.vinscanner.l(new com.avito.android.publish.scanner_v2.vinscanner.mvi.i(fVar, com.avito.android.publish.scanner_v2.vinscanner.mvi.k.a(), this.f239372E, this.f239370C));
            this.f239374G = new i(cVar);
            this.f239375H = new k(cVar);
            this.f239376I = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f239375H);
        }

        @Override // com.avito.android.publish.scanner_v2.di.b
        public final void a(VinScannerFragment vinScannerFragment) {
            com.avito.android.publish.scanner_v2.di.c cVar = this.f239377a;
            com.avito.android.publish.view.result_handler.a aVarF1 = cVar.F1();
            t.c(aVarF1);
            vinScannerFragment.f245673n0 = aVarF1;
            vinScannerFragment.f239437o0 = this.f239392p.get();
            vinScannerFragment.f239438p0 = this.f239395s.get();
            vinScannerFragment.f239439q0 = this.f239396t.get();
            vinScannerFragment.f239440r0 = cVar.h();
            vinScannerFragment.f239441s0 = this.f239399w.get();
            vinScannerFragment.f239442t0 = this.f239373F;
            vinScannerFragment.f239444v0 = this.f239374G;
            vinScannerFragment.f239446x0 = this.f239376I.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
