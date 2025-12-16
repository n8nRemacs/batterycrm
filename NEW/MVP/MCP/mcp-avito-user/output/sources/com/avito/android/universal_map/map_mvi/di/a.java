package com.avito.android.universal_map.map_mvi.di;

import Hr.InterfaceC14024a;
import Vi.C15684a;
import Y41.l;
import Zi.InterfaceC19564a;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.P;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.location.find.InterfaceC31503a;
import com.avito.android.location.find.v;
import com.avito.android.location.find.w;
import com.avito.android.location.find.y;
import com.avito.android.permissions.G;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.permissions.s;
import com.avito.android.permissions.z;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.universal_map.map.C35320h;
import com.avito.android.universal_map.map.InterfaceC35318f;
import com.avito.android.universal_map.map.S;
import com.avito.android.universal_map.map.di.B;
import com.avito.android.universal_map.map.di.C;
import com.avito.android.universal_map.map.di.C35316w;
import com.avito.android.universal_map.map.di.D;
import com.avito.android.universal_map.map.di.E;
import com.avito.android.universal_map.map.di.H;
import com.avito.android.universal_map.map.di.InterfaceC35314u;
import com.avito.android.universal_map.map.di.T;
import com.avito.android.universal_map.map.di.U;
import com.avito.android.universal_map.map.di.V;
import com.avito.android.universal_map.map.di.W;
import com.avito.android.universal_map.map.di.x;
import com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi;
import com.avito.android.universal_map.map_mvi.di.b;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import gj.InterfaceC40691b;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kj.InterfaceC42698a;
import lW.C43693c;
import lW.InterfaceC43691a;
import pW.C47017h;
import pW.C47018i;
import tG0.InterfaceC48553b;

