package com.avito.android.profile.pro.impl.di;

import Fc0.InterfaceC13557a;
import android.content.Context;
import android.content.res.Resources;
import androidx.view.T0;
import cK.InterfaceC27058a;
import com.avito.android.account.E;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.profile.pro.impl.ProfileTabUserType;
import com.avito.android.profile.pro.impl.converters.A;
import com.avito.android.profile.pro.impl.converters.C33348c;
import com.avito.android.profile.pro.impl.converters.C33351f;
import com.avito.android.profile.pro.impl.converters.C33354i;
import com.avito.android.profile.pro.impl.converters.G;
import com.avito.android.profile.pro.impl.converters.J;
import com.avito.android.profile.pro.impl.di.d;
import com.avito.android.profile.pro.impl.generated.api.ProfileProApi;
import com.avito.android.profile.pro.impl.screen.A;
import com.avito.android.profile.pro.impl.screen.B;
import com.avito.android.profile.pro.impl.screen.C;
import com.avito.android.profile.pro.impl.screen.D;
import com.avito.android.profile.pro.impl.screen.F;
import com.avito.android.profile.pro.impl.screen.H;
import com.avito.android.profile.pro.impl.screen.ProfileProFragment;
import com.avito.android.profile.pro.impl.screen.item.service_booking_block.w;
import com.avito.android.profile.pro.impl.screen.item.service_booking_block.y;
import com.avito.android.profile.pro.impl.screen.item.service_booking_block.z;
import com.avito.android.profile_tab.summary.factory.i;
import com.avito.android.seller_coach.hints_dialog.view.h;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.u;
import hz.InterfaceC41196a;
import iT.InterfaceC41341a;
import iT.InterfaceC41342b;
import java.util.List;
import java.util.Set;
import mg.InterfaceC44079c;
import qg.C47395a;

