package com.avito.android.btob_business_trip.screens.resultSuccessScreen.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.btob_business_trip.models.SuccessScreenInfo;
import com.avito.android.btob_business_trip.screens.resultSuccessScreen.B2bBusinessTripSuccessScreenFragment;
import com.avito.android.btob_business_trip.screens.resultSuccessScreen.di.a;
import com.avito.android.btob_business_trip.screens.resultSuccessScreen.j;
import com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi.d;
import com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi.i;
import com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi.k;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import rk.C47671c;
import rk.InterfaceC47669a;
import sk.InterfaceC48375a;

/* compiled from: DaggerB2bBusinessTripSuccessScreenComponent.java */
@e
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: DaggerB2bBusinessTripSuccessScreenComponent.java */
    /* renamed from: com.avito.android.btob_business_trip.screens.resultSuccessScreen.di.b$b, reason: collision with other inner class name */
    public static final class C3232b implements com.avito.android.btob_business_trip.screens.resultSuccessScreen.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f108084a;

        /* renamed from: b, reason: collision with root package name */
        public final d f108085b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f108086c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC47669a> f108087d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi.b f108088e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f108089f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f108090g;

        /* renamed from: h, reason: collision with root package name */
        public final j f108091h;

        /* compiled from: DaggerB2bBusinessTripSuccessScreenComponent.java */
        /* renamed from: com.avito.android.btob_business_trip.screens.resultSuccessScreen.di.b$b$a */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC48375a f108092a;

            public a(InterfaceC48375a interfaceC48375a) {
                this.f108092a = interfaceC48375a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f108092a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerB2bBusinessTripSuccessScreenComponent.java */
        /* renamed from: com.avito.android.btob_business_trip.screens.resultSuccessScreen.di.b$b$b, reason: collision with other inner class name */
        public static final class C3233b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC48375a f108093a;

            public C3233b(InterfaceC48375a interfaceC48375a) {
                this.f108093a = interfaceC48375a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f108093a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public C3232b(InterfaceC48375a interfaceC48375a, cv.b bVar, C28478k c28478k, SuccessScreenInfo successScreenInfo, a aVar) {
            this.f108084a = bVar;
            this.f108085b = new d(l.a(successScreenInfo));
            u<InterfaceC47669a> uVarD = g.d(new C47671c(new a(interfaceC48375a)));
            this.f108087d = uVarD;
            this.f108088e = new com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi.b(uVarD);
            this.f108089f = new C3233b(interfaceC48375a);
            this.f108090g = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f108089f);
            this.f108091h = new j(new com.avito.android.btob_business_trip.screens.resultSuccessScreen.mvi.g(this.f108085b, this.f108088e, i.a(), k.a(), this.f108090g));
        }

        @Override // com.avito.android.btob_business_trip.screens.resultSuccessScreen.di.a
        public final void a(B2bBusinessTripSuccessScreenFragment b2bBusinessTripSuccessScreenFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f108084a.u4();
            t.c(aVarU4);
            b2bBusinessTripSuccessScreenFragment.f108036n0 = aVarU4;
            b2bBusinessTripSuccessScreenFragment.f108037o0 = this.f108091h;
            b2bBusinessTripSuccessScreenFragment.f108039q0 = this.f108090g.get();
        }
    }

    /* compiled from: DaggerB2bBusinessTripSuccessScreenComponent.java */
    public static final class c implements a.InterfaceC3231a {
        public c() {
        }

        @Override // com.avito.android.btob_business_trip.screens.resultSuccessScreen.di.a.InterfaceC3231a
        public final com.avito.android.btob_business_trip.screens.resultSuccessScreen.di.a a(InterfaceC48375a interfaceC48375a, InterfaceC39417a interfaceC39417a, C28478k c28478k, SuccessScreenInfo successScreenInfo) {
            interfaceC39417a.getClass();
            return new C3232b(interfaceC48375a, interfaceC39417a, c28478k, successScreenInfo, null);
        }
    }

    public static a.InterfaceC3231a a() {
        return new c();
    }
}
