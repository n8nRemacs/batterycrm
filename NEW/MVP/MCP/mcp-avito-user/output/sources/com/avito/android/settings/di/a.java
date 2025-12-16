package com.avito.android.settings.di;

import Tv0.C15416b;
import Tv0.C15417c;
import Y41.l;
import android.content.res.Resources;
import com.avito.android.I1;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.geo_common.interactor.B;
import com.avito.android.location.A;
import com.avito.android.location.H;
import com.avito.android.remote.V0;
import com.avito.android.replace_main.toggle.v;
import com.avito.android.settings.adapter.C34944b;
import com.avito.android.settings.adapter.C34947e;
import com.avito.android.settings.adapter.C34951i;
import com.avito.android.settings.adapter.C34954l;
import com.avito.android.settings.adapter.C34958p;
import com.avito.android.settings.adapter.C34961t;
import com.avito.android.settings.adapter.C34965x;
import com.avito.android.settings.adapter.F;
import com.avito.android.settings.adapter.J;
import com.avito.android.settings.adapter.N;
import com.avito.android.settings.adapter.T;
import com.avito.android.settings.adapter.X;
import com.avito.android.settings.adapter.b0;
import com.avito.android.settings.adapter.f0;
import com.avito.android.settings.di.b;
import com.avito.android.settings.ui.SettingsFragment;
import com.avito.android.util.C;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import jJ.InterfaceC42261a;
import java.util.List;
import nW.InterfaceC44343a;
import oW.InterfaceC44697a;
import ur.InterfaceC49101b;

