package com.avito.android.extended_profile_selection_create.select.di;

import Aw0.InterfaceC13094a;
import Hr.InterfaceC14024a;
import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import androidx.view.S0;
import aq0.C23655d;
import aq0.C23656e;
import cE.C27025b;
import com.avito.android.B2;
import com.avito.android.C0;
import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import com.avito.android.extended_profile_selection_create.select.C30504f;
import com.avito.android.extended_profile_selection_create.select.C30510l;
import com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateFragment;
import com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateScreen;
import com.avito.android.extended_profile_selection_create.select.InterfaceC30498c;
import com.avito.android.extended_profile_selection_create.select.InterfaceC30507i;
import com.avito.android.extended_profile_selection_create.select.K;
import com.avito.android.extended_profile_selection_create.select.di.b;
import com.avito.android.extended_profile_selection_create.select.di.h;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.inline_filters.C31049i;
import com.avito.android.inline_filters.C31054n;
import com.avito.android.inline_filters.C31057q;
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
import com.avito.android.remote.D0;
import com.avito.android.remote.N;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl_Factory;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.search.filter.InterfaceC34598u;
import com.avito.android.shortcut_navigation_bar.j0;
import com.avito.android.shortcut_navigation_bar.l0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.A;
import iT.C41343c;
import is0.C42105g;
import is0.InterfaceC42103e;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlinx.coroutines.flow.Z1;
import lE.C43624b;
import nW.InterfaceC44343a;
import oW.InterfaceC44697a;

/* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
    public static final class b implements com.avito.android.extended_profile_selection_create.select.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.select.variant.b> f152144A;

        /* renamed from: A0, reason: collision with root package name */
        public final Q f152145A0;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<NN.c> f152146B;

        /* renamed from: B0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31062w> f152147B0;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.inline_filters.dialog.s> f152148C;

        /* renamed from: C0, reason: collision with root package name */
        public final dagger.internal.u<FloatingViewsPresenter> f152149C0;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<B2> f152150D;

        /* renamed from: D0, reason: collision with root package name */
        public final dagger.internal.u<Zp0.d> f152151D0;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<C43624b> f152152E;

        /* renamed from: E0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34598u> f152153E0;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.text.a> f152154F;

        /* renamed from: F0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30507i> f152155F0;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30999b> f152156G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<Application> f152157H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<AK0.l> f152158I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.select.i> f152159J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<Integer> f152160K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<QH.b> f152161L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.b<?, ?>>> f152162M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.l f152163N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.extended_profile_selection_create.select.adapter.search_button.c> f152164O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f152165P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.extended_profile_selection_create.select.adapter.advert.c> f152166Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.h> f152167R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<Locale> f152168S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f152169T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.extended_profile_selection_create.select.adapter.search_correction.c> f152170U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f152171V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.extended_profile_selection_create.select.adapter.search_empty.c> f152172W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f152173X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f152174Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f152175Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.extended_profile_selection_create.select.di.c f152176a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.d> f152177a0;

        /* renamed from: b, reason: collision with root package name */
        public final Screen f152178b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<V0> f152179b0;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<N> f152180c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31047g> f152181c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<D0> f152182d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<T> f152183d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<Gson> f152184e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f152185e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35863o4> f152186f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.l f152187f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<R0> f152188g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.l f152189g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<SearchParamsConverter> f152190h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30995b> f152191h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f152192i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.geo_common.interactor.g> f152193i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30498c> f152194j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30715a> f152195j0;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.extended_profile_selection_create.select.mvi.i f152196k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<W> f152197k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f152198l;

        /* renamed from: l0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31046f> f152199l0;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.account.E> f152200m;

        /* renamed from: m0, reason: collision with root package name */
        public final dagger.internal.u<H> f152201m0;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f152202n;

        /* renamed from: n0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.geo_common.interactor.B> f152203n0;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.extended_profile_selection_create.select.mvi.g f152204o;

        /* renamed from: o0, reason: collision with root package name */
        public final dagger.internal.u<I1> f152205o0;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.extended_profile_selection_create.select.mvi.n f152206p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC44343a> f152207p0;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.extended_profile_selection_create.select.mvi.p f152208q;

        /* renamed from: q0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.r> f152209q0;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f152210r;

        /* renamed from: r0, reason: collision with root package name */
        public final dagger.internal.u<j0> f152211r0;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.l f152212s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.u<CN.f> f152213s0;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<C28478k> f152214t;

        /* renamed from: t0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC42103e> f152215t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f152216u;

        /* renamed from: u0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14024a> f152217u0;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.extended_profile_selection_create.select.mvi.l f152218v;

        /* renamed from: v0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.inline_filters.link.f> f152219v0;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<C41343c> f152220w;

        /* renamed from: w0, reason: collision with root package name */
        public final dagger.internal.u<C27025b> f152221w0;

        /* renamed from: x, reason: collision with root package name */
        public final K f152222x;

        /* renamed from: x0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.guests_selector.d> f152223x0;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.l f152224y;

        /* renamed from: y0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.onboarding_manager.f> f152225y0;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.select.x> f152226z;

        /* renamed from: z0, reason: collision with root package name */
        public final dagger.internal.u<C0> f152227z0;

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class A implements dagger.internal.u<C27025b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152228a;

            public A(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152228a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f152228a.v0();
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class B implements dagger.internal.u<B2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152229a;

            public B(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152229a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f152229a.S0();
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class C implements dagger.internal.u<C43624b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152230a;

            public C(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152230a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f152230a.J();
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class D implements dagger.internal.u<com.avito.android.server_time.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152231a;

            public D(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152231a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.h hVarY = this.f152231a.y();
                dagger.internal.t.c(hVarY);
                return hVarY;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class E implements dagger.internal.u<com.avito.android.geo_common.interactor.B> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f152232a;

            public E(InterfaceC44697a interfaceC44697a) {
                this.f152232a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo_common.interactor.B bQ3 = this.f152232a.q3();
                dagger.internal.t.c(bQ3);
                return bQ3;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        /* renamed from: com.avito.android.extended_profile_selection_create.select.di.a$b$a, reason: collision with other inner class name */
        public static final class C4452a implements dagger.internal.u<com.avito.android.account.E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152233a;

            public C4452a(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152233a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.account.E eI2 = this.f152233a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        /* renamed from: com.avito.android.extended_profile_selection_create.select.di.a$b$b, reason: collision with other inner class name */
        public static final class C4453b implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152234a;

            public C4453b(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152234a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f152234a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        /* renamed from: com.avito.android.extended_profile_selection_create.select.di.a$b$c, reason: case insensitive filesystem */
        public static final class C30500c implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152235a;

            public C30500c(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152235a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f152235a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        /* renamed from: com.avito.android.extended_profile_selection_create.select.di.a$b$d, reason: case insensitive filesystem */
        public static final class C30501d implements dagger.internal.u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152236a;

            public C30501d(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152236a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f152236a.e();
                dagger.internal.t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        /* renamed from: com.avito.android.extended_profile_selection_create.select.di.a$b$e, reason: case insensitive filesystem */
        public static final class C30502e implements dagger.internal.u<InterfaceC44343a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f152237a;

            public C30502e(InterfaceC44697a interfaceC44697a) {
                this.f152237a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44343a interfaceC44343aD6 = this.f152237a.d6();
                dagger.internal.t.c(interfaceC44343aD6);
                return interfaceC44343aD6;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class f implements dagger.internal.u<InterfaceC14024a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152238a;

            public f(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152238a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14024a interfaceC14024aL = this.f152238a.L();
                dagger.internal.t.c(interfaceC14024aL);
                return interfaceC14024aL;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class g implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f152239a;

            public g(cv.b bVar) {
                this.f152239a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f152239a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class h implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152240a;

            public h(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152240a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f152240a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class i implements dagger.internal.u<N> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152241a;

            public i(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152241a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                N nW1 = this.f152241a.W1();
                dagger.internal.t.c(nW1);
                return nW1;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class j implements dagger.internal.u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152242a;

            public j(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152242a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f152242a.T0();
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class k implements dagger.internal.u<InterfaceC34598u> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152243a;

            public k(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152243a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f152243a.n2();
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class l implements dagger.internal.u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152244a;

            public l(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152244a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f152244a.s();
                dagger.internal.t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class m implements dagger.internal.u<com.avito.android.guests_selector.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152245a;

            public m(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152245a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f152245a.hj();
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class n implements dagger.internal.u<NN.c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152246a;

            public n(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152246a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f152246a.H0();
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class o implements dagger.internal.u<com.avito.android.inline_filters.link.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152247a;

            public o(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152247a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.inline_filters.link.f fVarU0 = this.f152247a.U0();
                dagger.internal.t.c(fVarU0);
                return fVarU0;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class p implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152248a;

            public p(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152248a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f152248a.locale();
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class q implements dagger.internal.u<InterfaceC30715a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f152249a;

            public q(InterfaceC44697a interfaceC44697a) {
                this.f152249a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC30715a interfaceC30715aK3 = this.f152249a.k3();
                dagger.internal.t.c(interfaceC30715aK3);
                return interfaceC30715aK3;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class r implements dagger.internal.u<com.avito.android.geo_common.interactor.g> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f152250a;

            public r(InterfaceC44697a interfaceC44697a) {
                this.f152250a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo_common.interactor.g gVarU0 = this.f152250a.u0();
                dagger.internal.t.c(gVarU0);
                return gVarU0;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class s implements dagger.internal.u<com.avito.android.onboarding_manager.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152251a;

            public s(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152251a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.onboarding_manager.f fVarL0 = this.f152251a.l0();
                dagger.internal.t.c(fVarL0);
                return fVarL0;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class t implements dagger.internal.u<I1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152252a;

            public t(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152252a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f152252a.H();
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class u implements dagger.internal.u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152253a;

            public u(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152253a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0S2 = this.f152253a.S2();
                dagger.internal.t.c(d0S2);
                return d0S2;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class v implements dagger.internal.u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152254a;

            public v(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152254a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f152254a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class w implements dagger.internal.u<H> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44697a f152255a;

            public w(InterfaceC44697a interfaceC44697a) {
                this.f152255a = interfaceC44697a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f152255a.i3();
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class x implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152256a;

            public x(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152256a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f152256a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class y implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152257a;

            public y(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152257a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f152257a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
        public static final class z implements dagger.internal.u<V0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f152258a;

            public z(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f152258a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                V0 v0Z = this.f152258a.Z();
                dagger.internal.t.c(v0Z);
                return v0Z;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.extended_profile_selection_create.select.di.c cVar, cv.b bVar, InterfaceC44697a interfaceC44697a, Activity activity, Fragment fragment, Resources resources, ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig, Z1 z12, com.avito.android.analytics.screens.r rVar, Screen screen, InterfaceC22983P interfaceC22983P, Y41.l lVar, S0 s02, Kundle kundle, InlineFiltersSource inlineFiltersSource, SerpSpaceType serpSpaceType, C4451a c4451a) {
            this.f152176a = cVar;
            this.f152178b = screen;
            this.f152180c = new i(cVar);
            this.f152182d = new u(cVar);
            this.f152184e = new l(cVar);
            this.f152186f = new v(cVar);
            this.f152188g = new h(cVar);
            this.f152190h = dagger.internal.g.d(SearchParamsConverterImpl_Factory.create());
            dagger.internal.l lVarA = dagger.internal.l.a(extendedProfileSelectionCreateConfig);
            this.f152192i = lVarA;
            this.f152194j = dagger.internal.g.d(new C30504f(this.f152180c, this.f152182d, this.f152184e, this.f152186f, this.f152188g, this.f152190h, lVarA, com.avito.android.extended_profile_selection_create.select.converter.b.a()));
            dagger.internal.l lVarA2 = dagger.internal.l.a(z12);
            dagger.internal.u<InterfaceC30498c> uVar = this.f152194j;
            dagger.internal.l lVar2 = this.f152192i;
            this.f152196k = new com.avito.android.extended_profile_selection_create.select.mvi.i(lVar2, lVarA2, uVar);
            g gVar = new g(bVar);
            this.f152198l = gVar;
            C4452a c4452a = new C4452a(cVar);
            C4453b c4453b = new C4453b(cVar);
            this.f152202n = c4453b;
            this.f152204o = new com.avito.android.extended_profile_selection_create.select.mvi.g(lVar2, uVar, gVar, c4452a, c4453b);
            this.f152206p = new com.avito.android.extended_profile_selection_create.select.mvi.n(lVar2);
            this.f152208q = new com.avito.android.extended_profile_selection_create.select.mvi.p(lVar2);
            this.f152210r = new y(cVar);
            this.f152212s = dagger.internal.l.a(screen);
            dagger.internal.u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.extended_profile_selection_create.select.di.l(this.f152212s, dagger.internal.l.a(rVar)));
            this.f152214t = uVarD;
            dagger.internal.u<ScreenPerformanceTracker> uVarI = com.avito.android.advert.item.delivery_suggests.l.i(this.f152210r, uVarD);
            this.f152216u = uVarI;
            this.f152218v = new com.avito.android.extended_profile_selection_create.select.mvi.l(this.f152196k, this.f152204o, this.f152206p, this.f152208q, uVarI, this.f152192i);
            dagger.internal.u<C41343c> uVarD2 = dagger.internal.g.d(h.a.f152263a);
            this.f152220w = uVarD2;
            this.f152222x = new K(this.f152218v, uVarD2);
            this.f152224y = dagger.internal.l.a(activity);
            this.f152226z = dagger.internal.B.a(com.avito.android.select.z.a());
            dagger.internal.u<com.avito.android.select.variant.b> uVarD3 = dagger.internal.g.d(com.avito.android.select.variant.d.a());
            this.f152144A = uVarD3;
            dagger.internal.u<com.avito.android.inline_filters.dialog.s> uVarD4 = dagger.internal.g.d(new com.avito.android.inline_filters.dialog.v(this.f152224y, new n(cVar), uVarD3));
            this.f152148C = uVarD4;
            B b12 = new B(cVar);
            this.f152150D = b12;
            C c12 = new C(cVar);
            this.f152152E = c12;
            this.f152154F = new C30501d(cVar);
            this.f152156G = dagger.internal.g.d(new C31011e(this.f152224y, this.f152226z, uVarD4, b12, c12, com.avito.android.inline_filters.dialog.calendar.date_range.b.a(), this.f152154F));
            dagger.internal.u<AK0.l> uVarD5 = dagger.internal.g.d(new C23655d(new C30500c(cVar)));
            this.f152158I = uVarD5;
            this.f152159J = dagger.internal.g.d(new C23656e(uVarD5, this.f152184e));
            dagger.internal.u<Integer> uVarD6 = dagger.internal.g.d(new com.avito.android.extended_profile_selection_create.select.di.j(dagger.internal.l.a(resources)));
            this.f152160K = uVarD6;
            this.f152161L = dagger.internal.g.d(new com.avito.android.extended_profile_selection_create.select.di.n(uVarD6));
            this.f152162M = dagger.internal.B.a(com.avito.android.konveyor_adapter_module.d.a());
            dagger.internal.l lVarA3 = dagger.internal.l.a(lVar);
            this.f152163N = lVarA3;
            dagger.internal.u<com.avito.android.extended_profile_selection_create.select.adapter.search_button.c> uVarD7 = dagger.internal.g.d(new com.avito.android.extended_profile_selection_create.select.adapter.search_button.f(lVarA3));
            this.f152164O = uVarD7;
            this.f152165P = dagger.internal.g.d(new com.avito.android.extended_profile_selection_create.select.adapter.search_button.b(uVarD7));
            dagger.internal.u<com.avito.android.extended_profile_selection_create.select.adapter.advert.c> uVarD8 = dagger.internal.g.d(new com.avito.android.extended_profile_selection_create.select.adapter.advert.f(this.f152163N));
            this.f152166Q = uVarD8;
            this.f152169T = dagger.internal.g.d(new com.avito.android.extended_profile_selection_create.select.adapter.advert.b(uVarD8, new D(cVar), new p(cVar)));
            dagger.internal.u<com.avito.android.extended_profile_selection_create.select.adapter.search_correction.c> uVarD9 = dagger.internal.g.d(new com.avito.android.extended_profile_selection_create.select.adapter.search_correction.f(this.f152163N));
            this.f152170U = uVarD9;
            this.f152171V = dagger.internal.g.d(new com.avito.android.extended_profile_selection_create.select.adapter.search_correction.b(uVarD9));
            dagger.internal.u<com.avito.android.extended_profile_selection_create.select.adapter.search_empty.c> uVarD10 = dagger.internal.g.d(new com.avito.android.extended_profile_selection_create.select.adapter.search_empty.f(this.f152163N));
            this.f152172W = uVarD10;
            this.f152173X = dagger.internal.g.d(new com.avito.android.extended_profile_selection_create.select.adapter.search_empty.b(uVarD10));
            A.b bVarA = dagger.internal.A.a(4, 1);
            bVarA.f393938b.add(this.f152162M);
            dagger.internal.u<TV0.b<?, ?>> uVar2 = this.f152165P;
            List<dagger.internal.u<T>> list = bVarA.f393937a;
            list.add(uVar2);
            list.add(this.f152169T);
            list.add(this.f152171V);
            list.add(this.f152173X);
            dagger.internal.u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f152174Y = uVarK;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f152175Z = uVarH;
            this.f152177a0 = dagger.internal.g.d(new com.avito.android.extended_profile_selection_create.select.di.i(uVarH, this.f152174Y));
            this.f152179b0 = new z(cVar);
            this.f152181c0 = dagger.internal.g.d(C31049i.a());
            this.f152183d0 = dagger.internal.g.d(V.a());
            this.f152185e0 = new x(cVar);
            this.f152187f0 = dagger.internal.l.b(serpSpaceType);
            this.f152189g0 = dagger.internal.l.a(inlineFiltersSource);
            this.f152191h0 = dagger.internal.g.d(new C31057q(this.f152179b0, this.f152190h, this.f152181c0, this.f152183d0, C31061v.a(), this.f152185e0, this.f152187f0, this.f152189g0));
            this.f152197k0 = dagger.internal.g.d(new C31059t(new r(interfaceC44697a), new q(interfaceC44697a), this.f152185e0));
            this.f152199l0 = dagger.internal.g.d(new C31054n(this.f152179b0, this.f152190h, this.f152185e0, this.f152189g0));
            this.f152209q0 = dagger.internal.B.a(com.avito.android.location.A.a(new w(interfaceC44697a), new t(cVar), new E(interfaceC44697a), new C30502e(interfaceC44697a)));
            this.f152211r0 = dagger.internal.g.d(l0.a());
            this.f152213s0 = dagger.internal.g.d(new CN.m(this.f152202n, this.f152189g0));
            this.f152215t0 = dagger.internal.g.d(new C42105g(this.f152216u));
            dagger.internal.l lVarB = dagger.internal.l.b(kundle);
            f fVar = new f(cVar);
            o oVar = new o(cVar);
            A a12 = new A(cVar);
            m mVar = new m(cVar);
            s sVar = new s(cVar);
            dagger.internal.u<InterfaceC35745a5> uVar3 = this.f152185e0;
            this.f152145A0 = new Q(this.f152191h0, this.f152198l, this.f152197k0, this.f152199l0, this.f152209q0, this.f152211r0, this.f152148C, uVar3, this.f152213s0, this.f152215t0, lVarB, fVar, oVar, a12, mVar, this.f152150D, new com.avito.android.onboarding_manager.d(sVar, uVar3, this.f152188g), new j(cVar), this.f152152E, com.avito.android.inline_filters.dialog.calendar.date_range.b.a());
            this.f152147B0 = dagger.internal.g.d(this.f152145A0);
            this.f152149C0 = dagger.internal.g.d(com.avito.android.extended_profile_selection_create.select.select.b.a());
            this.f152151D0 = dagger.internal.g.d(new com.avito.android.inline_filters.repository_suggest.b(this.f152179b0, this.f152190h));
            this.f152155F0 = dagger.internal.g.d(new C30510l(dagger.internal.l.a(fragment), this.f152163N, new k(cVar)));
        }

        @Override // com.avito.android.extended_profile_selection_create.select.di.b
        public final void a(ExtendedProfileSelectionCreateFragment extendedProfileSelectionCreateFragment) {
            extendedProfileSelectionCreateFragment.f151954n0 = this.f152222x;
            extendedProfileSelectionCreateFragment.f151957q0 = this.f152216u.get();
            extendedProfileSelectionCreateFragment.f151958r0 = this.f152156G.get();
            com.avito.android.extended_profile_selection_create.select.di.c cVar = this.f152176a;
            extendedProfileSelectionCreateFragment.f151959s0 = new com.avito.android.inline_filters.dialog.z(cVar.T0());
            extendedProfileSelectionCreateFragment.f151960t0 = this.f152159J.get();
            com.avito.android.onboarding_manager.f fVarL0 = cVar.l0();
            dagger.internal.t.c(fVarL0);
            InterfaceC35745a5 interfaceC35745a5D = cVar.d();
            dagger.internal.t.c(interfaceC35745a5D);
            R0 r0C = cVar.c();
            dagger.internal.t.c(r0C);
            extendedProfileSelectionCreateFragment.f151961u0 = new com.avito.android.onboarding_manager.a(fVarL0, interfaceC35745a5D, r0C);
            com.avito.android.onboarding_manager.f fVarL02 = cVar.l0();
            dagger.internal.t.c(fVarL02);
            extendedProfileSelectionCreateFragment.f151962v0 = fVarL02;
            com.avito.android.util.text.a aVarE = cVar.e();
            dagger.internal.t.c(aVarE);
            extendedProfileSelectionCreateFragment.f151963w0 = aVarE;
            extendedProfileSelectionCreateFragment.f151964x0 = this.f152161L.get();
            extendedProfileSelectionCreateFragment.f151965y0 = this.f152177a0.get();
            extendedProfileSelectionCreateFragment.f151966z0 = this.f152147B0.get();
            extendedProfileSelectionCreateFragment.f151943A0 = this.f152149C0.get();
            extendedProfileSelectionCreateFragment.f151944B0 = this.f152151D0.get();
            extendedProfileSelectionCreateFragment.f151945C0 = this.f152155F0.get();
            extendedProfileSelectionCreateFragment.f151946D0 = cVar.h();
            extendedProfileSelectionCreateFragment.f151947E0 = this.f152178b;
            extendedProfileSelectionCreateFragment.f151948F0 = cVar.j0();
            InterfaceC13094a interfaceC13094aV0 = cVar.V0();
            dagger.internal.t.c(interfaceC13094aV0);
            extendedProfileSelectionCreateFragment.f151949G0 = interfaceC13094aV0;
            extendedProfileSelectionCreateFragment.f151950H0 = cVar.e0();
        }
    }

    /* compiled from: DaggerExtendedProfileSelectionCreateComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.extended_profile_selection_create.select.di.b.a
        public final com.avito.android.extended_profile_selection_create.select.di.b a(ActivityC22955m activityC22955m, ExtendedProfileSelectionCreateFragment extendedProfileSelectionCreateFragment, Resources resources, ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig, Z1 z12, com.avito.android.extended_profile_selection_create.select.di.c cVar, InterfaceC44697a interfaceC44697a, InterfaceC39417a interfaceC39417a, r rVar, ExtendedProfileSelectionCreateScreen extendedProfileSelectionCreateScreen, ExtendedProfileSelectionCreateFragment extendedProfileSelectionCreateFragment2, Y41.l lVar, S0 s02, Kundle kundle) {
            InlineFiltersSource inlineFiltersSource = InlineFiltersSource.f170995d;
            extendedProfileSelectionCreateConfig.getClass();
            z12.getClass();
            interfaceC39417a.getClass();
            extendedProfileSelectionCreateScreen.getClass();
            return new b(cVar, interfaceC39417a, interfaceC44697a, activityC22955m, extendedProfileSelectionCreateFragment, resources, extendedProfileSelectionCreateConfig, z12, rVar, extendedProfileSelectionCreateScreen, extendedProfileSelectionCreateFragment2, lVar, s02, kundle, inlineFiltersSource, null, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
