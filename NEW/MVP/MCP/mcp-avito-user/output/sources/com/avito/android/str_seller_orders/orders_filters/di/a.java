package com.avito.android.str_seller_orders.orders_filters.di;

import Y41.l;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersFragment;
import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersOpenParams;
import com.avito.android.str_seller_orders.orders_filters.di.d;
import com.avito.android.str_seller_orders.orders_filters.mvi.m;
import com.avito.android.str_seller_orders.orders_filters.mvi.n;
import com.avito.android.str_seller_orders.orders_filters.mvi.p;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import kotlin.G0;
import qz0.InterfaceC47467a;

/* compiled from: DaggerStrOrdersFiltersComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrOrdersFiltersComponent.java */
    public static final class b implements d.a {
        public b() {
        }

        @Override // com.avito.android.str_seller_orders.orders_filters.di.d.a
        public final d a(e eVar, r rVar, l<? super InterfaceC47467a, G0> lVar, StrOrdersFiltersOpenParams strOrdersFiltersOpenParams) {
            strOrdersFiltersOpenParams.getClass();
            return new c(eVar, rVar, lVar, strOrdersFiltersOpenParams, null);
        }
    }

    /* compiled from: DaggerStrOrdersFiltersComponent.java */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders_filters.mvi.e f289129a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.orders_filters.domain.e> f289130b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.orders_filters.domain.e> f289131c;

        /* renamed from: d, reason: collision with root package name */
        public final u<n> f289132d;

        /* renamed from: e, reason: collision with root package name */
        public final m f289133e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f289134f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C28478k> f289135g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f289136h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders_filters.d f289137i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.orders_filters.items.toggle.i f289138j;

        /* renamed from: k, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289139k;

        /* renamed from: l, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f289140l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f289141m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f289142n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f289143o;

        /* compiled from: DaggerStrOrdersFiltersComponent.java */
        /* renamed from: com.avito.android.str_seller_orders.orders_filters.di.a$c$a, reason: collision with other inner class name */
        public static final class C8706a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final e f289144a;

            public C8706a(e eVar) {
                this.f289144a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f289144a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        public c() {
            throw null;
        }

        public c(e eVar, r rVar, l lVar, StrOrdersFiltersOpenParams strOrdersFiltersOpenParams, C8705a c8705a) {
            this.f289129a = new com.avito.android.str_seller_orders.orders_filters.mvi.e(dagger.internal.l.a(strOrdersFiltersOpenParams));
            this.f289130b = dagger.internal.g.d(com.avito.android.str_seller_orders.orders_filters.domain.d.a());
            u<com.avito.android.str_seller_orders.orders_filters.domain.e> uVarD = dagger.internal.g.d(com.avito.android.str_seller_orders.orders_filters.domain.b.a());
            this.f289131c = uVarD;
            u<n> uVarD2 = dagger.internal.g.d(new p(uVarD, this.f289130b));
            this.f289132d = uVarD2;
            this.f289133e = new m(uVarD2);
            this.f289134f = new C8706a(eVar);
            u<C28478k> uVarD3 = dagger.internal.g.d(new j(dagger.internal.l.a(rVar)));
            this.f289135g = uVarD3;
            this.f289136h = dagger.internal.g.d(new k(uVarD3, this.f289134f));
            this.f289137i = new com.avito.android.str_seller_orders.orders_filters.d(new com.avito.android.str_seller_orders.orders_filters.mvi.i(this.f289129a, com.avito.android.str_seller_orders.orders_filters.mvi.c.a(), com.avito.android.str_seller_orders.orders_filters.mvi.k.a(), this.f289133e, this.f289136h));
            com.avito.android.str_seller_orders.orders_filters.items.toggle.i iVar = new com.avito.android.str_seller_orders.orders_filters.items.toggle.i(dagger.internal.l.a(lVar));
            this.f289138j = iVar;
            this.f289139k = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_filters.items.toggle.d(iVar));
            this.f289140l = dagger.internal.g.d(new com.avito.android.str_seller_orders.orders_filters.items.toggle.b(this.f289138j));
            A.b bVarA = A.a(2, 0);
            u<TV0.b<?, ?>> uVar = this.f289139k;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f289140l);
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new h(bVarA.b()));
            this.f289141m = uVarD4;
            u<com.avito.konveyor.adapter.a> uVarD5 = dagger.internal.g.d(new g(uVarD4));
            this.f289142n = uVarD5;
            this.f289143o = dagger.internal.g.d(new i(uVarD5, this.f289141m, com.avito.android.str_seller_orders.orders_filters.items.b.a()));
        }

        @Override // com.avito.android.str_seller_orders.orders_filters.di.d
        public final void a(StrOrdersFiltersFragment strOrdersFiltersFragment) {
            strOrdersFiltersFragment.f289103h0 = this.f289137i;
            strOrdersFiltersFragment.f289105j0 = this.f289136h.get();
            strOrdersFiltersFragment.f289106k0 = this.f289143o.get();
        }
    }

    public static d.a a() {
        return new b();
    }
}
