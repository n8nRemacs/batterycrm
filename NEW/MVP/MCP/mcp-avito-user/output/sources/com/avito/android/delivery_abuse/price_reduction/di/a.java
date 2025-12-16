package com.avito.android.delivery_abuse.price_reduction.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.delivery_abuse.price_reduction.PriceReductionActivity;
import com.avito.android.delivery_abuse.price_reduction.di.e;
import com.avito.android.delivery_abuse.price_reduction.mvi.i;
import com.avito.android.delivery_abuse.price_reduction.mvi.k;
import com.avito.android.delivery_abuse.price_reduction.mvi.m;
import com.avito.android.delivery_abuse.price_reduction.r;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import zv.InterfaceC50632a;

/* compiled from: DaggerPriceReductionComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerPriceReductionComponent.java */
    public static final class b implements e.a {
        public b() {
        }

        @Override // com.avito.android.delivery_abuse.price_reduction.di.e.a
        public final e a(f fVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, long j12, long j13, long j14) {
            interfaceC39417a.getClass();
            return new c(fVar, interfaceC39417a, c28478k, Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(j14), null);
        }
    }

    /* compiled from: DaggerPriceReductionComponent.java */
    public static final class c implements com.avito.android.delivery_abuse.price_reduction.di.e {

        /* renamed from: a, reason: collision with root package name */
        public final l f134808a;

        /* renamed from: b, reason: collision with root package name */
        public final l f134809b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.delivery_abuse.price_reduction.mvi.f f134810c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f134811d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC50632a> f134812e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f134813f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.delivery_abuse.price_reduction.domain.b f134814g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f134815h;

        /* renamed from: i, reason: collision with root package name */
        public final u<yv.c> f134816i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.delivery_abuse.price_reduction.mvi.d f134817j;

        /* renamed from: k, reason: collision with root package name */
        public final m f134818k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f134819l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f134820m;

        /* renamed from: n, reason: collision with root package name */
        public final r f134821n;

        /* compiled from: DaggerPriceReductionComponent.java */
        /* renamed from: com.avito.android.delivery_abuse.price_reduction.di.a$c$a, reason: collision with other inner class name */
        public static final class C4071a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final f f134822a;

            public C4071a(f fVar) {
                this.f134822a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f134822a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPriceReductionComponent.java */
        public static final class b implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final f f134823a;

            public b(f fVar) {
                this.f134823a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f134823a.o6();
            }
        }

        /* compiled from: DaggerPriceReductionComponent.java */
        /* renamed from: com.avito.android.delivery_abuse.price_reduction.di.a$c$c, reason: collision with other inner class name */
        public static final class C4072c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final f f134824a;

            public C4072c(f fVar) {
                this.f134824a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f134824a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerPriceReductionComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final f f134825a;

            public d(f fVar) {
                this.f134825a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f134825a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerPriceReductionComponent.java */
        public static final class e implements u<InterfaceC50632a> {

            /* renamed from: a, reason: collision with root package name */
            public final f f134826a;

            public e(f fVar) {
                this.f134826a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50632a interfaceC50632aMg = this.f134826a.Mg();
                t.c(interfaceC50632aMg);
                return interfaceC50632aMg;
            }
        }

        public c(f fVar, cv.b bVar, C28478k c28478k, Long l12, Long l13, Long l14, C4070a c4070a) {
            this.f134808a = l.a(l12);
            this.f134809b = l.a(l13);
            l lVarA = l.a(l14);
            l lVar = this.f134808a;
            this.f134810c = new com.avito.android.delivery_abuse.price_reduction.mvi.f(lVar, this.f134809b, lVarA);
            this.f134814g = new com.avito.android.delivery_abuse.price_reduction.domain.b(new d(fVar), new e(fVar), new b(fVar));
            u<yv.c> uVarD = dagger.internal.g.d(new yv.e(lVar, new C4071a(fVar)));
            this.f134816i = uVarD;
            this.f134817j = new com.avito.android.delivery_abuse.price_reduction.mvi.d(this.f134814g, uVarD);
            this.f134818k = new m(uVarD);
            this.f134819l = new C4072c(fVar);
            this.f134820m = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f134819l);
            this.f134821n = new r(new i(this.f134810c, this.f134817j, k.a(), this.f134818k, this.f134820m));
        }

        @Override // com.avito.android.delivery_abuse.price_reduction.di.e
        public final void a(PriceReductionActivity priceReductionActivity) {
            priceReductionActivity.f134766m = this.f134821n;
            priceReductionActivity.f134768o = this.f134820m.get();
        }
    }

    public static e.a a() {
        return new b();
    }
}
