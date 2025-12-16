package com.avito.android.realty_agency.checkerboard.di;

import Aw0.InterfaceC13094a;
import Hr.InterfaceC14024a;
import Xh0.C17012b;
import android.app.Activity;
import android.content.Context;
import bi0.InterfaceC25655a;
import cE.C27025b;
import com.avito.android.B2;
import com.avito.android.C0;
import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.k;
import com.avito.android.geo_common.interactor.B;
import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.inline_filters.C31049i;
import com.avito.android.inline_filters.C31054n;
import com.avito.android.inline_filters.C31059t;
import com.avito.android.inline_filters.C31061v;
import com.avito.android.inline_filters.InlineFiltersSource;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31046f;
import com.avito.android.inline_filters.InterfaceC31047g;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.inline_filters.Q;
import com.avito.android.inline_filters.T;
import com.avito.android.inline_filters.V;
import com.avito.android.inline_filters.W;
import com.avito.android.inline_filters.dialog.C31011e;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.location.H;
import com.avito.android.realty_agency.checkerboard.CheckerboardActivity;
import com.avito.android.realty_agency.checkerboard.di.a;
import com.avito.android.realty_agency.checkerboard.di.d;
import com.avito.android.realty_agency.checkerboard.model.CheckerboardArguments;
import com.avito.android.realty_agency.checkerboard.mvi.C;
import com.avito.android.realty_agency.checkerboard.mvi.E;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl_Factory;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.shortcut_navigation_bar.j0;
import com.avito.android.shortcut_navigation_bar.l0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import fi0.InterfaceC40426a;
import iT.InterfaceC41341a;
import lE.C43624b;
import nW.InterfaceC44343a;
import oW.InterfaceC44697a;
import ri0.C47663c;
import ri0.InterfaceC47661a;
import ti0.InterfaceC48675a;

