package com.avito.android.btob_business_trip.screens.selectItemScreen.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.btob_business_trip.models.SelectItemsInfo;
import com.avito.android.btob_business_trip.screens.selectItemScreen.B;
import com.avito.android.btob_business_trip.screens.selectItemScreen.B2bBusinessTripSelectFragment;
import com.avito.android.btob_business_trip.screens.selectItemScreen.di.a;
import com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.i;
import com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.k;
import com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.n;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import rk.C47671c;
import rk.InterfaceC47669a;
import sk.InterfaceC48375a;
import uk.InterfaceC49068a;

/* compiled from: DaggerB2bBusinessTripSelectComponent.java */
@e
/* loaded from: classes11.dex */
public final class c {

    /* compiled from: DaggerB2bBusinessTripSelectComponent.java */
    public static final class b implements com.avito.android.btob_business_trip.screens.selectItemScreen.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f108167a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f108168b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f108169c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.d f108170d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC49068a> f108171e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f108172f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.btob_business_trip.screens.common.interactors.a> f108173g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f108174h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC47669a> f108175i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.b f108176j;

        /* renamed from: k, reason: collision with root package name */
        public final k f108177k;

        /* renamed from: l, reason: collision with root package name */
        public final B f108178l;

        /* compiled from: DaggerB2bBusinessTripSelectComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC48375a f108179a;

            public a(InterfaceC48375a interfaceC48375a) {
                this.f108179a = interfaceC48375a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f108179a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerB2bBusinessTripSelectComponent.java */
        /* renamed from: com.avito.android.btob_business_trip.screens.selectItemScreen.di.c$b$b, reason: collision with other inner class name */
        public static final class C3238b implements u<InterfaceC49068a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC48375a f108180a;

            public C3238b(InterfaceC48375a interfaceC48375a) {
                this.f108180a = interfaceC48375a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49068a interfaceC49068aIc = this.f108180a.Ic();
                t.c(interfaceC49068aIc);
                return interfaceC49068aIc;
            }
        }

        /* compiled from: DaggerB2bBusinessTripSelectComponent.java */
        /* renamed from: com.avito.android.btob_business_trip.screens.selectItemScreen.di.c$b$c, reason: collision with other inner class name */
        public static final class C3239c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC48375a f108181a;

            public C3239c(InterfaceC48375a interfaceC48375a) {
                this.f108181a = interfaceC48375a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f108181a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerB2bBusinessTripSelectComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC48375a f108182a;

            public d(InterfaceC48375a interfaceC48375a) {
                this.f108182a = interfaceC48375a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f108182a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(InterfaceC48375a interfaceC48375a, cv.b bVar, SelectItemsInfo selectItemsInfo, C28478k c28478k, a aVar) {
            this.f108167a = bVar;
            this.f108168b = new d(interfaceC48375a);
            this.f108169c = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f108168b);
            this.f108170d = new com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.d(l.a(selectItemsInfo));
            this.f108173g = g.d(new com.avito.android.btob_business_trip.screens.common.interactors.c(new C3238b(interfaceC48375a), new C3239c(interfaceC48375a)));
            u<InterfaceC47669a> uVarD = g.d(new C47671c(new a(interfaceC48375a)));
            this.f108175i = uVarD;
            this.f108176j = new com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.b(uVarD, this.f108173g);
            this.f108177k = new k(n.a());
            this.f108178l = new B(new com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.g(this.f108170d, this.f108176j, i.a(), this.f108177k, this.f108169c));
        }

        @Override // com.avito.android.btob_business_trip.screens.selectItemScreen.di.a
        public final void a(B2bBusinessTripSelectFragment b2bBusinessTripSelectFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f108167a.u4();
            t.c(aVarU4);
            b2bBusinessTripSelectFragment.f108118n0 = aVarU4;
            b2bBusinessTripSelectFragment.f108119o0 = this.f108169c.get();
            b2bBusinessTripSelectFragment.f108120p0 = this.f108178l;
        }
    }

    /* compiled from: DaggerB2bBusinessTripSelectComponent.java */
    /* renamed from: com.avito.android.btob_business_trip.screens.selectItemScreen.di.c$c, reason: collision with other inner class name */
    public static final class C3240c implements a.InterfaceC3237a {
        public C3240c() {
        }

        @Override // com.avito.android.btob_business_trip.screens.selectItemScreen.di.a.InterfaceC3237a
        public final com.avito.android.btob_business_trip.screens.selectItemScreen.di.a a(InterfaceC48375a interfaceC48375a, InterfaceC39417a interfaceC39417a, SelectItemsInfo selectItemsInfo, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new b(interfaceC48375a, interfaceC39417a, selectItemsInfo, c28478k, null);
        }
    }

    public static a.InterfaceC3237a a() {
        return new C3240c();
    }
}