/* compiled from: DaggerUniversalMapMviComponent.java */
@e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerUniversalMapMviComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.universal_map.map_mvi.di.b.a
        public final com.avito.android.universal_map.map_mvi.di.b a(Context context, Resources resources, String str, String str2, String str3, Map map, UniversalMapFragmentMvi universalMapFragmentMvi, r rVar, UniversalMapParams.TrackerSettings trackerSettings, ParametrizedEvent parametrizedEvent, List list, String str4, Long l12, String str5, UniversalMapParams.MapSettings mapSettings, l lVar, InterfaceC39417a interfaceC39417a, InterfaceC42698a interfaceC42698a, InterfaceC35314u interfaceC35314u) {
            str.getClass();
            str2.getClass();
            map.getClass();
            trackerSettings.getClass();
            interfaceC39417a.getClass();
            interfaceC42698a.getClass();
            return new c(interfaceC35314u, interfaceC39417a, interfaceC42698a, context, resources, str, str2, str3, map, universalMapFragmentMvi, rVar, trackerSettings, parametrizedEvent, list, str4, l12, str5, mapSettings, lVar, null);
        }
    }

    /* compiled from: DaggerUniversalMapMviComponent.java */
    public static final class c implements com.avito.android.universal_map.map_mvi.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<AvitoMarkerIconFactory> f306028A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.android.universal_map.map.mvi.reducer.a> f306029B;

        /* renamed from: C, reason: collision with root package name */
        public final u<gj.d> f306030C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f306031D;

        /* renamed from: E, reason: collision with root package name */
        public final u<C15684a> f306032E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.map_core.beduin.action_handler.g> f306033F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.android.onboarding_manager.f> f306034G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.android.map_core.beduin.action_handler.i> f306035H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.map_core.beduin.action_handler.c> f306036I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.android.map_core.beduin.action_handler.o> f306037J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.android.map_core.beduin.action_handler.m> f306038K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.android.map_core.beduin.action_handler.a> f306039L;

        /* renamed from: M, reason: collision with root package name */
        public final u<com.avito.android.map_core.beduin.action_handler.e> f306040M;

        /* renamed from: N, reason: collision with root package name */
        public final u<com.avito.android.map_core.beduin.action_handler.k> f306041N;

        /* renamed from: O, reason: collision with root package name */
        public final u<Set<gj.f<?>>> f306042O;

        /* renamed from: P, reason: collision with root package name */
        public final u<a.b> f306043P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f306044Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<InterfaceC40691b> f306045R;

        /* renamed from: S, reason: collision with root package name */
        public final u<com.avito.android.universal_map.map.mvi.reducer.j> f306046S;

        /* renamed from: T, reason: collision with root package name */
        public final A f306047T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.l f306048U;

        /* renamed from: V, reason: collision with root package name */
        public final u<InterfaceC14024a> f306049V;

        /* renamed from: W, reason: collision with root package name */
        public final u<com.avito.android.universal_map.map_mvi.point_info.a> f306050W;

        /* renamed from: X, reason: collision with root package name */
        public final u<com.avito.android.universal_map.map_mvi.point_filters.a> f306051X;

        /* renamed from: Y, reason: collision with root package name */
        public final u<R0> f306052Y;

        /* renamed from: Z, reason: collision with root package name */
        public final u<u3.g<SimpleTestGroupWithNone>> f306053Z;

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC35314u f306054a;

        /* renamed from: a0, reason: collision with root package name */
        public final com.avito.android.universal_map.map.mvi.n f306055a0;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC42698a f306056b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.l f306057b0;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f306058c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.l f306059c0;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.universal_map.map.common.marker.d> f306060d;

        /* renamed from: d0, reason: collision with root package name */
        public final u<P> f306061d0;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.universal_map.map.common.marker.a> f306062e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.l f306063e0;

        /* renamed from: f, reason: collision with root package name */
        public final u<AvitoMapAttachHelper> f306064f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.l f306065f0;

        /* renamed from: g, reason: collision with root package name */
        public final u<G> f306066g;

        /* renamed from: g0, reason: collision with root package name */
        public final u<InterfaceC35318f> f306067g0;

        /* renamed from: h, reason: collision with root package name */
        public final u<z> f306068h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.l f306069h0;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.permissions.q> f306070i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.l f306071i0;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC33034d> f306072j;

        /* renamed from: j0, reason: collision with root package name */
        public final u<InterfaceC48553b> f306073j0;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28373a> f306074k;

        /* renamed from: k0, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f306075k0;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f306076l;

        /* renamed from: l0, reason: collision with root package name */
        public final u<InterfaceC35745a5> f306077l0;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC43691a> f306078m;

        /* renamed from: m0, reason: collision with root package name */
        public final u<com.avito.android.universal_map.map.point_info.a> f306079m0;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.geo.j> f306080n;

        /* renamed from: n0, reason: collision with root package name */
        public final com.avito.android.universal_map.map_mvi.domain.m f306081n0;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC31503a> f306082o;

        /* renamed from: o0, reason: collision with root package name */
        public final com.avito.android.universal_map.map_mvi.domain.h f306083o0;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.location.find.d> f306084p;

        /* renamed from: p0, reason: collision with root package name */
        public final com.avito.android.universal_map.map.mvi.actor.f f306085p0;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.location.find.r> f306086q;

        /* renamed from: q0, reason: collision with root package name */
        public final dagger.internal.l f306087q0;

        /* renamed from: r, reason: collision with root package name */
        public final u<w> f306088r;

        /* renamed from: r0, reason: collision with root package name */
        public final u<com.avito.android.universal_map.map.pin_filters.a> f306089r0;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.location.find.o> f306090s;

        /* renamed from: s0, reason: collision with root package name */
        public final com.avito.android.universal_map.map.mvi.actor.b f306091s0;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC28481c> f306092t;

        /* renamed from: t0, reason: collision with root package name */
        public final com.avito.android.universal_map.map.mvi.actor.h f306093t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.l f306094u;

        /* renamed from: u0, reason: collision with root package name */
        public final u<com.avito.android.universal_map.map_mvi.pins.a> f306095u0;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.l f306096v;

        /* renamed from: v0, reason: collision with root package name */
        public final com.avito.android.universal_map.map.mvi.actor.r f306097v0;

        /* renamed from: w, reason: collision with root package name */
        public final u<String> f306098w;

        /* renamed from: w0, reason: collision with root package name */
        public final com.avito.android.universal_map.map.mvi.reducer.r f306099w0;

        /* renamed from: x, reason: collision with root package name */
        public final u<C28478k> f306100x;

        /* renamed from: x0, reason: collision with root package name */
        public final S f306101x0;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.universal_map.map.tracker.c> f306102y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.universal_map.map.common.marker.j> f306103z;

        /* compiled from: DaggerUniversalMapMviComponent.java */
        /* renamed from: com.avito.android.universal_map.map_mvi.di.a$c$a, reason: collision with other inner class name */
        public static final class C9404a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306104a;

            public C9404a(InterfaceC35314u interfaceC35314u) {
                this.f306104a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f306104a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class b implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306105a;

            public b(InterfaceC35314u interfaceC35314u) {
                this.f306105a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f306105a.El();
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        /* renamed from: com.avito.android.universal_map.map_mvi.di.a$c$c, reason: collision with other inner class name */
        public static final class C9405c implements u<InterfaceC14024a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306106a;

            public C9405c(InterfaceC35314u interfaceC35314u) {
                this.f306106a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14024a interfaceC14024aL = this.f306106a.L();
                t.c(interfaceC14024aL);
                return interfaceC14024aL;
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class d implements u<P> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306107a;

            public d(InterfaceC35314u interfaceC35314u) {
                this.f306107a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f306107a.E();
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class e implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f306108a;

            public e(cv.b bVar) {
                this.f306108a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f306108a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class f implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f306109a;

            public f(cv.b bVar) {
                this.f306109a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f306109a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class g implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306110a;

            public g(InterfaceC35314u interfaceC35314u) {
                this.f306110a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f306110a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class h implements u<com.avito.android.geo.j> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306111a;

            public h(InterfaceC35314u interfaceC35314u) {
                this.f306111a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo.j jVarC0 = this.f306111a.c0();
                t.c(jVarC0);
                return jVarC0;
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class i implements u<com.avito.android.onboarding_manager.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306112a;

            public i(InterfaceC35314u interfaceC35314u) {
                this.f306112a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.onboarding_manager.f fVarL0 = this.f306112a.l0();
                t.c(fVarL0);
                return fVarL0;
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class j implements u<z> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306113a;

            public j(InterfaceC35314u interfaceC35314u) {
                this.f306113a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                z zVarA = this.f306113a.A();
                t.c(zVarA);
                return zVarA;
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class k implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306114a;

            public k(InterfaceC35314u interfaceC35314u) {
                this.f306114a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f306114a.N();
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class l implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306115a;

            public l(InterfaceC35314u interfaceC35314u) {
                this.f306115a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f306115a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class m implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306116a;

            public m(InterfaceC35314u interfaceC35314u) {
                this.f306116a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f306116a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class n implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306117a;

            public n(InterfaceC35314u interfaceC35314u) {
                this.f306117a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f306117a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class o implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306118a;

            public o(InterfaceC35314u interfaceC35314u) {
                this.f306118a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f306118a.o();
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class p implements u<InterfaceC48553b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306119a;

            public p(InterfaceC35314u interfaceC35314u) {
                this.f306119a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48553b interfaceC48553bKg = this.f306119a.kg();
                t.c(interfaceC48553bKg);
                return interfaceC48553bKg;
            }
        }

        /* compiled from: DaggerUniversalMapMviComponent.java */
        public static final class q implements u<u3.g<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f306120a;

            public q(InterfaceC35314u interfaceC35314u) {
                this.f306120a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.g<SimpleTestGroupWithNone> gVarRa = this.f306120a.ra();
                t.c(gVarRa);
                return gVarRa;
            }
        }

        public c() {
            throw null;
        }

        public c(InterfaceC35314u interfaceC35314u, cv.b bVar, InterfaceC42698a interfaceC42698a, Context context, Resources resources, String str, String str2, String str3, Map map, Fragment fragment, r rVar, UniversalMapParams.TrackerSettings trackerSettings, ParametrizedEvent parametrizedEvent, List list, String str4, Long l12, String str5, UniversalMapParams.MapSettings mapSettings, Y41.l lVar, C9403a c9403a) {
            this.f306054a = interfaceC35314u;
            this.f306056b = interfaceC42698a;
            this.f306058c = dagger.internal.l.a(context);
            u<com.avito.android.universal_map.map.common.marker.d> uVarD = dagger.internal.g.d(com.avito.android.universal_map.map.common.marker.g.a());
            this.f306060d = uVarD;
            this.f306062e = dagger.internal.g.d(new com.avito.android.universal_map.map.common.marker.c(this.f306058c, uVarD));
            this.f306064f = dagger.internal.g.d(com.avito.android.universal_map.map_mvi.di.module.d.a());
            u<com.avito.android.permissions.q> uVarD2 = dagger.internal.g.d(new s(new k(interfaceC35314u), new j(interfaceC35314u)));
            this.f306070i = uVarD2;
            this.f306072j = dagger.internal.g.d(new com.avito.android.permissions.p(uVarD2));
            C9404a c9404a = new C9404a(interfaceC35314u);
            this.f306074k = c9404a;
            this.f306078m = dagger.internal.g.d(C43693c.a(c9404a, new n(interfaceC35314u)));
            h hVar = new h(interfaceC35314u);
            this.f306080n = hVar;
            u<InterfaceC31503a> uVarD3 = dagger.internal.g.d(C47017h.a(hVar));
            this.f306082o = uVarD3;
            this.f306084p = dagger.internal.g.d(C47018i.a(uVarD3));
            u<com.avito.android.location.find.r> uVarD4 = dagger.internal.g.d(v.a(this.f306080n));
            this.f306086q = uVarD4;
            u<w> uVarD5 = dagger.internal.g.d(y.a(uVarD4));
            this.f306088r = uVarD5;
            this.f306090s = dagger.internal.g.d(com.avito.android.location.find.q.a(uVarD5, this.f306084p));
            this.f306092t = new m(interfaceC35314u);
            this.f306094u = dagger.internal.l.a(rVar);
            dagger.internal.l lVarA = dagger.internal.l.a(trackerSettings);
            this.f306096v = lVarA;
            u<String> uVarD6 = dagger.internal.g.d(new U(lVarA));
            this.f306098w = uVarD6;
            u<C28478k> uVarD7 = dagger.internal.g.d(new T(this.f306094u, uVarD6));
            this.f306100x = uVarD7;
            this.f306102y = dagger.internal.g.d(new W(this.f306096v, this.f306092t, uVarD7));
            this.f306103z = dagger.internal.g.d(new com.avito.android.universal_map.map.common.marker.l(this.f306058c, this.f306064f));
            u<AvitoMarkerIconFactory> uVarD8 = dagger.internal.g.d(new com.avito.android.universal_map.map_mvi.di.module.e(dagger.internal.l.a(fragment), com.avito.android.universal_map.map.common.marker.s.a()));
            this.f306028A = uVarD8;
            this.f306029B = dagger.internal.g.d(new com.avito.android.universal_map.map.mvi.reducer.c(uVarD8, this.f306103z));
            this.f306030C = new b(interfaceC35314u);
            this.f306031D = new e(bVar);
            this.f306032E = dagger.internal.g.d(com.avito.android.universal_map.map.di.G.a());
            this.f306033F = dagger.internal.g.d(B.a());
            this.f306035H = dagger.internal.g.d(new C(new i(interfaceC35314u)));
            this.f306036I = dagger.internal.g.d(com.avito.android.universal_map.map.di.z.a());
            this.f306037J = dagger.internal.g.d(H.a());
            this.f306038K = dagger.internal.g.d(E.a());
            this.f306039L = dagger.internal.g.d(com.avito.android.universal_map.map.di.y.a());
            this.f306040M = dagger.internal.g.d(com.avito.android.universal_map.map.di.A.a());
            u<com.avito.android.map_core.beduin.action_handler.k> uVarD9 = dagger.internal.g.d(D.a());
            this.f306041N = uVarD9;
            this.f306042O = dagger.internal.g.d(new C35316w(uVarD9, this.f306032E, this.f306033F, this.f306035H, this.f306036I, this.f306037J, this.f306038K, this.f306039L, this.f306040M));
            this.f306043P = new f(bVar);
            u<ScreenPerformanceTracker> uVarD10 = dagger.internal.g.d(new V(this.f306102y));
            this.f306044Q = uVarD10;
            this.f306045R = dagger.internal.g.d(new x(this.f306030C, this.f306031D, this.f306043P, uVarD10, this.f306042O, this.f306100x));
            this.f306046S = dagger.internal.g.d(com.avito.android.universal_map.map.mvi.reducer.l.a());
            A.b bVarA = A.a(1, 0);
            bVarA.f393937a.add(this.f306046S);
            this.f306047T = bVarA.b();
            this.f306048U = dagger.internal.l.b(l12);
            this.f306049V = new C9405c(interfaceC35314u);
            this.f306050W = dagger.internal.g.d(new com.avito.android.universal_map.map_mvi.di.module.h(this.f306045R));
            u<com.avito.android.universal_map.map_mvi.point_filters.a> uVarD11 = dagger.internal.g.d(new com.avito.android.universal_map.map_mvi.di.module.b(this.f306045R));
            this.f306051X = uVarD11;
            g gVar = new g(interfaceC35314u);
            this.f306052Y = gVar;
            this.f306055a0 = new com.avito.android.universal_map.map.mvi.n(this.f306048U, this.f306049V, this.f306045R, this.f306050W, uVarD11, gVar, new q(interfaceC35314u), this.f306037J, this.f306032E, this.f306035H, this.f306033F, this.f306040M, this.f306038K, this.f306039L, this.f306036I, this.f306041N);
            this.f306057b0 = dagger.internal.l.b(list);
            this.f306059c0 = dagger.internal.l.b(str4);
            this.f306061d0 = new d(interfaceC35314u);
            this.f306063e0 = dagger.internal.l.a(str);
            this.f306065f0 = dagger.internal.l.a(str5);
            this.f306067g0 = dagger.internal.g.d(new C35320h(this.f306074k, this.f306061d0, this.f306063e0, this.f306098w, this.f306065f0, dagger.internal.l.b(parametrizedEvent)));
            this.f306069h0 = dagger.internal.l.a(str2);
            this.f306071i0 = dagger.internal.l.a(map);
            p pVar = new p(interfaceC35314u);
            this.f306073j0 = pVar;
            o oVar = new o(interfaceC35314u);
            this.f306075k0 = oVar;
            l lVar2 = new l(interfaceC35314u);
            this.f306077l0 = lVar2;
            u<com.avito.android.universal_map.map.point_info.a> uVarD12 = dagger.internal.g.d(new com.avito.android.universal_map.map.point_info.f(pVar, oVar, lVar2, this.f306052Y, this.f306067g0));
            this.f306079m0 = uVarD12;
            this.f306081n0 = new com.avito.android.universal_map.map_mvi.domain.m(this.f306069h0, this.f306071i0, uVarD12, this.f306050W, this.f306075k0, this.f306067g0);
            this.f306083o0 = new com.avito.android.universal_map.map_mvi.domain.h(this.f306073j0, this.f306052Y, this.f306045R);
            this.f306085p0 = new com.avito.android.universal_map.map.mvi.actor.f(dagger.internal.l.b(mapSettings), this.f306052Y, this.f306081n0, this.f306083o0, this.f306045R);
            this.f306087q0 = dagger.internal.l.b(str3);
            u<com.avito.android.universal_map.map.pin_filters.a> uVarD13 = dagger.internal.g.d(new com.avito.android.universal_map.map.pin_filters.f(this.f306073j0, this.f306075k0, this.f306077l0, this.f306052Y, this.f306067g0));
            this.f306089r0 = uVarD13;
            com.avito.android.universal_map.map_mvi.domain.c cVar = new com.avito.android.universal_map.map_mvi.domain.c(this.f306087q0, this.f306071i0, uVarD13, this.f306051X, this.f306075k0, this.f306067g0);
            u<InterfaceC40691b> uVar = this.f306045R;
            u<R0> uVar2 = this.f306052Y;
            this.f306091s0 = new com.avito.android.universal_map.map.mvi.actor.b(cVar, uVar2, uVar);
            this.f306093t0 = new com.avito.android.universal_map.map.mvi.actor.h(this.f306081n0);
            u<com.avito.android.universal_map.map_mvi.pins.a> uVarD14 = dagger.internal.g.d(new com.avito.android.universal_map.map_mvi.pins.c(this.f306073j0, uVar2));
            this.f306095u0 = uVarD14;
            dagger.internal.l lVar3 = this.f306063e0;
            dagger.internal.l lVar4 = this.f306071i0;
            u<InterfaceC35318f> uVar3 = this.f306067g0;
            com.avito.android.universal_map.map_mvi.domain.r rVar2 = new com.avito.android.universal_map.map_mvi.domain.r(lVar3, lVar4, uVarD14, uVar3, this.f306075k0);
            u<InterfaceC40691b> uVar4 = this.f306045R;
            this.f306097v0 = new com.avito.android.universal_map.map.mvi.actor.r(this.f306057b0, this.f306059c0, uVar3, uVar4, this.f306085p0, this.f306091s0, this.f306093t0, new com.avito.android.universal_map.map.mvi.actor.l(rVar2, this.f306052Y, uVar4));
            this.f306099w0 = new com.avito.android.universal_map.map.mvi.reducer.r(new com.avito.android.universal_map.map.mvi.reducer.i(this.f306046S), com.avito.android.universal_map.map.mvi.reducer.f.a(), com.avito.android.universal_map.map.mvi.reducer.n.a(), com.avito.android.universal_map.map.mvi.reducer.p.a());
            this.f306101x0 = new S(this.f306045R, this.f306047T, new com.avito.android.universal_map.map.mvi.q(this.f306055a0, this.f306097v0, com.avito.android.universal_map.map.mvi.s.a(), this.f306099w0, this.f306044Q));
        }

        @Override // com.avito.android.universal_map.map_mvi.di.b
        public final void a(UniversalMapFragmentMvi universalMapFragmentMvi) {
            InterfaceC35314u interfaceC35314u = this.f306054a;
            InterfaceC28373a interfaceC28373aA = interfaceC35314u.a();
            t.c(interfaceC28373aA);
            universalMapFragmentMvi.f305976o0 = interfaceC28373aA;
            universalMapFragmentMvi.f305977p0 = this.f306062e.get();
            universalMapFragmentMvi.f305978q0 = this.f306064f.get();
            universalMapFragmentMvi.f305979r0 = interfaceC35314u.h();
            universalMapFragmentMvi.f305980s0 = this.f306072j.get();
            universalMapFragmentMvi.f305981t0 = this.f306078m.get();
            universalMapFragmentMvi.f305982u0 = this.f306090s.get();
            universalMapFragmentMvi.f305983v0 = this.f306102y.get();
            universalMapFragmentMvi.f305984w0 = this.f306029B.get();
            InterfaceC19564a interfaceC19564aVg = this.f306056b.Vg();
            t.c(interfaceC19564aVg);
            universalMapFragmentMvi.f305985x0 = interfaceC19564aVg;
            universalMapFragmentMvi.f305986y0 = this.f306101x0;
            com.avito.android.util.text.a aVarE = interfaceC35314u.e();
            t.c(aVarE);
            universalMapFragmentMvi.f305964E0 = aVarE;
            universalMapFragmentMvi.f305965F0 = interfaceC35314u.sd();
            universalMapFragmentMvi.f305966G0 = interfaceC35314u.Ad();
            universalMapFragmentMvi.f305968I0 = interfaceC35314u.bf();
        }
    }

    public static b.a a() {
        return new b();
    }
}
