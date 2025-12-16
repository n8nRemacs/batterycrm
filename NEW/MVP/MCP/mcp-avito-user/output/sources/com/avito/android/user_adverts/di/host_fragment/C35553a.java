package com.avito.android.user_adverts.di.host_fragment;

import Wl0.InterfaceC15774a;
import Zx.C19616a;
import android.app.Application;
import android.content.res.Resources;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import androidx.view.T0;
import b70.InterfaceC25423a;
import bW.InterfaceC25571b;
import bj.InterfaceC25659b;
import bm0.InterfaceC25677b;
import cJ0.InterfaceC27054h;
import cU.s;
import com.avito.android.P;
import com.avito.android.Z0;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.personal_banner.feature.factory.b;
import com.avito.android.personal_selections.di.c;
import com.avito.android.position_in_search.storage.provider.c;
import com.avito.android.remote.q1;
import com.avito.android.seller_coach.hints_dialog.view.h;
import com.avito.android.user_adverts.di.host_fragment.F;
import com.avito.android.user_adverts.di.host_fragment.z;
import com.avito.android.user_adverts.root_screen.adverts_host.O;
import com.avito.android.user_adverts.root_screen.adverts_host.TabItem;
import com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment;
import com.avito.android.user_adverts.root_screen.adverts_host.binder.a;
import com.avito.android.user_adverts.root_screen.adverts_host.binder.e;
import com.avito.android.user_adverts.root_screen.adverts_host.binder.h;
import com.avito.android.user_adverts.root_screen.adverts_host.binder.o;
import com.avito.android.user_adverts.root_screen.adverts_host.binder.q;
import com.avito.android.user_adverts.root_screen.adverts_host.binder.u;
import com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.b;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.j;
import com.avito.android.user_adverts.root_screen.adverts_host.i0;
import com.avito.android.user_adverts.root_screen.adverts_host.k0;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.J;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.h;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.U;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.X;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.Z;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.b0;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.d0;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0;
import com.avito.android.user_adverts.space.UserAdvertsSpace;
import com.avito.android.user_adverts.tab_actions.host.f;
import com.avito.android.user_adverts.tab_actions.host.mvi.H;
import com.avito.android.user_adverts_common.ux_feedback.a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.common.collect.H1;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dj.InterfaceC39737b;
import dm0.InterfaceC39755a;
import hz.InterfaceC41196a;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import lJ0.InterfaceC43648d;
import n70.InterfaceC44207a;
import nE.C44240b;
import sI0.InterfaceC48055a;
import td.C48653a;
import uI0.C48907c;
import uI0.InterfaceC48905a;
import ud.C49037b;
import xJ0.InterfaceC49850b;
import zI0.C50472b;
import zI0.InterfaceC50474d;
import zq0.AbstractC50612a;

/* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.user_adverts.di.host_fragment.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35553a {

    /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
    /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$b */
    public static final class b implements z.a {
        public b() {
        }

        @Override // com.avito.android.user_adverts.di.host_fragment.z.a
        public final z a(B b12, InterfaceC39417a interfaceC39417a, com.avito.android.seller_coach.adverts_hint.provider.e eVar, com.avito.android.seller_coach.hints_dialog.provider.l lVar, UserAdvertsHostFragment userAdvertsHostFragment, UserAdvertsHostFragment userAdvertsHostFragment2, UserAdvertsHostFragment userAdvertsHostFragment3, com.avito.android.analytics.screens.r rVar, UI0.b bVar, Resources resources, BottomNavigationSpace bottomNavigationSpace) {
            interfaceC39417a.getClass();
            eVar.getClass();
            lVar.getClass();
            resources.getClass();
            return new c(new C35557b(), new x(), b12, interfaceC39417a, eVar, lVar, userAdvertsHostFragment, userAdvertsHostFragment2, userAdvertsHostFragment3, rVar, bVar, resources, bottomNavigationSpace, null);
        }
    }

    /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
    /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c */
    public static final class c implements com.avito.android.user_adverts.di.host_fragment.z {

        /* renamed from: A, reason: collision with root package name */
        public final U f311955A;

        /* renamed from: A0, reason: collision with root package name */
        public final dagger.internal.l f311956A0;

        /* renamed from: B, reason: collision with root package name */
        public final d0 f311957B;

        /* renamed from: B0, reason: collision with root package name */
        public final dagger.internal.l f311958B0;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.l f311959C;

        /* renamed from: C0, reason: collision with root package name */
        public final dagger.internal.l f311960C0;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<e0> f311961D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.adverts.n> f311962E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC48055a> f311963F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.i> f311964G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.c> f311965H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.f> f311966I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<Locale> f311967J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<JI0.a> f311968K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_persistence.f> f311969L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<C44240b> f311970M;

        /* renamed from: N, reason: collision with root package name */
        public final com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.h f311971N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.a> f311972O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<Application> f311973P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<AK0.i> f311974Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<cK0.b> f311975R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.f> f311976S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.i> f311977T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<AK0.l> f311978U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.c> f311979V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<FI0.a> f311980W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<CI0.a> f311981X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F> f311982Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<q1> f311983Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.user_adverts.di.host_fragment.B f311984a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f311985a0;

        /* renamed from: b, reason: collision with root package name */
        public final BottomNavigationSpace f311986b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC43648d> f311987b0;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f311988c;

        /* renamed from: c0, reason: collision with root package name */
        public final com.avito.android.user_adverts.root_screen.adverts_host.safety_info.f f311989c0;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.seller_coach.adverts_hint.provider.e f311990d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.safety_info.a> f311991d0;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.seller_coach.hints_dialog.provider.l f311992e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.charity.a> f311993e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f311994f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.charity_info.a> f311995f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f311996g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC25571b> f311997g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f311998h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.b> f311999h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f312000i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.a> f312001i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC25677b> f312002j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC48905a> f312003j0;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC39755a> f312004k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b> f312005k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<R0> f312006l;

        /* renamed from: l0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.delivery_restriction.a> f312007l0;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f312008m;

        /* renamed from: m0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC50474d> f312009m0;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.user_adverts.tab_actions.host.mvi.A f312010n;

        /* renamed from: n0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.adverts.n> f312011n0;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35863o4> f312012o;

        /* renamed from: o0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.adverts.n> f312013o0;

        /* renamed from: p, reason: collision with root package name */
        public final H f312014p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem>> f312015p0;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.user_adverts.tab_actions.host.k f312016q;

        /* renamed from: q0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_actions.host.items.e> f312017q0;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.l f312018r;

        /* renamed from: r0, reason: collision with root package name */
        public final dagger.internal.u<AbstractC50612a.InterfaceC12979a> f312019r0;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_actions.host.j> f312020s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.u<AbstractC50612a> f312021s0;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.account.plugin.rx.a> f312022t;

        /* renamed from: t0, reason: collision with root package name */
        public final com.avito.android.user_adverts.tab_actions.host.items.c f312023t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.account.E> f312024u;

        /* renamed from: u0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_actions.host.items.n> f312025u0;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC15774a> f312026v;

        /* renamed from: v0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f312027v0;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC41196a> f312028w;

        /* renamed from: w0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.h> f312029w0;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<Z0> f312030x;

        /* renamed from: x0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f312031x0;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.clientEventBus.a> f312032y;

        /* renamed from: y0, reason: collision with root package name */
        public final dagger.internal.l f312033y0;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<s90.b> f312034z;

        /* renamed from: z0, reason: collision with root package name */
        public final dagger.internal.u<SK0.b> f312035z0;

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$A */
        public static final class A implements dagger.internal.u<InterfaceC48055a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312036a;

            public A(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312036a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48055a interfaceC48055aA1 = this.f312036a.A1();
                dagger.internal.t.c(interfaceC48055aA1);
                return interfaceC48055aA1;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$B */
        public static final class B implements dagger.internal.u<InterfaceC15774a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312037a;

            public B(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312037a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC15774a interfaceC15774aE3 = this.f312037a.e3();
                dagger.internal.t.c(interfaceC15774aE3);
                return interfaceC15774aE3;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$C */
        public static final class C implements dagger.internal.u<q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312038a;

            public C(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312038a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                q1 q1VarR5 = this.f312038a.r5();
                dagger.internal.t.c(q1VarR5);
                return q1VarR5;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$D */
        public static final class D implements dagger.internal.u<C44240b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312039a;

            public D(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312039a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f312039a.a7();
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$E */
        public static final class E implements dagger.internal.u<CI0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312040a;

            public E(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312040a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f312040a.ql();
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$a, reason: collision with other inner class name */
        public static final class C9519a implements dagger.internal.u<com.avito.android.account.E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312041a;

            public C9519a(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312041a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.account.E eI2 = this.f312041a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$b, reason: case insensitive filesystem */
        public static final class C35554b implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312042a;

            public C35554b(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312042a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f312042a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$c, reason: collision with other inner class name */
        public static final class C9520c implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312043a;

            public C9520c(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312043a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f312043a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$d, reason: case insensitive filesystem */
        public static final class C35555d implements dagger.internal.u<com.avito.android.account.plugin.rx.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312044a;

            public C35555d(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312044a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.account.plugin.rx.a aVarV2 = this.f312044a.v2();
                dagger.internal.t.c(aVarV2);
                return aVarV2;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$e, reason: case insensitive filesystem */
        public static final class C35556e implements dagger.internal.u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312045a;

            public C35556e(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312045a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarP = this.f312045a.p();
                dagger.internal.t.c(bVarP);
                return bVarP;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$f */
        public static final class f implements dagger.internal.u<com.avito.android.charity.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312046a;

            public f(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312046a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f312046a.z7();
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$g */
        public static final class g implements dagger.internal.u<com.avito.android.clientEventBus.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312047a;

            public g(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312047a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.clientEventBus.a aVarH0 = this.f312047a.h0();
                dagger.internal.t.c(aVarH0);
                return aVarH0;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$h */
        public static final class h implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f312048a;

            public h(cv.b bVar) {
                this.f312048a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f312048a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$i */
        public static final class i implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312049a;

            public i(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312049a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f312049a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$j */
        public static final class j implements dagger.internal.u<InterfaceC41196a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312050a;

            public j(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312050a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41196a interfaceC41196aE0 = this.f312050a.E0();
                dagger.internal.t.c(interfaceC41196aE0);
                return interfaceC41196aE0;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$k */
        public static final class k implements dagger.internal.u<InterfaceC39755a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312051a;

            public k(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312051a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39755a interfaceC39755aRc = this.f312051a.Rc();
                dagger.internal.t.c(interfaceC39755aRc);
                return interfaceC39755aRc;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$l */
        public static final class l implements dagger.internal.u<InterfaceC25571b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312052a;

            public l(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312052a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25571b interfaceC25571bY4 = this.f312052a.Y4();
                dagger.internal.t.c(interfaceC25571bY4);
                return interfaceC25571bY4;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$m */
        public static final class m implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312053a;

            public m(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312053a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f312053a.locale();
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$n */
        public static final class n implements dagger.internal.u<Z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312054a;

            public n(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312054a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f312054a.W();
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$o */
        public static final class o implements dagger.internal.u<AK0.i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312055a;

            public o(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312055a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                AK0.i iVarQ2 = this.f312055a.q2();
                dagger.internal.t.c(iVarQ2);
                return iVarQ2;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$p */
        public static final class p implements dagger.internal.u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312056a;

            public p(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312056a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f312056a.r();
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$q */
        public static final class q implements dagger.internal.u<s90.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312057a;

            public q(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312057a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f312057a.w2();
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$r */
        public static final class r implements dagger.internal.u<AbstractC50612a.InterfaceC12979a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.seller_coach.adverts_hint.provider.e f312058a;

            public r(com.avito.android.seller_coach.adverts_hint.provider.e eVar) {
                this.f312058a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f312058a.b();
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$s */
        public static final class s implements dagger.internal.u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312059a;

            public s(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312059a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f312059a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$t */
        public static final class t implements dagger.internal.u<InterfaceC43648d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312060a;

            public t(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312060a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f312060a.I4();
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$u */
        public static final class u implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312061a;

            public u(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312061a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f312061a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$v */
        public static final class v implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312062a;

            public v(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312062a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f312062a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$w */
        public static final class w implements dagger.internal.u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312063a;

            public w(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312063a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f312063a.l();
                dagger.internal.t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$x */
        public static final class x implements dagger.internal.u<com.avito.android.service_booking_persistence.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312064a;

            public x(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312064a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f312064a.V2();
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$y */
        public static final class y implements dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312065a;

            public y(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312065a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f312065a.Yf();
            }
        }

        /* compiled from: DaggerUserAdvertsHostFragmentComponent.java */
        /* renamed from: com.avito.android.user_adverts.di.host_fragment.a$c$z */
        public static final class z implements dagger.internal.u<InterfaceC25677b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.di.host_fragment.B f312066a;

            public z(com.avito.android.user_adverts.di.host_fragment.B b12) {
                this.f312066a = b12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25677b interfaceC25677bTc = this.f312066a.tc();
                dagger.internal.t.c(interfaceC25677bTc);
                return interfaceC25677bTc;
            }
        }

        public c(C35557b c35557b, com.avito.android.user_adverts.di.host_fragment.x xVar, com.avito.android.user_adverts.di.host_fragment.B b12, cv.b bVar, com.avito.android.seller_coach.adverts_hint.provider.e eVar, com.avito.android.seller_coach.hints_dialog.provider.l lVar, InterfaceC22983P interfaceC22983P, InterfaceC23487e interfaceC23487e, T0 t02, com.avito.android.analytics.screens.r rVar, UI0.b bVar2, Resources resources, BottomNavigationSpace bottomNavigationSpace, C9518a c9518a) {
            this.f311984a = b12;
            this.f311986b = bottomNavigationSpace;
            this.f311988c = bVar;
            this.f311990d = eVar;
            this.f311992e = lVar;
            this.f311994f = dagger.internal.l.a(interfaceC23487e);
            this.f311996g = new v(b12);
            this.f311998h = dagger.internal.g.d(new com.avito.android.user_adverts.di.m(dagger.internal.l.a(rVar), this.f311996g));
            C35554b c35554b = new C35554b(b12);
            this.f312000i = c35554b;
            z zVar = new z(b12);
            k kVar = new k(b12);
            this.f312004k = kVar;
            i iVar = new i(b12);
            this.f312006l = iVar;
            this.f312010n = new com.avito.android.user_adverts.tab_actions.host.mvi.A(c35554b, new com.avito.android.user_adverts.tab_actions.host.domain.d(zVar, kVar, iVar), new h(bVar));
            s sVar = new s(b12);
            this.f312012o = sVar;
            this.f312014p = new H(new com.avito.android.user_adverts.tab_actions.host.converter.f(sVar));
            this.f312016q = new com.avito.android.user_adverts.tab_actions.host.k(this.f311994f, new com.avito.android.user_adverts.tab_actions.host.mvi.F(this.f311998h, this.f312010n, this.f312014p, new com.avito.android.user_adverts.tab_actions.host.mvi.C(com.avito.android.user_adverts.tab_actions.host.converter.c.a()), this.f312006l));
            dagger.internal.l lVarA = dagger.internal.l.a(t02);
            this.f312018r = lVarA;
            this.f312020s = dagger.internal.g.d(new WI0.f(this.f312016q, lVarA));
            C35555d c35555d = new C35555d(b12);
            this.f312022t = c35555d;
            C9519a c9519a = new C9519a(b12);
            this.f312024u = c9519a;
            B b13 = new B(b12);
            dagger.internal.u<R0> uVar = this.f312006l;
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.d dVar = new com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.d(b13, uVar);
            j jVar = new j(b12);
            this.f312028w = jVar;
            n nVar = new n(b12);
            this.f312030x = nVar;
            this.f311955A = new U(c35555d, c9519a, dVar, uVar, this.f312000i, jVar, nVar, new g(b12), new q(b12));
            this.f311957B = new d0(this.f312012o);
            this.f311959C = dagger.internal.l.a(bVar2);
            dagger.internal.u<e0> uVarD = dagger.internal.g.d(new com.avito.android.user_adverts.di.host_fragment.E(this.f312018r, new X(this.f311955A, this.f311957B, b0.a(), this.f312006l, this.f311959C, this.f311998h)));
            this.f311961D = uVarD;
            this.f311962E = dagger.internal.g.d(new Z(uVarD));
            A a12 = new A(b12);
            this.f311963F = a12;
            this.f311964G = dagger.internal.g.d(new com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.k(a12, this.f312006l));
            dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.c> uVarD2 = dagger.internal.g.d(new com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.e(this.f311963F, this.f312006l));
            this.f311965H = uVarD2;
            y yVar = new y(b12);
            dagger.internal.u<R0> uVar2 = this.f312006l;
            this.f311968K = dagger.internal.g.d(new com.avito.android.user_adverts.di.host_fragment.r(c35557b, this.f312018r, new com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.F(new com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.C(this.f312022t, this.f312024u, this.f311964G, uVarD2, uVar2, this.f312000i, this.f312028w, new com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.o(yVar, uVar2)), new J(new com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.h(new m(b12))), com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi.H.a(), this.f312006l)));
            x xVar2 = new x(b12);
            D d12 = new D(b12);
            this.f311970M = d12;
            this.f311971N = new com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.h(this.f311963F, this.f312006l, xVar2, d12);
            this.f311972O = dagger.internal.g.d(this.f311971N);
            dagger.internal.u<cK0.b> uVarD3 = dagger.internal.g.d(new cK0.d(new NJ0.c(new C9520c(b12), new o(b12))));
            this.f311975R = uVarD3;
            w wVar = new w(b12);
            this.f311976S = wVar;
            this.f311977T = dagger.internal.g.d(new com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.l(uVarD3, this.f312006l, wVar));
            p pVar = new p(b12);
            this.f311978U = pVar;
            dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.c> uVarD4 = dagger.internal.g.d(new com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.f(this.f312006l, new com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.i(pVar)));
            this.f311979V = uVarD4;
            this.f311980W = dagger.internal.g.d(new com.avito.android.user_adverts.di.host_fragment.q(c35557b, this.f312018r, new com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.z(new com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.w(uVarD4, this.f312022t, this.f312024u, this.f311972O, this.f311977T, this.f312006l, this.f312000i, this.f312028w), com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.D.a(), com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.B.a(), this.f312006l)));
            this.f311982Y = dagger.internal.g.d(new com.avito.android.user_adverts.di.host_fragment.u(c35557b, this.f312018r, new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.x(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.u(this.f311963F, this.f312006l, new E(b12), this.f312000i), com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.B.a(), com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.z.a(), this.f312006l)));
            C c12 = new C(b12);
            u uVar3 = new u(b12);
            this.f311985a0 = uVar3;
            this.f311989c0 = new com.avito.android.user_adverts.root_screen.adverts_host.safety_info.f(new com.avito.android.user_adverts_common.safety.h(c12, uVar3, new t(b12), this.f311976S), this.f312000i, this.f312024u, this.f312006l);
            this.f311991d0 = dagger.internal.g.d(new com.avito.android.user_adverts.di.host_fragment.t(c35557b, this.f312018r, this.f311989c0));
            this.f311995f0 = dagger.internal.g.d(new com.avito.android.user_adverts.di.host_fragment.n(c35557b, this.f312018r, new com.avito.android.user_adverts.root_screen.adverts_host.charity_info.e(new f(b12), this.f312006l, this.f312024u)));
            dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.b> uVarD5 = dagger.internal.g.d(new com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.d(this.f312006l, new l(b12), new com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.service_freemium_nps.i(this.f311978U)));
            this.f311999h0 = uVarD5;
            this.f312001i0 = dagger.internal.g.d(new com.avito.android.user_adverts.di.host_fragment.v(c35557b, this.f312018r, new com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.e(uVarD5, this.f312024u, this.f312006l)));
            this.f312003j0 = dagger.internal.g.d(new com.avito.android.user_adverts.di.host_fragment.m(c35557b, this.f312018r, new C48907c(this.f312024u, this.f311970M)));
            this.f312005k0 = dagger.internal.g.d(new com.avito.android.user_adverts.di.host_fragment.p(c35557b, this.f312018r, com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.d.a()));
            this.f312007l0 = dagger.internal.g.d(new com.avito.android.user_adverts.di.host_fragment.o(c35557b, this.f312018r, com.avito.android.user_adverts.root_screen.adverts_host.delivery_restriction.c.a()));
            dagger.internal.u<InterfaceC50474d> uVarD6 = dagger.internal.g.d(new com.avito.android.user_adverts.di.host_fragment.s(c35557b, this.f312018r, new com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.p(this.f311968K, this.f311980W, this.f311982Y, this.f311991d0, this.f311995f0, this.f312001i0, this.f312003j0, this.f312005k0, k0.a(), this.f312006l, this.f312030x, this.f312007l0, this.f311961D)));
            this.f312009m0 = uVarD6;
            this.f312011n0 = dagger.internal.g.d(new C50472b(uVarD6));
            A.b bVarA = dagger.internal.A.a(2, 0);
            dagger.internal.u<com.avito.android.user_adverts.tab_screens.adverts.n> uVar4 = this.f311962E;
            List<dagger.internal.u<T>> list = bVarA.f393937a;
            list.add(uVar4);
            list.add(this.f312011n0);
            this.f312013o0 = dagger.internal.g.d(new O(bVarA.b()));
            this.f312015p0 = dagger.internal.g.d(F.a.f311954a);
            this.f312017q0 = dagger.internal.g.d(new com.avito.android.user_adverts.tab_actions.host.items.i(new VI0.b(this.f311978U)));
            this.f312021s0 = dagger.internal.g.d(new com.avito.android.user_adverts.di.host_fragment.y(xVar, this.f312018r, new r(eVar)));
            this.f312023t0 = new com.avito.android.user_adverts.tab_actions.host.items.c(this.f312017q0);
            dagger.internal.u<com.avito.android.user_adverts.tab_actions.host.items.n> uVarD7 = dagger.internal.g.d(new com.avito.android.user_adverts.tab_actions.host.items.q(this.f312020s));
            this.f312025u0 = uVarD7;
            dagger.internal.u<com.avito.konveyor.a> uVarD8 = dagger.internal.g.d(new WI0.c(this.f312023t0, new com.avito.android.user_adverts.tab_actions.host.items.m(uVarD7)));
            this.f312027v0 = uVarD8;
            dagger.internal.u<com.avito.konveyor.adapter.h> uVarD9 = dagger.internal.g.d(new WI0.d(uVarD8));
            this.f312029w0 = uVarD9;
            dagger.internal.u<com.avito.konveyor.adapter.j> uVarD10 = dagger.internal.g.d(new WI0.e(uVarD9, this.f312027v0));
            this.f312031x0 = uVarD10;
            this.f312033y0 = dagger.internal.l.a(new com.avito.android.user_adverts.tab_actions.host.m(new com.avito.android.user_adverts.tab_actions.host.l(uVarD10, this.f312029w0, this.f311998h)));
            C35556e c35556e = new C35556e(b12);
            this.f312035z0 = c35556e;
            this.f311956A0 = dagger.internal.l.a(new com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.i(new com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.h(c35556e)));
            dagger.internal.u<SK0.b> uVar5 = this.f312035z0;
            dagger.internal.u<InterfaceC35745a5> uVar6 = this.f311985a0;
            com.avito.android.ux.feedback.impl.l.f319160c.getClass();
            this.f311958B0 = dagger.internal.l.a(new com.avito.android.user_adverts_common.ux_feedback.c(new com.avito.android.user_adverts_common.ux_feedback.b(new com.avito.android.ux.feedback.impl.l(uVar5, uVar6))));
            this.f311960C0 = dagger.internal.l.a(new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.m(new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.l(this.f311998h, this.f311970M, com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.d.a(), com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.l.a(), com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.c.a(), com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.i.a(), com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.d.a(), com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.j.a(), this.f312006l)));
        }

        @Override // kj.c
        public final gj.n Ad() {
            return this.f311984a.Ad();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final com.avito.android.passport.profile_add.l B3() {
            com.avito.android.passport.profile_add.l lVarB3 = this.f311984a.B3();
            dagger.internal.t.c(lVarB3);
            return lVarB3;
        }

        @Override // com.avito.android.user_adverts.di.host_fragment.z
        public final void Be(UserAdvertsHostFragment userAdvertsHostFragment) {
            UserAdvertsSpace userAdvertsSpace;
            com.avito.android.user_adverts.di.host_fragment.B b12 = this.f311984a;
            userAdvertsHostFragment.f312331t0 = b12.x();
            userAdvertsHostFragment.f312332u0 = b12.Id();
            userAdvertsHostFragment.f312333v0 = b12.Q8();
            cv.b bVar = this.f311988c;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            dagger.internal.t.c(aVarU4);
            userAdvertsHostFragment.f312334w0 = aVarU4;
            userAdvertsHostFragment.f312335x0 = this.f312015p0.get();
            InterfaceC28373a interfaceC28373aA = b12.a();
            dagger.internal.t.c(interfaceC28373aA);
            userAdvertsHostFragment.f312336y0 = interfaceC28373aA;
            userAdvertsHostFragment.f312337z0 = b12.z6();
            userAdvertsHostFragment.f312291A0 = this.f311998h.get();
            userAdvertsHostFragment.f312292B0 = this.f312020s.get();
            userAdvertsHostFragment.f312293C0 = this.f312017q0.get();
            userAdvertsHostFragment.f312294D0 = dagger.internal.g.a(this.f312009m0);
            userAdvertsHostFragment.f312295E0 = dagger.internal.g.a(this.f312005k0);
            userAdvertsHostFragment.f312296F0 = this.f312021s0.get();
            userAdvertsHostFragment.f312297G0 = b12.a7();
            userAdvertsHostFragment.f312298H0 = this.f311982Y.get();
            com.avito.android.util.text.a aVarE = b12.e();
            dagger.internal.t.c(aVarE);
            userAdvertsHostFragment.f312299I0 = aVarE;
            R0 r0C = b12.c();
            dagger.internal.t.c(r0C);
            userAdvertsHostFragment.f312300J0 = r0C;
            userAdvertsHostFragment.f312301K0 = (f.c) this.f312033y0.f393949a;
            userAdvertsHostFragment.f312302L0 = this.f311961D.get();
            userAdvertsHostFragment.f312303M0 = (b.InterfaceC9564b) this.f311956A0.f393949a;
            userAdvertsHostFragment.f312304N0 = (a.InterfaceC9795a) this.f311958B0.f393949a;
            R0 r0C2 = b12.c();
            dagger.internal.t.c(r0C2);
            InterfaceC28373a interfaceC28373aA2 = b12.a();
            dagger.internal.t.c(interfaceC28373aA2);
            P pE2 = b12.E();
            Application applicationK = b12.k();
            dagger.internal.t.c(applicationK);
            com.avito.android.app_rater.interactor.q qVar = new com.avito.android.app_rater.interactor.q(pE2, new com.avito.android.app_rater.interactor.b(applicationK));
            com.avito.android.app_rater.interactor.f fVar = new com.avito.android.app_rater.interactor.f(b12.E());
            com.avito.android.app_rater.interactor.t tVar = new com.avito.android.app_rater.interactor.t(b12.E());
            com.avito.android.app_rater.interactor.i iVar = new com.avito.android.app_rater.interactor.i(b12.E());
            P pE3 = b12.E();
            com.avito.android.deeplink_handler.handler.composite.a aVarU42 = bVar.u4();
            dagger.internal.t.c(aVarU42);
            userAdvertsHostFragment.f312305O0 = new com.avito.android.app_rater.b(r0C2, interfaceC28373aA2, new C48653a(H1.N(qVar, fVar, tVar, iVar, new com.avito.android.app_rater.interactor.k(pE3, aVarU42, new C49037b(b12.r())))), b12.E(), new C49037b(b12.r()));
            userAdvertsHostFragment.f312306P0 = (h.c) this.f311960C0.f393949a;
            userAdvertsHostFragment.f312307Q0 = this.f311990d.a();
            h.b bVarA = this.f311992e.a();
            dagger.internal.t.c(bVarA);
            userAdvertsHostFragment.f312308R0 = bVarA;
            new com.avito.android.user_adverts.space.a();
            com.avito.android.user_adverts.di.host_fragment.C.f311950a.getClass();
            int iOrdinal = this.f311986b.ordinal();
            if (iOrdinal == 0) {
                userAdvertsSpace = UserAdvertsSpace.f314189c;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                userAdvertsSpace = UserAdvertsSpace.f314190d;
            }
            dagger.internal.t.d(userAdvertsSpace);
            userAdvertsHostFragment.f312309S0 = userAdvertsSpace;
            ScreenPerformanceTracker screenPerformanceTracker = this.f311998h.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU43 = bVar.u4();
            dagger.internal.t.c(aVarU43);
            userAdvertsHostFragment.f312310T0 = new j.b(screenPerformanceTracker, aVarU43);
            e0 e0Var = this.f311961D.get();
            com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F f12 = this.f311982Y.get();
            FI0.a aVar = this.f311980W.get();
            JI0.a aVar2 = this.f311968K.get();
            com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b bVar2 = this.f312005k0.get();
            InterfaceC35863o4 interfaceC35863o4M = b12.m();
            dagger.internal.t.c(interfaceC35863o4M);
            com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.g gVar = new com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.g(interfaceC35863o4M);
            R0 r0C3 = b12.c();
            dagger.internal.t.c(r0C3);
            userAdvertsHostFragment.f312311U0 = new o.a(e0Var, f12, aVar, aVar2, bVar2, gVar, r0C3);
            com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.e eVar = new com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.e();
            R0 r0C4 = b12.c();
            dagger.internal.t.c(r0C4);
            userAdvertsHostFragment.f312312V0 = new h.a(eVar, r0C4);
            e0 e0Var2 = this.f311961D.get();
            R0 r0C5 = b12.c();
            dagger.internal.t.c(r0C5);
            userAdvertsHostFragment.f312313W0 = new q.a(e0Var2, r0C5, new com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.i());
            e0 e0Var3 = this.f311961D.get();
            R0 r0C6 = b12.c();
            dagger.internal.t.c(r0C6);
            userAdvertsHostFragment.f312314X0 = new u.a(e0Var3, r0C6, new com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.k());
            com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.c cVar = new com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.c();
            R0 r0C7 = b12.c();
            dagger.internal.t.c(r0C7);
            userAdvertsHostFragment.f312315Y0 = new e.a(cVar, r0C7);
            InterfaceC50474d interfaceC50474d = this.f312009m0.get();
            R0 r0C8 = b12.c();
            dagger.internal.t.c(r0C8);
            userAdvertsHostFragment.f312316Z0 = new a.C9535a(interfaceC50474d, r0C8, new com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.a());
        }

        @Override // kj.c
        public final gj.d El() {
            return this.f311984a.El();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final InterfaceC27054h J7() {
            return this.f311984a.J7();
        }

        @Override // com.avito.android.di.module.InterfaceC30106l7, com.avito.android.publish.di.InterfaceC33816g
        public final com.avito.android.analytics.screens.D N5() {
            return this.f311984a.N5();
        }

        @Override // com.avito.android.di.module.InterfaceC30106l7
        public final PreloadingPromiseTestGroup Ta() {
            return this.f311984a.Ta();
        }

        @Override // com.avito.android.personal_banner.feature.factory.b.a
        public final InterfaceC25423a U6() {
            InterfaceC25423a interfaceC25423aU6 = this.f311984a.U6();
            dagger.internal.t.c(interfaceC25423aU6);
            return interfaceC25423aU6;
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final Z0 W() {
            return this.f311984a.W();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final com.avito.android.user_adverts.tab_actions.host.e W8() {
            return this.f312020s.get();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final InterfaceC25571b Y4() {
            InterfaceC25571b interfaceC25571bY4 = this.f311984a.Y4();
            dagger.internal.t.c(interfaceC25571bY4);
            return interfaceC25571bY4;
        }

        @Override // kj.c
        public final InterfaceC39737b Yb() {
            return this.f311984a.Yb();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.a Z8() {
            return this.f311982Y.get();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m, com.avito.android.personal_selections.di.c.a
        public final InterfaceC28373a a() {
            InterfaceC28373a interfaceC28373aA = this.f311984a.a();
            dagger.internal.t.c(interfaceC28373aA);
            return interfaceC28373aA;
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final C44240b a7() {
            return this.f311984a.a7();
        }

        @Override // com.avito.android.di.module.InterfaceC30106l7, com.avito.android.user_adverts_filters.main.di.c, com.avito.android.extended_profile_adverts.di.m, com.avito.android.publish.di.InterfaceC33816g, com.avito.android.favorites.di.InterfaceC30646d, com.avito.android.payment.di.component.e, com.avito.android.search.filter.di.n, com.avito.android.search.subscriptions.di.d, com.avito.android.social_management.di.f, com.avito.android.code_confirmation.code_confirmation.di.b, com.avito.android.authorization.login.di.c, com.avito.android.authorization.complete_registration.di.b, com.avito.android.authorization.reset_password.di.c, aq0.InterfaceC23653b, com.avito.android.messenger_icebreakers_dialog.di.b.a, com.avito.android.sbc.di.d, com.avito.android.sbc.dispatch_edit.di.c, com.avito.android.photo_gallery.di.C, com.avito.android.user_advert.di.InterfaceC35544x, com.avito.android.photo_gallery.di.e, gw0.InterfaceC40744a, com.avito.android.short_term_rent.bookingform.di.b, com.avito.android.guests_selector.di.l, com.avito.android.location_picker.di.f, com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di.b.InterfaceC4984b, com.avito.android.safedeal.delivery.di.component.b, com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.di.c, com.avito.android.profile_phones.add_phone.di.b, com.avito.android.profile_phones.phones_list.di.j, com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c, com.avito.android.order.feature.di.c, com.avito.android.orderBeduinV2.di.c, com.avito.android.orders.feature.beduin_orders_list.di.c, com.avito.android.verification.di.disclaimer.c, com.avito.android.verification.di.finish.c, com.avito.android.verification.di.input_inn.c, com.avito.android.verification.di.confirm_requisites.c, com.avito.android.verification.di.input_bill_amount.c, com.avito.android.verification.di.fetch_invoice.c, com.avito.android.verification.di.form_builder.c, com.avito.android.loyalty.di.quality_service.h, com.avito.android.loyalty.di.criteria.b, com.avito.android.loyalty.di.criteria_gray.b, com.avito.android.loyalty.di.quality_service_gray.c, com.avito.android.loyalty.di.badge_details_v3.b, com.avito.android.extended_profile.di.InterfaceC30437q, com.avito.android.extended_profile_serp.di.InterfaceC30535e, com.avito.android.extended_profile_tabs.di.f, com.avito.android.similar_adverts.di.i, com.avito.android.di.InterfaceC29970g, com.avito.android.safedeal_checkout.delivery_universal_checkout.di.component.c, com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.c, com.avito.android.safedeal.universal_delivery_type.courier.di.c, com.avito.android.safedeal.universal_delivery_type.di.i, com.avito.android.inline_filters.di.d, com.avito.android.stories.di.component.c, com.avito.android.rating_form.di.g, com.avito.android.installments.form.di.c, com.avito.android.passport.profile_add.di.a, com.avito.android.extended_profile_map.di.c, com.avito.android.change_specific.di.c, com.avito.android.imv_goods_advert.di.e, com.avito.android.universal_map.map.di.InterfaceC35314u, com.avito.android.return_checkout.di.component.c, com.avito.android.rating_form.info.di.c, com.avito.android.vas_performance.di.perfomance.n, com.avito.android.vas_performance.screens.visual.di.e, com.avito.android.vas_performance.screens.visual_v2.di.h, com.avito.android.checkout.di.g, com.avito.android.date_time_picker.di.c, com.avito.android.service_booking_additional_settings.di.j, com.avito.android.wallet.page.di.component.e, com.avito.android.avl.di.e, zE.InterfaceC50445a, com.avito.android.cpx_promo.impl.di.d, com.avito.android.service_booking.mvi.di.r, com.avito.android.cpx_promo.v2.di.f, sk.InterfaceC48375a, com.avito.android.universal_transaction.di.c, fK0.InterfaceC40304a, com.avito.android.str_seller_orders_important_to_note.di.c, com.avito.android.travel_onboarding.di.d, com.avito.android.category_with_params.di.b, com.avito.android.reputation.di.s, com.avito.android.email.email_update.di.c, com.avito.android.email.email_confirmation.di.c, com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.c, com.avito.android.advert_stats.di.c, com.avito.android.ai_assistant.di.chat.b, com.avito.android.ai_assistant.di.chat_list.b, com.avito.android.authorization.auto_recovery.factor_unavailable_reason.c, com.avito.android.authorization.auto_recovery.recovery_availability.di.c, com.avito.android.authorization.auto_recovery.require_tfa.di.c, com.avito.android.authorization.change_password.di.d, com.avito.android.authorization.confirm_3fa.b, com.avito.android.authorization.select_profile.di.c, com.avito.android.authorization.select_profile.social_login.di.c, com.avito.android.authorization.upgrade_password.di.f, He.InterfaceC13981a, p002if.InterfaceC41393a, com.avito.android.barcode.di.b, com.avito.android.barcode_scanner_impl.di.c, hh.InterfaceC40934b, nh.InterfaceC44423b, com.avito.android.bbl.screens.configure.v4.di.b, com.avito.android.bbl.screens.limit_increase.di.g, com.avito.android.bundles.di.l, com.avito.android.bundles.vas_union.di.m, com.avito.android.calendar_select.di.a, com.avito.android.category.di.d, com.avito.android.code_check.j, com.avito.android.comfortable_deal.client_room.di.b, com.avito.android.comfortable_deal.di.a, com.avito.android.comfortable_deal.submitting.ordercall.di.c, com.avito.android.comfortable_deal.submitting.promo.di.c, com.avito.android.comfortable_deal.submitting.select.di.h, com.avito.android.comfortable_deal.submitting.success.di.c, wq.InterfaceC49671c, com.avito.android.competitor_analytics.di.d, Fr.InterfaceC13828a, Nr.InterfaceC14604a, com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.e, com.avito.android.cpx_promo_geo.screens.region_sheet.di.e, com.avito.android.credits.credit_partner_screen.di.b, com.avito.android.data_picker_show.di.c, com.avito.android.delivery_location_suggest.di.e, com.avito.android.edit_seller_type.di.c, com.avito.android.employee_stub_impl.di.c, com.avito.android.extended_profile_personal_link_edit.di.c, com.avito.android.extended_profile_selection_create.select.di.c, com.avito.android.extended_profile_universal_widget_edit.create.di.c, com.avito.android.extended_profile_universal_widget_edit.edit.di.c, com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c, YE.c, com.avito.android.hotel_available_rooms.di.o, com.avito.android.hotel_booking.di.InterfaceC30799u, com.avito.android.iac_dialer.impl_module.screens.call_screen.di.c, com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.c, com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.c, com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c, com.avito.android.iac_problems.impl_module.miui_permission.di.c, com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.g, com.avito.android.job.cv_packages.di.b, com.avito.android.job.interview.di.c, com.avito.android.lf_levels.di.c, com.avito.android.location_list.di.c, com.avito.android.login_suggests_impl.di.c, com.avito.android.master_plan.di.c, com.avito.android.mortgage.di.o, com.avito.android.mortgage_category.di.c, c20.InterfaceC26928e, com.avito.android.onboarding.steps.di.e, com.avito.android.orders_aggregation.di.module.c, com.avito.android.passport.profile_add.merge.accounts_profile_error.b, com.avito.android.passport.profile_add.merge.business_vrf_duplication.b, d60.InterfaceC39512a, com.avito.android.passport.profile_add.merge.full_screen_error_dialog.c, com.avito.android.passport.profile_add.onboarding.l, com.avito.android.passport.profiles_list.di.d, com.avito.android.phone_reverification_info.di.c, com.avito.android.position_in_search.stats.screen.position_in_search.di.c, com.avito.android.profile.remove.confirm.di.c, com.avito.android.profile.remove.di.c, com.avito.android.rating.details.answer.di.c, com.avito.android.rating.summary.di.c, com.avito.android.re_agent_landing.di.c, com.avito.android.recall_me_v2.presentation.recallme.d, com.avito.android.related_products.bottom_sheet.di.f, com.avito.android.review_gallery.dialog.di.b, com.avito.android.rubricator.list.category.di.b, com.avito.android.safety.password_change.di.c, com.avito.android.safety.password_setting.di.c, com.avito.android.safety.sessions.info.di.c, com.avito.android.safety.sessions.social_logout.di.c, com.avito.android.safety.tfa_disable_password.c, com.avito.android.search_suggest.di.d, com.avito.android.select.new_districts.di.b, com.avito.android.select.new_metro.di.g, com.avito.android.seller_coach.all_advices.provider.d, com.avito.android.service_booking_calendar.day.schedule.di.n, com.avito.android.service_booking_calendar.flexible.di.d, com.avito.android.service_booking_day_settings.di.i, com.avito.android.service_booking_details.di.d, com.avito.android.service_booking_schedule_repetition_impl.di.c, com.avito.android.service_booking_settings.di.work_hours.d, com.avito.android.service_fee_conditions.di.g, com.avito.android.service_orders.di.i, com.avito.android.services_onboarding.di.e, com.avito.android.services_portfolio.project.di.d, com.avito.android.services_portfolio.project.di.e, com.avito.android.short_term_rent.bookingform.promocode.di.b, com.avito.android.short_term_rent.promo_codes.di.c, com.avito.android.soa_stat.di.c, com.avito.android.str_insurance.di.c, com.avito.android.success.di.component.c, com.avito.android.suggest_locations.di.r, com.avito.android.sx_address.entry.di.c, WA0.b, com.avito.android.tariff.cpr.configure.advance.di.t, com.avito.android.tariff.cpx.info.limits.di.e, com.avito.android.tariff_cpt.common.di.d, com.avito.android.tariff_lf.common.di.a, gD0.InterfaceC40574b, KD0.b, com.avito.android.tariff_select.di.h, com.avito.android.travel_file_download_deeplink.di.e, com.avito.android.travel_payment_selector.di.f, com.avito.android.travel_search.di.c, com.avito.android.trx_promo_goods.common.di.c, com.avito.android.trx_promo_impl.di.l, com.avito.android.user_favorites.di.h, com.avito.android.user_stats.extended_user_stats.di.c, com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c, com.avito.android.vas_autoprolong.screens.autoprolong.di.e, com.avito.android.vas_discount.di.d, com.avito.android.vas_performance.di.applied_services.b, com.avito.android.vas_performance.di.competitive.i, com.avito.android.vas_performance.di.stickers.p, com.avito.android.vas_performance.screens.applied_services.di.c, com.avito.android.vas_performance.screens.competitive.di.d, LL0.c, com.avito.android.vas_performance.screens.stickers.edit.di.g, com.avito.android.vas_union.di.n, com.avito.android.verification.di.passport.c, HN0.a, TN0.a, fO0.InterfaceC40325a, com.avito.android.widget_filters.di.c
        public final InterfaceC28481c b() {
            InterfaceC28481c interfaceC28481cB = this.f311984a.b();
            dagger.internal.t.c(interfaceC28481cB);
            return interfaceC28481cB;
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m, com.avito.android.position_in_search.storage.provider.c.a, com.avito.android.position_in_search.stats.screen.position_in_search.di.c, com.avito.android.profile.remove.confirm.di.c, com.avito.android.profile.remove.di.c, Lc0.InterfaceC14378a, com.avito.android.rating.user_contacts.di.d, com.avito.android.re_agent_landing.di.c, com.avito.android.realty_agency.checkerboard.di.b, com.avito.android.recall_me_v2.presentation.recallme.d, com.avito.android.referral_contacts.di.c, com.avito.android.related_products.bottom_sheet.di.f, com.avito.android.service_booking_calendar.day.schedule.di.n, com.avito.android.service_booking_calendar.flexible.di.d, com.avito.android.service_booking_day_settings.di.i, com.avito.android.service_booking_details.di.d, com.avito.android.service_booking_schedule_repetition_impl.di.c, com.avito.android.service_booking_settings.di.work_hours.d, com.avito.android.service_fee_conditions.di.g, com.avito.android.service_orders.di.i, com.avito.android.services_onboarding.di.e, com.avito.android.settings.di.c, com.avito.android.short_term_rent.bookingform.promocode.di.b, com.avito.android.short_term_rent.promo_codes.di.c, com.avito.android.soa_stat.di.c, com.avito.android.social.di.g.a, com.avito.android.str_booking.di.m, com.avito.android.str_calendar.seller.last_minute_offer.di.c, com.avito.android.str_cancellation_settings.di.f, com.avito.android.str_insurance.di.c, com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h, com.avito.android.success.di.component.c, com.avito.android.sx_address.address_video_verification.di.c, com.avito.android.sx_address.selectaddresslist.di.c, WA0.b, com.avito.android.tariff.cpr.configure.advance.di.t, com.avito.android.tariff.cpx.info.limits.di.e, com.avito.android.tariff_cpt.common.di.d, gD0.InterfaceC40574b, KD0.b, com.avito.android.tariff_select.di.h, com.avito.android.travel_payment_selector.di.f, com.avito.android.travel_search.di.c, com.avito.android.trx_promo_goods.common.di.c, com.avito.android.trx_promo_impl.di.l, com.avito.android.user_favorites.di.h, com.avito.android.vas_autoprolong.screens.autoprolong.di.e, com.avito.android.vas_discount.di.d, com.avito.android.vas_performance.screens.applied_services.di.c, com.avito.android.vas_performance.screens.competitive.di.d, LL0.c, com.avito.android.vas_performance.screens.stickers.edit.di.g, com.avito.android.vas_planning.balance_lack.di.c, com.avito.android.vas_union.di.n, HN0.a, TN0.a, fO0.InterfaceC40325a, com.avito.android.virtual_deal_room_reference_category.client_add.di.b, BP0.a, com.avito.android.widget_filters.di.c, com.avito.android.work_profile.profile.work_profile_host.di.c
        public final R0 c() {
            R0 r0C = this.f311984a.c();
            dagger.internal.t.c(r0C);
            return r0C;
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final com.avito.android.user_adverts.tab_actions.host.domain.g dg() {
            h31.e eVarA = dagger.internal.g.a(this.f312004k);
            R0 r0C = this.f311984a.c();
            dagger.internal.t.c(r0C);
            return new com.avito.android.user_adverts.tab_actions.host.domain.g(r0C, eVarA);
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m, com.avito.android.user_adverts.tab_actions.attention.di.c, com.avito.android.user_adverts.tab_actions.info.di.c
        public final com.avito.android.util.text.a e() {
            com.avito.android.util.text.a aVarE = this.f311984a.e();
            dagger.internal.t.c(aVarE);
            return aVarE;
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final InterfaceC15774a e3() {
            InterfaceC15774a interfaceC15774aE3 = this.f311984a.e3();
            dagger.internal.t.c(interfaceC15774aE3);
            return interfaceC15774aE3;
        }

        @Override // com.avito.android.lib.beduin_v2.feature.di.H.b
        public final H.a ed() {
            return this.f311984a.ed();
        }

        @Override // com.avito.android.user_adverts.tab_actions.attention.di.c, com.avito.android.user_adverts.tab_actions.info.di.c
        public final InterfaceC28481c f() {
            InterfaceC28481c interfaceC28481cB = this.f311984a.b();
            dagger.internal.t.c(interfaceC28481cB);
            return interfaceC28481cB;
        }

        @Override // cU.s.b
        public final s.a fd() {
            return this.f311984a.fd();
        }

        @Override // com.avito.android.personal_banner.feature.factory.b.a
        public final com.avito.android.lib.beduin_v2.beduin_item.stateless.c h4() {
            return this.f311984a.h4();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final i0 j9() {
            return this.f312009m0.get();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final C19616a l1() {
            return this.f311984a.l1();
        }

        @Override // com.avito.android.user_adverts.tab_actions.info.di.c
        public final InterfaceC35863o4 m() {
            InterfaceC35863o4 interfaceC35863o4M = this.f311984a.m();
            dagger.internal.t.c(interfaceC35863o4M);
            return interfaceC35863o4M;
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final b.InterfaceC6452b m3() {
            return this.f311984a.m3();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final c.b pm() {
            return this.f311984a.km();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final com.avito.android.user_adverts.tab_screens.adverts.n qg() {
            return this.f312013o0.get();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m, com.avito.android.position_in_search.storage.provider.c.a, com.avito.android.position_in_search.stats.screen.position_in_search.di.c, com.avito.android.realty_agency.checkerboard.di.b, com.avito.android.referral_contacts.di.c, com.avito.android.service_booking_calendar.day.schedule.di.n, com.avito.android.service_booking_calendar.flexible.di.d, com.avito.android.service_orders.di.i, com.avito.android.str_booking.di.m, com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c, com.avito.android.vas_planning_checkout.di.c
        public final AK0.l r() {
            return this.f311984a.r();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final com.avito.android.profile_settings.u s3() {
            com.avito.android.profile_settings.u uVarS3 = this.f311984a.s3();
            dagger.internal.t.c(uVarS3);
            return uVarS3;
        }

        @Override // kj.c
        public final InterfaceC25659b sd() {
            return this.f311984a.sd();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final c.b u3() {
            return this.f311984a.u3();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m, com.avito.android.user_adverts.tab_actions.info.di.c
        public final InterfaceC49850b x1() {
            return this.f311984a.x1();
        }

        @Override // com.avito.android.personal_selections.di.c.a
        public final InterfaceC44207a y6() {
            InterfaceC44207a interfaceC44207aY6 = this.f311984a.y6();
            dagger.internal.t.c(interfaceC44207aY6);
            return interfaceC44207aY6;
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final eH0.k z6() {
            return this.f311984a.z6();
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.m
        public final com.avito.android.user_adverts.root_screen.adverts_host.P zl() {
            UserAdvertsSpace userAdvertsSpace;
            e0 e0Var = this.f311961D.get();
            com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F f12 = this.f311982Y.get();
            com.avito.android.user_adverts.di.host_fragment.B b12 = this.f311984a;
            com.avito.android.profile_settings.u uVarS3 = b12.s3();
            dagger.internal.t.c(uVarS3);
            com.avito.android.passport.profile_add.l lVarB3 = b12.B3();
            dagger.internal.t.c(lVarB3);
            new com.avito.android.user_adverts.space.a();
            com.avito.android.user_adverts.di.host_fragment.C.f311950a.getClass();
            int iOrdinal = this.f311986b.ordinal();
            if (iOrdinal == 0) {
                userAdvertsSpace = UserAdvertsSpace.f314189c;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                userAdvertsSpace = UserAdvertsSpace.f314190d;
            }
            UserAdvertsSpace userAdvertsSpace2 = userAdvertsSpace;
            dagger.internal.t.d(userAdvertsSpace2);
            return new com.avito.android.user_adverts.root_screen.adverts_host.P(e0Var, f12, uVarS3, lVarB3, userAdvertsSpace2);
        }
    }

    public static z.a a() {
        return new b();
    }
}
