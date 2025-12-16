package com.avito.android.gig_motivation_payment.di;

import com.avito.android.gig_motivation_payment.di.b;
import com.avito.android.gig_motivation_payment.ui.MotivationPaymentActivity;
import com.avito.android.gig_motivation_payment.ui.MotivationPaymentOpenParams;
import com.avito.android.gig_motivation_payment.ui.e;
import com.avito.android.gig_motivation_payment.ui.mvi.i;
import com.avito.android.gig_motivation_payment.ui.mvi.m;
import com.avito.android.gig_motivation_payment.ui.mvi.p;
import com.avito.android.gig_motivation_payment.ui.mvi.r;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import rH.InterfaceC47543a;

/* compiled from: DaggerMotivationPaymentComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerMotivationPaymentComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.gig_motivation_payment.di.b.a
        public final com.avito.android.gig_motivation_payment.di.b a(MotivationPaymentOpenParams motivationPaymentOpenParams, com.avito.android.gig_motivation_payment.di.c cVar, InterfaceC39417a interfaceC39417a) {
            motivationPaymentOpenParams.getClass();
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, motivationPaymentOpenParams, null);
        }
    }

    /* compiled from: DaggerMotivationPaymentComponent.java */
    public static final class c implements com.avito.android.gig_motivation_payment.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f160102a;

        /* renamed from: b, reason: collision with root package name */
        public final u<RF.a> f160103b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC47543a> f160104c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f160105d;

        /* renamed from: e, reason: collision with root package name */
        public final l f160106e;

        /* compiled from: DaggerMotivationPaymentComponent.java */
        /* renamed from: com.avito.android.gig_motivation_payment.di.a$c$a, reason: collision with other inner class name */
        public static final class C4679a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f160107a;

            public C4679a(cv.b bVar) {
                this.f160107a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f160107a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerMotivationPaymentComponent.java */
        public static final class b implements u<RF.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.gig_motivation_payment.di.c f160108a;

            public b(com.avito.android.gig_motivation_payment.di.c cVar) {
                this.f160108a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                RF.a aVarSi = this.f160108a.Si();
                t.c(aVarSi);
                return aVarSi;
            }
        }

        public c(com.avito.android.gig_motivation_payment.di.c cVar, cv.b bVar, MotivationPaymentOpenParams motivationPaymentOpenParams, C4678a c4678a) {
            this.f160102a = l.a(motivationPaymentOpenParams);
            u<InterfaceC47543a> uVarD = g.d(new e(new b(cVar)));
            this.f160104c = uVarD;
            C4679a c4679a = new C4679a(bVar);
            l lVar = this.f160102a;
            this.f160106e = l.a(new com.avito.android.gig_motivation_payment.ui.g(new com.avito.android.gig_motivation_payment.ui.f(new p(new m(lVar, uVarD, c4679a), new i(lVar, uVarD, c4679a), r.a(), com.avito.android.gig_motivation_payment.ui.mvi.t.a()))));
        }

        @Override // com.avito.android.gig_motivation_payment.di.b
        public final void a(MotivationPaymentActivity motivationPaymentActivity) {
            motivationPaymentActivity.f160111m = (e.a) this.f160106e.f393949a;
        }
    }

    public static b.a a() {
        return new b();
    }
}
