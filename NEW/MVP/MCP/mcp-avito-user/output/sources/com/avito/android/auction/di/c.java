package com.avito.android.auction.di;

import com.avito.android.auction.AuctionFragment;
import com.avito.android.auction.di.a;
import com.avito.android.auction.o;
import com.avito.android.auction.s;
import com.avito.android.deep_linking.links.AuctionBody;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerAuctionComponent.java */
@e
/* loaded from: classes11.dex */
public final class c {

    /* compiled from: DaggerAuctionComponent.java */
    public static final class b implements com.avito.android.auction.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f92389a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f92390b;

        /* renamed from: c, reason: collision with root package name */
        public final u<o> f92391c;

        /* compiled from: DaggerAuctionComponent.java */
        public static final class a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.auction.details.di.a f92392a;

            public a(com.avito.android.auction.details.di.a aVar) {
                this.f92392a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f92392a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        public b(com.avito.android.auction.details.di.a aVar, cv.b bVar, AuctionBody auctionBody, a aVar2) {
            this.f92389a = bVar;
            this.f92391c = g.d(new s(l.a(auctionBody), new a(aVar)));
        }

        @Override // com.avito.android.auction.di.a
        public final void a(AuctionFragment auctionFragment) {
            auctionFragment.f92305n0 = this.f92391c.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f92389a.u4();
            t.c(aVarU4);
            auctionFragment.f92306o0 = aVarU4;
        }
    }

    /* compiled from: DaggerAuctionComponent.java */
    /* renamed from: com.avito.android.auction.di.c$c, reason: collision with other inner class name */
    public static final class C2728c implements a.InterfaceC2727a {

        /* renamed from: a, reason: collision with root package name */
        public AuctionBody f92393a;

        /* renamed from: b, reason: collision with root package name */
        public com.avito.android.auction.details.di.a f92394b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC39417a f92395c;

        public C2728c() {
        }

        @Override // com.avito.android.auction.di.a.InterfaceC2727a
        public final a.InterfaceC2727a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f92395c = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.auction.di.a.InterfaceC2727a
        public final a.InterfaceC2727a b(com.avito.android.auction.details.di.a aVar) {
            this.f92394b = aVar;
            return this;
        }

        @Override // com.avito.android.auction.di.a.InterfaceC2727a
        public final com.avito.android.auction.di.a build() {
            t.a(AuctionBody.class, this.f92393a);
            t.a(com.avito.android.auction.details.di.a.class, this.f92394b);
            t.a(cv.b.class, this.f92395c);
            return new b(this.f92394b, this.f92395c, this.f92393a, null);
        }

        @Override // com.avito.android.auction.di.a.InterfaceC2727a
        public final a.InterfaceC2727a c(AuctionBody auctionBody) {
            this.f92393a = auctionBody;
            return this;
        }
    }

    public static a.InterfaceC2727a a() {
        return new C2728c();
    }
}
