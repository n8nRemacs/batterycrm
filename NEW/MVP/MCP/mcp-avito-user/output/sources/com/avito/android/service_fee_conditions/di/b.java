package com.avito.android.service_fee_conditions.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.service_fee_conditions.di.d;
import com.avito.android.service_fee_conditions.mvi.o;
import com.avito.android.service_fee_conditions.ui.ServiceFeeConditionsFragment;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import ou0.InterfaceC44941a;

/* compiled from: DaggerServiceFeeConditionsComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: DaggerServiceFeeConditionsComponent.java */
    /* renamed from: com.avito.android.service_fee_conditions.di.b$b, reason: collision with other inner class name */
    public static final class C8275b implements d.a {
        public C8275b() {
        }

        @Override // com.avito.android.service_fee_conditions.di.d.a
        public final d a(String str, boolean z12, r rVar, PaidServicesResultRepository paidServicesResultRepository, g gVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(gVar, interfaceC39417a, str, Boolean.valueOf(z12), rVar, paidServicesResultRepository, null);
        }
    }

    /* compiled from: DaggerServiceFeeConditionsComponent.java */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f278411a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC44941a> f278412b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f278413c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.service_fee_conditions.mvi.d f278414d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.service_fee_conditions.mvi.b f278415e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f278416f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f278417g;

        /* renamed from: h, reason: collision with root package name */
        public final l f278418h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.service_fee_conditions.ui.i f278419i;

        /* compiled from: DaggerServiceFeeConditionsComponent.java */
        public static final class a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final g f278420a;

            public a(g gVar) {
                this.f278420a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f278420a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerServiceFeeConditionsComponent.java */
        /* renamed from: com.avito.android.service_fee_conditions.di.b$c$b, reason: collision with other inner class name */
        public static final class C8276b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final g f278421a;

            public C8276b(g gVar) {
                this.f278421a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f278421a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerServiceFeeConditionsComponent.java */
        /* renamed from: com.avito.android.service_fee_conditions.di.b$c$c, reason: collision with other inner class name */
        public static final class C8277c implements u<InterfaceC44941a> {

            /* renamed from: a, reason: collision with root package name */
            public final g f278422a;

            public C8277c(g gVar) {
                this.f278422a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44941a interfaceC44941aCa = this.f278422a.ca();
                t.c(interfaceC44941aCa);
                return interfaceC44941aCa;
            }
        }

        public c(g gVar, cv.b bVar, String str, Boolean bool, r rVar, PaidServicesResultRepository paidServicesResultRepository, a aVar) {
            this.f278411a = bVar;
            com.avito.android.service_fee_conditions.domain.b bVar2 = new com.avito.android.service_fee_conditions.domain.b(l.a(str), new C8277c(gVar), new a(gVar));
            this.f278414d = new com.avito.android.service_fee_conditions.mvi.d(bVar2);
            this.f278415e = new com.avito.android.service_fee_conditions.mvi.b(bVar2);
            this.f278416f = new C8276b(gVar);
            this.f278417g = dagger.internal.g.d(new C30060h5(this.f278416f, new k(l.a(rVar))));
            this.f278418h = l.a(bool);
            this.f278419i = new com.avito.android.service_fee_conditions.ui.i(new com.avito.android.service_fee_conditions.mvi.g(this.f278414d, this.f278415e, com.avito.android.service_fee_conditions.mvi.i.a(), o.a(), this.f278417g, this.f278418h));
        }

        @Override // com.avito.android.service_fee_conditions.di.d
        public final void a(ServiceFeeConditionsFragment serviceFeeConditionsFragment) {
            serviceFeeConditionsFragment.f278468n0 = this.f278419i;
            serviceFeeConditionsFragment.f278470p0 = this.f278417g.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f278411a.u4();
            t.c(aVarU4);
            serviceFeeConditionsFragment.f278471q0 = aVarU4;
        }
    }

    public static d.a a() {
        return new C8275b();
    }
}