/* compiled from: DaggerProfileProComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerProfileProComponent.java */
    public static final class b implements d.a {
        public b() {
        }

        @Override // com.avito.android.profile.pro.impl.di.d.a
        public final d a(e eVar, InterfaceC39417a interfaceC39417a, com.avito.android.service_booking_user_profile.view.j jVar, InterfaceC44079c interfaceC44079c, com.avito.android.seller_coach.hints_dialog.provider.l lVar, Y41.l lVar2, l41.g gVar, Resources resources, ProfileTabUserType profileTabUserType, ProfileProFragment profileProFragment, ScreenPerformanceTracker screenPerformanceTracker) {
            interfaceC39417a.getClass();
            jVar.getClass();
            interfaceC44079c.getClass();
            lVar.getClass();
            gVar.getClass();
            screenPerformanceTracker.getClass();
            return new c(new f(), new K3.c(), new m(), eVar, interfaceC39417a, jVar, lVar, interfaceC44079c, lVar2, gVar, resources, profileTabUserType, profileProFragment, screenPerformanceTracker, null);
        }
    }

    /* compiled from: DaggerProfileProComponent.java */
    public static final class c implements com.avito.android.profile.pro.impl.di.d {

        /* renamed from: A, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.mvi.h f222486A;

        /* renamed from: A0, reason: collision with root package name */
        public final u<InterfaceC41341a> f222487A0;

        /* renamed from: B, reason: collision with root package name */
        public final u<E> f222488B;

        /* renamed from: B0, reason: collision with root package name */
        public final u<InterfaceC41342b> f222489B0;

        /* renamed from: C, reason: collision with root package name */
        public final u<InterfaceC27663a> f222490C;

        /* renamed from: C0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.beduin.b f222491C0;

        /* renamed from: D, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.mvi.o f222492D;

        /* renamed from: D0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.my_services.b f222493D0;

        /* renamed from: E, reason: collision with root package name */
        public final u<D> f222494E;

        /* renamed from: E0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.widget_group.title.b f222495E0;

        /* renamed from: F, reason: collision with root package name */
        public final u<ZS.b> f222496F;

        /* renamed from: F0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.widget_group.widget.b f222497F0;

        /* renamed from: G, reason: collision with root package name */
        public final u<i.b> f222498G;

        /* renamed from: G0, reason: collision with root package name */
        public final u<com.avito.android.profile.pro.impl.screen.item.avito_finance.item.d> f222499G0;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.android.profile_tab.summary.factory.i> f222500H;

        /* renamed from: H0, reason: collision with root package name */
        public final u<com.avito.android.profile.pro.impl.screen.item.avito_finance.item.b> f222501H0;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.service_booking_user_profile.view.mvi.p<?>> f222502I;

        /* renamed from: I0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.e f222503I0;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.l f222504J;

        /* renamed from: J0, reason: collision with root package name */
        public final u<x> f222505J0;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.l f222506K;

        /* renamed from: K0, reason: collision with root package name */
        public final u<C47395a> f222507K0;

        /* renamed from: L, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.avatar.b f222508L;

        /* renamed from: L0, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f222509L0;

        /* renamed from: M, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.dashboard.b f222510M;

        /* renamed from: M0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.c f222511M0;

        /* renamed from: N, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f222512N;

        /* renamed from: N0, reason: collision with root package name */
        public final dagger.internal.l f222513N0;

        /* renamed from: O, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.dashboard_stats.b f222514O;

        /* renamed from: O0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.avito_finance.item_skeleton.b f222515O0;

        /* renamed from: P, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.b f222516P;

        /* renamed from: P0, reason: collision with root package name */
        public final dagger.internal.l f222517P0;

        /* renamed from: Q, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.name.b f222518Q;

        /* renamed from: Q0, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f222519Q0;

        /* renamed from: R, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.rating.b f222520R;

        /* renamed from: R0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f222521R0;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.l f222522S;

        /* renamed from: S0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f222523S0;

        /* renamed from: T, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.passport.b f222524T;

        /* renamed from: U, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.orders.e f222525U;

        /* renamed from: V, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f222526V;

        /* renamed from: W, reason: collision with root package name */
        public final u<com.avito.android.active_orders_common.items.order.j> f222527W;

        /* renamed from: X, reason: collision with root package name */
        public final u<com.avito.android.active_orders_common.items.order.f> f222528X;

        /* renamed from: Y, reason: collision with root package name */
        public final com.avito.android.active_orders_common.items.order.b f222529Y;

        /* renamed from: Z, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f222530Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.di.e f222531a;

        /* renamed from: a0, reason: collision with root package name */
        public final u<com.avito.android.active_orders_common.items.all_orders.f> f222532a0;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.di.m f222533b;

        /* renamed from: b0, reason: collision with root package name */
        public final com.avito.android.active_orders_common.items.all_orders.b f222534b0;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f222535c;

        /* renamed from: c0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f222536c0;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.seller_coach.hints_dialog.provider.l f222537d;

        /* renamed from: d0, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f222538d0;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC44079c f222539e;

        /* renamed from: e0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f222540e0;

        /* renamed from: f, reason: collision with root package name */
        public final c f222541f;

        /* renamed from: f0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f222542f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f222543g;

        /* renamed from: g0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.orders.b f222544g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f222545h;

        /* renamed from: h0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.walletandprepayment.b f222546h0;

        /* renamed from: i, reason: collision with root package name */
        public final u<ProfileProApi> f222547i;

        /* renamed from: i0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.group.title.b f222548i0;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.activeOrders.a> f222549j;

        /* renamed from: j0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.group.row.c f222550j0;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.converters.x f222551k;

        /* renamed from: k0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.employee.company.b f222552k0;

        /* renamed from: l, reason: collision with root package name */
        public final u<Context> f222553l;

        /* renamed from: l0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.employee.limits.b f222554l0;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28373a> f222555m;

        /* renamed from: m0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.employee.mode.b f222556m0;

        /* renamed from: n, reason: collision with root package name */
        public final t90.f f222557n;

        /* renamed from: n0, reason: collision with root package name */
        public final u<com.avito.android.profile.pro.impl.screen.item.service_booking_block.m> f222558n0;

        /* renamed from: o, reason: collision with root package name */
        public final v90.g f222559o;

        /* renamed from: o0, reason: collision with root package name */
        public final u<com.avito.android.profile.pro.impl.screen.item.service_booking_block.c> f222560o0;

        /* renamed from: p, reason: collision with root package name */
        public final v90.c f222561p;

        /* renamed from: p0, reason: collision with root package name */
        public final u<com.avito.android.profile.pro.impl.screen.item.service_booking_block.a> f222562p0;

        /* renamed from: q, reason: collision with root package name */
        public final u<SK0.b> f222563q;

        /* renamed from: q0, reason: collision with root package name */
        public final u<com.avito.android.profile.pro.impl.screen.item.service_booking_block.i> f222564q0;

        /* renamed from: r, reason: collision with root package name */
        public final u<E90.a> f222565r;

        /* renamed from: r0, reason: collision with root package name */
        public final dagger.internal.l f222566r0;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.converters.l f222567s;

        /* renamed from: s0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.service_booking_block.u f222568s0;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC35863o4> f222569t;

        /* renamed from: t0, reason: collision with root package name */
        public final u<com.avito.android.profile.pro.impl.screen.item.geo_banner.c> f222570t0;

        /* renamed from: u, reason: collision with root package name */
        public final J f222571u;

        /* renamed from: u0, reason: collision with root package name */
        public final u<com.avito.android.profile.pro.impl.screen.item.geo_banner.a> f222572u0;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC41196a> f222573v;

        /* renamed from: v0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.reputation.b f222574v0;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC27058a> f222575w;

        /* renamed from: w0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.delivery_restriction.h f222576w0;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.calltracking_core.f> f222577x;

        /* renamed from: x0, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.screen.item.delivery_restriction.b f222578x0;

        /* renamed from: y, reason: collision with root package name */
        public final u<R0> f222579y;

        /* renamed from: y0, reason: collision with root package name */
        public final u<com.avito.android.lib.beduin_v2.feature.item.b> f222580y0;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.profile.pro.impl.interactor.j f222581z;

        /* renamed from: z0, reason: collision with root package name */
        public final dagger.internal.l f222582z0;

        /* compiled from: DaggerProfileProComponent.java */
        /* renamed from: com.avito.android.profile.pro.impl.di.a$c$a, reason: collision with other inner class name */
        public static final class C6734a implements u<InterfaceC27663a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222583a;

            public C6734a(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222583a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC27663a interfaceC27663aW0 = this.f222583a.w0();
                dagger.internal.t.c(interfaceC27663aW0);
                return interfaceC27663aW0;
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class b implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222584a;

            public b(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222584a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f222584a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        /* renamed from: com.avito.android.profile.pro.impl.di.a$c$c, reason: collision with other inner class name */
        public static final class C6735c implements u<com.avito.android.activeOrders.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222585a;

            public C6735c(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222585a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f222585a.ai();
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class d implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222586a;

            public d(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222586a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f222586a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class e implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222587a;

            public e(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222587a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f222587a.e();
                dagger.internal.t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class f implements u<C47395a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222588a;

            public f(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222588a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C47395a c47395aZi = this.f222588a.Zi();
                dagger.internal.t.c(c47395aZi);
                return c47395aZi;
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class g implements u<com.avito.android.lib.beduin_v2.feature.item.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222589a;

            public g(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222589a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f222589a.j0();
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class h implements u<com.avito.android.calltracking_core.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222590a;

            public h(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222590a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.calltracking_core.f fVarOf = this.f222590a.Of();
                dagger.internal.t.c(fVarOf);
                return fVarOf;
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class i implements u<InterfaceC27058a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222591a;

            public i(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222591a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC27058a interfaceC27058aI5 = this.f222591a.I5();
                dagger.internal.t.c(interfaceC27058aI5);
                return interfaceC27058aI5;
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class j implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222592a;

            public j(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222592a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f222592a.g();
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class k implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222593a;

            public k(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222593a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f222593a.q();
                dagger.internal.t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class l implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f222594a;

            public l(cv.b bVar) {
                this.f222594a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f222594a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class m implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222595a;

            public m(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222595a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f222595a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class n implements u<InterfaceC41196a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222596a;

            public n(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222596a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41196a interfaceC41196aE0 = this.f222596a.E0();
                dagger.internal.t.c(interfaceC41196aE0);
                return interfaceC41196aE0;
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class o implements u<ProfileProApi> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222597a;

            public o(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222597a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ProfileProApi profileProApiPk = this.f222597a.Pk();
                dagger.internal.t.c(profileProApiPk);
                return profileProApiPk;
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class p implements u<E90.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222598a;

            public p(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222598a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f222598a.e8();
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class q implements u<i.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222599a;

            public q(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222599a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f222599a.Dc();
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class r implements u<com.avito.android.service_booking_user_profile.view.mvi.p<?>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_user_profile.view.j f222600a;

            public r(com.avito.android.service_booking_user_profile.view.j jVar) {
                this.f222600a = jVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f222600a.a();
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class s implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222601a;

            public s(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222601a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f222601a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerProfileProComponent.java */
        public static final class t implements u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.pro.impl.di.e f222602a;

            public t(com.avito.android.profile.pro.impl.di.e eVar) {
                this.f222602a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarI6 = this.f222602a.I6();
                dagger.internal.t.c(bVarI6);
                return bVarI6;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.profile.pro.impl.di.f fVar, K3.c cVar, com.avito.android.profile.pro.impl.di.m mVar, com.avito.android.profile.pro.impl.di.e eVar, cv.b bVar, com.avito.android.service_booking_user_profile.view.j jVar, com.avito.android.seller_coach.hints_dialog.provider.l lVar, InterfaceC44079c interfaceC44079c, Y41.l lVar2, l41.g gVar, Resources resources, ProfileTabUserType profileTabUserType, T0 t02, ScreenPerformanceTracker screenPerformanceTracker, C6733a c6733a) {
            this.f222541f = this;
            this.f222531a = eVar;
            this.f222533b = mVar;
            this.f222535c = bVar;
            this.f222537d = lVar;
            this.f222539e = interfaceC44079c;
            this.f222543g = dagger.internal.l.a(t02);
            this.f222545h = dagger.internal.l.a(profileTabUserType);
            this.f222547i = new o(eVar);
            this.f222549j = new C6735c(eVar);
            this.f222551k = new com.avito.android.profile.pro.impl.converters.x(com.avito.android.active_orders_common.items.order.e.a(), com.avito.android.active_orders_common.items.all_orders.e.a());
            j jVar2 = new j(eVar);
            d dVar = new d(eVar);
            this.f222555m = dVar;
            t90.f fVar2 = new t90.f(dVar);
            this.f222557n = fVar2;
            v90.j jVar3 = new v90.j(jVar2);
            v90.g gVar2 = new v90.g(jVar2);
            this.f222559o = gVar2;
            this.f222561p = new v90.c(jVar2, fVar2, jVar3, gVar2);
            this.f222563q = new t(eVar);
            p pVar = new p(eVar);
            this.f222565r = pVar;
            this.f222567s = new com.avito.android.profile.pro.impl.converters.l(pVar);
            com.avito.android.profile.pro.impl.converters.r rVar = new com.avito.android.profile.pro.impl.converters.r(A.a(), this.f222551k, com.avito.android.profile.pro.impl.converters.o.a(), this.f222561p, C33354i.a(), C33348c.a(), this.f222563q, this.f222567s, com.avito.android.profile.pro.impl.converters.u.a(), G.a());
            s sVar = new s(eVar);
            this.f222569t = sVar;
            this.f222571u = new J(sVar);
            C33351f c33351f = new C33351f(rVar, com.avito.android.profile.pro.impl.converters.D.a(), this.f222571u);
            n nVar = new n(eVar);
            this.f222573v = nVar;
            com.avito.android.profile.pro.impl.interactor.d dVar2 = new com.avito.android.profile.pro.impl.interactor.d(nVar);
            i iVar = new i(eVar);
            this.f222575w = iVar;
            h hVar = new h(eVar);
            this.f222577x = hVar;
            com.avito.android.profile.pro.impl.interactor.j jVar4 = new com.avito.android.profile.pro.impl.interactor.j(this.f222547i, this.f222549j, c33351f, dVar2, iVar, hVar, new m(eVar), this.f222569t);
            this.f222581z = jVar4;
            this.f222486A = new com.avito.android.profile.pro.impl.screen.mvi.h(jVar4, this.f222545h);
            com.avito.android.profile.pro.impl.screen.mvi.f fVar3 = new com.avito.android.profile.pro.impl.screen.mvi.f(this.f222581z, new b(eVar), new C6734a(eVar), new t90.c(this.f222555m), this.f222557n, this.f222573v, this.f222565r, this.f222575w, this.f222577x);
            this.f222492D = new com.avito.android.profile.pro.impl.screen.mvi.o(this.f222559o);
            this.f222494E = dagger.internal.g.d(new com.avito.android.profile.pro.impl.di.k(fVar, this.f222543g, new com.avito.android.profile.pro.impl.screen.E(new com.avito.android.profile.pro.impl.screen.mvi.k(this.f222545h, this.f222486A, fVar3, com.avito.android.profile.pro.impl.screen.mvi.m.a(), this.f222492D))));
            this.f222496F = dagger.internal.g.d(new com.avito.android.profile.pro.impl.di.r(mVar));
            this.f222500H = dagger.internal.g.d(new com.avito.android.profile.pro.impl.di.p(mVar, dagger.internal.l.a(this.f222541f), new q(eVar), this.f222543g));
            this.f222504J = dagger.internal.l.a(new C(new B(new r(jVar))));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar2);
            this.f222506K = lVarA;
            this.f222508L = new com.avito.android.profile.pro.impl.screen.item.avatar.b(new com.avito.android.profile.pro.impl.screen.item.avatar.e(lVarA));
            this.f222510M = new com.avito.android.profile.pro.impl.screen.item.dashboard.b(new com.avito.android.profile.pro.impl.screen.item.dashboard.e(lVarA));
            com.avito.android.profile.pro.impl.screen.item.dashboard_stats.e eVar2 = new com.avito.android.profile.pro.impl.screen.item.dashboard_stats.e(lVarA);
            e eVar3 = new e(eVar);
            this.f222512N = eVar3;
            this.f222514O = new com.avito.android.profile.pro.impl.screen.item.dashboard_stats.b(eVar2, eVar3);
            this.f222516P = new com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.b(new com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.e(lVarA), eVar3);
            dagger.internal.l lVar3 = this.f222506K;
            this.f222518Q = new com.avito.android.profile.pro.impl.screen.item.name.b(new com.avito.android.profile.pro.impl.screen.item.name.e(lVar3));
            this.f222520R = new com.avito.android.profile.pro.impl.screen.item.rating.b(new com.avito.android.profile.pro.impl.screen.item.rating.e(lVar3));
            this.f222522S = dagger.internal.l.a(gVar);
            this.f222524T = new com.avito.android.profile.pro.impl.screen.item.passport.b(com.avito.android.profile.pro.impl.screen.item.passport.e.a(), this.f222522S);
            this.f222525U = new com.avito.android.profile.pro.impl.screen.item.orders.e(this.f222506K);
            this.f222526V = dagger.internal.g.d(new K3.f(cVar));
            u<com.avito.android.active_orders_common.items.order.j> uVarD = dagger.internal.g.d(new com.avito.android.active_orders_common.items.order.l(dagger.internal.l.a(resources)));
            this.f222527W = uVarD;
            u<com.avito.android.active_orders_common.items.order.f> uVarD2 = dagger.internal.g.d(new com.avito.android.active_orders_common.items.order.i(uVarD));
            this.f222528X = uVarD2;
            com.avito.android.active_orders_common.items.order.b bVar2 = new com.avito.android.active_orders_common.items.order.b(uVarD2);
            this.f222529Y = bVar2;
            this.f222530Z = dagger.internal.g.d(bVar2);
            u<com.avito.android.active_orders_common.items.all_orders.f> uVarD3 = dagger.internal.g.d(com.avito.android.active_orders_common.items.all_orders.i.a());
            this.f222532a0 = uVarD3;
            com.avito.android.active_orders_common.items.all_orders.b bVar3 = new com.avito.android.active_orders_common.items.all_orders.b(uVarD3);
            this.f222534b0 = bVar3;
            this.f222536c0 = dagger.internal.g.d(bVar3);
            A.b bVarA = dagger.internal.A.a(2, 1);
            bVarA.f393938b.add(this.f222526V);
            u<TV0.b<?, ?>> uVar = this.f222530Z;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f222536c0);
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new K3.e(cVar, bVarA.b()));
            this.f222538d0 = uVarD4;
            u<com.avito.konveyor.adapter.a> uVarD5 = dagger.internal.g.d(new K3.d(cVar, uVarD4));
            this.f222540e0 = uVarD5;
            u<com.avito.konveyor.adapter.d> uVarD6 = dagger.internal.g.d(new K3.g(cVar, uVarD5, this.f222538d0, com.avito.android.active_orders_common.items.diff.j.a()));
            this.f222542f0 = uVarD6;
            this.f222544g0 = new com.avito.android.profile.pro.impl.screen.item.orders.b(this.f222525U, uVarD6);
            this.f222546h0 = new com.avito.android.profile.pro.impl.screen.item.walletandprepayment.b(new com.avito.android.profile.pro.impl.screen.item.walletandprepayment.e(this.f222506K));
            this.f222548i0 = new com.avito.android.profile.pro.impl.screen.item.group.title.b(com.avito.android.profile.pro.impl.screen.item.group.title.e.a());
            this.f222550j0 = new com.avito.android.profile.pro.impl.screen.item.group.row.c(new com.avito.android.profile.pro.impl.screen.item.group.row.f(this.f222506K), this.f222512N);
            this.f222552k0 = new com.avito.android.profile.pro.impl.screen.item.employee.company.b(com.avito.android.profile.pro.impl.screen.item.employee.company.e.a());
            this.f222554l0 = new com.avito.android.profile.pro.impl.screen.item.employee.limits.b(com.avito.android.profile.pro.impl.screen.item.employee.limits.e.a());
            this.f222556m0 = new com.avito.android.profile.pro.impl.screen.item.employee.mode.b(new com.avito.android.profile.pro.impl.screen.item.employee.mode.f(this.f222506K), this.f222512N);
            this.f222558n0 = dagger.internal.g.d(com.avito.android.profile.pro.impl.screen.item.service_booking_block.o.a());
            this.f222560o0 = dagger.internal.g.d(com.avito.android.profile.pro.impl.screen.item.service_booking_block.e.a());
            u<com.avito.android.profile.pro.impl.screen.item.service_booking_block.a> uVarD7 = dagger.internal.g.d(new com.avito.android.profile.pro.impl.screen.item.service_booking_block.b(dagger.internal.l.a(new com.avito.android.profile.pro.impl.screen.item.service_booking_block.h(new com.avito.android.profile.pro.impl.screen.item.service_booking_block.g(this.f222512N))), this.f222560o0));
            this.f222562p0 = uVarD7;
            this.f222564q0 = dagger.internal.g.d(new com.avito.android.profile.pro.impl.screen.item.service_booking_block.j(dagger.internal.l.a(new com.avito.android.profile.pro.impl.screen.item.service_booking_block.s(new com.avito.android.profile.pro.impl.screen.item.service_booking_block.r(this.f222512N, uVarD7, com.avito.android.profile.pro.impl.screen.item.service_booking_block.l.a()))), this.f222558n0));
            this.f222566r0 = dagger.internal.l.a(new z(y.a()));
            this.f222568s0 = new com.avito.android.profile.pro.impl.screen.item.service_booking_block.u(w.a(), this.f222566r0);
            this.f222570t0 = dagger.internal.g.d(com.avito.android.profile.pro.impl.screen.item.geo_banner.f.a());
            this.f222572u0 = dagger.internal.g.d(new com.avito.android.profile.pro.impl.screen.item.geo_banner.b(dagger.internal.l.a(new com.avito.android.profile.pro.impl.screen.item.geo_banner.i(new com.avito.android.profile.pro.impl.screen.item.geo_banner.h(this.f222512N))), this.f222570t0));
            dagger.internal.l lVar4 = this.f222506K;
            this.f222574v0 = new com.avito.android.profile.pro.impl.screen.item.reputation.b(new com.avito.android.profile.pro.impl.screen.item.reputation.e(lVar4));
            this.f222576w0 = new com.avito.android.profile.pro.impl.screen.item.delivery_restriction.h(lVar4, this.f222555m);
            this.f222578x0 = new com.avito.android.profile.pro.impl.screen.item.delivery_restriction.b(this.f222576w0);
            this.f222580y0 = new g(eVar);
            this.f222582z0 = dagger.internal.l.a(screenPerformanceTracker);
            u<InterfaceC41341a> uVarD8 = dagger.internal.g.d(new com.avito.android.profile.pro.impl.di.n(mVar));
            this.f222487A0 = uVarD8;
            u<InterfaceC41342b> uVarD9 = dagger.internal.g.d(new com.avito.android.profile.pro.impl.di.o(mVar, uVarD8));
            this.f222489B0 = uVarD9;
            this.f222491C0 = new com.avito.android.profile.pro.impl.screen.item.beduin.b(this.f222582z0, uVarD9, this.f222580y0, this.f222496F);
            dagger.internal.l lVar5 = this.f222506K;
            this.f222493D0 = new com.avito.android.profile.pro.impl.screen.item.my_services.b(new com.avito.android.profile.pro.impl.screen.item.my_services.e(lVar5));
            this.f222495E0 = new com.avito.android.profile.pro.impl.screen.item.widget_group.title.b(new com.avito.android.profile.pro.impl.screen.item.widget_group.title.e(lVar5));
            this.f222497F0 = new com.avito.android.profile.pro.impl.screen.item.widget_group.widget.b(new com.avito.android.profile.pro.impl.screen.item.widget_group.widget.e(lVar5));
            this.f222499G0 = dagger.internal.g.d(new com.avito.android.profile.pro.impl.screen.item.avito_finance.item.i(lVar5));
            this.f222501H0 = dagger.internal.g.d(new com.avito.android.profile.pro.impl.screen.item.avito_finance.item.c(dagger.internal.l.a(new com.avito.android.profile.pro.impl.screen.item.avito_finance.item.o(com.avito.android.profile.pro.impl.screen.item.avito_finance.item.n.a())), this.f222499G0));
            this.f222503I0 = new com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.e(this.f222506K);
            this.f222511M0 = new com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.c(this.f222503I0, dagger.internal.l.a(new com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.i(new com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.h(new k(eVar), new f(eVar), new l(bVar)))));
            this.f222513N0 = dagger.internal.l.a(new com.avito.android.profile.pro.impl.screen.item.avito_finance.item_skeleton.g(com.avito.android.profile.pro.impl.screen.item.avito_finance.item_skeleton.f.a()));
            this.f222515O0 = new com.avito.android.profile.pro.impl.screen.item.avito_finance.item_skeleton.b(com.avito.android.profile.pro.impl.screen.item.avito_finance.item_skeleton.d.a(), this.f222513N0);
            this.f222517P0 = dagger.internal.l.a(new com.avito.android.profile.pro.impl.screen.item.avito_finance.stub_skeleton.g(com.avito.android.profile.pro.impl.screen.item.avito_finance.stub_skeleton.f.a()));
            u<com.avito.konveyor.a> uVarD10 = dagger.internal.g.d(new com.avito.android.profile.pro.impl.di.j(fVar, this.f222508L, this.f222510M, this.f222514O, this.f222516P, this.f222518Q, this.f222520R, this.f222524T, this.f222544g0, this.f222529Y, this.f222534b0, this.f222546h0, this.f222548i0, this.f222550j0, this.f222552k0, this.f222554l0, this.f222556m0, this.f222564q0, this.f222568s0, this.f222572u0, this.f222574v0, this.f222578x0, this.f222491C0, this.f222493D0, this.f222495E0, this.f222497F0, this.f222501H0, this.f222511M0, this.f222515O0, new com.avito.android.profile.pro.impl.screen.item.avito_finance.stub_skeleton.b(com.avito.android.profile.pro.impl.screen.item.avito_finance.stub_skeleton.d.a(), this.f222517P0), new com.avito.android.profile.pro.impl.screen.item.recommendations.b(new com.avito.android.profile.pro.impl.screen.item.recommendations.e(this.f222506K), this.f222512N)));
            this.f222519Q0 = uVarD10;
            u<com.avito.konveyor.adapter.a> uVarD11 = dagger.internal.g.d(new com.avito.android.profile.pro.impl.di.i(fVar, uVarD10));
            this.f222521R0 = uVarD11;
            this.f222523S0 = dagger.internal.g.d(new com.avito.android.profile.pro.impl.di.h(fVar, uVarD11, this.f222519Q0));
        }

        @Override // com.avito.android.profile_tab.summary.factory.i.a
        public final InterfaceC13557a M7() {
            InterfaceC13557a interfaceC13557aM7 = this.f222531a.M7();
            dagger.internal.t.c(interfaceC13557aM7);
            return interfaceC13557aM7;
        }

        @Override // com.avito.android.profile_tab.summary.factory.i.a
        public final ZS.b a() {
            return this.f222496F.get();
        }

        @Override // com.avito.android.profile.pro.impl.di.d
        public final void b(ProfileProFragment profileProFragment) {
            profileProFragment.f222885t0 = this.f222494E.get();
            com.avito.android.profile_tab.summary.factory.i iVar = this.f222500H.get();
            this.f222533b.getClass();
            profileProFragment.f222886u0 = iVar.a();
            profileProFragment.f222887v0 = (A.a) this.f222504J.f393949a;
            com.avito.android.profile.pro.impl.di.e eVar = this.f222531a;
            profileProFragment.f222889x0 = eVar.h();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f222535c.u4();
            dagger.internal.t.c(aVarU4);
            profileProFragment.f222890y0 = aVarU4;
            h.b bVarA = this.f222537d.a();
            dagger.internal.t.c(bVarA);
            profileProFragment.f222891z0 = bVarA;
            profileProFragment.f222862A0 = eVar.T2();
            profileProFragment.f222863B0 = eVar.l3();
            profileProFragment.f222864C0 = eVar.g4();
            profileProFragment.f222865D0 = eVar.t0();
            profileProFragment.f222866E0 = this.f222523S0.get();
            profileProFragment.f222867F0 = this.f222528X.get();
            profileProFragment.f222868G0 = this.f222532a0.get();
            InterfaceC28373a interfaceC28373aA = eVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            profileProFragment.f222869H0 = new t90.b(interfaceC28373aA);
            com.avito.android.notification_center.counter.f fVarE5 = eVar.e5();
            dagger.internal.t.c(fVarE5);
            profileProFragment.f222870I0 = fVarE5;
            profileProFragment.f222871J0 = eVar.v4();
            profileProFragment.f222872K0 = this.f222558n0.get();
            profileProFragment.f222873L0 = this.f222560o0.get();
            profileProFragment.f222874M0 = this.f222570t0.get();
            profileProFragment.f222875N0 = new F();
            R0 r0C = eVar.c();
            dagger.internal.t.c(r0C);
            profileProFragment.f222876O0 = r0C;
            profileProFragment.f222877P0 = this.f222539e.a();
            profileProFragment.f222879R0 = this.f222499G0.get();
        }

        @Override // com.avito.android.profile_tab.summary.factory.i.a
        public final R0 c() {
            R0 r0C = this.f222531a.c();
            dagger.internal.t.c(r0C);
            return r0C;
        }

        @Override // com.avito.android.profile_tab.summary.factory.i.a
        public final H d() {
            return new H(this.f222494E.get());
        }

        @Override // com.avito.android.profile_tab.summary.factory.i.a
        public final InterfaceC35863o4 m() {
            InterfaceC35863o4 interfaceC35863o4M = this.f222531a.m();
            dagger.internal.t.c(interfaceC35863o4M);
            return interfaceC35863o4M;
        }
    }

    public static d.a a() {
        return new b();
    }
}
