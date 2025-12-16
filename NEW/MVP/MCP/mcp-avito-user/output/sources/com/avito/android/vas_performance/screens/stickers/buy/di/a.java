package com.avito.android.vas_performance.screens.stickers.buy.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.util.R0;
import com.avito.android.vas_performance.screens.stickers.buy.StickersBuyFragment;
import com.avito.android.vas_performance.screens.stickers.buy.di.e;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import zL0.InterfaceC50482a;

/* compiled from: DaggerStickersBuyComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerStickersBuyComponent.java */
    public static final class b implements e.a {
        public b() {
        }

        @Override // com.avito.android.vas_performance.screens.stickers.buy.di.e.a
        public final e a(String str, String str2, r rVar, Y41.l lVar, Y41.l lVar2, LL0.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, str, str2, rVar, lVar, lVar2, null);
        }
    }

    /* compiled from: DaggerStickersBuyComponent.java */
    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final LL0.c f320617a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f320618b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.screens.common_item.header.c> f320619c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.common_item.header.b f320620d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f320621e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.screens.stickers.buy.item.stickers.e> f320622f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.stickers.buy.item.stickers.d f320623g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.d> f320624h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.c f320625i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.screens.common_item.attributed_text.d> f320626j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f320627k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f320628l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC50482a> f320629m;

        /* renamed from: n, reason: collision with root package name */
        public final u<R0> f320630n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f320631o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.stickers.buy.mvi.e f320632p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.stickers.buy.mvi.c f320633q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28481c> f320634r;

        /* renamed from: s, reason: collision with root package name */
        public final u<C28478k> f320635s;

        /* renamed from: t, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f320636t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.stickers.buy.j f320637u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f320638v;

        /* renamed from: w, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f320639w;

        /* compiled from: DaggerStickersBuyComponent.java */
        /* renamed from: com.avito.android.vas_performance.screens.stickers.buy.di.a$c$a, reason: collision with other inner class name */
        public static final class C9935a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final LL0.c f320640a;

            public C9935a(LL0.c cVar) {
                this.f320640a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f320640a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStickersBuyComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final LL0.c f320641a;

            public b(LL0.c cVar) {
                this.f320641a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f320641a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerStickersBuyComponent.java */
        /* renamed from: com.avito.android.vas_performance.screens.stickers.buy.di.a$c$c, reason: collision with other inner class name */
        public static final class C9936c implements u<InterfaceC50482a> {

            /* renamed from: a, reason: collision with root package name */
            public final LL0.c f320642a;

            public C9936c(LL0.c cVar) {
                this.f320642a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50482a interfaceC50482aO0 = this.f320642a.o0();
                t.c(interfaceC50482aO0);
                return interfaceC50482aO0;
            }
        }

        public c() {
            throw null;
        }

        public c(LL0.c cVar, cv.b bVar, String str, String str2, r rVar, Y41.l lVar, Y41.l lVar2, C9934a c9934a) {
            this.f320617a = cVar;
            this.f320618b = bVar;
            u<com.avito.android.vas_performance.screens.common_item.header.c> uVarD = dagger.internal.g.d(com.avito.android.vas_performance.screens.common_item.header.e.a());
            this.f320619c = uVarD;
            this.f320620d = new com.avito.android.vas_performance.screens.common_item.header.b(uVarD);
            this.f320621e = dagger.internal.l.a(lVar);
            u<com.avito.android.vas_performance.screens.stickers.buy.item.stickers.e> uVarD2 = dagger.internal.g.d(new com.avito.android.vas_performance.screens.stickers.buy.item.stickers.i(this.f320621e, dagger.internal.l.a(lVar2)));
            this.f320622f = uVarD2;
            this.f320623g = new com.avito.android.vas_performance.screens.stickers.buy.item.stickers.d(uVarD2);
            u<com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.d> uVarD3 = dagger.internal.g.d(com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.f.a());
            this.f320624h = uVarD3;
            this.f320625i = new com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.c(uVarD3);
            u<com.avito.android.vas_performance.screens.common_item.attributed_text.d> uVarD4 = dagger.internal.g.d(com.avito.android.vas_performance.screens.common_item.attributed_text.f.a());
            this.f320626j = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new l(this.f320620d, this.f320623g, this.f320625i, new com.avito.android.vas_performance.screens.common_item.attributed_text.c(uVarD4)));
            this.f320627k = uVarD5;
            this.f320628l = dagger.internal.g.d(new k(uVarD5));
            this.f320629m = new C9936c(cVar);
            this.f320630n = new C9935a(cVar);
            this.f320631o = dagger.internal.l.a(str);
            dagger.internal.l lVarA = dagger.internal.l.a(str2);
            u<InterfaceC50482a> uVar = this.f320629m;
            u<R0> uVar2 = this.f320630n;
            dagger.internal.l lVar3 = this.f320631o;
            com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.b bVar2 = new com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.b(lVar3, lVarA, uVar, uVar2);
            this.f320632p = new com.avito.android.vas_performance.screens.stickers.buy.mvi.e(bVar2);
            this.f320633q = new com.avito.android.vas_performance.screens.stickers.buy.mvi.c(new com.avito.android.vas_performance.screens.stickers.buy.mvi.domain.d(lVar3, lVarA, uVar, uVar2), bVar2);
            this.f320634r = new b(cVar);
            u<C28478k> uVarD6 = dagger.internal.g.d(new o(dagger.internal.l.a(rVar)));
            this.f320635s = uVarD6;
            this.f320636t = dagger.internal.g.d(new C30060h5(this.f320634r, uVarD6));
            this.f320637u = new com.avito.android.vas_performance.screens.stickers.buy.j(new com.avito.android.vas_performance.screens.stickers.buy.mvi.h(this.f320632p, this.f320633q, com.avito.android.vas_performance.screens.stickers.buy.mvi.j.a(), com.avito.android.vas_performance.screens.stickers.buy.mvi.m.a(), this.f320636t));
            this.f320638v = dagger.internal.g.d(new m(this.f320628l, this.f320627k));
            this.f320639w = dagger.internal.g.d(new p(this.f320634r));
        }

        @Override // com.avito.android.vas_performance.screens.stickers.buy.di.e
        public final void a(StickersBuyFragment stickersBuyFragment) {
            stickersBuyFragment.f320586n0 = this.f320628l.get();
            stickersBuyFragment.f320587o0 = this.f320637u;
            stickersBuyFragment.f320589q0 = this.f320638v.get();
            LL0.c cVar = this.f320617a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            stickersBuyFragment.f320590r0 = interfaceC28373aA;
            stickersBuyFragment.f320591s0 = this.f320636t.get();
            stickersBuyFragment.f320592t0 = new com.avito.android.vas_performance.screens.common_item.a();
            stickersBuyFragment.f320593u0 = this.f320639w.get();
            com.avito.android.util.text.a aVarE = cVar.e();
            t.c(aVarE);
            stickersBuyFragment.f320594v0 = aVarE;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f320618b.u4();
            t.c(aVarU4);
            stickersBuyFragment.f320595w0 = aVarU4;
        }
    }

    public static e.a a() {
        return new b();
    }
}
