package com.avito.android.str_seller_orders.strsellerordersdialog.di;

import Cz0.C13377a;
import Y41.l;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.T0;
import com.avito.android.J0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.strsellerordersdialog.StrSellerOrdersDialogFragment;
import com.avito.android.str_seller_orders.strsellerordersdialog.di.b;
import com.avito.android.str_seller_orders.strsellerordersdialog.mvi.k;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerStrSellerOrdersDialogComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrSellerOrdersDialogComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.str_seller_orders.strsellerordersdialog.di.b.a
        public final com.avito.android.str_seller_orders.strsellerordersdialog.di.b a(cz0.e eVar, InterfaceC39417a interfaceC39417a, r rVar, l lVar, StrSellerOrdersDialogData strSellerOrdersDialogData, ActivityC22955m activityC22955m) {
            interfaceC39417a.getClass();
            return new c(new g(), new com.avito.android.str_seller_orders.strsellerordersdialog.di.c(), new C13377a(), eVar, interfaceC39417a, rVar, lVar, strSellerOrdersDialogData, activityC22955m, null);
        }
    }

    /* compiled from: DaggerStrSellerOrdersDialogComponent.java */
    public static final class c implements com.avito.android.str_seller_orders.strsellerordersdialog.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cz0.e f290098a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.strsellerordersdialog.mvi.d f290099b;

        /* renamed from: c, reason: collision with root package name */
        public final u<J0> f290100c;

        /* renamed from: d, reason: collision with root package name */
        public final k f290101d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28481c> f290102e;

        /* renamed from: f, reason: collision with root package name */
        public final u<C28478k> f290103f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f290104g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.str_seller_orders.strsellerordersdialog.c f290105h;

        /* renamed from: i, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f290106i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f290107j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f290108k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f290109l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f290110m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.l f290111n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders.strsellerordersdialog.shared.a> f290112o;

        /* compiled from: DaggerStrSellerOrdersDialogComponent.java */
        /* renamed from: com.avito.android.str_seller_orders.strsellerordersdialog.di.a$c$a, reason: collision with other inner class name */
        public static final class C8750a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f290113a;

            public C8750a(cz0.e eVar) {
                this.f290113a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f290113a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerStrSellerOrdersDialogComponent.java */
        public static final class b implements u<J0> {

            /* renamed from: a, reason: collision with root package name */
            public final cz0.e f290114a;

            public b(cz0.e eVar) {
                this.f290114a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J0 j0F0 = this.f290114a.f0();
                t.c(j0F0);
                return j0F0;
            }
        }

        public c() {
            throw null;
        }

        public c(g gVar, com.avito.android.str_seller_orders.strsellerordersdialog.di.c cVar, C13377a c13377a, cz0.e eVar, cv.b bVar, r rVar, l lVar, StrSellerOrdersDialogData strSellerOrdersDialogData, T0 t02, C8749a c8749a) {
            this.f290098a = eVar;
            this.f290099b = new com.avito.android.str_seller_orders.strsellerordersdialog.mvi.d(dagger.internal.l.b(strSellerOrdersDialogData));
            this.f290101d = new k(new b(eVar));
            this.f290102e = new C8750a(eVar);
            u<C28478k> uVarD = dagger.internal.g.d(new h(gVar, dagger.internal.l.a(rVar)));
            this.f290103f = uVarD;
            this.f290104g = dagger.internal.g.d(new i(gVar, this.f290102e, uVarD));
            this.f290105h = new com.avito.android.str_seller_orders.strsellerordersdialog.c(new com.avito.android.str_seller_orders.strsellerordersdialog.mvi.g(this.f290099b, com.avito.android.str_seller_orders.strsellerordersdialog.mvi.b.a(), com.avito.android.str_seller_orders.strsellerordersdialog.mvi.i.a(), this.f290101d, this.f290104g));
            this.f290106i = dagger.internal.g.d(new com.avito.android.str_seller_orders.strsellerordersdialog.items.order.b(new com.avito.android.str_seller_orders.strsellerordersdialog.items.order.g(dagger.internal.l.a(lVar))));
            this.f290107j = dagger.internal.g.d(new com.avito.android.str_seller_orders.common.items.order_stub.c(com.avito.android.str_seller_orders.common.items.order_stub.e.a()));
            A.b bVarA = A.a(2, 0);
            u<TV0.b<?, ?>> uVar = this.f290106i;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f290107j);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new e(cVar, bVarA.b()));
            this.f290108k = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new d(cVar, uVarD2));
            this.f290109l = uVarD3;
            this.f290110m = dagger.internal.g.d(new f(cVar, uVarD3, this.f290108k));
            this.f290111n = dagger.internal.l.a(t02);
            this.f290112o = dagger.internal.g.d(new Cz0.b(c13377a, this.f290111n, new com.avito.android.str_seller_orders.strsellerordersdialog.shared.b(new com.avito.android.str_seller_orders.strsellerordersdialog.shared.mvi.i(com.avito.android.str_seller_orders.strsellerordersdialog.shared.mvi.b.a(), com.avito.android.str_seller_orders.strsellerordersdialog.shared.mvi.k.a(), com.avito.android.str_seller_orders.strsellerordersdialog.shared.mvi.f.a()))));
        }

        @Override // com.avito.android.str_seller_orders.strsellerordersdialog.di.b
        public final void a(StrSellerOrdersDialogFragment strSellerOrdersDialogFragment) {
            strSellerOrdersDialogFragment.f290067h0 = this.f290105h;
            strSellerOrdersDialogFragment.f290069j0 = this.f290104g.get();
            strSellerOrdersDialogFragment.f290070k0 = this.f290110m.get();
            com.avito.android.util.text.a aVarE = this.f290098a.e();
            t.c(aVarE);
            strSellerOrdersDialogFragment.f290071l0 = aVarE;
            strSellerOrdersDialogFragment.f290072m0 = this.f290112o.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
