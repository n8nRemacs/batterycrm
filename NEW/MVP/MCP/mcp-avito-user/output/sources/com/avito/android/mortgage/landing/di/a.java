package com.avito.android.mortgage.landing.di;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.landing.LandingFragment;
import com.avito.android.mortgage.landing.analytics.C32642g;
import com.avito.android.mortgage.landing.analytics.InterfaceC32638c;
import com.avito.android.mortgage.landing.di.i;
import com.avito.android.mortgage.landing.model.LandingArguments;
import com.avito.android.mortgage.landing.mvi.q;
import com.avito.android.mortgage.landing.r;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import i00.InterfaceC41203a;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import q20.InterfaceC47188b;
import u00.C48755c;
import u00.InterfaceC48753a;

/* compiled from: DaggerLandingComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerLandingComponent.java */
    public static final class b implements i.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.landing.di.i.a
        public final i a(o oVar, j jVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, LandingArguments landingArguments, Kundle kundle, Bundle bundle, Y41.l lVar, Y41.l lVar2) {
            interfaceC39417a.getClass();
            return new c(oVar, jVar, interfaceC39417a, c28478k, landingArguments, kundle, bundle, lVar, lVar2, null);
        }
    }

    /* compiled from: DaggerLandingComponent.java */
    public static final class c implements i {

        /* renamed from: A, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199549A;

        /* renamed from: B, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199550B;

        /* renamed from: C, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199551C;

        /* renamed from: D, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199552D;

        /* renamed from: E, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199553E;

        /* renamed from: F, reason: collision with root package name */
        public final com.avito.android.mortgage.landing.list.items.steps.c f199554F;

        /* renamed from: G, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199555G;

        /* renamed from: H, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199556H;

        /* renamed from: I, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199557I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f199558J;

        /* renamed from: K, reason: collision with root package name */
        public final u<RecyclerView.l> f199559K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f199560L;

        /* renamed from: M, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f199561M;

        /* renamed from: N, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f199562N;

        /* renamed from: O, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f199563O;

        /* renamed from: P, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f199564P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f199565Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.a> f199566R;

        /* renamed from: S, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f199567S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.l f199568T;

        /* renamed from: U, reason: collision with root package name */
        public final u<WV0.a> f199569U;

        /* renamed from: V, reason: collision with root package name */
        public final u<WV0.a> f199570V;

        /* renamed from: W, reason: collision with root package name */
        public final u<com.avito.konveyor.item_visibility_tracker.b> f199571W;

        /* renamed from: a, reason: collision with root package name */
        public final j f199572a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f199573b;

        /* renamed from: c, reason: collision with root package name */
        public final u<IZ.a> f199574c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC41203a> f199575d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f199576e;

        /* renamed from: f, reason: collision with root package name */
        public final u<G> f199577f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.mortgage.landing.mvi.domain.c f199578g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f199579h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.mortgage.landing.mvi.j f199580i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.mortgage.landing.mvi.h f199581j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.mortgage.landing.mvi.builder.i f199582k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28373a> f199583l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC32638c> f199584m;

        /* renamed from: n, reason: collision with root package name */
        public final q f199585n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28481c> f199586o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f199587p;

        /* renamed from: q, reason: collision with root package name */
        public final r f199588q;

        /* renamed from: r, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f199589r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.l f199590s;

        /* renamed from: t, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199591t;

        /* renamed from: u, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199592u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC48753a> f199593v;

        /* renamed from: w, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199594w;

        /* renamed from: x, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199595x;

        /* renamed from: y, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199596y;

        /* renamed from: z, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199597z;

        /* compiled from: DaggerLandingComponent.java */
        /* renamed from: com.avito.android.mortgage.landing.di.a$c$a, reason: collision with other inner class name */
        public static final class C5893a implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final j f199598a;

            public C5893a(j jVar) {
                this.f199598a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                G gW2 = this.f199598a.w();
                t.c(gW2);
                return gW2;
            }
        }

        /* compiled from: DaggerLandingComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f199599a;

            public b(o oVar) {
                this.f199599a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f199599a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerLandingComponent.java */
        /* renamed from: com.avito.android.mortgage.landing.di.a$c$c, reason: collision with other inner class name */
        public static final class C5894c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final o f199600a;

            public C5894c(o oVar) {
                this.f199600a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f199600a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerLandingComponent.java */
        public static final class d implements u<IZ.a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f199601a;

            public d(o oVar) {
                this.f199601a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IZ.a aVarLc = this.f199601a.lc();
                t.c(aVarLc);
                return aVarLc;
            }
        }

        /* compiled from: DaggerLandingComponent.java */
        public static final class e implements u<InterfaceC41203a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f199602a;

            public e(o oVar) {
                this.f199602a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41203a interfaceC41203aTb = this.f199602a.Tb();
                t.c(interfaceC41203aTb);
                return interfaceC41203aTb;
            }
        }

        /* compiled from: DaggerLandingComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f199603a;

            public f(o oVar) {
                this.f199603a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f199603a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(o oVar, j jVar, cv.b bVar, C28478k c28478k, LandingArguments landingArguments, Kundle kundle, Bundle bundle, Y41.l lVar, Y41.l lVar2, C5892a c5892a) {
            this.f199572a = jVar;
            this.f199573b = bVar;
            d dVar = new d(oVar);
            e eVar = new e(oVar);
            C5894c c5894c = new C5894c(oVar);
            this.f199576e = c5894c;
            this.f199578g = new com.avito.android.mortgage.landing.mvi.domain.c(dVar, new com.avito.android.mortgage.deeplink.domain.h(eVar, c5894c), new C5893a(jVar), com.avito.android.mortgage.util.e.a(), this.f199576e);
            dagger.internal.l lVarA = dagger.internal.l.a(landingArguments);
            this.f199579h = lVarA;
            com.avito.android.mortgage.landing.mvi.domain.c cVar = this.f199578g;
            this.f199580i = new com.avito.android.mortgage.landing.mvi.j(cVar, lVarA);
            this.f199581j = new com.avito.android.mortgage.landing.mvi.h(cVar);
            this.f199582k = new com.avito.android.mortgage.landing.mvi.builder.i(com.avito.android.mortgage.landing.mvi.builder.f.a());
            b bVar2 = new b(oVar);
            this.f199583l = bVar2;
            this.f199584m = dagger.internal.g.d(new C32642g(bVar2));
            this.f199585n = new q(this.f199582k, com.avito.android.mortgage.landing.mvi.builder.d.a(), this.f199584m);
            this.f199586o = new f(oVar);
            this.f199587p = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f199586o);
            this.f199588q = new r(new com.avito.android.mortgage.landing.mvi.m(this.f199580i, this.f199581j, com.avito.android.mortgage.landing.mvi.o.a(), this.f199585n, this.f199587p));
            this.f199589r = B.a(com.avito.android.konveyor_adapter_module.d.a());
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar2);
            this.f199590s = lVarA2;
            this.f199591t = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.input.b(new com.avito.android.mortgage.landing.list.items.input.i(lVarA2)));
            this.f199592u = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.chips.b(new com.avito.android.mortgage.landing.list.items.chips.e(this.f199590s)));
            u<InterfaceC48753a> uVarD = dagger.internal.g.d(new C48755c(dagger.internal.l.b(kundle)));
            this.f199593v = uVarD;
            this.f199594w = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.programs.b(new com.avito.android.mortgage.landing.list.items.programs.i(this.f199590s, uVarD)));
            this.f199595x = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.select.b(new com.avito.android.mortgage.landing.list.items.select.e(this.f199590s)));
            this.f199596y = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.usp_manager_banner.b(new com.avito.android.mortgage.landing.list.items.usp_manager_banner.j(this.f199590s)));
            this.f199597z = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.title.b(com.avito.android.mortgage.landing.list.items.title.d.a()));
            this.f199549A = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.subtitle.b(com.avito.android.mortgage.landing.list.items.subtitle.d.a()));
            this.f199550B = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.faq_title.b(com.avito.android.mortgage.landing.list.items.faq_title.d.a()));
            this.f199551C = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.expandable_block.b(new com.avito.android.mortgage.landing.list.items.expandable_block.e(this.f199590s)));
            this.f199552D = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.offers.d(new com.avito.android.mortgage.landing.list.items.offers.j(this.f199590s, dagger.internal.l.a(lVar), this.f199593v)));
            this.f199553E = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.action_banner.b(new com.avito.android.mortgage.landing.list.items.action_banner.e(this.f199590s)));
            com.avito.android.mortgage.landing.list.items.steps.c cVar2 = new com.avito.android.mortgage.landing.list.items.steps.c(this.f199590s);
            this.f199554F = cVar2;
            this.f199555G = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.steps.g(cVar2));
            this.f199556H = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.steps.with_background.c(this.f199554F));
            this.f199557I = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.steps_title.b(com.avito.android.mortgage.landing.list.items.steps_title.d.a()));
            A.b bVarA = A.a(14, 1);
            bVarA.f393938b.add(this.f199589r);
            u<TV0.b<?, ?>> uVar = this.f199591t;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f199592u);
            list.add(this.f199594w);
            list.add(this.f199595x);
            list.add(this.f199596y);
            list.add(this.f199597z);
            list.add(this.f199549A);
            list.add(this.f199550B);
            list.add(this.f199551C);
            list.add(this.f199552D);
            list.add(this.f199553E);
            list.add(this.f199555G);
            list.add(this.f199556H);
            list.add(this.f199557I);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f199558J = uVarK;
            this.f199559K = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.decoration.b(uVarK));
            this.f199560L = com.avito.android.advert.item.delivery_suggests.l.h(this.f199558J);
            this.f199561M = dagger.internal.g.d(com.avito.android.mortgage.landing.list.items.input.payload.c.a());
            this.f199562N = dagger.internal.g.d(com.avito.android.mortgage.landing.list.items.chips.payload.c.a());
            this.f199563O = dagger.internal.g.d(com.avito.android.mortgage.landing.list.items.expandable_block.payload.c.a());
            this.f199564P = dagger.internal.g.d(com.avito.android.mortgage.landing.list.items.offers.payload.c.a());
            this.f199565Q = dagger.internal.g.d(com.avito.android.mortgage.landing.list.items.select.payload.c.a());
            this.f199566R = dagger.internal.g.d(com.avito.android.mortgage.landing.list.items.programs.payload.c.a());
            A.b bVarA2 = A.a(6, 0);
            u<com.avito.android.recycler.data_aware.a> uVar2 = this.f199561M;
            List<u<T>> list2 = bVarA2.f393937a;
            list2.add(uVar2);
            list2.add(this.f199562N);
            list2.add(this.f199563O);
            list2.add(this.f199564P);
            list2.add(this.f199565Q);
            list2.add(this.f199566R);
            this.f199567S = dagger.internal.g.d(new m(this.f199560L, this.f199558J, new v00.b(bVarA2.b())));
            this.f199568T = dagger.internal.l.b(bundle);
            this.f199569U = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.action_banner.i(this.f199583l));
            this.f199570V = dagger.internal.g.d(new com.avito.android.mortgage.landing.list.items.expandable_block.j(this.f199579h, this.f199583l));
            A.b bVarA3 = A.a(2, 0);
            u<WV0.a> uVar3 = this.f199569U;
            List<u<T>> list3 = bVarA3.f393937a;
            list3.add(uVar3);
            list3.add(this.f199570V);
            this.f199571W = dagger.internal.g.d(new n(this.f199568T, bVarA3.b()));
        }

        @Override // com.avito.android.mortgage.landing.di.i
        public final void a(LandingFragment landingFragment) {
            landingFragment.f199476n0 = this.f199588q;
            j jVar = this.f199572a;
            InterfaceC47188b interfaceC47188bE4 = jVar.e4();
            t.c(interfaceC47188bE4);
            landingFragment.f199478p0 = interfaceC47188bE4;
            landingFragment.f199479q0 = this.f199587p.get();
            landingFragment.f199480r0 = Collections.singleton(this.f199559K.get());
            landingFragment.f199481s0 = this.f199567S.get();
            com.avito.android.util.text.a aVarE = jVar.e();
            t.c(aVarE);
            landingFragment.f199482t0 = aVarE;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f199573b.u4();
            t.c(aVarU4);
            landingFragment.f199483u0 = aVarU4;
            landingFragment.f199484v0 = this.f199593v.get();
            landingFragment.f199485w0 = this.f199571W.get();
            landingFragment.f199486x0 = jVar.H9();
        }
    }

    public static i.a a() {
        return new b();
    }
}
