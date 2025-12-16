package com.avito.android.cpx_promo_geo.screens.region_sheet.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpx_promo_geo.screens.region_sheet.RegionSheetData;
import com.avito.android.cpx_promo_geo.screens.region_sheet.di.b;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.h;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.k;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.m;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.p;
import com.avito.android.cpx_promo_geo.screens.region_sheet.ui.RegionSheetFragment;
import com.avito.android.cpx_promo_geo.screens.region_sheet.ui.j;
import com.avito.android.di.module.C30060h5;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import ns.InterfaceC44470a;

/* compiled from: DaggerRegionSheetComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerRegionSheetComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.cpx_promo_geo.screens.region_sheet.di.b.a
        public final com.avito.android.cpx_promo_geo.screens.region_sheet.di.b a(String str, String str2, RegionSheetData regionSheetData, r rVar, e eVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, str, str2, regionSheetData, rVar, null);
        }
    }

    /* compiled from: DaggerRegionSheetComponent.java */
    public static final class c implements com.avito.android.cpx_promo_geo.screens.region_sheet.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final h f128262a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f128263b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC44470a> f128264c;

        /* renamed from: d, reason: collision with root package name */
        public final l f128265d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.cpx_promo_geo.screens.region_sheet.domain.b f128266e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f128267f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a> f128268g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.f f128269h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f128270i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f128271j;

        /* renamed from: k, reason: collision with root package name */
        public final j f128272k;

        /* compiled from: DaggerRegionSheetComponent.java */
        /* renamed from: com.avito.android.cpx_promo_geo.screens.region_sheet.di.a$c$a, reason: collision with other inner class name */
        public static final class C3807a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f128273a;

            public C3807a(e eVar) {
                this.f128273a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f128273a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerRegionSheetComponent.java */
        public static final class b implements u<InterfaceC44470a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f128274a;

            public b(e eVar) {
                this.f128274a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44470a interfaceC44470aU6 = this.f128274a.u6();
                t.c(interfaceC44470aU6);
                return interfaceC44470aU6;
            }
        }

        /* compiled from: DaggerRegionSheetComponent.java */
        /* renamed from: com.avito.android.cpx_promo_geo.screens.region_sheet.di.a$c$c, reason: collision with other inner class name */
        public static final class C3808c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final e f128275a;

            public C3808c(e eVar) {
                this.f128275a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f128275a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerRegionSheetComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final e f128276a;

            public d(e eVar) {
                this.f128276a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f128276a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(e eVar, cv.b bVar, String str, String str2, RegionSheetData regionSheetData, r rVar, C3806a c3806a) {
            this.f128262a = new h(l.a(regionSheetData));
            this.f128263b = new C3808c(eVar);
            this.f128264c = new b(eVar);
            l lVarA = l.a(str);
            this.f128265d = lVarA;
            this.f128266e = new com.avito.android.cpx_promo_geo.screens.region_sheet.domain.b(lVarA, this.f128263b, this.f128264c);
            this.f128267f = new C3807a(eVar);
            u<com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a> uVarD = dagger.internal.g.d(new com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.c(l.a(str2), this.f128267f));
            this.f128268g = uVarD;
            this.f128269h = new com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.f(this.f128266e, new com.avito.android.cpx_promo_geo.screens.region_sheet.domain.h(this.f128265d, uVarD, this.f128263b, this.f128264c));
            this.f128270i = new d(eVar);
            this.f128271j = dagger.internal.g.d(new C30060h5(this.f128270i, new g(l.a(rVar))));
            this.f128272k = new j(new k(this.f128262a, this.f128269h, m.a(), p.a(), this.f128271j));
        }

        @Override // com.avito.android.cpx_promo_geo.screens.region_sheet.di.b
        public final void a(RegionSheetFragment regionSheetFragment) {
            regionSheetFragment.f128460h0 = this.f128272k;
            regionSheetFragment.f128462j0 = this.f128271j.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
