package com.avito.android.developments_agency_search.screen.deal_room_development.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.developments_agency_search.screen.deal_room_development.DealRoomDevelopmentArguments;
import com.avito.android.developments_agency_search.screen.deal_room_development.DealRoomDevelopmentFragment;
import com.avito.android.developments_agency_search.screen.deal_room_development.di.b;
import com.avito.android.developments_agency_search.screen.deal_room_development.j;
import com.avito.android.developments_agency_search.screen.deal_room_development.mvi.f;
import com.avito.android.developments_agency_search.screen.deal_room_development.mvi.h;
import com.avito.android.developments_agency_search.screen.deal_room_development.mvi.k;
import com.avito.android.developments_agency_search.screen.deal_room_development.mvi.m;
import com.avito.android.developments_agency_search.screen.deal_room_development.mvi.o;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerDealRoomDevelopmentComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerDealRoomDevelopmentComponent.java */
    public static final class b implements com.avito.android.developments_agency_search.screen.deal_room_development.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f137895a;

        /* renamed from: b, reason: collision with root package name */
        public final h f137896b;

        /* renamed from: c, reason: collision with root package name */
        public final f f137897c;

        /* renamed from: d, reason: collision with root package name */
        public final m f137898d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.developments_agency_search.screen.deal_room_development.a> f137899e;

        /* renamed from: f, reason: collision with root package name */
        public final j f137900f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f137901g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f137902h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f137903i;

        /* renamed from: j, reason: collision with root package name */
        public final l f137904j;

        /* renamed from: k, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137905k;

        /* renamed from: l, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137906l;

        /* renamed from: m, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137907m;

        /* renamed from: n, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137908n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.developments_agency_search.adapter.error_layout.d> f137909o;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f137910p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f137911q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f137912r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f137913s;

        /* compiled from: DaggerDealRoomDevelopmentComponent.java */
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_room_development.di.a$b$a, reason: collision with other inner class name */
        public static final class C4158a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_agency_search.screen.deal_room_development.di.c f137914a;

            public C4158a(com.avito.android.developments_agency_search.screen.deal_room_development.di.c cVar) {
                this.f137914a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f137914a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.developments_agency_search.screen.deal_room_development.di.c cVar, cv.b bVar, DealRoomDevelopmentArguments dealRoomDevelopmentArguments, C28478k c28478k, Y41.l lVar, C4157a c4157a) {
            this.f137895a = bVar;
            l lVarA = l.a(dealRoomDevelopmentArguments);
            this.f137896b = new h(lVarA);
            this.f137897c = new f(lVarA);
            this.f137898d = new m(com.avito.android.realty_agency.beduin.b.a());
            u<com.avito.android.developments_agency_search.screen.deal_room_development.a> uVarD = g.d(com.avito.android.developments_agency_search.screen.deal_room_development.c.a());
            this.f137899e = uVarD;
            this.f137900f = new j(new k(this.f137896b, this.f137897c, this.f137898d, new o(uVarD)));
            this.f137901g = new C4158a(cVar);
            this.f137902h = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f137901g);
            this.f137903i = B.a(com.avito.android.konveyor_adapter_module.d.a());
            l lVarA2 = l.a(lVar);
            this.f137904j = lVarA2;
            this.f137905k = g.d(new com.avito.android.developments_agency_search.screen.deal_room_development.adapter.main_content.b(new com.avito.android.developments_agency_search.screen.deal_room_development.adapter.main_content.g(lVarA2)));
            this.f137906l = g.d(new com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.c(new com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.g(this.f137904j)));
            this.f137907m = g.d(new com.avito.android.developments_agency_search.adapter.spacer.c(com.avito.android.developments_agency_search.adapter.spacer.e.a()));
            this.f137908n = g.d(new com.avito.android.developments_agency_search.adapter.gallery.c(com.avito.android.developments_agency_search.adapter.gallery.e.a()));
            u<com.avito.android.developments_agency_search.adapter.error_layout.d> uVarD2 = g.d(com.avito.android.developments_agency_search.adapter.error_layout.g.a());
            this.f137909o = uVarD2;
            this.f137910p = g.d(new com.avito.android.developments_agency_search.adapter.error_layout.c(uVarD2));
            A.b bVarA = A.a(5, 1);
            bVarA.f393938b.add(this.f137903i);
            u<TV0.b<?, ?>> uVar = this.f137905k;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f137906l);
            list.add(this.f137907m);
            list.add(this.f137908n);
            list.add(this.f137910p);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f137911q = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f137912r = uVarH;
            this.f137913s = g.d(new e(uVarH, this.f137911q));
        }

        @Override // com.avito.android.developments_agency_search.screen.deal_room_development.di.b
        public final void a(DealRoomDevelopmentFragment dealRoomDevelopmentFragment) {
            dealRoomDevelopmentFragment.f137825n0 = this.f137900f;
            dealRoomDevelopmentFragment.f137827p0 = this.f137902h.get();
            dealRoomDevelopmentFragment.f137828q0 = this.f137913s.get();
            dealRoomDevelopmentFragment.f137829r0 = this.f137912r.get();
            dealRoomDevelopmentFragment.f137830s0 = this.f137909o.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f137895a.u4();
            t.c(aVarU4);
            dealRoomDevelopmentFragment.f137831t0 = aVarU4;
        }
    }

    /* compiled from: DaggerDealRoomDevelopmentComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.developments_agency_search.screen.deal_room_development.di.b.a
        public final com.avito.android.developments_agency_search.screen.deal_room_development.di.b a(DealRoomDevelopmentArguments dealRoomDevelopmentArguments, C28478k c28478k, Y41.l lVar, com.avito.android.developments_agency_search.screen.deal_room_development.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(cVar, interfaceC39417a, dealRoomDevelopmentArguments, c28478k, lVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
