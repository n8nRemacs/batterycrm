package com.avito.android.avl.di;

import Ab.C13005a;
import Db.InterfaceC13381a;
import Lg.InterfaceC14391b;
import Mg.InterfaceC14486a;
import android.content.Context;
import android.os.Bundle;
import com.avito.android.C30828i;
import com.avito.android.P;
import com.avito.android.account.E;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.di.t;
import com.avito.android.advertising.loaders.C28361e;
import com.avito.android.advertising.loaders.CommercialBannersAnalyticsInteractorImpl;
import com.avito.android.advertising.loaders.InterfaceC28359c;
import com.avito.android.advertising.loaders.my_target.MyTargetBannerLoader;
import com.avito.android.advertising.loaders.x;
import com.avito.android.advertising.loaders.yandex.YandexBannerLoader;
import com.avito.android.analytics.H;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avl.di.d;
import com.avito.android.avl.di.g;
import com.avito.android.avl.view.AvlPlayerActivity;
import com.avito.android.avl.view.AvlScreen;
import com.avito.android.receiver.AvlSharingReceiver;
import com.avito.android.remote.interceptor.U0;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import iT.C41343c;
import iT.InterfaceC41342b;
import java.util.List;
import ob.C44742f;
import ob.InterfaceC44738b;
import ob.InterfaceC44740d;
import qb.InterfaceC47368a;
import rb.C47630d;
import rb.InterfaceC47628b;
import ub.InterfaceC49012a;
import wb.C49588a;
import wb.C49589b;
import xb.InterfaceC49915a;

