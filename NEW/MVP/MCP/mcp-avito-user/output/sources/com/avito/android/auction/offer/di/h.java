package com.avito.android.auction.offer.di;

import Pd.InterfaceC14769a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.auction.offer.AuctionOfferFragment;
import com.avito.android.auction.offer.AuctionOfferParams;
import com.avito.android.auction.offer.di.a;
import com.avito.android.auction.offer.domain.i;
import com.avito.android.auction.offer.domain.k;
import com.avito.android.auction.offer.mvi.m;
import com.avito.android.auction.offer.mvi.o;
import com.avito.android.auction.offer.mvi.p;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.view.a;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gj.InterfaceC40691b;
import lD.C43617a;
import sj0.InterfaceC48373a;

/* compiled from: DaggerAuctionOfferComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class h {

    /* compiled from: DaggerAuctionOfferComponent.java */
    public static final class b implements com.avito.android.auction.offer.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.auction.offer.di.b f92473a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.auction.offer.a f92474b;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f92475c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC14769a> f92476d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC48373a> f92477e;

        /* renamed from: f, reason: collision with root package name */
        public final u<C43617a> f92478f;

        /* renamed from: g, reason: collision with root package name */
        public final u<x> f92479g;

        /* renamed from: h, reason: collision with root package name */
        public final i f92480h;

        /* renamed from: i, reason: collision with root package name */
        public final l f92481i;

        /* renamed from: j, reason: collision with root package name */
        public final u<gj.d> f92482j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f92483k;

        /* renamed from: l, reason: collision with root package name */
        public final u<a.b> f92484l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC40691b> f92485m;

        /* renamed from: n, reason: collision with root package name */
        public final u<p> f92486n;

        /* renamed from: o, reason: collision with root package name */
        public final k f92487o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.auction.offer.mvi.d f92488p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC28373a> f92489q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.auction.offer.mvi.k f92490r;

        /* compiled from: DaggerAuctionOfferComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.auction.offer.di.b f92491a;

            public a(com.avito.android.auction.offer.di.b bVar) {
                this.f92491a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f92491a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerAuctionOfferComponent.java */
        /* renamed from: com.avito.android.auction.offer.di.h$b$b, reason: collision with other inner class name */
        public static final class C2734b implements u<InterfaceC14769a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.auction.offer.di.b f92492a;

            public C2734b(com.avito.android.auction.offer.di.b bVar) {
                this.f92492a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14769a interfaceC14769aR7 = this.f92492a.r7();
                t.c(interfaceC14769aR7);
                return interfaceC14769aR7;
            }
        }

        /* compiled from: DaggerAuctionOfferComponent.java */
        public static final class c implements u<C43617a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.auction.offer.di.b f92493a;

            public c(com.avito.android.auction.offer.di.b bVar) {
                this.f92493a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f92493a.C0();
            }
        }

        /* compiled from: DaggerAuctionOfferComponent.java */
        public static final class d implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final kj.c f92494a;

            public d(kj.c cVar) {
                this.f92494a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f92494a.El();
            }
        }

        /* compiled from: DaggerAuctionOfferComponent.java */
        public static final class e implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.auction.offer.di.b f92495a;

            public e(com.avito.android.auction.offer.di.b bVar) {
                this.f92495a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f92495a.t();
                t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerAuctionOfferComponent.java */
        public static final class f implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f92496a;

            public f(cv.b bVar) {
                this.f92496a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f92496a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerAuctionOfferComponent.java */
        public static final class g implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f92497a;

            public g(cv.b bVar) {
                this.f92497a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f92497a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerAuctionOfferComponent.java */
        /* renamed from: com.avito.android.auction.offer.di.h$b$h, reason: collision with other inner class name */
        public static final class C2735h implements u<InterfaceC48373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.auction.offer.di.b f92498a;

            public C2735h(com.avito.android.auction.offer.di.b bVar) {
                this.f92498a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48373a interfaceC48373aV7 = this.f92498a.v7();
                t.c(interfaceC48373aV7);
                return interfaceC48373aV7;
            }
        }

        public b(kj.c cVar, cv.b bVar, com.avito.android.auction.offer.di.b bVar2, AuctionOfferParams auctionOfferParams, com.avito.android.auction.offer.a aVar, Boolean bool, a aVar2) {
            this.f92473a = bVar2;
            this.f92474b = aVar;
            this.f92475c = bVar;
            C2734b c2734b = new C2734b(bVar2);
            C2735h c2735h = new C2735h(bVar2);
            c cVar2 = new c(bVar2);
            this.f92478f = cVar2;
            this.f92480h = new i(c2734b, c2735h, cVar2, new e(bVar2));
            this.f92481i = l.a(auctionOfferParams);
            u<InterfaceC40691b> uVarD = dagger.internal.g.d(new com.avito.android.auction.offer.di.e(new d(cVar), new f(bVar), new g(bVar)));
            this.f92485m = uVarD;
            u<p> uVarD2 = dagger.internal.g.d(new com.avito.android.auction.offer.di.f(uVarD));
            this.f92486n = uVarD2;
            k kVar = new k(uVarD2);
            this.f92487o = kVar;
            this.f92488p = new com.avito.android.auction.offer.mvi.d(this.f92480h, this.f92481i, kVar, this.f92478f);
            this.f92489q = new a(bVar2);
            this.f92490r = new com.avito.android.auction.offer.mvi.k(new com.avito.android.auction.offer.mvi.i(this.f92488p, new com.avito.android.auction.offer.mvi.f(this.f92480h, this.f92481i, this.f92487o, new com.avito.android.auction.offer.domain.c(l.a(bool), this.f92489q), this.f92478f), m.a(), o.a()));
        }

        @Override // com.avito.android.auction.offer.di.a
        public final void a(AuctionOfferFragment auctionOfferFragment) throws BlueprintCollisionException {
            com.avito.konveyor.a aVarB = b();
            com.avito.android.auction.offer.di.c.f92468a.getClass();
            auctionOfferFragment.f92428o0 = new com.avito.konveyor.adapter.h(aVarB, aVarB, null, 4, null);
            auctionOfferFragment.f92429p0 = b();
            com.avito.android.auction.offer.di.b bVar = this.f92473a;
            com.avito.android.util.text.a aVarE = bVar.e();
            t.c(aVarE);
            auctionOfferFragment.f92430q0 = aVarE;
            auctionOfferFragment.f92431r0 = this.f92490r;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f92475c.u4();
            t.c(aVarU4);
            auctionOfferFragment.f92432s0 = aVarU4;
            auctionOfferFragment.f92433t0 = bVar.C0();
        }

        public final com.avito.konveyor.a b() throws BlueprintCollisionException {
            com.avito.android.auction.offer.items.benefit.a aVar = new com.avito.android.auction.offer.items.benefit.a(new com.avito.android.auction.offer.items.benefit.c());
            com.avito.android.util.text.a aVarE = this.f92473a.e();
            t.c(aVarE);
            com.avito.android.auction.offer.items.link.a aVar2 = new com.avito.android.auction.offer.items.link.a(new com.avito.android.auction.offer.items.link.d(aVarE, this.f92474b));
            com.avito.android.auction.offer.items.title.a aVar3 = new com.avito.android.auction.offer.items.title.a(new com.avito.android.auction.offer.items.title.c());
            com.avito.android.auction.offer.di.c.f92468a.getClass();
            a.C10493a c10493a = new a.C10493a();
            c10493a.b(aVar);
            c10493a.b(aVar2);
            c10493a.b(aVar3);
            return c10493a.a();
        }
    }

    /* compiled from: DaggerAuctionOfferComponent.java */
    public static final class c implements a.InterfaceC2733a {
        public c() {
        }

        @Override // com.avito.android.auction.offer.di.a.InterfaceC2733a
        public final com.avito.android.auction.offer.di.a a(kj.c cVar, InterfaceC39417a interfaceC39417a, com.avito.android.auction.offer.di.b bVar, AuctionOfferParams auctionOfferParams, AuctionOfferFragment auctionOfferFragment, boolean z12) {
            interfaceC39417a.getClass();
            return new b(cVar, interfaceC39417a, bVar, auctionOfferParams, auctionOfferFragment, Boolean.valueOf(z12), null);
        }
    }

    public static a.InterfaceC2733a a() {
        return new c();
    }
}
