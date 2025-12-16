package com.avito.android.comfortable_deal.commission_details.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.commission_details.CommissionDetailsDialog;
import com.avito.android.comfortable_deal.commission_details.di.a;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCommissionDetailsComponent.java */
@e
/* loaded from: classes12.dex */
public final class b {

    /* compiled from: DaggerCommissionDetailsComponent.java */
    /* renamed from: com.avito.android.comfortable_deal.commission_details.di.b$b, reason: collision with other inner class name */
    public static final class C3552b implements com.avito.android.comfortable_deal.commission_details.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f120573a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f120574b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f120575c;

        /* compiled from: DaggerCommissionDetailsComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.commission_details.di.b$b$a */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120576a;

            public a(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120576a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f120576a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public C3552b(com.avito.android.comfortable_deal.di.a aVar, cv.b bVar, C28478k c28478k, a aVar2) {
            this.f120573a = bVar;
            this.f120574b = new a(aVar);
            this.f120575c = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f120574b);
        }

        @Override // com.avito.android.comfortable_deal.commission_details.di.a
        public final void a(CommissionDetailsDialog commissionDetailsDialog) {
            commissionDetailsDialog.f120560h0 = this.f120575c.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f120573a.u4();
            t.c(aVarU4);
            commissionDetailsDialog.f120562j0 = aVarU4;
        }
    }

    /* compiled from: DaggerCommissionDetailsComponent.java */
    public static final class c implements a.InterfaceC3551a {
        public c() {
        }

        @Override // com.avito.android.comfortable_deal.commission_details.di.a.InterfaceC3551a
        public final com.avito.android.comfortable_deal.commission_details.di.a a(com.avito.android.comfortable_deal.di.a aVar, InterfaceC39417a interfaceC39417a, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new C3552b(aVar, interfaceC39417a, c28478k, null);
        }
    }

    public static a.InterfaceC3551a a() {
        return new c();
    }
}
