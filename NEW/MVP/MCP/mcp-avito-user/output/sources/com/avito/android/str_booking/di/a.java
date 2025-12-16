package com.avito.android.str_booking.di;

import Nx0.InterfaceC14622b;
import Px0.InterfaceC14851a;
import Wx0.C15807a;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.remote.d1;
import com.avito.android.remote.model.AnimationOverlayUrl;
import com.avito.android.str_booking.di.l;
import com.avito.android.str_booking.domain.items_converter.A;
import com.avito.android.str_booking.domain.items_converter.C;
import com.avito.android.str_booking.domain.items_converter.C35064d;
import com.avito.android.str_booking.domain.items_converter.C35067g;
import com.avito.android.str_booking.domain.items_converter.C35071k;
import com.avito.android.str_booking.domain.items_converter.C35074n;
import com.avito.android.str_booking.domain.items_converter.C35077q;
import com.avito.android.str_booking.domain.items_converter.C35079t;
import com.avito.android.str_booking.domain.items_converter.D;
import com.avito.android.str_booking.domain.items_converter.F;
import com.avito.android.str_booking.domain.items_converter.G;
import com.avito.android.str_booking.domain.items_converter.I;
import com.avito.android.str_booking.domain.items_converter.InterfaceC35061a;
import com.avito.android.str_booking.domain.items_converter.InterfaceC35065e;
import com.avito.android.str_booking.domain.items_converter.InterfaceC35068h;
import com.avito.android.str_booking.domain.items_converter.InterfaceC35072l;
import com.avito.android.str_booking.domain.items_converter.InterfaceC35075o;
import com.avito.android.str_booking.domain.items_converter.InterfaceC35080u;
import com.avito.android.str_booking.domain.items_converter.J;
import com.avito.android.str_booking.domain.items_converter.L;
import com.avito.android.str_booking.domain.items_converter.M;
import com.avito.android.str_booking.domain.items_converter.O;
import com.avito.android.str_booking.domain.items_converter.P;
import com.avito.android.str_booking.domain.items_converter.S;
import com.avito.android.str_booking.domain.items_converter.T;
import com.avito.android.str_booking.domain.items_converter.V;
import com.avito.android.str_booking.domain.items_converter.w;
import com.avito.android.str_booking.domain.items_converter.x;
import com.avito.android.str_booking.domain.items_converter.z;
import com.avito.android.str_booking.ui.ScreenType;
import com.avito.android.str_booking.ui.StrBookingFragment;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dy0.C39828b;
import dy0.InterfaceC39829c;
import iy0.C42139e;
import java.util.List;
import kotlin.G0;
import lE.C43624b;

