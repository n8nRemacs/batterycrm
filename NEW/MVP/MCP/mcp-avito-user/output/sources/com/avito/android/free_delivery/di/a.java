package com.avito.android.free_delivery.di;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.free_delivery.B;
import com.avito.android.free_delivery.FreeDeliveryActivity;
import com.avito.android.free_delivery.FreeDeliveryDetails;
import com.avito.android.free_delivery.di.b;
import com.avito.android.free_delivery.mvi.h;
import com.avito.android.free_delivery.mvi.k;
import com.avito.android.free_delivery.mvi.m;
import com.avito.android.free_delivery.mvi.o;
import com.avito.android.remote.error.f;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerFreeDeliveryComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerFreeDeliveryComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.free_delivery.di.b.a
        public final com.avito.android.free_delivery.di.b a(com.avito.android.free_delivery.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, FreeDeliveryDetails freeDeliveryDetails) {
            interfaceC39417a.getClass();
            freeDeliveryDetails.getClass();
            return new c(cVar, interfaceC39417a, c28478k, freeDeliveryDetails, null);
        }
    }

    /* compiled from: DaggerFreeDeliveryComponent.java */
    public static final class c implements com.avito.android.free_delivery.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.free_delivery.di.c f158667a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f158668b;

        /* renamed from: c, reason: collision with root package name */
        public final u<SE.a> f158669c;

        /* renamed from: d, reason: collision with root package name */
        public final u<f> f158670d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.free_delivery.mvi.f f158671e;

        /* renamed from: f, reason: collision with root package name */
        public final m f158672f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f158673g;

        /* renamed from: h, reason: collision with root package name */
        public final o f158674h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f158675i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f158676j;

        /* renamed from: k, reason: collision with root package name */
        public final B f158677k;

        /* compiled from: DaggerFreeDeliveryComponent.java */
        /* renamed from: com.avito.android.free_delivery.di.a$c$a, reason: collision with other inner class name */
        public static final class C4636a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.free_delivery.di.c f158678a;

            public C4636a(com.avito.android.free_delivery.di.c cVar) {
                this.f158678a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f158678a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerFreeDeliveryComponent.java */
        public static final class b implements u<f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.free_delivery.di.c f158679a;

            public b(com.avito.android.free_delivery.di.c cVar) {
                this.f158679a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f158679a.o6();
            }
        }

        /* compiled from: DaggerFreeDeliveryComponent.java */
        /* renamed from: com.avito.android.free_delivery.di.a$c$c, reason: collision with other inner class name */
        public static final class C4637c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.free_delivery.di.c f158680a;

            public C4637c(com.avito.android.free_delivery.di.c cVar) {
                this.f158680a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f158680a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerFreeDeliveryComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.free_delivery.di.c f158681a;

            public d(com.avito.android.free_delivery.di.c cVar) {
                this.f158681a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f158681a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerFreeDeliveryComponent.java */
        public static final class e implements u<SE.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.free_delivery.di.c f158682a;

            public e(com.avito.android.free_delivery.di.c cVar) {
                this.f158682a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SE.a aVarAf = this.f158682a.af();
                t.c(aVarAf);
                return aVarAf;
            }
        }

        public c(com.avito.android.free_delivery.di.c cVar, cv.b bVar, C28478k c28478k, FreeDeliveryDetails freeDeliveryDetails, C4635a c4635a) {
            this.f158667a = cVar;
            this.f158668b = new d(cVar);
            this.f158669c = new e(cVar);
            l lVarA = l.a(freeDeliveryDetails);
            this.f158671e = new com.avito.android.free_delivery.mvi.f(new com.avito.android.free_delivery.domain.b(lVarA, this.f158668b, this.f158669c, new b(cVar)));
            this.f158672f = new m(lVarA);
            this.f158674h = new o(lVarA, new C4636a(cVar));
            this.f158675i = new C4637c(cVar);
            this.f158676j = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f158675i);
            this.f158677k = new B(new k(h.a(), this.f158671e, this.f158672f, this.f158674h, this.f158676j));
        }

        @Override // com.avito.android.free_delivery.di.b
        public final void a(FreeDeliveryActivity freeDeliveryActivity) {
            freeDeliveryActivity.f158637m = this.f158677k;
            freeDeliveryActivity.f158639o = this.f158676j.get();
            u3.l<SimpleTestGroupWithNone> lVarLe = this.f158667a.le();
            t.c(lVarLe);
            freeDeliveryActivity.f158641q = lVarLe;
        }
    }

    public static b.a a() {
        return new b();
    }
}
