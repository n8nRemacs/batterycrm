package com.avito.android.tariff.cpx.configure.advance_manual.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff.cpx.configure.advance_manual.CpxConfigureAdvanceManualFragment;
import com.avito.android.tariff.cpx.configure.advance_manual.di.a;
import com.avito.android.tariff.cpx.configure.advance_manual.mvi.j;
import com.avito.android.tariff.cpx.configure.advance_manual.mvi.o;
import com.avito.android.tariff.remote.model.cpx.CpxConfigureAdvanceManualResult;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import v50.g;

/* compiled from: DaggerCpxConfigureAdvanceManualComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class g {

    /* compiled from: DaggerCpxConfigureAdvanceManualComponent.java */
    public static final class b implements com.avito.android.tariff.cpx.configure.advance_manual.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final WA0.b f295812a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f295813b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.configure.advance_manual.mvi.g f295814c;

        /* renamed from: d, reason: collision with root package name */
        public final u<g.b> f295815d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f295816e;

        /* renamed from: f, reason: collision with root package name */
        public final u<v50.g> f295817f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.configure.advance_manual.mvi.e f295818g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f295819h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C28478k> f295820i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f295821j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.configure.advance_manual.g f295822k;

        /* compiled from: DaggerCpxConfigureAdvanceManualComponent.java */
        public static final class a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f295823a;

            public a(cv.b bVar) {
                this.f295823a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f295823a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCpxConfigureAdvanceManualComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.configure.advance_manual.di.g$b$b, reason: collision with other inner class name */
        public static final class C9003b implements u<g.b> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f295824a;

            public C9003b(WA0.b bVar) {
                this.f295824a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f295824a.S1();
            }
        }

        /* compiled from: DaggerCpxConfigureAdvanceManualComponent.java */
        public static final class c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f295825a;

            public c(WA0.b bVar) {
                this.f295825a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f295825a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(WA0.b bVar, cv.b bVar2, r rVar, CpxConfigureAdvanceManualResult cpxConfigureAdvanceManualResult, a aVar) {
            this.f295812a = bVar;
            this.f295813b = bVar2;
            this.f295814c = new com.avito.android.tariff.cpx.configure.advance_manual.mvi.g(l.a(cpxConfigureAdvanceManualResult));
            u<v50.g> uVarD = dagger.internal.g.d(new e(new C9003b(bVar), new a(bVar2)));
            this.f295817f = uVarD;
            this.f295818g = new com.avito.android.tariff.cpx.configure.advance_manual.mvi.e(uVarD);
            this.f295819h = new c(bVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new f(l.a(rVar)));
            this.f295820i = uVarD2;
            this.f295821j = com.avito.android.advert.item.delivery_suggests.l.i(this.f295819h, uVarD2);
            this.f295822k = new com.avito.android.tariff.cpx.configure.advance_manual.g(new j(this.f295814c, this.f295818g, com.avito.android.tariff.cpx.configure.advance_manual.mvi.l.a(), o.a(), this.f295821j));
        }

        @Override // com.avito.android.tariff.cpx.configure.advance_manual.di.a
        public final void a(CpxConfigureAdvanceManualFragment cpxConfigureAdvanceManualFragment) {
            cpxConfigureAdvanceManualFragment.f295771h0 = this.f295822k;
            cpxConfigureAdvanceManualFragment.f295772i0 = this.f295821j.get();
            InterfaceC28373a interfaceC28373aA = this.f295812a.a();
            t.c(interfaceC28373aA);
            cpxConfigureAdvanceManualFragment.f295773j0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f295813b.u4();
            t.c(aVarU4);
            cpxConfigureAdvanceManualFragment.f295774k0 = aVarU4;
        }
    }

    /* compiled from: DaggerCpxConfigureAdvanceManualComponent.java */
    public static final class c implements a.InterfaceC9002a {
        public c() {
        }

        @Override // com.avito.android.tariff.cpx.configure.advance_manual.di.a.InterfaceC9002a
        public final com.avito.android.tariff.cpx.configure.advance_manual.di.a a(WA0.b bVar, InterfaceC39417a interfaceC39417a, r rVar, CpxConfigureAdvanceManualResult cpxConfigureAdvanceManualResult) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, rVar, cpxConfigureAdvanceManualResult, null);
        }
    }

    public static a.InterfaceC9002a a() {
        return new c();
    }
}
