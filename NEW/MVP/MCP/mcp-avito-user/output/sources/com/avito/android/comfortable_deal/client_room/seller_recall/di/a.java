package com.avito.android.comfortable_deal.client_room.seller_recall.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.client_room.seller_recall.SellerRecallFragment;
import com.avito.android.comfortable_deal.client_room.seller_recall.di.b;
import com.avito.android.comfortable_deal.client_room.seller_recall.model.SellerRecallArguments;
import com.avito.android.comfortable_deal.client_room.seller_recall.mvi.f;
import com.avito.android.comfortable_deal.client_room.seller_recall.mvi.h;
import com.avito.android.comfortable_deal.client_room.seller_recall.mvi.j;
import com.avito.android.comfortable_deal.client_room.seller_recall.s;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSellerRecallComponent.java */
@e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerSellerRecallComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.comfortable_deal.client_room.seller_recall.di.b.a
        public final com.avito.android.comfortable_deal.client_room.seller_recall.di.b a(com.avito.android.comfortable_deal.di.a aVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, SellerRecallArguments sellerRecallArguments) {
            interfaceC39417a.getClass();
            sellerRecallArguments.getClass();
            return new c(aVar, interfaceC39417a, c28478k, sellerRecallArguments, null);
        }
    }

    /* compiled from: DaggerSellerRecallComponent.java */
    public static final class c implements com.avito.android.comfortable_deal.client_room.seller_recall.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f119951a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28373a> f119952b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.client_room.seller_recall.mvi.c f119953c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28481c> f119954d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f119955e;

        /* renamed from: f, reason: collision with root package name */
        public final l f119956f;

        /* renamed from: g, reason: collision with root package name */
        public final l f119957g;

        /* compiled from: DaggerSellerRecallComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.client_room.seller_recall.di.a$c$a, reason: collision with other inner class name */
        public static final class C3525a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f119958a;

            public C3525a(com.avito.android.comfortable_deal.di.a aVar) {
                this.f119958a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f119958a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSellerRecallComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f119959a;

            public b(com.avito.android.comfortable_deal.di.a aVar) {
                this.f119959a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f119959a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.comfortable_deal.di.a aVar, cv.b bVar, C28478k c28478k, SellerRecallArguments sellerRecallArguments, C3524a c3524a) {
            this.f119951a = bVar;
            this.f119953c = new com.avito.android.comfortable_deal.client_room.seller_recall.mvi.c(new C3525a(aVar));
            this.f119954d = new b(aVar);
            this.f119955e = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f119954d);
            this.f119956f = l.a(sellerRecallArguments);
            this.f119957g = l.a(new com.avito.android.comfortable_deal.client_room.seller_recall.u(new com.avito.android.comfortable_deal.client_room.seller_recall.t(new f(this.f119953c, h.a(), j.a(), this.f119955e, this.f119956f))));
        }

        @Override // com.avito.android.comfortable_deal.client_room.seller_recall.di.b
        public final void a(SellerRecallFragment sellerRecallFragment) {
            sellerRecallFragment.f119934n0 = (s.a) this.f119957g.f393949a;
            sellerRecallFragment.f119936p0 = this.f119955e.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f119951a.u4();
            t.c(aVarU4);
            sellerRecallFragment.f119937q0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
