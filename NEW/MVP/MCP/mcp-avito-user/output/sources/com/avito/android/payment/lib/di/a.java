package com.avito.android.payment.lib.di;

import android.app.Activity;
import androidx.recyclerview.widget.C;
import arrow.core.C23678f0;
import com.avito.android.deep_linking.x;
import com.avito.android.payment.di.module.C32974a;
import com.avito.android.payment.di.module.C32975b;
import com.avito.android.payment.lib.A;
import com.avito.android.payment.lib.C33020e;
import com.avito.android.payment.lib.D;
import com.avito.android.payment.lib.PaymentActivity;
import com.avito.android.payment.lib.PaymentSessionType;
import com.avito.android.payment.lib.di.c;
import com.avito.android.payment.lib.di.n;
import com.avito.android.payment.processing.y;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import nd.InterfaceC44378a;
import u60.InterfaceC48808a;

/* compiled from: DaggerPaymentMethodsComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPaymentMethodsComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.payment.lib.di.c.a
        public final com.avito.android.payment.lib.di.c a(com.avito.android.payment.lib.di.b bVar, InterfaceC39417a interfaceC39417a, PaymentActivity paymentActivity, PaymentSessionType paymentSessionType, C23678f0 c23678f0, boolean z12) {
            interfaceC39417a.getClass();
            paymentSessionType.getClass();
            return new c(new C32974a(), bVar, interfaceC39417a, paymentActivity, paymentSessionType, c23678f0, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerPaymentMethodsComponent.java */
    public static final class c implements com.avito.android.payment.lib.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.payment.lib.di.b f214587a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f214588b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f214589c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC48808a> f214590d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<D> f214591e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC44378a> f214592f;

        /* renamed from: g, reason: collision with root package name */
        public final C32975b f214593g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<C33020e> f214594h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<y> f214595i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f214596j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.remote.error.f> f214597k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<x> f214598l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f214599m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<A> f214600n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f214601o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.payment.lib.t> f214602p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<ru.avito.component.payments.method.list.material.f> f214603q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<ru.avito.component.payments.method.list.material.d> f214604r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<ru.avito.component.payments.method.list.material.a> f214605s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f214606t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f214607u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.f f214608v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<C> f214609w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.payment.g> f214610x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.e> f214611y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.c> f214612z;

        /* compiled from: DaggerPaymentMethodsComponent.java */
        /* renamed from: com.avito.android.payment.lib.di.a$c$a, reason: collision with other inner class name */
        public static final class C6436a implements dagger.internal.u<InterfaceC44378a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.lib.di.b f214613a;

            public C6436a(com.avito.android.payment.lib.di.b bVar) {
                this.f214613a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44378a interfaceC44378aX4 = this.f214613a.x4();
                dagger.internal.t.c(interfaceC44378aX4);
                return interfaceC44378aX4;
            }
        }

        /* compiled from: DaggerPaymentMethodsComponent.java */
        public static final class b implements dagger.internal.u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.lib.di.b f214614a;

            public b(com.avito.android.payment.lib.di.b bVar) {
                this.f214614a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f214614a.t();
                dagger.internal.t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerPaymentMethodsComponent.java */
        /* renamed from: com.avito.android.payment.lib.di.a$c$c, reason: collision with other inner class name */
        public static final class C6437c implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f214615a;

            public C6437c(cv.b bVar) {
                this.f214615a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f214615a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerPaymentMethodsComponent.java */
        public static final class d implements dagger.internal.u<InterfaceC48808a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.lib.di.b f214616a;

            public d(com.avito.android.payment.lib.di.b bVar) {
                this.f214616a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48808a interfaceC48808aF5 = this.f214616a.f5();
                dagger.internal.t.c(interfaceC48808aF5);
                return interfaceC48808aF5;
            }
        }

        /* compiled from: DaggerPaymentMethodsComponent.java */
        public static final class e implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.lib.di.b f214617a;

            public e(com.avito.android.payment.lib.di.b bVar) {
                this.f214617a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f214617a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerPaymentMethodsComponent.java */
        public static final class f implements dagger.internal.u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.lib.di.b f214618a;

            public f(com.avito.android.payment.lib.di.b bVar) {
                this.f214618a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f214618a.o();
            }
        }

        public c() {
            throw null;
        }

        public c(C32974a c32974a, com.avito.android.payment.lib.di.b bVar, cv.b bVar2, Activity activity, PaymentSessionType paymentSessionType, C23678f0 c23678f0, Boolean bool, C6435a c6435a) {
            this.f214587a = bVar;
            this.f214588b = bVar2;
            this.f214589c = new e(bVar);
            d dVar = new d(bVar);
            this.f214590d = dVar;
            this.f214591e = dagger.internal.g.d(new i(dVar));
            C6436a c6436a = new C6436a(bVar);
            C32975b.f214248b.getClass();
            this.f214593g = new C32975b(c32974a, c6436a);
            this.f214594h = dagger.internal.g.d(new h(this.f214590d));
            this.f214595i = dagger.internal.g.d(new j(this.f214590d));
            this.f214596j = dagger.internal.l.a(paymentSessionType);
            this.f214597k = new f(bVar);
            this.f214598l = new b(bVar);
            this.f214599m = new C6437c(bVar2);
            this.f214600n = dagger.internal.g.d(new g(this.f214589c, this.f214591e, this.f214593g, this.f214594h, this.f214595i, this.f214596j, this.f214597k, this.f214598l, this.f214599m, dagger.internal.l.a(bool)));
            dagger.internal.l lVarA = dagger.internal.l.a(activity);
            this.f214601o = lVarA;
            this.f214602p = dagger.internal.g.d(new m(lVarA, this.f214600n));
            this.f214603q = dagger.internal.g.d(new u(this.f214601o));
            dagger.internal.u<ru.avito.component.payments.method.list.material.d> uVarD = dagger.internal.g.d(new t(dagger.internal.l.a(c23678f0)));
            this.f214604r = uVarD;
            dagger.internal.u<ru.avito.component.payments.method.list.material.a> uVarD2 = dagger.internal.g.d(new q(uVarD, this.f214603q));
            this.f214605s = uVarD2;
            dagger.internal.u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new r(uVarD2));
            this.f214606t = uVarD3;
            this.f214607u = dagger.internal.g.d(new k(uVarD3));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f214608v = fVar;
            this.f214609w = dagger.internal.g.d(new s(fVar));
            dagger.internal.u<com.avito.android.payment.g> uVarD4 = dagger.internal.g.d(n.a.f214642a);
            this.f214610x = uVarD4;
            dagger.internal.u<com.avito.android.recycler.data_aware.e> uVarD5 = dagger.internal.g.d(new p(uVarD4));
            this.f214611y = uVarD5;
            dagger.internal.u<com.avito.android.recycler.data_aware.c> uVarD6 = dagger.internal.g.d(new o(uVarD5, this.f214609w, this.f214607u));
            this.f214612z = uVarD6;
            dagger.internal.f.a(this.f214608v, dagger.internal.g.d(new l(uVarD6, this.f214606t)));
        }

        @Override // com.avito.android.payment.lib.di.c
        public final void a(PaymentActivity paymentActivity) {
            paymentActivity.f214534m = this.f214602p.get();
            paymentActivity.f214535n = this.f214607u.get();
            paymentActivity.f214536o = (com.avito.konveyor.adapter.j) this.f214608v.get();
            com.avito.android.payment.lib.di.b bVar = this.f214587a;
            paymentActivity.f214537p = bVar.G1();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f214588b.u4();
            dagger.internal.t.c(aVarU4);
            paymentActivity.f214538q = aVarU4;
            paymentActivity.f214539r = bVar.Kd();
        }
    }

    public static c.a a() {
        return new b();
    }
}
