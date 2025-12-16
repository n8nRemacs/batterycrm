package com.avito.android.orderBeduinV2.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.C31142p0;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31145r0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.di.C31153v0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.order.feature.di.module.h;
import com.avito.android.order.feature.di.module.i;
import com.avito.android.orderBeduinV2.OrderFragment;
import com.avito.android.orderBeduinV2.di.b;
import com.avito.android.orderBeduinV2.mvi.o;
import com.avito.android.orderBeduinV2.mvi.r;
import com.avito.android.orderBeduinV2.mvi.v;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;

/* compiled from: DaggerOrderComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerOrderComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.orderBeduinV2.di.b.a
        public final com.avito.android.orderBeduinV2.di.b a(String str, C28478k c28478k, com.avito.android.orderBeduinV2.di.c cVar, C31138n0 c31138n0, OrderScreenSegment orderScreenSegment) {
            str.getClass();
            orderScreenSegment.getClass();
            return new c(new h(), c31138n0, cVar, str, c28478k, orderScreenSegment, null);
        }
    }

    /* compiled from: DaggerOrderComponent.java */
    public static final class c implements com.avito.android.orderBeduinV2.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<N40.a> f209803a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f209804b;

        /* renamed from: c, reason: collision with root package name */
        public final u<dD.b> f209805c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.order.feature.data.e f209806d;

        /* renamed from: e, reason: collision with root package name */
        public final l f209807e;

        /* renamed from: f, reason: collision with root package name */
        public final u<W40.b> f209808f;

        /* renamed from: g, reason: collision with root package name */
        public final o f209809g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.clientEventBus.a> f209810h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.orderBeduinV2.mvi.l f209811i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f209812j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f209813k;

        /* renamed from: l, reason: collision with root package name */
        public final r f209814l;

        /* renamed from: m, reason: collision with root package name */
        public final u<n.a> f209815m;

        /* renamed from: n, reason: collision with root package name */
        public final u<B> f209816n;

        /* renamed from: o, reason: collision with root package name */
        public final u<Set<FV0.h>> f209817o;

        /* renamed from: p, reason: collision with root package name */
        public final C31144q0 f209818p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.orderBeduinV2.e f209819q;

        /* compiled from: DaggerOrderComponent.java */
        /* renamed from: com.avito.android.orderBeduinV2.di.a$c$a, reason: collision with other inner class name */
        public static final class C6259a implements u<com.avito.android.clientEventBus.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orderBeduinV2.di.c f209820a;

            public C6259a(com.avito.android.orderBeduinV2.di.c cVar) {
                this.f209820a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.clientEventBus.a aVarH0 = this.f209820a.h0();
                t.c(aVarH0);
                return aVarH0;
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orderBeduinV2.di.c f209821a;

            public b(com.avito.android.orderBeduinV2.di.c cVar) {
                this.f209821a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f209821a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        /* renamed from: com.avito.android.orderBeduinV2.di.a$c$c, reason: collision with other inner class name */
        public static final class C6260c implements u<N40.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orderBeduinV2.di.c f209822a;

            public C6260c(com.avito.android.orderBeduinV2.di.c cVar) {
                this.f209822a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                N40.a aVarO4 = this.f209822a.O4();
                t.c(aVarO4);
                return aVarO4;
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        public static final class d implements u<dD.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orderBeduinV2.di.c f209823a;

            public d(com.avito.android.orderBeduinV2.di.c cVar) {
                this.f209823a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f209823a.l6();
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        public static final class e implements u<W40.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orderBeduinV2.di.c f209824a;

            public e(com.avito.android.orderBeduinV2.di.c cVar) {
                this.f209824a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                W40.b bVarW2 = this.f209824a.W2();
                t.c(bVarW2);
                return bVarW2;
            }
        }

        /* compiled from: DaggerOrderComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.orderBeduinV2.di.c f209825a;

            public f(com.avito.android.orderBeduinV2.di.c cVar) {
                this.f209825a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f209825a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(h hVar, C31138n0 c31138n0, com.avito.android.orderBeduinV2.di.c cVar, String str, C28478k c28478k, OrderScreenSegment orderScreenSegment, C6258a c6258a) {
            C6260c c6260c = new C6260c(cVar);
            b bVar = new b(cVar);
            this.f209804b = bVar;
            d dVar = new d(cVar);
            this.f209805c = dVar;
            this.f209806d = new com.avito.android.order.feature.data.e(c6260c, bVar, dVar);
            this.f209807e = l.a(str);
            l lVarA = l.a(orderScreenSegment);
            com.avito.android.order.feature.data.e eVar = this.f209806d;
            RK0.c cVar2 = RK0.c.f14341a;
            l lVar = this.f209807e;
            com.avito.android.orderBeduinV2.mvi.domain.b bVar2 = new com.avito.android.orderBeduinV2.mvi.domain.b(eVar, cVar2, lVar, lVarA);
            this.f209809g = new o(bVar2, new e(cVar));
            this.f209811i = new com.avito.android.orderBeduinV2.mvi.l(bVar2, eVar, lVar, new C6259a(cVar), this.f209805c);
            this.f209812j = new f(cVar);
            this.f209813k = g.d(new i(hVar, this.f209812j, l.a(c28478k)));
            this.f209814l = new r(this.f209809g, this.f209811i, com.avito.android.orderBeduinV2.mvi.t.a(), v.a(), this.f209813k);
            this.f209815m = dagger.internal.B.a(C31142p0.a(c31138n0));
            this.f209816n = dagger.internal.B.a(C31145r0.a(c31138n0));
            this.f209817o = dagger.internal.B.a(C31153v0.a(c31138n0));
            this.f209818p = C31144q0.a(c31138n0);
            this.f209819q = new com.avito.android.orderBeduinV2.e(this.f209814l, this.f209815m, this.f209816n, this.f209817o, this.f209818p, this.f209804b, C31151u0.a(c31138n0), this.f209805c);
        }

        @Override // com.avito.android.orderBeduinV2.di.b
        public final void a(OrderFragment orderFragment) {
            orderFragment.f209731t0 = this.f209819q;
        }
    }

    public static b.a a() {
        return new b();
    }
}
