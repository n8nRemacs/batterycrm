package com.avito.android.vas_union.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.util.R0;
import com.avito.android.vas_union.VasUnionV2Fragment;
import com.avito.android.vas_union.di.j;
import cv.InterfaceC39417a;
import sM0.InterfaceC48073a;

/* compiled from: DaggerVasUnionV2Component.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class c {

    /* compiled from: DaggerVasUnionV2Component.java */
    public static final class b implements j.a {
        public b() {
        }

        @Override // com.avito.android.vas_union.di.j.a
        public final j a(n nVar, InterfaceC39417a interfaceC39417a, com.avito.android.analytics.screens.r rVar, PaidServicesResultRepository paidServicesResultRepository, String str, String str2, boolean z12, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4, Y41.l lVar5) {
            interfaceC39417a.getClass();
            return new C9988c(nVar, interfaceC39417a, rVar, paidServicesResultRepository, str, str2, Boolean.valueOf(z12), lVar, lVar2, lVar3, lVar4, lVar5, null);
        }
    }

    /* compiled from: DaggerVasUnionV2Component.java */
    /* renamed from: com.avito.android.vas_union.di.c$c, reason: collision with other inner class name */
    public static final class C9988c implements j {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f323146A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.d> f323147B;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f323148a;

        /* renamed from: b, reason: collision with root package name */
        public final n f323149b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f323150c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC48073a> f323151d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<R0> f323152e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.vas_union.mvi.d f323153f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.vas_union.mvi.b f323154g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.vas_union.mvi.k f323155h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f323156i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<C28478k> f323157j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f323158k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f323159l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.vas_union.j f323160m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.vas_union.ui.items.title.d> f323161n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.vas_union.ui.items.title.b f323162o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.vas_union.ui.items.tabs.d> f323163p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.vas_union.ui.items.tabs.b f323164q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.vas_union.ui.items.vas_performance_chips.d> f323165r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.vas_union.ui.items.vas_performance_chips.b f323166s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.vas_union.ui.items.vas_bundle.f> f323167t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.text.a> f323168u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.vas_union.ui.items.vas_bundle.e f323169v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.vas_union.ui.items.vas_performance_click.d> f323170w;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.vas_union.ui.items.vas_performance_click.c f323171x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.vas_union.ui.items.vas_performance_select.f> f323172y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f323173z;

        /* compiled from: DaggerVasUnionV2Component.java */
        /* renamed from: com.avito.android.vas_union.di.c$c$a */
        public static final class a implements dagger.internal.u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final n f323174a;

            public a(n nVar) {
                this.f323174a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f323174a.e();
                dagger.internal.t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerVasUnionV2Component.java */
        /* renamed from: com.avito.android.vas_union.di.c$c$b */
        public static final class b implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final n f323175a;

            public b(n nVar) {
                this.f323175a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f323175a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVasUnionV2Component.java */
        /* renamed from: com.avito.android.vas_union.di.c$c$c, reason: collision with other inner class name */
        public static final class C9989c implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final n f323176a;

            public C9989c(n nVar) {
                this.f323176a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f323176a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerVasUnionV2Component.java */
        /* renamed from: com.avito.android.vas_union.di.c$c$d */
        public static final class d implements dagger.internal.u<InterfaceC48073a> {

            /* renamed from: a, reason: collision with root package name */
            public final n f323177a;

            public d(n nVar) {
                this.f323177a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48073a interfaceC48073aD9 = this.f323177a.d9();
                dagger.internal.t.c(interfaceC48073aD9);
                return interfaceC48073aD9;
            }
        }

        public C9988c() {
            throw null;
        }

        public C9988c(n nVar, cv.b bVar, com.avito.android.analytics.screens.r rVar, PaidServicesResultRepository paidServicesResultRepository, String str, String str2, Boolean bool, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4, Y41.l lVar5, a aVar) {
            this.f323148a = bVar;
            this.f323149b = nVar;
            this.f323150c = dagger.internal.l.a(str);
            com.avito.android.vas_union.domain.b bVar2 = new com.avito.android.vas_union.domain.b(this.f323150c, dagger.internal.l.a(str2), new d(nVar), new b(nVar));
            this.f323153f = new com.avito.android.vas_union.mvi.d(bVar2);
            this.f323154g = new com.avito.android.vas_union.mvi.b(bVar2);
            this.f323155h = new com.avito.android.vas_union.mvi.k(com.avito.android.vas_union.data.c.a());
            this.f323156i = new C9989c(nVar);
            dagger.internal.u<C28478k> uVarD = dagger.internal.g.d(new u(dagger.internal.l.a(rVar)));
            this.f323157j = uVarD;
            this.f323158k = com.avito.android.advert.item.delivery_suggests.l.i(this.f323156i, uVarD);
            this.f323159l = dagger.internal.l.a(bool);
            this.f323160m = new com.avito.android.vas_union.j(new com.avito.android.vas_union.mvi.g(this.f323153f, this.f323154g, com.avito.android.vas_union.mvi.i.a(), this.f323155h, this.f323158k, this.f323159l));
            dagger.internal.u<com.avito.android.vas_union.ui.items.title.d> uVarD2 = dagger.internal.g.d(com.avito.android.vas_union.ui.items.title.f.a());
            this.f323161n = uVarD2;
            this.f323162o = new com.avito.android.vas_union.ui.items.title.b(uVarD2);
            dagger.internal.u<com.avito.android.vas_union.ui.items.tabs.d> uVarD3 = dagger.internal.g.d(new com.avito.android.vas_union.ui.items.tabs.g(dagger.internal.l.a(lVar2)));
            this.f323163p = uVarD3;
            this.f323164q = new com.avito.android.vas_union.ui.items.tabs.b(uVarD3);
            dagger.internal.u<com.avito.android.vas_union.ui.items.vas_performance_chips.d> uVarD4 = dagger.internal.g.d(new com.avito.android.vas_union.ui.items.vas_performance_chips.g(dagger.internal.l.a(lVar3)));
            this.f323165r = uVarD4;
            this.f323166s = new com.avito.android.vas_union.ui.items.vas_performance_chips.b(uVarD4);
            dagger.internal.u<com.avito.android.vas_union.ui.items.vas_bundle.f> uVarD5 = dagger.internal.g.d(new com.avito.android.vas_union.ui.items.vas_bundle.i(dagger.internal.l.a(lVar5)));
            this.f323167t = uVarD5;
            a aVar2 = new a(nVar);
            this.f323168u = aVar2;
            this.f323169v = new com.avito.android.vas_union.ui.items.vas_bundle.e(uVarD5, aVar2);
            dagger.internal.u<com.avito.android.vas_union.ui.items.vas_performance_click.d> uVarD6 = dagger.internal.g.d(new com.avito.android.vas_union.ui.items.vas_performance_click.g(dagger.internal.l.a(lVar)));
            this.f323170w = uVarD6;
            this.f323171x = new com.avito.android.vas_union.ui.items.vas_performance_click.c(uVarD6, this.f323168u);
            dagger.internal.u<com.avito.android.vas_union.ui.items.vas_performance_select.f> uVarD7 = dagger.internal.g.d(new com.avito.android.vas_union.ui.items.vas_performance_select.i(dagger.internal.l.a(lVar4)));
            this.f323172y = uVarD7;
            dagger.internal.u<com.avito.konveyor.a> uVarD8 = dagger.internal.g.d(new s(this.f323162o, this.f323164q, this.f323166s, this.f323169v, this.f323171x, new com.avito.android.vas_union.ui.items.vas_performance_select.e(uVarD7, this.f323168u)));
            this.f323173z = uVarD8;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD9 = dagger.internal.g.d(new r(uVarD8));
            this.f323146A = uVarD9;
            this.f323147B = dagger.internal.g.d(new t(uVarD9, this.f323173z));
        }

        @Override // com.avito.android.vas_union.di.j
        public final void a(VasUnionV2Fragment vasUnionV2Fragment) {
            vasUnionV2Fragment.f323088n0 = this.f323160m;
            vasUnionV2Fragment.f323090p0 = this.f323158k.get();
            vasUnionV2Fragment.f323091q0 = this.f323147B.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f323148a.u4();
            dagger.internal.t.c(aVarU4);
            vasUnionV2Fragment.f323092r0 = aVarU4;
            n nVar = this.f323149b;
            InterfaceC28373a interfaceC28373aA = nVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            vasUnionV2Fragment.f323093s0 = interfaceC28373aA;
            com.avito.android.util.text.a aVarE = nVar.e();
            dagger.internal.t.c(aVarE);
            vasUnionV2Fragment.f323094t0 = aVarE;
        }
    }

    public static j.a a() {
        return new b();
    }
}
