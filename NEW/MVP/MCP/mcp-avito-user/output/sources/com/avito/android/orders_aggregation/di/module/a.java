package com.avito.android.orders_aggregation.di.module;

import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC23487e;
import androidx.view.P0;
import androidx.view.T0;
import c50.InterfaceC26944a;
import com.avito.android.B2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.deprecated_design.tab.TabPagerAdapter;
import com.avito.android.orders_aggregation.OrdersAggregationFragment;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import com.avito.android.orders_aggregation.OrdersAggregationTabShownStatusStorage;
import com.avito.android.orders_aggregation.di.module.b;
import com.avito.android.orders_aggregation.di.module.k;
import com.avito.android.orders_aggregation.r;
import com.avito.android.orders_aggregation.s;
import com.avito.android.util.R0;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import i50.AbstractC41226a;
import java.util.List;
import k50.C42507a;
import k50.C42508b;
import k50.C42509c;
import k50.C42510d;
import k50.C42511e;
import n50.InterfaceC44196b;

/* compiled from: DaggerOrdersAggregationComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerOrdersAggregationComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public OrdersAggregationFragment f210209a;

        /* renamed from: b, reason: collision with root package name */
        public OrdersAggregationIntentFactory.GeneralOrdersData f210210b;

        /* renamed from: c, reason: collision with root package name */
        public String f210211c;

        /* renamed from: d, reason: collision with root package name */
        public C28478k f210212d;

        /* renamed from: e, reason: collision with root package name */
        public com.avito.android.orders_aggregation.di.module.c f210213e;

        public b() {
        }

        @Override // com.avito.android.orders_aggregation.di.module.b.a
        public final b.a a(C28478k c28478k) {
            this.f210212d = c28478k;
            return this;
        }

        @Override // com.avito.android.orders_aggregation.di.module.b.a
        public final b.a b(OrdersAggregationFragment ordersAggregationFragment) {
            this.f210209a = ordersAggregationFragment;
            return this;
        }

        @Override // com.avito.android.orders_aggregation.di.module.b.a
        public final com.avito.android.orders_aggregation.di.module.b build() {
            t.a(Fragment.class, this.f210209a);
            t.a(C28478k.class, this.f210212d);
            t.a(com.avito.android.orders_aggregation.di.module.c.class, this.f210213e);
            return new c(new C42507a(), this.f210213e, this.f210209a, this.f210210b, this.f210211c, this.f210212d, null);
        }

        @Override // com.avito.android.orders_aggregation.di.module.b.a
        public final b.a c(String str) {
            this.f210211c = str;
            return this;
        }

        @Override // com.avito.android.orders_aggregation.di.module.b.a
        public final b.a d(OrdersAggregationIntentFactory.GeneralOrdersData generalOrdersData) {
            this.f210210b = generalOrdersData;
            return this;
        }

        @Override // com.avito.android.orders_aggregation.di.module.b.a
        public final b.a e(com.avito.android.orders_aggregation.di.module.c cVar) {
            this.f210213e = cVar;
            return this;
        }
    }

    /* compiled from: DaggerOrdersAggregationComponent.java */
    public static final class c implements com.avito.android.orders_aggregation.di.module.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.tab.b<? extends AbstractC41226a>> f210214A;

        /* renamed from: B, reason: collision with root package name */
        public final u<TabPagerAdapter> f210215B;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.orders_aggregation.di.module.c f210216a;

        /* renamed from: b, reason: collision with root package name */
        public final OrdersAggregationIntentFactory.GeneralOrdersData f210217b;

        /* renamed from: c, reason: collision with root package name */
        public final String f210218c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f210219d;

        /* renamed from: e, reason: collision with root package name */
        public final u<T0> f210220e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC23487e> f210221f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC26944a> f210222g;

        /* renamed from: h, reason: collision with root package name */
        public final u<String> f210223h;

        /* renamed from: i, reason: collision with root package name */
        public final u<String> f210224i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.orders_aggregation.f> f210225j;

        /* renamed from: k, reason: collision with root package name */
        public final u<R0> f210226k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f210227l;

        /* renamed from: m, reason: collision with root package name */
        public final u<B2> f210228m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28373a> f210229n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28481c> f210230o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f210231p;

        /* renamed from: q, reason: collision with root package name */
        public final u<SharedPreferences> f210232q;

        /* renamed from: r, reason: collision with root package name */
        public final u<OrdersAggregationTabShownStatusStorage> f210233r;

        /* renamed from: s, reason: collision with root package name */
        public final l f210234s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.orders_aggregation_core.g> f210235t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC44196b> f210236u;

        /* renamed from: v, reason: collision with root package name */
        public final u<FragmentManager> f210237v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.tab.adapter.j<AbstractC41226a>> f210238w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.orders_aggregation_core.h> f210239x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.tab.b<? extends AbstractC41226a>> f210240y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.beduin.v2.page.n> f210241z;

        /* compiled from: DaggerOrdersAggregationComponent.java */
        /* renamed from: com.avito.android.orders_aggregation.di.module.a$c$a, reason: collision with other inner class name */
        public static final class C6277a implements u<com.avito.android.beduin.v2.page.n> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders_aggregation.di.module.c f210242a;

            public C6277a(com.avito.android.orders_aggregation.di.module.c cVar) {
                this.f210242a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f210242a.Ok();
            }
        }

        /* compiled from: DaggerOrdersAggregationComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders_aggregation.di.module.c f210243a;

            public b(com.avito.android.orders_aggregation.di.module.c cVar) {
                this.f210243a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aP2 = this.f210243a.p2();
                t.c(interfaceC28373aP2);
                return interfaceC28373aP2;
            }
        }

        /* compiled from: DaggerOrdersAggregationComponent.java */
        /* renamed from: com.avito.android.orders_aggregation.di.module.a$c$c, reason: collision with other inner class name */
        public static final class C6278c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders_aggregation.di.module.c f210244a;

            public C6278c(com.avito.android.orders_aggregation.di.module.c cVar) {
                this.f210244a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C4 = this.f210244a.C4();
                t.c(r0C4);
                return r0C4;
            }
        }

        /* compiled from: DaggerOrdersAggregationComponent.java */
        public static final class d implements u<InterfaceC26944a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders_aggregation.di.module.c f210245a;

            public d(com.avito.android.orders_aggregation.di.module.c cVar) {
                this.f210245a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC26944a interfaceC26944aVl = this.f210245a.vl();
                t.c(interfaceC26944aVl);
                return interfaceC26944aVl;
            }
        }

        /* compiled from: DaggerOrdersAggregationComponent.java */
        public static final class e implements u<com.avito.android.orders_aggregation_core.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders_aggregation.di.module.c f210246a;

            public e(com.avito.android.orders_aggregation.di.module.c cVar) {
                this.f210246a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f210246a.tj();
            }
        }

        /* compiled from: DaggerOrdersAggregationComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders_aggregation.di.module.c f210247a;

            public f(com.avito.android.orders_aggregation.di.module.c cVar) {
                this.f210247a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f210247a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerOrdersAggregationComponent.java */
        public static final class g implements u<B2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders_aggregation.di.module.c f210248a;

            public g(com.avito.android.orders_aggregation.di.module.c cVar) {
                this.f210248a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f210248a.D();
            }
        }

        /* compiled from: DaggerOrdersAggregationComponent.java */
        public static final class h implements u<SharedPreferences> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orders_aggregation.di.module.c f210249a;

            public h(com.avito.android.orders_aggregation.di.module.c cVar) {
                this.f210249a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SharedPreferences sharedPreferencesR1 = this.f210249a.R1();
                t.c(sharedPreferencesR1);
                return sharedPreferencesR1;
            }
        }

        public c(C42507a c42507a, com.avito.android.orders_aggregation.di.module.c cVar, Fragment fragment, OrdersAggregationIntentFactory.GeneralOrdersData generalOrdersData, String str, C28478k c28478k, C6276a c6276a) {
            this.f210216a = cVar;
            this.f210217b = generalOrdersData;
            this.f210218c = str;
            dagger.internal.l lVarA = dagger.internal.l.a(fragment);
            this.f210219d = lVarA;
            this.f210220e = dagger.internal.g.d(lVarA);
            this.f210221f = dagger.internal.g.d(this.f210219d);
            this.f210222g = new d(cVar);
            this.f210223h = dagger.internal.g.d(new C42508b(c42507a));
            this.f210224i = dagger.internal.g.d(new C42510d(c42507a));
            A.b bVarA = A.a(2, 0);
            u<String> uVar = this.f210223h;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f210224i);
            this.f210225j = dagger.internal.g.d(new com.avito.android.orders_aggregation.h(bVarA.b(), this.f210222g));
            this.f210226k = new C6278c(cVar);
            this.f210227l = dagger.internal.l.b(generalOrdersData);
            this.f210228m = new g(cVar);
            this.f210229n = new b(cVar);
            this.f210230o = new f(cVar);
            this.f210231p = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f210230o);
            this.f210233r = dagger.internal.g.d(new com.avito.android.orders_aggregation.j(new h(cVar)));
            l lVar = new l(this.f210220e, new s(this.f210227l, dagger.internal.l.b(str), this.f210221f, this.f210225j, this.f210226k, this.f210228m, this.f210229n, this.f210231p, this.f210233r));
            this.f210234s = lVar;
            this.f210235t = dagger.internal.g.d(lVar);
            this.f210236u = dagger.internal.g.d(this.f210234s);
            this.f210237v = dagger.internal.g.d(new i(this.f210219d));
            this.f210238w = dagger.internal.g.d(k.a.f210256a);
            this.f210240y = dagger.internal.g.d(new C42511e(c42507a, new e(cVar)));
            this.f210214A = dagger.internal.g.d(new C42509c(c42507a, new C6277a(cVar)));
            A.b bVarA2 = A.a(2, 0);
            u<com.avito.android.lib.deprecated_design.tab.b<? extends AbstractC41226a>> uVar2 = this.f210240y;
            List<u<T>> list2 = bVarA2.f393937a;
            list2.add(uVar2);
            list2.add(this.f210214A);
            this.f210215B = dagger.internal.g.d(new j(this.f210237v, this.f210238w, bVarA2.b()));
        }

        @Override // n50.InterfaceC44195a
        public final InterfaceC44196b N6() {
            return this.f210236u.get();
        }

        @Override // com.avito.android.orders_aggregation.di.module.b
        public final void pf(OrdersAggregationFragment ordersAggregationFragment) {
            ordersAggregationFragment.f210187t0 = this.f210215B.get();
            ordersAggregationFragment.f210188u0 = this.f210238w.get();
            T0 t02 = this.f210220e.get();
            InterfaceC23487e interfaceC23487e = this.f210221f.get();
            com.avito.android.orders_aggregation.f fVar = this.f210225j.get();
            com.avito.android.orders_aggregation.di.module.c cVar = this.f210216a;
            R0 r0C4 = cVar.C4();
            t.c(r0C4);
            B2 b2D = cVar.D();
            InterfaceC28373a interfaceC28373aP2 = cVar.p2();
            t.c(interfaceC28373aP2);
            r rVar = new r(interfaceC23487e, fVar, r0C4, this.f210217b, b2D, interfaceC28373aP2, this.f210231p.get(), this.f210233r.get(), this.f210218c);
            com.avito.android.orders_aggregation.di.module.g.f210251a.getClass();
            ordersAggregationFragment.f210189v0 = (com.avito.android.orders_aggregation.t) new P0(t02, rVar).a(com.avito.android.orders_aggregation.t.class);
            ordersAggregationFragment.f210190w0 = this.f210231p.get();
            ordersAggregationFragment.f210191x0 = cVar.D();
            ordersAggregationFragment.f210192y0 = this.f210233r.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
