package com.avito.android.mortgage.person_form.di;

import Y41.l;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.person_form.MortgagePersonFormFragment;
import com.avito.android.mortgage.person_form.di.c;
import com.avito.android.mortgage.person_form.di.i;
import com.avito.android.mortgage.person_form.model.PersonFormArguments;
import com.avito.android.mortgage.person_form.mvi.C32666s;
import com.avito.android.mortgage.person_form.mvi.J;
import com.avito.android.mortgage.person_form.mvi.L;
import com.avito.android.mortgage.person_form.mvi.N;
import com.avito.android.mortgage.person_form.mvi.S;
import com.avito.android.mortgage.person_form.mvi.domain.m;
import com.avito.android.mortgage.person_form.mvi.domain.n;
import com.avito.android.mortgage.person_form.mvi.domain.q;
import com.avito.android.mortgage.person_form.mvi.w;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerPersonFormComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPersonFormComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.person_form.di.c.a
        public final com.avito.android.mortgage.person_form.di.c a(o oVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, l lVar, PersonFormArguments personFormArguments, Bundle bundle, String str) {
            interfaceC39417a.getClass();
            str.getClass();
            return new c(oVar, interfaceC39417a, c28478k, lVar, personFormArguments, bundle, str, null);
        }
    }

    /* compiled from: DaggerPersonFormComponent.java */
    public static final class c implements com.avito.android.mortgage.person_form.di.c {

        /* renamed from: A, reason: collision with root package name */
        public final u<InterfaceC28373a> f200501A;

        /* renamed from: B, reason: collision with root package name */
        public final com.avito.android.mortgage.person_form.list.items.action_banner.i f200502B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.konveyor.item_visibility_tracker.b> f200503C;

        /* renamed from: D, reason: collision with root package name */
        public final u<InterfaceC28481c> f200504D;

        /* renamed from: E, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f200505E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.mortgage.person_form.mvi.mapper.a> f200506F;

        /* renamed from: G, reason: collision with root package name */
        public final u<D00.a> f200507G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.android.mortgage.person_form.analytics.c> f200508H;

        /* renamed from: I, reason: collision with root package name */
        public final S f200509I;

        /* renamed from: J, reason: collision with root package name */
        public final u<IZ.a> f200510J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.android.mortgage.person_form.mvi.domain.formatters.a> f200511K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.android.mortgage.person_form.mvi.domain.formatters.d> f200512L;

        /* renamed from: M, reason: collision with root package name */
        public final u<com.avito.android.mortgage.person_form.mvi.domain.a> f200513M;

        /* renamed from: N, reason: collision with root package name */
        public final u<R0> f200514N;

        /* renamed from: O, reason: collision with root package name */
        public final u<com.avito.android.mortgage.person_form.mvi.domain.e> f200515O;

        /* renamed from: P, reason: collision with root package name */
        public final u<com.avito.android.mortgage.person_form.mvi.domain.validators.c> f200516P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<com.avito.android.mortgage.domain.check_access.b> f200517Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<com.avito.android.mortgage.person_form.mvi.domain.j> f200518R;

        /* renamed from: S, reason: collision with root package name */
        public final u<n> f200519S;

        /* renamed from: T, reason: collision with root package name */
        public final com.avito.android.mortgage.person_form.h f200520T;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f200521a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f200522b;

        /* renamed from: c, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200523c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f200524d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200525e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200526f;

        /* renamed from: g, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200527g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200528h;

        /* renamed from: i, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200529i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200530j;

        /* renamed from: k, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200531k;

        /* renamed from: l, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200532l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.mortgage.person_form.list.items.input.f f200533m;

        /* renamed from: n, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200534n;

        /* renamed from: o, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200535o;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200536p;

        /* renamed from: q, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200537q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.mortgage.person_form.list.items.select.g f200538r;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200539s;

        /* renamed from: t, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f200540t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f200541u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f200542v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f200543w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.mortgage.util.f> f200544x;

        /* renamed from: y, reason: collision with root package name */
        public final u<GridLayoutManager.c> f200545y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.l f200546z;

        /* compiled from: DaggerPersonFormComponent.java */
        /* renamed from: com.avito.android.mortgage.person_form.di.a$c$a, reason: collision with other inner class name */
        public static final class C5931a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f200547a;

            public C5931a(o oVar) {
                this.f200547a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f200547a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPersonFormComponent.java */
        public static final class b implements u<com.avito.android.mortgage.domain.check_access.b> {

            /* renamed from: a, reason: collision with root package name */
            public final o f200548a;

            public b(o oVar) {
                this.f200548a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f200548a.O5();
            }
        }

        /* compiled from: DaggerPersonFormComponent.java */
        /* renamed from: com.avito.android.mortgage.person_form.di.a$c$c, reason: collision with other inner class name */
        public static final class C5932c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final o f200549a;

            public C5932c(o oVar) {
                this.f200549a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f200549a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerPersonFormComponent.java */
        public static final class d implements u<IZ.a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f200550a;

            public d(o oVar) {
                this.f200550a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IZ.a aVarLc = this.f200550a.lc();
                t.c(aVarLc);
                return aVarLc;
            }
        }

        /* compiled from: DaggerPersonFormComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f200551a;

            public e(o oVar) {
                this.f200551a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f200551a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(o oVar, cv.b bVar, C28478k c28478k, l lVar, PersonFormArguments personFormArguments, Bundle bundle, String str, C5930a c5930a) {
            this.f200521a = bVar;
            this.f200522b = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f200523c = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.alert_banner.b(com.avito.android.mortgage.person_form.list.items.alert_banner.d.a()));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f200524d = lVarA;
            this.f200525e = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.suggestion_banner.b(new com.avito.android.mortgage.person_form.list.items.suggestion_banner.e(lVarA)));
            this.f200526f = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.verification_banner.b(new com.avito.android.mortgage.person_form.list.items.verification_banner.e(this.f200524d)));
            this.f200527g = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.action_banner.b(new com.avito.android.mortgage.person_form.list.items.action_banner.e(this.f200524d)));
            this.f200528h = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.nav_button.b(new com.avito.android.mortgage.person_form.list.items.nav_button.e(this.f200524d)));
            this.f200529i = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.checkbox.b(new com.avito.android.mortgage.person_form.list.items.checkbox.e(this.f200524d)));
            this.f200530j = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.child.b(new com.avito.android.mortgage.person_form.list.items.child.h(this.f200524d)));
            this.f200531k = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.child_button.b(new com.avito.android.mortgage.person_form.list.items.child_button.e(this.f200524d)));
            this.f200532l = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.chips.b(new com.avito.android.mortgage.person_form.list.items.chips.f(this.f200524d)));
            com.avito.android.mortgage.person_form.list.items.input.f fVar = new com.avito.android.mortgage.person_form.list.items.input.f(this.f200524d);
            this.f200533m = fVar;
            this.f200534n = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.input.b(fVar));
            this.f200535o = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.input.compact.b(this.f200533m));
            this.f200536p = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.step_title.b(com.avito.android.mortgage.person_form.list.items.step_title.d.a()));
            this.f200537q = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.text.b(com.avito.android.mortgage.person_form.list.items.text.d.a()));
            com.avito.android.mortgage.person_form.list.items.select.g gVar = new com.avito.android.mortgage.person_form.list.items.select.g(this.f200524d);
            this.f200538r = gVar;
            this.f200539s = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.select.b(gVar));
            this.f200540t = dagger.internal.g.d(new com.avito.android.mortgage.person_form.list.items.select.compact.b(this.f200538r));
            A.b bVarA = A.a(15, 1);
            bVarA.f393938b.add(this.f200522b);
            u<TV0.b<?, ?>> uVar = this.f200523c;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f200525e);
            list.add(this.f200526f);
            list.add(this.f200527g);
            list.add(this.f200528h);
            list.add(this.f200529i);
            list.add(this.f200530j);
            list.add(this.f200531k);
            list.add(this.f200532l);
            list.add(this.f200534n);
            list.add(this.f200535o);
            list.add(this.f200536p);
            list.add(this.f200537q);
            list.add(this.f200539s);
            list.add(this.f200540t);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f200541u = uVarK;
            this.f200542v = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            A.b bVarA2 = A.a(8, 0);
            com.avito.android.mortgage.person_form.list.items.child.payloads.c cVarA = com.avito.android.mortgage.person_form.list.items.child.payloads.c.a();
            List<u<T>> list2 = bVarA2.f393937a;
            list2.add(cVarA);
            list2.add(com.avito.android.mortgage.person_form.list.items.chips.payload.c.a());
            list2.add(com.avito.android.mortgage.person_form.list.items.input.payloads.c.a());
            list2.add(com.avito.android.mortgage.person_form.list.items.select.payloads.c.a());
            list2.add(com.avito.android.mortgage.person_form.list.items.suggestion_banner.payloads.c.a());
            list2.add(com.avito.android.mortgage.person_form.list.items.verification_banner.payloads.c.a());
            list2.add(com.avito.android.mortgage.person_form.list.payloads.c.a());
            list2.add(com.avito.android.mortgage.person_form.list.items.nav_button.payloads.c.a());
            this.f200543w = dagger.internal.g.d(new g(this.f200542v, this.f200541u, new A00.b(bVarA2.b())));
            u<com.avito.android.mortgage.util.f> uVarD = dagger.internal.g.d(i.a.f200559a);
            this.f200544x = uVarD;
            this.f200545y = dagger.internal.g.d(new j(uVarD));
            this.f200546z = dagger.internal.l.b(bundle);
            C5931a c5931a = new C5931a(oVar);
            this.f200501A = c5931a;
            this.f200502B = new com.avito.android.mortgage.person_form.list.items.action_banner.i(c5931a);
            A.b bVarA3 = A.a(1, 0);
            bVarA3.f393937a.add(this.f200502B);
            this.f200503C = dagger.internal.g.d(new h(this.f200546z, bVarA3.b()));
            this.f200504D = new e(oVar);
            this.f200505E = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f200504D);
            u<com.avito.android.mortgage.person_form.mvi.mapper.a> uVarD2 = dagger.internal.g.d(com.avito.android.mortgage.person_form.mvi.mapper.g.a());
            this.f200506F = uVarD2;
            this.f200507G = dagger.internal.g.d(new D00.c(uVarD2));
            u<com.avito.android.mortgage.person_form.analytics.c> uVarD3 = dagger.internal.g.d(new com.avito.android.mortgage.person_form.analytics.e(this.f200501A));
            this.f200508H = uVarD3;
            this.f200509I = new S(uVarD3, this.f200507G);
            this.f200510J = new d(oVar);
            this.f200511K = dagger.internal.g.d(com.avito.android.mortgage.person_form.mvi.domain.formatters.c.a());
            u<com.avito.android.mortgage.person_form.mvi.domain.formatters.d> uVarD4 = dagger.internal.g.d(com.avito.android.mortgage.person_form.mvi.domain.formatters.f.a());
            this.f200512L = uVarD4;
            u<com.avito.android.mortgage.person_form.mvi.domain.a> uVarD5 = dagger.internal.g.d(new com.avito.android.mortgage.person_form.mvi.domain.d(uVarD4, this.f200510J, this.f200511K));
            this.f200513M = uVarD5;
            C5932c c5932c = new C5932c(oVar);
            this.f200514N = c5932c;
            this.f200515O = dagger.internal.g.d(new com.avito.android.mortgage.person_form.mvi.domain.h(uVarD5, c5932c));
            u<com.avito.android.mortgage.person_form.mvi.domain.validators.c> uVarD6 = dagger.internal.g.d(com.avito.android.mortgage.person_form.mvi.domain.validators.e.a());
            this.f200516P = uVarD6;
            this.f200518R = dagger.internal.g.d(new m(uVarD6, this.f200514N, this.f200510J, this.f200513M, new b(oVar), this.f200511K, this.f200512L));
            this.f200519S = dagger.internal.g.d(new q(com.avito.android.mortgage.util.e.a(), this.f200514N, this.f200510J, this.f200513M));
            dagger.internal.l lVarA2 = dagger.internal.l.a(personFormArguments);
            u<com.avito.android.mortgage.person_form.mvi.domain.a> uVar2 = this.f200513M;
            u<com.avito.android.mortgage.person_form.mvi.domain.e> uVar3 = this.f200515O;
            this.f200520T = new com.avito.android.mortgage.person_form.h(new L(this.f200509I, new C32666s(uVar2, uVar3, this.f200518R, this.f200519S, new w(lVarA2, uVar2, uVar3, this.f200514N), J.a(), com.avito.android.mortgage.util.e.a(), this.f200514N), N.a(), this.f200505E), this.f200515O);
        }

        @Override // com.avito.android.mortgage.person_form.di.c
        public final void a(MortgagePersonFormFragment mortgagePersonFormFragment) {
            mortgagePersonFormFragment.f200444p0 = this.f200543w.get();
            mortgagePersonFormFragment.f200445q0 = this.f200541u.get();
            mortgagePersonFormFragment.f200446r0 = this.f200544x.get();
            mortgagePersonFormFragment.f200447s0 = this.f200545y.get();
            mortgagePersonFormFragment.f200448t0 = this.f200503C.get();
            mortgagePersonFormFragment.f200449u0 = this.f200505E.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f200521a.u4();
            t.c(aVarU4);
            mortgagePersonFormFragment.f200450v0 = aVarU4;
            mortgagePersonFormFragment.f200451w0 = this.f200520T;
        }
    }

    public static c.a a() {
        return new b();
    }
}
