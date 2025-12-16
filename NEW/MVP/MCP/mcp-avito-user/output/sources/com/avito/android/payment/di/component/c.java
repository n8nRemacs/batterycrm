package com.avito.android.payment.di.component;

import android.app.Activity;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.payment.di.component.h;
import com.avito.android.payment.di.module.F;
import com.avito.android.payment.di.module.G;
import com.avito.android.payment.di.module.H;
import com.avito.android.payment.di.module.I;
import com.avito.android.payment.di.module.J;
import com.avito.android.payment.di.module.K;
import com.avito.android.payment.di.module.L;
import com.avito.android.payment.di.module.N;
import com.avito.android.payment.di.module.O;
import com.avito.android.payment.di.module.P;
import com.avito.android.payment.di.module.Q;
import com.avito.android.payment.di.module.S;
import com.avito.android.payment.di.module.T;
import com.avito.android.payment.form.M;
import com.avito.android.payment.form.status.B;
import com.avito.android.payment.form.status.PaymentStatusFormActivity;
import com.avito.android.payment.form.status.j;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.t;
import dagger.internal.u;
import u60.InterfaceC48808a;

/* compiled from: DaggerPaymentStatusFormComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class c {

    /* compiled from: DaggerPaymentStatusFormComponent.java */
    public static final class b implements h.a {

        /* renamed from: a, reason: collision with root package name */
        public e f214128a;

        /* renamed from: b, reason: collision with root package name */
        public F f214129b;

        /* renamed from: c, reason: collision with root package name */
        public PaymentStatusFormActivity f214130c;

        public b() {
        }

        @Override // com.avito.android.payment.di.component.h.a
        public final h.a a(PaymentStatusFormActivity paymentStatusFormActivity) {
            this.f214130c = paymentStatusFormActivity;
            return this;
        }

        @Override // com.avito.android.payment.di.component.h.a
        public final h.a b(e eVar) {
            this.f214128a = eVar;
            return this;
        }

        @Override // com.avito.android.payment.di.component.h.a
        public final h build() {
            t.a(e.class, this.f214128a);
            t.a(F.class, this.f214129b);
            t.a(Activity.class, this.f214130c);
            return new C6425c(this.f214129b, this.f214128a, this.f214130c, null);
        }

        @Override // com.avito.android.payment.di.component.h.a
        public final h.a c(F f12) {
            this.f214129b = f12;
            return this;
        }
    }

    /* compiled from: DaggerPaymentStatusFormComponent.java */
    /* renamed from: com.avito.android.payment.di.component.c$c, reason: collision with other inner class name */
    public static final class C6425c implements h {

        /* renamed from: a, reason: collision with root package name */
        public final e f214131a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC48808a> f214132b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f214133c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.payment.form.status.e> f214134d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f214135e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.payment.form.status.h> f214136f;

        /* renamed from: g, reason: collision with root package name */
        public final u<j> f214137g;

        /* renamed from: h, reason: collision with root package name */
        public final u<M> f214138h;

        /* renamed from: i, reason: collision with root package name */
        public final u<B> f214139i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.payment.items.submit_button_item.e> f214140j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.payment.items.submit_button_item.a> f214141k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.payment.items.text_item.e> f214142l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.payment.items.text_item.b> f214143m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.payment.items.text_item.a> f214144n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f214145o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f214146p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f214147q;

        /* compiled from: DaggerPaymentStatusFormComponent.java */
        /* renamed from: com.avito.android.payment.di.component.c$c$a */
        public static final class a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f214148a;

            public a(e eVar) {
                this.f214148a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f214148a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerPaymentStatusFormComponent.java */
        /* renamed from: com.avito.android.payment.di.component.c$c$b */
        public static final class b implements u<InterfaceC48808a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f214149a;

            public b(e eVar) {
                this.f214149a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48808a interfaceC48808aF5 = this.f214149a.f5();
                t.c(interfaceC48808aF5);
                return interfaceC48808aF5;
            }
        }

        /* compiled from: DaggerPaymentStatusFormComponent.java */
        /* renamed from: com.avito.android.payment.di.component.c$c$c, reason: collision with other inner class name */
        public static final class C6426c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final e f214150a;

            public C6426c(e eVar) {
                this.f214150a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f214150a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public C6425c(F f12, e eVar, Activity activity, a aVar) {
            this.f214131a = eVar;
            b bVar = new b(eVar);
            C6426c c6426c = new C6426c(eVar);
            this.f214133c = c6426c;
            this.f214134d = dagger.internal.g.d(new L(f12, bVar, c6426c));
            u<com.avito.android.payment.form.status.h> uVarD = dagger.internal.g.d(new J(f12, new a(eVar)));
            this.f214136f = uVarD;
            this.f214137g = dagger.internal.g.d(new com.avito.android.payment.di.module.M(f12, this.f214134d, this.f214133c, uVarD));
            u<M> uVarD2 = dagger.internal.g.d(new N(f12));
            this.f214138h = uVarD2;
            this.f214139i = dagger.internal.g.d(new P(f12, uVarD2));
            u<com.avito.android.payment.items.submit_button_item.e> uVarD3 = dagger.internal.g.d(new S(f12, this.f214137g));
            this.f214140j = uVarD3;
            this.f214141k = dagger.internal.g.d(new Q(f12, uVarD3));
            u<com.avito.android.payment.items.text_item.e> uVarD4 = dagger.internal.g.d(new T(f12));
            this.f214142l = uVarD4;
            this.f214143m = dagger.internal.g.d(new K(f12, uVarD4));
            u<com.avito.android.payment.items.text_item.a> uVarD5 = dagger.internal.g.d(new H(f12, this.f214142l));
            this.f214144n = uVarD5;
            u<com.avito.konveyor.a> uVarD6 = dagger.internal.g.d(new I(f12, this.f214141k, this.f214143m, uVarD5));
            this.f214145o = uVarD6;
            u<com.avito.konveyor.adapter.a> uVarD7 = dagger.internal.g.d(new G(f12, uVarD6));
            this.f214146p = uVarD7;
            this.f214147q = dagger.internal.g.d(new O(f12, uVarD7, this.f214145o));
        }

        @Override // com.avito.android.payment.di.component.h
        public final void a(PaymentStatusFormActivity paymentStatusFormActivity) {
            paymentStatusFormActivity.f214398m = this.f214137g.get();
            paymentStatusFormActivity.f214399n = this.f214139i.get();
            paymentStatusFormActivity.f214400o = this.f214134d.get();
            paymentStatusFormActivity.f214401p = this.f214147q.get();
            paymentStatusFormActivity.f214402q = this.f214146p.get();
            e eVar = this.f214131a;
            x xVarQ = eVar.q();
            t.c(xVarQ);
            paymentStatusFormActivity.f214403r = xVarQ;
            paymentStatusFormActivity.f214404s = eVar.l3();
            paymentStatusFormActivity.f214405t = eVar.G1();
            InterfaceC28373a interfaceC28373aA = eVar.a();
            t.c(interfaceC28373aA);
            paymentStatusFormActivity.f214406u = interfaceC28373aA;
        }
    }

    public static h.a a() {
        return new b();
    }
}
