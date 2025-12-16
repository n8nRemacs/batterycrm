package com.avito.android.travel_guest_profile.di;

import Mg0.InterfaceC14487a;
import Y41.l;
import android.app.Activity;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.travel_guest_profile.TravelGuestProfileFragment;
import com.avito.android.travel_guest_profile.di.d;
import com.avito.android.travel_guest_profile.domain.converters.n;
import com.avito.android.travel_guest_profile.domain.converters.r;
import com.avito.android.travel_guest_profile.domain.interactors.p;
import com.avito.android.travel_guest_profile.mvi.k;
import com.avito.android.travel_guest_profile.mvi.m;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerTravelGuestProfileComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class c {

    /* compiled from: DaggerTravelGuestProfileComponent.java */
    public static final class b implements d.a {
        public b() {
        }

        @Override // com.avito.android.travel_guest_profile.di.d.a
        public final d a(e eVar, InterfaceC39417a interfaceC39417a, l lVar, C28478k c28478k, String str, String str2, String str3, ActivityC22955m activityC22955m, Y41.a aVar, l lVar2, l lVar3, Y41.a aVar2, l lVar4, l lVar5) {
            interfaceC39417a.getClass();
            lVar2.getClass();
            aVar2.getClass();
            lVar4.getClass();
            return new C9245c(new f(), eVar, interfaceC39417a, lVar, c28478k, str, str2, str3, activityC22955m, aVar, lVar2, lVar3, aVar2, lVar4, lVar5, null);
        }
    }

    /* compiled from: DaggerTravelGuestProfileComponent.java */
    /* renamed from: com.avito.android.travel_guest_profile.di.c$c, reason: collision with other inner class name */
    public static final class C9245c implements com.avito.android.travel_guest_profile.di.d {

        /* renamed from: A, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301869A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.android.rating_ui.gap.d> f301870B;

        /* renamed from: C, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301871C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.rating_ui.info.d> f301872D;

        /* renamed from: E, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301873E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.rating_ui.info_with_hint.c> f301874F;

        /* renamed from: G, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301875G;

        /* renamed from: H, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301876H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.rating_ui.reviews.review.c> f301877I;

        /* renamed from: J, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301878J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.android.rating_ui.score_with_statistic.e> f301879K;

        /* renamed from: L, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301880L;

        /* renamed from: M, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301881M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.l f301882N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.l f301883O;

        /* renamed from: P, reason: collision with root package name */
        public final u<com.avito.android.rating_ui.sort.d> f301884P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301885Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<com.avito.android.rating_ui.statistic.e> f301886R;

        /* renamed from: S, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301887S;

        /* renamed from: T, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f301888T;

        /* renamed from: U, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f301889U;

        /* renamed from: V, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f301890V;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f301891a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.travel_guest_profile.di.e f301892b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f301893c;

        /* renamed from: d, reason: collision with root package name */
        public final u<LE0.a> f301894d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.travel_guest_profile.domain.interactors.e f301895e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC14487a> f301896f;

        /* renamed from: g, reason: collision with root package name */
        public final p f301897g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f301898h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f301899i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.travel_guest_profile.mvi.d f301900j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28373a> f301901k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f301902l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.travel_guest_profile.mvi.b f301903m;

        /* renamed from: n, reason: collision with root package name */
        public final n f301904n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.travel_guest_profile.domain.converters.l f301905o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.travel_guest_profile.domain.converters.j f301906p;

        /* renamed from: q, reason: collision with root package name */
        public final k f301907q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28481c> f301908r;

        /* renamed from: s, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f301909s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.travel_guest_profile.i f301910t;

        /* renamed from: u, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301911u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.l f301912v;

        /* renamed from: w, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301913w;

        /* renamed from: x, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301914x;

        /* renamed from: y, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f301915y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f301916z;

        /* compiled from: DaggerTravelGuestProfileComponent.java */
        /* renamed from: com.avito.android.travel_guest_profile.di.c$c$a */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_guest_profile.di.e f301917a;

            public a(com.avito.android.travel_guest_profile.di.e eVar) {
                this.f301917a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f301917a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerTravelGuestProfileComponent.java */
        /* renamed from: com.avito.android.travel_guest_profile.di.c$c$b */
        public static final class b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_guest_profile.di.e f301918a;

            public b(com.avito.android.travel_guest_profile.di.e eVar) {
                this.f301918a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f301918a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerTravelGuestProfileComponent.java */
        /* renamed from: com.avito.android.travel_guest_profile.di.c$c$c, reason: collision with other inner class name */
        public static final class C9246c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_guest_profile.di.e f301919a;

            public C9246c(com.avito.android.travel_guest_profile.di.e eVar) {
                this.f301919a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f301919a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerTravelGuestProfileComponent.java */
        /* renamed from: com.avito.android.travel_guest_profile.di.c$c$d */
        public static final class d implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_guest_profile.di.e f301920a;

            public d(com.avito.android.travel_guest_profile.di.e eVar) {
                this.f301920a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarB2 = this.f301920a.B2();
                t.c(aVarB2);
                return aVarB2;
            }
        }

        /* compiled from: DaggerTravelGuestProfileComponent.java */
        /* renamed from: com.avito.android.travel_guest_profile.di.c$c$e */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_guest_profile.di.e f301921a;

            public e(com.avito.android.travel_guest_profile.di.e eVar) {
                this.f301921a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f301921a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTravelGuestProfileComponent.java */
        /* renamed from: com.avito.android.travel_guest_profile.di.c$c$f */
        public static final class f implements u<InterfaceC14487a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_guest_profile.di.e f301922a;

            public f(com.avito.android.travel_guest_profile.di.e eVar) {
                this.f301922a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14487a interfaceC14487aI1 = this.f301922a.I1();
                t.c(interfaceC14487aI1);
                return interfaceC14487aI1;
            }
        }

        /* compiled from: DaggerTravelGuestProfileComponent.java */
        /* renamed from: com.avito.android.travel_guest_profile.di.c$c$g */
        public static final class g implements u<LE0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.travel_guest_profile.di.e f301923a;

            public g(com.avito.android.travel_guest_profile.di.e eVar) {
                this.f301923a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                LE0.a aVarEk = this.f301923a.Ek();
                t.c(aVarEk);
                return aVarEk;
            }
        }

        public C9245c() {
            throw null;
        }

        public C9245c(com.avito.android.travel_guest_profile.di.f fVar, com.avito.android.travel_guest_profile.di.e eVar, cv.b bVar, l lVar, C28478k c28478k, String str, String str2, String str3, Activity activity, Y41.a aVar, l lVar2, l lVar3, Y41.a aVar2, l lVar4, l lVar5, a aVar3) {
            this.f301891a = bVar;
            this.f301892b = eVar;
            this.f301895e = new com.avito.android.travel_guest_profile.domain.interactors.e(new e(eVar), new g(eVar), r.a());
            this.f301897g = new p(new f(eVar));
            this.f301898h = dagger.internal.l.a(str);
            this.f301899i = dagger.internal.l.b(str2);
            dagger.internal.l lVarB = dagger.internal.l.b(str3);
            com.avito.android.travel_guest_profile.domain.interactors.e eVar2 = this.f301895e;
            p pVar = this.f301897g;
            this.f301900j = new com.avito.android.travel_guest_profile.mvi.d(eVar2, pVar, this.f301898h, this.f301899i, lVarB);
            this.f301903m = new com.avito.android.travel_guest_profile.mvi.b(eVar2, pVar, new com.avito.android.travel_guest_profile.domain.interactors.b(new a(eVar), new d(eVar)));
            this.f301904n = new n(com.avito.android.travel_guest_profile.domain.converters.p.a(), com.avito.android.travel_guest_profile.domain.converters.f.a(), com.avito.android.travel_guest_profile.domain.converters.d.a());
            this.f301905o = new com.avito.android.travel_guest_profile.domain.converters.l(com.avito.android.travel_guest_profile.domain.converters.f.a());
            this.f301906p = new com.avito.android.travel_guest_profile.domain.converters.j(this.f301904n, this.f301905o, new com.avito.android.travel_guest_profile.domain.converters.h(com.avito.android.travel_guest_profile.domain.converters.p.a(), com.avito.android.travel_guest_profile.domain.converters.d.a()));
            this.f301907q = new k(new m(com.avito.android.travel_guest_profile.domain.c.a(), com.avito.android.travel_guest_profile.domain.converters.b.a(), this.f301906p));
            this.f301908r = new C9246c(eVar);
            this.f301909s = dagger.internal.g.d(new C30060h5(this.f301908r, dagger.internal.l.a(c28478k)));
            this.f301910t = new com.avito.android.travel_guest_profile.i(new com.avito.android.travel_guest_profile.mvi.g(this.f301900j, this.f301903m, com.avito.android.travel_guest_profile.mvi.i.a(), this.f301907q, this.f301909s));
            this.f301911u = dagger.internal.g.d(new com.avito.android.travel_guest_profile.items.spinner.c(com.avito.android.travel_guest_profile.items.spinner.e.a()));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f301912v = lVarA;
            this.f301913w = dagger.internal.g.d(new com.avito.android.travel_guest_profile.items.profile_header.c(new com.avito.android.travel_guest_profile.items.profile_header.g(lVarA)));
            this.f301914x = dagger.internal.g.d(new com.avito.android.travel_guest_profile.items.extended_plan.c(new com.avito.android.travel_guest_profile.items.extended_plan.f(this.f301912v)));
            this.f301915y = dagger.internal.g.d(new com.avito.android.travel_guest_profile.items.statistics_item.c(com.avito.android.travel_guest_profile.items.statistics_item.e.a()));
            this.f301869A = dagger.internal.g.d(new com.avito.android.travel_guest_profile.items.empty_state_banner.c(new com.avito.android.travel_guest_profile.items.empty_state_banner.g(this.f301912v), new b(eVar)));
            u<com.avito.android.rating_ui.gap.d> uVarD = dagger.internal.g.d(com.avito.android.rating_ui.gap.f.a());
            this.f301870B = uVarD;
            this.f301871C = dagger.internal.g.d(new com.avito.android.rating_ui.gap.b(uVarD));
            u<com.avito.android.rating_ui.info.d> uVarD2 = dagger.internal.g.d(com.avito.android.rating_ui.info.f.a());
            this.f301872D = uVarD2;
            this.f301873E = dagger.internal.g.d(new com.avito.android.rating_ui.info.c(uVarD2));
            u<com.avito.android.rating_ui.info_with_hint.c> uVarD3 = dagger.internal.g.d(new com.avito.android.rating_ui.info_with_hint.f(dagger.internal.l.a(lVar4)));
            this.f301874F = uVarD3;
            this.f301875G = dagger.internal.g.d(new com.avito.android.rating_ui.info_with_hint.b(uVarD3));
            this.f301876H = dagger.internal.g.d(new com.avito.android.rating_ui.loading.b(new com.avito.android.rating_ui.loading.e(dagger.internal.l.a(aVar))));
            this.f301877I = dagger.internal.g.d(new com.avito.android.rating_ui.reviews.review.n(dagger.internal.l.a(lVar5)));
            this.f301878J = dagger.internal.g.d(new com.avito.android.rating_ui.reviews.review.b(dagger.internal.l.a(activity), this.f301877I));
            u<com.avito.android.rating_ui.score_with_statistic.e> uVarD4 = dagger.internal.g.d(com.avito.android.rating_ui.score_with_statistic.g.a());
            this.f301879K = uVarD4;
            this.f301880L = dagger.internal.g.d(new com.avito.android.rating_ui.score_with_statistic.d(uVarD4));
            this.f301881M = dagger.internal.g.d(new com.avito.android.rating_ui.score_with_statistic.b(this.f301879K));
            this.f301882N = dagger.internal.l.a(lVar3);
            this.f301883O = dagger.internal.l.a(lVar2);
            u<com.avito.android.rating_ui.sort.d> uVarD5 = dagger.internal.g.d(new com.avito.android.rating_ui.sort.f(this.f301882N, this.f301883O, dagger.internal.l.a(aVar2)));
            this.f301884P = uVarD5;
            this.f301885Q = dagger.internal.g.d(new com.avito.android.rating_ui.sort.c(uVarD5));
            u<com.avito.android.rating_ui.statistic.e> uVarD6 = dagger.internal.g.d(com.avito.android.rating_ui.statistic.g.a());
            this.f301886R = uVarD6;
            this.f301887S = dagger.internal.g.d(new com.avito.android.rating_ui.statistic.d(uVarD6));
            A.b bVarA = A.a(14, 0);
            u<TV0.b<?, ?>> uVar = this.f301911u;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f301913w);
            list.add(this.f301914x);
            list.add(this.f301915y);
            list.add(this.f301869A);
            list.add(this.f301871C);
            list.add(this.f301873E);
            list.add(this.f301875G);
            list.add(this.f301876H);
            list.add(this.f301878J);
            list.add(this.f301880L);
            list.add(this.f301881M);
            list.add(this.f301885Q);
            list.add(this.f301887S);
            u<com.avito.konveyor.a> uVarD7 = dagger.internal.g.d(new h(fVar, bVarA.b()));
            this.f301888T = uVarD7;
            u<com.avito.konveyor.adapter.a> uVarD8 = dagger.internal.g.d(new com.avito.android.travel_guest_profile.di.g(fVar, uVarD7));
            this.f301889U = uVarD8;
            this.f301890V = dagger.internal.g.d(new i(fVar, uVarD8, this.f301888T));
        }

        @Override // com.avito.android.travel_guest_profile.di.d
        public final void a(TravelGuestProfileFragment travelGuestProfileFragment) {
            travelGuestProfileFragment.f301840n0 = this.f301910t;
            travelGuestProfileFragment.f301842p0 = this.f301909s.get();
            travelGuestProfileFragment.f301843q0 = this.f301890V.get();
            travelGuestProfileFragment.f301844r0 = this.f301888T.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f301891a.u4();
            t.c(aVarU4);
            travelGuestProfileFragment.f301845s0 = aVarU4;
            travelGuestProfileFragment.f301846t0 = this.f301892b.F0();
        }
    }

    public static d.a a() {
        return new b();
    }
}
