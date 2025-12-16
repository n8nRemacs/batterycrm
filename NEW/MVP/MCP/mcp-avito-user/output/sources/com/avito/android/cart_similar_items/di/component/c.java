package com.avito.android.cart_similar_items.di.component;

import Cj.InterfaceC13310a;
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
import com.avito.android.cart_similar_items.CartSimilarItemsFragment;
import com.avito.android.cart_similar_items.di.component.a;
import com.avito.android.cart_similar_items.model.CartSimilarItemsArguments;
import com.avito.android.cart_similar_items.mvi.C;
import com.avito.android.cart_similar_items.mvi.F;
import com.avito.android.cart_similar_items.mvi.I;
import com.avito.android.cart_similar_items.mvi.K;
import com.avito.android.cart_similar_items.mvi.x;
import com.avito.android.cart_similar_items.mvi.z;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.C31175s;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.C31180x;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.H;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31158a;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31164g;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.P;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import gj.InterfaceC40691b;
import in.C41427b;
import in.C41428c;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ln.C43801b;
import nU.C44333c;
import nn.InterfaceC44450a;

/* compiled from: DaggerCartSimilarItemsComponent.java */
@e
/* loaded from: classes12.dex */
public final class c {

    /* compiled from: DaggerCartSimilarItemsComponent.java */
    public static final class b implements com.avito.android.cart_similar_items.di.component.a {

        /* renamed from: A, reason: collision with root package name */
        public final u<R0> f115736A;

        /* renamed from: B, reason: collision with root package name */
        public final u<C> f115737B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.lib.beduin_v2.repository.domain.cart_items.h> f115738C;

        /* renamed from: D, reason: collision with root package name */
        public final u<C43801b> f115739D;

        /* renamed from: E, reason: collision with root package name */
        public final u<I> f115740E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.favorite.h> f115741F;

        /* renamed from: G, reason: collision with root package name */
        public final com.avito.android.cart_similar_items.mvi.u f115742G;

        /* renamed from: H, reason: collision with root package name */
        public final u<F> f115743H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.cart_snippet_actions.e> f115744I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.android.cart_snippet_actions.a> f115745J;

        /* renamed from: K, reason: collision with root package name */
        public final u<InterfaceC35745a5> f115746K;

        /* renamed from: L, reason: collision with root package name */
        public final com.avito.android.cart_similar_items.r f115747L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.l f115748M;

        /* renamed from: N, reason: collision with root package name */
        public final u<InterfaceC13310a> f115749N;

        /* renamed from: O, reason: collision with root package name */
        public final u<AK0.l> f115750O;

        /* renamed from: P, reason: collision with root package name */
        public final u<InterfaceC31158a> f115751P;

        /* renamed from: Q, reason: collision with root package name */
        public final H f115752Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<E> f115753R;

        /* renamed from: S, reason: collision with root package name */
        public final u<InterfaceC31164g> f115754S;

        /* renamed from: T, reason: collision with root package name */
        public final u<Z0> f115755T;

        /* renamed from: U, reason: collision with root package name */
        public final u<N> f115756U;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.cart_similar_items.di.component.b f115757a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f115758b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f115759c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f115760d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f115761e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f115762f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Locale> f115763g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.cart_similar_items.formatter.b f115764h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f115765i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC25659b> f115766j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.cart_similar_items.konveyor.snippet.b f115767k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.cart_similar_items.konveyor.beduin.d> f115768l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.cart_similar_items.konveyor.beduin.b f115769m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.cart_similar_items.konveyor.pagination.c f115770n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f115771o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f115772p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f115773q;

        /* renamed from: r, reason: collision with root package name */
        public final u<C23424o.f<TV0.a>> f115774r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f115775s;

        /* renamed from: t, reason: collision with root package name */
        public final u<Integer> f115776t;

        /* renamed from: u, reason: collision with root package name */
        public final u<gj.d> f115777u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f115778v;

        /* renamed from: w, reason: collision with root package name */
        public final u<a.b> f115779w;

        /* renamed from: x, reason: collision with root package name */
        public final u<InterfaceC40691b> f115780x;

        /* renamed from: y, reason: collision with root package name */
        public final u<InterfaceC44450a> f115781y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.l f115782z;

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115783a;

