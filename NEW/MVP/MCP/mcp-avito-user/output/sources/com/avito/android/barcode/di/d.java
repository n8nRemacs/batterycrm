package com.avito.android.barcode.di;

import Qg.C14892a;
import Sg.InterfaceC15183a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.barcode.di.a;
import com.avito.android.barcode.presentation.BarcodeDetailsActivity;
import com.avito.android.barcode.presentation.d;
import com.avito.android.barcode.presentation.mvi.h;
import com.avito.android.barcode.presentation.mvi.j;
import com.avito.android.barcode_encoder.BarcodeFormat;
import com.avito.android.util.L0;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerBarcodeComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class d {

    /* compiled from: DaggerBarcodeComponent.java */
    public static final class b implements com.avito.android.barcode.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.barcode.di.b f98655a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC15183a f98656b;

        /* renamed from: c, reason: collision with root package name */
        public final l f98657c;

        /* renamed from: d, reason: collision with root package name */
        public final l f98658d;

        /* renamed from: e, reason: collision with root package name */
        public final l f98659e;

        /* renamed from: f, reason: collision with root package name */
        public final l f98660f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f98661g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f98662h;

        /* compiled from: DaggerBarcodeComponent.java */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.barcode.di.b f98663a;

            public a(com.avito.android.barcode.di.b bVar) {
                this.f98663a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f98663a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.barcode.di.b bVar, InterfaceC15183a interfaceC15183a, String str, String str2, String str3, BarcodeFormat barcodeFormat, C28478k c28478k, a aVar) {
            this.f98655a = bVar;
            this.f98656b = interfaceC15183a;
            this.f98657c = l.a(str);
            this.f98658d = l.b(str2);
            this.f98659e = l.b(str3);
            l lVarA = l.a(barcodeFormat);
            l lVar = this.f98657c;
            l lVar2 = this.f98658d;
            l lVar3 = this.f98659e;
            this.f98660f = l.a(new com.avito.android.barcode.presentation.f(new com.avito.android.barcode.presentation.e(new h(new com.avito.android.barcode.presentation.mvi.e(lVar, lVar2, lVar3, lVarA), new com.avito.android.barcode.presentation.mvi.c(lVar2, lVar3), j.a(), com.avito.android.barcode.presentation.mvi.l.a()))));
            this.f98661g = new a(bVar);
            this.f98662h = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f98661g);
        }

        @Override // com.avito.android.barcode.di.a
        public final void a(BarcodeDetailsActivity barcodeDetailsActivity) {
            barcodeDetailsActivity.f98682m = (d.a) this.f98660f.f393949a;
            L0 l0Z = this.f98655a.z();
            t.c(l0Z);
            barcodeDetailsActivity.f98684o = l0Z;
            barcodeDetailsActivity.f98685p = this.f98662h.get();
            InterfaceC28373a interfaceC28373aA = this.f98656b.a();
            t.c(interfaceC28373aA);
            barcodeDetailsActivity.f98687r = new com.avito.android.barcode_encoder.a(new C14892a(interfaceC28373aA));
        }
    }

    /* compiled from: DaggerBarcodeComponent.java */
    public static final class c implements a.InterfaceC2965a {
        public c() {
        }

        @Override // com.avito.android.barcode.di.a.InterfaceC2965a
        public final com.avito.android.barcode.di.a a(com.avito.android.barcode.di.b bVar, InterfaceC15183a interfaceC15183a, String str, String str2, String str3, BarcodeFormat barcodeFormat, C28478k c28478k) {
            str.getClass();
            barcodeFormat.getClass();
            return new b(bVar, interfaceC15183a, str, str2, str3, barcodeFormat, c28478k, null);
        }
    }

    public static a.InterfaceC2965a a() {
        return new c();
    }
}
