package com.avito.android.favorite_sellers.di;

import Oi0.InterfaceC14698b;
import Pz.C14860a;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.S0;
import com.avito.android.C36135w2;
import com.avito.android.InterfaceC34162r0;
import com.avito.android.account.E;
import com.avito.android.analytics.C28528v;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.e0;
import com.avito.android.di.g0;
import com.avito.android.di.module.C30019d8;
import com.avito.android.di.module.C30052g8;
import com.avito.android.di.module.C30060h5;
import com.avito.android.di.module.C30140o8;
import com.avito.android.di.module.C30205u8;
import com.avito.android.di.module.S4;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.favorite.InterfaceC30570d;
import com.avito.android.favorite.x;
import com.avito.android.favorite_sellers.C30582f;
import com.avito.android.favorite_sellers.C30585i;
import com.avito.android.favorite_sellers.C30595t;
import com.avito.android.favorite_sellers.FavoriteSellersFragment;
import com.avito.android.favorite_sellers.InterfaceC30574a;
import com.avito.android.favorite_sellers.InterfaceC30580d;
import com.avito.android.favorite_sellers.InterfaceC30583g;
import com.avito.android.favorite_sellers.InterfaceC30588l;
import com.avito.android.favorite_sellers.K;
import com.avito.android.favorite_sellers.L;
import com.avito.android.favorite_sellers.N;
import com.avito.android.favorite_sellers.V;
import com.avito.android.favorite_sellers.W;
import com.avito.android.favorite_sellers.adapter.recommendation.InterfaceC30576b;
import com.avito.android.favorite_sellers.di.b;
import com.avito.android.favorite_sellers.di.g;
import com.avito.android.favorite_sellers.di.j;
import com.avito.android.favorite_sellers.di.k;
import com.avito.android.favorite_sellers.di.l;
import com.avito.android.favorite_sellers.tracker.FavoriteSellersScreen;
import com.avito.android.remote.Q;
import com.avito.android.section.y;
import com.avito.android.serp.adapter.G;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.P;
import com.avito.android.serp.adapter.T;
import com.avito.android.serp.adapter.n1;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.L0;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Y1;
import qC.C47278d;
import zz.C50648b;
import zz.C50650d;

/* compiled from: DaggerFavoriteSellersComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerFavoriteSellersComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.favorite_sellers.di.b.a
        public final com.avito.android.favorite_sellers.di.b a(String str, ActivityC22955m activityC22955m, S0 s02, Resources resources, Kundle kundle, Kundle kundle2, FavoriteSellersScreen favoriteSellersScreen, r rVar, com.avito.android.favorite_sellers.di.c cVar, InterfaceC39417a interfaceC39417a) {
            SubscriptionSource subscriptionSource = SubscriptionSource.f90036d;
            favoriteSellersScreen.getClass();
            interfaceC39417a.getClass();
            return new c(new I30.a(), cVar, interfaceC39417a, str, activityC22955m, s02, resources, kundle, kundle2, favoriteSellersScreen, rVar, subscriptionSource, null);
        }
    }

    /* compiled from: DaggerFavoriteSellersComponent.java */
    public static final class c implements com.avito.android.favorite_sellers.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<C36135w2> f155764A;

        /* renamed from: A0, reason: collision with root package name */
        public final dagger.internal.u<z<C14860a>> f155765A0;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34904z0> f155766B;

        /* renamed from: B0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC43160i<C14860a>> f155767B0;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30583g> f155768C;

        /* renamed from: C0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_collection_toast.c> f155769C0;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<L> f155770D;

        /* renamed from: D0, reason: collision with root package name */
        public final dagger.internal.l f155771D0;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35741a1> f155772E;

        /* renamed from: E0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.lib.deprecated_design.dialog.a> f155773E0;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<C50648b> f155774F;

        /* renamed from: F0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30274a> f155775F0;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<Context> f155776G;

        /* renamed from: G0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorite.n> f155777G0;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.connection_quality.connectivity.a> f155778H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<V> f155779I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30588l> f155780J;

        /* renamed from: K, reason: collision with root package name */
        public final com.avito.android.favorite_sellers.mvi.i f155781K;

        /* renamed from: L, reason: collision with root package name */
        public final com.avito.android.favorite_sellers.mvi.p f155782L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f155783M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.l f155784N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f155785O;

        /* renamed from: P, reason: collision with root package name */
        public final K f155786P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.b<?, ?>>> f155787Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorite_sellers.adapter.advert_list.d> f155788R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.b<?, ?>>> f155789S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<Y1<InterfaceC30574a>> f155790T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34863v> f155791U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<L0> f155792V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.section.w> f155793W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.section.item.s> f155794X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.section.item.m> f155795Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.h> f155796Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.favorite_sellers.di.c f155797a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<Locale> f155798a0;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f155799b;

        /* renamed from: b0, reason: collision with root package name */
        public final com.avito.android.section.item.i f155800b0;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<Q> f155801c;

        /* renamed from: c0, reason: collision with root package name */
        public final com.avito.android.section.item.l f155802c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34162r0> f155803d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<Y1<vC.b>> f155804d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.notification.m> f155805e;

        /* renamed from: e0, reason: collision with root package name */
        public final com.avito.android.favorite_sellers.adapter.advert_list.adapter.other_adverts.b f155806e0;

        /* renamed from: f, reason: collision with root package name */
        public final I30.b f155807f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f155808f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f155809g;

        /* renamed from: g0, reason: collision with root package name */
        public final com.avito.android.favorite_sellers.adapter.advert_list.di.b f155810g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.common.a> f155811h;

        /* renamed from: h0, reason: collision with root package name */
        public final com.avito.android.favorite_sellers.adapter.advert_list.di.c f155812h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<x> f155813i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f155814i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorite.r> f155815j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorite_sellers.adapter.seller.c> f155816j0;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30570d> f155817k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f155818k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f155819l;

        /* renamed from: l0, reason: collision with root package name */
        public final com.avito.android.favorite_sellers.adapter.error.b f155820l0;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<E> f155821m;

        /* renamed from: m0, reason: collision with root package name */
        public final com.avito.android.favorite_sellers.adapter.info.b f155822m0;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<SK0.b> f155823n;

        /* renamed from: n0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30576b> f155824n0;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f155825o;

        /* renamed from: o0, reason: collision with root package name */
        public final dagger.internal.l f155826o0;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.favorite.m f155827p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.component.toast.util.c> f155828p0;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<T> f155829q;

        /* renamed from: q0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorite_sellers.adapter.recommendation.h> f155830q0;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert.viewed.persistance.j> f155831r;

        /* renamed from: r0, reason: collision with root package name */
        public final com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel.d f155832r0;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<R0> f155833s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f155834s0;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert.viewed.a> f155835t;

        /* renamed from: t0, reason: collision with root package name */
        public final com.avito.android.favorite_sellers.adapter.recommendation.f f155836t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert.viewed.d> f155837u;

        /* renamed from: u0, reason: collision with root package name */
        public final com.avito.android.favorite_sellers.adapter.loading.b f155838u0;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<n1> f155839v;

        /* renamed from: v0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f155840v0;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30580d> f155841w;

        /* renamed from: w0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f155842w0;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.l f155843x;

        /* renamed from: x0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.responsive.a> f155844x0;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<G> f155845y;

        /* renamed from: y0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.responsive.e> f155846y0;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<G> f155847z;

        /* renamed from: z0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14698b> f155848z0;

        /* compiled from: DaggerFavoriteSellersComponent.java */
        /* renamed from: com.avito.android.favorite_sellers.di.a$c$a, reason: collision with other inner class name */
        public static final class C4565a implements dagger.internal.u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155849a;

            public C4565a(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155849a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f155849a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class b implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155850a;

            public b(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155850a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f155850a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        /* renamed from: com.avito.android.favorite_sellers.di.a$c$c, reason: collision with other inner class name */
        public static final class C4566c implements dagger.internal.u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155851a;

            public C4566c(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155851a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarP = this.f155851a.p();
                dagger.internal.t.c(bVarP);
                return bVarP;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class d implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155852a;

            public d(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155852a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f155852a.g();
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class e implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f155853a;

            public e(cv.b bVar) {
                this.f155853a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f155853a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class f implements dagger.internal.u<L0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155854a;

            public f(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155854a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                L0 l0Z = this.f155854a.z();
                dagger.internal.t.c(l0Z);
                return l0Z;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class g implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155855a;

            public g(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155855a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f155855a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class h implements dagger.internal.u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155856a;

            public h(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155856a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f155856a.n();
                dagger.internal.t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class i implements dagger.internal.u<InterfaceC30570d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155857a;

            public i(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155857a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC30570d interfaceC30570dJ0 = this.f155857a.J0();
                dagger.internal.t.c(interfaceC30570dJ0);
                return interfaceC30570dJ0;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class j implements dagger.internal.u<com.avito.android.favorite.r> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155858a;

            public j(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155858a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.favorite.r rVarL0 = this.f155858a.L0();
                dagger.internal.t.c(rVarL0);
                return rVarL0;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class k implements dagger.internal.u<Q> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155859a;

            public k(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155859a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Q qK1 = this.f155859a.K1();
                dagger.internal.t.c(qK1);
                return qK1;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class l implements dagger.internal.u<com.avito.android.common.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155860a;

            public l(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155860a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.common.a aVarD4 = this.f155860a.D4();
                dagger.internal.t.c(aVarD4);
                return aVarD4;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class m implements dagger.internal.u<InterfaceC34162r0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155861a;

            public m(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155861a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34162r0 interfaceC34162r0J2 = this.f155861a.j2();
                dagger.internal.t.c(interfaceC34162r0J2);
                return interfaceC34162r0J2;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class n implements dagger.internal.u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155862a;

            public n(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155862a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f155862a.m0();
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class o implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155863a;

            public o(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155863a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f155863a.locale();
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class p implements dagger.internal.u<com.avito.android.notification.m> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155864a;

            public p(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155864a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.notification.m mVarA0 = this.f155864a.A0();
                dagger.internal.t.c(mVarA0);
                return mVarA0;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class q implements dagger.internal.u<z<C14860a>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155865a;

            public q(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155865a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                z<C14860a> zVarGe = this.f155865a.Ge();
                dagger.internal.t.c(zVarGe);
                return zVarGe;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class r implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155866a;

            public r(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155866a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f155866a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class s implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155867a;

            public s(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155867a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f155867a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class t implements dagger.internal.u<C36135w2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155868a;

            public t(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155868a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f155868a.e0();
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class u implements dagger.internal.u<com.avito.android.server_time.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155869a;

            public u(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155869a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.h hVarY = this.f155869a.y();
                dagger.internal.t.c(hVarY);
                return hVarY;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class v implements dagger.internal.u<com.avito.android.advert.viewed.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155870a;

            public v(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155870a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.advert.viewed.a aVarD0 = this.f155870a.D0();
                dagger.internal.t.c(aVarD0);
                return aVarD0;
            }
        }

        /* compiled from: DaggerFavoriteSellersComponent.java */
        public static final class w implements dagger.internal.u<com.avito.android.advert.viewed.persistance.j> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.favorite_sellers.di.c f155871a;

            public w(com.avito.android.favorite_sellers.di.c cVar) {
                this.f155871a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.advert.viewed.persistance.j jVarQ0 = this.f155871a.q0();
                dagger.internal.t.c(jVarQ0);
                return jVarQ0;
            }
        }

        public c(I30.a aVar, com.avito.android.favorite_sellers.di.c cVar, cv.b bVar, String str, Activity activity, S0 s02, Resources resources, Kundle kundle, Kundle kundle2, Screen screen, com.avito.android.analytics.screens.r rVar, SubscriptionSource subscriptionSource, C4564a c4564a) {
            this.f155797a = cVar;
            this.f155799b = bVar;
            this.f155801c = new k(cVar);
            this.f155803d = new m(cVar);
            p pVar = new p(cVar);
            I30.f.f7912b.getClass();
            I30.f fVar = new I30.f(pVar);
            I30.b.f7907b.getClass();
            this.f155807f = new I30.b(aVar, fVar);
            this.f155809g = new e(bVar);
            this.f155811h = new l(cVar);
            n nVar = new n(cVar);
            j jVar = new j(cVar);
            i iVar = new i(cVar);
            b bVar2 = new b(cVar);
            this.f155819l = bVar2;
            C4565a c4565a = new C4565a(cVar);
            this.f155821m = c4565a;
            C28528v c28528v = new C28528v(bVar2, c4565a);
            C47278d c47278d = new C47278d(new C4566c(cVar));
            r rVar2 = new r(cVar);
            this.f155825o = rVar2;
            com.avito.android.favorite.m mVar = new com.avito.android.favorite.m(nVar, jVar, iVar, c28528v, c47278d, rVar2);
            this.f155827p = mVar;
            this.f155829q = B.a(new C30140o8(mVar));
            w wVar = new w(cVar);
            g gVar = new g(cVar);
            this.f155833s = gVar;
            v vVar = new v(cVar);
            this.f155835t = vVar;
            dagger.internal.u<com.avito.android.advert.viewed.d> uVarA = B.a(e0.a(wVar, vVar, gVar));
            this.f155837u = uVarA;
            dagger.internal.u<n1> uVarA2 = B.a(g0.a(uVarA));
            this.f155839v = uVarA2;
            this.f155841w = dagger.internal.g.d(new C30582f(uVarA2, this.f155829q));
            dagger.internal.l lVarA = dagger.internal.l.a(resources);
            this.f155843x = lVarA;
            this.f155845y = B.a(new C30205u8(lVarA));
            dagger.internal.u<G> uVarA3 = B.a(new C30052g8(this.f155843x));
            this.f155847z = uVarA3;
            dagger.internal.u<InterfaceC34904z0> uVarA4 = B.a(new C30019d8(this.f155845y, uVarA3, this.f155843x, new t(cVar), P.a()));
            this.f155766B = uVarA4;
            this.f155768C = dagger.internal.g.d(new C30585i(uVarA4, this.f155829q, this.f155839v));
            this.f155770D = dagger.internal.g.d(new N(this.f155843x));
            h hVar = new h(cVar);
            this.f155772E = hVar;
            this.f155774F = B.a(new C50650d(hVar, this.f155843x));
            this.f155778H = B.a(new com.avito.android.connection_quality.connectivity.i(new d(cVar), this.f155825o));
            dagger.internal.u<V> uVarD = dagger.internal.g.d(new W(this.f155819l));
            this.f155779I = uVarD;
            dagger.internal.u<InterfaceC30588l> uVarD2 = dagger.internal.g.d(new C30595t(this.f155801c, this.f155803d, this.f155807f, this.f155809g, this.f155811h, this.f155841w, this.f155768C, this.f155770D, this.f155774F, this.f155821m, this.f155778H, uVarD, this.f155833s));
            this.f155780J = uVarD2;
            this.f155781K = new com.avito.android.favorite_sellers.mvi.i(uVarD2, this.f155811h, this.f155821m, this.f155803d, this.f155809g, this.f155779I, this.f155819l);
            this.f155782L = new com.avito.android.favorite_sellers.mvi.p(this.f155807f, uVarD2);
            this.f155783M = new s(cVar);
            this.f155784N = dagger.internal.l.a(screen);
            this.f155785O = dagger.internal.g.d(new C30060h5(this.f155783M, new com.avito.android.favorite_sellers.di.o(this.f155784N, dagger.internal.l.a(rVar))));
            this.f155786P = new K(new com.avito.android.favorite_sellers.mvi.l(this.f155781K, com.avito.android.favorite_sellers.mvi.n.a(), this.f155782L, this.f155785O));
            this.f155787Q = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f155788R = dagger.internal.g.d(new com.avito.android.favorite_sellers.adapter.advert_list.f(dagger.internal.l.b(kundle)));
            this.f155789S = dagger.internal.g.d(com.avito.android.favorite_sellers.adapter.advert_list.di.e.a());
            dagger.internal.u<Y1<InterfaceC30574a>> uVarD3 = dagger.internal.g.d(g.a.f155876a);
            this.f155790T = uVarD3;
            this.f155791U = dagger.internal.g.d(new com.avito.android.favorite_sellers.di.h(uVarD3));
            this.f155792V = new f(cVar);
            dagger.internal.u<com.avito.android.section.w> uVarA5 = B.a(new y(this.f155843x));
            this.f155793W = uVarA5;
            dagger.internal.u<com.avito.android.section.item.s> uVarA6 = B.a(new Tp0.z(this.f155792V, uVarA5));
            this.f155794X = uVarA6;
            dagger.internal.u<com.avito.android.section.item.m> uVarA7 = B.a(new Tp0.v(uVarA6, this.f155791U));
            this.f155795Y = uVarA7;
            u uVar = new u(cVar);
            o oVar = new o(cVar);
            dagger.internal.u<com.avito.android.connection_quality.connectivity.a> uVar2 = this.f155778H;
            this.f155800b0 = new com.avito.android.section.item.i(uVarA7, uVar, oVar, uVar2);
            this.f155802c0 = new com.avito.android.section.item.l(uVarA7, uVar, oVar, uVar2);
            dagger.internal.u<Y1<vC.b>> uVarD4 = dagger.internal.g.d(j.a.f155879a);
            this.f155804d0 = uVarD4;
            this.f155806e0 = new com.avito.android.favorite_sellers.adapter.advert_list.adapter.other_adverts.b(new com.avito.android.favorite_sellers.adapter.advert_list.adapter.other_adverts.f(uVarD4, this.f155794X));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f155789S);
            com.avito.android.section.item.i iVar2 = this.f155800b0;
            List<dagger.internal.u<T>> list = bVarA.f393937a;
            list.add(iVar2);
            list.add(this.f155802c0);
            list.add(this.f155806e0);
            dagger.internal.u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new com.avito.android.favorite_sellers.adapter.advert_list.di.d(bVarA.b()));
            this.f155808f0 = uVarD5;
            this.f155810g0 = new com.avito.android.favorite_sellers.adapter.advert_list.di.b(uVarD5);
            this.f155812h0 = new com.avito.android.favorite_sellers.adapter.advert_list.di.c(this.f155827p, this.f155825o);
            this.f155814i0 = dagger.internal.g.d(new com.avito.android.favorite_sellers.adapter.advert_list.c(this.f155788R, this.f155810g0, this.f155812h0, new com.avito.android.favorite_sellers.adapter.advert_list.di.f(this.f155835t, this.f155837u, this.f155833s, this.f155825o), this.f155808f0));
            dagger.internal.u<com.avito.android.favorite_sellers.adapter.seller.c> uVarD6 = dagger.internal.g.d(new com.avito.android.favorite_sellers.adapter.seller.g(this.f155804d0, this.f155807f));
            this.f155816j0 = uVarD6;
            this.f155818k0 = dagger.internal.g.d(new com.avito.android.favorite_sellers.adapter.seller.b(uVarD6));
            this.f155820l0 = new com.avito.android.favorite_sellers.adapter.error.b(new com.avito.android.favorite_sellers.adapter.error.f(this.f155804d0));
            this.f155822m0 = new com.avito.android.favorite_sellers.adapter.info.b(com.avito.android.favorite_sellers.adapter.info.e.a());
            this.f155824n0 = dagger.internal.g.d(new com.avito.android.favorite_sellers.adapter.recommendation.d(this.f155801c, this.f155807f));
            this.f155826o0 = dagger.internal.l.a(subscriptionSource);
            this.f155828p0 = B.a(com.avito.android.component.toast.util.b.a());
            this.f155830q0 = dagger.internal.g.d(new com.avito.android.favorite_sellers.adapter.recommendation.y(this.f155824n0, this.f155803d, this.f155804d0, this.f155807f, this.f155772E, this.f155819l, this.f155826o0, this.f155828p0, this.f155809g, this.f155833s, dagger.internal.l.b(kundle2)));
            this.f155832r0 = new com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel.d(new com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel.j(this.f155804d0));
            A.b bVarA2 = A.a(1, 0);
            bVarA2.f393937a.add(this.f155832r0);
            dagger.internal.u<com.avito.konveyor.a> uVarD7 = dagger.internal.g.d(new CC.c(bVarA2.b()));
            this.f155834s0 = uVarD7;
            this.f155836t0 = new com.avito.android.favorite_sellers.adapter.recommendation.f(this.f155830q0, new CC.b(uVarD7), uVarD7);
            this.f155838u0 = new com.avito.android.favorite_sellers.adapter.loading.b(new com.avito.android.favorite_sellers.adapter.loading.e(this.f155804d0));
            A.b bVarA3 = A.a(6, 1);
            bVarA3.f393938b.add(this.f155787Q);
            dagger.internal.u<TV0.b<?, ?>> uVar3 = this.f155814i0;
            List<dagger.internal.u<T>> list2 = bVarA3.f393937a;
            list2.add(uVar3);
            list2.add(this.f155818k0);
            list2.add(this.f155820l0);
            list2.add(this.f155822m0);
            list2.add(this.f155836t0);
            list2.add(this.f155838u0);
            dagger.internal.u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA3.b());
            this.f155840v0 = uVarK;
            this.f155842w0 = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            dagger.internal.u<com.avito.android.recycler.responsive.a> uVarD8 = dagger.internal.g.d(new com.avito.android.favorite_sellers.di.m(this.f155788R));
            this.f155844x0 = uVarD8;
            this.f155846y0 = dagger.internal.g.d(new com.avito.android.favorite_sellers.di.f(uVarD8, this.f155842w0));
            this.f155848z0 = dagger.internal.g.d(new com.avito.android.favorite_sellers.di.i(this.f155840v0));
            this.f155767B0 = dagger.internal.g.d(new com.avito.android.favorite_sellers.di.n(new q(cVar)));
            this.f155769C0 = B.a(new com.avito.android.advert_collection_toast.e(this.f155821m, this.f155809g, new X7.c(this.f155819l), k.a.f155880a, this.f155833s));
            dagger.internal.l lVarA2 = dagger.internal.l.a(activity);
            this.f155771D0 = lVarA2;
            dagger.internal.u<com.avito.android.lib.deprecated_design.dialog.a> uVarA8 = B.a(new KU.b(lVarA2));
            this.f155773E0 = uVarA8;
            this.f155775F0 = B.a(new com.avito.android.dialog.o(uVarA8, this.f155771D0));
            this.f155777G0 = B.a(new S4(this.f155827p, this.f155825o, l.a.f155881a));
        }

        @Override // com.avito.android.favorite_sellers.di.b
        public final void a(FavoriteSellersFragment favoriteSellersFragment) {
            favoriteSellersFragment.f155412t0 = this.f155786P;
            com.avito.android.favorite_sellers.di.c cVar = this.f155797a;
            favoriteSellersFragment.f155414v0 = cVar.h();
            favoriteSellersFragment.f155415w0 = this.f155846y0.get();
            favoriteSellersFragment.f155416x0 = this.f155848z0.get();
            favoriteSellersFragment.f155417y0 = this.f155830q0.get();
            favoriteSellersFragment.f155418z0 = this.f155788R.get();
            favoriteSellersFragment.f155398A0 = this.f155828p0.get();
            favoriteSellersFragment.f155399B0 = this.f155804d0.get();
            favoriteSellersFragment.f155400C0 = this.f155790T.get();
            favoriteSellersFragment.f155401D0 = this.f155767B0.get();
            favoriteSellersFragment.f155402E0 = this.f155769C0.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f155799b.u4();
            dagger.internal.t.c(aVarU4);
            favoriteSellersFragment.f155403F0 = aVarU4;
            favoriteSellersFragment.f155404G0 = this.f155775F0.get();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            favoriteSellersFragment.f155405H0 = interfaceC28373aA;
            favoriteSellersFragment.f155406I0 = this.f155785O.get();
            favoriteSellersFragment.f155407J0 = this.f155777G0.get();
            favoriteSellersFragment.f155408K0 = this.f155769C0.get();
            R0 r0C = cVar.c();
            dagger.internal.t.c(r0C);
            favoriteSellersFragment.f155409L0 = r0C;
            com.avito.android.common.a aVarD4 = cVar.D4();
            dagger.internal.t.c(aVarD4);
            favoriteSellersFragment.f155410M0 = aVarD4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
