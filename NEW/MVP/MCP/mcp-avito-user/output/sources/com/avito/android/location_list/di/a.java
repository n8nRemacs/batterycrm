package com.avito.android.location_list.di;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.geo_common.interactor.B;
import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.location.find.DetectLocationInteractor;
import com.avito.android.location.find.InterfaceC31503a;
import com.avito.android.location_list.C31521o;
import com.avito.android.location_list.C31523q;
import com.avito.android.location_list.C31526u;
import com.avito.android.location_list.C31528w;
import com.avito.android.location_list.LocationListActivity;
import com.avito.android.location_list.LocationListFragment;
import com.avito.android.location_list.T;
import com.avito.android.location_list.di.b;
import com.avito.android.permissions.G;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.permissions.q;
import com.avito.android.permissions.s;
import com.avito.android.permissions.z;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.L6;
import dagger.internal.t;
import dagger.internal.u;
import lW.C43693c;
import lW.InterfaceC43691a;
import pW.C47011b;
import pW.C47012c;
import pW.C47013d;
import pW.C47014e;
import pW.C47015f;
import qW.C47352a;
import rW.InterfaceC47603a;

/* compiled from: DaggerLocationListComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerLocationListComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.location_list.di.c f181950a;

        /* renamed from: b, reason: collision with root package name */
        public d f181951b;

        /* renamed from: c, reason: collision with root package name */
        public LocationListActivity f181952c;

        /* renamed from: d, reason: collision with root package name */
        public LocationListFragment f181953d;

        /* renamed from: e, reason: collision with root package name */
        public LocationListFragment f181954e;

        /* renamed from: f, reason: collision with root package name */
        public C28478k f181955f;

        public b() {
        }

        @Override // com.avito.android.location_list.di.b.a
        public final b.a a(d dVar) {
            this.f181951b = dVar;
            return this;
        }

        @Override // com.avito.android.location_list.di.b.a
        public final b.a b(LocationListActivity locationListActivity) {
            this.f181952c = locationListActivity;
            return this;
        }

        @Override // com.avito.android.location_list.di.b.a
        public final com.avito.android.location_list.di.b build() {
            t.a(com.avito.android.location_list.di.c.class, this.f181950a);
            t.a(d.class, this.f181951b);
            t.a(Activity.class, this.f181952c);
            t.a(Fragment.class, this.f181953d);
            t.a(com.avito.android.ui.a.class, this.f181954e);
            t.a(C28478k.class, this.f181955f);
            return new c(this.f181951b, this.f181950a, this.f181952c, this.f181953d, this.f181954e, this.f181955f, null);
        }

        @Override // com.avito.android.location_list.di.b.a
        public final b.a c(C28478k c28478k) {
            this.f181955f = c28478k;
            return this;
        }

        @Override // com.avito.android.location_list.di.b.a
        public final b.a d(com.avito.android.location_list.di.c cVar) {
            this.f181950a = cVar;
            return this;
        }

        @Override // com.avito.android.location_list.di.b.a
        public final b.a e(LocationListFragment locationListFragment) {
            this.f181954e = locationListFragment;
            return this;
        }

        @Override // com.avito.android.location_list.di.b.a
        public final b.a f(LocationListFragment locationListFragment) {
            this.f181953d = locationListFragment;
            return this;
        }
    }

    /* compiled from: DaggerLocationListComponent.java */
    public static final class c implements com.avito.android.location_list.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<G> f181956A;

        /* renamed from: B, reason: collision with root package name */
        public final u<z> f181957B;

        /* renamed from: C, reason: collision with root package name */
        public final u<q> f181958C;

        /* renamed from: D, reason: collision with root package name */
        public final u<InterfaceC33034d> f181959D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f181960E;

        /* renamed from: F, reason: collision with root package name */
        public final u<InterfaceC43691a> f181961F;

        /* renamed from: G, reason: collision with root package name */
        public final u<InterfaceC28481c> f181962G;

        /* renamed from: H, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f181963H;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.location_list.di.c f181964a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.geo_common.interactor.g> f181965b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC30715a> f181966c;

        /* renamed from: d, reason: collision with root package name */
        public final u<B> f181967d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35745a5> f181968e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f181969f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.location_list.G> f181970g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f181971h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC47603a> f181972i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.geo.j> f181973j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC31503a> f181974k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.location.find.d> f181975l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f181976m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.l f181977n;

        /* renamed from: o, reason: collision with root package name */
        public final u<L6> f181978o;

        /* renamed from: p, reason: collision with root package name */
        public final u<C47352a> f181979p;

        /* renamed from: q, reason: collision with root package name */
        public final u<DetectLocationInteractor> f181980q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.location.find.i> f181981r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.location.find.l> f181982s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.f f181983t;

        /* renamed from: u, reason: collision with root package name */
        public final u<C31526u> f181984u;

        /* renamed from: v, reason: collision with root package name */
        public final u<C31528w> f181985v;

        /* renamed from: w, reason: collision with root package name */
        public final u<C31521o> f181986w;

        /* renamed from: x, reason: collision with root package name */
        public final u<C31523q> f181987x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f181988y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f181989z;

        /* compiled from: DaggerLocationListComponent.java */
        /* renamed from: com.avito.android.location_list.di.a$c$a, reason: collision with other inner class name */
        public static final class C5345a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_list.di.c f181990a;

            public C5345a(com.avito.android.location_list.di.c cVar) {
                this.f181990a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f181990a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerLocationListComponent.java */
        public static final class b implements u<com.avito.android.geo.j> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_list.di.c f181991a;

            public b(com.avito.android.location_list.di.c cVar) {
                this.f181991a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo.j jVarC0 = this.f181991a.c0();
                t.c(jVarC0);
                return jVarC0;
            }
        }

        /* compiled from: DaggerLocationListComponent.java */
        /* renamed from: com.avito.android.location_list.di.a$c$c, reason: collision with other inner class name */
        public static final class C5346c implements u<InterfaceC30715a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_list.di.c f181992a;

            public C5346c(com.avito.android.location_list.di.c cVar) {
                this.f181992a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC30715a interfaceC30715aK3 = this.f181992a.k3();
                t.c(interfaceC30715aK3);
                return interfaceC30715aK3;
            }
        }

        /* compiled from: DaggerLocationListComponent.java */
        public static final class d implements u<com.avito.android.geo_common.interactor.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_list.di.c f181993a;

            public d(com.avito.android.location_list.di.c cVar) {
                this.f181993a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo_common.interactor.g gVarU0 = this.f181993a.u0();
                t.c(gVarU0);
                return gVarU0;
            }
        }

        /* compiled from: DaggerLocationListComponent.java */
        public static final class e implements u<B> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_list.di.c f181994a;

            public e(com.avito.android.location_list.di.c cVar) {
                this.f181994a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                B bAb = this.f181994a.ab();
                t.c(bAb);
                return bAb;
            }
        }

        /* compiled from: DaggerLocationListComponent.java */
        public static final class f implements u<z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_list.di.c f181995a;

            public f(com.avito.android.location_list.di.c cVar) {
                this.f181995a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                z zVarA = this.f181995a.A();
                t.c(zVarA);
                return zVarA;
            }
        }

        /* compiled from: DaggerLocationListComponent.java */
        public static final class g implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_list.di.c f181996a;

            public g(com.avito.android.location_list.di.c cVar) {
                this.f181996a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f181996a.N();
            }
        }

        /* compiled from: DaggerLocationListComponent.java */
        public static final class h implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_list.di.c f181997a;

            public h(com.avito.android.location_list.di.c cVar) {
                this.f181997a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f181997a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerLocationListComponent.java */
        public static final class i implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_list.di.c f181998a;

            public i(com.avito.android.location_list.di.c cVar) {
                this.f181998a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f181998a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerLocationListComponent.java */
        public static final class j implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_list.di.c f181999a;

            public j(com.avito.android.location_list.di.c cVar) {
                this.f181999a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f181999a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerLocationListComponent.java */
        public static final class k implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_list.di.c f182000a;

            public k(com.avito.android.location_list.di.c cVar) {
                this.f182000a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f182000a.o();
            }
        }

        public c(com.avito.android.location_list.di.d dVar, com.avito.android.location_list.di.c cVar, Activity activity, Fragment fragment, com.avito.android.ui.a aVar, C28478k c28478k, C5344a c5344a) {
            this.f181964a = cVar;
            d dVar2 = new d(cVar);
            C5346c c5346c = new C5346c(cVar);
            e eVar = new e(cVar);
            h hVar = new h(cVar);
            this.f181968e = hVar;
            this.f181970g = dagger.internal.g.d(new com.avito.android.location_list.di.g(dVar, dVar2, c5346c, eVar, hVar, new k(cVar)));
            C5345a c5345a = new C5345a(cVar);
            this.f181971h = c5345a;
            this.f181972i = dagger.internal.g.d(new com.avito.android.location_list.di.f(dVar, c5345a));
            b bVar = new b(cVar);
            this.f181973j = bVar;
            C47011b.f428554b.getClass();
            u<InterfaceC31503a> uVarD = dagger.internal.g.d(new C47011b(bVar));
            this.f181974k = uVarD;
            C47012c.f428556b.getClass();
            this.f181975l = dagger.internal.g.d(new C47012c(uVarD));
            this.f181976m = dagger.internal.l.a(activity);
            this.f181977n = dagger.internal.l.a(aVar);
            u<L6> uVarD2 = dagger.internal.g.d(C47015f.f428566a);
            this.f181978o = uVarD2;
            dagger.internal.l lVar = this.f181976m;
            dagger.internal.l lVar2 = this.f181977n;
            C47013d.f428558d.getClass();
            u<C47352a> uVarD3 = dagger.internal.g.d(new C47013d(lVar, lVar2, uVarD2));
            this.f181979p = uVarD3;
            u<InterfaceC35745a5> uVar = this.f181968e;
            u<com.avito.android.geo.j> uVar2 = this.f181973j;
            C47014e.f428562d.getClass();
            u<DetectLocationInteractor> uVarD4 = dagger.internal.g.d(new C47014e(uVarD3, uVar, uVar2));
            this.f181980q = uVarD4;
            com.avito.android.location.find.k.f181757b.getClass();
            u<com.avito.android.location.find.i> uVarD5 = dagger.internal.g.d(new com.avito.android.location.find.k(uVarD4));
            this.f181981r = uVarD5;
            u<com.avito.android.location.find.d> uVar3 = this.f181975l;
            com.avito.android.location.find.n.f181761c.getClass();
            this.f181982s = dagger.internal.g.d(new com.avito.android.location.find.n(uVarD5, uVar3));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f181983t = fVar;
            u<C31526u> uVarD6 = dagger.internal.g.d(new l(dVar, fVar));
            this.f181984u = uVarD6;
            this.f181985v = dagger.internal.g.d(new com.avito.android.location_list.di.k(dVar, uVarD6));
            u<C31521o> uVarD7 = dagger.internal.g.d(new com.avito.android.location_list.di.j(dVar, this.f181983t));
            this.f181986w = uVarD7;
            u<C31523q> uVarD8 = dagger.internal.g.d(new com.avito.android.location_list.di.i(dVar, uVarD7));
            this.f181987x = uVarD8;
            u<com.avito.konveyor.a> uVarD9 = dagger.internal.g.d(new com.avito.android.location_list.di.h(dVar, this.f181985v, uVarD8));
            this.f181988y = uVarD9;
            this.f181989z = dagger.internal.g.d(new com.avito.android.location_list.di.e(dVar, uVarD9));
            u<q> uVarD10 = dagger.internal.g.d(new s(new g(cVar), new f(cVar)));
            this.f181958C = uVarD10;
            this.f181959D = dagger.internal.g.d(new n(dVar, uVarD10));
            this.f181961F = dagger.internal.g.d(C43693c.a(this.f181971h, new j(cVar)));
            this.f181962G = new i(cVar);
            u<ScreenPerformanceTracker> uVarS = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f181962G);
            this.f181963H = uVarS;
            dagger.internal.f.a(this.f181983t, dagger.internal.g.d(new o(dVar, this.f181970g, this.f181972i, this.f181968e, this.f181982s, this.f181989z, this.f181959D, this.f181961F, uVarS)));
        }

        @Override // com.avito.android.location_list.di.b
        public final void a(LocationListFragment locationListFragment) {
            com.avito.android.location_list.di.c cVar = this.f181964a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            locationListFragment.f181877n0 = interfaceC28373aA;
            locationListFragment.f181878o0 = this.f181970g.get();
            locationListFragment.f181879p0 = (T) this.f181983t.get();
            locationListFragment.f181880q0 = this.f181989z.get();
            locationListFragment.f181881r0 = this.f181988y.get();
            locationListFragment.f181882s0 = cVar.h();
            locationListFragment.f181883t0 = this.f181959D.get();
            locationListFragment.f181884u0 = this.f181963H.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
