package com.avito.android.travel_payment_selector.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.travel_payment_methods.items.loan_terms.InterfaceC35262a;
import com.avito.android.travel_payment_selector.di.c;
import com.avito.android.travel_payment_selector.view.PaymentSelectorFragmentDialog;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import eF0.InterfaceC40000a;
import iF0.InterfaceC41280a;
import nF0.C44247b;

/* compiled from: DaggerPaymentSelectorComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerPaymentSelectorComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.travel_payment_selector.di.c.a
        public final com.avito.android.travel_payment_selector.di.c a(String str, Long l12, C28478k c28478k, f fVar, InterfaceC40000a interfaceC40000a, Y41.l lVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(new g(), fVar, interfaceC40000a, interfaceC39417a, str, l12, c28478k, lVar, null);
        }
    }

    /* compiled from: DaggerPaymentSelectorComponent.java */
    public static final class c implements com.avito.android.travel_payment_selector.di.c {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f302561A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f302562B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f302563C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f302564D;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f302565a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.travel_payment_selector.di.f f302566b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f302567c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC41280a> f302568d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f302569e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.travel_payment_selector.mvi.f f302570f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f302571g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f302572h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.travel_payment_selector.mvi.d f302573i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.travel_payment_selector.mvi.m f302574j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f302575k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f302576l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.travel_payment_selector.view.d f302577m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.f f302578n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.travel_payment_selector.view.items.title.b f302579o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.l f302580p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.travel_payment_selector.view.items.description.b f302581q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.travel_payment_methods.items.payment_method.h> f302582r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f302583s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.travel_payment_methods.items.payment_method.g<?, ?>> f302584t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.travel_payment_methods.items.payment_method.b> f302585u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.travel_payment_methods.items.payment_method.a> f302586v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.travel_payment_methods.items.loan_terms.k> f302587w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.travel_payment_methods.items.loan_terms.j<?, ?>> f302588x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.travel_payment_methods.items.loan_terms.b> f302589y;

        /* renamed from: z, reason: collision with root package name */
        public final u<InterfaceC35262a> f302590z;

        /* compiled from: DaggerPaymentSelectorComponent.java */
        /* renamed from: com.avito.android.travel_payment_selector.di.a$c$a, reason: collision with other inner class name */
        public static final class C9265a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_payment_selector.di.f f302591a;

            public C9265a(com.avito.android.travel_payment_selector.di.f fVar) {
                this.f302591a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f302591a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPaymentSelectorComponent.java */
        public static final class b implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_payment_selector.di.f f302592a;

            public b(com.avito.android.travel_payment_selector.di.f fVar) {
                this.f302592a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarB2 = this.f302592a.B2();
                t.c(aVarB2);
                return aVarB2;
            }
        }

        /* compiled from: DaggerPaymentSelectorComponent.java */
        /* renamed from: com.avito.android.travel_payment_selector.di.a$c$c, reason: collision with other inner class name */
        public static final class C9266c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f302593a;

            public C9266c(cv.b bVar) {
                this.f302593a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f302593a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerPaymentSelectorComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_payment_selector.di.f f302594a;

            public d(com.avito.android.travel_payment_selector.di.f fVar) {
                this.f302594a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f302594a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerPaymentSelectorComponent.java */
        public static final class e implements u<com.avito.android.travel_payment_methods.items.loan_terms.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40000a f302595a;

            public e(InterfaceC40000a interfaceC40000a) {
                this.f302595a = interfaceC40000a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f302595a.pa();
            }
        }

        /* compiled from: DaggerPaymentSelectorComponent.java */
        public static final class f implements u<com.avito.android.travel_payment_methods.items.loan_terms.k> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40000a f302596a;

            public f(InterfaceC40000a interfaceC40000a) {
                this.f302596a = interfaceC40000a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f302596a.x6();
            }
        }

        /* compiled from: DaggerPaymentSelectorComponent.java */
        public static final class g implements u<com.avito.android.travel_payment_methods.items.payment_method.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40000a f302597a;

            public g(InterfaceC40000a interfaceC40000a) {
                this.f302597a = interfaceC40000a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f302597a.hk();
            }
        }

        /* compiled from: DaggerPaymentSelectorComponent.java */
        public static final class h implements u<com.avito.android.travel_payment_methods.items.payment_method.h> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40000a f302598a;

            public h(InterfaceC40000a interfaceC40000a) {
                this.f302598a = interfaceC40000a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f302598a.wk();
            }
        }

        /* compiled from: DaggerPaymentSelectorComponent.java */
        public static final class i implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_payment_selector.di.f f302599a;

            public i(com.avito.android.travel_payment_selector.di.f fVar) {
                this.f302599a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f302599a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerPaymentSelectorComponent.java */
        public static final class j implements u<InterfaceC41280a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_payment_selector.di.f f302600a;

            public j(com.avito.android.travel_payment_selector.di.f fVar) {
                this.f302600a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41280a interfaceC41280aGf = this.f302600a.gf();
                t.c(interfaceC41280aGf);
                return interfaceC41280aGf;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.travel_payment_selector.di.g gVar, com.avito.android.travel_payment_selector.di.f fVar, InterfaceC40000a interfaceC40000a, cv.b bVar, String str, Long l12, C28478k c28478k, Y41.l lVar, C9264a c9264a) {
            this.f302565a = bVar;
            this.f302566b = fVar;
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            this.f302567c = lVarA;
            this.f302570f = new com.avito.android.travel_payment_selector.mvi.f(lVarA, new com.avito.android.travel_payment_selector.mvi.interactor.e(new j(fVar), new d(fVar)));
            this.f302573i = new com.avito.android.travel_payment_selector.mvi.d(this.f302567c, dagger.internal.l.b(l12), new C9265a(fVar), new b(fVar));
            this.f302574j = new com.avito.android.travel_payment_selector.mvi.m(com.avito.android.travel_payment_selector.mvi.model.d.a());
            this.f302575k = new i(fVar);
            this.f302576l = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f302575k);
            this.f302577m = new com.avito.android.travel_payment_selector.view.d(new com.avito.android.travel_payment_selector.mvi.i(this.f302570f, this.f302573i, com.avito.android.travel_payment_selector.mvi.k.a(), this.f302574j, this.f302576l));
            this.f302578n = new dagger.internal.f();
            this.f302579o = new com.avito.android.travel_payment_selector.view.items.title.b(com.avito.android.travel_payment_selector.view.items.title.e.a());
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar);
            this.f302580p = lVarA2;
            this.f302581q = new com.avito.android.travel_payment_selector.view.items.description.b(new com.avito.android.travel_payment_selector.view.items.description.f(lVarA2));
            u<com.avito.android.travel_payment_methods.items.payment_method.g<?, ?>> uVarD = dagger.internal.g.d(new p(gVar, lVarA2, new h(interfaceC40000a), new C9266c(bVar)));
            this.f302584t = uVarD;
            this.f302586v = dagger.internal.g.d(new o(gVar, uVarD, new g(interfaceC40000a)));
            u<com.avito.android.travel_payment_methods.items.loan_terms.j<?, ?>> uVarD2 = dagger.internal.g.d(new n(gVar, this.f302580p, new f(interfaceC40000a)));
            this.f302588x = uVarD2;
            u<InterfaceC35262a> uVarD3 = dagger.internal.g.d(new m(gVar, uVarD2, new e(interfaceC40000a)));
            this.f302590z = uVarD3;
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new r(gVar, this.f302579o, this.f302581q, this.f302586v, uVarD3));
            this.f302561A = uVarD4;
            this.f302562B = dagger.internal.g.d(new s(gVar, uVarD4));
            u<com.avito.android.recycler.data_aware.e> uVarD5 = dagger.internal.g.d(new l(gVar));
            this.f302563C = uVarD5;
            u<com.avito.konveyor.adapter.a> uVarD6 = dagger.internal.g.d(new k(gVar, this.f302578n, this.f302562B, uVarD5));
            this.f302564D = uVarD6;
            dagger.internal.f.a(this.f302578n, dagger.internal.g.d(new q(gVar, uVarD6, this.f302561A)));
        }

        @Override // com.avito.android.travel_payment_selector.di.c
        public final void a(PaymentSelectorFragmentDialog paymentSelectorFragmentDialog) {
            paymentSelectorFragmentDialog.f302703h0 = this.f302577m;
            paymentSelectorFragmentDialog.f302705j0 = (com.avito.konveyor.adapter.j) this.f302578n.get();
            paymentSelectorFragmentDialog.f302706k0 = this.f302564D.get();
            paymentSelectorFragmentDialog.f302707l0 = this.f302576l.get();
            cv.b bVar = this.f302565a;
            com.avito.android.deeplink_handler.view.d dVarC = bVar.c();
            t.c(dVarC);
            paymentSelectorFragmentDialog.f302708m0 = dVarC;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            t.c(aVarU4);
            paymentSelectorFragmentDialog.f302709n0 = aVarU4;
            SK0.b bVarP = this.f302566b.p();
            t.c(bVarP);
            paymentSelectorFragmentDialog.f302710o0 = new C44247b(bVarP);
        }
    }

    public static c.a a() {
        return new b();
    }
}