/* compiled from: DaggerAvlPlayerComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class r {

    /* compiled from: DaggerAvlPlayerComponent.java */
    public static final class b implements com.avito.android.avl.di.d {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advertising.loaders.avito_targeting.g> f98091A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advertising.p> f98092B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.a> f98093C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<String> f98094D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<E> f98095E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<CommercialBannersAnalyticsInteractorImpl> f98096F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advertising.advertising_creative.mappers.a> f98097G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<C> f98098H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28359c> f98099I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advertising.loaders.n> f98100J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f98101K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<C28478k> f98102L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f98103M;

        /* renamed from: N, reason: collision with root package name */
        public final com.avito.android.avl.mvi.o f98104N;

        /* renamed from: O, reason: collision with root package name */
        public final com.avito.android.avl.mvi.t f98105O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<C41343c> f98106P;

        /* renamed from: Q, reason: collision with root package name */
        public final com.avito.android.avl.view.w f98107Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.l f98108R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advertising.adapter.items.yandex.avl.e> f98109S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f98110T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f98111U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f98112V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advertising.ui.i> f98113W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f98114X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advertising.adapter.items.buzzoola.avl.h> f98115Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f98116Z;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f98117a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f98118a0;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.avl.di.e f98119b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advertising.adapter.items.avito.bdui.c> f98120b0;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14391b> f98121c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.l f98122c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14486a> f98123d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.l f98124d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f98125e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.l f98126e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.avl_analytics.a> f98127f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f98128f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f98129g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f98130g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f98131h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC49012a> f98132h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<C30828i> f98133i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<Ab.c> f98134i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC13381a> f98135j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.u<C13005a> f98136j0;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.u> f98137k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.item_visibility_tracker.b> f98138k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f98139l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<H> f98140m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<P> f98141n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f98142o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC47628b> f98143p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<YandexBannerLoader> f98144q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advertising.loaders.f> f98145r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<MyTargetBannerLoader> f98146s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<U0> f98147t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC49915a> f98148u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advertising.loaders.event_service.c> f98149v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<x> f98150w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advertising.loaders.buzzoola.f> f98151x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC47368a> f98152y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advertising.loaders.avito_targeting.a> f98153z;

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class a implements dagger.internal.u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98154a;

            public a(com.avito.android.avl.di.e eVar) {
                this.f98154a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f98154a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        /* renamed from: com.avito.android.avl.di.r$b$b, reason: collision with other inner class name */
        public static final class C2941b implements dagger.internal.u<C30828i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98155a;

            public C2941b(com.avito.android.avl.di.e eVar) {
                this.f98155a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f98155a.B1();
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class c implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98156a;

            public c(com.avito.android.avl.di.e eVar) {
                this.f98156a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f98156a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class d implements dagger.internal.u<com.avito.android.advertising.loaders.avito_targeting.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98157a;

            public d(com.avito.android.avl.di.e eVar) {
                this.f98157a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.advertising.loaders.avito_targeting.a aVarQ3 = this.f98157a.Q3();
                dagger.internal.t.c(aVarQ3);
                return aVarQ3;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class e implements dagger.internal.u<InterfaceC47368a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98158a;

            public e(com.avito.android.avl.di.e eVar) {
                this.f98158a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC47368a interfaceC47368aMf = this.f98158a.mf();
                dagger.internal.t.c(interfaceC47368aMf);
                return interfaceC47368aMf;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class f implements dagger.internal.u<com.avito.android.avl_analytics.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98159a;

            public f(com.avito.android.avl.di.e eVar) {
                this.f98159a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.avl_analytics.a aVarT4 = this.f98159a.t4();
                dagger.internal.t.c(aVarT4);
                return aVarT4;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class g implements dagger.internal.u<InterfaceC14391b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98160a;

            public g(com.avito.android.avl.di.e eVar) {
                this.f98160a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14391b interfaceC14391bTe = this.f98160a.te();
                dagger.internal.t.c(interfaceC14391bTe);
                return interfaceC14391bTe;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class h implements dagger.internal.u<InterfaceC14486a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98161a;

            public h(com.avito.android.avl.di.e eVar) {
                this.f98161a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14486a interfaceC14486aSe = this.f98161a.se();
                dagger.internal.t.c(interfaceC14486aSe);
                return interfaceC14486aSe;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class i implements dagger.internal.u<com.avito.android.advertising.loaders.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98162a;

            public i(com.avito.android.avl.di.e eVar) {
                this.f98162a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.advertising.loaders.f fVarEb = this.f98162a.eb();
                dagger.internal.t.c(fVarEb);
                return fVarEb;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class j implements dagger.internal.u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98163a;

            public j(com.avito.android.avl.di.e eVar) {
                this.f98163a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f98163a.j();
                dagger.internal.t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class k implements dagger.internal.u<InterfaceC13381a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98164a;

            public k(com.avito.android.avl.di.e eVar) {
                this.f98164a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13381a interfaceC13381aOf = this.f98164a.of();
                dagger.internal.t.c(interfaceC13381aOf);
                return interfaceC13381aOf;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class l implements dagger.internal.u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98165a;

            public l(com.avito.android.avl.di.e eVar) {
                this.f98165a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarPf = this.f98165a.Pf();
                dagger.internal.t.c(xVarPf);
                return xVarPf;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class m implements dagger.internal.u<com.avito.android.advertising.ui.i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98166a;

            public m(com.avito.android.avl.di.e eVar) {
                this.f98166a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.advertising.ui.i iVarLm = this.f98166a.lm();
                dagger.internal.t.c(iVarLm);
                return iVarLm;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class n implements dagger.internal.u<com.avito.android.advertising.loaders.event_service.c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98167a;

            public n(com.avito.android.avl.di.e eVar) {
                this.f98167a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.advertising.loaders.event_service.c cVarKi = this.f98167a.ki();
                dagger.internal.t.c(cVarKi);
                return cVarKi;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class o implements dagger.internal.u<P> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98168a;

            public o(com.avito.android.avl.di.e eVar) {
                this.f98168a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f98168a.E();
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class p implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f98169a;

            public p(cv.b bVar) {
                this.f98169a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f98169a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class q implements dagger.internal.u<com.avito.android.server_time.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98170a;

            public q(com.avito.android.avl.di.e eVar) {
                this.f98170a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.a aVarT = this.f98170a.T();
                dagger.internal.t.c(aVarT);
                return aVarT;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        /* renamed from: com.avito.android.avl.di.r$b$r, reason: collision with other inner class name */
        public static final class C2942r implements dagger.internal.u<H> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98171a;

            public C2942r(com.avito.android.avl.di.e eVar) {
                this.f98171a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H hY02 = this.f98171a.y0();
                dagger.internal.t.c(hY02);
                return hY02;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class s implements dagger.internal.u<com.avito.android.permissions.u> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98172a;

            public s(com.avito.android.avl.di.e eVar) {
                this.f98172a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f98172a.V();
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class t implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98173a;

            public t(com.avito.android.avl.di.e eVar) {
                this.f98173a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f98173a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class u implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98174a;

            public u(com.avito.android.avl.di.e eVar) {
                this.f98174a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f98174a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class v implements dagger.internal.u<com.avito.android.advertising.p> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98175a;

            public v(com.avito.android.avl.di.e eVar) {
                this.f98175a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.advertising.p pVarZc = this.f98175a.Zc();
                dagger.internal.t.c(pVarZc);
                return pVarZc;
            }
        }

        /* compiled from: DaggerAvlPlayerComponent.java */
        public static final class w implements dagger.internal.u<U0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avl.di.e f98176a;

            public w(com.avito.android.avl.di.e eVar) {
                this.f98176a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f98176a.I0();
            }
        }

        public b(com.avito.android.advertising.di.t tVar, com.avito.android.advertising.di.e eVar, C49588a c49588a, com.avito.android.avl.di.e eVar2, cv.b bVar, Context context, String str, Screen screen, com.avito.android.analytics.screens.r rVar, androidx.appcompat.app.m mVar, BannerPageSource bannerPageSource, InterfaceC44738b interfaceC44738b, Kundle kundle, InterfaceC44740d interfaceC44740d, Bundle bundle, InterfaceC41342b interfaceC41342b, a aVar) {
            this.f98117a = bVar;
            this.f98119b = eVar2;
            this.f98121c = new g(eVar2);
            this.f98123d = new h(eVar2);
            this.f98125e = dagger.internal.l.b(str);
            this.f98127f = new f(eVar2);
            this.f98129g = dagger.internal.l.a(context);
            this.f98131h = new t(eVar2);
            this.f98133i = new C2941b(eVar2);
            this.f98135j = new k(eVar2);
            this.f98137k = new s(eVar2);
            this.f98139l = new c(eVar2);
            this.f98140m = new C2942r(eVar2);
            this.f98141n = new o(eVar2);
            dagger.internal.l lVarA = dagger.internal.l.a(bannerPageSource);
            this.f98142o = lVarA;
            dagger.internal.u<InterfaceC47628b> uVarD = dagger.internal.g.d(new C47630d(lVarA, this.f98139l, this.f98140m, this.f98141n, this.f98133i));
            this.f98143p = uVarD;
            this.f98144q = dagger.internal.g.d(new com.avito.android.advertising.loaders.yandex.e(uVarD, this.f98129g, this.f98131h, this.f98133i, this.f98135j, this.f98137k));
            this.f98146s = dagger.internal.g.d(new com.avito.android.advertising.loaders.my_target.l(new i(eVar2), this.f98129g, this.f98143p));
            dagger.internal.u<InterfaceC49915a> uVarA = B.a(new com.avito.android.advertising.di.o(new w(eVar2), this.f98133i));
            this.f98148u = uVarA;
            n nVar = new n(eVar2);
            this.f98149v = nVar;
            this.f98150w = new l(eVar2);
            this.f98151x = dagger.internal.g.d(new com.avito.android.advertising.loaders.buzzoola.m(uVarA, nVar, com.avito.android.advertising.loaders.buzzoola.c.a(), this.f98143p, this.f98133i, this.f98150w));
            e eVar3 = new e(eVar2);
            this.f98153z = new d(eVar2);
            this.f98091A = dagger.internal.g.d(new com.avito.android.advertising.loaders.avito_targeting.p(eVar3, com.avito.android.advertising.loaders.buzzoola.c.a(), this.f98153z, com.avito.android.advertising.loaders.avito_targeting.s.a(), this.f98131h, this.f98150w));
            this.f98092B = new v(eVar2);
            this.f98093C = new q(eVar2);
            this.f98094D = dagger.internal.g.d(new com.avito.android.advertising.di.u(tVar));
            this.f98096F = dagger.internal.g.d(new com.avito.android.advertising.loaders.l(dagger.internal.l.b(kundle), new a(eVar2), this.f98142o, this.f98139l, this.f98093C, this.f98133i, this.f98094D));
            this.f98097G = B.a(com.avito.android.advertising.advertising_creative.mappers.c.a());
            this.f98098H = new j(eVar2);
            dagger.internal.u<InterfaceC28359c> uVarD2 = dagger.internal.g.d(C28361e.a());
            this.f98099I = uVarD2;
            this.f98100J = dagger.internal.g.d(new com.avito.android.advertising.loaders.v(new com.avito.android.advertising.di.f(eVar), this.f98144q, this.f98146s, this.f98151x, this.f98091A, this.f98092B, this.f98096F, this.f98143p, this.f98097G, this.f98093C, this.f98131h, this.f98133i, this.f98098H, uVarD2));
            this.f98101K = new u(eVar2);
            dagger.internal.u<C28478k> uVarD3 = dagger.internal.g.d(new com.avito.android.avl.di.k(dagger.internal.l.a(rVar)));
            this.f98102L = uVarD3;
            dagger.internal.u<ScreenPerformanceTracker> uVarD4 = dagger.internal.g.d(new com.avito.android.avl.di.l(uVarD3, this.f98101K));
            this.f98103M = uVarD4;
            this.f98104N = new com.avito.android.avl.mvi.o(this.f98125e, uVarD4, this.f98121c, this.f98123d, this.f98127f, this.f98100J, this.f98096F);
            this.f98105O = new com.avito.android.avl.mvi.t(com.avito.android.avl.mvi.q.a(), this.f98104N, com.avito.android.avl.mvi.v.a(), com.avito.android.avl.mvi.x.a());
            dagger.internal.u<C41343c> uVarD5 = dagger.internal.g.d(g.a.f98078a);
            this.f98106P = uVarD5;
            this.f98107Q = new com.avito.android.avl.view.w(this.f98105O, uVarD5);
            dagger.internal.l lVarA2 = dagger.internal.l.a(interfaceC44738b);
            this.f98108R = lVarA2;
            dagger.internal.u<com.avito.android.advertising.adapter.items.yandex.avl.e> uVarD6 = dagger.internal.g.d(new com.avito.android.advertising.adapter.items.yandex.avl.d(lVarA2, this.f98133i, this.f98135j));
            this.f98109S = uVarD6;
            this.f98110T = dagger.internal.g.d(new com.avito.android.advertising.adapter.items.yandex.avl.g(uVarD6));
            this.f98111U = dagger.internal.g.d(new com.avito.android.advertising.adapter.items.adstub.avl.f(new com.avito.android.advertising.adapter.items.adstub.avl.d(this.f98108R)));
            this.f98112V = dagger.internal.g.d(new com.avito.android.advertising.adapter.items.adstub.avl.h(new com.avito.android.advertising.adapter.items.adstub.avl.j(this.f98108R)));
            m mVar2 = new m(eVar2);
            this.f98113W = mVar2;
            p pVar = new p(bVar);
            this.f98114X = pVar;
            dagger.internal.u<com.avito.android.advertising.adapter.items.buzzoola.avl.h> uVarD7 = dagger.internal.g.d(new com.avito.android.advertising.adapter.items.buzzoola.avl.g(this.f98108R, this.f98149v, mVar2, pVar, this.f98135j));
            this.f98115Y = uVarD7;
            this.f98116Z = dagger.internal.g.d(new com.avito.android.advertising.adapter.items.buzzoola.avl.d(uVarD7));
            this.f98118a0 = dagger.internal.g.d(new com.avito.android.advertising.adapter.items.buzzoola.avl.b(this.f98115Y));
            this.f98120b0 = dagger.internal.g.d(new com.avito.android.advertising.adapter.items.avito.bdui.f(this.f98108R, this.f98113W, this.f98114X, this.f98149v, this.f98135j));
            this.f98122c0 = dagger.internal.l.a(screen);
            this.f98124d0 = dagger.internal.l.a(interfaceC44740d);
            this.f98126e0 = dagger.internal.l.a(mVar);
            this.f98128f0 = dagger.internal.g.d(new com.avito.android.advertising.adapter.items.avito.bdui.b(this.f98122c0, this.f98124d0, this.f98126e0, dagger.internal.l.a(interfaceC41342b), this.f98120b0, this.f98103M));
            A.b bVarA = A.a(6, 0);
            dagger.internal.u<TV0.b<?, ?>> uVar = this.f98110T;
            List<dagger.internal.u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f98111U);
            list.add(this.f98112V);
            list.add(this.f98116Z);
            list.add(this.f98118a0);
            list.add(this.f98128f0);
            this.f98130g0 = dagger.internal.g.d(new com.avito.android.avl.di.i(bVarA.b()));
            dagger.internal.u<InterfaceC49012a> uVarD8 = dagger.internal.g.d(new C49589b(c49588a, this.f98139l, this.f98133i));
            this.f98132h0 = uVarD8;
            this.f98134i0 = dagger.internal.g.d(new Ab.d(uVarD8, this.f98096F, this.f98149v, this.f98133i));
            this.f98136j0 = dagger.internal.g.d(new Ab.b(this.f98096F, this.f98149v));
            this.f98138k0 = dagger.internal.g.d(new com.avito.android.avl.di.j(dagger.internal.l.b(bundle), this.f98134i0, this.f98136j0));
        }

        @Override // com.avito.android.avl.di.d
        public final void a(AvlPlayerActivity avlPlayerActivity) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f98117a.u4();
            dagger.internal.t.c(aVarU4);
            avlPlayerActivity.f98308m = aVarU4;
            com.avito.android.avl.di.e eVar = this.f98119b;
            com.avito.android.avl_analytics.a aVarT4 = eVar.t4();
            dagger.internal.t.c(aVarT4);
            avlPlayerActivity.f98309n = aVarT4;
            J80.b bVarG7 = eVar.g7();
            dagger.internal.t.c(bVarG7);
            avlPlayerActivity.f98310o = bVarG7;
            avlPlayerActivity.f98311p = this.f98107Q;
            avlPlayerActivity.f98313r = eVar.Xg();
            avlPlayerActivity.f98314s = this.f98096F.get();
            avlPlayerActivity.f98315t = this.f98130g0.get();
            eVar.f8();
            avlPlayerActivity.f98316u = AvlSharingReceiver.class;
            avlPlayerActivity.f98317v = this.f98138k0.get();
            avlPlayerActivity.f98318w = this.f98103M.get();
            R0 r0Ua = eVar.Ua();
            dagger.internal.t.c(r0Ua);
            avlPlayerActivity.f98319x = r0Ua;
        }
    }

    /* compiled from: DaggerAvlPlayerComponent.java */
    public static final class c implements d.a {
        public c() {
        }

        @Override // com.avito.android.avl.di.d.a
        public final d a(Context context, String str, AvlScreen avlScreen, com.avito.android.analytics.screens.r rVar, AvlPlayerActivity avlPlayerActivity, AvlPlayerActivity avlPlayerActivity2, Kundle kundle, C44742f c44742f, Bundle bundle, com.avito.android.avl.view.e eVar, e eVar2, InterfaceC39417a interfaceC39417a) {
            BannerPageSource bannerPageSource = BannerPageSource.f87780f;
            avlScreen.getClass();
            interfaceC39417a.getClass();
            return new b(new t(), new com.avito.android.advertising.di.e(), new C49588a(), eVar2, interfaceC39417a, context, str, avlScreen, rVar, avlPlayerActivity, bannerPageSource, avlPlayerActivity2, kundle, c44742f, bundle, eVar, null);
        }
    }

    public static d.a a() {
        return new c();
    }
}