/* compiled from: DaggerSettingsComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSettingsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.settings.di.b.a
        public final com.avito.android.settings.di.b a(com.avito.android.settings.di.c cVar, InterfaceC44697a interfaceC44697a, InterfaceC39417a interfaceC39417a, Resources resources, l lVar) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC44697a, interfaceC39417a, resources, lVar, null);
        }
    }

    /* compiled from: DaggerSettingsComponent.java */
    public static final class c implements com.avito.android.settings.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final C34944b f280821A;

        /* renamed from: B, reason: collision with root package name */
        public final N f280822B;

        /* renamed from: C, reason: collision with root package name */
        public final u<v> f280823C;

        /* renamed from: D, reason: collision with root package name */
        public final X f280824D;

        /* renamed from: E, reason: collision with root package name */
        public final C34958p f280825E;

        /* renamed from: F, reason: collision with root package name */
        public final b0 f280826F;

        /* renamed from: G, reason: collision with root package name */
        public final F f280827G;

        /* renamed from: H, reason: collision with root package name */
        public final C34965x f280828H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f280829I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f280830J;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.settings.di.c f280831a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f280832b;

        /* renamed from: c, reason: collision with root package name */
        public final Resources f280833c;

        /* renamed from: d, reason: collision with root package name */
        public final u<V0> f280834d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f280835e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.settings.h f280836f;

        /* renamed from: g, reason: collision with root package name */
        public final u<H> f280837g;

        /* renamed from: h, reason: collision with root package name */
        public final u<B> f280838h;

        /* renamed from: i, reason: collision with root package name */
        public final u<I1> f280839i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC44343a> f280840j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.location.r> f280841k;

        /* renamed from: l, reason: collision with root package name */
        public final u<U20.d> f280842l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.replace_main.toggle.m> f280843m;

        /* renamed from: n, reason: collision with root package name */
        public final u<U20.e> f280844n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.onboarding_manager.f> f280845o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC28373a> f280846p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.settings.mvi.h f280847q;

        /* renamed from: r, reason: collision with root package name */
        public final u<l90.n> f280848r;

        /* renamed from: s, reason: collision with root package name */
        public final u<C> f280849s;

        /* renamed from: t, reason: collision with root package name */
        public final u<E> f280850t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.lib.util.darkTheme.a> f280851u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.remote.H> f280852v;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC49101b> f280853w;

        /* renamed from: x, reason: collision with root package name */
        public final u<InterfaceC42261a> f280854x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.settings.j f280855y;

        /* renamed from: z, reason: collision with root package name */
        public final C34951i f280856z;

        /* compiled from: DaggerSettingsComponent.java */
        /* renamed from: com.avito.android.settings.di.a$c$a, reason: collision with other inner class name */
        public static final class C8360a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280857a;

            public C8360a(com.avito.android.settings.di.c cVar) {
                this.f280857a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f280857a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280858a;

            public b(com.avito.android.settings.di.c cVar) {
                this.f280858a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f280858a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        /* renamed from: com.avito.android.settings.di.a$c$c, reason: collision with other inner class name */
        public static final class C8361c implements u<InterfaceC49101b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280859a;

            public C8361c(com.avito.android.settings.di.c cVar) {
                this.f280859a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f280859a.G();
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class d implements u<InterfaceC44343a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f280860a;

            public d(InterfaceC44697a interfaceC44697a) {
                this.f280860a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44343a interfaceC44343aD6 = this.f280860a.d6();
                t.c(interfaceC44343aD6);
                return interfaceC44343aD6;
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class e implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280861a;

            public e(com.avito.android.settings.di.c cVar) {
                this.f280861a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f280861a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class f implements u<com.avito.android.lib.util.darkTheme.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280862a;

            public f(com.avito.android.settings.di.c cVar) {
                this.f280862a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.lib.util.darkTheme.a aVarB6 = this.f280862a.b6();
                t.c(aVarB6);
                return aVarB6;
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class g implements u<com.avito.android.remote.H> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280863a;

            public g(com.avito.android.settings.di.c cVar) {
                this.f280863a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.remote.H hK2 = this.f280863a.K();
                t.c(hK2);
                return hK2;
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class h implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280864a;

            public h(com.avito.android.settings.di.c cVar) {
                this.f280864a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f280864a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class i implements u<InterfaceC42261a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280865a;

            public i(com.avito.android.settings.di.c cVar) {
                this.f280865a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC42261a interfaceC42261aLk = this.f280865a.lk();
                t.c(interfaceC42261aLk);
                return interfaceC42261aLk;
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class j implements u<U20.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280866a;

            public j(com.avito.android.settings.di.c cVar) {
                this.f280866a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f280866a.M4();
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class k implements u<U20.e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280867a;

            public k(com.avito.android.settings.di.c cVar) {
                this.f280867a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f280867a.J6();
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class l implements u<com.avito.android.onboarding_manager.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280868a;

            public l(com.avito.android.settings.di.c cVar) {
                this.f280868a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.onboarding_manager.f fVarL0 = this.f280868a.l0();
                t.c(fVarL0);
                return fVarL0;
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class m implements u<I1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280869a;

            public m(com.avito.android.settings.di.c cVar) {
                this.f280869a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f280869a.H();
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class n implements u<l90.n> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280870a;

            public n(com.avito.android.settings.di.c cVar) {
                this.f280870a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                l90.n nVarE1 = this.f280870a.e1();
                t.c(nVarE1);
                return nVarE1;
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class o implements u<com.avito.android.replace_main.toggle.m> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280871a;

            public o(com.avito.android.settings.di.c cVar) {
                this.f280871a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f280871a.Qa();
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class p implements u<v> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280872a;

            public p(com.avito.android.settings.di.c cVar) {
                this.f280872a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f280872a.uc();
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class q implements u<H> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f280873a;

            public q(InterfaceC44697a interfaceC44697a) {
                this.f280873a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f280873a.i3();
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class r implements u<V0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.settings.di.c f280874a;

            public r(com.avito.android.settings.di.c cVar) {
                this.f280874a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                V0 v0Z = this.f280874a.Z();
                t.c(v0Z);
                return v0Z;
            }
        }

        /* compiled from: DaggerSettingsComponent.java */
        public static final class s implements u<B> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f280875a;

            public s(InterfaceC44697a interfaceC44697a) {
                this.f280875a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                B bQ3 = this.f280875a.q3();
                t.c(bQ3);
                return bQ3;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.settings.di.c cVar, InterfaceC44697a interfaceC44697a, cv.b bVar, Resources resources, Y41.l lVar, C8359a c8359a) {
            this.f280831a = cVar;
            this.f280832b = bVar;
            this.f280833c = resources;
            r rVar = new r(cVar);
            h hVar = new h(cVar);
            this.f280835e = hVar;
            this.f280836f = new com.avito.android.settings.h(rVar, hVar);
            u<com.avito.android.location.r> uVarA = dagger.internal.B.a(A.a(new q(interfaceC44697a), new m(cVar), new s(interfaceC44697a), new d(interfaceC44697a)));
            this.f280841k = uVarA;
            this.f280847q = new com.avito.android.settings.mvi.h(this.f280836f, uVarA, this.f280835e, new j(cVar), new o(cVar), new k(cVar), new l(cVar), new b(cVar));
            dagger.internal.l lVarA = dagger.internal.l.a(resources);
            n nVar = new n(cVar);
            e eVar = new e(cVar);
            com.avito.android.settings.m mVar = new com.avito.android.settings.m(lVarA, new C15417c(lVarA, nVar, eVar));
            this.f280855y = new com.avito.android.settings.j(new com.avito.android.settings.mvi.k(this.f280847q, new com.avito.android.settings.mvi.q(mVar, eVar, new C8360a(cVar)), new com.avito.android.settings.mvi.s(new com.avito.android.settings.mvi.n(mVar, new f(cVar), new com.avito.android.settings.di.f(eVar), new g(cVar), eVar, new C8361c(cVar), new i(cVar)))));
            this.f280856z = new C34951i(C34954l.a());
            this.f280821A = new C34944b(C34947e.a());
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar);
            this.f280822B = new N(new T(lVarA2));
            this.f280824D = new X(lVarA2, new p(cVar));
            this.f280825E = new C34958p(new C34961t(lVarA2));
            this.f280826F = new b0(new f0(lVarA2));
            this.f280827G = new F(new J(lVarA2));
            this.f280828H = new C34965x(new com.avito.android.settings.adapter.B(lVarA2));
            A.b bVarA = dagger.internal.A.a(8, 0);
            C34951i c34951i = this.f280856z;
            List<u<T>> list = bVarA.f393937a;
            list.add(c34951i);
            list.add(this.f280821A);
            list.add(this.f280822B);
            list.add(this.f280824D);
            list.add(this.f280825E);
            list.add(this.f280826F);
            list.add(this.f280827G);
            list.add(this.f280828H);
            u<com.avito.konveyor.a> uVarD = dagger.internal.g.d(new com.avito.android.settings.di.g(bVarA.b()));
            this.f280829I = uVarD;
            this.f280830J = dagger.internal.g.d(new com.avito.android.settings.di.e(uVarD));
        }

        @Override // com.avito.android.settings.di.b
        public final void a(SettingsFragment settingsFragment) {
            settingsFragment.f280988t0 = this.f280855y;
            settingsFragment.f280990v0 = this.f280830J.get();
            settingsFragment.f280991w0 = this.f280829I.get();
            com.avito.android.settings.di.c cVar = this.f280831a;
            settingsFragment.f280992x0 = cVar.g0();
            settingsFragment.f280993y0 = cVar.M0();
            settingsFragment.f280994z0 = cVar.nf();
            settingsFragment.f280976A0 = cVar.T2();
            settingsFragment.f280977B0 = cVar.ub();
            settingsFragment.f280978C0 = cVar.r1();
            settingsFragment.f280979D0 = cVar.Ve();
            settingsFragment.f280980E0 = cVar.Wf();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f280832b.u4();
            t.c(aVarU4);
            settingsFragment.f280981F0 = aVarU4;
            x xVarT = cVar.t();
            t.c(xVarT);
            settingsFragment.f280982G0 = xVarT;
            settingsFragment.f280983H0 = cVar.ma();
            cVar.H();
            settingsFragment.f280984I0 = cVar.K5();
            l90.n nVarE1 = cVar.e1();
            t.c(nVarE1);
            C cJ2 = cVar.j();
            t.c(cJ2);
            Resources resources = this.f280833c;
            settingsFragment.f280985J0 = new com.avito.android.settings.l(resources, new C15416b(resources, nVarE1, cJ2));
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            settingsFragment.f280986K0 = interfaceC28373aA;
        }
    }

    public static b.a a() {
        return new b();
    }
}
