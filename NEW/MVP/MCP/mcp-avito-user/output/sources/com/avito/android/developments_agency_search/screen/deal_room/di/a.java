package com.avito.android.developments_agency_search.screen.deal_room.di;

import Bw.InterfaceC13195c;
import Qw.InterfaceC14939a;
import android.content.ContentResolver;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.developments_agency_search.screen.deal_room.DealRoomFragment;
import com.avito.android.developments_agency_search.screen.deal_room.di.b;
import com.avito.android.developments_agency_search.screen.deal_room.i;
import com.avito.android.developments_agency_search.screen.deal_room.k;
import com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.C;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.C29857o;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.C29859q;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.C29861t;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.P;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.T;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.y;
import com.avito.android.developments_agency_search.screen.deal_room.use_case.h;
import com.avito.android.developments_agency_search.screen.deal_room.w;
import com.avito.android.developments_agency_search.screen.deal_room.x;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;
import sw.InterfaceC48423a;

/* compiled from: DaggerDealRoomComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerDealRoomComponent.java */
    public static final class b implements com.avito.android.developments_agency_search.screen.deal_room.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137477A;

        /* renamed from: B, reason: collision with root package name */
        public final l f137478B;

        /* renamed from: C, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137479C;

        /* renamed from: D, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137480D;

        /* renamed from: E, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137481E;

        /* renamed from: F, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137482F;

        /* renamed from: G, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137483G;

        /* renamed from: H, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137484H;

        /* renamed from: I, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137485I;

        /* renamed from: J, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137486J;

        /* renamed from: K, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137487K;

        /* renamed from: L, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137488L;

        /* renamed from: M, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137489M;

        /* renamed from: N, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137490N;

        /* renamed from: O, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f137491O;

        /* renamed from: P, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f137492P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f137493Q;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f137494a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.developments_agency_search.screen.deal_room.di.c f137495b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC48423a> f137496c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC14939a> f137497d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f137498e;

        /* renamed from: f, reason: collision with root package name */
        public final l f137499f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ContentResolver> f137500g;

        /* renamed from: h, reason: collision with root package name */
        public final Ow.e f137501h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28373a> f137502i;

        /* renamed from: j, reason: collision with root package name */
        public final l f137503j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC13195c> f137504k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.developments_agency_search.screen.deal_room.mvi.u> f137505l;

        /* renamed from: m, reason: collision with root package name */
        public final C29859q f137506m;

        /* renamed from: n, reason: collision with root package name */
        public final C29857o f137507n;

        /* renamed from: o, reason: collision with root package name */
        public final C f137508o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.developments_agency_search.screen.deal_room.e> f137509p;

        /* renamed from: q, reason: collision with root package name */
        public final u<i> f137510q;

        /* renamed from: r, reason: collision with root package name */
        public final T f137511r;

        /* renamed from: s, reason: collision with root package name */
        public final w f137512s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC28481c> f137513t;

        /* renamed from: u, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f137514u;

        /* renamed from: v, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f137515v;

        /* renamed from: w, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137516w;

        /* renamed from: x, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137517x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.developments_agency_search.screen.deal_room.adapter.note.d> f137518y;

        /* renamed from: z, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137519z;

        /* compiled from: DaggerDealRoomComponent.java */
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_room.di.a$b$a, reason: collision with other inner class name */
        public static final class C4150a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.deal_room.di.c f137520a;

            public C4150a(com.avito.android.developments_agency_search.screen.deal_room.di.c cVar) {
                this.f137520a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f137520a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerDealRoomComponent.java */
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_room.di.a$b$b, reason: collision with other inner class name */
        public static final class C4151b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.deal_room.di.c f137521a;

            public C4151b(com.avito.android.developments_agency_search.screen.deal_room.di.c cVar) {
                this.f137521a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f137521a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerDealRoomComponent.java */
        public static final class c implements u<InterfaceC14939a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.deal_room.di.c f137522a;

            public c(com.avito.android.developments_agency_search.screen.deal_room.di.c cVar) {
                this.f137522a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14939a interfaceC14939aYg = this.f137522a.yg();
                t.c(interfaceC14939aYg);
                return interfaceC14939aYg;
            }
        }

        /* compiled from: DaggerDealRoomComponent.java */
        public static final class d implements u<InterfaceC48423a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.deal_room.di.c f137523a;

            public d(com.avito.android.developments_agency_search.screen.deal_room.di.c cVar) {
                this.f137523a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48423a interfaceC48423aJ1 = this.f137523a.J1();
                t.c(interfaceC48423aJ1);
                return interfaceC48423aJ1;
            }
        }

        /* compiled from: DaggerDealRoomComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.deal_room.di.c f137524a;

            public e(com.avito.android.developments_agency_search.screen.deal_room.di.c cVar) {
                this.f137524a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f137524a.c();
                t.c(r0C);
                return r0C;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.developments_agency_search.screen.deal_room.di.c cVar, cv.b bVar, DealRoomArguments dealRoomArguments, C28478k c28478k, Y41.l lVar, Context context, C4149a c4149a) {
            this.f137494a = bVar;
            this.f137495b = cVar;
            this.f137496c = new d(cVar);
            this.f137497d = new c(cVar);
            this.f137498e = new e(cVar);
            l lVarA = l.a(context);
            this.f137499f = lVarA;
            u<ContentResolver> uVarD = g.d(new com.avito.android.developments_agency_search.screen.deal_room.di.e(lVarA));
            this.f137500g = uVarD;
            this.f137501h = new Ow.e(uVarD);
            this.f137502i = new C4150a(cVar);
            l lVarA2 = l.a(dealRoomArguments);
            this.f137503j = lVarA2;
            u<InterfaceC13195c> uVarD2 = g.d(new Bw.e(lVarA2, this.f137502i));
            this.f137504k = uVarD2;
            u<com.avito.android.developments_agency_search.screen.deal_room.mvi.u> uVarD3 = g.d(new y(this.f137496c, this.f137497d, this.f137498e, this.f137501h, this.f137500g, uVarD2, this.f137503j));
            this.f137505l = uVarD3;
            this.f137506m = new C29859q(uVarD3);
            this.f137507n = new C29857o(uVarD3, this.f137504k);
            this.f137508o = new C(com.avito.android.realty_agency.beduin.b.a());
            this.f137509p = g.d(com.avito.android.developments_agency_search.screen.deal_room.g.a());
            u<i> uVarD4 = g.d(new k(this.f137499f));
            this.f137510q = uVarD4;
            this.f137511r = new T(this.f137499f, uVarD4, this.f137509p);
            this.f137512s = new w(new C29861t(this.f137506m, this.f137507n, this.f137508o, new P(com.avito.android.developments_agency_search.screen.deal_room.use_case.f.a(), h.a(), com.avito.android.developments_agency_search.screen.deal_room.use_case.b.a(), com.avito.android.developments_agency_search.screen.deal_room.use_case.d.a(), this.f137511r)));
            this.f137513t = new C4151b(cVar);
            this.f137514u = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f137513t);
            this.f137515v = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f137516w = g.d(new com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_progress.b(com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_progress.e.a()));
            this.f137517x = g.d(new com.avito.android.realty_agency.blueprint.text_block.b(com.avito.android.realty_agency.blueprint.text_block.d.a()));
            u<com.avito.android.developments_agency_search.screen.deal_room.adapter.note.d> uVarD5 = g.d(com.avito.android.developments_agency_search.screen.deal_room.adapter.note.g.a());
            this.f137518y = uVarD5;
            this.f137519z = g.d(new com.avito.android.developments_agency_search.screen.deal_room.adapter.note.b(uVarD5));
            this.f137477A = g.d(new com.avito.android.developments_agency_search.adapter.spacer.c(com.avito.android.developments_agency_search.adapter.spacer.e.a()));
            l lVarA3 = l.a(lVar);
            this.f137478B = lVarA3;
            this.f137479C = g.d(new com.avito.android.developments_agency_search.screen.deal_room.adapter.development.b(new com.avito.android.developments_agency_search.screen.deal_room.adapter.development.f(lVarA3)));
            this.f137480D = g.d(new com.avito.android.developments_agency_search.screen.deal_room.adapter.empty_development_list_item.c(new com.avito.android.developments_agency_search.screen.deal_room.adapter.empty_development_list_item.f(this.f137478B)));
            this.f137481E = g.d(new com.avito.android.developments_agency_search.screen.deal_room.adapter.accordion.b(new com.avito.android.developments_agency_search.screen.deal_room.adapter.accordion.f(this.f137478B)));
            this.f137482F = g.d(new com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot.c(new com.avito.android.developments_agency_search.screen.deal_room.adapter.booking_lot.f(this.f137478B)));
            this.f137483G = g.d(new com.avito.android.developments_agency_search.adapter.gallery.c(com.avito.android.developments_agency_search.adapter.gallery.e.a()));
            this.f137484H = g.d(new com.avito.android.developments_agency_search.screen.deal_room.adapter.get_to_deal.c(new com.avito.android.developments_agency_search.screen.deal_room.adapter.get_to_deal.g(this.f137478B)));
            this.f137485I = g.d(new com.avito.android.developments_agency_search.screen.deal_room.adapter.document.c(new com.avito.android.developments_agency_search.screen.deal_room.adapter.document.g(this.f137478B)));
            this.f137486J = g.d(new com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_stage_banner.c(com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_stage_banner.e.a()));
            this.f137487K = g.d(new com.avito.android.developments_agency_search.screen.deal_room.adapter.send_for_verification_button.c(new com.avito.android.developments_agency_search.screen.deal_room.adapter.send_for_verification_button.f(this.f137478B)));
            this.f137488L = g.d(new com.avito.android.developments_agency_search.screen.deal_room.adapter.award_banner.c(com.avito.android.developments_agency_search.screen.deal_room.adapter.award_banner.e.a()));
            this.f137489M = g.d(new com.avito.android.developments_agency_search.screen.deal_room.adapter.revenue_recalculation_banner.c(com.avito.android.developments_agency_search.screen.deal_room.adapter.revenue_recalculation_banner.e.a()));
            this.f137490N = g.d(new com.avito.android.developments_agency_search.screen.deal_room.adapter.selection_block.c(new com.avito.android.developments_agency_search.screen.deal_room.adapter.selection_block.f(this.f137478B)));
            A.b bVarA = A.a(16, 1);
            bVarA.f393938b.add(this.f137515v);
            u<TV0.b<?, ?>> uVar = this.f137516w;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f137517x);
            list.add(this.f137519z);
            list.add(this.f137477A);
            list.add(this.f137479C);
            list.add(this.f137480D);
            list.add(this.f137481E);
            list.add(this.f137482F);
            list.add(this.f137483G);
            list.add(this.f137484H);
            list.add(this.f137485I);
            list.add(this.f137486J);
            list.add(this.f137487K);
            list.add(this.f137488L);
            list.add(this.f137489M);
            list.add(this.f137490N);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f137491O = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f137492P = uVarH;
            this.f137493Q = g.d(new f(uVarH, this.f137491O));
        }

        @Override // com.avito.android.developments_agency_search.screen.deal_room.di.b
        public final void a(DealRoomFragment dealRoomFragment) {
            dealRoomFragment.f137223n0 = this.f137512s;
            dealRoomFragment.f137225p0 = this.f137514u.get();
            dealRoomFragment.f137226q0 = this.f137493Q.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f137494a.u4();
            t.c(aVarU4);
            dealRoomFragment.f137227r0 = aVarU4;
            dealRoomFragment.f137228s0 = this.f137518y.get();
            dealRoomFragment.f137233x0 = new x(this.f137495b.h());
        }
    }

    /* compiled from: DaggerDealRoomComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.developments_agency_search.screen.deal_room.di.b.a
        public final com.avito.android.developments_agency_search.screen.deal_room.di.b a(DealRoomArguments dealRoomArguments, C28478k c28478k, Y41.l lVar, com.avito.android.developments_agency_search.screen.deal_room.di.c cVar, InterfaceC39417a interfaceC39417a, Context context) {
            dealRoomArguments.getClass();
            interfaceC39417a.getClass();
            return new b(cVar, interfaceC39417a, dealRoomArguments, c28478k, lVar, context, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
