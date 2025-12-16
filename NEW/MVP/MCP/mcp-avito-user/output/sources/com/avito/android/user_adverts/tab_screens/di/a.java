package com.avito.android.user_adverts.tab_screens.di;

import Wl0.InterfaceC15774a;
import Zx.C19616a;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import bW.InterfaceC25571b;
import cJ0.C27049c;
import cJ0.C27052f;
import cJ0.InterfaceC27047a;
import cJ0.InterfaceC27050d;
import com.avito.android.Z0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.di.InterfaceC31136m0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.personal_selections.mvi.o;
import com.avito.android.user_adverts.root_screen.adverts_host.i0;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListData;
import com.avito.android.user_adverts.tab_screens.advert_list.progress.d;
import com.avito.android.user_adverts.tab_screens.adverts.C35662a;
import com.avito.android.user_adverts.tab_screens.adverts.F;
import com.avito.android.user_adverts.tab_screens.adverts.G;
import com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment;
import com.avito.android.user_adverts.tab_screens.adverts.j;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.N;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.Q;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.T;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.V;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.C35695e;
import com.avito.android.user_adverts.tab_screens.adverts.tooltip.P;
import com.avito.android.user_adverts.tab_screens.di.l;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import com.google.common.collect.H1;
import cv.InterfaceC39417a;
import d70.InterfaceC39525a;
import java.util.Set;
import nE.C44240b;
import wJ0.InterfaceC49523d;
import xJ0.InterfaceC49849a;
import xJ0.InterfaceC49850b;

/* compiled from: DaggerUserAdvertsListMviComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerUserAdvertsListMviComponent.java */
    public static final class b implements l.a {
        public b() {
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.l.a
        public final l a(UserAdvertsListData userAdvertsListData, UserAdvertsListMviFragment userAdvertsListMviFragment, Resources resources, C28478k c28478k, ScreenPerformanceTracker screenPerformanceTracker, m mVar, InterfaceC39417a interfaceC39417a, com.avito.android.position_in_search.storage.provider.c cVar, com.avito.android.personal_banner.feature.factory.b bVar, H h12, com.avito.android.personal_selections.di.c cVar2) {
            userAdvertsListData.getClass();
            screenPerformanceTracker.getClass();
            interfaceC39417a.getClass();
            cVar.getClass();
            bVar.getClass();
            h12.getClass();
            cVar2.getClass();
            return new c(interfaceC39417a, mVar, cVar, bVar, h12, cVar2, userAdvertsListData, userAdvertsListMviFragment, resources, c28478k, screenPerformanceTracker, null);
        }
    }

    /* compiled from: DaggerUserAdvertsListMviComponent.java */
    public static final class c implements com.avito.android.user_adverts.tab_screens.di.l {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.converters.j> f315809A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.converters.g> f315810B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.profile_settings.u> f315811C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.passport.profile_add.l> f315812D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.l f315813E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<n.a> f315814F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<Set<FV0.h>> f315815G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<B> f315816H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<aU0.b> f315817I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.l f315818J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC49850b> f315819K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.l f315820L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts_views_pub.a> f315821M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC49523d> f315822N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC25571b> f315823O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.text.a> f315824P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC49849a> f315825Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.conveyor_shared_item.single_text.b> f315826R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.disclaimer.a> f315827S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.b> f315828T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.g> f315829U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.c> f315830V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.loading.b> f315831W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.loading.h> f315832X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.loading.f> f315833Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<d.a> f315834Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.personal_banner.feature.factory.b f315835a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.progress.d> f315836a0;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.personal_selections.di.c f315837b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.progress.b> f315838b0;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.user_adverts.tab_screens.di.m f315839c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.empty_search.d> f315840c0;

        /* renamed from: d, reason: collision with root package name */
        public final cv.b f315841d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.empty_search.b> f315842d0;

        /* renamed from: e, reason: collision with root package name */
        public final UserAdvertsListData f315843e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC39525a> f315844e0;

        /* renamed from: f, reason: collision with root package name */
        public final InterfaceC31136m0 f315845f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.personal_selections.view.a> f315846f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f315847g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f315848g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f315849h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.d> f315850h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC15774a> f315851i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<RecyclerView.l> f315852i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<R0> f315853j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.l f315854j0;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f315855k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<RecyclerView.l> f315856k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.adverts.domain.a> f315857l;

        /* renamed from: l0, reason: collision with root package name */
        public final dagger.internal.u<RecyclerView.l> f315858l0;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_actions.host.domain.f> f315859m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<AK0.l> f315860n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC27050d> f315861o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<nI0.f> f315862p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<eH0.k> f315863q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC27047a> f315864r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.a> f315865s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.adverts.dataProvider.g> f315866t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<C44240b> f315867u;

        /* renamed from: v, reason: collision with root package name */
        public final N f315868v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.position_in_search.storage.g> f315869w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<C19616a> f315870x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.converters.d> f315871y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_adverts.tab_screens.converters.a> f315872z;

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        /* renamed from: com.avito.android.user_adverts.tab_screens.di.a$c$a, reason: collision with other inner class name */
        public static final class C9793a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315873a;

            public C9793a(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315873a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315873a.a();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class b implements dagger.internal.u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315874a;

            public b(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315874a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315874a.e();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        /* renamed from: com.avito.android.user_adverts.tab_screens.di.a$c$c, reason: collision with other inner class name */
        public static final class C9794c implements dagger.internal.u<n.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31136m0 f315875a;

            public C9794c(InterfaceC31136m0 interfaceC31136m0) {
                this.f315875a = interfaceC31136m0;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                n.a aVarC = this.f315875a.c();
                dagger.internal.t.c(aVarC);
                return aVarC;
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class d implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315876a;

            public d(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315876a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315876a.c();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class e implements dagger.internal.u<C19616a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315877a;

            public e(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315877a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315877a.l1();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class f implements dagger.internal.u<aU0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31136m0 f315878a;

            public f(InterfaceC31136m0 interfaceC31136m0) {
                this.f315878a = interfaceC31136m0;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                aU0.b bVarB = this.f315878a.b();
                dagger.internal.t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class g implements dagger.internal.u<InterfaceC25571b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315879a;

            public g(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315879a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315879a.Y4();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class h implements dagger.internal.u<B> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31136m0 f315880a;

            public h(InterfaceC31136m0 interfaceC31136m0) {
                this.f315880a = interfaceC31136m0;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                B bE2 = this.f315880a.e();
                dagger.internal.t.c(bE2);
                return bE2;
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class i implements dagger.internal.u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315881a;

            public i(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315881a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315881a.r();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class j implements dagger.internal.u<com.avito.android.profile_settings.u> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315882a;

            public j(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315882a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315882a.s3();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class k implements dagger.internal.u<InterfaceC39525a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.personal_banner.feature.factory.b f315883a;

            public k(com.avito.android.personal_banner.feature.factory.b bVar) {
                this.f315883a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315883a.b();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class l implements dagger.internal.u<com.avito.android.personal_selections.view.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.personal_selections.di.c f315884a;

            public l(com.avito.android.personal_selections.di.c cVar) {
                this.f315884a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.personal_selections.view.a aVarB = this.f315884a.b();
                dagger.internal.t.c(aVarB);
                return aVarB;
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class m implements dagger.internal.u<com.avito.android.passport.profile_add.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315885a;

            public m(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315885a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315885a.B3();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class n implements dagger.internal.u<Set<FV0.h>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC31136m0 f315886a;

            public n(InterfaceC31136m0 interfaceC31136m0) {
                this.f315886a = interfaceC31136m0;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Set<FV0.h> setD = this.f315886a.d();
                dagger.internal.t.c(setD);
                return setD;
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class o implements dagger.internal.u<com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315887a;

            public o(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315887a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.a aVarZ8 = this.f315887a.Z8();
                dagger.internal.t.c(aVarZ8);
                return aVarZ8;
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class p implements dagger.internal.u<com.avito.android.position_in_search.storage.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.position_in_search.storage.provider.c f315888a;

            public p(com.avito.android.position_in_search.storage.provider.c cVar) {
                this.f315888a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315888a.c();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class q implements dagger.internal.u<InterfaceC49850b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315889a;

            public q(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315889a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315889a.x1();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class r implements dagger.internal.u<InterfaceC15774a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315890a;

            public r(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315890a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315890a.e3();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class s implements dagger.internal.u<com.avito.android.user_adverts.tab_actions.host.domain.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315891a;

            public s(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315891a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315891a.dg();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class t implements dagger.internal.u<C44240b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315892a;

            public t(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315892a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315892a.a7();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class u implements dagger.internal.u<eH0.k> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315893a;

            public u(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315893a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315893a.z6();
            }
        }

        /* compiled from: DaggerUserAdvertsListMviComponent.java */
        public static final class v implements dagger.internal.u<com.avito.android.user_adverts.tab_screens.adverts.dataProvider.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_adverts.tab_screens.di.m f315894a;

            public v(com.avito.android.user_adverts.tab_screens.di.m mVar) {
                this.f315894a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f315894a.zl();
            }
        }

        public c(cv.b bVar, com.avito.android.user_adverts.tab_screens.di.m mVar, com.avito.android.position_in_search.storage.provider.c cVar, com.avito.android.personal_banner.feature.factory.b bVar2, InterfaceC31136m0 interfaceC31136m0, com.avito.android.personal_selections.di.c cVar2, UserAdvertsListData userAdvertsListData, UserAdvertsListMviFragment userAdvertsListMviFragment, Resources resources, C28478k c28478k, ScreenPerformanceTracker screenPerformanceTracker, C9792a c9792a) {
            this.f315835a = bVar2;
            this.f315837b = cVar2;
            this.f315839c = mVar;
            this.f315841d = bVar;
            this.f315843e = userAdvertsListData;
            this.f315845f = interfaceC31136m0;
            this.f315847g = dagger.internal.l.a(userAdvertsListData);
            this.f315849h = dagger.internal.l.a(screenPerformanceTracker);
            r rVar = new r(mVar);
            d dVar = new d(mVar);
            this.f315853j = dVar;
            C9793a c9793a = new C9793a(mVar);
            this.f315855k = c9793a;
            this.f315857l = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.adverts.domain.e(rVar, dVar, c9793a));
            this.f315859m = new s(mVar);
            dagger.internal.u<InterfaceC27050d> uVarD = dagger.internal.g.d(new C27052f(new i(mVar)));
            this.f315861o = uVarD;
            this.f315862p = dagger.internal.g.d(new nI0.h(uVarD, this.f315855k));
            dagger.internal.u<InterfaceC27047a> uVarD2 = dagger.internal.g.d(new C27049c(new u(mVar)));
            this.f315864r = uVarD2;
            o oVar = new o(mVar);
            v vVar = new v(mVar);
            t tVar = new t(mVar);
            this.f315868v = new N(uVarD2, this.f315857l, this.f315859m, this.f315853j, this.f315862p, this.f315855k, oVar, vVar, tVar);
            p pVar = new p(cVar);
            e eVar = new e(mVar);
            this.f315870x = eVar;
            this.f315871y = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.converters.f(tVar, pVar, eVar));
            dagger.internal.u<com.avito.android.user_adverts.tab_screens.converters.a> uVarD3 = dagger.internal.g.d(com.avito.android.user_adverts.tab_screens.converters.c.a());
            this.f315872z = uVarD3;
            this.f315809A = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.converters.l(uVarD3, this.f315871y));
            dagger.internal.u<com.avito.android.user_adverts.tab_screens.converters.g> uVarD4 = dagger.internal.g.d(com.avito.android.user_adverts.tab_screens.converters.i.a());
            this.f315810B = uVarD4;
            V v12 = new V(uVarD4, this.f315809A);
            this.f315811C = new j(mVar);
            this.f315812D = new m(mVar);
            this.f315813E = dagger.internal.l.a(new com.avito.android.user_adverts.tab_screens.adverts.H(new G(new Q(this.f315847g, this.f315849h, this.f315868v, v12, T.a(), this.f315853j, this.f315811C, this.f315812D))));
            this.f315818J = dagger.internal.l.a(new com.avito.android.user_adverts.tab_screens.adverts.m(new com.avito.android.user_adverts.tab_screens.adverts.l(new C9794c(interfaceC31136m0), new n(interfaceC31136m0), new h(interfaceC31136m0), new f(interfaceC31136m0))));
            this.f315819K = new q(mVar);
            dagger.internal.l lVarA = dagger.internal.l.a(userAdvertsListMviFragment);
            this.f315820L = lVarA;
            this.f315821M = dagger.internal.g.d(lVarA);
            dagger.internal.u<InterfaceC49523d> uVarD5 = dagger.internal.g.d(this.f315820L);
            this.f315822N = uVarD5;
            this.f315825Q = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.di.j(uVarD5, this.f315819K, this.f315821M, new g(mVar), this.f315870x, new b(mVar)));
            dagger.internal.u<com.avito.android.conveyor_shared_item.single_text.b> uVarD6 = dagger.internal.g.d(com.avito.android.conveyor_shared_item.single_text.d.a());
            this.f315826R = uVarD6;
            this.f315827S = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.di.f(uVarD6));
            dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.b> uVarD7 = dagger.internal.g.d(this.f315820L);
            this.f315828T = uVarD7;
            dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.g> uVarD8 = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.k(uVarD7));
            this.f315829U = uVarD8;
            this.f315830V = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.di.i(uVarD8));
            dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.loading.b> uVarD9 = dagger.internal.g.d(this.f315820L);
            this.f315831W = uVarD9;
            dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.loading.h> uVarD10 = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.advert_list.loading.d(uVarD9));
            this.f315832X = uVarD10;
            this.f315833Y = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.di.h(uVarD10));
            dagger.internal.u<d.a> uVarD11 = dagger.internal.g.d(this.f315820L);
            this.f315834Z = uVarD11;
            dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.progress.d> uVarD12 = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.advert_list.progress.f(uVarD11));
            this.f315836a0 = uVarD12;
            this.f315838b0 = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.advert_list.progress.c(uVarD12));
            dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.empty_search.d> uVarD13 = dagger.internal.g.d(com.avito.android.user_adverts.tab_screens.advert_list.empty_search.e.a());
            this.f315840c0 = uVarD13;
            dagger.internal.u<com.avito.android.user_adverts.tab_screens.advert_list.empty_search.b> uVarD14 = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.advert_list.empty_search.c(uVarD13));
            this.f315842d0 = uVarD14;
            dagger.internal.u<com.avito.konveyor.a> uVarD15 = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.di.g(uVarD14, this.f315825Q, this.f315827S, this.f315830V, this.f315833Y, this.f315838b0, new k(bVar2), new l(cVar2)));
            this.f315848g0 = uVarD15;
            this.f315850h0 = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.di.k(uVarD15, com.avito.android.user_adverts.tab_screens.advert_list.d.a()));
            this.f315852i0 = dagger.internal.g.d(com.avito.android.user_adverts.tab_screens.advert_list.b.a());
            dagger.internal.l lVarA2 = dagger.internal.l.a(resources);
            this.f315854j0 = lVarA2;
            this.f315856k0 = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.advert_list.disclaimer.d(lVarA2, this.f315848g0));
            this.f315858l0 = dagger.internal.g.d(new com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title.f(this.f315854j0, this.f315848g0));
        }

        @Override // com.avito.android.user_adverts.tab_screens.di.l
        public final void a(UserAdvertsListMviFragment userAdvertsListMviFragment) {
            userAdvertsListMviFragment.f314846o0 = (F.a) this.f315813E.f393949a;
            userAdvertsListMviFragment.f314847p0 = (j.a) this.f315818J.f393949a;
            userAdvertsListMviFragment.f314848q0 = this.f315835a.a();
            com.avito.android.personal_selections.di.c cVar = this.f315837b;
            o.a aVarA = cVar.a();
            dagger.internal.t.c(aVarA);
            userAdvertsListMviFragment.f314849r0 = aVarA;
            userAdvertsListMviFragment.f314850s0 = this.f315850h0.get();
            userAdvertsListMviFragment.f314851t0 = H1.K(this.f315852i0.get(), this.f315856k0.get(), this.f315858l0.get());
            com.avito.android.user_adverts.tab_screens.di.m mVar = this.f315839c;
            com.avito.android.user_adverts.tab_screens.adverts.n nVarQg = mVar.qg();
            dagger.internal.t.c(nVarQg);
            userAdvertsListMviFragment.f314852u0 = nVarQg;
            cv.b bVar = this.f315841d;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            dagger.internal.t.c(aVarU4);
            userAdvertsListMviFragment.f314853v0 = aVarU4;
            com.avito.android.user_adverts.tab_actions.host.e eVarW8 = mVar.W8();
            dagger.internal.t.c(eVarW8);
            userAdvertsListMviFragment.f314854w0 = eVarW8;
            userAdvertsListMviFragment.f314855x0 = mVar.c();
            userAdvertsListMviFragment.f314856y0 = new P(this.f315843e, mVar.J7(), mVar.c());
            com.avito.android.deeplink_handler.handler.composite.a aVarU42 = bVar.u4();
            dagger.internal.t.c(aVarU42);
            userAdvertsListMviFragment.f314857z0 = new C35695e(aVarU42, mVar.a7());
            i0 i0VarJ9 = mVar.j9();
            dagger.internal.t.c(i0VarJ9);
            userAdvertsListMviFragment.f314829A0 = i0VarJ9;
            userAdvertsListMviFragment.f314830B0 = new com.avito.android.user_adverts.tab_screens.adverts.o(mVar.a());
            R0 r0C = mVar.c();
            Z0 z0W = mVar.W();
            ZS.b bVarA = this.f315845f.a();
            dagger.internal.t.c(bVarA);
            userAdvertsListMviFragment.f314831C0 = new C35662a.b(r0C, z0W, bVarA);
            userAdvertsListMviFragment.f314832D0 = mVar.s3();
            userAdvertsListMviFragment.f314833E0 = mVar.B3();
            com.avito.android.personal_selections.view.d dVarC = cVar.c();
            dagger.internal.t.c(dVarC);
            userAdvertsListMviFragment.f314834F0 = dVarC;
            userAdvertsListMviFragment.f314835G0 = mVar.a7();
        }
    }

    public static l.a a() {
        return new b();
    }
}