/* compiled from: DaggerStrBookingComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrBookingComponent.java */
    public static final class b implements l.a {
        public b() {
        }

        @Override // com.avito.android.str_booking.di.l.a
        public final l a(InterfaceC39417a interfaceC39417a, m mVar, FragmentManager fragmentManager, C28478k c28478k, AnimationOverlayUrl animationOverlayUrl, String str, ScreenType screenType, String str2, boolean z12, Y41.l lVar) {
            interfaceC39417a.getClass();
            screenType.getClass();
            return new c(new o(), interfaceC39417a, mVar, fragmentManager, c28478k, animationOverlayUrl, str, screenType, str2, Boolean.valueOf(z12), lVar, null);
        }
    }

    /* compiled from: DaggerStrBookingComponent.java */
    public static final class c implements com.avito.android.str_booking.di.l {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.text.a> f285460A;

        /* renamed from: A0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35075o> f285461A0;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285462B;

        /* renamed from: B0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.str_booking.ui.delegates.c> f285463B0;

        /* renamed from: C, reason: collision with root package name */
        public final com.avito.android.str_booking.ui.gallery.f f285464C;

        /* renamed from: C0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.str_booking.ui.delegates.e> f285465C0;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285466D;

        /* renamed from: D0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.str_booking.domain.polling.b> f285467D0;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285468E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285469F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.str_booking.ui.details.d> f285470G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285471H;

        /* renamed from: I, reason: collision with root package name */
        public final com.avito.android.str_booking.ui.location.f f285472I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<Context> f285473J;

        /* renamed from: K, reason: collision with root package name */
        public final BN.c f285474K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<AvitoMarkerIconFactory> f285475L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285476M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285477N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.str_booking.ui.payment_details.table_row.d> f285478O;

        /* renamed from: P, reason: collision with root package name */
        public final com.avito.android.str_booking.ui.payment_details.table_row.b f285479P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285480Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.str_booking.ui.payment_details.divider.d> f285481R;

        /* renamed from: S, reason: collision with root package name */
        public final com.avito.android.str_booking.ui.payment_details.divider.b f285482S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285483T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.str_booking.ui.payment_details.terms.d> f285484U;

        /* renamed from: V, reason: collision with root package name */
        public final com.avito.android.str_booking.ui.payment_details.terms.b f285485V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285486W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.str_booking.ui.calculation.e> f285487X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f285488Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f285489Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.str_booking.di.m f285490a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.d> f285491a0;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f285492b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285493b0;

        /* renamed from: c, reason: collision with root package name */
        public final Y41.l<? super com.avito.android.str_booking.mvi.entity.a, G0> f285494c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285495c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f285496d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285497d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14851a> f285498e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285499e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14622b> f285500f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f285501f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<d1> f285502g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f285503g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<R0> f285504h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC39829c> f285505h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<C43624b> f285506i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.d> f285507i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.provider.a> f285508j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f285509j0;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<AK0.l> f285510k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.d> f285511k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<C15807a> f285512l;

        /* renamed from: l0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35863o4> f285513l0;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f285514m;

        /* renamed from: m0, reason: collision with root package name */
        public final dagger.internal.u<M> f285515m0;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.str_booking.domain.f> f285516n;

        /* renamed from: n0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35065e> f285517n0;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.str_booking.domain.e f285518o;

        /* renamed from: o0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35080u> f285519o0;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.clientEventBus.a> f285520p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.u<A> f285521p0;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.l f285522q;

        /* renamed from: q0, reason: collision with root package name */
        public final dagger.internal.u<T> f285523q0;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.str_booking.mvi.h f285524r;

        /* renamed from: r0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.str_booking.domain.items_converter.r> f285525r0;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.str_booking.mvi.j f285526s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.u<D> f285527s0;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f285528t;

        /* renamed from: t0, reason: collision with root package name */
        public final dagger.internal.u<G> f285529t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f285530u;

        /* renamed from: u0, reason: collision with root package name */
        public final dagger.internal.u<P> f285531u0;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.str_booking.ui.o f285532v;

        /* renamed from: v0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35072l> f285533v0;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.str_booking.ui.screen_title.d> f285534w;

        /* renamed from: w0, reason: collision with root package name */
        public final dagger.internal.u<x> f285535w0;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f285536x;

        /* renamed from: x0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35061a> f285537x0;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.l f285538y;

        /* renamed from: y0, reason: collision with root package name */
        public final dagger.internal.u<J> f285539y0;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.str_booking.ui.banner.d> f285540z;

        /* renamed from: z0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35068h> f285541z0;

        /* compiled from: DaggerStrBookingComponent.java */
        /* renamed from: com.avito.android.str_booking.di.a$c$a, reason: collision with other inner class name */
        public static final class C8547a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_booking.di.m f285542a;

            public C8547a(com.avito.android.str_booking.di.m mVar) {
                this.f285542a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f285542a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStrBookingComponent.java */
        public static final class b implements dagger.internal.u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_booking.di.m f285543a;

            public b(com.avito.android.str_booking.di.m mVar) {
                this.f285543a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f285543a.e();
                dagger.internal.t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerStrBookingComponent.java */
        /* renamed from: com.avito.android.str_booking.di.a$c$c, reason: collision with other inner class name */
        public static final class C8548c implements dagger.internal.u<com.avito.android.clientEventBus.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_booking.di.m f285544a;

            public C8548c(com.avito.android.str_booking.di.m mVar) {
                this.f285544a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.clientEventBus.a aVarH0 = this.f285544a.h0();
                dagger.internal.t.c(aVarH0);
                return aVarH0;
            }
        }

        /* compiled from: DaggerStrBookingComponent.java */
        public static final class d implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_booking.di.m f285545a;

            public d(com.avito.android.str_booking.di.m mVar) {
                this.f285545a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f285545a.g();
            }
        }

        /* compiled from: DaggerStrBookingComponent.java */
        public static final class e implements dagger.internal.u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_booking.di.m f285546a;

            public e(com.avito.android.str_booking.di.m mVar) {
                this.f285546a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f285546a.v();
                dagger.internal.t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerStrBookingComponent.java */
        public static final class f implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_booking.di.m f285547a;

            public f(com.avito.android.str_booking.di.m mVar) {
                this.f285547a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f285547a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStrBookingComponent.java */
        public static final class g implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_booking.di.m f285548a;

            public g(com.avito.android.str_booking.di.m mVar) {
                this.f285548a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cDi = this.f285548a.di();
                dagger.internal.t.c(interfaceC28481cDi);
                return interfaceC28481cDi;
            }
        }

        /* compiled from: DaggerStrBookingComponent.java */
        public static final class h implements dagger.internal.u<InterfaceC14622b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_booking.di.m f285549a;

            public h(com.avito.android.str_booking.di.m mVar) {
                this.f285549a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14622b interfaceC14622bOd = this.f285549a.Od();
                dagger.internal.t.c(interfaceC14622bOd);
                return interfaceC14622bOd;
            }
        }

        /* compiled from: DaggerStrBookingComponent.java */
        public static final class i implements dagger.internal.u<InterfaceC14851a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_booking.di.m f285550a;

            public i(com.avito.android.str_booking.di.m mVar) {
                this.f285550a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14851a interfaceC14851aVc = this.f285550a.Vc();
                dagger.internal.t.c(interfaceC14851aVc);
                return interfaceC14851aVc;
            }
        }

        /* compiled from: DaggerStrBookingComponent.java */
        public static final class j implements dagger.internal.u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_booking.di.m f285551a;

            public j(com.avito.android.str_booking.di.m mVar) {
                this.f285551a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f285551a.r();
            }
        }

        /* compiled from: DaggerStrBookingComponent.java */
        public static final class k implements dagger.internal.u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_booking.di.m f285552a;

            public k(com.avito.android.str_booking.di.m mVar) {
                this.f285552a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f285552a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerStrBookingComponent.java */
        public static final class l implements dagger.internal.u<d1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_booking.di.m f285553a;

            public l(com.avito.android.str_booking.di.m mVar) {
                this.f285553a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                d1 d1VarA0 = this.f285553a.a0();
                dagger.internal.t.c(d1VarA0);
                return d1VarA0;
            }
        }

        /* compiled from: DaggerStrBookingComponent.java */
        public static final class m implements dagger.internal.u<C43624b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_booking.di.m f285554a;

            public m(com.avito.android.str_booking.di.m mVar) {
                this.f285554a = mVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f285554a.J();
            }
        }

        public c() {
            throw null;
        }

        public c(o oVar, cv.b bVar, com.avito.android.str_booking.di.m mVar, FragmentManager fragmentManager, C28478k c28478k, AnimationOverlayUrl animationOverlayUrl, String str, ScreenType screenType, String str2, Boolean bool, Y41.l lVar, C8546a c8546a) {
            this.f285490a = mVar;
            this.f285492b = bVar;
            this.f285494c = lVar;
            this.f285496d = new C8547a(mVar);
            this.f285498e = new i(mVar);
            this.f285500f = new h(mVar);
            this.f285502g = new l(mVar);
            this.f285504h = new f(mVar);
            this.f285506i = new m(mVar);
            this.f285508j = new e(mVar);
            j jVar = new j(mVar);
            this.f285510k = jVar;
            this.f285512l = dagger.internal.g.d(new Wx0.b(jVar));
            this.f285514m = dagger.internal.l.a(str);
            this.f285516n = dagger.internal.g.d(new com.avito.android.str_booking.domain.m(this.f285498e, this.f285500f, this.f285502g, this.f285504h, this.f285496d, this.f285506i, this.f285508j, this.f285512l, com.avito.android.str_booking.domain.b.a(), this.f285514m));
            this.f285518o = new com.avito.android.str_booking.domain.e(this.f285510k);
            this.f285520p = new C8548c(mVar);
            this.f285522q = dagger.internal.l.a(screenType);
            this.f285524r = new com.avito.android.str_booking.mvi.h(this.f285496d, this.f285516n, this.f285518o, this.f285506i, this.f285520p, this.f285514m, this.f285522q, dagger.internal.l.b(str2));
            this.f285526s = new com.avito.android.str_booking.mvi.j(dagger.internal.l.b(animationOverlayUrl), this.f285518o);
            this.f285528t = new g(mVar);
            this.f285530u = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f285528t);
            this.f285532v = new com.avito.android.str_booking.ui.o(new com.avito.android.str_booking.mvi.m(this.f285524r, this.f285526s, com.avito.android.str_booking.mvi.o.a(), com.avito.android.str_booking.mvi.q.a(), this.f285530u));
            dagger.internal.u<com.avito.android.str_booking.ui.screen_title.d> uVarD = dagger.internal.g.d(com.avito.android.str_booking.ui.screen_title.f.a());
            this.f285534w = uVarD;
            this.f285536x = dagger.internal.g.d(new com.avito.android.str_booking.ui.screen_title.b(this.f285522q, uVarD));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f285538y = lVarA;
            dagger.internal.u<com.avito.android.str_booking.ui.banner.d> uVarD2 = dagger.internal.g.d(new com.avito.android.str_booking.ui.banner.h(lVarA));
            this.f285540z = uVarD2;
            b bVar2 = new b(mVar);
            this.f285460A = bVar2;
            this.f285462B = dagger.internal.g.d(new com.avito.android.str_booking.ui.banner.b(this.f285522q, uVarD2, bVar2));
            this.f285464C = new com.avito.android.str_booking.ui.gallery.f(this.f285538y);
            this.f285466D = dagger.internal.g.d(new com.avito.android.str_booking.ui.gallery.b(this.f285464C, dagger.internal.l.a(fragmentManager)));
            this.f285468E = dagger.internal.g.d(new com.avito.android.str_booking.ui.item_info.b(new com.avito.android.str_booking.ui.item_info.f(this.f285538y)));
            this.f285469F = dagger.internal.g.d(new com.avito.android.str_booking.ui.user_info.b(new com.avito.android.str_booking.ui.user_info.k(this.f285538y)));
            dagger.internal.u<com.avito.android.str_booking.ui.details.d> uVarD3 = dagger.internal.g.d(new com.avito.android.str_booking.ui.details.g(this.f285538y));
            this.f285470G = uVarD3;
            this.f285471H = dagger.internal.g.d(new com.avito.android.str_booking.ui.details.b(uVarD3));
            this.f285472I = new com.avito.android.str_booking.ui.location.f(this.f285538y);
            this.f285474K = new BN.c(new d(mVar));
            dagger.internal.u<AvitoMarkerIconFactory> uVarD4 = dagger.internal.g.d(this.f285474K);
            this.f285475L = uVarD4;
            this.f285476M = dagger.internal.g.d(new com.avito.android.str_booking.ui.location.b(this.f285472I, uVarD4));
            this.f285477N = dagger.internal.g.d(new com.avito.android.str_booking.ui.info.b(new com.avito.android.str_booking.ui.info.i(this.f285538y)));
            dagger.internal.u<com.avito.android.str_booking.ui.payment_details.table_row.d> uVarD5 = dagger.internal.g.d(com.avito.android.str_booking.ui.payment_details.table_row.f.a());
            this.f285478O = uVarD5;
            com.avito.android.str_booking.ui.payment_details.table_row.b bVar3 = new com.avito.android.str_booking.ui.payment_details.table_row.b(uVarD5);
            this.f285479P = bVar3;
            this.f285480Q = dagger.internal.g.d(bVar3);
            dagger.internal.u<com.avito.android.str_booking.ui.payment_details.divider.d> uVarD6 = dagger.internal.g.d(com.avito.android.str_booking.ui.payment_details.divider.f.a());
            this.f285481R = uVarD6;
            com.avito.android.str_booking.ui.payment_details.divider.b bVar4 = new com.avito.android.str_booking.ui.payment_details.divider.b(uVarD6);
            this.f285482S = bVar4;
            this.f285483T = dagger.internal.g.d(bVar4);
            dagger.internal.u<com.avito.android.str_booking.ui.payment_details.terms.d> uVarD7 = dagger.internal.g.d(com.avito.android.str_booking.ui.payment_details.terms.f.a());
            this.f285484U = uVarD7;
            com.avito.android.str_booking.ui.payment_details.terms.b bVar5 = new com.avito.android.str_booking.ui.payment_details.terms.b(uVarD7);
            this.f285485V = bVar5;
            this.f285486W = dagger.internal.g.d(bVar5);
            this.f285487X = dagger.internal.g.d(new com.avito.android.str_booking.ui.calculation.h(this.f285538y, this.f285496d));
            dagger.internal.u<com.avito.konveyor.a> uVarD8 = dagger.internal.g.d(new C42139e(this.f285479P, this.f285482S, this.f285485V));
            this.f285488Y = uVarD8;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD9 = dagger.internal.g.d(new iy0.g(uVarD8));
            this.f285489Z = uVarD9;
            dagger.internal.u<com.avito.konveyor.adapter.d> uVarD10 = dagger.internal.g.d(new iy0.f(uVarD9, this.f285488Y));
            this.f285491a0 = uVarD10;
            this.f285493b0 = dagger.internal.g.d(new com.avito.android.str_booking.ui.calculation.c(uVarD10, this.f285487X));
            this.f285495c0 = dagger.internal.g.d(new com.avito.android.str_booking.ui.attributed_text.b(new com.avito.android.str_booking.ui.attributed_text.f(this.f285538y)));
            this.f285497d0 = dagger.internal.g.d(new com.avito.android.str_booking.ui.promo_banner.c(new com.avito.android.str_booking.ui.promo_banner.f(this.f285538y, this.f285460A, this.f285496d)));
            this.f285499e0 = dagger.internal.g.d(new com.avito.android.str_booking.ui.buttons.b(new com.avito.android.str_booking.ui.buttons.f(this.f285538y)));
            A.b bVarA = dagger.internal.A.a(15, 0);
            dagger.internal.u<TV0.b<?, ?>> uVar = this.f285536x;
            List<dagger.internal.u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f285462B);
            list.add(this.f285466D);
            list.add(this.f285468E);
            list.add(this.f285469F);
            list.add(this.f285471H);
            list.add(this.f285476M);
            list.add(this.f285477N);
            list.add(this.f285480Q);
            list.add(this.f285483T);
            list.add(this.f285486W);
            list.add(this.f285493b0);
            list.add(this.f285495c0);
            list.add(this.f285497d0);
            list.add(this.f285499e0);
            dagger.internal.u<com.avito.konveyor.a> uVarD11 = dagger.internal.g.d(new com.avito.android.str_booking.di.j(bVarA.b()));
            this.f285501f0 = uVarD11;
            this.f285503g0 = dagger.internal.g.d(new com.avito.android.str_booking.di.g(uVarD11));
            this.f285505h0 = dagger.internal.g.d(com.avito.android.str_booking.ui.user_info.payload.b.a());
            A.b bVarA2 = dagger.internal.A.a(1, 0);
            bVarA2.f393937a.add(this.f285505h0);
            this.f285507i0 = dagger.internal.g.d(new com.avito.android.str_booking.di.k(this.f285503g0, this.f285501f0, new C39828b(bVarA2.b())));
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD12 = dagger.internal.g.d(new com.avito.android.str_booking.di.h(this.f285501f0));
            this.f285509j0 = uVarD12;
            this.f285511k0 = dagger.internal.g.d(new com.avito.android.str_booking.di.i(uVarD12, this.f285501f0));
            k kVar = new k(mVar);
            this.f285513l0 = kVar;
            this.f285515m0 = dagger.internal.g.d(new O(kVar));
            this.f285517n0 = dagger.internal.g.d(C35067g.a());
            this.f285519o0 = dagger.internal.g.d(w.a());
            this.f285521p0 = dagger.internal.g.d(C.a());
            this.f285523q0 = dagger.internal.g.d(V.a());
            this.f285525r0 = dagger.internal.g.d(new C35079t(this.f285513l0));
            this.f285527s0 = dagger.internal.g.d(F.a());
            this.f285529t0 = dagger.internal.g.d(new I(this.f285513l0));
            dagger.internal.u<P> uVarD13 = dagger.internal.g.d(new S(this.f285513l0));
            this.f285531u0 = uVarD13;
            this.f285533v0 = dagger.internal.g.d(new C35074n(uVarD13, this.f285529t0));
            this.f285535w0 = dagger.internal.g.d(new z(this.f285513l0));
            this.f285537x0 = dagger.internal.g.d(C35064d.a());
            this.f285539y0 = dagger.internal.g.d(new L(this.f285513l0));
            dagger.internal.u<InterfaceC35068h> uVarD14 = dagger.internal.g.d(new C35071k(this.f285513l0));
            this.f285541z0 = uVarD14;
            this.f285461A0 = dagger.internal.g.d(new C35077q(uVarD14, this.f285515m0, this.f285517n0, this.f285519o0, this.f285521p0, this.f285523q0, this.f285525r0, this.f285527s0, this.f285533v0, this.f285535w0, this.f285537x0, this.f285539y0));
            this.f285463B0 = dagger.internal.g.d(new p(oVar, this.f285522q));
            this.f285465C0 = dagger.internal.g.d(new q(oVar, this.f285522q));
            this.f285467D0 = dagger.internal.g.d(new com.avito.android.str_booking.domain.polling.h(this.f285514m, this.f285500f, this.f285498e, this.f285506i));
        }

        @Override // com.avito.android.str_booking.di.l
        public final void a(StrBookingFragment strBookingFragment) {
            strBookingFragment.f285874n0 = this.f285532v;
            strBookingFragment.f285878r0 = this.f285530u.get();
            strBookingFragment.f285879s0 = this.f285507i0.get();
            strBookingFragment.f285880t0 = this.f285511k0.get();
            strBookingFragment.f285881u0 = this.f285540z.get();
            com.avito.android.str_booking.di.m mVar = this.f285490a;
            strBookingFragment.f285882v0 = mVar.g1();
            strBookingFragment.f285883w0 = mVar.M0();
            strBookingFragment.f285884x0 = mVar.h();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f285492b.u4();
            dagger.internal.t.c(aVarU4);
            strBookingFragment.f285885y0 = aVarU4;
            com.avito.android.deep_linking.x xVarT = mVar.t();
            dagger.internal.t.c(xVarT);
            strBookingFragment.f285886z0 = xVarT;
            strBookingFragment.f285868A0 = this.f285461A0.get();
            strBookingFragment.f285869B0 = this.f285463B0.get();
            strBookingFragment.f285870C0 = this.f285465C0.get();
            strBookingFragment.f285871D0 = this.f285467D0.get();
            dagger.internal.t.c(mVar.e());
            dagger.internal.t.c(mVar.a());
        }
    }

    public static l.a a() {
        return new b();
    }
}
