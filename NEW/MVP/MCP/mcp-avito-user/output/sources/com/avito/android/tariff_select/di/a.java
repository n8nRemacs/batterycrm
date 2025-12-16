package com.avito.android.tariff_select.di;

import bE0.InterfaceC25503a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_select.TariffSelectFragment;
import com.avito.android.tariff_select.di.e;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTariffSelectComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffSelectComponent.java */
    public static final class b implements e.a {
        public b() {
        }

        @Override // com.avito.android.tariff_select.di.e.a
        public final e a(h hVar, InterfaceC39417a interfaceC39417a, r rVar, String str, Y41.l lVar, Y41.l lVar2) {
            interfaceC39417a.getClass();
            return new c(hVar, interfaceC39417a, rVar, str, lVar, lVar2, null);
        }
    }

    /* compiled from: DaggerTariffSelectComponent.java */
    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final h f301180a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f301181b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC25503a> f301182c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f301183d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.tariff_select.domain.a> f301184e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.tariff_select.mvi.f f301185f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.tariff_select.mvi.d f301186g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.tariff_select.mvi.m f301187h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f301188i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C28478k> f301189j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f301190k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.tariff_select.k f301191l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f301192m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.tariff_select.ui.items.header.d> f301193n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f301194o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.tariff_select.ui.items.header.c f301195p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.tariff_select.ui.items.tariff.d> f301196q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f301197r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f301198s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f301199t;

        /* compiled from: DaggerTariffSelectComponent.java */
        /* renamed from: com.avito.android.tariff_select.di.a$c$a, reason: collision with other inner class name */
        public static final class C9217a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final h f301200a;

            public C9217a(h hVar) {
                this.f301200a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f301200a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerTariffSelectComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final h f301201a;

            public b(h hVar) {
                this.f301201a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f301201a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTariffSelectComponent.java */
        /* renamed from: com.avito.android.tariff_select.di.a$c$c, reason: collision with other inner class name */
        public static final class C9218c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final h f301202a;

            public C9218c(h hVar) {
                this.f301202a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f301202a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTariffSelectComponent.java */
        public static final class d implements u<InterfaceC25503a> {

            /* renamed from: a, reason: collision with root package name */
            public final h f301203a;

            public d(h hVar) {
                this.f301203a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25503a interfaceC25503aJc = this.f301203a.jc();
                t.c(interfaceC25503aJc);
                return interfaceC25503aJc;
            }
        }

        public c() {
            throw null;
        }

        public c(h hVar, cv.b bVar, r rVar, String str, Y41.l lVar, Y41.l lVar2, C9216a c9216a) {
            this.f301180a = hVar;
            this.f301181b = bVar;
            u<com.avito.android.tariff_select.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.tariff_select.domain.c(dagger.internal.l.b(str), new d(hVar), new b(hVar)));
            this.f301184e = uVarD;
            this.f301185f = new com.avito.android.tariff_select.mvi.f(uVarD);
            this.f301186g = new com.avito.android.tariff_select.mvi.d(uVarD);
            this.f301187h = new com.avito.android.tariff_select.mvi.m(com.avito.android.tariff_select.data.c.a());
            this.f301188i = new C9218c(hVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new n(dagger.internal.l.a(rVar)));
            this.f301189j = uVarD2;
            this.f301190k = com.avito.android.advert.item.delivery_suggests.l.i(this.f301188i, uVarD2);
            this.f301191l = new com.avito.android.tariff_select.k(new com.avito.android.tariff_select.mvi.i(this.f301185f, this.f301186g, com.avito.android.tariff_select.mvi.k.a(), this.f301187h, this.f301190k));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f301192m = lVarA;
            u<com.avito.android.tariff_select.ui.items.header.d> uVarD3 = dagger.internal.g.d(new com.avito.android.tariff_select.ui.items.header.g(lVarA));
            this.f301193n = uVarD3;
            C9217a c9217a = new C9217a(hVar);
            this.f301194o = c9217a;
            this.f301195p = new com.avito.android.tariff_select.ui.items.header.c(uVarD3, c9217a);
            u<com.avito.android.tariff_select.ui.items.tariff.d> uVarD4 = dagger.internal.g.d(new com.avito.android.tariff_select.ui.items.tariff.h(this.f301192m, dagger.internal.l.a(lVar2)));
            this.f301196q = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new k(this.f301195p, new com.avito.android.tariff_select.ui.items.tariff.c(uVarD4, this.f301194o)));
            this.f301197r = uVarD5;
            u<com.avito.konveyor.adapter.a> uVarD6 = dagger.internal.g.d(new j(uVarD5));
            this.f301198s = uVarD6;
            this.f301199t = dagger.internal.g.d(new l(uVarD6, this.f301197r));
        }

        @Override // com.avito.android.tariff_select.di.e
        public final void a(TariffSelectFragment tariffSelectFragment) {
            tariffSelectFragment.f301156n0 = this.f301191l;
            tariffSelectFragment.f301157o0 = this.f301190k.get();
            tariffSelectFragment.f301158p0 = this.f301199t.get();
            InterfaceC28373a interfaceC28373aA = this.f301180a.a();
            t.c(interfaceC28373aA);
            tariffSelectFragment.f301159q0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f301181b.u4();
            t.c(aVarU4);
            tariffSelectFragment.f301160r0 = aVarU4;
        }
    }

    public static e.a a() {
        return new b();
    }
}
