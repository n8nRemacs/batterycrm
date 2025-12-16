package com.avito.android.lf_levels.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lf_levels.LfLevelsFragment;
import com.avito.android.lf_levels.di.b;
import com.avito.android.util.C35801g6;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import vR.C49257c;
import xR.InterfaceC49877a;

/* compiled from: DaggerLfLevelsComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerLfLevelsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.lf_levels.di.b.a
        public final com.avito.android.lf_levels.di.b a(com.avito.android.lf_levels.di.c cVar, InterfaceC39417a interfaceC39417a, r rVar, String str, Y41.l lVar) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, rVar, str, lVar, null);
        }
    }

    /* compiled from: DaggerLfLevelsComponent.java */
    public static final class c implements com.avito.android.lf_levels.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f175329a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.lf_levels.di.c f175330b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC49877a> f175331c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f175332d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.lf_levels.domain.a> f175333e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.lf_levels.mvi.f f175334f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.lf_levels.mvi.d f175335g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.lf_levels.mvi.m f175336h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f175337i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C28478k> f175338j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f175339k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.lf_levels.e f175340l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.lf_levels.ui.items.business_tools_header.d> f175341m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f175342n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.lf_levels.ui.items.business_tools_header.c f175343o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.lf_levels.ui.items.business_tool.d> f175344p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f175345q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f175346r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f175347s;

        /* compiled from: DaggerLfLevelsComponent.java */
        /* renamed from: com.avito.android.lf_levels.di.a$c$a, reason: collision with other inner class name */
        public static final class C5174a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.lf_levels.di.c f175348a;

            public C5174a(com.avito.android.lf_levels.di.c cVar) {
                this.f175348a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f175348a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerLfLevelsComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.lf_levels.di.c f175349a;

            public b(com.avito.android.lf_levels.di.c cVar) {
                this.f175349a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f175349a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerLfLevelsComponent.java */
        /* renamed from: com.avito.android.lf_levels.di.a$c$c, reason: collision with other inner class name */
        public static final class C5175c implements u<InterfaceC49877a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.lf_levels.di.c f175350a;

            public C5175c(com.avito.android.lf_levels.di.c cVar) {
                this.f175350a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49877a interfaceC49877aXc = this.f175350a.Xc();
                t.c(interfaceC49877aXc);
                return interfaceC49877aXc;
            }
        }

        /* compiled from: DaggerLfLevelsComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.lf_levels.di.c f175351a;

            public d(com.avito.android.lf_levels.di.c cVar) {
                this.f175351a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f175351a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.lf_levels.di.c cVar, cv.b bVar, r rVar, String str, Y41.l lVar, C5173a c5173a) {
            this.f175329a = bVar;
            this.f175330b = cVar;
            u<com.avito.android.lf_levels.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.lf_levels.domain.d(dagger.internal.l.a(str), new C5175c(cVar), new b(cVar)));
            this.f175333e = uVarD;
            this.f175334f = new com.avito.android.lf_levels.mvi.f(uVarD);
            this.f175335g = new com.avito.android.lf_levels.mvi.d(uVarD);
            this.f175336h = new com.avito.android.lf_levels.mvi.m(new C49257c(C35801g6.f318887a));
            this.f175337i = new d(cVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new l(dagger.internal.l.a(rVar)));
            this.f175338j = uVarD2;
            this.f175339k = com.avito.android.advert.item.delivery_suggests.l.i(this.f175337i, uVarD2);
            this.f175340l = new com.avito.android.lf_levels.e(new com.avito.android.lf_levels.mvi.i(this.f175334f, this.f175335g, com.avito.android.lf_levels.mvi.k.a(), this.f175336h, this.f175339k));
            u<com.avito.android.lf_levels.ui.items.business_tools_header.d> uVarD3 = dagger.internal.g.d(com.avito.android.lf_levels.ui.items.business_tools_header.f.a());
            this.f175341m = uVarD3;
            C5174a c5174a = new C5174a(cVar);
            this.f175342n = c5174a;
            this.f175343o = new com.avito.android.lf_levels.ui.items.business_tools_header.c(uVarD3, c5174a);
            u<com.avito.android.lf_levels.ui.items.business_tool.d> uVarD4 = dagger.internal.g.d(new com.avito.android.lf_levels.ui.items.business_tool.g(dagger.internal.l.a(lVar)));
            this.f175344p = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new f(this.f175343o, new com.avito.android.lf_levels.ui.items.business_tool.c(uVarD4, this.f175342n)));
            this.f175345q = uVarD5;
            u<com.avito.konveyor.adapter.a> uVarD6 = dagger.internal.g.d(new e(uVarD5));
            this.f175346r = uVarD6;
            this.f175347s = dagger.internal.g.d(new h(uVarD6, this.f175345q));
        }

        @Override // com.avito.android.lf_levels.di.b
        public final void a(LfLevelsFragment lfLevelsFragment) {
            lfLevelsFragment.f175292h0 = this.f175340l;
            lfLevelsFragment.f175293i0 = this.f175339k.get();
            lfLevelsFragment.f175294j0 = this.f175347s.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f175329a.u4();
            t.c(aVarU4);
            lfLevelsFragment.f175295k0 = aVarU4;
            com.avito.android.util.text.a aVarE = this.f175330b.e();
            t.c(aVarE);
            lfLevelsFragment.f175296l0 = aVarE;
        }
    }

    public static b.a a() {
        return new b();
    }
}
