package com.avito.android.barcode_scanner_impl.di;

import android.content.Context;
import ch.InterfaceC27193a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.barcode_scanner_impl.di.b;
import com.avito.android.barcode_scanner_impl.di.e;
import com.avito.android.barcode_scanner_impl.di.f;
import com.avito.android.barcode_scanner_impl.di.h;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.BarcodeScannerFragment;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.k;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.o;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.q;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.s;
import com.avito.android.barcode_scanner_public.BarcodeScannerParams;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.concurrent.ExecutorService;

/* compiled from: DaggerBarcodeScannerComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class j {

    /* compiled from: DaggerBarcodeScannerComponent.java */
    public static final class b implements com.avito.android.barcode_scanner_impl.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.permissions.u> f98890a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC27193a> f98891b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.i f98892c;

        /* renamed from: d, reason: collision with root package name */
        public final l f98893d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.barcode_scanner_impl.domain.e> f98894e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f98895f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.j> f98896g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.g f98897h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.barcode_scanner_impl.domain.a> f98898i;

        /* renamed from: j, reason: collision with root package name */
        public final q f98899j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f98900k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f98901l;

        /* renamed from: m, reason: collision with root package name */
        public final k f98902m;

        /* renamed from: n, reason: collision with root package name */
        public final u<Context> f98903n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ch.c> f98904o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ExecutorService> f98905p;

        /* compiled from: DaggerBarcodeScannerComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.barcode_scanner_impl.di.c f98906a;

            public a(com.avito.android.barcode_scanner_impl.di.c cVar) {
                this.f98906a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f98906a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerBarcodeScannerComponent.java */
        /* renamed from: com.avito.android.barcode_scanner_impl.di.j$b$b, reason: collision with other inner class name */
        public static final class C2981b implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.barcode_scanner_impl.di.c f98907a;

            public C2981b(com.avito.android.barcode_scanner_impl.di.c cVar) {
                this.f98907a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f98907a.g();
            }
        }

        /* compiled from: DaggerBarcodeScannerComponent.java */
        public static final class c implements u<com.avito.android.permissions.u> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.barcode_scanner_impl.di.c f98908a;

            public c(com.avito.android.barcode_scanner_impl.di.c cVar) {
                this.f98908a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f98908a.V();
            }
        }

        /* compiled from: DaggerBarcodeScannerComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.barcode_scanner_impl.di.c f98909a;

            public d(com.avito.android.barcode_scanner_impl.di.c cVar) {
                this.f98909a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f98909a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.barcode_scanner_impl.di.c cVar, BarcodeScannerParams barcodeScannerParams, C28478k c28478k, a aVar) {
            u<InterfaceC27193a> uVarD = dagger.internal.g.d(new g(new c(cVar)));
            this.f98891b = uVarD;
            this.f98892c = new com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.i(uVarD);
            this.f98893d = l.a(barcodeScannerParams);
            this.f98894e = dagger.internal.g.d(f.a.f98886a);
            u<com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.j> uVarD2 = dagger.internal.g.d(new com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.l(new a(cVar)));
            this.f98896g = uVarD2;
            this.f98897h = new com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.g(this.f98893d, uVarD2, this.f98891b, this.f98894e);
            u<com.avito.android.barcode_scanner_impl.domain.a> uVarD3 = dagger.internal.g.d(e.a.f98885a);
            this.f98898i = uVarD3;
            this.f98899j = new q(this.f98893d, uVarD3);
            this.f98900k = new d(cVar);
            this.f98901l = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f98900k);
            this.f98902m = new k(new o(this.f98892c, this.f98897h, this.f98899j, s.a(), this.f98901l, this.f98896g));
            this.f98904o = dagger.internal.g.d(new i(new C2981b(cVar)));
            this.f98905p = dagger.internal.g.d(h.a.f98888a);
        }

        @Override // com.avito.android.barcode_scanner_impl.di.b
        public final void a(BarcodeScannerFragment barcodeScannerFragment) {
            barcodeScannerFragment.f98925n0 = this.f98902m;
            barcodeScannerFragment.f98927p0 = this.f98901l.get();
            barcodeScannerFragment.f98928q0 = this.f98891b.get();
            barcodeScannerFragment.f98929r0 = this.f98904o.get();
            barcodeScannerFragment.f98930s0 = this.f98905p.get();
        }
    }

    /* compiled from: DaggerBarcodeScannerComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.barcode_scanner_impl.di.b.a
        public final com.avito.android.barcode_scanner_impl.di.b a(BarcodeScannerParams barcodeScannerParams, C28478k c28478k, com.avito.android.barcode_scanner_impl.di.c cVar) {
            return new b(cVar, barcodeScannerParams, c28478k, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
