package com.avito.android.universal_map.map.di;

import Hr.InterfaceC14024a;
import Vi.C15684a;
import Zi.InterfaceC19564a;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.location.find.InterfaceC31503a;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.universal_map.map.C35320h;
import com.avito.android.universal_map.map.InterfaceC35318f;
import com.avito.android.universal_map.map.UniversalMapFragment;
import com.avito.android.universal_map.map.di.A;
import com.avito.android.universal_map.map.di.B;
import com.avito.android.universal_map.map.di.D;
import com.avito.android.universal_map.map.di.E;
import com.avito.android.universal_map.map.di.G;
import com.avito.android.universal_map.map.di.H;
import com.avito.android.universal_map.map.di.InterfaceC35313t;
import com.avito.android.universal_map.map.di.J;
import com.avito.android.universal_map.map.di.y;
import com.avito.android.universal_map.map.di.z;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dj.InterfaceC39737b;
import gj.InterfaceC40691b;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kj.InterfaceC42698a;
import lW.C43693c;
import lW.InterfaceC43691a;
import oG0.C44639c;
import oG0.InterfaceC44637a;
import pW.C47017h;
import pW.C47018i;
import tG0.InterfaceC48553b;

/* compiled from: DaggerUniversalMapComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.universal_map.map.di.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35298d {

    /* compiled from: DaggerUniversalMapComponent.java */
    /* renamed from: com.avito.android.universal_map.map.di.d$b */
    public static final class b implements InterfaceC35313t.a {
        public b() {
        }

        @Override // com.avito.android.universal_map.map.di.InterfaceC35313t.a
        public final InterfaceC35313t a(Context context, Resources resources, String str, String str2, String str3, Map map, UniversalMapFragment universalMapFragment, com.avito.android.analytics.screens.r rVar, UniversalMapParams.TrackerSettings trackerSettings, ParametrizedEvent parametrizedEvent, List list, String str4, Long l12, String str5, UniversalMapParams.MapSettings mapSettings, InterfaceC39417a interfaceC39417a, InterfaceC42698a interfaceC42698a, InterfaceC35314u interfaceC35314u) {
            str.getClass();
            str2.getClass();
            map.getClass();
            trackerSettings.getClass();
            interfaceC39417a.getClass();
            interfaceC42698a.getClass();
            return new c(new C35302h(), interfaceC35314u, interfaceC39417a, interfaceC42698a, context, resources, str, str2, str3, map, universalMapFragment, rVar, trackerSettings, parametrizedEvent, list, str4, l12, str5, mapSettings, null);
        }
    }

    /* compiled from: DaggerUniversalMapComponent.java */
    /* renamed from: com.avito.android.universal_map.map.di.d$c */
    public static final class c implements InterfaceC35313t {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map.common.marker.j> f305046A;

        /* renamed from: A0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map.point_info.a> f305047A0;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.l f305048B;

        /* renamed from: B0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC39737b> f305049B0;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<oG0.g> f305050C;

        /* renamed from: C0, reason: collision with root package name */
        public final com.avito.android.universal_map.map.point_info.p f305051C0;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<oG0.f> f305052D;

        /* renamed from: D0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map.point_info.n> f305053D0;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<gj.d> f305054E;

        /* renamed from: E0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map.pin_filters.a> f305055E0;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f305056F;

        /* renamed from: F0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map.pin_filters.j> f305057F0;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<C15684a> f305058G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.map_core.beduin.action_handler.g> f305059H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.onboarding_manager.f> f305060I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.map_core.beduin.action_handler.i> f305061J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.map_core.beduin.action_handler.c> f305062K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.map_core.beduin.action_handler.o> f305063L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.map_core.beduin.action_handler.m> f305064M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.map_core.beduin.action_handler.a> f305065N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.map_core.beduin.action_handler.e> f305066O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.map_core.beduin.action_handler.k> f305067P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<Set<gj.f<?>>> f305068Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<a.b> f305069R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f305070S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC40691b> f305071T;

        /* renamed from: U, reason: collision with root package name */
        public final C35303i f305072U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.l f305073V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14024a> f305074W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map_mvi.point_info.a> f305075X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map_mvi.point_filters.a> f305076Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<R0> f305077Z;

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC35314u f305078a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<u3.g<SimpleTestGroupWithNone>> f305079a0;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f305080b;

        /* renamed from: b0, reason: collision with root package name */
        public final com.avito.android.universal_map.map.mvi.n f305081b0;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map.common.marker.d> f305082c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.l f305083c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map.common.marker.a> f305084d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.l f305085d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<AvitoMapAttachHelper> f305086e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.P> f305087e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.G> f305088f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.l f305089f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.z> f305090g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35318f> f305091g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.q> f305092h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map_mvi.domain.k> f305093h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33034d> f305094i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map_mvi.domain.f> f305095i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f305096j;

        /* renamed from: j0, reason: collision with root package name */
        public final com.avito.android.universal_map.map.mvi.actor.f f305097j0;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.f> f305098k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map_mvi.domain.a> f305099k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC43691a> f305100l;

        /* renamed from: l0, reason: collision with root package name */
        public final com.avito.android.universal_map.map.mvi.actor.b f305101l0;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.geo.j> f305102m;

        /* renamed from: m0, reason: collision with root package name */
        public final com.avito.android.universal_map.map.mvi.actor.h f305103m0;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31503a> f305104n;

        /* renamed from: n0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map_mvi.domain.p> f305105n0;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.d> f305106o;

        /* renamed from: o0, reason: collision with root package name */
        public final com.avito.android.universal_map.map.mvi.actor.r f305107o0;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.r> f305108p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map.mvi.reducer.j> f305109p0;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.w> f305110q;

        /* renamed from: q0, reason: collision with root package name */
        public final com.avito.android.universal_map.map.mvi.reducer.r f305111q0;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.o> f305112r;

        /* renamed from: r0, reason: collision with root package name */
        public final com.avito.android.universal_map.map.S f305113r0;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.l f305114s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC48553b> f305115s0;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<AvitoMarkerIconFactory> f305116t;

        /* renamed from: t0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.remote.error.f> f305117t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f305118u;

        /* renamed from: u0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f305119u0;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.l f305120v;

        /* renamed from: v0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map.J> f305121v0;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.l f305122w;

        /* renamed from: w0, reason: collision with root package name */
        public final dagger.internal.l f305123w0;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<String> f305124x;

        /* renamed from: x0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC19564a> f305125x0;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<C28478k> f305126y;

        /* renamed from: y0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC44637a> f305127y0;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map.tracker.c> f305128z;

        /* renamed from: z0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.universal_map.map.T> f305129z0;

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$a */
        public static final class a implements dagger.internal.u<InterfaceC19564a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC42698a f305130a;

            public a(InterfaceC42698a interfaceC42698a) {
                this.f305130a = interfaceC42698a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19564a interfaceC19564aVg = this.f305130a.Vg();
                dagger.internal.t.c(interfaceC19564aVg);
                return interfaceC19564aVg;
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$b */
        public static final class b implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305131a;

            public b(InterfaceC35314u interfaceC35314u) {
                this.f305131a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f305131a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$c, reason: collision with other inner class name */
        public static final class C9365c implements dagger.internal.u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305132a;

            public C9365c(InterfaceC35314u interfaceC35314u) {
                this.f305132a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f305132a.El();
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$d, reason: collision with other inner class name */
        public static final class C9366d implements dagger.internal.u<InterfaceC39737b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305133a;

            public C9366d(InterfaceC35314u interfaceC35314u) {
                this.f305133a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f305133a.Yb();
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$e */
        public static final class e implements dagger.internal.u<InterfaceC14024a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305134a;

            public e(InterfaceC35314u interfaceC35314u) {
                this.f305134a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14024a interfaceC14024aL = this.f305134a.L();
                dagger.internal.t.c(interfaceC14024aL);
                return interfaceC14024aL;
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$f */
        public static final class f implements dagger.internal.u<com.avito.android.P> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305135a;

            public f(InterfaceC35314u interfaceC35314u) {
                this.f305135a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f305135a.E();
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$g */
        public static final class g implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f305136a;

            public g(cv.b bVar) {
                this.f305136a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f305136a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$h */
        public static final class h implements dagger.internal.u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f305137a;

            public h(cv.b bVar) {
                this.f305137a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f305137a.b();
                dagger.internal.t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$i */
        public static final class i implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305138a;

            public i(InterfaceC35314u interfaceC35314u) {
                this.f305138a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f305138a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$j */
        public static final class j implements dagger.internal.u<com.avito.android.geo.j> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305139a;

            public j(InterfaceC35314u interfaceC35314u) {
                this.f305139a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo.j jVarC0 = this.f305139a.c0();
                dagger.internal.t.c(jVarC0);
                return jVarC0;
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$k */
        public static final class k implements dagger.internal.u<com.avito.android.onboarding_manager.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305140a;

            public k(InterfaceC35314u interfaceC35314u) {
                this.f305140a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.onboarding_manager.f fVarL0 = this.f305140a.l0();
                dagger.internal.t.c(fVarL0);
                return fVarL0;
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$l */
        public static final class l implements dagger.internal.u<com.avito.android.permissions.z> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305141a;

            public l(InterfaceC35314u interfaceC35314u) {
                this.f305141a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.permissions.z zVarA = this.f305141a.A();
                dagger.internal.t.c(zVarA);
                return zVarA;
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$m */
        public static final class m implements dagger.internal.u<com.avito.android.permissions.G> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305142a;

            public m(InterfaceC35314u interfaceC35314u) {
                this.f305142a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f305142a.N();
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$n */
        public static final class n implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305143a;

            public n(InterfaceC35314u interfaceC35314u) {
                this.f305143a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f305143a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$o */
        public static final class o implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305144a;

            public o(InterfaceC35314u interfaceC35314u) {
                this.f305144a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f305144a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$p */
        public static final class p implements dagger.internal.u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305145a;

            public p(InterfaceC35314u interfaceC35314u) {
                this.f305145a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f305145a.l();
                dagger.internal.t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$q */
        public static final class q implements dagger.internal.u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305146a;

            public q(InterfaceC35314u interfaceC35314u) {
                this.f305146a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f305146a.o();
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$r */
        public static final class r implements dagger.internal.u<InterfaceC48553b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305147a;

            public r(InterfaceC35314u interfaceC35314u) {
                this.f305147a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48553b interfaceC48553bKg = this.f305147a.kg();
                dagger.internal.t.c(interfaceC48553bKg);
                return interfaceC48553bKg;
            }
        }

        /* compiled from: DaggerUniversalMapComponent.java */
        /* renamed from: com.avito.android.universal_map.map.di.d$c$s */
        public static final class s implements dagger.internal.u<u3.g<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC35314u f305148a;

            public s(InterfaceC35314u interfaceC35314u) {
                this.f305148a = interfaceC35314u;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.g<SimpleTestGroupWithNone> gVarRa = this.f305148a.ra();
                dagger.internal.t.c(gVarRa);
                return gVarRa;
            }
        }

        public c() {
            throw null;
        }

        public c(C35302h c35302h, InterfaceC35314u interfaceC35314u, cv.b bVar, InterfaceC42698a interfaceC42698a, Context context, Resources resources, String str, String str2, String str3, Map map, Fragment fragment, com.avito.android.analytics.screens.r rVar, UniversalMapParams.TrackerSettings trackerSettings, ParametrizedEvent parametrizedEvent, List list, String str4, Long l12, String str5, UniversalMapParams.MapSettings mapSettings, a aVar) {
            this.f305078a = interfaceC35314u;
            this.f305080b = dagger.internal.l.a(context);
            dagger.internal.u<com.avito.android.universal_map.map.common.marker.d> uVarD = dagger.internal.g.d(com.avito.android.universal_map.map.common.marker.g.a());
            this.f305082c = uVarD;
            this.f305084d = dagger.internal.g.d(new com.avito.android.universal_map.map.common.marker.c(this.f305080b, uVarD));
            this.f305086e = dagger.internal.g.d(J.a.f305026a);
            dagger.internal.u<com.avito.android.permissions.q> uVarD2 = dagger.internal.g.d(new com.avito.android.permissions.s(new m(interfaceC35314u), new l(interfaceC35314u)));
            this.f305092h = uVarD2;
            this.f305094i = dagger.internal.g.d(new com.avito.android.permissions.p(uVarD2));
            b bVar2 = new b(interfaceC35314u);
            this.f305096j = bVar2;
            this.f305100l = dagger.internal.g.d(C43693c.a(bVar2, new p(interfaceC35314u)));
            j jVar = new j(interfaceC35314u);
            this.f305102m = jVar;
            dagger.internal.u<InterfaceC31503a> uVarD3 = dagger.internal.g.d(C47017h.a(jVar));
            this.f305104n = uVarD3;
            this.f305106o = dagger.internal.g.d(C47018i.a(uVarD3));
            dagger.internal.u<com.avito.android.location.find.r> uVarD4 = dagger.internal.g.d(com.avito.android.location.find.v.a(this.f305102m));
            this.f305108p = uVarD4;
            dagger.internal.u<com.avito.android.location.find.w> uVarD5 = dagger.internal.g.d(com.avito.android.location.find.y.a(uVarD4));
            this.f305110q = uVarD5;
            this.f305112r = dagger.internal.g.d(com.avito.android.location.find.q.a(uVarD5, this.f305106o));
            dagger.internal.l lVarA = dagger.internal.l.a(fragment);
            this.f305114s = lVarA;
            this.f305116t = dagger.internal.g.d(new K(lVarA, com.avito.android.universal_map.map.common.marker.s.a()));
            this.f305118u = new o(interfaceC35314u);
            this.f305120v = dagger.internal.l.a(rVar);
            dagger.internal.l lVarA2 = dagger.internal.l.a(trackerSettings);
            this.f305122w = lVarA2;
            dagger.internal.u<String> uVarD6 = dagger.internal.g.d(new U(lVarA2));
            this.f305124x = uVarD6;
            dagger.internal.u<C28478k> uVarD7 = dagger.internal.g.d(new T(this.f305120v, uVarD6));
            this.f305126y = uVarD7;
            this.f305128z = dagger.internal.g.d(new W(this.f305122w, this.f305118u, uVarD7));
            this.f305046A = dagger.internal.g.d(new com.avito.android.universal_map.map.common.marker.l(this.f305080b, this.f305086e));
            dagger.internal.l lVarB = dagger.internal.l.b(parametrizedEvent);
            this.f305048B = lVarB;
            dagger.internal.u<oG0.g> uVarD8 = dagger.internal.g.d(new oG0.h(lVarB, this.f305046A, this.f305096j));
            this.f305050C = uVarD8;
            this.f305052D = dagger.internal.g.d(new L(this.f305114s, uVarD8));
            this.f305054E = new C9365c(interfaceC35314u);
            this.f305056F = new g(bVar);
            this.f305058G = dagger.internal.g.d(G.a.f305023a);
            this.f305059H = dagger.internal.g.d(B.a.f305017a);
            this.f305061J = dagger.internal.g.d(new C(new k(interfaceC35314u)));
            this.f305062K = dagger.internal.g.d(z.a.f305170a);
            this.f305063L = dagger.internal.g.d(H.a.f305024a);
            this.f305064M = dagger.internal.g.d(E.a.f305020a);
            this.f305065N = dagger.internal.g.d(y.a.f305169a);
            this.f305066O = dagger.internal.g.d(A.a.f305016a);
            dagger.internal.u<com.avito.android.map_core.beduin.action_handler.k> uVarD9 = dagger.internal.g.d(D.a.f305019a);
            this.f305067P = uVarD9;
            this.f305068Q = dagger.internal.g.d(new C35316w(uVarD9, this.f305058G, this.f305059H, this.f305061J, this.f305062K, this.f305063L, this.f305064M, this.f305065N, this.f305066O));
            this.f305069R = new h(bVar);
            dagger.internal.u<ScreenPerformanceTracker> uVarD10 = dagger.internal.g.d(new V(this.f305128z));
            this.f305070S = uVarD10;
            this.f305071T = dagger.internal.g.d(new x(this.f305054E, this.f305056F, this.f305069R, uVarD10, this.f305068Q, this.f305126y));
            this.f305072U = new C35303i(c35302h);
            this.f305073V = dagger.internal.l.b(l12);
            this.f305074W = new e(interfaceC35314u);
            this.f305075X = dagger.internal.g.d(new C35305k(c35302h));
            dagger.internal.u<com.avito.android.universal_map.map_mvi.point_filters.a> uVarD11 = dagger.internal.g.d(new C35304j(c35302h));
            this.f305076Y = uVarD11;
            i iVar = new i(interfaceC35314u);
            this.f305077Z = iVar;
            this.f305081b0 = new com.avito.android.universal_map.map.mvi.n(this.f305073V, this.f305074W, this.f305071T, this.f305075X, uVarD11, iVar, new s(interfaceC35314u), this.f305063L, this.f305058G, this.f305061J, this.f305059H, this.f305066O, this.f305064M, this.f305065N, this.f305062K, this.f305067P);
            this.f305083c0 = dagger.internal.l.b(list);
            this.f305085d0 = dagger.internal.l.b(str4);
            this.f305087e0 = new f(interfaceC35314u);
            this.f305089f0 = dagger.internal.l.a(str);
            this.f305091g0 = dagger.internal.g.d(new C35320h(this.f305096j, this.f305087e0, this.f305089f0, this.f305124x, dagger.internal.l.a(str5), this.f305048B));
            this.f305093h0 = dagger.internal.g.d(com.avito.android.universal_map.map_mvi.domain.o.a());
            this.f305095i0 = dagger.internal.g.d(com.avito.android.universal_map.map_mvi.domain.j.a());
            this.f305097j0 = new com.avito.android.universal_map.map.mvi.actor.f(dagger.internal.l.b(mapSettings), this.f305077Z, this.f305093h0, this.f305095i0, this.f305071T);
            dagger.internal.u<com.avito.android.universal_map.map_mvi.domain.a> uVarD12 = dagger.internal.g.d(com.avito.android.universal_map.map_mvi.domain.e.a());
            this.f305099k0 = uVarD12;
            this.f305101l0 = new com.avito.android.universal_map.map.mvi.actor.b(uVarD12, this.f305077Z, this.f305071T);
            this.f305103m0 = new com.avito.android.universal_map.map.mvi.actor.h(this.f305093h0);
            dagger.internal.u<com.avito.android.universal_map.map_mvi.domain.p> uVarD13 = dagger.internal.g.d(com.avito.android.universal_map.map_mvi.domain.t.a());
            this.f305105n0 = uVarD13;
            dagger.internal.u<InterfaceC40691b> uVar = this.f305071T;
            this.f305107o0 = new com.avito.android.universal_map.map.mvi.actor.r(this.f305083c0, this.f305085d0, this.f305091g0, uVar, this.f305097j0, this.f305101l0, this.f305103m0, new com.avito.android.universal_map.map.mvi.actor.l(uVarD13, this.f305077Z, uVar));
            dagger.internal.u<com.avito.android.universal_map.map.mvi.reducer.j> uVarD14 = dagger.internal.g.d(com.avito.android.universal_map.map.mvi.reducer.l.a());
            this.f305109p0 = uVarD14;
            this.f305111q0 = new com.avito.android.universal_map.map.mvi.reducer.r(new com.avito.android.universal_map.map.mvi.reducer.i(uVarD14), com.avito.android.universal_map.map.mvi.reducer.f.a(), com.avito.android.universal_map.map.mvi.reducer.n.a(), com.avito.android.universal_map.map.mvi.reducer.p.a());
            this.f305113r0 = new com.avito.android.universal_map.map.S(this.f305071T, this.f305072U, new com.avito.android.universal_map.map.mvi.q(this.f305081b0, this.f305107o0, com.avito.android.universal_map.map.mvi.s.a(), this.f305111q0, this.f305070S));
            r rVar2 = new r(interfaceC35314u);
            this.f305115s0 = rVar2;
            q qVar = new q(interfaceC35314u);
            this.f305117t0 = qVar;
            n nVar = new n(interfaceC35314u);
            this.f305119u0 = nVar;
            this.f305121v0 = dagger.internal.g.d(new com.avito.android.universal_map.map.P(rVar2, qVar, nVar, this.f305091g0));
            this.f305123w0 = dagger.internal.l.a(map);
            this.f305125x0 = new a(interfaceC42698a);
            dagger.internal.u<InterfaceC44637a> uVarD15 = dagger.internal.g.d(new C44639c(dagger.internal.l.a(resources)));
            this.f305127y0 = uVarD15;
            this.f305129z0 = dagger.internal.g.d(new F(this.f305114s, new com.avito.android.universal_map.map.V(this.f305121v0, this.f305089f0, this.f305123w0, this.f305083c0, this.f305085d0, this.f305125x0, this.f305071T, this.f305059H, this.f305061J, this.f305062K, this.f305064M, this.f305065N, this.f305066O, this.f305067P, uVarD15, this.f305119u0, this.f305128z)));
            this.f305047A0 = dagger.internal.g.d(new com.avito.android.universal_map.map.point_info.f(this.f305115s0, this.f305117t0, this.f305119u0, this.f305077Z, this.f305091g0));
            dagger.internal.l lVarA3 = dagger.internal.l.a(str2);
            C9366d c9366d = new C9366d(interfaceC35314u);
            this.f305049B0 = c9366d;
            this.f305051C0 = new com.avito.android.universal_map.map.point_info.p(lVarA3, this.f305123w0, this.f305047A0, this.f305119u0, this.f305127y0, this.f305071T, c9366d, this.f305128z, this.f305063L);
            this.f305053D0 = dagger.internal.g.d(new Q(this.f305114s, this.f305051C0));
            this.f305055E0 = dagger.internal.g.d(new com.avito.android.universal_map.map.pin_filters.f(this.f305115s0, this.f305117t0, this.f305119u0, this.f305077Z, this.f305091g0));
            this.f305057F0 = dagger.internal.g.d(new N(this.f305114s, new com.avito.android.universal_map.map.pin_filters.l(dagger.internal.l.b(str3), this.f305123w0, this.f305055E0, this.f305058G, this.f305119u0, this.f305127y0, this.f305049B0, this.f305071T, this.f305128z)));
        }

        @Override // com.avito.android.universal_map.map.di.InterfaceC35313t
        public final void a(UniversalMapFragment universalMapFragment) {
            InterfaceC35314u interfaceC35314u = this.f305078a;
            InterfaceC28373a interfaceC28373aA = interfaceC35314u.a();
            dagger.internal.t.c(interfaceC28373aA);
            universalMapFragment.f304863o0 = interfaceC28373aA;
            universalMapFragment.f304864p0 = this.f305084d.get();
            universalMapFragment.f304865q0 = this.f305086e.get();
            universalMapFragment.f304866r0 = interfaceC35314u.h();
            universalMapFragment.f304867s0 = this.f305094i.get();
            universalMapFragment.f304868t0 = this.f305100l.get();
            universalMapFragment.f304869u0 = this.f305112r.get();
            interfaceC35314u.W();
            universalMapFragment.f304870v0 = this.f305116t.get();
            InterfaceC35745a5 interfaceC35745a5D = interfaceC35314u.d();
            dagger.internal.t.c(interfaceC35745a5D);
            universalMapFragment.f304871w0 = interfaceC35745a5D;
            universalMapFragment.f304872x0 = this.f305128z.get();
            universalMapFragment.f304873y0 = this.f305052D.get();
            universalMapFragment.f304839A0 = this.f305113r0;
            universalMapFragment.f304841C0 = this.f305129z0.get();
            universalMapFragment.f304842D0 = this.f305053D0.get();
            universalMapFragment.f304844F0 = this.f305057F0.get();
            com.avito.android.util.text.a aVarE = interfaceC35314u.e();
            dagger.internal.t.c(aVarE);
            universalMapFragment.f304847I0 = aVarE;
            universalMapFragment.f304848J0 = interfaceC35314u.sd();
            universalMapFragment.f304849K0 = interfaceC35314u.Ad();
            universalMapFragment.f304851M0 = interfaceC35314u.bf();
        }
    }

    public static InterfaceC35313t.a a() {
        return new b();
    }
}
