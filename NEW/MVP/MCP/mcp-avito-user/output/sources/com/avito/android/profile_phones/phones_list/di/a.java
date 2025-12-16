package com.avito.android.profile_phones.phones_list.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.statsd.F;
import com.avito.android.permissions.z;
import com.avito.android.profile_phones.phones_list.C33423h;
import com.avito.android.profile_phones.phones_list.InterfaceC33421f;
import com.avito.android.profile_phones.phones_list.L;
import com.avito.android.profile_phones.phones_list.N;
import com.avito.android.profile_phones.phones_list.P;
import com.avito.android.profile_phones.phones_list.PhonesListFragment;
import com.avito.android.profile_phones.phones_list.Q;
import com.avito.android.profile_phones.phones_list.S;
import com.avito.android.profile_phones.phones_list.SectionForOpen;
import com.avito.android.profile_phones.phones_list.di.k;
import com.avito.android.profile_phones.phones_list.mvi.C;
import com.avito.android.profile_phones.phones_list.mvi.C33431c;
import com.avito.android.profile_phones.phones_list.mvi.G;
import com.avito.android.profile_phones.phones_list.mvi.InterfaceC33429a;
import com.avito.android.profile_phones.phones_list.mvi.K;
import com.avito.android.profile_phones.phones_list.mvi.M;
import com.avito.android.profile_phones.phones_list.mvi.P;
import com.avito.android.profile_phones.phones_list.mvi.w;
import com.avito.android.remote.H;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35741a1;
import cv.InterfaceC39417a;
import dagger.internal.u;
import pM.InterfaceC46977a;

