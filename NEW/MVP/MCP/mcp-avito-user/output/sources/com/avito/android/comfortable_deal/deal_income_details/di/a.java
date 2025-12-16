package com.avito.android.comfortable_deal.deal_income_details.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.deal_income_details.DealIncomeDetailsDialog;
import com.avito.android.comfortable_deal.deal_income_details.di.b;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerDealIncomeDetailsComponent.java */
@e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerDealIncomeDetailsComponent.java */
    public static final class b implements com.avito.android.comfortable_deal.deal_income_details.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f121820a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f121821b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f121822c;

        /* compiled from: DaggerDealIncomeDetailsComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.deal_income_details.di.a$b$a, reason: collision with other inner class name */
        public static final class C3600a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f121823a;

            public C3600a(com.avito.android.comfortable_deal.di.a aVar) {
                this.f121823a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f121823a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.comfortable_deal.di.a aVar, cv.b bVar, C28478k c28478k, C3599a c3599a) {
            this.f121820a = bVar;
            this.f121821b = new C3600a(aVar);
            this.f121822c = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f121821b);
        }

        @Override // com.avito.android.comfortable_deal.deal_income_details.di.b
        public final void a(DealIncomeDetailsDialog dealIncomeDetailsDialog) {
            dealIncomeDetailsDialog.f121804h0 = this.f121822c.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f121820a.u4();
            t.c(aVarU4);
            dealIncomeDetailsDialog.f121806j0 = aVarU4;
        }
    }

    /* compiled from: DaggerDealIncomeDetailsComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.comfortable_deal.deal_income_details.di.b.a
        public final com.avito.android.comfortable_deal.deal_income_details.di.b a(com.avito.android.comfortable_deal.di.a aVar, InterfaceC39417a interfaceC39417a, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new b(aVar, interfaceC39417a, c28478k, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
