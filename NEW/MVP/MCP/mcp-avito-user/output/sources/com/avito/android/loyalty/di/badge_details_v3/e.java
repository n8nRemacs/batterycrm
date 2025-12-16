package com.avito.android.loyalty.di.badge_details_v3;

import bX.InterfaceC25576a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.w;
import com.avito.android.loyalty.di.badge_details_v3.a;
import com.avito.android.loyalty.ui.badge_details_v3.BadgeDetailsV3DialogFragment;
import com.avito.android.loyalty.ui.badge_details_v3.h;
import com.avito.android.loyalty.ui.badge_details_v3.k;
import com.avito.android.loyalty.ui.badge_details_v3.mvi.j;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerBadgeDetailsV3Component.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class e {

    /* compiled from: DaggerBadgeDetailsV3Component.java */
    public static final class b implements com.avito.android.loyalty.di.badge_details_v3.a {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f182994A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f182995B;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.loyalty.di.badge_details_v3.b f182996a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC25576a> f182997b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.loyalty.ui.badge_details_v3.e> f182998c;

        /* renamed from: d, reason: collision with root package name */
        public final l f182999d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f183000e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f183001f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.badge_details_v3.mvi.e f183002g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.badge_details_v3.mvi.c f183003h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f183004i;

        /* renamed from: j, reason: collision with root package name */
        public final j f183005j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.badge_details_v3.mvi.l f183006k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f183007l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f183008m;

        /* renamed from: n, reason: collision with root package name */
        public final k f183009n;

        /* renamed from: o, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f183010o;

        /* renamed from: p, reason: collision with root package name */
        public final l f183011p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.attributed_text.c f183012q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.image.c f183013r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.spacer.c f183014s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.collapse.c f183015t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.loyalty.ui.items.action.d> f183016u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.action.c f183017v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.loyalty.ui.badge_details_v3.items.skeleton.d> f183018w;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.badge_details_v3.items.skeleton.c f183019x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.loyalty.ui.badge_details_v3.items.error.d> f183020y;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.badge_details_v3.items.error.c f183021z;

        /* compiled from: DaggerBadgeDetailsV3Component.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.badge_details_v3.b f183022a;

            public a(com.avito.android.loyalty.di.badge_details_v3.b bVar) {
                this.f183022a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f183022a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerBadgeDetailsV3Component.java */
        /* renamed from: com.avito.android.loyalty.di.badge_details_v3.e$b$b, reason: collision with other inner class name */
        public static final class C5363b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f183023a;

            public C5363b(cv.b bVar) {
                this.f183023a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f183023a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerBadgeDetailsV3Component.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.badge_details_v3.b f183024a;

            public c(com.avito.android.loyalty.di.badge_details_v3.b bVar) {
                this.f183024a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f183024a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerBadgeDetailsV3Component.java */
        public static final class d implements u<InterfaceC25576a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.badge_details_v3.b f183025a;

            public d(com.avito.android.loyalty.di.badge_details_v3.b bVar) {
                this.f183025a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25576a interfaceC25576aY1 = this.f183025a.y1();
                t.c(interfaceC25576aY1);
                return interfaceC25576aY1;
            }
        }

        /* compiled from: DaggerBadgeDetailsV3Component.java */
        /* renamed from: com.avito.android.loyalty.di.badge_details_v3.e$b$e, reason: collision with other inner class name */
        public static final class C5364e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.badge_details_v3.b f183026a;

            public C5364e(com.avito.android.loyalty.di.badge_details_v3.b bVar) {
                this.f183026a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f183026a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.loyalty.di.badge_details_v3.b bVar, cv.b bVar2, com.avito.android.loyalty.ui.items.collapse.d dVar, w wVar, Y41.a aVar, C28478k c28478k, String str, String str2, a aVar2) {
            this.f182996a = bVar;
            this.f182998c = dagger.internal.g.d(new h(new d(bVar)));
            this.f182999d = l.a(str);
            l lVarB = l.b(str2);
            c cVar = new c(bVar);
            a aVar3 = new a(bVar);
            u<com.avito.android.loyalty.ui.badge_details_v3.e> uVar = this.f182998c;
            l lVar = this.f182999d;
            this.f183002g = new com.avito.android.loyalty.ui.badge_details_v3.mvi.e(lVar, lVarB, uVar, cVar, aVar3);
            this.f183003h = new com.avito.android.loyalty.ui.badge_details_v3.mvi.c(lVar, uVar, cVar);
            this.f183005j = new j(new C5363b(bVar2));
            this.f183006k = new com.avito.android.loyalty.ui.badge_details_v3.mvi.l(com.avito.android.loyalty.ui.badge_details_v3.b.a());
            this.f183007l = new C5364e(bVar);
            u<ScreenPerformanceTracker> uVarS = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f183007l);
            this.f183008m = uVarS;
            this.f183009n = new k(new com.avito.android.loyalty.ui.badge_details_v3.mvi.h(this.f183002g, this.f183003h, this.f183005j, this.f183006k, uVarS));
            this.f183010o = B.a(com.avito.android.konveyor_adapter_module.d.a());
            l lVarA = l.a(wVar);
            this.f183011p = lVarA;
            this.f183012q = new com.avito.android.loyalty.ui.items.attributed_text.c(new com.avito.android.loyalty.ui.items.attributed_text.f(lVarA));
            this.f183013r = new com.avito.android.loyalty.ui.items.image.c(com.avito.android.loyalty.ui.items.image.e.a());
            this.f183014s = new com.avito.android.loyalty.ui.items.spacer.c(com.avito.android.loyalty.ui.items.spacer.e.a());
            this.f183015t = new com.avito.android.loyalty.ui.items.collapse.c(new com.avito.android.loyalty.ui.items.collapse.g(l.a(dVar)));
            u<com.avito.android.loyalty.ui.items.action.d> uVarD = dagger.internal.g.d(new com.avito.android.loyalty.ui.items.action.g(this.f183011p));
            this.f183016u = uVarD;
            this.f183017v = new com.avito.android.loyalty.ui.items.action.c(uVarD);
            u<com.avito.android.loyalty.ui.badge_details_v3.items.skeleton.d> uVarD2 = dagger.internal.g.d(com.avito.android.loyalty.ui.badge_details_v3.items.skeleton.f.a());
            this.f183018w = uVarD2;
            this.f183019x = new com.avito.android.loyalty.ui.badge_details_v3.items.skeleton.c(uVarD2);
            u<com.avito.android.loyalty.ui.badge_details_v3.items.error.d> uVarD3 = dagger.internal.g.d(new com.avito.android.loyalty.ui.badge_details_v3.items.error.f(l.a(aVar)));
            this.f183020y = uVarD3;
            this.f183021z = new com.avito.android.loyalty.ui.badge_details_v3.items.error.c(uVarD3);
            A.b bVarA = A.a(7, 1);
            bVarA.f393938b.add(this.f183010o);
            com.avito.android.loyalty.ui.items.attributed_text.c cVar2 = this.f183012q;
            List<u<T>> list = bVarA.f393937a;
            list.add(cVar2);
            list.add(this.f183013r);
            list.add(this.f183014s);
            list.add(this.f183015t);
            list.add(this.f183017v);
            list.add(this.f183019x);
            list.add(this.f183021z);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f182994A = uVarK;
            this.f182995B = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
        }

        @Override // com.avito.android.loyalty.di.badge_details_v3.a
        public final void a(BadgeDetailsV3DialogFragment badgeDetailsV3DialogFragment) {
            badgeDetailsV3DialogFragment.f183266h0 = this.f183009n;
            badgeDetailsV3DialogFragment.f183268j0 = this.f183008m.get();
            com.avito.konveyor.adapter.a aVar = this.f182995B.get();
            com.avito.konveyor.a aVar2 = this.f182994A.get();
            com.avito.android.loyalty.di.badge_details_v3.c.f182993a.getClass();
            badgeDetailsV3DialogFragment.f183269k0 = new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
            R0 r0C = this.f182996a.c();
            t.c(r0C);
            badgeDetailsV3DialogFragment.f183270l0 = r0C;
        }
    }

    /* compiled from: DaggerBadgeDetailsV3Component.java */
    public static final class c implements a.InterfaceC5362a {
        public c() {
        }

        @Override // com.avito.android.loyalty.di.badge_details_v3.a.InterfaceC5362a
        public final com.avito.android.loyalty.di.badge_details_v3.a a(com.avito.android.loyalty.ui.badge_details_v3.c cVar, com.avito.android.cpt.pre_activation.ui.c cVar2, Y41.a aVar, C28478k c28478k, String str, String str2, com.avito.android.loyalty.di.badge_details_v3.b bVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, cVar, cVar2, aVar, c28478k, str, str2, null);
        }
    }

    public static a.InterfaceC5362a a() {
        return new c();
    }
}
