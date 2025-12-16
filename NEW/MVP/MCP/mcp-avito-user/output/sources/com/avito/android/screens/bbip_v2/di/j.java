package com.avito.android.screens.bbip_v2.di;

import Y41.p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.screens.bbip_v2.BbipV2Fragment;
import com.avito.android.screens.bbip_v2.di.a;
import com.avito.android.screens.bbip_v2.mvi.k;
import com.avito.android.screens.bbip_v2.mvi.m;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import hh.InterfaceC40934b;
import ih.InterfaceC41399a;
import up0.C49093e;

/* compiled from: DaggerBbipV2Component.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class j {

    /* compiled from: DaggerBbipV2Component.java */
    public static final class b implements com.avito.android.screens.bbip_v2.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC40934b f261448a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f261449b;

        /* renamed from: c, reason: collision with root package name */
        public final l f261450c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC41399a> f261451d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f261452e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Gson> f261453f;

        /* renamed from: g, reason: collision with root package name */
        public final C49093e f261454g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip_v2.domain.a> f261455h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.screens.bbip_v2.mvi.f f261456i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.screens.bbip_v2.mvi.d f261457j;

        /* renamed from: k, reason: collision with root package name */
        public final m f261458k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f261459l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C28478k> f261460m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f261461n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.screens.bbip_v2.g f261462o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip_v2.ui.items.title.d> f261463p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.screens.bbip_v2.ui.items.title.c f261464q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip_v2.ui.items.forecast.d> f261465r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.screens.bbip_v2.ui.items.forecast.c f261466s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip_v2.ui.items.budget.e> f261467t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.screens.bbip_v2.ui.items.budget.d f261468u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip_v2.ui.items.duration.e> f261469v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f261470w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f261471x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f261472y;

        /* compiled from: DaggerBbipV2Component.java */
        public static final class a implements u<InterfaceC41399a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f261473a;

            public a(InterfaceC40934b interfaceC40934b) {
                this.f261473a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41399a interfaceC41399aPc = this.f261473a.Pc();
                t.c(interfaceC41399aPc);
                return interfaceC41399aPc;
            }
        }

        /* compiled from: DaggerBbipV2Component.java */
        /* renamed from: com.avito.android.screens.bbip_v2.di.j$b$b, reason: collision with other inner class name */
        public static final class C7823b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f261474a;

            public C7823b(InterfaceC40934b interfaceC40934b) {
                this.f261474a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f261474a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerBbipV2Component.java */
        public static final class c implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f261475a;

            public c(InterfaceC40934b interfaceC40934b) {
                this.f261475a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f261475a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerBbipV2Component.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f261476a;

            public d(InterfaceC40934b interfaceC40934b) {
                this.f261476a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f261476a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(InterfaceC40934b interfaceC40934b, cv.b bVar, r rVar, String str, String str2, p pVar, p pVar2, a aVar) {
            this.f261448a = interfaceC40934b;
            this.f261449b = bVar;
            this.f261450c = l.a(str2);
            l lVarA = l.a(str);
            a aVar2 = new a(interfaceC40934b);
            C7823b c7823b = new C7823b(interfaceC40934b);
            C49093e c49093e = new C49093e(lVarA, new c(interfaceC40934b));
            this.f261454g = c49093e;
            u<com.avito.android.screens.bbip_v2.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.screens.bbip_v2.domain.c(lVarA, aVar2, c7823b, c49093e));
            this.f261455h = uVarD;
            l lVar = this.f261450c;
            this.f261456i = new com.avito.android.screens.bbip_v2.mvi.f(lVar, uVarD);
            C49093e c49093e2 = this.f261454g;
            this.f261457j = new com.avito.android.screens.bbip_v2.mvi.d(lVar, uVarD, c49093e2);
            this.f261458k = new m(c49093e2);
            this.f261459l = new d(interfaceC40934b);
            u<C28478k> uVarD2 = dagger.internal.g.d(new i(l.a(rVar)));
            this.f261460m = uVarD2;
            this.f261461n = com.avito.android.advert.item.delivery_suggests.l.i(this.f261459l, uVarD2);
            this.f261462o = new com.avito.android.screens.bbip_v2.g(new com.avito.android.screens.bbip_v2.mvi.i(this.f261456i, this.f261457j, k.a(), this.f261458k, this.f261461n));
            u<com.avito.android.screens.bbip_v2.ui.items.title.d> uVarD3 = dagger.internal.g.d(com.avito.android.screens.bbip_v2.ui.items.title.f.a());
            this.f261463p = uVarD3;
            this.f261464q = new com.avito.android.screens.bbip_v2.ui.items.title.c(uVarD3);
            u<com.avito.android.screens.bbip_v2.ui.items.forecast.d> uVarD4 = dagger.internal.g.d(com.avito.android.screens.bbip_v2.ui.items.forecast.f.a());
            this.f261465r = uVarD4;
            this.f261466s = new com.avito.android.screens.bbip_v2.ui.items.forecast.c(uVarD4);
            u<com.avito.android.screens.bbip_v2.ui.items.budget.e> uVarD5 = dagger.internal.g.d(new com.avito.android.screens.bbip_v2.ui.items.budget.g(l.a(pVar)));
            this.f261467t = uVarD5;
            this.f261468u = new com.avito.android.screens.bbip_v2.ui.items.budget.d(uVarD5);
            u<com.avito.android.screens.bbip_v2.ui.items.duration.e> uVarD6 = dagger.internal.g.d(new com.avito.android.screens.bbip_v2.ui.items.duration.h(l.a(pVar2)));
            this.f261469v = uVarD6;
            u<com.avito.konveyor.a> uVarD7 = dagger.internal.g.d(new f(this.f261464q, this.f261466s, this.f261468u, new com.avito.android.screens.bbip_v2.ui.items.duration.d(uVarD6)));
            this.f261470w = uVarD7;
            u<com.avito.konveyor.adapter.a> uVarD8 = dagger.internal.g.d(new e(uVarD7));
            this.f261471x = uVarD8;
            this.f261472y = dagger.internal.g.d(new g(uVarD8, this.f261470w));
        }

        @Override // com.avito.android.screens.bbip_v2.di.a
        public final void a(BbipV2Fragment bbipV2Fragment) {
            bbipV2Fragment.f261407n0 = this.f261462o;
            bbipV2Fragment.f261408o0 = this.f261461n.get();
            bbipV2Fragment.f261409p0 = this.f261472y.get();
            InterfaceC28373a interfaceC28373aA = this.f261448a.a();
            t.c(interfaceC28373aA);
            bbipV2Fragment.f261410q0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f261449b.u4();
            t.c(aVarU4);
            bbipV2Fragment.f261411r0 = aVarU4;
        }
    }

    /* compiled from: DaggerBbipV2Component.java */
    public static final class c implements a.InterfaceC7822a {
        public c() {
        }

        @Override // com.avito.android.screens.bbip_v2.di.a.InterfaceC7822a
        public final com.avito.android.screens.bbip_v2.di.a a(InterfaceC40934b interfaceC40934b, InterfaceC39417a interfaceC39417a, r rVar, String str, String str2, p pVar, p pVar2) {
            interfaceC39417a.getClass();
            return new b(interfaceC40934b, interfaceC39417a, rVar, str, str2, pVar, pVar2, null);
        }
    }

    public static a.InterfaceC7822a a() {
        return new c();
    }
}
