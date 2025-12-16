package com.avito.android.vas_performance.screens.visual_v2.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import com.avito.android.vas_performance.screens.visual_v2.VisualVasV2Fragment;
import com.avito.android.vas_performance.screens.visual_v2.di.e;
import com.avito.android.vas_performance.screens.visual_v2.mvi.p;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import eL0.InterfaceC40020a;
import wL0.InterfaceC49533a;
import zL0.InterfaceC50482a;

/* compiled from: DaggerVisualVasV2Component.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class c {

    /* compiled from: DaggerVisualVasV2Component.java */
    public static final class b implements e.a {
        public b() {
        }

        @Override // com.avito.android.vas_performance.screens.visual_v2.di.e.a
        public final e a(h hVar, InterfaceC39417a interfaceC39417a, r rVar, long j12, String str, boolean z12) {
            interfaceC39417a.getClass();
            return new C9946c(new k(), hVar, interfaceC39417a, rVar, Long.valueOf(j12), str, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerVisualVasV2Component.java */
    /* renamed from: com.avito.android.vas_performance.screens.visual_v2.di.c$c, reason: collision with other inner class name */
    public static final class C9946c implements com.avito.android.vas_performance.screens.visual_v2.di.e {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f321182a;

        /* renamed from: b, reason: collision with root package name */
        public final h f321183b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f321184c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC49533a> f321185d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f321186e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.visual_v2.mvi.g f321187f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC50482a> f321188g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC40020a> f321189h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28373a> f321190i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.visual_v2.mvi.e f321191j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f321192k;

        /* renamed from: l, reason: collision with root package name */
        public final p f321193l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f321194m;

        /* renamed from: n, reason: collision with root package name */
        public final u<C28478k> f321195n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f321196o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.visual_v2.i f321197p;

        /* compiled from: DaggerVisualVasV2Component.java */
        /* renamed from: com.avito.android.vas_performance.screens.visual_v2.di.c$c$a */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final h f321198a;

            public a(h hVar) {
                this.f321198a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f321198a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerVisualVasV2Component.java */
        /* renamed from: com.avito.android.vas_performance.screens.visual_v2.di.c$c$b */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final h f321199a;

            public b(h hVar) {
                this.f321199a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f321199a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVisualVasV2Component.java */
        /* renamed from: com.avito.android.vas_performance.screens.visual_v2.di.c$c$c, reason: collision with other inner class name */
        public static final class C9947c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final h f321200a;

            public C9947c(h hVar) {
                this.f321200a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f321200a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerVisualVasV2Component.java */
        /* renamed from: com.avito.android.vas_performance.screens.visual_v2.di.c$c$d */
        public static final class d implements u<InterfaceC40020a> {

            /* renamed from: a, reason: collision with root package name */
            public final h f321201a;

            public d(h hVar) {
                this.f321201a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f321201a.s7();
            }
        }

        /* compiled from: DaggerVisualVasV2Component.java */
        /* renamed from: com.avito.android.vas_performance.screens.visual_v2.di.c$c$e */
        public static final class e implements u<InterfaceC50482a> {

            /* renamed from: a, reason: collision with root package name */
            public final h f321202a;

            public e(h hVar) {
                this.f321202a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50482a interfaceC50482aO0 = this.f321202a.o0();
                t.c(interfaceC50482aO0);
                return interfaceC50482aO0;
            }
        }

        /* compiled from: DaggerVisualVasV2Component.java */
        /* renamed from: com.avito.android.vas_performance.screens.visual_v2.di.c$c$f */
        public static final class f implements u<InterfaceC49533a> {

            /* renamed from: a, reason: collision with root package name */
            public final h f321203a;

            public f(h hVar) {
                this.f321203a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49533a interfaceC49533aG8 = this.f321203a.G8();
                t.c(interfaceC49533aG8);
                return interfaceC49533aG8;
            }
        }

        public C9946c(k kVar, h hVar, cv.b bVar, r rVar, Long l12, String str, Boolean bool, a aVar) {
            this.f321182a = bVar;
            this.f321183b = hVar;
            this.f321184c = dagger.internal.l.a(l12);
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            f fVar = new f(hVar);
            b bVar2 = new b(hVar);
            com.avito.android.vas_performance.screens.visual_v2.domain.d dVar = new com.avito.android.vas_performance.screens.visual_v2.domain.d(fVar, bVar2);
            dagger.internal.l lVar = this.f321184c;
            this.f321187f = new com.avito.android.vas_performance.screens.visual_v2.mvi.g(lVar, lVarA, dVar);
            this.f321191j = new com.avito.android.vas_performance.screens.visual_v2.mvi.e(lVar, lVarA, new com.avito.android.vas_performance.screens.visual_v2.domain.b(new e(hVar), bVar2), dVar, new com.avito.android.vas_performance.screens.visual_v2.domain.f(bVar2, new d(hVar)), new a(hVar));
            dagger.internal.l lVarA2 = dagger.internal.l.a(bool);
            this.f321192k = lVarA2;
            this.f321193l = new p(lVarA2);
            this.f321194m = new C9947c(hVar);
            u<C28478k> uVarD = dagger.internal.g.d(new l(kVar, dagger.internal.l.a(rVar)));
            this.f321195n = uVarD;
            this.f321196o = com.avito.android.advert.item.delivery_suggests.l.i(this.f321194m, uVarD);
            this.f321197p = new com.avito.android.vas_performance.screens.visual_v2.i(new com.avito.android.vas_performance.screens.visual_v2.mvi.j(this.f321187f, this.f321191j, com.avito.android.vas_performance.screens.visual_v2.mvi.l.a(), this.f321193l, this.f321196o, this.f321192k));
        }

        @Override // com.avito.android.vas_performance.screens.visual_v2.di.e
        public final void a(VisualVasV2Fragment visualVasV2Fragment) {
            visualVasV2Fragment.f321159n0 = this.f321197p;
            visualVasV2Fragment.f321161p0 = this.f321196o.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f321182a.u4();
            t.c(aVarU4);
            visualVasV2Fragment.f321162q0 = aVarU4;
            InterfaceC28373a interfaceC28373aA = this.f321183b.a();
            t.c(interfaceC28373aA);
            visualVasV2Fragment.f321163r0 = interfaceC28373aA;
        }
    }

    public static e.a a() {
        return new b();
    }
}
