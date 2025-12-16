package com.avito.android.comfortable_deal.submitting.success.di;

import Yo.v;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.repository.o;
import com.avito.android.comfortable_deal.submitting.success.SubmittingSuccessFragment;
import com.avito.android.comfortable_deal.submitting.success.di.b;
import com.avito.android.comfortable_deal.submitting.success.mvi.g;
import com.avito.android.comfortable_deal.submitting.success.mvi.j;
import com.avito.android.comfortable_deal.submitting.success.mvi.l;
import com.avito.android.comfortable_deal.submitting.success.mvi.n;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import qp.C47425b;

/* compiled from: DaggerSubmittingSuccessComponent.java */
@e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerSubmittingSuccessComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.comfortable_deal.submitting.success.di.b.a
        public final com.avito.android.comfortable_deal.submitting.success.di.b a(com.avito.android.comfortable_deal.submitting.success.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, c28478k, null);
        }
    }

    /* compiled from: DaggerSubmittingSuccessComponent.java */
    public static final class c implements com.avito.android.comfortable_deal.submitting.success.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.submitting.success.di.c f123398a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f123399b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f123400c;

        /* renamed from: d, reason: collision with root package name */
        public final u<Context> f123401d;

        /* renamed from: e, reason: collision with root package name */
        public final g f123402e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.submitting.success.c f123403f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f123404g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f123405h;

        /* compiled from: DaggerSubmittingSuccessComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.submitting.success.di.a$c$a, reason: collision with other inner class name */
        public static final class C3685a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.submitting.success.di.c f123406a;

            public C3685a(com.avito.android.comfortable_deal.submitting.success.di.c cVar) {
                this.f123406a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f123406a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSubmittingSuccessComponent.java */
        public static final class b implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.submitting.success.di.c f123407a;

            public b(com.avito.android.comfortable_deal.submitting.success.di.c cVar) {
                this.f123407a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f123407a.g();
            }
        }

        /* compiled from: DaggerSubmittingSuccessComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.submitting.success.di.a$c$c, reason: collision with other inner class name */
        public static final class C3686c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.submitting.success.di.c f123408a;

            public C3686c(com.avito.android.comfortable_deal.submitting.success.di.c cVar) {
                this.f123408a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f123408a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.comfortable_deal.submitting.success.di.c cVar, cv.b bVar, C28478k c28478k, C3684a c3684a) {
            this.f123398a = cVar;
            this.f123399b = bVar;
            com.avito.android.comfortable_deal.submitting.success.mvi.e eVar = new com.avito.android.comfortable_deal.submitting.success.mvi.e(new v(new C3685a(cVar)));
            this.f123402e = new g(new o(new C47425b(new b(cVar))));
            this.f123403f = new com.avito.android.comfortable_deal.submitting.success.c(new j(eVar, l.a(), this.f123402e, n.a()));
            this.f123404g = new C3686c(cVar);
            this.f123405h = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f123404g);
        }

        @Override // com.avito.android.comfortable_deal.submitting.success.di.b
        public final void a(SubmittingSuccessFragment submittingSuccessFragment) {
            submittingSuccessFragment.f123366n0 = this.f123403f;
            submittingSuccessFragment.f123368p0 = this.f123405h.get();
            submittingSuccessFragment.f123369q0 = this.f123398a.h();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f123399b.u4();
            t.c(aVarU4);
            submittingSuccessFragment.f123370r0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
