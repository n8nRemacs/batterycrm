package com.avito.android.comfortable_deal.submitting.select.di;

import Y41.l;
import Yo.v;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.repository.o;
import com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment;
import com.avito.android.comfortable_deal.submitting.select.di.g;
import com.avito.android.comfortable_deal.submitting.select.mvi.k;
import com.avito.android.comfortable_deal.submitting.select.mvi.n;
import com.avito.android.comfortable_deal.submitting.select.mvi.p;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import qp.C47425b;

/* compiled from: DaggerSubmittingSelectComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerSubmittingSelectComponent.java */
    public static final class b implements g.a {
        public b() {
        }

        @Override // com.avito.android.comfortable_deal.submitting.select.di.g.a
        public final g a(h hVar, InterfaceC39417a interfaceC39417a, l lVar, Y41.a aVar, C28478k c28478k, String str) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, hVar, lVar, aVar, c28478k, str, null);
        }
    }

    /* compiled from: DaggerSubmittingSelectComponent.java */
    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f123310a;

        /* renamed from: b, reason: collision with root package name */
        public final h f123311b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f123312c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f123313d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Context> f123314e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f123315f;

        /* renamed from: g, reason: collision with root package name */
        public final k f123316g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.submitting.select.d f123317h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f123318i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.d> f123319j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f123320k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f123321l;

        /* renamed from: m, reason: collision with root package name */
        public final u<j> f123322m;

        /* compiled from: DaggerSubmittingSelectComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.submitting.select.di.a$c$a, reason: collision with other inner class name */
        public static final class C3679a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final h f123323a;

            public C3679a(h hVar) {
                this.f123323a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f123323a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSubmittingSelectComponent.java */
        public static final class b implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final h f123324a;

            public b(h hVar) {
                this.f123324a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f123324a.g();
            }
        }

        /* compiled from: DaggerSubmittingSelectComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.submitting.select.di.a$c$c, reason: collision with other inner class name */
        public static final class C3680c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final h f123325a;

            public C3680c(h hVar) {
                this.f123325a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f123325a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(cv.b bVar, h hVar, l lVar, Y41.a aVar, C28478k c28478k, String str, C3678a c3678a) {
            this.f123310a = bVar;
            this.f123311b = hVar;
            this.f123312c = new C3680c(hVar);
            this.f123313d = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f123312c);
            this.f123316g = new k(new o(new C47425b(new b(hVar))), new v(new C3679a(hVar)));
            this.f123317h = new com.avito.android.comfortable_deal.submitting.select.d(new n(com.avito.android.comfortable_deal.submitting.select.mvi.h.a(), com.avito.android.comfortable_deal.submitting.select.mvi.b.a(), p.a(), this.f123316g));
            this.f123318i = dagger.internal.l.a(lVar);
            u<com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.d> uVarD = dagger.internal.g.d(new com.avito.android.comfortable_deal.submitting.select.di.c(this.f123318i, dagger.internal.l.a(aVar)));
            this.f123319j = uVarD;
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new e(new com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.b(uVarD)));
            this.f123320k = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new d(uVarD2));
            this.f123321l = uVarD3;
            this.f123322m = dagger.internal.g.d(new f(uVarD3, this.f123320k));
        }

        @Override // com.avito.android.comfortable_deal.submitting.select.di.g
        public final void a(SubmittingSelectFragment submittingSelectFragment) {
            submittingSelectFragment.f123265n0 = this.f123313d.get();
            submittingSelectFragment.f123266o0 = this.f123317h;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f123310a.u4();
            t.c(aVarU4);
            submittingSelectFragment.f123267p0 = aVarU4;
            submittingSelectFragment.f123268q0 = this.f123321l.get();
            submittingSelectFragment.f123269r0 = this.f123322m.get();
            InterfaceC28373a interfaceC28373aA = this.f123311b.a();
            t.c(interfaceC28373aA);
            submittingSelectFragment.f123270s0 = new Yo.u(interfaceC28373aA);
        }
    }

    public static g.a a() {
        return new b();
    }
}