/* compiled from: DaggerCheckerboardComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class g {

    /* compiled from: DaggerCheckerboardComponent.java */
    public static final class b implements com.avito.android.realty_agency.checkerboard.di.a {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<W> f251119A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<V0> f251120B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.l f251121C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31046f> f251122D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<H> f251123E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<B> f251124F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<I1> f251125G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC44343a> f251126H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.r> f251127I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<j0> f251128J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.select.variant.b> f251129K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.l f251130L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<NN.c> f251131M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.inline_filters.dialog.s> f251132N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f251133O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<CN.f> f251134P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f251135Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f251136R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<CN.o> f251137S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14024a> f251138T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.inline_filters.link.f> f251139U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<C27025b> f251140V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.guests_selector.d> f251141W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<B2> f251142X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.onboarding_manager.f> f251143Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<C0> f251144Z;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f251145a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<C43624b> f251146a0;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.realty_agency.checkerboard.di.b f251147b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31062w> f251148b0;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC25655a> f251149c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.select.x> f251150c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<R0> f251151d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.text.a> f251152d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<SearchParamsConverter> f251153e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30999b> f251154e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.realty_agency.checkerboard.mvi.y> f251155f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.realty_agency.inline_filters.a> f251156f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<AK0.l> f251157g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC47661a> f251158h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f251159i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.realty_agency.checkerboard.mvi.u f251160j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC48675a> f251161k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f251162l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f251163m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<Context> f251164n;

        /* renamed from: o, reason: collision with root package name */
        public final C17012b f251165o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.realty_agency.checkerboard.mvi.s f251166p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.realty_agency.checkerboard.mvi.x f251167q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC41341a> f251168r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.realty_agency.checkerboard.p f251169s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC40426a> f251170t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31047g> f251171u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<T> f251172v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f251173w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30995b> f251174x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.geo_common.interactor.g> f251175y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30715a> f251176z;

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class A implements dagger.internal.u<B> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f251177a;

            public A(InterfaceC44697a interfaceC44697a) {
                this.f251177a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                B bQ3 = this.f251177a.q3();
                dagger.internal.t.c(bQ3);
                return bQ3;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        /* renamed from: com.avito.android.realty_agency.checkerboard.di.g$b$a, reason: case insensitive filesystem */
        public static final class C34224a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251178a;

            public C34224a(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251178a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f251178a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        /* renamed from: com.avito.android.realty_agency.checkerboard.di.g$b$b, reason: collision with other inner class name */
        public static final class C7534b implements dagger.internal.u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251179a;

            public C7534b(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251179a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f251179a.e();
                dagger.internal.t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class c implements dagger.internal.u<InterfaceC44343a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f251180a;

            public c(InterfaceC44697a interfaceC44697a) {
                this.f251180a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44343a interfaceC44343aD6 = this.f251180a.d6();
                dagger.internal.t.c(interfaceC44343aD6);
                return interfaceC44343aD6;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class d implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251181a;

            public d(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251181a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f251181a.f();
                dagger.internal.t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class e implements dagger.internal.u<InterfaceC25655a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251182a;

            public e(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251182a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25655a interfaceC25655aOh = this.f251182a.oh();
                dagger.internal.t.c(interfaceC25655aOh);
                return interfaceC25655aOh;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class f implements dagger.internal.u<InterfaceC14024a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251183a;

            public f(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251183a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14024a interfaceC14024aL = this.f251183a.L();
                dagger.internal.t.c(interfaceC14024aL);
                return interfaceC14024aL;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        /* renamed from: com.avito.android.realty_agency.checkerboard.di.g$b$g, reason: collision with other inner class name */
        public static final class C7535g implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251184a;

            public C7535g(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251184a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f251184a.g();
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class h implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f251185a;

            public h(cv.b bVar) {
                this.f251185a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f251185a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class i implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251186a;

            public i(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251186a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f251186a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class j implements dagger.internal.u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251187a;

            public j(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251187a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f251187a.T0();
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class k implements dagger.internal.u<com.avito.android.guests_selector.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251188a;

            public k(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251188a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f251188a.hj();
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class l implements dagger.internal.u<NN.c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251189a;

            public l(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251189a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f251189a.H0();
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class m implements dagger.internal.u<InterfaceC40426a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251190a;

            public m(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251190a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40426a interfaceC40426aV6 = this.f251190a.v6();
                dagger.internal.t.c(interfaceC40426aV6);
                return interfaceC40426aV6;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class n implements dagger.internal.u<com.avito.android.inline_filters.link.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251191a;

            public n(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251191a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.inline_filters.link.f fVarU0 = this.f251191a.U0();
                dagger.internal.t.c(fVarU0);
                return fVarU0;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class o implements dagger.internal.u<InterfaceC30715a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f251192a;

            public o(InterfaceC44697a interfaceC44697a) {
                this.f251192a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC30715a interfaceC30715aK3 = this.f251192a.k3();
                dagger.internal.t.c(interfaceC30715aK3);
                return interfaceC30715aK3;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class p implements dagger.internal.u<com.avito.android.geo_common.interactor.g> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f251193a;

            public p(InterfaceC44697a interfaceC44697a) {
                this.f251193a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo_common.interactor.g gVarU0 = this.f251193a.u0();
                dagger.internal.t.c(gVarU0);
                return gVarU0;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class q implements dagger.internal.u<com.avito.android.onboarding_manager.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251194a;

            public q(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251194a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.onboarding_manager.f fVarL0 = this.f251194a.l0();
                dagger.internal.t.c(fVarL0);
                return fVarL0;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class r implements dagger.internal.u<I1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251195a;

            public r(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251195a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f251195a.H();
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class s implements dagger.internal.u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251196a;

            public s(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251196a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f251196a.r();
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class t implements dagger.internal.u<H> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f251197a;

            public t(InterfaceC44697a interfaceC44697a) {
                this.f251197a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f251197a.i3();
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class u implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251198a;

            public u(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251198a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f251198a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class v implements dagger.internal.u<V0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251199a;

            public v(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251199a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                V0 v0Z = this.f251199a.Z();
                dagger.internal.t.c(v0Z);
                return v0Z;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class w implements dagger.internal.u<C27025b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251200a;

            public w(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251200a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f251200a.v0();
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class x implements dagger.internal.u<B2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251201a;

            public x(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251201a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f251201a.D();
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class y implements dagger.internal.u<InterfaceC48675a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251202a;

            public y(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251202a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48675a interfaceC48675aV4 = this.f251202a.V4();
                dagger.internal.t.c(interfaceC48675aV4);
                return interfaceC48675aV4;
            }
        }

        /* compiled from: DaggerCheckerboardComponent.java */
        public static final class z implements dagger.internal.u<C43624b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.checkerboard.di.b f251203a;

            public z(com.avito.android.realty_agency.checkerboard.di.b bVar) {
                this.f251203a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f251203a.J();
            }
        }

        public b(com.avito.android.realty_agency.checkerboard.di.b bVar, cv.b bVar2, InterfaceC44697a interfaceC44697a, Activity activity, a.i iVar, CheckerboardArguments checkerboardArguments, Kundle kundle, InlineFiltersSource inlineFiltersSource, SerpSpaceType serpSpaceType, C28478k c28478k, a aVar) {
            this.f251145a = bVar2;
            this.f251147b = bVar;
            this.f251149c = new e(bVar);
            this.f251151d = new i(bVar);
            dagger.internal.u<SearchParamsConverter> uVarD = dagger.internal.g.d(SearchParamsConverterImpl_Factory.create());
            this.f251153e = uVarD;
            this.f251155f = dagger.internal.g.d(new com.avito.android.realty_agency.checkerboard.mvi.A(uVarD, this.f251149c, this.f251151d));
            this.f251158h = dagger.internal.g.d(new C47663c(new s(bVar)));
            dagger.internal.l lVarA = dagger.internal.l.a(checkerboardArguments);
            this.f251159i = lVarA;
            this.f251160j = new com.avito.android.realty_agency.checkerboard.mvi.u(this.f251155f, this.f251158h, lVarA, com.avito.android.realty_agency.checkerboard.mvi.use_case.c.a());
            this.f251161k = new y(bVar);
            this.f251162l = new h(bVar2);
            this.f251163m = dagger.internal.l.a(iVar);
            this.f251164n = new C7535g(bVar);
            dagger.internal.u<InterfaceC48675a> uVar = this.f251161k;
            dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> uVar2 = this.f251162l;
            com.avito.android.realty_agency.beduin.b bVarA = com.avito.android.realty_agency.beduin.b.a();
            dagger.internal.l lVar = this.f251163m;
            dagger.internal.u<R0> uVar3 = this.f251151d;
            dagger.internal.u<Context> uVar4 = this.f251164n;
            com.avito.android.realty_agency.use_case.d dVar = new com.avito.android.realty_agency.use_case.d(uVar, uVar2, bVarA, lVar, uVar3, uVar4);
            C17012b c17012b = new C17012b(uVar4);
            this.f251165o = c17012b;
            this.f251166p = new com.avito.android.realty_agency.checkerboard.mvi.s(this.f251155f, this.f251158h, dVar, c17012b, this.f251159i, com.avito.android.realty_agency.checkerboard.mvi.use_case.c.a());
            this.f251167q = new com.avito.android.realty_agency.checkerboard.mvi.x(this.f251160j, this.f251166p, new C(com.avito.android.realty_agency.beduin.b.a()), new E(this.f251165o));
            dagger.internal.u<InterfaceC41341a> uVarD2 = dagger.internal.g.d(d.a.f251111a);
            this.f251168r = uVarD2;
            this.f251169s = new com.avito.android.realty_agency.checkerboard.p(this.f251167q, uVarD2);
            this.f251170t = new m(bVar);
            this.f251171u = dagger.internal.g.d(C31049i.a());
            dagger.internal.u<T> uVarD3 = dagger.internal.g.d(V.a());
            this.f251172v = uVarD3;
            this.f251173w = new u(bVar);
            this.f251174x = dagger.internal.g.d(new com.avito.android.realty_agency.checkerboard.di.e(this.f251170t, this.f251153e, this.f251171u, uVarD3, C31061v.a(), this.f251173w));
            this.f251119A = dagger.internal.g.d(new C31059t(new p(interfaceC44697a), new o(interfaceC44697a), this.f251173w));
            this.f251120B = new v(bVar);
            dagger.internal.l lVarA2 = dagger.internal.l.a(inlineFiltersSource);
            this.f251121C = lVarA2;
            this.f251122D = dagger.internal.g.d(new C31054n(this.f251120B, this.f251153e, this.f251173w, lVarA2));
            this.f251127I = dagger.internal.B.a(com.avito.android.location.A.a(new t(interfaceC44697a), new r(bVar), new A(interfaceC44697a), new c(interfaceC44697a)));
            this.f251128J = dagger.internal.g.d(l0.a());
            this.f251129K = dagger.internal.g.d(com.avito.android.select.variant.d.a());
            dagger.internal.l lVarA3 = dagger.internal.l.a(activity);
            this.f251130L = lVarA3;
            this.f251132N = dagger.internal.g.d(new com.avito.android.inline_filters.dialog.v(lVarA3, new l(bVar), this.f251129K));
            this.f251134P = dagger.internal.g.d(new CN.m(new C34224a(bVar), this.f251121C));
            this.f251135Q = new d(bVar);
            dagger.internal.u<ScreenPerformanceTracker> uVarD4 = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f251135Q);
            this.f251136R = uVarD4;
            this.f251137S = dagger.internal.g.d(new com.avito.android.realty_agency.checkerboard.di.f(uVarD4));
            dagger.internal.l lVarB = dagger.internal.l.b(kundle);
            f fVar = new f(bVar);
            n nVar = new n(bVar);
            w wVar = new w(bVar);
            k kVar = new k(bVar);
            x xVar = new x(bVar);
            this.f251142X = xVar;
            q qVar = new q(bVar);
            dagger.internal.u<InterfaceC35745a5> uVar5 = this.f251173w;
            com.avito.android.onboarding_manager.d dVar2 = new com.avito.android.onboarding_manager.d(qVar, uVar5, this.f251151d);
            j jVar = new j(bVar);
            z zVar = new z(bVar);
            this.f251146a0 = zVar;
            this.f251148b0 = dagger.internal.g.d(new Q(this.f251174x, this.f251162l, this.f251119A, this.f251122D, this.f251127I, this.f251128J, this.f251132N, uVar5, this.f251134P, this.f251137S, lVarB, fVar, nVar, wVar, kVar, xVar, dVar2, jVar, zVar, com.avito.android.inline_filters.dialog.calendar.date_range.b.a()));
            dagger.internal.u<com.avito.android.select.x> uVarA = dagger.internal.B.a(com.avito.android.select.z.a());
            this.f251150c0 = uVarA;
            this.f251152d0 = new C7534b(bVar);
            this.f251154e0 = dagger.internal.g.d(new C31011e(this.f251130L, uVarA, this.f251132N, this.f251142X, this.f251146a0, com.avito.android.inline_filters.dialog.calendar.date_range.b.a(), this.f251152d0));
            this.f251156f0 = dagger.internal.g.d(new com.avito.android.realty_agency.inline_filters.c(this.f251130L));
        }

        @Override // com.avito.android.realty_agency.checkerboard.di.a
        public final void a(CheckerboardActivity checkerboardActivity) {
            checkerboardActivity.f250901m = this.f251169s;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f251145a.u4();
            dagger.internal.t.c(aVarU4);
            checkerboardActivity.f250903o = aVarU4;
            checkerboardActivity.f250905q = this.f251148b0.get();
            com.avito.android.realty_agency.checkerboard.di.b bVar = this.f251147b;
            com.avito.android.util.text.a aVarE = bVar.e();
            dagger.internal.t.c(aVarE);
            checkerboardActivity.f250906r = aVarE;
            com.avito.android.onboarding_manager.f fVarL0 = bVar.l0();
            dagger.internal.t.c(fVarL0);
            InterfaceC35745a5 interfaceC35745a5D = bVar.d();
            dagger.internal.t.c(interfaceC35745a5D);
            R0 r0C = bVar.c();
            dagger.internal.t.c(r0C);
            checkerboardActivity.f250907s = new com.avito.android.onboarding_manager.a(fVarL0, interfaceC35745a5D, r0C);
            com.avito.android.onboarding_manager.f fVarL02 = bVar.l0();
            dagger.internal.t.c(fVarL02);
            checkerboardActivity.f250908t = fVarL02;
            checkerboardActivity.f250909u = bVar.j0();
            checkerboardActivity.f250911w = this.f251136R.get();
            InterfaceC13094a interfaceC13094aV0 = bVar.V0();
            dagger.internal.t.c(interfaceC13094aV0);
            checkerboardActivity.f250912x = interfaceC13094aV0;
            checkerboardActivity.f250913y = this.f251154e0.get();
            checkerboardActivity.f250914z = this.f251156f0.get();
            checkerboardActivity.f250900A = bVar.e0();
        }
    }

    /* compiled from: DaggerCheckerboardComponent.java */
    public static final class c implements a.InterfaceC7533a {
        public c() {
        }

        @Override // com.avito.android.realty_agency.checkerboard.di.a.InterfaceC7533a
        public final com.avito.android.realty_agency.checkerboard.di.a a(CheckerboardActivity checkerboardActivity, com.avito.android.realty_agency.checkerboard.di.b bVar, InterfaceC39417a interfaceC39417a, InterfaceC44697a interfaceC44697a, k kVar, CheckerboardArguments checkerboardArguments, C28478k c28478k) {
            InlineFiltersSource inlineFiltersSource = InlineFiltersSource.f170994c;
            interfaceC39417a.getClass();
            checkerboardArguments.getClass();
            return new b(bVar, interfaceC39417a, interfaceC44697a, checkerboardActivity, kVar, checkerboardArguments, null, inlineFiltersSource, null, c28478k, null);
        }
    }

    public static a.InterfaceC7533a a() {
        return new c();
    }
}
