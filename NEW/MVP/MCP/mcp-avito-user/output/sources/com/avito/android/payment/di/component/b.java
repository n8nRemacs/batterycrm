package com.avito.android.payment.di.component;

import android.app.Activity;
import com.avito.android.deep_linking.x;
import com.avito.android.payment.di.component.g;
import com.avito.android.payment.di.module.C;
import com.avito.android.payment.di.module.D;
import com.avito.android.payment.processing.C33028a;
import com.avito.android.payment.processing.PaymentProcessingActivity;
import com.avito.android.payment.processing.r;
import com.avito.android.payment.remote.PaymentSessionTypeMarker;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import u60.InterfaceC48808a;

/* compiled from: DaggerPaymentProcessingComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class b {

    /* compiled from: DaggerPaymentProcessingComponent.java */
    /* renamed from: com.avito.android.payment.di.component.b$b, reason: collision with other inner class name */
    public static final class C6422b implements g.a {

        /* renamed from: a, reason: collision with root package name */
        public e f214114a;

        /* renamed from: b, reason: collision with root package name */
        public PaymentProcessingActivity f214115b;

        /* renamed from: c, reason: collision with root package name */
        public PaymentSessionTypeMarker f214116c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC39417a f214117d;

        public C6422b() {
        }

        @Override // com.avito.android.payment.di.component.g.a
        public final g.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f214117d = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.payment.di.component.g.a
        public final g.a b(e eVar) {
            this.f214114a = eVar;
            return this;
        }

        @Override // com.avito.android.payment.di.component.g.a
        public final g build() {
            t.a(e.class, this.f214114a);
            t.a(Activity.class, this.f214115b);
            t.a(PaymentSessionTypeMarker.class, this.f214116c);
            t.a(cv.b.class, this.f214117d);
            return new c(this.f214114a, this.f214117d, this.f214115b, this.f214116c, null);
        }

        @Override // com.avito.android.payment.di.component.g.a
        public final g.a c(PaymentSessionTypeMarker paymentSessionTypeMarker) {
            this.f214116c = paymentSessionTypeMarker;
            return this;
        }

        @Override // com.avito.android.payment.di.component.g.a
        public final g.a d(PaymentProcessingActivity paymentProcessingActivity) {
            this.f214115b = paymentProcessingActivity;
            return this;
        }
    }

    /* compiled from: DaggerPaymentProcessingComponent.java */
    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public final e f214118a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f214119b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC48808a> f214120c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35745a5> f214121d;

        /* renamed from: e, reason: collision with root package name */
        public final u<x> f214122e;

        /* renamed from: f, reason: collision with root package name */
        public final u<C33028a> f214123f;

        /* renamed from: g, reason: collision with root package name */
        public final u<r> f214124g;

        /* compiled from: DaggerPaymentProcessingComponent.java */
        public static final class a implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final e f214125a;

            public a(e eVar) {
                this.f214125a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f214125a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerPaymentProcessingComponent.java */
        /* renamed from: com.avito.android.payment.di.component.b$c$b, reason: collision with other inner class name */
        public static final class C6423b implements u<InterfaceC48808a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f214126a;

            public C6423b(e eVar) {
                this.f214126a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48808a interfaceC48808aF5 = this.f214126a.f5();
                t.c(interfaceC48808aF5);
                return interfaceC48808aF5;
            }
        }

        /* compiled from: DaggerPaymentProcessingComponent.java */
        /* renamed from: com.avito.android.payment.di.component.b$c$c, reason: collision with other inner class name */
        public static final class C6424c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final e f214127a;

            public C6424c(e eVar) {
                this.f214127a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f214127a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(e eVar, cv.b bVar, Activity activity, PaymentSessionTypeMarker paymentSessionTypeMarker, a aVar) {
            this.f214118a = eVar;
            this.f214119b = bVar;
            this.f214120c = new C6423b(eVar);
            this.f214121d = new C6424c(eVar);
            this.f214122e = new a(eVar);
            this.f214123f = dagger.internal.g.d(new C(l.a(paymentSessionTypeMarker), this.f214120c, this.f214121d, this.f214122e));
            this.f214124g = dagger.internal.g.d(new D(this.f214120c, this.f214121d));
        }

        @Override // com.avito.android.payment.di.component.g
        public final void a(PaymentProcessingActivity paymentProcessingActivity) {
            paymentProcessingActivity.f214775m = this.f214123f.get();
            paymentProcessingActivity.f214776n = this.f214124g.get();
            x xVarQ = this.f214118a.q();
            t.c(xVarQ);
            paymentProcessingActivity.f214777o = xVarQ;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f214119b.u4();
            t.c(aVarU4);
            paymentProcessingActivity.f214778p = aVarU4;
        }
    }

    public static g.a a() {
        return new C6422b();
    }
}