            public a(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115783a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f115783a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        /* renamed from: com.avito.android.cart_similar_items.di.component.c$b$b, reason: collision with other inner class name */
        public static final class C3372b implements u<InterfaceC25659b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115784a;

            public C3372b(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115784a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f115784a.sd();
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        /* renamed from: com.avito.android.cart_similar_items.di.component.c$b$c, reason: collision with other inner class name */
        public static final class C3373c implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115785a;

            public C3373c(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115785a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f115785a.El();
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class d implements u<com.avito.android.cart_snippet_actions.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115786a;

            public d(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115786a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.cart_snippet_actions.a aVarF3 = this.f115786a.F3();
                t.c(aVarF3);
                return aVarF3;
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class e implements u<com.avito.android.cart_snippet_actions.e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115787a;

            public e(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115787a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f115787a.V5();
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class f implements u<InterfaceC31164g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115788a;

            public f(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115788a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC31164g interfaceC31164gVa = this.f115788a.va();
                t.c(interfaceC31164gVa);
                return interfaceC31164gVa;
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class g implements u<InterfaceC31158a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115789a;

            public g(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115789a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC31158a interfaceC31158aW7 = this.f115789a.W7();
                t.c(interfaceC31158aW7);
                return interfaceC31158aW7;
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class h implements u<InterfaceC44450a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115790a;

            public h(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115790a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44450a interfaceC44450aKc = this.f115790a.kc();
                t.c(interfaceC44450aKc);
                return interfaceC44450aKc;
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class i implements u<com.avito.android.lib.beduin_v2.repository.domain.cart_items.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115791a;

            public i(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115791a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVarW1 = this.f115791a.w1();
                t.c(hVarW1);
                return hVarW1;
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class j implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f115792a;

            public j(cv.b bVar) {
                this.f115792a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f115792a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class k implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f115793a;

            public k(cv.b bVar) {
                this.f115793a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f115793a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class l implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115794a;

            public l(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115794a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f115794a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class m implements u<com.avito.android.favorite.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115795a;

            public m(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115795a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f115795a.P0();
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class n implements u<InterfaceC13310a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115796a;

            public n(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115796a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13310a interfaceC13310aW9 = this.f115796a.w9();
                t.c(interfaceC13310aW9);
                return interfaceC13310aW9;
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class o implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115797a;

            public o(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115797a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f115797a.locale();
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class p implements u<Z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115798a;

            public p(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115798a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f115798a.W();
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class q implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115799a;

            public q(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115799a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f115799a.r();
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class r implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cart_similar_items.di.component.b f115800a;

            public r(com.avito.android.cart_similar_items.di.component.b bVar) {
                this.f115800a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f115800a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerCartSimilarItemsComponent.java */
        public static final class s implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f115801a;

            public s(InterfaceC30106l7 interfaceC30106l7) {
                this.f115801a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f115801a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.cart_similar_items.di.component.b bVar, cv.b bVar2, InterfaceC30106l7 interfaceC30106l7, CartSimilarItemsArguments cartSimilarItemsArguments, Resources resources, T0 t02, Integer num, Y41.l lVar, C28478k c28478k, a aVar) {
            this.f115757a = bVar;
            this.f115758b = bVar2;
            this.f115759c = new s(interfaceC30106l7);
            dagger.internal.l lVarA = dagger.internal.l.a(c28478k);
            this.f115760d = lVarA;
            this.f115761e = com.avito.android.actions_sheet.a.s(lVarA, this.f115759c);
            this.f115762f = B.a(com.avito.android.konveyor_adapter_module.d.a());
            o oVar = new o(bVar);
            com.avito.android.cart_similar_items.formatter.b.f115806b.getClass();
            this.f115764h = new com.avito.android.cart_similar_items.formatter.b(oVar);
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar);
            this.f115765i = lVarA2;
            com.avito.android.cart_similar_items.konveyor.snippet.h hVar = new com.avito.android.cart_similar_items.konveyor.snippet.h(this.f115764h, lVarA2);
            C3372b c3372b = new C3372b(bVar);
            this.f115766j = c3372b;
            this.f115767k = new com.avito.android.cart_similar_items.konveyor.snippet.b(hVar, c3372b);
            u<com.avito.android.cart_similar_items.konveyor.beduin.d> uVarD = dagger.internal.g.d(com.avito.android.cart_similar_items.konveyor.beduin.f.a());
            this.f115768l = uVarD;
            this.f115769m = new com.avito.android.cart_similar_items.konveyor.beduin.b(uVarD, this.f115766j);
            this.f115770n = new com.avito.android.cart_similar_items.konveyor.pagination.c(new com.avito.android.cart_similar_items.konveyor.pagination.e(this.f115765i));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f115762f);
            com.avito.android.cart_similar_items.konveyor.snippet.b bVar3 = this.f115767k;
            List<u<T>> list = bVarA.f393937a;
            list.add(bVar3);
            list.add(this.f115769m);
            list.add(this.f115770n);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f115771o = uVarK;
            this.f115772p = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            u<com.avito.android.recycler.data_aware.a> uVarD2 = dagger.internal.g.d(com.avito.android.cart_similar_items.konveyor.payloads.b.a());
            this.f115773q = uVarD2;
            u<C23424o.f<TV0.a>> uVarD3 = dagger.internal.g.d(new in.g(uVarD2));
            this.f115774r = uVarD3;
            this.f115775s = dagger.internal.g.d(new in.h(uVarD3, this.f115772p, this.f115771o));
            this.f115776t = B.a(new in.j(dagger.internal.l.a(resources)));
            this.f115780x = dagger.internal.g.d(new C41427b(this.f115760d, new C3373c(bVar), new j(bVar2), new k(bVar2), this.f115761e));
            this.f115781y = new h(bVar);
            dagger.internal.l lVarA3 = dagger.internal.l.a(cartSimilarItemsArguments);
            this.f115782z = lVarA3;
            l lVar2 = new l(bVar);
            this.f115736A = lVar2;
            this.f115737B = dagger.internal.g.d(new com.avito.android.cart_similar_items.mvi.E(lVarA3, this.f115781y, lVar2));
            this.f115738C = new i(bVar);
            u<C43801b> uVarD4 = dagger.internal.g.d(new C41428c(this.f115780x));
            this.f115739D = uVarD4;
            u<I> uVarD5 = dagger.internal.g.d(new K(uVarD4, this.f115737B, this.f115736A, this.f115738C));
            this.f115740E = uVarD5;
            m mVar = new m(bVar);
            this.f115741F = mVar;
            this.f115742G = new com.avito.android.cart_similar_items.mvi.u(uVarD5, mVar, this.f115739D, this.f115736A);
            u<F> uVarD6 = dagger.internal.g.d(new com.avito.android.cart_similar_items.mvi.H(dagger.internal.l.a(num), this.f115737B, this.f115736A, this.f115738C));
            this.f115743H = uVarD6;
            e eVar = new e(bVar);
            d dVar = new d(bVar);
            r rVar = new r(bVar);
            this.f115746K = rVar;
            this.f115747L = new com.avito.android.cart_similar_items.r(this.f115780x, new x(this.f115742G, new com.avito.android.cart_similar_items.mvi.p(this.f115782z, uVarD6, this.f115740E, this.f115741F, eVar, dVar, this.f115736A, this.f115738C, rVar), new com.avito.android.cart_similar_items.mvi.B(this.f115780x), z.a(), this.f115761e));
            this.f115748M = dagger.internal.l.a(t02);
            this.f115749N = new n(bVar);
            H hA2 = H.a(new q(bVar), new g(bVar));
            this.f115752Q = hA2;
            a aVar2 = new a(bVar);
            this.f115753R = aVar2;
            this.f115756U = B.a(C44333c.a(this.f115748M, P.a(this.f115746K, C31175s.a(C31180x.a(this.f115749N, this.f115746K, hA2, aVar2), this.f115752Q, this.f115753R, this.f115736A), new f(bVar), new p(bVar))));
        }

        @Override // com.avito.android.cart_similar_items.di.component.a
        public final void a(CartSimilarItemsFragment cartSimilarItemsFragment) {
            com.avito.android.cart_similar_items.di.component.b bVar = this.f115757a;
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            cartSimilarItemsFragment.f115669n0 = interfaceC28373aA;
            cartSimilarItemsFragment.f115670o0 = this.f115761e.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f115758b.u4();
            t.c(aVarU4);
            cartSimilarItemsFragment.f115671p0 = aVarU4;
            cartSimilarItemsFragment.f115672q0 = this.f115775s.get();
            cartSimilarItemsFragment.f115673r0 = new com.avito.android.cart_similar_items.konveyor.e(this.f115776t.get().intValue());
            cartSimilarItemsFragment.f115674s0 = this.f115776t.get().intValue();
            cartSimilarItemsFragment.f115675t0 = this.f115747L;
            cartSimilarItemsFragment.f115677v0 = this.f115756U.get();
            cartSimilarItemsFragment.f115678w0 = bVar.Ad();
            cartSimilarItemsFragment.f115680y0 = bVar.sd();
        }
    }

    /* compiled from: DaggerCartSimilarItemsComponent.java */
    /* renamed from: com.avito.android.cart_similar_items.di.component.c$c, reason: collision with other inner class name */
    public static final class C3374c implements a.InterfaceC3371a {
        public C3374c() {
        }

        @Override // com.avito.android.cart_similar_items.di.component.a.InterfaceC3371a
        public final com.avito.android.cart_similar_items.di.component.a a(CartSimilarItemsArguments cartSimilarItemsArguments, Resources resources, CartSimilarItemsFragment cartSimilarItemsFragment, l lVar, C28478k c28478k, com.avito.android.cart_similar_items.di.component.b bVar, InterfaceC39417a interfaceC39417a, InterfaceC30106l7 interfaceC30106l7) {
            cartSimilarItemsArguments.getClass();
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, interfaceC30106l7, cartSimilarItemsArguments, resources, cartSimilarItemsFragment, 32, lVar, c28478k, null);
        }
    }

    public static a.InterfaceC3371a a() {
        return new C3374c();
    }
}
