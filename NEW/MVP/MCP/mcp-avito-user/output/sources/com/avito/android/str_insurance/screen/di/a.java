package com.avito.android.str_insurance.screen.di;

import Xy0.AbstractC17061a;
import Zy0.InterfaceC19622a;
import android.content.res.Resources;
import androidx.view.T0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.d1;
import com.avito.android.str_insurance.InsuranceData;
import com.avito.android.str_insurance.screen.StrInsuranceFragment;
import com.avito.android.str_insurance.screen.di.f;
import com.avito.android.str_insurance.screen.mvi.A;
import com.avito.android.str_insurance.screen.mvi.C;
import com.avito.android.str_insurance.screen.mvi.C35127b;
import com.avito.android.str_insurance.screen.mvi.C35129d;
import com.avito.android.str_insurance.screen.mvi.s;
import com.avito.android.str_insurance.screen.mvi.w;
import com.avito.android.str_insurance.screen.mvi.x;
import com.avito.android.str_insurance.screen.mvi.z;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import kotlinx.coroutines.flow.Y1;

/* compiled from: DaggerStrInsuranceFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrInsuranceFragmentComponent.java */
    public static final class b implements f.a {
        public b() {
        }

        @Override // com.avito.android.str_insurance.screen.di.f.a
        public final f a(g gVar, InterfaceC39417a interfaceC39417a, StrInsuranceFragment strInsuranceFragment, Resources resources, com.avito.android.analytics.screens.r rVar, AbstractC17061a abstractC17061a) {
            interfaceC39417a.getClass();
            return new c(new com.avito.android.str_insurance.screen.di.b(), new p(), new h(), gVar, interfaceC39417a, strInsuranceFragment, resources, rVar, abstractC17061a, null);
        }
    }

    /* compiled from: DaggerStrInsuranceFragmentComponent.java */
    public static final class c implements com.avito.android.str_insurance.screen.di.f {

        /* renamed from: A, reason: collision with root package name */
        public final com.avito.android.str_insurance.screen.h f288651A;

        /* renamed from: B, reason: collision with root package name */
        public final u<A> f288652B;

        /* renamed from: C, reason: collision with root package name */
        public final u<A> f288653C;

        /* renamed from: D, reason: collision with root package name */
        public final u<A> f288654D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f288655E;

        /* renamed from: F, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f288656F;

        /* renamed from: G, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f288657G;

        /* renamed from: H, reason: collision with root package name */
        public final u<Y1<InterfaceC19622a>> f288658H;

        /* renamed from: I, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f288659I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f288660J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f288661K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f288662L;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f288663a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC17061a f288664b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.str_insurance.screen.di.g f288665c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InsuranceData> f288666d;

        /* renamed from: e, reason: collision with root package name */
        public final C35129d f288667e;

        /* renamed from: f, reason: collision with root package name */
        public final u<d1> f288668f;

        /* renamed from: g, reason: collision with root package name */
        public final u<R0> f288669g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f288670h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f288671i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f288672j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f288673k;

        /* renamed from: l, reason: collision with root package name */
        public final u<Screen> f288674l;

        /* renamed from: m, reason: collision with root package name */
        public final u<H> f288675m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.analytics.screens.o> f288676n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.str_insurance.screen.mvi.e> f288677o;

        /* renamed from: p, reason: collision with root package name */
        public final C35127b f288678p;

        /* renamed from: q, reason: collision with root package name */
        public final u<x> f288679q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.str_insurance.screen.mvi.u f288680r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC35863o4> f288681s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.str_insurance.converters.f> f288682t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.str_insurance.converters.f> f288683u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.str_insurance.converters.f> f288684v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.str_insurance.converters.f> f288685w;

        /* renamed from: x, reason: collision with root package name */
        public final w f288686x;

        /* renamed from: y, reason: collision with root package name */
        public final u<C28478k> f288687y;

        /* renamed from: z, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f288688z;

        /* compiled from: DaggerStrInsuranceFragmentComponent.java */
        /* renamed from: com.avito.android.str_insurance.screen.di.a$c$a, reason: collision with other inner class name */
        public static final class C8687a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_insurance.screen.di.g f288689a;

            public C8687a(com.avito.android.str_insurance.screen.di.g gVar) {
                this.f288689a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f288689a.e();
            }
        }

        /* compiled from: DaggerStrInsuranceFragmentComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_insurance.screen.di.g f288690a;

            public b(com.avito.android.str_insurance.screen.di.g gVar) {
                this.f288690a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f288690a.c();
            }
        }

        /* compiled from: DaggerStrInsuranceFragmentComponent.java */
        /* renamed from: com.avito.android.str_insurance.screen.di.a$c$c, reason: collision with other inner class name */
        public static final class C8688c implements u<InsuranceData> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_insurance.screen.di.g f288691a;

            public C8688c(com.avito.android.str_insurance.screen.di.g gVar) {
                this.f288691a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InsuranceData insuranceDataRg = this.f288691a.Rg();
                t.c(insuranceDataRg);
                return insuranceDataRg;
            }
        }

        /* compiled from: DaggerStrInsuranceFragmentComponent.java */
        public static final class d implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_insurance.screen.di.g f288692a;

            public d(com.avito.android.str_insurance.screen.di.g gVar) {
                this.f288692a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f288692a.m();
            }
        }

        /* compiled from: DaggerStrInsuranceFragmentComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_insurance.screen.di.g f288693a;

            public e(com.avito.android.str_insurance.screen.di.g gVar) {
                this.f288693a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f288693a.b();
            }
        }

        /* compiled from: DaggerStrInsuranceFragmentComponent.java */
        public static final class f implements u<d1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_insurance.screen.di.g f288694a;

            public f(com.avito.android.str_insurance.screen.di.g gVar) {
                this.f288694a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f288694a.a0();
            }
        }

        /* compiled from: DaggerStrInsuranceFragmentComponent.java */
        public static final class g implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_insurance.screen.di.g f288695a;

            public g(com.avito.android.str_insurance.screen.di.g gVar) {
                this.f288695a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f288695a.o();
            }
        }

        public c(com.avito.android.str_insurance.screen.di.b bVar, p pVar, h hVar, com.avito.android.str_insurance.screen.di.g gVar, cv.b bVar2, T0 t02, Resources resources, com.avito.android.analytics.screens.r rVar, AbstractC17061a abstractC17061a, C8686a c8686a) {
            this.f288663a = bVar2;
            this.f288664b = abstractC17061a;
            this.f288665c = gVar;
            this.f288667e = new C35129d(new C8688c(gVar));
            this.f288668f = new f(gVar);
            this.f288669g = new b(gVar);
            this.f288670h = new g(gVar);
            this.f288671i = new e(gVar);
            this.f288672j = dagger.internal.l.a(rVar);
            dagger.internal.l lVarA = dagger.internal.l.a(abstractC17061a);
            this.f288673k = lVarA;
            u<Screen> uVarD = dagger.internal.g.d(new j(hVar, lVarA));
            this.f288674l = uVarD;
            u<H> uVarD2 = dagger.internal.g.d(new n(hVar, this.f288671i, this.f288672j, uVarD));
            this.f288675m = uVarD2;
            u<com.avito.android.analytics.screens.o> uVarD3 = dagger.internal.g.d(new k(hVar, uVarD2));
            this.f288676n = uVarD3;
            u<com.avito.android.str_insurance.screen.mvi.e> uVarD4 = dagger.internal.g.d(new com.avito.android.str_insurance.screen.mvi.g(uVarD3));
            this.f288677o = uVarD4;
            this.f288678p = new C35127b(new s(uVarD4, this.f288668f, this.f288669g, this.f288670h));
            u<x> uVarD5 = dagger.internal.g.d(new z(dagger.internal.l.a(resources)));
            this.f288679q = uVarD5;
            this.f288680r = new com.avito.android.str_insurance.screen.mvi.u(this.f288673k, uVarD5);
            d dVar = new d(gVar);
            this.f288681s = dVar;
            this.f288682t = dagger.internal.g.d(new com.avito.android.str_insurance.converters.h(dVar));
            this.f288683u = dagger.internal.g.d(com.avito.android.str_insurance.converters.d.a());
            this.f288684v = dagger.internal.g.d(new com.avito.android.str_insurance.converters.b(this.f288681s));
            A.b bVarA = dagger.internal.A.a(3, 0);
            u<com.avito.android.str_insurance.converters.f> uVar = this.f288682t;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f288683u);
            list.add(this.f288684v);
            u<com.avito.android.str_insurance.converters.f> uVarD6 = dagger.internal.g.d(new r(pVar, this.f288673k, bVarA.b()));
            this.f288685w = uVarD6;
            this.f288686x = new w(uVarD6);
            u<C28478k> uVarD7 = dagger.internal.g.d(new i(hVar, this.f288674l, this.f288672j));
            this.f288687y = uVarD7;
            u<ScreenPerformanceTracker> uVarD8 = dagger.internal.g.d(new l(hVar, this.f288671i, uVarD7));
            this.f288688z = uVarD8;
            this.f288651A = new com.avito.android.str_insurance.screen.h(new com.avito.android.str_insurance.screen.mvi.j(this.f288667e, this.f288678p, this.f288680r, this.f288686x, uVarD8));
            this.f288652B = dagger.internal.g.d(new com.avito.android.str_insurance.screen.mvi.l(uVarD8, this.f288676n));
            this.f288653C = dagger.internal.g.d(new C(this.f288688z));
            A.b bVarA2 = dagger.internal.A.a(2, 0);
            u<com.avito.android.str_insurance.screen.mvi.A> uVar2 = this.f288652B;
            List<u<T>> list2 = bVarA2.f393937a;
            list2.add(uVar2);
            list2.add(this.f288653C);
            this.f288654D = dagger.internal.g.d(new m(hVar, this.f288673k, bVarA2.b()));
            C8687a c8687a = new C8687a(gVar);
            this.f288655E = c8687a;
            this.f288656F = dagger.internal.g.d(new com.avito.android.str_insurance.items.title.d(new com.avito.android.str_insurance.items.title.g(c8687a)));
            this.f288657G = dagger.internal.g.d(new com.avito.android.str_insurance.items.insight.b(new com.avito.android.str_insurance.items.insight.e(this.f288655E)));
            u<Y1<InterfaceC19622a>> uVarD9 = dagger.internal.g.d(new q(pVar));
            this.f288658H = uVarD9;
            this.f288659I = dagger.internal.g.d(new com.avito.android.str_insurance.items.flat_form.b(new com.avito.android.str_insurance.items.flat_form.g(uVarD9, this.f288655E)));
            A.b bVarA3 = dagger.internal.A.a(3, 0);
            u<TV0.b<?, ?>> uVar3 = this.f288656F;
            List<u<T>> list3 = bVarA3.f393937a;
            list3.add(uVar3);
            list3.add(this.f288657G);
            list3.add(this.f288659I);
            u<com.avito.konveyor.a> uVarD10 = dagger.internal.g.d(new com.avito.android.str_insurance.screen.di.d(bVar, bVarA3.b()));
            this.f288660J = uVarD10;
            u<com.avito.konveyor.adapter.a> uVarD11 = dagger.internal.g.d(new com.avito.android.str_insurance.screen.di.c(bVar, uVarD10));
            this.f288661K = uVarD11;
            this.f288662L = dagger.internal.g.d(new com.avito.android.str_insurance.screen.di.e(bVar, uVarD11, this.f288660J, com.avito.android.str_insurance.items.b.a()));
        }

        @Override // com.avito.android.str_insurance.screen.di.f
        public final void a(StrInsuranceFragment strInsuranceFragment) {
            strInsuranceFragment.f288621h0 = this.f288651A;
            strInsuranceFragment.f288623j0 = this.f288654D.get();
            strInsuranceFragment.f288624k0 = this.f288662L.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f288663a.u4();
            t.c(aVarU4);
            strInsuranceFragment.f288625l0 = aVarU4;
            strInsuranceFragment.f288626m0 = this.f288664b;
            Xy0.h hVarWe = this.f288665c.We();
            t.c(hVarWe);
            strInsuranceFragment.f288627n0 = hVarWe;
            strInsuranceFragment.f288628o0 = this.f288658H.get();
        }
    }

    public static f.a a() {
        return new b();
    }
}
