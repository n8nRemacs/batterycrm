package com.avito.android.seller_promotions.di.component;

import Cj.InterfaceC13310a;
import Rq0.InterfaceC15072a;
import Y41.l;
import android.content.res.Resources;
import androidx.recyclerview.widget.C23424o;
import androidx.view.T0;
import bj.InterfaceC25659b;
import com.avito.android.Z0;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.C31175s;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.C31180x;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.H;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31158a;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31164g;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.P;
import com.avito.android.seller_promotions.SellerPromotionsFragment;
import com.avito.android.seller_promotions.di.component.b;
import com.avito.android.seller_promotions.model.SellerPromotionsArguments;
import com.avito.android.seller_promotions.mvi.B;
import com.avito.android.seller_promotions.mvi.D;
import com.avito.android.seller_promotions.mvi.G;
import com.avito.android.seller_promotions.mvi.I;
import com.avito.android.seller_promotions.mvi.x;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import gj.InterfaceC40691b;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import nU.C44333c;

/* compiled from: DaggerSellerPromotionsComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSellerPromotionsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.seller_promotions.di.component.b.a
        public final com.avito.android.seller_promotions.di.component.b a(SellerPromotionsArguments sellerPromotionsArguments, Resources resources, SellerPromotionsFragment sellerPromotionsFragment, l lVar, C28478k c28478k, com.avito.android.seller_promotions.di.component.c cVar, InterfaceC39417a interfaceC39417a, InterfaceC30106l7 interfaceC30106l7) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, interfaceC30106l7, sellerPromotionsArguments, resources, sellerPromotionsFragment, 25, lVar, c28478k, null);
        }
    }

    /* compiled from: DaggerSellerPromotionsComponent.java */
    public static final class c implements com.avito.android.seller_promotions.di.component.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<InterfaceC15072a> f267687A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.l f267688B;

        /* renamed from: C, reason: collision with root package name */
        public final u<R0> f267689C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.lib.beduin_v2.repository.domain.cart_items.h> f267690D;

        /* renamed from: E, reason: collision with root package name */
        public final u<B> f267691E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.favorite.h> f267692F;

        /* renamed from: G, reason: collision with root package name */
        public final x f267693G;

        /* renamed from: H, reason: collision with root package name */
        public final u<InterfaceC35745a5> f267694H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.cart_snippet_actions.a> f267695I;

        /* renamed from: J, reason: collision with root package name */
        public final com.avito.android.seller_promotions.u f267696J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.l f267697K;

        /* renamed from: L, reason: collision with root package name */
        public final u<InterfaceC13310a> f267698L;

        /* renamed from: M, reason: collision with root package name */
        public final u<AK0.l> f267699M;

        /* renamed from: N, reason: collision with root package name */
        public final u<InterfaceC31158a> f267700N;

        /* renamed from: O, reason: collision with root package name */
        public final H f267701O;

        /* renamed from: P, reason: collision with root package name */
        public final u<E> f267702P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<InterfaceC31164g> f267703Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<Z0> f267704R;

        /* renamed from: S, reason: collision with root package name */
        public final u<N> f267705S;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.seller_promotions.di.component.c f267706a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f267707b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f267708c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f267709d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f267710e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f267711f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Locale> f267712g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.seller_promotions.formatter.b f267713h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f267714i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC25659b> f267715j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.seller_promotions.konveyor.snippet.c f267716k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.seller_promotions.konveyor.beduin.d> f267717l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.seller_promotions.konveyor.beduin.b f267718m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.seller_promotions.konveyor.pagination.c f267719n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f267720o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.seller_promotions.konveyor.attributed_text.b f267721p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f267722q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f267723r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f267724s;

        /* renamed from: t, reason: collision with root package name */
        public final u<C23424o.f<TV0.a>> f267725t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f267726u;

        /* renamed from: v, reason: collision with root package name */
        public final u<Integer> f267727v;

        /* renamed from: w, reason: collision with root package name */
        public final u<gj.d> f267728w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f267729x;

        /* renamed from: y, reason: collision with root package name */
        public final u<a.b> f267730y;

        /* renamed from: z, reason: collision with root package name */
        public final u<InterfaceC40691b> f267731z;

        /* compiled from: DaggerSellerPromotionsComponent.java */
        /* renamed from: com.avito.android.seller_promotions.di.component.a$c$a, reason: collision with other inner class name */
        public static final class C8003a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267732a;

            public C8003a(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267732a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f267732a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267733a;

            public b(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267733a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f267733a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        /* renamed from: com.avito.android.seller_promotions.di.component.a$c$c, reason: collision with other inner class name */
        public static final class C8004c implements u<InterfaceC25659b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267734a;

            public C8004c(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267734a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f267734a.sd();
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class d implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267735a;

            public d(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267735a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f267735a.El();
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class e implements u<com.avito.android.cart_snippet_actions.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267736a;

            public e(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267736a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.cart_snippet_actions.a aVarF3 = this.f267736a.F3();
                t.c(aVarF3);
                return aVarF3;
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class f implements u<InterfaceC31164g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267737a;

            public f(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267737a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC31164g interfaceC31164gVa = this.f267737a.va();
                t.c(interfaceC31164gVa);
                return interfaceC31164gVa;
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class g implements u<InterfaceC31158a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267738a;

            public g(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267738a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC31158a interfaceC31158aW7 = this.f267738a.W7();
                t.c(interfaceC31158aW7);
                return interfaceC31158aW7;
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class h implements u<com.avito.android.lib.beduin_v2.repository.domain.cart_items.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267739a;

            public h(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267739a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVarW1 = this.f267739a.w1();
                t.c(hVarW1);
                return hVarW1;
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class i implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f267740a;

            public i(cv.b bVar) {
                this.f267740a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f267740a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class j implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f267741a;

            public j(cv.b bVar) {
                this.f267741a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f267741a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class k implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267742a;

            public k(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267742a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f267742a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class l implements u<com.avito.android.favorite.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267743a;

            public l(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267743a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f267743a.P0();
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class m implements u<InterfaceC13310a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267744a;

            public m(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267744a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13310a interfaceC13310aW9 = this.f267744a.w9();
                t.c(interfaceC13310aW9);
                return interfaceC13310aW9;
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class n implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267745a;

            public n(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267745a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f267745a.locale();
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class o implements u<Z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267746a;

            public o(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267746a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f267746a.W();
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class p implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267747a;

            public p(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267747a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f267747a.r();
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class q implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267748a;

            public q(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267748a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f267748a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class r implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f267749a;

            public r(InterfaceC30106l7 interfaceC30106l7) {
                this.f267749a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f267749a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerSellerPromotionsComponent.java */
        public static final class s implements u<InterfaceC15072a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_promotions.di.component.c f267750a;

            public s(com.avito.android.seller_promotions.di.component.c cVar) {
                this.f267750a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC15072a interfaceC15072aGc = this.f267750a.Gc();
                t.c(interfaceC15072aGc);
                return interfaceC15072aGc;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.seller_promotions.di.component.c cVar, cv.b bVar, InterfaceC30106l7 interfaceC30106l7, SellerPromotionsArguments sellerPromotionsArguments, Resources resources, T0 t02, Integer num, Y41.l lVar, C28478k c28478k, C8002a c8002a) {
            this.f267706a = cVar;
            this.f267707b = bVar;
            this.f267708c = new r(interfaceC30106l7);
            dagger.internal.l lVarA = dagger.internal.l.a(c28478k);
            this.f267709d = lVarA;
            this.f267710e = com.avito.android.actions_sheet.a.s(lVarA, this.f267708c);
            this.f267711f = dagger.internal.B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f267713h = new com.avito.android.seller_promotions.formatter.b(new n(cVar));
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar);
            this.f267714i = lVarA2;
            com.avito.android.seller_promotions.konveyor.snippet.i iVar = new com.avito.android.seller_promotions.konveyor.snippet.i(this.f267713h, lVarA2);
            C8004c c8004c = new C8004c(cVar);
            this.f267715j = c8004c;
            this.f267716k = new com.avito.android.seller_promotions.konveyor.snippet.c(iVar, c8004c);
            u<com.avito.android.seller_promotions.konveyor.beduin.d> uVarD = dagger.internal.g.d(com.avito.android.seller_promotions.konveyor.beduin.f.a());
            this.f267717l = uVarD;
            this.f267718m = new com.avito.android.seller_promotions.konveyor.beduin.b(uVarD, this.f267715j);
            this.f267719n = new com.avito.android.seller_promotions.konveyor.pagination.c(new com.avito.android.seller_promotions.konveyor.pagination.e(this.f267714i));
            this.f267720o = new b(cVar);
            this.f267721p = new com.avito.android.seller_promotions.konveyor.attributed_text.b(com.avito.android.seller_promotions.konveyor.attributed_text.e.a(), this.f267720o);
            A.b bVarA = A.a(4, 1);
            bVarA.f393938b.add(this.f267711f);
            com.avito.android.seller_promotions.konveyor.snippet.c cVar2 = this.f267716k;
            List<u<T>> list = bVarA.f393937a;
            list.add(cVar2);
            list.add(this.f267718m);
            list.add(this.f267719n);
            list.add(this.f267721p);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f267722q = uVarK;
            this.f267723r = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            u<com.avito.android.recycler.data_aware.a> uVarD2 = dagger.internal.g.d(com.avito.android.seller_promotions.konveyor.payloads.b.a());
            this.f267724s = uVarD2;
            u<C23424o.f<TV0.a>> uVarD3 = dagger.internal.g.d(new Kq0.f(uVarD2));
            this.f267725t = uVarD3;
            this.f267726u = dagger.internal.g.d(new Kq0.g(uVarD3, this.f267723r, this.f267722q));
            this.f267727v = dagger.internal.B.a(new Kq0.i(dagger.internal.l.a(resources)));
            this.f267731z = dagger.internal.g.d(new Kq0.b(this.f267709d, new d(cVar), new i(bVar), new j(bVar), this.f267710e));
            this.f267687A = new s(cVar);
            dagger.internal.l lVarA3 = dagger.internal.l.a(sellerPromotionsArguments);
            this.f267688B = lVarA3;
            k kVar = new k(cVar);
            this.f267689C = kVar;
            h hVar = new h(cVar);
            this.f267690D = hVar;
            u<B> uVarD4 = dagger.internal.g.d(new D(lVarA3, this.f267687A, kVar, hVar));
            this.f267691E = uVarD4;
            l lVar2 = new l(cVar);
            this.f267692F = lVar2;
            this.f267693G = new x(uVarD4, lVar2);
            dagger.internal.l lVarA4 = dagger.internal.l.a(num);
            q qVar = new q(cVar);
            this.f267694H = qVar;
            e eVar = new e(cVar);
            this.f267696J = new com.avito.android.seller_promotions.u(this.f267731z, new com.avito.android.seller_promotions.mvi.A(this.f267693G, new com.avito.android.seller_promotions.mvi.t(lVarA4, this.f267688B, this.f267691E, this.f267692F, this.f267689C, this.f267690D, qVar, eVar), new I(this.f267731z), G.a(), this.f267710e));
            this.f267697K = dagger.internal.l.a(t02);
            this.f267698L = new m(cVar);
            H hA2 = H.a(new p(cVar), new g(cVar));
            this.f267701O = hA2;
            C8003a c8003a = new C8003a(cVar);
            this.f267702P = c8003a;
            this.f267705S = dagger.internal.B.a(C44333c.a(this.f267697K, P.a(this.f267694H, C31175s.a(C31180x.a(this.f267698L, this.f267694H, hA2, c8003a), this.f267701O, this.f267702P, this.f267689C), new f(cVar), new o(cVar))));
        }

        @Override // com.avito.android.seller_promotions.di.component.b
        public final void a(SellerPromotionsFragment sellerPromotionsFragment) {
            com.avito.android.seller_promotions.di.component.c cVar = this.f267706a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            sellerPromotionsFragment.f267624n0 = interfaceC28373aA;
            sellerPromotionsFragment.f267625o0 = this.f267710e.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f267707b.u4();
            t.c(aVarU4);
            sellerPromotionsFragment.f267626p0 = aVarU4;
            sellerPromotionsFragment.f267627q0 = this.f267726u.get();
            sellerPromotionsFragment.f267628r0 = new com.avito.android.seller_promotions.konveyor.e(this.f267727v.get().intValue());
            sellerPromotionsFragment.f267629s0 = this.f267727v.get().intValue();
            sellerPromotionsFragment.f267630t0 = this.f267696J;
            sellerPromotionsFragment.f267632v0 = this.f267705S.get();
            sellerPromotionsFragment.f267633w0 = cVar.Ad();
            sellerPromotionsFragment.f267635y0 = cVar.sd();
        }
    }

    public static b.a a() {
        return new b();
    }
}
