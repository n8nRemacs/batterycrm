package com.avito.android.mortgage.root.di;

import Y00.C18245f;
import Y00.InterfaceC18243d;
import Y00.InterfaceC18246g;
import Y41.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.root.MortgageRootFragment;
import com.avito.android.mortgage.root.di.b;
import com.avito.android.mortgage.root.list.items.navigation.j;
import com.avito.android.mortgage.root.list.items.realty_object_details.p;
import com.avito.android.mortgage.root.list.items.team.k;
import com.avito.android.mortgage.root.list.payloads.C32682c;
import com.avito.android.mortgage.root.list.payloads.i;
import com.avito.android.mortgage.root.list.payloads.r;
import com.avito.android.mortgage.root.model.MortgageRootArguments;
import com.avito.android.mortgage.root.mvi.E;
import com.avito.android.mortgage.root.mvi.domain.C;
import com.avito.android.mortgage.root.mvi.domain.C32692f;
import com.avito.android.mortgage.root.mvi.domain.C32696j;
import com.avito.android.mortgage.root.mvi.domain.C32699m;
import com.avito.android.mortgage.root.mvi.domain.C32702p;
import com.avito.android.mortgage.root.mvi.domain.D;
import com.avito.android.mortgage.root.mvi.domain.F;
import com.avito.android.mortgage.root.mvi.domain.G;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32687a;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32694h;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32697k;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32700n;
import com.avito.android.mortgage.root.mvi.domain.J;
import com.avito.android.mortgage.root.mvi.domain.K;
import com.avito.android.mortgage.root.mvi.domain.M;
import com.avito.android.mortgage.root.mvi.domain.N;
import com.avito.android.mortgage.root.mvi.domain.P;
import com.avito.android.mortgage.root.mvi.domain.q;
import com.avito.android.mortgage.root.mvi.domain.s;
import com.avito.android.mortgage.root.mvi.domain.t;
import com.avito.android.mortgage.root.mvi.domain.v;
import com.avito.android.mortgage.root.mvi.domain.w;
import com.avito.android.mortgage.root.mvi.domain.y;
import com.avito.android.mortgage.root.mvi.domain.z;
import com.avito.android.mortgage.root.mvi.x;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.g;
import dagger.internal.u;
import e10.C39845c;
import e10.InterfaceC39843a;
import i00.InterfaceC41203a;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerMortgageRootComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerMortgageRootComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.root.di.b.a
        public final com.avito.android.mortgage.root.di.b a(o oVar, InterfaceC39417a interfaceC39417a, MortgageRootArguments mortgageRootArguments, l lVar, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new c(oVar, interfaceC39417a, mortgageRootArguments, lVar, c28478k, null);
        }
    }

    /* compiled from: DaggerMortgageRootComponent.java */
    public static final class c implements com.avito.android.mortgage.root.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202217A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f202218B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f202219C;

        /* renamed from: D, reason: collision with root package name */
        public final u<Z00.e> f202220D;

        /* renamed from: E, reason: collision with root package name */
        public final u<Z00.e> f202221E;

        /* renamed from: F, reason: collision with root package name */
        public final u<Z00.e> f202222F;

        /* renamed from: G, reason: collision with root package name */
        public final u<Z00.e> f202223G;

        /* renamed from: H, reason: collision with root package name */
        public final u<Z00.e> f202224H;

        /* renamed from: I, reason: collision with root package name */
        public final u<Z00.e> f202225I;

        /* renamed from: J, reason: collision with root package name */
        public final u<Z00.e> f202226J;

        /* renamed from: K, reason: collision with root package name */
        public final u<Z00.e> f202227K;

        /* renamed from: L, reason: collision with root package name */
        public final u<Z00.e> f202228L;

        /* renamed from: M, reason: collision with root package name */
        public final u<Z00.e> f202229M;

        /* renamed from: N, reason: collision with root package name */
        public final u<Z00.e> f202230N;

        /* renamed from: O, reason: collision with root package name */
        public final u<Z00.e> f202231O;

        /* renamed from: P, reason: collision with root package name */
        public final u<Z00.e> f202232P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f202233Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<com.avito.android.mortgage.root.mvi.mapper.a> f202234R;

        /* renamed from: S, reason: collision with root package name */
        public final u<InterfaceC39843a> f202235S;

        /* renamed from: T, reason: collision with root package name */
        public final u<InterfaceC28373a> f202236T;

        /* renamed from: U, reason: collision with root package name */
        public final u<InterfaceC18246g> f202237U;

        /* renamed from: V, reason: collision with root package name */
        public final u<InterfaceC18243d> f202238V;

        /* renamed from: W, reason: collision with root package name */
        public final E f202239W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.l f202240X;

        /* renamed from: Y, reason: collision with root package name */
        public final u<IZ.a> f202241Y;

        /* renamed from: Z, reason: collision with root package name */
        public final u<InterfaceC41203a> f202242Z;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f202243a;

        /* renamed from: a0, reason: collision with root package name */
        public final u<R0> f202244a0;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f202245b;

        /* renamed from: b0, reason: collision with root package name */
        public final C f202246b0;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f202247c;

        /* renamed from: c0, reason: collision with root package name */
        public final u<z> f202248c0;

        /* renamed from: d, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f202249d;

        /* renamed from: d0, reason: collision with root package name */
        public final u<w> f202250d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f202251e;

        /* renamed from: e0, reason: collision with root package name */
        public final u<t> f202252e0;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202253f;

        /* renamed from: f0, reason: collision with root package name */
        public final u<SK0.b> f202254f0;

        /* renamed from: g, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202255g;

        /* renamed from: g0, reason: collision with root package name */
        public final u<InterfaceC32687a> f202256g0;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202257h;

        /* renamed from: h0, reason: collision with root package name */
        public final x f202258h0;

        /* renamed from: i, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202259i;

        /* renamed from: i0, reason: collision with root package name */
        public final u<InterfaceC32700n> f202260i0;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202261j;

        /* renamed from: j0, reason: collision with root package name */
        public final u<InterfaceC32694h> f202262j0;

        /* renamed from: k, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202263k;

        /* renamed from: k0, reason: collision with root package name */
        public final u<InterfaceC32697k> f202264k0;

        /* renamed from: l, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202265l;

        /* renamed from: l0, reason: collision with root package name */
        public final u<D> f202266l0;

        /* renamed from: m, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202267m;

        /* renamed from: m0, reason: collision with root package name */
        public final u<K> f202268m0;

        /* renamed from: n, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202269n;

        /* renamed from: n0, reason: collision with root package name */
        public final u<G> f202270n0;

        /* renamed from: o, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202271o;

        /* renamed from: o0, reason: collision with root package name */
        public final u<q> f202272o0;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202273p;

        /* renamed from: p0, reason: collision with root package name */
        public final u<N> f202274p0;

        /* renamed from: q, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202275q;

        /* renamed from: q0, reason: collision with root package name */
        public final com.avito.android.mortgage.root.mvi.u f202276q0;

        /* renamed from: r, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202277r;

        /* renamed from: r0, reason: collision with root package name */
        public final com.avito.android.mortgage.root.f f202278r0;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202279s;

        /* renamed from: t, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202280t;

        /* renamed from: u, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202281u;

        /* renamed from: v, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202282v;

        /* renamed from: w, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202283w;

        /* renamed from: x, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202284x;

        /* renamed from: y, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202285y;

        /* renamed from: z, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f202286z;

        /* compiled from: DaggerMortgageRootComponent.java */
        /* renamed from: com.avito.android.mortgage.root.di.a$c$a, reason: collision with other inner class name */
        public static final class C6007a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f202287a;

            public C6007a(o oVar) {
                this.f202287a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f202287a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerMortgageRootComponent.java */
        public static final class b implements u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final o f202288a;

            public b(o oVar) {
                this.f202288a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarP = this.f202288a.p();
                dagger.internal.t.c(bVarP);
                return bVarP;
            }
        }

        /* compiled from: DaggerMortgageRootComponent.java */
        /* renamed from: com.avito.android.mortgage.root.di.a$c$c, reason: collision with other inner class name */
        public static final class C6008c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final o f202289a;

            public C6008c(o oVar) {
                this.f202289a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f202289a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerMortgageRootComponent.java */
        public static final class d implements u<IZ.a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f202290a;

            public d(o oVar) {
                this.f202290a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IZ.a aVarLc = this.f202290a.lc();
                dagger.internal.t.c(aVarLc);
                return aVarLc;
            }
        }

        /* compiled from: DaggerMortgageRootComponent.java */
        public static final class e implements u<InterfaceC41203a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f202291a;

            public e(o oVar) {
                this.f202291a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41203a interfaceC41203aTb = this.f202291a.Tb();
                dagger.internal.t.c(interfaceC41203aTb);
                return interfaceC41203aTb;
            }
        }

        /* compiled from: DaggerMortgageRootComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f202292a;

            public f(o oVar) {
                this.f202292a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f202292a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(o oVar, cv.b bVar, MortgageRootArguments mortgageRootArguments, l lVar, C28478k c28478k, C6006a c6006a) {
            this.f202243a = bVar;
            this.f202245b = new f(oVar);
            this.f202247c = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f202245b);
            this.f202249d = B.a(com.avito.android.konveyor_adapter_module.d.a());
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f202251e = lVarA;
            this.f202253f = g.d(new com.avito.android.mortgage.root.list.items.issue.b(new com.avito.android.mortgage.root.list.items.issue.g(lVarA)));
            this.f202255g = g.d(new com.avito.android.mortgage.root.list.items.title.b(new com.avito.android.mortgage.root.list.items.title.e(this.f202251e)));
            this.f202257h = g.d(new com.avito.android.mortgage.root.list.items.borrower_title.b(new com.avito.android.mortgage.root.list.items.borrower_title.f(this.f202251e)));
            this.f202259i = g.d(new com.avito.android.mortgage.root.list.items.borrower_action.b(new com.avito.android.mortgage.root.list.items.borrower_action.g(this.f202251e)));
            this.f202261j = g.d(new com.avito.android.mortgage.root.list.items.borrower_add.b(new com.avito.android.mortgage.root.list.items.borrower_add.f(this.f202251e)));
            this.f202263k = g.d(new com.avito.android.mortgage.root.list.items.navigation.b(new j(this.f202251e)));
            this.f202265l = g.d(new com.avito.android.mortgage.root.list.items.privacy.b(new com.avito.android.mortgage.root.list.items.privacy.e(this.f202251e)));
            this.f202267m = g.d(new com.avito.android.mortgage.root.list.items.legacy_status.b(new com.avito.android.mortgage.root.list.items.legacy_status.g(this.f202251e)));
            this.f202269n = g.d(new com.avito.android.mortgage.root.list.items.status.b(com.avito.android.mortgage.root.list.items.status.e.a()));
            this.f202271o = g.d(new com.avito.android.mortgage.root.list.items.bank_tabs.b(new com.avito.android.mortgage.root.list.items.bank_tabs.f(this.f202251e)));
            this.f202273p = g.d(new com.avito.android.mortgage.root.list.items.bank.b(new com.avito.android.mortgage.root.list.items.bank.l(this.f202251e)));
            this.f202275q = g.d(new com.avito.android.mortgage.root.list.items.cta_banner.b(new com.avito.android.mortgage.root.list.items.cta_banner.f(this.f202251e)));
            this.f202277r = g.d(new com.avito.android.mortgage.root.list.items.support.b(new com.avito.android.mortgage.root.list.items.support.f(this.f202251e)));
            this.f202279s = g.d(new com.avito.android.mortgage.root.list.items.immutable_info.b(new com.avito.android.mortgage.root.list.items.immutable_info.f(this.f202251e)));
            this.f202280t = g.d(new com.avito.android.mortgage.root.list.items.credit_terms.b(com.avito.android.mortgage.root.list.items.credit_terms.e.a()));
            this.f202281u = g.d(new com.avito.android.mortgage.root.list.items.disclaimer.b(com.avito.android.mortgage.root.list.items.disclaimer.e.a()));
            this.f202282v = g.d(new com.avito.android.mortgage.root.list.items.team.b(new k(this.f202251e)));
            this.f202283w = g.d(new com.avito.android.mortgage.root.list.items.comment.b(com.avito.android.mortgage.root.list.items.comment.e.a()));
            this.f202284x = g.d(new com.avito.android.mortgage.root.list.items.bank_banner.b(new com.avito.android.mortgage.root.list.items.bank_banner.f(this.f202251e)));
            this.f202285y = g.d(new com.avito.android.mortgage.root.list.items.mortgage_progress.b(new com.avito.android.mortgage.root.list.items.mortgage_progress.f(this.f202251e)));
            this.f202286z = g.d(new com.avito.android.mortgage.root.list.items.realty_object.b(new com.avito.android.mortgage.root.list.items.realty_object.f(this.f202251e)));
            this.f202217A = g.d(new com.avito.android.mortgage.root.list.items.realty_object_details.d(new p(this.f202251e)));
            A.b bVarA = A.a(22, 1);
            bVarA.f393938b.add(this.f202249d);
            u<TV0.b<?, ?>> uVar = this.f202253f;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f202255g);
            list.add(this.f202257h);
            list.add(this.f202259i);
            list.add(this.f202261j);
            list.add(this.f202263k);
            list.add(this.f202265l);
            list.add(this.f202267m);
            list.add(this.f202269n);
            list.add(this.f202271o);
            list.add(this.f202273p);
            list.add(this.f202275q);
            list.add(this.f202277r);
            list.add(this.f202279s);
            list.add(this.f202280t);
            list.add(this.f202281u);
            list.add(this.f202282v);
            list.add(this.f202283w);
            list.add(this.f202284x);
            list.add(this.f202285y);
            list.add(this.f202286z);
            list.add(this.f202217A);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f202218B = uVarK;
            this.f202219C = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f202220D = g.d(r.a());
            this.f202221E = g.d(com.avito.android.mortgage.root.list.payloads.f.a());
            this.f202222F = g.d(com.avito.android.mortgage.root.list.items.bank_tabs.payload.b.a());
            this.f202223G = g.d(com.avito.android.mortgage.root.list.payloads.x.a());
            this.f202224H = g.d(com.avito.android.mortgage.root.list.payloads.A.a());
            this.f202225I = g.d(com.avito.android.mortgage.root.list.payloads.o.a());
            this.f202226J = g.d(com.avito.android.mortgage.root.list.payloads.l.a());
            this.f202227K = g.d(i.a());
            this.f202228L = g.d(com.avito.android.mortgage.root.list.payloads.u.a());
            this.f202229M = g.d(C32682c.a());
            this.f202230N = g.d(com.avito.android.mortgage.root.list.payloads.C.a());
            this.f202231O = g.d(com.avito.android.mortgage.root.list.items.mortgage_progress.payloads.c.a());
            this.f202232P = g.d(com.avito.android.mortgage.root.list.items.realty_object_details.payloads.c.a());
            A.b bVarA2 = A.a(13, 0);
            u<Z00.e> uVar2 = this.f202220D;
            List<u<T>> list2 = bVarA2.f393937a;
            list2.add(uVar2);
            list2.add(this.f202221E);
            list2.add(this.f202222F);
            list2.add(this.f202223G);
            list2.add(this.f202224H);
            list2.add(this.f202225I);
            list2.add(this.f202226J);
            list2.add(this.f202227K);
            list2.add(this.f202228L);
            list2.add(this.f202229M);
            list2.add(this.f202230N);
            list2.add(this.f202231O);
            list2.add(this.f202232P);
            this.f202233Q = g.d(new com.avito.android.mortgage.root.di.e(this.f202219C, this.f202218B, new Z00.b(bVarA2.b())));
            u<com.avito.android.mortgage.root.mvi.mapper.a> uVarD = g.d(com.avito.android.mortgage.root.mvi.mapper.d.a());
            this.f202234R = uVarD;
            this.f202235S = g.d(new C39845c(uVarD));
            C6007a c6007a = new C6007a(oVar);
            this.f202236T = c6007a;
            u<InterfaceC18246g> uVarD2 = g.d(new Y00.i(c6007a));
            this.f202237U = uVarD2;
            u<InterfaceC18243d> uVarD3 = g.d(new C18245f(uVarD2, this.f202236T));
            this.f202238V = uVarD3;
            this.f202239W = new E(uVarD3, this.f202235S);
            this.f202240X = dagger.internal.l.a(mortgageRootArguments);
            d dVar = new d(oVar);
            this.f202241Y = dVar;
            e eVar = new e(oVar);
            this.f202242Z = eVar;
            this.f202244a0 = new C6008c(oVar);
            this.f202246b0 = new C(com.avito.android.mortgage.util.e.a(), dVar, eVar, this.f202244a0);
            this.f202248c0 = g.d(this.f202246b0);
            u<w> uVarD4 = g.d(y.a());
            this.f202250d0 = uVarD4;
            this.f202252e0 = g.d(new v(uVarD4, this.f202248c0));
            u<InterfaceC32687a> uVarD5 = g.d(new C32692f(this.f202248c0, new b(oVar), this.f202244a0));
            this.f202256g0 = uVarD5;
            dagger.internal.l lVar2 = this.f202240X;
            u<t> uVar3 = this.f202252e0;
            u<R0> uVar4 = this.f202244a0;
            this.f202258h0 = new x(lVar2, uVarD5, uVar3, uVar4);
            this.f202260i0 = g.d(new C32702p(this.f202241Y, uVar4));
            this.f202262j0 = g.d(new C32696j(this.f202241Y, com.avito.android.mortgage.util.e.a(), this.f202244a0));
            this.f202264k0 = g.d(new C32699m(this.f202241Y, com.avito.android.mortgage.util.e.a(), this.f202244a0));
            this.f202266l0 = g.d(new F(this.f202242Z, this.f202244a0));
            this.f202268m0 = g.d(new M(this.f202248c0, this.f202242Z, this.f202244a0));
            this.f202270n0 = g.d(new J(this.f202242Z, this.f202244a0));
            this.f202272o0 = g.d(new s(this.f202242Z, this.f202248c0, this.f202244a0));
            u<N> uVarD6 = g.d(new P(this.f202242Z, this.f202244a0));
            this.f202274p0 = uVarD6;
            this.f202276q0 = new com.avito.android.mortgage.root.mvi.u(this.f202248c0, this.f202252e0, this.f202256g0, this.f202260i0, this.f202262j0, this.f202264k0, this.f202266l0, this.f202268m0, this.f202270n0, this.f202272o0, uVarD6, this.f202237U, this.f202244a0);
            this.f202278r0 = new com.avito.android.mortgage.root.f(new com.avito.android.mortgage.root.mvi.z(this.f202239W, this.f202258h0, this.f202276q0, com.avito.android.mortgage.root.mvi.C.a(), this.f202247c), this.f202256g0);
        }

        @Override // com.avito.android.mortgage.root.di.b
        public final void a(MortgageRootFragment mortgageRootFragment) {
            mortgageRootFragment.f202152n0 = this.f202247c.get();
            mortgageRootFragment.f202153o0 = new com.avito.android.mortgage.root.b(this.f202233Q.get(), this.f202218B.get());
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f202243a.u4();
            dagger.internal.t.c(aVarU4);
            mortgageRootFragment.f202154p0 = aVarU4;
            mortgageRootFragment.f202155q0 = this.f202278r0;
        }
    }

    public static b.a a() {
        return new b();
    }
}
