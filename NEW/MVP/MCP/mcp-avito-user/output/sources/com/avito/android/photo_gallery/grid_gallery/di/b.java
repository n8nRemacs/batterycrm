package com.avito.android.photo_gallery.grid_gallery.di;

import Y41.l;
import bj.InterfaceC25659b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.photo_gallery.grid_gallery.A;
import com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity;
import com.avito.android.photo_gallery.grid_gallery.GridGalleryOpenParams;
import com.avito.android.photo_gallery.grid_gallery.InterfaceC33188a;
import com.avito.android.photo_gallery.grid_gallery.di.c;
import com.avito.android.photo_gallery.grid_gallery.mvi.B;
import com.avito.android.photo_gallery.grid_gallery.mvi.D;
import com.avito.android.photo_gallery.grid_gallery.mvi.F;
import com.avito.android.photo_gallery.grid_gallery.mvi.m;
import com.avito.android.photo_gallery.grid_gallery.mvi.s;
import com.avito.android.photo_gallery.grid_gallery.mvi.w;
import com.avito.android.photo_gallery.grid_gallery.mvi.z;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerGridGalleryComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class b {

    /* compiled from: DaggerGridGalleryComponent.java */
    /* renamed from: com.avito.android.photo_gallery.grid_gallery.di.b$b, reason: collision with other inner class name */
    public static final class C6512b implements c.a {
        public C6512b() {
        }

        @Override // com.avito.android.photo_gallery.grid_gallery.di.c.a
        public final com.avito.android.photo_gallery.grid_gallery.di.c a(d dVar, kj.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, l lVar, GridGalleryOpenParams gridGalleryOpenParams) {
            interfaceC39417a.getClass();
            gridGalleryOpenParams.getClass();
            return new c(dVar, interfaceC39417a, cVar, c28478k, lVar, gridGalleryOpenParams, null);
        }
    }

    /* compiled from: DaggerGridGalleryComponent.java */
    public static final class c implements com.avito.android.photo_gallery.grid_gallery.di.c {

        /* renamed from: A, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f217151A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f217152B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f217153C;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f217154a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f217155b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f217156c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC33188a> f217157d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.photo_gallery.grid_gallery.l f217158e;

        /* renamed from: f, reason: collision with root package name */
        public final w f217159f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f217160g;

        /* renamed from: h, reason: collision with root package name */
        public final u<R0> f217161h;

        /* renamed from: i, reason: collision with root package name */
        public final s f217162i;

        /* renamed from: j, reason: collision with root package name */
        public final D f217163j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f217164k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f217165l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f217166m;

        /* renamed from: n, reason: collision with root package name */
        public final A f217167n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f217168o;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f217169p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f217170q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f217171r;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f217172s;

        /* renamed from: t, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f217173t;

        /* renamed from: u, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f217174u;

        /* renamed from: v, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f217175v;

        /* renamed from: w, reason: collision with root package name */
        public final u<gj.d> f217176w;

        /* renamed from: x, reason: collision with root package name */
        public final u<a.b> f217177x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.photo_gallery.grid_gallery.di.f f217178y;

        /* renamed from: z, reason: collision with root package name */
        public final u<InterfaceC25659b> f217179z;

        /* compiled from: DaggerGridGalleryComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_gallery.grid_gallery.di.d f217180a;

            public a(com.avito.android.photo_gallery.grid_gallery.di.d dVar) {
                this.f217180a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f217180a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerGridGalleryComponent.java */
        /* renamed from: com.avito.android.photo_gallery.grid_gallery.di.b$c$b, reason: collision with other inner class name */
        public static final class C6513b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_gallery.grid_gallery.di.d f217181a;

            public C6513b(com.avito.android.photo_gallery.grid_gallery.di.d dVar) {
                this.f217181a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f217181a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerGridGalleryComponent.java */
        /* renamed from: com.avito.android.photo_gallery.grid_gallery.di.b$c$c, reason: collision with other inner class name */
        public static final class C6514c implements u<InterfaceC25659b> {

            /* renamed from: a, reason: collision with root package name */
            public final kj.c f217182a;

            public C6514c(kj.c cVar) {
                this.f217182a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f217182a.sd();
            }
        }

        /* compiled from: DaggerGridGalleryComponent.java */
        public static final class d implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final kj.c f217183a;

            public d(kj.c cVar) {
                this.f217183a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f217183a.El();
            }
        }

        /* compiled from: DaggerGridGalleryComponent.java */
        public static final class e implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f217184a;

            public e(cv.b bVar) {
                this.f217184a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f217184a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerGridGalleryComponent.java */
        public static final class f implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f217185a;

            public f(cv.b bVar) {
                this.f217185a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f217185a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerGridGalleryComponent.java */
        public static final class g implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_gallery.grid_gallery.di.d f217186a;

            public g(com.avito.android.photo_gallery.grid_gallery.di.d dVar) {
                this.f217186a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f217186a.c();
                t.c(r0C);
                return r0C;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.photo_gallery.grid_gallery.di.d dVar, cv.b bVar, kj.c cVar, C28478k c28478k, l lVar, GridGalleryOpenParams gridGalleryOpenParams, a aVar) {
            this.f217154a = bVar;
            this.f217155b = dagger.internal.l.a(gridGalleryOpenParams);
            this.f217156c = new e(bVar);
            u<InterfaceC33188a> uVarD = dagger.internal.g.d(com.avito.android.photo_gallery.grid_gallery.c.a());
            this.f217157d = uVarD;
            com.avito.android.photo_gallery.grid_gallery.l lVar2 = new com.avito.android.photo_gallery.grid_gallery.l(uVarD);
            this.f217158e = lVar2;
            this.f217159f = new w(this.f217155b, this.f217156c, lVar2, m.a());
            this.f217162i = new s(this.f217155b, new a(dVar), new g(dVar), this.f217158e);
            this.f217163j = new D(F.a());
            this.f217164k = new C6513b(dVar);
            dagger.internal.l lVarA = dagger.internal.l.a(c28478k);
            this.f217165l = lVarA;
            this.f217166m = com.avito.android.actions_sheet.a.D(lVarA, this.f217164k);
            this.f217167n = new A(new z(this.f217159f, this.f217162i, B.a(), this.f217163j, this.f217166m));
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar);
            this.f217168o = lVarA2;
            this.f217169p = dagger.internal.g.d(new com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item.b(new com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item.g(lVarA2)));
            A.b bVarA = dagger.internal.A.a(1, 0);
            bVarA.f393937a.add(this.f217169p);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new j(bVarA.b()));
            this.f217170q = uVarD2;
            this.f217171r = dagger.internal.g.d(new i(uVarD2));
            this.f217172s = dagger.internal.g.d(new com.avito.android.photo_gallery.grid_gallery.items.spacing.b(com.avito.android.photo_gallery.grid_gallery.items.spacing.d.a()));
            this.f217173t = dagger.internal.g.d(new com.avito.android.photo_gallery.grid_gallery.items.title.b(com.avito.android.photo_gallery.grid_gallery.items.title.d.a()));
            this.f217174u = dagger.internal.g.d(new com.avito.android.photo_gallery.grid_gallery.items.single_entity.b(new com.avito.android.photo_gallery.grid_gallery.items.single_entity.e(this.f217168o)));
            this.f217175v = dagger.internal.g.d(new com.avito.android.photo_gallery.grid_gallery.items.double_entity.b(new com.avito.android.photo_gallery.grid_gallery.items.double_entity.f(this.f217168o)));
            d dVar2 = new d(cVar);
            f fVar = new f(bVar);
            this.f217178y = new com.avito.android.photo_gallery.grid_gallery.di.f(this.f217165l, dVar2, this.f217156c, fVar);
            this.f217179z = new C6514c(cVar);
            this.f217151A = dagger.internal.g.d(new com.avito.android.photo_gallery.grid_gallery.items.beduin_teaser.b(com.avito.android.photo_gallery.grid_gallery.items.beduin_teaser.e.a(), this.f217178y, this.f217179z));
            A.b bVarA2 = dagger.internal.A.a(5, 0);
            u<TV0.b<?, ?>> uVar = this.f217172s;
            List<u<T>> list = bVarA2.f393937a;
            list.add(uVar);
            list.add(this.f217173t);
            list.add(this.f217174u);
            list.add(this.f217175v);
            list.add(this.f217151A);
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new com.avito.android.photo_gallery.grid_gallery.di.g(bVarA2.b()));
            this.f217152B = uVarD3;
            this.f217153C = dagger.internal.g.d(new h(uVarD3, com.avito.android.photo_gallery.grid_gallery.items.navbar_block.b.a()));
        }

        @Override // com.avito.android.photo_gallery.grid_gallery.di.c
        public final void a(GridGalleryActivity gridGalleryActivity) {
            gridGalleryActivity.f217087n = this.f217167n;
            gridGalleryActivity.f217089p = this.f217166m.get();
            gridGalleryActivity.f217090q = this.f217171r.get();
            gridGalleryActivity.f217091r = this.f217153C.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f217154a.u4();
            t.c(aVarU4);
            gridGalleryActivity.f217092s = aVarU4;
        }
    }

    public static c.a a() {
        return new C6512b();
    }
}
