package com.avito.android.edit_carousel.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.edit_carousel.EditCarouselFragment;
import com.avito.android.edit_carousel.adapter.advert.h;
import com.avito.android.edit_carousel.di.b;
import com.avito.android.edit_carousel.entity.CarouselEditorData;
import com.avito.android.edit_carousel.j;
import com.avito.android.edit_carousel.k;
import com.avito.android.edit_carousel.mvi.i;
import com.avito.android.edit_carousel.mvi.m;
import com.avito.android.edit_carousel.w;
import com.avito.android.edit_carousel.y;
import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerEditCarouselComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEditCarouselComponent.java */
    public static final class b implements com.avito.android.edit_carousel.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f146339A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f146340B;

        /* renamed from: a, reason: collision with root package name */
        public final l f146341a;

        /* renamed from: b, reason: collision with root package name */
        public final u<D0> f146342b;

        /* renamed from: c, reason: collision with root package name */
        public final u<Gson> f146343c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35863o4> f146344d;

        /* renamed from: e, reason: collision with root package name */
        public final u<w> f146345e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f146346f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.edit_carousel.e> f146347g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f146348h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.edit_carousel.mvi.d f146349i;

        /* renamed from: j, reason: collision with root package name */
        public final u<k> f146350j;

        /* renamed from: k, reason: collision with root package name */
        public final m f146351k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f146352l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C28478k> f146353m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f146354n;

        /* renamed from: o, reason: collision with root package name */
        public final j f146355o;

        /* renamed from: p, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f146356p;

        /* renamed from: q, reason: collision with root package name */
        public final l f146357q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.edit_carousel.adapter.advert.d> f146358r;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f146359s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.edit_carousel.adapter.button.d> f146360t;

        /* renamed from: u, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f146361u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.edit_carousel.adapter.header.d> f146362v;

        /* renamed from: w, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f146363w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.edit_carousel.adapter.paging_bar.d> f146364x;

        /* renamed from: y, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f146365y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f146366z;

        /* compiled from: DaggerEditCarouselComponent.java */
        /* renamed from: com.avito.android.edit_carousel.di.a$b$a, reason: collision with other inner class name */
        public static final class C4253a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146367a;

            public C4253a(InterfaceC29970g interfaceC29970g) {
                this.f146367a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f146367a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerEditCarouselComponent.java */
        /* renamed from: com.avito.android.edit_carousel.di.a$b$b, reason: collision with other inner class name */
        public static final class C4254b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146368a;

            public C4254b(InterfaceC29970g interfaceC29970g) {
                this.f146368a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f146368a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerEditCarouselComponent.java */
        public static final class c implements u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146369a;

            public c(InterfaceC29970g interfaceC29970g) {
                this.f146369a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0B7 = this.f146369a.b7();
                t.c(d0B7);
                return d0B7;
            }
        }

        /* compiled from: DaggerEditCarouselComponent.java */
        public static final class d implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146370a;

            public d(InterfaceC29970g interfaceC29970g) {
                this.f146370a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f146370a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerEditCarouselComponent.java */
        public static final class e implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146371a;

            public e(InterfaceC29970g interfaceC29970g) {
                this.f146371a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f146371a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerEditCarouselComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146372a;

            public f(InterfaceC29970g interfaceC29970g) {
                this.f146372a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f146372a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(InterfaceC29970g interfaceC29970g, Fragment fragment, CarouselEditorData carouselEditorData, Resources resources, Y41.l lVar, r rVar, C4252a c4252a) {
            this.f146341a = l.a(carouselEditorData);
            this.f146342b = new c(interfaceC29970g);
            this.f146343c = new d(interfaceC29970g);
            this.f146344d = new e(interfaceC29970g);
            u<w> uVarD = g.d(y.a());
            this.f146345e = uVarD;
            u<com.avito.android.edit_carousel.e> uVarD2 = g.d(new com.avito.android.edit_carousel.g(uVarD, this.f146342b, this.f146343c, this.f146344d, new C4254b(interfaceC29970g)));
            this.f146347g = uVarD2;
            this.f146349i = new com.avito.android.edit_carousel.mvi.d(this.f146341a, uVarD2, new C4253a(interfaceC29970g));
            u<k> uVarD3 = g.d(new com.avito.android.edit_carousel.m(l.a(resources)));
            this.f146350j = uVarD3;
            this.f146351k = new m(this.f146341a, uVarD3);
            this.f146352l = new f(interfaceC29970g);
            u<C28478k> uVarD4 = g.d(new com.avito.android.edit_carousel.di.e(l.a(rVar)));
            this.f146353m = uVarD4;
            this.f146354n = com.avito.android.advert.item.delivery_suggests.l.i(this.f146352l, uVarD4);
            this.f146355o = new j(new i(com.avito.android.edit_carousel.mvi.f.a(), this.f146349i, com.avito.android.edit_carousel.mvi.k.a(), this.f146351k, this.f146354n));
            this.f146356p = B.a(com.avito.android.konveyor_adapter_module.d.a());
            l lVarA = l.a(lVar);
            this.f146357q = lVarA;
            u<com.avito.android.edit_carousel.adapter.advert.d> uVarD5 = g.d(new h(lVarA, this.f146350j));
            this.f146358r = uVarD5;
            this.f146359s = g.d(new com.avito.android.edit_carousel.adapter.advert.c(uVarD5));
            u<com.avito.android.edit_carousel.adapter.button.d> uVarD6 = g.d(new com.avito.android.edit_carousel.adapter.button.g(this.f146357q));
            this.f146360t = uVarD6;
            this.f146361u = g.d(new com.avito.android.edit_carousel.adapter.button.c(uVarD6));
            u<com.avito.android.edit_carousel.adapter.header.d> uVarD7 = g.d(new com.avito.android.edit_carousel.adapter.header.g(this.f146357q));
            this.f146362v = uVarD7;
            this.f146363w = g.d(new com.avito.android.edit_carousel.adapter.header.c(uVarD7));
            u<com.avito.android.edit_carousel.adapter.paging_bar.d> uVarD8 = g.d(new com.avito.android.edit_carousel.adapter.paging_bar.g(this.f146357q));
            this.f146364x = uVarD8;
            this.f146365y = g.d(new com.avito.android.edit_carousel.adapter.paging_bar.c(uVarD8));
            A.b bVarA = A.a(4, 1);
            bVarA.f393938b.add(this.f146356p);
            u<TV0.b<?, ?>> uVar = this.f146359s;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f146361u);
            list.add(this.f146363w);
            list.add(this.f146365y);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f146366z = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f146339A = uVarH;
            this.f146340B = g.d(new com.avito.android.edit_carousel.di.d(uVarH, this.f146366z));
        }

        @Override // com.avito.android.edit_carousel.di.b
        public final void a(EditCarouselFragment editCarouselFragment) {
            editCarouselFragment.f146209n0 = this.f146355o;
            editCarouselFragment.f146211p0 = this.f146340B.get();
            editCarouselFragment.f146212q0 = this.f146354n.get();
        }
    }

    /* compiled from: DaggerEditCarouselComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.edit_carousel.di.b.a
        public final com.avito.android.edit_carousel.di.b a(EditCarouselFragment editCarouselFragment, CarouselEditorData carouselEditorData, Resources resources, Y41.l lVar, r rVar, InterfaceC29970g interfaceC29970g) {
            return new b(interfaceC29970g, editCarouselFragment, carouselEditorData, resources, lVar, rVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
