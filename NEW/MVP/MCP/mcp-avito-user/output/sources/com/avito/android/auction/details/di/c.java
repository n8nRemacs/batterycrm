package com.avito.android.auction.details.di;

import com.avito.android.auction.details.AuctionDetailsSheetActivity;
import com.avito.android.auction.details.di.b;
import com.avito.android.auction.details.mvi.d;
import com.avito.android.auction.details.mvi.f;
import com.avito.android.auction.details.mvi.i;
import com.avito.android.auction.details.mvi.k;
import com.avito.android.auction.details.mvi.m;
import com.avito.android.auction.details.r;
import com.avito.android.deep_linking.links.AuctionDetails;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;

/* compiled from: DaggerAuctionDetailsSheetComponent.java */
@e
/* loaded from: classes11.dex */
public final class c {

    /* compiled from: DaggerAuctionDetailsSheetComponent.java */
    public static final class b implements com.avito.android.auction.details.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f92336a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.auction.details.di.a f92337b;

        /* renamed from: c, reason: collision with root package name */
        public final r f92338c;

        public b(com.avito.android.auction.details.di.a aVar, cv.b bVar, AuctionDetails auctionDetails, a aVar2) {
            this.f92336a = bVar;
            this.f92337b = aVar;
            this.f92338c = new r(new i(new f(l.a(auctionDetails)), d.a(), k.a(), m.a()));
        }

        @Override // com.avito.android.auction.details.di.b
        public final void a(AuctionDetailsSheetActivity auctionDetailsSheetActivity) {
            auctionDetailsSheetActivity.f92321m = this.f92338c;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f92336a.u4();
            t.c(aVarU4);
            auctionDetailsSheetActivity.f92323o = aVarU4;
            com.avito.android.auction.details.di.a aVar = this.f92337b;
            auctionDetailsSheetActivity.f92324p = aVar.h();
            com.avito.android.util.text.a aVarE = aVar.e();
            t.c(aVarE);
            auctionDetailsSheetActivity.f92325q = aVarE;
        }
    }

    /* compiled from: DaggerAuctionDetailsSheetComponent.java */
    /* renamed from: com.avito.android.auction.details.di.c$c, reason: collision with other inner class name */
    public static final class C2725c implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public AuctionDetails f92339a;

        /* renamed from: b, reason: collision with root package name */
        public com.avito.android.auction.details.di.a f92340b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC39417a f92341c;

        public C2725c() {
        }

        @Override // com.avito.android.auction.details.di.b.a
        public final b.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f92341c = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.auction.details.di.b.a
        public final b.a b(com.avito.android.auction.details.di.a aVar) {
            this.f92340b = aVar;
            return this;
        }

        @Override // com.avito.android.auction.details.di.b.a
        public final com.avito.android.auction.details.di.b build() {
            t.a(AuctionDetails.class, this.f92339a);
            t.a(com.avito.android.auction.details.di.a.class, this.f92340b);
            t.a(cv.b.class, this.f92341c);
            return new b(this.f92340b, this.f92341c, this.f92339a, null);
        }

        @Override // com.avito.android.auction.details.di.b.a
        public final b.a c(AuctionDetails auctionDetails) {
            this.f92339a = auctionDetails;
            return this;
        }
    }

    public static b.a a() {
        return new C2725c();
    }
}
