package com.avito.android.imv_cars_details.di;

import android.content.res.Resources;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.imv_cars_details.di.c;
import com.avito.android.imv_cars_details.di.n;
import com.avito.android.imv_cars_details.presentation.ImvCarsDetailsFragment;
import com.avito.android.imv_cars_details.presentation.ImvCarsDetailsParams;
import com.avito.android.util.L0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import qk0.InterfaceC47409a;

/* compiled from: DaggerImvCarsDetailsComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class b {

    /* compiled from: DaggerImvCarsDetailsComponent.java */
    /* renamed from: com.avito.android.imv_cars_details.di.b$b, reason: collision with other inner class name */
    public static final class C5026b implements c.a {
        public C5026b() {
        }

        @Override // com.avito.android.imv_cars_details.di.c.a
        public final com.avito.android.imv_cars_details.di.c a(g gVar, InterfaceC39417a interfaceC39417a, ImvCarsDetailsParams imvCarsDetailsParams, Resources resources) {
            interfaceC39417a.getClass();
            imvCarsDetailsParams.getClass();
            return new c(gVar, interfaceC39417a, imvCarsDetailsParams, resources, null);
        }
    }

    /* compiled from: DaggerImvCarsDetailsComponent.java */
    public static final class c implements com.avito.android.imv_cars_details.di.c {

        /* renamed from: A, reason: collision with root package name */
        public final com.avito.android.imv_cars_details.presentation.items.text_block_item.b f169899A;

        /* renamed from: B, reason: collision with root package name */
        public final com.avito.android.imv_cars_details.presentation.items.seller_comment.b f169900B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f169901C;

        /* renamed from: D, reason: collision with root package name */
        public final u<L0> f169902D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f169903E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f169904F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f169905G;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f169906a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC47409a> f169907b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.imv_cars_details.domain.a> f169908c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.imv_cars_details.domain.g> f169909d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f169910e;

        /* renamed from: f, reason: collision with root package name */
        public final u<E> f169911f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.imv_cars_details.domain.d> f169912g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.imv_cars_details.presentation.f> f169913h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.imv_cars_details.mvi.f f169914i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ZM.a> f169915j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.imv_cars_details.presentation.a> f169916k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.imv_cars_details.mvi.m f169917l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.imv_cars_details.presentation.k f169918m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.imv_cars_details.presentation.items.price_description.e f169919n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.imv_cars_details.presentation.items.all_affecting_params.b f169920o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.imv_cars_details.presentation.items.title_Item.b f169921p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.imv_chart.g> f169922q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.imv_chart.f> f169923r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.b f169924s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f169925t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f169926u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f169927v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list.b f169928w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.jakewharton.rxrelay3.c<WM.a>> f169929x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.b f169930y;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price.b f169931z;

        /* compiled from: DaggerImvCarsDetailsComponent.java */
        public static final class a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final g f169932a;

            public a(g gVar) {
                this.f169932a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eB4 = this.f169932a.b4();
                t.c(eB4);
                return eB4;
            }
        }

        /* compiled from: DaggerImvCarsDetailsComponent.java */
        /* renamed from: com.avito.android.imv_cars_details.di.b$c$b, reason: collision with other inner class name */
        public static final class C5027b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final g f169933a;

            public C5027b(g gVar) {
                this.f169933a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f169933a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerImvCarsDetailsComponent.java */
        /* renamed from: com.avito.android.imv_cars_details.di.b$c$c, reason: collision with other inner class name */
        public static final class C5028c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f169934a;

            public C5028c(cv.b bVar) {
                this.f169934a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f169934a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerImvCarsDetailsComponent.java */
        public static final class d implements u<L0> {

            /* renamed from: a, reason: collision with root package name */
            public final g f169935a;

            public d(g gVar) {
                this.f169935a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                L0 l0Z = this.f169935a.z();
                t.c(l0Z);
                return l0Z;
            }
        }

        /* compiled from: DaggerImvCarsDetailsComponent.java */
        public static final class e implements u<InterfaceC47409a> {

            /* renamed from: a, reason: collision with root package name */
            public final g f169936a;

            public e(g gVar) {
                this.f169936a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC47409a interfaceC47409aOj = this.f169936a.Oj();
                t.c(interfaceC47409aOj);
                return interfaceC47409aOj;
            }
        }

        public c(g gVar, cv.b bVar, ImvCarsDetailsParams imvCarsDetailsParams, Resources resources, a aVar) {
            this.f169906a = bVar;
            this.f169908c = dagger.internal.g.d(new com.avito.android.imv_cars_details.domain.c(new e(gVar)));
            u<com.avito.android.imv_cars_details.domain.g> uVarD = dagger.internal.g.d(com.avito.android.imv_cars_details.domain.i.a());
            this.f169909d = uVarD;
            C5027b c5027b = new C5027b(gVar);
            this.f169910e = c5027b;
            this.f169912g = dagger.internal.g.d(new com.avito.android.imv_cars_details.domain.f(uVarD, c5027b, new a(gVar)));
            u<com.avito.android.imv_cars_details.presentation.f> uVarD2 = dagger.internal.g.d(new com.avito.android.imv_cars_details.presentation.h(dagger.internal.l.a(resources)));
            this.f169913h = uVarD2;
            this.f169914i = new com.avito.android.imv_cars_details.mvi.f(uVarD2, this.f169908c, this.f169912g);
            u<ZM.a> uVarD3 = dagger.internal.g.d(new ZM.c(uVarD2));
            this.f169915j = uVarD3;
            u<com.avito.android.imv_cars_details.presentation.a> uVarD4 = dagger.internal.g.d(new com.avito.android.imv_cars_details.presentation.c(uVarD3));
            this.f169916k = uVarD4;
            this.f169917l = new com.avito.android.imv_cars_details.mvi.m(uVarD4);
            this.f169918m = new com.avito.android.imv_cars_details.presentation.k(new com.avito.android.imv_cars_details.mvi.i(this.f169914i, com.avito.android.imv_cars_details.mvi.k.a(), this.f169917l));
            this.f169919n = new com.avito.android.imv_cars_details.presentation.items.price_description.e(com.avito.android.imv_cars_details.presentation.items.price_description.c.a());
            this.f169920o = new com.avito.android.imv_cars_details.presentation.items.all_affecting_params.b(com.avito.android.imv_cars_details.presentation.items.all_affecting_params.d.a());
            this.f169921p = new com.avito.android.imv_cars_details.presentation.items.title_Item.b(com.avito.android.imv_cars_details.presentation.items.title_Item.d.a());
            u<com.avito.android.imv_chart.g> uVarD5 = dagger.internal.g.d(com.avito.android.imv_cars_details.presentation.items.imv_chart_item.b.a());
            this.f169922q = uVarD5;
            this.f169923r = dagger.internal.g.d(new j(uVarD5));
            this.f169924s = new com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.b(com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.f.a());
            u<com.avito.konveyor.a> uVarD6 = dagger.internal.g.d(new YM.c(new com.avito.android.imv_cars_details.presentation.items.imv_cars_detail_neighbor_item.b(com.avito.android.imv_cars_details.presentation.items.imv_cars_detail_neighbor_item.f.a(), com.avito.android.imv_cars_details.presentation.items.imv_cars_detail_neighbor_item.d.a())));
            this.f169925t = uVarD6;
            u<com.avito.konveyor.adapter.a> uVarD7 = dagger.internal.g.d(new YM.b(uVarD6));
            this.f169926u = uVarD7;
            u<com.avito.konveyor.adapter.j> uVarD8 = dagger.internal.g.d(new YM.d(uVarD7, this.f169925t));
            this.f169927v = uVarD8;
            this.f169928w = new com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list.b(new com.avito.android.imv_cars_details.presentation.items.imv_cars_details_neighbors_list.d(uVarD8, this.f169926u), uVarD8);
            u<com.jakewharton.rxrelay3.c<WM.a>> uVarD9 = dagger.internal.g.d(n.a.f169959a);
            this.f169929x = uVarD9;
            this.f169930y = new com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.b(new com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.f(uVarD9));
            this.f169931z = new com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price.b(com.avito.android.imv_cars_details.presentation.items.difference_imv_avg_price.d.a());
            this.f169899A = new com.avito.android.imv_cars_details.presentation.items.text_block_item.b(new com.avito.android.imv_cars_details.presentation.items.text_block_item.e(this.f169929x));
            this.f169900B = new com.avito.android.imv_cars_details.presentation.items.seller_comment.b(com.avito.android.imv_cars_details.presentation.items.seller_comment.d.a());
            C5028c c5028c = new C5028c(bVar);
            this.f169901C = c5028c;
            u<com.avito.konveyor.a> uVarD10 = dagger.internal.g.d(new k(this.f169919n, this.f169920o, this.f169921p, this.f169923r, this.f169924s, this.f169928w, this.f169930y, this.f169931z, this.f169899A, this.f169900B, new com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser.b(new com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser.e(c5028c), new d(gVar), com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser.k.a()), new com.avito.android.advert_details_items.imv_v4_cars.e(new com.avito.android.advert_details_items.imv_v4_cars.i(new com.avito.android.advert_details_items.imv_v4_cars.c(this.f169910e), this.f169901C))));
            this.f169903E = uVarD10;
            u<com.avito.konveyor.adapter.a> uVarD11 = dagger.internal.g.d(new i(uVarD10));
            this.f169904F = uVarD11;
            this.f169905G = dagger.internal.g.d(new l(uVarD11, this.f169903E));
        }

        @Override // com.avito.android.imv_cars_details.di.c
        public final void a(ImvCarsDetailsFragment imvCarsDetailsFragment) {
            imvCarsDetailsFragment.f170014n0 = this.f169918m;
            imvCarsDetailsFragment.f170015o0 = this.f169905G.get();
            imvCarsDetailsFragment.f170016p0 = this.f169904F.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f169906a.u4();
            t.c(aVarU4);
            imvCarsDetailsFragment.f170017q0 = aVarU4;
            imvCarsDetailsFragment.f170018r0 = this.f169929x.get();
        }
    }

    public static c.a a() {
        return new C5026b();
    }
}