/* compiled from: DaggerPhonesListFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerPhonesListFragmentComponent.java */
    public static final class b implements k.a {
        public b() {
        }

        @Override // com.avito.android.profile_phones.phones_list.di.k.a
        public final k a(PhonesListFragment phonesListFragment, Resources resources, C28478k c28478k, boolean z12, PhonesListFragment phonesListFragment2, PhonesListFragment phonesListFragment3, SectionForOpen sectionForOpen, InterfaceC39417a interfaceC39417a, j jVar) {
            interfaceC39417a.getClass();
            return new c(new l(), new h(), jVar, interfaceC39417a, phonesListFragment, resources, c28478k, Boolean.valueOf(z12), phonesListFragment2, phonesListFragment3, sectionForOpen, null);
        }
    }

    /* compiled from: DaggerPhonesListFragmentComponent.java */
    public static final class c implements com.avito.android.profile_phones.phones_list.di.k {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.l f227660A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.android.profile_phones.phones_list.phone_item.c> f227661B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.profile_phones.phones_list.phone_item.b> f227662C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.phone_protection_info.item.e> f227663D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.phone_protection_info.item.a> f227664E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f227665F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f227666G;

        /* renamed from: H, reason: collision with root package name */
        public final u<RecyclerView.Adapter<?>> f227667H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.profile_phones.phones_list.device_list_item.c> f227668I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.android.profile_phones.phones_list.device_list_item.a> f227669J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f227670K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f227671L;

        /* renamed from: M, reason: collision with root package name */
        public final u<RecyclerView.Adapter<?>> f227672M;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.profile_phones.phones_list.di.j f227673a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f227674b;

        /* renamed from: c, reason: collision with root package name */
        public final u<L> f227675c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC33421f> f227676d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC34401z0> f227677e;

        /* renamed from: f, reason: collision with root package name */
        public final u<NL.d> f227678f;

        /* renamed from: g, reason: collision with root package name */
        public final u<NL.e> f227679g;

        /* renamed from: h, reason: collision with root package name */
        public final u<NL.f> f227680h;

        /* renamed from: i, reason: collision with root package name */
        public final u<G> f227681i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f227682j;

        /* renamed from: k, reason: collision with root package name */
        public final u<z> f227683k;

        /* renamed from: l, reason: collision with root package name */
        public final C f227684l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f227685m;

        /* renamed from: n, reason: collision with root package name */
        public final u<OL.a> f227686n;

        /* renamed from: o, reason: collision with root package name */
        public final u<F> f227687o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC28373a> f227688p;

        /* renamed from: q, reason: collision with root package name */
        public final u<ML.a> f227689q;

        /* renamed from: r, reason: collision with root package name */
        public final w f227690r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC35741a1> f227691s;

        /* renamed from: t, reason: collision with root package name */
        public final M f227692t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC46977a> f227693u;

        /* renamed from: v, reason: collision with root package name */
        public final u<H> f227694v;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC33429a> f227695w;

        /* renamed from: x, reason: collision with root package name */
        public final P f227696x;

        /* renamed from: y, reason: collision with root package name */
        public final u<InterfaceC28481c> f227697y;

        /* renamed from: z, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f227698z;

        /* compiled from: DaggerPhonesListFragmentComponent.java */
        /* renamed from: com.avito.android.profile_phones.phones_list.di.a$c$a, reason: collision with other inner class name */
        public static final class C6923a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.di.j f227699a;

            public C6923a(com.avito.android.profile_phones.phones_list.di.j jVar) {
                this.f227699a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f227699a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPhonesListFragmentComponent.java */
        public static final class b implements u<OL.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.di.j f227700a;

            public b(com.avito.android.profile_phones.phones_list.di.j jVar) {
                this.f227700a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                OL.a aVarM1 = this.f227700a.M1();
                dagger.internal.t.c(aVarM1);
                return aVarM1;
            }
        }

        /* compiled from: DaggerPhonesListFragmentComponent.java */
        /* renamed from: com.avito.android.profile_phones.phones_list.di.a$c$c, reason: collision with other inner class name */
        public static final class C6924c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f227701a;

            public C6924c(cv.b bVar) {
                this.f227701a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f227701a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerPhonesListFragmentComponent.java */
        public static final class d implements u<ML.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.di.j f227702a;

            public d(com.avito.android.profile_phones.phones_list.di.j jVar) {
                this.f227702a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f227702a.Z4();
            }
        }

        /* compiled from: DaggerPhonesListFragmentComponent.java */
        public static final class e implements u<H> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.di.j f227703a;

            public e(com.avito.android.profile_phones.phones_list.di.j jVar) {
                this.f227703a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H hK2 = this.f227703a.K();
                dagger.internal.t.c(hK2);
                return hK2;
            }
        }

        /* compiled from: DaggerPhonesListFragmentComponent.java */
        public static final class f implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.di.j f227704a;

            public f(com.avito.android.profile_phones.phones_list.di.j jVar) {
                this.f227704a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f227704a.n();
                dagger.internal.t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerPhonesListFragmentComponent.java */
        public static final class g implements u<NL.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.di.j f227705a;

            public g(com.avito.android.profile_phones.phones_list.di.j jVar) {
                this.f227705a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                NL.d dVarTi = this.f227705a.ti();
                dagger.internal.t.c(dVarTi);
                return dVarTi;
            }
        }

        /* compiled from: DaggerPhonesListFragmentComponent.java */
        public static final class h implements u<InterfaceC46977a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.di.j f227706a;

            public h(com.avito.android.profile_phones.phones_list.di.j jVar) {
                this.f227706a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC46977a interfaceC46977aX5 = this.f227706a.x5();
                dagger.internal.t.c(interfaceC46977aX5);
                return interfaceC46977aX5;
            }
        }

        /* compiled from: DaggerPhonesListFragmentComponent.java */
        public static final class i implements u<NL.e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.di.j f227707a;

            public i(com.avito.android.profile_phones.phones_list.di.j jVar) {
                this.f227707a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                NL.e eVarC5 = this.f227707a.C5();
                dagger.internal.t.c(eVarC5);
                return eVarC5;
            }
        }

        /* compiled from: DaggerPhonesListFragmentComponent.java */
        public static final class j implements u<NL.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.di.j f227708a;

            public j(com.avito.android.profile_phones.phones_list.di.j jVar) {
                this.f227708a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                NL.f fVarO8 = this.f227708a.o8();
                dagger.internal.t.c(fVarO8);
                return fVarO8;
            }
        }

        /* compiled from: DaggerPhonesListFragmentComponent.java */
        public static final class k implements u<z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.di.j f227709a;

            public k(com.avito.android.profile_phones.phones_list.di.j jVar) {
                this.f227709a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                z zVarA = this.f227709a.A();
                dagger.internal.t.c(zVarA);
                return zVarA;
            }
        }

        /* compiled from: DaggerPhonesListFragmentComponent.java */
        public static final class l implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.di.j f227710a;

            public l(com.avito.android.profile_phones.phones_list.di.j jVar) {
                this.f227710a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f227710a.B();
                dagger.internal.t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        /* compiled from: DaggerPhonesListFragmentComponent.java */
        public static final class m implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.di.j f227711a;

            public m(com.avito.android.profile_phones.phones_list.di.j jVar) {
                this.f227711a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f227711a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerPhonesListFragmentComponent.java */
        public static final class n implements u<F> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.phones_list.di.j f227712a;

            public n(com.avito.android.profile_phones.phones_list.di.j jVar) {
                this.f227712a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                F fN02 = this.f227712a.N0();
                dagger.internal.t.c(fN02);
                return fN02;
            }
        }

        public c(com.avito.android.profile_phones.phones_list.di.l lVar, com.avito.android.profile_phones.phones_list.di.h hVar, com.avito.android.profile_phones.phones_list.di.j jVar, cv.b bVar, Fragment fragment, Resources resources, C28478k c28478k, Boolean bool, com.avito.android.profile_phones.phones_list.phone_item.a aVar, com.avito.android.profile_phones.phones_list.device_list_item.i iVar, SectionForOpen sectionForOpen, C6922a c6922a) {
            this.f227673a = jVar;
            this.f227674b = bVar;
            u<L> uVarD = dagger.internal.g.d(new N(dagger.internal.l.a(resources)));
            this.f227675c = uVarD;
            u<InterfaceC33421f> uVarD2 = dagger.internal.g.d(new C33423h(uVarD));
            this.f227676d = uVarD2;
            l lVar2 = new l(jVar);
            g gVar = new g(jVar);
            i iVar2 = new i(jVar);
            this.f227679g = iVar2;
            j jVar2 = new j(jVar);
            this.f227680h = jVar2;
            this.f227681i = dagger.internal.g.d(new K(uVarD2, lVar2, gVar, iVar2, jVar2));
            this.f227682j = dagger.internal.l.a(bool);
            this.f227683k = new k(jVar);
            dagger.internal.l lVarB = dagger.internal.l.b(sectionForOpen);
            u<G> uVar = this.f227681i;
            dagger.internal.l lVar3 = this.f227682j;
            u<z> uVar2 = this.f227683k;
            this.f227684l = new C(lVar3, lVarB, uVar, uVar2);
            C6924c c6924c = new C6924c(bVar);
            b bVar2 = new b(jVar);
            n nVar = new n(jVar);
            C6923a c6923a = new C6923a(jVar);
            this.f227688p = c6923a;
            d dVar = new d(jVar);
            u<NL.e> uVar3 = this.f227679g;
            u<NL.f> uVar4 = this.f227680h;
            u<L> uVar5 = this.f227675c;
            this.f227690r = new w(c6924c, uVar, uVar2, uVar3, uVar4, uVar5, bVar2, nVar, c6923a, dVar);
            f fVar = new f(jVar);
            this.f227691s = fVar;
            this.f227692t = new M(fVar);
            this.f227693u = new h(jVar);
            u<InterfaceC33429a> uVarD3 = dagger.internal.g.d(new C33431c(new e(jVar), uVar5));
            this.f227695w = uVarD3;
            this.f227696x = new P(uVarD3, this.f227675c, this.f227693u, this.f227688p, this.f227683k, this.f227691s);
            this.f227697y = new m(jVar);
            u<ScreenPerformanceTracker> uVarS = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f227697y);
            this.f227698z = uVarS;
            this.f227660A = dagger.internal.l.a(new S(new Q(new com.avito.android.profile_phones.phones_list.mvi.F(this.f227684l, this.f227690r, this.f227692t, this.f227696x, uVarS))));
            u<com.avito.android.profile_phones.phones_list.phone_item.c> uVarD4 = dagger.internal.g.d(new com.avito.android.profile_phones.phones_list.phone_item.f(dagger.internal.l.a(aVar)));
            this.f227661B = uVarD4;
            this.f227662C = dagger.internal.g.d(new s(lVar, uVarD4));
            u<com.avito.android.phone_protection_info.item.e> uVarD5 = dagger.internal.g.d(com.avito.android.phone_protection_info.item.h.a());
            this.f227663D = uVarD5;
            u<com.avito.android.phone_protection_info.item.a> uVarD6 = dagger.internal.g.d(new com.avito.android.profile_phones.phones_list.di.i(hVar, uVarD5));
            this.f227664E = uVarD6;
            u<com.avito.konveyor.a> uVarD7 = dagger.internal.g.d(new t(lVar, uVarD6, this.f227662C));
            this.f227665F = uVarD7;
            u<com.avito.konveyor.adapter.a> uVarD8 = dagger.internal.g.d(new r(lVar, uVarD7));
            this.f227666G = uVarD8;
            this.f227667H = dagger.internal.g.d(new q(lVar, uVarD8, this.f227665F));
            u<com.avito.android.profile_phones.phones_list.device_list_item.c> uVarD9 = dagger.internal.g.d(new com.avito.android.profile_phones.phones_list.device_list_item.f(dagger.internal.l.a(iVar)));
            this.f227668I = uVarD9;
            u<com.avito.android.profile_phones.phones_list.device_list_item.a> uVarD10 = dagger.internal.g.d(new com.avito.android.profile_phones.phones_list.di.m(lVar, uVarD9));
            this.f227669J = uVarD10;
            u<com.avito.konveyor.a> uVarD11 = dagger.internal.g.d(new p(lVar, uVarD10));
            this.f227670K = uVarD11;
            u<com.avito.konveyor.adapter.a> uVarD12 = dagger.internal.g.d(new o(lVar, uVarD11));
            this.f227671L = uVarD12;
            this.f227672M = dagger.internal.g.d(new com.avito.android.profile_phones.phones_list.di.n(lVar, uVarD12, this.f227670K));
        }

        @Override // com.avito.android.profile_phones.phones_list.di.k
        public final void a(PhonesListFragment phonesListFragment) {
            phonesListFragment.f227391t0 = (P.a) this.f227660A.f393949a;
            phonesListFragment.f227393v0 = this.f227667H.get();
            phonesListFragment.f227394w0 = this.f227672M.get();
            phonesListFragment.f227395x0 = this.f227666G.get();
            phonesListFragment.f227396y0 = this.f227671L.get();
            com.avito.android.profile_phones.phones_list.di.j jVar = this.f227673a;
            phonesListFragment.f227397z0 = jVar.T3();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f227674b.u4();
            dagger.internal.t.c(aVarU4);
            phonesListFragment.f227381A0 = aVarU4;
            InterfaceC28373a interfaceC28373aA = jVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            phonesListFragment.f227382B0 = interfaceC28373aA;
            phonesListFragment.f227383C0 = jVar.B8();
            phonesListFragment.f227384D0 = this.f227698z.get();
        }
    }

    public static k.a a() {
        return new b();
    }
}
