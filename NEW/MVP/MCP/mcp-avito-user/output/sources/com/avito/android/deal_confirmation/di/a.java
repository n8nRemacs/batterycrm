package com.avito.android.deal_confirmation.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deal_confirmation.di.g;
import com.avito.android.deal_confirmation.sheet.DealConfirmationSheetActivity;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import xu.C50000c;

/* compiled from: DaggerDealConfirmationSheetActivityComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerDealConfirmationSheetActivityComponent.java */
    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f132751a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f132752b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f132753c;

        /* compiled from: DaggerDealConfirmationSheetActivityComponent.java */
        /* renamed from: com.avito.android.deal_confirmation.di.a$b$a, reason: collision with other inner class name */
        public static final class C3978a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.deal_confirmation.di.c f132754a;

            public C3978a(com.avito.android.deal_confirmation.di.c cVar) {
                this.f132754a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cY2 = this.f132754a.Y2();
                t.c(interfaceC28481cY2);
                return interfaceC28481cY2;
            }
        }

        public b(com.avito.android.deal_confirmation.di.c cVar, cv.b bVar, r rVar, C3977a c3977a) {
            this.f132751a = bVar;
            this.f132752b = new C3978a(cVar);
            this.f132753c = B.a(new C50000c(l.a(rVar), this.f132752b));
        }

        @Override // com.avito.android.deal_confirmation.di.g
        public final void a(DealConfirmationSheetActivity dealConfirmationSheetActivity) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f132751a.u4();
            t.c(aVarU4);
            dealConfirmationSheetActivity.f132775m = aVarU4;
            dealConfirmationSheetActivity.f132776n = this.f132753c.get();
        }
    }

    /* compiled from: DaggerDealConfirmationSheetActivityComponent.java */
    public static final class c implements g.a {
        public c() {
        }

        @Override // com.avito.android.deal_confirmation.di.g.a
        public final g a(com.avito.android.deal_confirmation.di.c cVar, r rVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(cVar, interfaceC39417a, rVar, null);
        }
    }

    public static g.a a() {
        return new c();
    }
}
