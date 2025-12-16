package com.avito.android.comfortable_deal.end_deal.di;

import Jp.InterfaceC14233a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.end_deal.EndDealDialogFragment;
import com.avito.android.comfortable_deal.end_deal.d0;
import com.avito.android.comfortable_deal.end_deal.di.b;
import com.avito.android.comfortable_deal.end_deal.model.EndDealArguments;
import com.avito.android.comfortable_deal.end_deal.mvi.builder.g;
import com.avito.android.comfortable_deal.end_deal.mvi.f;
import com.avito.android.comfortable_deal.end_deal.mvi.h;
import com.avito.android.comfortable_deal.end_deal.mvi.k;
import com.avito.android.comfortable_deal.end_deal.mvi.m;
import com.avito.android.comfortable_deal.end_deal.mvi.o;
import com.avito.android.util.R0;
import cp.InterfaceC39387a;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerEndDealComponent.java */
@e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerEndDealComponent.java */
    public static final class b implements com.avito.android.comfortable_deal.end_deal.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f122163a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC14233a> f122164b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC39387a> f122165c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f122166d;

        /* renamed from: e, reason: collision with root package name */
        public final l f122167e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.comfortable_deal.end_deal.interactor.a> f122168f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.comfortable_deal.end_deal.mvi.validator.a> f122169g;

        /* renamed from: h, reason: collision with root package name */
        public final u<R0> f122170h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.comfortable_deal.end_deal.interactor.d> f122171i;

        /* renamed from: j, reason: collision with root package name */
        public final h f122172j;

        /* renamed from: k, reason: collision with root package name */
        public final f f122173k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.comfortable_deal.end_deal.mvi.builder.a> f122174l;

        /* renamed from: m, reason: collision with root package name */
        public final o f122175m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f122176n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f122177o;

        /* renamed from: p, reason: collision with root package name */
        public final d0 f122178p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.comfortable_deal.common.date.a> f122179q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.comfortable_deal.common.date.d> f122180r;

        /* compiled from: DaggerEndDealComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.end_deal.di.a$b$a, reason: collision with other inner class name */
        public static final class C3613a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122181a;

            public C3613a(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122181a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f122181a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerEndDealComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.end_deal.di.a$b$b, reason: collision with other inner class name */
        public static final class C3614b implements u<InterfaceC14233a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122182a;

            public C3614b(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122182a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14233a interfaceC14233aV8 = this.f122182a.v8();
                t.c(interfaceC14233aV8);
                return interfaceC14233aV8;
            }
        }

        /* compiled from: DaggerEndDealComponent.java */
        public static final class c implements u<InterfaceC39387a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122183a;

            public c(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122183a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39387a interfaceC39387aQ2 = this.f122183a.Q2();
                t.c(interfaceC39387aQ2);
                return interfaceC39387aQ2;
            }
        }

        /* compiled from: DaggerEndDealComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122184a;

            public d(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122184a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f122184a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerEndDealComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f122185a;

            public e(com.avito.android.comfortable_deal.di.a aVar) {
                this.f122185a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f122185a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.comfortable_deal.di.a aVar, cv.b bVar, C28478k c28478k, EndDealArguments endDealArguments, C3612a c3612a) {
            this.f122163a = bVar;
            this.f122164b = new C3614b(aVar);
            this.f122165c = new c(aVar);
            this.f122166d = new C3613a(aVar);
            l lVarA = l.a(endDealArguments);
            this.f122167e = lVarA;
            this.f122168f = B.a(new com.avito.android.comfortable_deal.end_deal.interactor.c(lVarA, this.f122166d));
            u<com.avito.android.comfortable_deal.end_deal.mvi.validator.a> uVarA = B.a(com.avito.android.comfortable_deal.end_deal.mvi.validator.c.a());
            this.f122169g = uVarA;
            d dVar = new d(aVar);
            u<com.avito.android.comfortable_deal.end_deal.interactor.d> uVarA2 = B.a(new com.avito.android.comfortable_deal.end_deal.interactor.f(this.f122167e, uVarA, this.f122164b, this.f122165c, this.f122168f, dVar));
            this.f122171i = uVarA2;
            this.f122172j = new h(uVarA2);
            this.f122173k = new f(uVarA2, this.f122168f);
            this.f122174l = B.a(com.avito.android.comfortable_deal.end_deal.mvi.builder.c.a());
            this.f122175m = new o(g.a(), this.f122174l);
            this.f122176n = new e(aVar);
            this.f122177o = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f122176n);
            this.f122178p = new d0(new k(this.f122172j, this.f122173k, m.a(), this.f122175m, this.f122177o));
            this.f122179q = B.a(com.avito.android.comfortable_deal.common.date.c.a());
            this.f122180r = B.a(com.avito.android.comfortable_deal.common.date.c.a());
        }

        @Override // com.avito.android.comfortable_deal.end_deal.di.b
        public final void a(EndDealDialogFragment endDealDialogFragment) {
            endDealDialogFragment.f122034h0 = this.f122178p;
            endDealDialogFragment.f122036j0 = this.f122177o.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f122163a.u4();
            t.c(aVarU4);
            endDealDialogFragment.f122037k0 = aVarU4;
            endDealDialogFragment.f122038l0 = this.f122179q.get();
            endDealDialogFragment.f122039m0 = this.f122180r.get();
        }
    }

    /* compiled from: DaggerEndDealComponent.java */
    public static final class c implements b.InterfaceC3615b {
        public c() {
        }

        @Override // com.avito.android.comfortable_deal.end_deal.di.b.InterfaceC3615b
        public final com.avito.android.comfortable_deal.end_deal.di.b a(InterfaceC39417a interfaceC39417a, com.avito.android.comfortable_deal.di.a aVar, C28478k c28478k, EndDealArguments endDealArguments) {
            interfaceC39417a.getClass();
            endDealArguments.getClass();
            return new b(aVar, interfaceC39417a, c28478k, endDealArguments, null);
        }
    }

    public static b.InterfaceC3615b a() {
        return new c();
    }
}
