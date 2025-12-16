package com.avito.android.btob_business_trip.screens.infoScreen.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.btob_business_trip.screens.infoScreen.B2bBusinessTripInfoFragment;
import com.avito.android.btob_business_trip.screens.infoScreen.di.a;
import com.avito.android.btob_business_trip.screens.infoScreen.mvi.i;
import com.avito.android.btob_business_trip.screens.infoScreen.mvi.k;
import com.avito.android.btob_business_trip.screens.infoScreen.x;
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

/* compiled from: DaggerB2bBusinessTripFragmentComponent.java */
@e
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: DaggerB2bBusinessTripFragmentComponent.java */
    /* renamed from: com.avito.android.btob_business_trip.screens.infoScreen.di.b$b, reason: collision with other inner class name */
    public static final class C3229b implements com.avito.android.btob_business_trip.screens.infoScreen.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC28481c> f107953a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f107954b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC49068a> f107955c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f107956d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.btob_business_trip.screens.common.interactors.a> f107957e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.btob_business_trip.screens.infoScreen.mvi.d f107958f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f107959g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC47669a> f107960h;

        /* renamed from: i, reason: collision with root package name */
        public final x f107961i;

        /* compiled from: DaggerB2bBusinessTripFragmentComponent.java */
        /* renamed from: com.avito.android.btob_business_trip.screens.infoScreen.di.b$b$a */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC48375a f107962a;

            public a(InterfaceC48375a interfaceC48375a) {
                this.f107962a = interfaceC48375a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f107962a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerB2bBusinessTripFragmentComponent.java */
        /* renamed from: com.avito.android.btob_business_trip.screens.infoScreen.di.b$b$b, reason: collision with other inner class name */
        public static final class C3230b implements u<InterfaceC49068a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC48375a f107963a;

            public C3230b(InterfaceC48375a interfaceC48375a) {
                this.f107963a = interfaceC48375a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49068a interfaceC49068aIc = this.f107963a.Ic();
                t.c(interfaceC49068aIc);
                return interfaceC49068aIc;
            }
        }

        /* compiled from: DaggerB2bBusinessTripFragmentComponent.java */
        /* renamed from: com.avito.android.btob_business_trip.screens.infoScreen.di.b$b$c */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC48375a f107964a;

            public c(InterfaceC48375a interfaceC48375a) {
                this.f107964a = interfaceC48375a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f107964a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerB2bBusinessTripFragmentComponent.java */
        /* renamed from: com.avito.android.btob_business_trip.screens.infoScreen.di.b$b$d */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC48375a f107965a;

            public d(InterfaceC48375a interfaceC48375a) {
                this.f107965a = interfaceC48375a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f107965a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public C3229b(InterfaceC48375a interfaceC48375a, cv.b bVar, C28478k c28478k, a aVar) {
            this.f107953a = new d(interfaceC48375a);
            this.f107954b = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f107953a);
            u<com.avito.android.btob_business_trip.screens.common.interactors.a> uVarD = g.d(new com.avito.android.btob_business_trip.screens.common.interactors.c(new C3230b(interfaceC48375a), new c(interfaceC48375a)));
            this.f107957e = uVarD;
            this.f107958f = new com.avito.android.btob_business_trip.screens.infoScreen.mvi.d(uVarD);
            u<InterfaceC47669a> uVarD2 = g.d(new C47671c(new a(interfaceC48375a)));
            this.f107960h = uVarD2;
            this.f107961i = new x(new com.avito.android.btob_business_trip.screens.infoScreen.mvi.g(this.f107958f, new com.avito.android.btob_business_trip.screens.infoScreen.mvi.b(uVarD2, this.f107957e), i.a(), k.a(), this.f107954b));
        }

        @Override // com.avito.android.btob_business_trip.screens.infoScreen.di.a
        public final void a(B2bBusinessTripInfoFragment b2bBusinessTripInfoFragment) {
            b2bBusinessTripInfoFragment.f107899n0 = this.f107954b.get();
            b2bBusinessTripInfoFragment.f107900o0 = this.f107961i;
        }
    }

    /* compiled from: DaggerB2bBusinessTripFragmentComponent.java */
    public static final class c implements a.InterfaceC3228a {
        public c() {
        }

        @Override // com.avito.android.btob_business_trip.screens.infoScreen.di.a.InterfaceC3228a
        public final com.avito.android.btob_business_trip.screens.infoScreen.di.a a(InterfaceC48375a interfaceC48375a, InterfaceC39417a interfaceC39417a, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new C3229b(interfaceC48375a, interfaceC39417a, c28478k, null);
        }
    }

    public static a.InterfaceC3228a a() {
        return new c();
    }
}
