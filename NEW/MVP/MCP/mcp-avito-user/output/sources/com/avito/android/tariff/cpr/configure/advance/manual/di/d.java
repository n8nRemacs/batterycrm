package com.avito.android.tariff.cpr.configure.advance.manual.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff.cpr.configure.advance.di.t;
import com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment;
import com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualPerfScreen;
import com.avito.android.tariff.cpr.configure.advance.manual.di.a;
import com.avito.android.tariff.cpr.configure.advance.manual.j;
import com.avito.android.tariff.cpr.configure.advance.manual.mvi.i;
import com.avito.android.tariff.cpr.configure.advance.manual.mvi.k;
import com.avito.android.tariff.cpr.configure.advance.manual.mvi.n;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.u;
import hB0.InterfaceC40801a;
import v50.g;

/* compiled from: DaggerCprConfigureAdvanceManualComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class d {

    /* compiled from: DaggerCprConfigureAdvanceManualComponent.java */
    public static final class b implements com.avito.android.tariff.cpr.configure.advance.manual.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final t f295368a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f295369b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC40801a> f295370c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f295371d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.tariff.cpr.configure.advance.manual.mvi.domain.a> f295372e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.tariff.cpr.configure.advance.manual.mvi.f f295373f;

        /* renamed from: g, reason: collision with root package name */
        public final u<g.b> f295374g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f295375h;

        /* renamed from: i, reason: collision with root package name */
        public final u<v50.g> f295376i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.tariff.cpr.configure.advance.manual.mvi.d f295377j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f295378k;

        /* renamed from: l, reason: collision with root package name */
        public final l f295379l;

        /* renamed from: m, reason: collision with root package name */
        public final l f295380m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f295381n;

        /* renamed from: o, reason: collision with root package name */
        public final j f295382o;

        /* compiled from: DaggerCprConfigureAdvanceManualComponent.java */
        public static final class a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f295383a;

            public a(cv.b bVar) {
                this.f295383a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f295383a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCprConfigureAdvanceManualComponent.java */
        /* renamed from: com.avito.android.tariff.cpr.configure.advance.manual.di.d$b$b, reason: collision with other inner class name */
        public static final class C8982b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final t f295384a;

            public C8982b(t tVar) {
                this.f295384a = tVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f295384a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCprConfigureAdvanceManualComponent.java */
        public static final class c implements u<g.b> {

            /* renamed from: a, reason: collision with root package name */
            public final t f295385a;

            public c(t tVar) {
                this.f295385a = tVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f295385a.S1();
            }
        }

        /* compiled from: DaggerCprConfigureAdvanceManualComponent.java */
        /* renamed from: com.avito.android.tariff.cpr.configure.advance.manual.di.d$b$d, reason: collision with other inner class name */
        public static final class C8983d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final t f295386a;

            public C8983d(t tVar) {
                this.f295386a = tVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f295386a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerCprConfigureAdvanceManualComponent.java */
        public static final class e implements u<InterfaceC40801a> {

            /* renamed from: a, reason: collision with root package name */
            public final t f295387a;

            public e(t tVar) {
                this.f295387a = tVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40801a interfaceC40801aB8 = this.f295387a.b8();
                dagger.internal.t.c(interfaceC40801aB8);
                return interfaceC40801aB8;
            }
        }

        public b(t tVar, cv.b bVar, Screen screen, r rVar, String str, String str2, a aVar) {
            this.f295368a = tVar;
            this.f295369b = bVar;
            u<com.avito.android.tariff.cpr.configure.advance.manual.mvi.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.tariff.cpr.configure.advance.manual.mvi.domain.d(l.a(str2), new e(tVar), new C8982b(tVar)));
            this.f295372e = uVarD;
            this.f295373f = new com.avito.android.tariff.cpr.configure.advance.manual.mvi.f(uVarD);
            u<v50.g> uVarD2 = dagger.internal.g.d(new com.avito.android.tariff.cpr.configure.advance.manual.di.c(new c(tVar), new a(bVar)));
            this.f295376i = uVarD2;
            this.f295377j = new com.avito.android.tariff.cpr.configure.advance.manual.mvi.d(uVarD2, this.f295372e);
            this.f295378k = new C8983d(tVar);
            this.f295379l = l.a(screen);
            this.f295380m = l.a(rVar);
            this.f295381n = dagger.internal.g.d(new g(this.f295379l, this.f295380m, l.a(str), this.f295378k));
            this.f295382o = new j(new i(this.f295373f, this.f295377j, k.a(), n.a(), this.f295381n));
        }

        @Override // com.avito.android.tariff.cpr.configure.advance.manual.di.a
        public final void a(CprConfigureAdvanceManualFragment cprConfigureAdvanceManualFragment) {
            cprConfigureAdvanceManualFragment.f295325h0 = this.f295382o;
            cprConfigureAdvanceManualFragment.f295327j0 = this.f295381n.get();
            InterfaceC28373a interfaceC28373aA = this.f295368a.a();
            dagger.internal.t.c(interfaceC28373aA);
            cprConfigureAdvanceManualFragment.f295328k0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f295369b.u4();
            dagger.internal.t.c(aVarU4);
            cprConfigureAdvanceManualFragment.f295329l0 = aVarU4;
        }
    }

    /* compiled from: DaggerCprConfigureAdvanceManualComponent.java */
    public static final class c implements a.InterfaceC8981a {
        public c() {
        }

        @Override // com.avito.android.tariff.cpr.configure.advance.manual.di.a.InterfaceC8981a
        public final com.avito.android.tariff.cpr.configure.advance.manual.di.a a(t tVar, InterfaceC39417a interfaceC39417a, CprConfigureAdvanceManualPerfScreen cprConfigureAdvanceManualPerfScreen, r rVar, String str) {
            interfaceC39417a.getClass();
            cprConfigureAdvanceManualPerfScreen.getClass();
            return new b(tVar, interfaceC39417a, cprConfigureAdvanceManualPerfScreen, rVar, "tariffCprConfigureAdvanceManual", str, null);
        }
    }

    public static a.InterfaceC8981a a() {
        return new c();
    }
}
