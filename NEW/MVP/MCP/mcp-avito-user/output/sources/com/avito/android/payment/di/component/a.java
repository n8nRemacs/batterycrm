package com.avito.android.payment.di.component;

import androidx.recyclerview.widget.C;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.payment.di.component.f;
import com.avito.android.payment.di.module.A;
import com.avito.android.payment.di.module.C32977d;
import com.avito.android.payment.di.module.C32978e;
import com.avito.android.payment.di.module.C32979f;
import com.avito.android.payment.di.module.C32980g;
import com.avito.android.payment.di.module.C32981h;
import com.avito.android.payment.di.module.C32982i;
import com.avito.android.payment.di.module.C32983j;
import com.avito.android.payment.di.module.C32984k;
import com.avito.android.payment.di.module.C32985l;
import com.avito.android.payment.di.module.C32986m;
import com.avito.android.payment.di.module.C32987n;
import com.avito.android.payment.di.module.C32988o;
import com.avito.android.payment.di.module.C32989p;
import com.avito.android.payment.di.module.C32990q;
import com.avito.android.payment.di.module.C32991s;
import com.avito.android.payment.di.module.C32992t;
import com.avito.android.payment.di.module.C32993u;
import com.avito.android.payment.di.module.C32994v;
import com.avito.android.payment.di.module.C32995w;
import com.avito.android.payment.di.module.C32996x;
import com.avito.android.payment.di.module.C32997y;
import com.avito.android.payment.di.module.r;
import com.avito.android.payment.di.module.z;
import com.avito.android.payment.form.C33008k;
import com.avito.android.payment.form.InterfaceC33000c;
import com.avito.android.payment.form.InterfaceC33003f;
import com.avito.android.payment.form.InterfaceC33006i;
import com.avito.android.payment.form.InterfaceC33009l;
import com.avito.android.payment.form.M;
import com.avito.android.payment.form.PaymentGenericFormActivity;
import com.avito.android.payment.remote.PaymentSessionTypeMarker;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P3;
import com.avito.android.validation.InterfaceC36020m;
import com.avito.android.validation.d1;
import com.avito.android.validation.g1;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Locale;
import u3.l;
import u60.InterfaceC48808a;

/* compiled from: DaggerPaymentGenericFormComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPaymentGenericFormComponent.java */
    public static final class b implements f.a {

        /* renamed from: a, reason: collision with root package name */
        public e f214067a;

        /* renamed from: b, reason: collision with root package name */
        public C32977d f214068b;

        /* renamed from: c, reason: collision with root package name */
        public PaymentSessionTypeMarker f214069c;

        public b() {
        }

        @Override // com.avito.android.payment.di.component.f.a
        public final f.a b(e eVar) {
            this.f214067a = eVar;
            return this;
        }

        @Override // com.avito.android.payment.di.component.f.a
        public final f build() {
            t.a(e.class, this.f214067a);
            t.a(C32977d.class, this.f214068b);
            t.a(PaymentSessionTypeMarker.class, this.f214069c);
            return new c(this.f214068b, this.f214067a, this.f214069c, null);
        }

        @Override // com.avito.android.payment.di.component.f.a
        public final f.a c(PaymentSessionTypeMarker paymentSessionTypeMarker) {
            this.f214069c = paymentSessionTypeMarker;
            return this;
        }

        @Override // com.avito.android.payment.di.component.f.a
        public final f.a d(C32977d c32977d) {
            this.f214068b = c32977d;
            return this;
        }
    }

    /* compiled from: DaggerPaymentGenericFormComponent.java */
    public static final class c implements com.avito.android.payment.di.component.f {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.payment.items.text_item.b> f214070A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f214071B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f214072C;

        /* renamed from: D, reason: collision with root package name */
        public final u<C> f214073D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f214074E;

        /* renamed from: F, reason: collision with root package name */
        public final u<C33008k> f214075F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f214076G;

        /* renamed from: H, reason: collision with root package name */
        public final u<M> f214077H;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.payment.di.component.e f214078a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC48808a> f214079b;

        /* renamed from: c, reason: collision with root package name */
        public final u<g1> f214080c;

        /* renamed from: d, reason: collision with root package name */
        public final u<hJ.i> f214081d;

        /* renamed from: e, reason: collision with root package name */
        public final u<hJ.e> f214082e;

        /* renamed from: f, reason: collision with root package name */
        public final u<d1> f214083f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC36020m> f214084g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC35745a5> f214085h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC33003f> f214086i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.server_time.h> f214087j;

        /* renamed from: k, reason: collision with root package name */
        public final u<Locale> f214088k;

        /* renamed from: l, reason: collision with root package name */
        public final u<hJ.g> f214089l;

        /* renamed from: m, reason: collision with root package name */
        public final u<Q1> f214090m;

        /* renamed from: n, reason: collision with root package name */
        public final u<l<SimpleTestGroupWithNone>> f214091n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.category_parameters.a> f214092o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC33000c> f214093p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f214094q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC33006i> f214095r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.f f214096s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.f f214097t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.payment.items.submit_button_item.e> f214098u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.payment.items.submit_button_item.a> f214099v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.payment.items.phone_item.b f214100w;

        /* renamed from: x, reason: collision with root package name */
        public final u<ru.avito.component.info_label.h> f214101x;

        /* renamed from: y, reason: collision with root package name */
        public final u<ru.avito.component.info_label.f> f214102y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.payment.items.text_item.e> f214103z;

        /* compiled from: DaggerPaymentGenericFormComponent.java */
        /* renamed from: com.avito.android.payment.di.component.a$c$a, reason: collision with other inner class name */
        public static final class C6420a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214104a;

            public C6420a(com.avito.android.payment.di.component.e eVar) {
                this.f214104a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f214104a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerPaymentGenericFormComponent.java */
        public static final class b implements u<hJ.e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214105a;

            public b(com.avito.android.payment.di.component.e eVar) {
                this.f214105a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.e eVarS = this.f214105a.S();
                t.c(eVarS);
                return eVarS;
            }
        }

        /* compiled from: DaggerPaymentGenericFormComponent.java */
        /* renamed from: com.avito.android.payment.di.component.a$c$c, reason: collision with other inner class name */
        public static final class C6421c implements u<hJ.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214106a;

            public C6421c(com.avito.android.payment.di.component.e eVar) {
                this.f214106a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.g gVarP0 = this.f214106a.p0();
                t.c(gVarP0);
                return gVarP0;
            }
        }

        /* compiled from: DaggerPaymentGenericFormComponent.java */
        public static final class d implements u<hJ.i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214107a;

            public d(com.avito.android.payment.di.component.e eVar) {
                this.f214107a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.i iVarY = this.f214107a.Y();
                t.c(iVarY);
                return iVarY;
            }
        }

        /* compiled from: DaggerPaymentGenericFormComponent.java */
        public static final class e implements u<InterfaceC48808a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214108a;

            public e(com.avito.android.payment.di.component.e eVar) {
                this.f214108a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48808a interfaceC48808aF5 = this.f214108a.f5();
                t.c(interfaceC48808aF5);
                return interfaceC48808aF5;
            }
        }

        /* compiled from: DaggerPaymentGenericFormComponent.java */
        public static final class f implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214109a;

            public f(com.avito.android.payment.di.component.e eVar) {
                this.f214109a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f214109a.hl();
            }
        }

        /* compiled from: DaggerPaymentGenericFormComponent.java */
        public static final class g implements u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214110a;

            public g(com.avito.android.payment.di.component.e eVar) {
                this.f214110a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f214110a.z0();
            }
        }

        /* compiled from: DaggerPaymentGenericFormComponent.java */
        public static final class h implements u<l<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214111a;

            public h(com.avito.android.payment.di.component.e eVar) {
                this.f214111a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                l<SimpleTestGroupWithNone> lVarO0 = this.f214111a.O0();
                t.c(lVarO0);
                return lVarO0;
            }
        }

        /* compiled from: DaggerPaymentGenericFormComponent.java */
        public static final class i implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214112a;

            public i(com.avito.android.payment.di.component.e eVar) {
                this.f214112a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f214112a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerPaymentGenericFormComponent.java */
        public static final class j implements u<com.avito.android.server_time.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214113a;

            public j(com.avito.android.payment.di.component.e eVar) {
                this.f214113a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.h hVarY = this.f214113a.y();
                t.c(hVarY);
                return hVarY;
            }
        }

        public c(C32977d c32977d, com.avito.android.payment.di.component.e eVar, PaymentSessionTypeMarker paymentSessionTypeMarker, C6419a c6419a) {
            this.f214078a = eVar;
            this.f214079b = new e(eVar);
            u<g1> uVarD = dagger.internal.g.d(new r(c32977d));
            this.f214080c = uVarD;
            d dVar = new d(eVar);
            b bVar = new b(eVar);
            this.f214082e = bVar;
            u<d1> uVarD2 = dagger.internal.g.d(new C32991s(c32977d, uVarD, dVar, bVar));
            this.f214083f = uVarD2;
            this.f214084g = dagger.internal.g.d(new C32990q(c32977d, uVarD2));
            this.f214085h = new i(eVar);
            this.f214086i = dagger.internal.g.d(new C32992t(c32977d, this.f214079b, this.f214084g, this.f214085h, dagger.internal.l.a(paymentSessionTypeMarker)));
            u<com.avito.android.category_parameters.a> uVarD3 = dagger.internal.g.d(new C32979f(c32977d, P3.f318722a, new j(eVar), new f(eVar), this.f214082e, new C6421c(eVar), new g(eVar), new h(eVar)));
            this.f214092o = uVarD3;
            u<InterfaceC33000c> uVarD4 = dagger.internal.g.d(new C32982i(c32977d, uVarD3));
            this.f214093p = uVarD4;
            this.f214095r = dagger.internal.g.d(new C32988o(c32977d, uVarD4, new C6420a(eVar)));
            this.f214096s = new dagger.internal.f();
            dagger.internal.f fVar = new dagger.internal.f();
            this.f214097t = fVar;
            u<com.avito.android.payment.items.submit_button_item.e> uVarD5 = dagger.internal.g.d(new z(c32977d, fVar));
            this.f214098u = uVarD5;
            this.f214099v = dagger.internal.g.d(new C32997y(c32977d, uVarD5));
            this.f214100w = new com.avito.android.payment.items.phone_item.b(new C32986m(c32977d, this.f214097t));
            u<ru.avito.component.info_label.h> uVarD6 = dagger.internal.g.d(new C32985l(c32977d));
            this.f214101x = uVarD6;
            this.f214102y = dagger.internal.g.d(new C32984k(c32977d, uVarD6));
            u<com.avito.android.payment.items.text_item.e> uVarD7 = dagger.internal.g.d(new A(c32977d));
            this.f214103z = uVarD7;
            u<com.avito.android.payment.items.text_item.b> uVarD8 = dagger.internal.g.d(new C32994v(c32977d, uVarD7));
            this.f214070A = uVarD8;
            u<com.avito.konveyor.a> uVarD9 = dagger.internal.g.d(new C32987n(c32977d, this.f214099v, this.f214100w, this.f214102y, uVarD8));
            this.f214071B = uVarD9;
            u<com.avito.konveyor.adapter.j> uVarD10 = dagger.internal.g.d(new C32996x(c32977d, this.f214096s, uVarD9));
            this.f214072C = uVarD10;
            this.f214073D = dagger.internal.g.d(new C32989p(c32977d, uVarD10));
            this.f214074E = dagger.internal.g.d(new C32978e(c32977d, this.f214071B));
            u<C33008k> uVarD11 = dagger.internal.g.d(new C32980g(c32977d));
            this.f214075F = uVarD11;
            u<com.avito.android.recycler.data_aware.e> uVarD12 = dagger.internal.g.d(new C32983j(c32977d, uVarD11));
            this.f214076G = uVarD12;
            dagger.internal.f.a(this.f214096s, dagger.internal.g.d(new C32981h(c32977d, uVarD12, this.f214073D, this.f214074E)));
            dagger.internal.f.a(this.f214097t, dagger.internal.g.d(new C32993u(c32977d, this.f214086i, this.f214085h, this.f214095r, this.f214096s)));
            this.f214077H = dagger.internal.g.d(new C32995w(c32977d));
        }

        @Override // com.avito.android.payment.di.component.f
        public final void a(PaymentGenericFormActivity paymentGenericFormActivity) {
            paymentGenericFormActivity.f214340m = (InterfaceC33009l) this.f214097t.get();
            paymentGenericFormActivity.f214341n = this.f214077H.get();
            paymentGenericFormActivity.f214342o = this.f214086i.get();
            this.f214071B.get();
            paymentGenericFormActivity.f214343p = this.f214072C.get();
            com.avito.android.payment.di.component.e eVar = this.f214078a;
            paymentGenericFormActivity.f214344q = eVar.G1();
            InterfaceC28373a interfaceC28373aA = eVar.a();
            t.c(interfaceC28373aA);
            paymentGenericFormActivity.f214345r = interfaceC28373aA;
        }
    }

    public static f.a a() {
        return new b();
    }
}
