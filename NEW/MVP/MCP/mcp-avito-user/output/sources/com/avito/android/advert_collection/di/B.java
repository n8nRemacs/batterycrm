package com.avito.android.advert_collection.di;

import android.app.Activity;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.S0;
import com.avito.android.B2;
import com.avito.android.C36135w2;
import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.account.E;
import com.avito.android.advert_collection.A;
import com.avito.android.advert_collection.AdvertCollectionFragment;
import com.avito.android.advert_collection.di.InterfaceC28253a;
import com.avito.android.advert_collection.di.k;
import com.avito.android.advert_collection.di.l;
import com.avito.android.advert_collection.di.n;
import com.avito.android.advert_collection.di.u;
import com.avito.android.advert_collection.di.v;
import com.avito.android.advert_collection.di.x;
import com.avito.android.analytics.C28528v;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.e0;
import com.avito.android.di.g0;
import com.avito.android.di.module.C30019d8;
import com.avito.android.di.module.C30052g8;
import com.avito.android.di.module.C30107l8;
import com.avito.android.di.module.C30125n4;
import com.avito.android.di.module.C30136o4;
import com.avito.android.di.module.C30140o8;
import com.avito.android.di.module.C30205u8;
import com.avito.android.di.module.E8;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.di.module.P8;
import com.avito.android.di.module.S4;
import com.avito.android.favorite.InterfaceC30570d;
import com.avito.android.favorites.C30609d;
import com.avito.android.favorites.C30663h;
import com.avito.android.favorites.InterfaceC30603b;
import com.avito.android.favorites.InterfaceC30657f;
import com.avito.android.location.find.InterfaceC31503a;
import com.avito.android.permissions.G;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.receiver.CollectionSharingReceiver;
import com.avito.android.remote.H;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.serp.adapter.H0;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.P;
import com.avito.android.serp.adapter.T;
import com.avito.android.serp.adapter.n1;
import com.avito.android.serp.adapter.witcher.InterfaceC34887f;
import com.avito.android.util.C35865p;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import gj.InterfaceC40691b;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import lW.C43693c;
import lW.InterfaceC43691a;
import pW.C47017h;
import pW.C47018i;
import qC.C47278d;

/* compiled from: DaggerAdvertCollectionComponent.java */
@dagger.internal.e
/* loaded from: classes10.dex */
public final class B {

    /* compiled from: DaggerAdvertCollectionComponent.java */
    public static final class b implements InterfaceC28253a {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f81326A;

        /* renamed from: A0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34904z0> f81327A0;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.error.c> f81328B;

        /* renamed from: B0, reason: collision with root package name */
        public final dagger.internal.u<H0> f81329B0;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f81330C;

        /* renamed from: C0, reason: collision with root package name */
        public final dagger.internal.u<gj.d> f81331C0;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_collection.adapter.author.c> f81332D;

        /* renamed from: D0, reason: collision with root package name */
        public final dagger.internal.u<a.b> f81333D0;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f81334E;

        /* renamed from: E0, reason: collision with root package name */
        public final dagger.internal.u<Screen> f81335E0;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_collection.adapter.title.c> f81336F;

        /* renamed from: F0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC40691b> f81337F0;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f81338G;

        /* renamed from: G0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.constructor_advert.ui.serp.constructor.f> f81339G0;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_collection.adapter.order.c> f81340H;

        /* renamed from: H0, reason: collision with root package name */
        public final dagger.internal.u<T> f81341H0;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f81342I;

        /* renamed from: I0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert.viewed.persistance.j> f81343I0;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_collection.adapter.author.skeleton.c> f81344J;

        /* renamed from: J0, reason: collision with root package name */
        public final dagger.internal.u<R0> f81345J0;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f81346K;

        /* renamed from: K0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert.viewed.a> f81347K0;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.advert.skeleton.c> f81348L;

        /* renamed from: L0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert.viewed.d> f81349L0;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f81350M;

        /* renamed from: M0, reason: collision with root package name */
        public final dagger.internal.u<n1> f81351M0;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.banner.d> f81352N;

        /* renamed from: N0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34887f> f81353N0;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.banner.a> f81354O;

        /* renamed from: O0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30603b> f81355O0;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_collection.adapter.empty_collection.c> f81356P;

        /* renamed from: P0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35741a1> f81357P0;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f81358Q;

        /* renamed from: Q0, reason: collision with root package name */
        public final dagger.internal.u<E7.a> f81359Q0;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f81360R;

        /* renamed from: R0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_collection.i> f81361R0;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f81362S;

        /* renamed from: S0, reason: collision with root package name */
        public final dagger.internal.u<H> f81363S0;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.e> f81364T;

        /* renamed from: T0, reason: collision with root package name */
        public final com.avito.android.advert_collection.mvi.i f81365T0;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f81366U;

        /* renamed from: U0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_collection_toast.c> f81367U0;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<G> f81368V;

        /* renamed from: V0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_collection.l> f81369V0;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.z> f81370W;

        /* renamed from: W0, reason: collision with root package name */
        public final com.avito.android.advert_collection.mvi.g f81371W0;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.q> f81372X;

        /* renamed from: X0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.sales_items.m> f81373X0;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33034d> f81374Y;

        /* renamed from: Y0, reason: collision with root package name */
        public final com.avito.android.advert_collection.mvi.q f81375Y0;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.geo.j> f81376Z;

        /* renamed from: Z0, reason: collision with root package name */
        public final com.avito.android.advert_collection.mvi.n f81377Z0;

        /* renamed from: a, reason: collision with root package name */
        public final Resources f81378a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31503a> f81379a0;

        /* renamed from: a1, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f81380a1;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC28254b f81381b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.d> f81382b0;

        /* renamed from: b1, reason: collision with root package name */
        public final dagger.internal.u<C28478k> f81383b1;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f81384c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.r> f81385c0;

        /* renamed from: c1, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f81386c1;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.f f81387d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.w> f81388d0;

        /* renamed from: d1, reason: collision with root package name */
        public final dagger.internal.l f81389d1;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<androidx.recyclerview.widget.C> f81390e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.o> f81391e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.b<?, ?>>> f81392f;

        /* renamed from: f0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.f> f81393f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f81394g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC43691a> f81395g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.promo.p> f81396h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorite.x> f81397h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f81398i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorite.r> f81399i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.promo.a> f81400j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30570d> f81401j0;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.lib.util.groupable_item.b> f81402k;

        /* renamed from: k0, reason: collision with root package name */
        public final dagger.internal.u<E> f81403k0;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.promo.l> f81404l;

        /* renamed from: l0, reason: collision with root package name */
        public final dagger.internal.u<SK0.b> f81405l0;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.promo.x> f81406m;

        /* renamed from: m0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f81407m0;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.promo.e> f81408n;

        /* renamed from: n0, reason: collision with root package name */
        public final com.avito.android.favorite.m f81409n0;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.promo.with_movable_image.d> f81410o;

        /* renamed from: o0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorite.n> f81411o0;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.promo.with_movable_image.a> f81412p;

        /* renamed from: p0, reason: collision with root package name */
        public final dagger.internal.u<ZC.f> f81413p0;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.promo.with_icon.d> f81414q;

        /* renamed from: q0, reason: collision with root package name */
        public final dagger.internal.l f81415q0;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.promo.with_icon.a> f81416r;

        /* renamed from: r0, reason: collision with root package name */
        public final dagger.internal.l f81417r0;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<u3.h<SimpleTestGroup>> f81418s;

        /* renamed from: s0, reason: collision with root package name */
        public final dagger.internal.l f81419s0;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.advert.d> f81420t;

        /* renamed from: t0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35945t1<AdvertPrice>> f81421t0;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.h> f81422u;

        /* renamed from: u0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30657f> f81423u0;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.l f81424v;

        /* renamed from: v0, reason: collision with root package name */
        public final dagger.internal.u<YC.a> f81425v0;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<Locale> f81426w;

        /* renamed from: w0, reason: collision with root package name */
        public final dagger.internal.u<Yo.p> f81427w0;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<B2> f81428x;

        /* renamed from: x0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.serp.adapter.G> f81429x0;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<?, ?>> f81430y;

        /* renamed from: y0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.serp.adapter.G> f81431y0;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.favorites.adapter.loading.c> f81432z;

        /* renamed from: z0, reason: collision with root package name */
        public final dagger.internal.u<C36135w2> f81433z0;

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class A implements dagger.internal.u<B2> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81434a;

            public A(InterfaceC28254b interfaceC28254b) {
                this.f81434a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f81434a.D();
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        /* renamed from: com.avito.android.advert_collection.di.B$b$B, reason: collision with other inner class name */
        public static final class C2415B implements dagger.internal.u<com.avito.android.server_time.h> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81435a;

            public C2415B(InterfaceC28254b interfaceC28254b) {
                this.f81435a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.h hVarY = this.f81435a.y();
                dagger.internal.t.c(hVarY);
                return hVarY;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class C implements dagger.internal.u<com.avito.android.advert.viewed.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81436a;

            public C(InterfaceC28254b interfaceC28254b) {
                this.f81436a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.advert.viewed.a aVarD0 = this.f81436a.D0();
                dagger.internal.t.c(aVarD0);
                return aVarD0;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class D implements dagger.internal.u<com.avito.android.advert.viewed.persistance.j> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81437a;

            public D(InterfaceC28254b interfaceC28254b) {
                this.f81437a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.advert.viewed.persistance.j jVarQ0 = this.f81437a.q0();
                dagger.internal.t.c(jVarQ0);
                return jVarQ0;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        /* renamed from: com.avito.android.advert_collection.di.B$b$a, reason: case insensitive filesystem */
        public static final class C28250a implements dagger.internal.u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81438a;

            public C28250a(InterfaceC28254b interfaceC28254b) {
                this.f81438a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f81438a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        /* renamed from: com.avito.android.advert_collection.di.B$b$b, reason: collision with other inner class name */
        public static final class C2416b implements dagger.internal.u<E7.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81439a;

            public C2416b(InterfaceC28254b interfaceC28254b) {
                this.f81439a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E7.a aVarTd = this.f81439a.td();
                dagger.internal.t.c(aVarTd);
                return aVarTd;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        /* renamed from: com.avito.android.advert_collection.di.B$b$c, reason: case insensitive filesystem */
        public static final class C28251c implements dagger.internal.u<Yo.p> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81440a;

            public C28251c(InterfaceC28254b interfaceC28254b) {
                this.f81440a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f81440a.vm();
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        /* renamed from: com.avito.android.advert_collection.di.B$b$d, reason: case insensitive filesystem */
        public static final class C28252d implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81441a;

            public C28252d(InterfaceC28254b interfaceC28254b) {
                this.f81441a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f81441a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class e implements dagger.internal.u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81442a;

            public e(InterfaceC28254b interfaceC28254b) {
                this.f81442a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarP = this.f81442a.p();
                dagger.internal.t.c(bVarP);
                return bVarP;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class f implements dagger.internal.u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81443a;

            public f(InterfaceC28254b interfaceC28254b) {
                this.f81443a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f81443a.El();
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class g implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f81444a;

            public g(cv.b bVar) {
                this.f81444a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f81444a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class h implements dagger.internal.u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f81445a;

            public h(cv.b bVar) {
                this.f81445a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f81445a.b();
                dagger.internal.t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class i implements dagger.internal.u<H> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81446a;

            public i(InterfaceC28254b interfaceC28254b) {
                this.f81446a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H hK2 = this.f81446a.K();
                dagger.internal.t.c(hK2);
                return hK2;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class j implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81447a;

            public j(InterfaceC28254b interfaceC28254b) {
                this.f81447a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f81447a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class k implements dagger.internal.u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81448a;

            public k(InterfaceC28254b interfaceC28254b) {
                this.f81448a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f81448a.n();
                dagger.internal.t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class l implements dagger.internal.u<InterfaceC30570d> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81449a;

            public l(InterfaceC28254b interfaceC28254b) {
                this.f81449a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC30570d interfaceC30570dJ0 = this.f81449a.J0();
                dagger.internal.t.c(interfaceC30570dJ0);
                return interfaceC30570dJ0;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class m implements dagger.internal.u<com.avito.android.favorite.r> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81450a;

            public m(InterfaceC28254b interfaceC28254b) {
                this.f81450a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.favorite.r rVarL0 = this.f81450a.L0();
                dagger.internal.t.c(rVarL0);
                return rVarL0;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class n implements dagger.internal.u<com.avito.android.sales_items.m> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81451a;

            public n(InterfaceC28254b interfaceC28254b) {
                this.f81451a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.sales_items.m mVarT7 = this.f81451a.t7();
                dagger.internal.t.c(mVarT7);
                return mVarT7;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class o implements dagger.internal.u<ZC.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81452a;

            public o(InterfaceC28254b interfaceC28254b) {
                this.f81452a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ZC.f fVarD3 = this.f81452a.D3();
                dagger.internal.t.c(fVarD3);
                return fVarD3;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class p implements dagger.internal.u<com.avito.android.favorite.x> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81453a;

            public p(InterfaceC28254b interfaceC28254b) {
                this.f81453a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f81453a.m0();
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class q implements dagger.internal.u<com.avito.android.geo.j> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81454a;

            public q(InterfaceC28254b interfaceC28254b) {
                this.f81454a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo.j jVarC0 = this.f81454a.c0();
                dagger.internal.t.c(jVarC0);
                return jVarC0;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class r implements dagger.internal.u<u3.h<SimpleTestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81455a;

            public r(InterfaceC28254b interfaceC28254b) {
                this.f81455a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.h<SimpleTestGroup> hVarU3 = this.f81455a.U3();
                dagger.internal.t.c(hVarU3);
                return hVarU3;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class s implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81456a;

            public s(InterfaceC28254b interfaceC28254b) {
                this.f81456a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f81456a.locale();
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class t implements dagger.internal.u<com.avito.android.permissions.z> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81457a;

            public t(InterfaceC28254b interfaceC28254b) {
                this.f81457a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.permissions.z zVarA = this.f81457a.A();
                dagger.internal.t.c(zVarA);
                return zVarA;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class u implements dagger.internal.u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81458a;

            public u(InterfaceC28254b interfaceC28254b) {
                this.f81458a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f81458a.N();
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class v implements dagger.internal.u<YC.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81459a;

            public v(InterfaceC28254b interfaceC28254b) {
                this.f81459a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f81459a.o4();
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class w implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81460a;

            public w(InterfaceC28254b interfaceC28254b) {
                this.f81460a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f81460a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class x implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f81461a;

            public x(InterfaceC30106l7 interfaceC30106l7) {
                this.f81461a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f81461a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class y implements dagger.internal.u<C36135w2> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81462a;

            public y(InterfaceC28254b interfaceC28254b) {
                this.f81462a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f81462a.e0();
            }
        }

        /* compiled from: DaggerAdvertCollectionComponent.java */
        public static final class z implements dagger.internal.u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC28254b f81463a;

            public z(InterfaceC28254b interfaceC28254b) {
                this.f81463a = interfaceC28254b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f81463a.l();
                dagger.internal.t.c(fVarL);
                return fVarL;
            }
        }

        public b(InterfaceC28254b interfaceC28254b, cv.b bVar, InterfaceC30106l7 interfaceC30106l7, com.avito.android.analytics.screens.r rVar, Resources resources, String str, String str2, String str3, com.avito.android.ui.a aVar, Activity activity, Fragment fragment, S0 s02, Boolean bool, a aVar2) {
            this.f81378a = resources;
            this.f81381b = interfaceC28254b;
            this.f81384c = bVar;
            dagger.internal.f fVar = new dagger.internal.f();
            this.f81387d = fVar;
            this.f81390e = dagger.internal.g.d(new com.avito.android.advert_collection.di.o(fVar));
            this.f81392f = dagger.internal.g.d(n.a.f81476a);
            g gVar = new g(bVar);
            this.f81394g = gVar;
            this.f81396h = dagger.internal.g.d(new com.avito.android.favorites.adapter.promo.r(gVar));
            C28252d c28252d = new C28252d(interfaceC28254b);
            this.f81398i = c28252d;
            this.f81400j = dagger.internal.g.d(new com.avito.android.favorites.adapter.promo.c(c28252d));
            dagger.internal.u<com.avito.android.lib.util.groupable_item.b> uVarD = dagger.internal.g.d(com.avito.android.lib.util.groupable_item.d.a());
            this.f81402k = uVarD;
            this.f81404l = dagger.internal.g.d(new com.avito.android.favorites.adapter.promo.n(uVarD, this.f81396h, this.f81400j));
            dagger.internal.u<com.avito.android.favorites.adapter.promo.x> uVarA = dagger.internal.B.a(com.avito.android.favorites.adapter.promo.z.a());
            this.f81406m = uVarA;
            this.f81408n = dagger.internal.g.d(new com.avito.android.favorites.adapter.promo.g(uVarA, this.f81404l));
            dagger.internal.u<com.avito.android.favorites.adapter.promo.with_movable_image.d> uVarD2 = dagger.internal.g.d(new com.avito.android.favorites.adapter.promo.with_movable_image.f(this.f81396h, this.f81400j));
            this.f81410o = uVarD2;
            this.f81412p = dagger.internal.g.d(new com.avito.android.favorites.adapter.promo.with_movable_image.c(uVarD2, this.f81406m));
            dagger.internal.u<com.avito.android.favorites.adapter.promo.with_icon.d> uVarD3 = dagger.internal.g.d(new com.avito.android.favorites.adapter.promo.with_icon.f(this.f81402k, this.f81396h, this.f81400j));
            this.f81414q = uVarD3;
            this.f81416r = dagger.internal.g.d(new com.avito.android.favorites.adapter.promo.with_icon.c(uVarD3, this.f81406m));
            r rVar2 = new r(interfaceC28254b);
            this.f81418s = rVar2;
            this.f81420t = dagger.internal.g.d(new com.avito.android.advert_collection.di.j(rVar2));
            this.f81422u = new C2415B(interfaceC28254b);
            dagger.internal.l lVarA = dagger.internal.l.a(resources);
            this.f81424v = lVarA;
            C30136o4 c30136o4 = new C30136o4(com.avito.android.date_time_formatter.i.b(new com.avito.android.date_time_formatter.h(lVarA)));
            s sVar = new s(interfaceC28254b);
            this.f81426w = sVar;
            this.f81430y = dagger.internal.g.d(new com.avito.android.favorites.adapter.advert.b(this.f81420t, new C30125n4(this.f81422u, c30136o4, sVar), new A(interfaceC28254b)));
            dagger.internal.u<com.avito.android.favorites.adapter.loading.c> uVarD4 = dagger.internal.g.d(l.a.f81474a);
            this.f81432z = uVarD4;
            this.f81326A = dagger.internal.g.d(new com.avito.android.favorites.adapter.loading.b(uVarD4));
            dagger.internal.u<com.avito.android.favorites.adapter.error.c> uVarD5 = dagger.internal.g.d(k.a.f81473a);
            this.f81328B = uVarD5;
            this.f81330C = dagger.internal.g.d(new com.avito.android.favorites.adapter.error.b(uVarD5));
            dagger.internal.u<com.avito.android.advert_collection.adapter.author.c> uVarD6 = dagger.internal.g.d(com.avito.android.advert_collection.adapter.author.f.a());
            this.f81332D = uVarD6;
            this.f81334E = dagger.internal.g.d(new com.avito.android.advert_collection.adapter.author.b(uVarD6));
            dagger.internal.u<com.avito.android.advert_collection.adapter.title.c> uVarD7 = dagger.internal.g.d(com.avito.android.advert_collection.adapter.title.e.a());
            this.f81336F = uVarD7;
            this.f81338G = dagger.internal.g.d(new com.avito.android.advert_collection.adapter.title.b(uVarD7));
            dagger.internal.u<com.avito.android.advert_collection.adapter.order.c> uVarD8 = dagger.internal.g.d(com.avito.android.advert_collection.adapter.order.f.a());
            this.f81340H = uVarD8;
            this.f81342I = dagger.internal.g.d(new com.avito.android.advert_collection.adapter.order.b(uVarD8));
            dagger.internal.u<com.avito.android.advert_collection.adapter.author.skeleton.c> uVarD9 = dagger.internal.g.d(com.avito.android.advert_collection.adapter.author.skeleton.e.a());
            this.f81344J = uVarD9;
            this.f81346K = dagger.internal.g.d(new com.avito.android.advert_collection.adapter.author.skeleton.b(uVarD9));
            dagger.internal.u<com.avito.android.favorites.adapter.advert.skeleton.c> uVarD10 = dagger.internal.g.d(com.avito.android.favorites.adapter.advert.skeleton.e.a());
            this.f81348L = uVarD10;
            this.f81350M = dagger.internal.g.d(new com.avito.android.favorites.adapter.advert.skeleton.b(uVarD10));
            dagger.internal.u<com.avito.android.favorites.adapter.banner.d> uVarD11 = dagger.internal.g.d(new com.avito.android.favorites.adapter.banner.g(this.f81396h, this.f81400j));
            this.f81352N = uVarD11;
            this.f81354O = dagger.internal.g.d(new com.avito.android.favorites.adapter.banner.c(uVarD11));
            dagger.internal.u<com.avito.android.advert_collection.adapter.empty_collection.c> uVarD12 = dagger.internal.g.d(com.avito.android.advert_collection.adapter.empty_collection.e.a());
            this.f81356P = uVarD12;
            this.f81358Q = dagger.internal.g.d(new com.avito.android.advert_collection.adapter.empty_collection.b(uVarD12));
            this.f81360R = dagger.internal.g.d(new com.avito.android.favorites.adapter.disclaimer.b(com.avito.android.favorites.adapter.disclaimer.f.a()));
            A.b bVarA = dagger.internal.A.a(14, 1);
            bVarA.f393938b.add(this.f81392f);
            dagger.internal.u<com.avito.android.favorites.adapter.promo.e> uVar = this.f81408n;
            List<dagger.internal.u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f81412p);
            list.add(this.f81416r);
            list.add(this.f81430y);
            list.add(this.f81326A);
            list.add(this.f81330C);
            list.add(this.f81334E);
            list.add(this.f81338G);
            list.add(this.f81342I);
            list.add(this.f81346K);
            list.add(this.f81350M);
            list.add(this.f81354O);
            list.add(this.f81358Q);
            list.add(this.f81360R);
            this.f81362S = dagger.internal.g.d(new com.avito.android.advert_collection.di.m(bVarA.b()));
            dagger.internal.u<com.avito.android.recycler.data_aware.e> uVarD13 = dagger.internal.g.d(new com.avito.android.advert_collection.di.i(com.avito.android.advert_collection.adapter.d.a()));
            this.f81364T = uVarD13;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD14 = dagger.internal.g.d(new com.avito.android.advert_collection.di.h(uVarD13, this.f81390e, this.f81362S));
            this.f81366U = uVarD14;
            dagger.internal.f.a(this.f81387d, dagger.internal.g.d(new com.avito.android.advert_collection.di.g(uVarD14, this.f81362S)));
            dagger.internal.u<com.avito.android.permissions.q> uVarD15 = dagger.internal.g.d(new com.avito.android.permissions.s(new u(interfaceC28254b), new t(interfaceC28254b)));
            this.f81372X = uVarD15;
            this.f81374Y = dagger.internal.g.d(new com.avito.android.permissions.p(uVarD15));
            q qVar = new q(interfaceC28254b);
            this.f81376Z = qVar;
            dagger.internal.u<InterfaceC31503a> uVarD16 = dagger.internal.g.d(C47017h.a(qVar));
            this.f81379a0 = uVarD16;
            this.f81382b0 = dagger.internal.g.d(C47018i.a(uVarD16));
            dagger.internal.u<com.avito.android.location.find.r> uVarD17 = dagger.internal.g.d(com.avito.android.location.find.v.a(this.f81376Z));
            this.f81385c0 = uVarD17;
            dagger.internal.u<com.avito.android.location.find.w> uVarD18 = dagger.internal.g.d(com.avito.android.location.find.y.a(uVarD17));
            this.f81388d0 = uVarD18;
            this.f81391e0 = dagger.internal.g.d(com.avito.android.location.find.q.a(uVarD18, this.f81382b0));
            this.f81395g0 = dagger.internal.g.d(C43693c.a(this.f81398i, new z(interfaceC28254b)));
            p pVar = new p(interfaceC28254b);
            this.f81397h0 = pVar;
            m mVar = new m(interfaceC28254b);
            l lVar = new l(interfaceC28254b);
            C28250a c28250a = new C28250a(interfaceC28254b);
            this.f81403k0 = c28250a;
            C28528v c28528v = new C28528v(this.f81398i, c28250a);
            C47278d c47278d = new C47278d(new e(interfaceC28254b));
            w wVar = new w(interfaceC28254b);
            com.avito.android.favorite.m mVar2 = new com.avito.android.favorite.m(pVar, mVar, lVar, c28528v, c47278d, wVar);
            this.f81409n0 = mVar2;
            this.f81411o0 = dagger.internal.B.a(new S4(mVar2, wVar, v.a.f81486a));
            this.f81413p0 = new o(interfaceC28254b);
            this.f81415q0 = dagger.internal.l.a(str);
            this.f81417r0 = dagger.internal.l.a(str2);
            this.f81419s0 = dagger.internal.l.b(str3);
            this.f81421t0 = dagger.internal.g.d(new C35865p(this.f81426w));
            this.f81423u0 = dagger.internal.g.d(new C30663h(this.f81424v));
            this.f81425v0 = new v(interfaceC28254b);
            this.f81427w0 = new C28251c(interfaceC28254b);
            this.f81429x0 = dagger.internal.B.a(new C30205u8(this.f81424v));
            dagger.internal.u<com.avito.android.serp.adapter.G> uVarA2 = dagger.internal.B.a(new C30052g8(this.f81424v));
            this.f81431y0 = uVarA2;
            y yVar = new y(interfaceC28254b);
            this.f81433z0 = yVar;
            this.f81327A0 = dagger.internal.B.a(new C30019d8(this.f81429x0, uVarA2, this.f81424v, yVar, P.a()));
            this.f81329B0 = dagger.internal.B.a(new E8(this.f81429x0));
            this.f81331C0 = new f(interfaceC28254b);
            this.f81333D0 = new h(bVar);
            dagger.internal.u<Screen> uVarD19 = dagger.internal.g.d(x.a.f81489a);
            this.f81335E0 = uVarD19;
            dagger.internal.u<InterfaceC40691b> uVarD20 = dagger.internal.g.d(new com.avito.android.advert_collection.di.t(uVarD19, this.f81331C0, this.f81394g, this.f81333D0));
            this.f81337F0 = uVarD20;
            this.f81339G0 = dagger.internal.B.a(new C30107l8(uVarD20, this.f81433z0));
            this.f81341H0 = dagger.internal.B.a(new C30140o8(this.f81409n0));
            D d12 = new D(interfaceC28254b);
            j jVar = new j(interfaceC28254b);
            this.f81345J0 = jVar;
            dagger.internal.u<com.avito.android.advert.viewed.d> uVarA3 = dagger.internal.B.a(e0.a(d12, new C(interfaceC28254b), jVar));
            this.f81349L0 = uVarA3;
            dagger.internal.u<n1> uVarA4 = dagger.internal.B.a(g0.a(uVarA3));
            this.f81351M0 = uVarA4;
            this.f81353N0 = dagger.internal.B.a(new P8(uVarA4, this.f81327A0, this.f81329B0, this.f81339G0, this.f81341H0));
            dagger.internal.u<InterfaceC30603b> uVarD21 = dagger.internal.g.d(new C30609d(this.f81421t0, this.f81423u0, this.f81425v0, this.f81427w0, this.f81353N0, com.avito.android.favorites.adapter.disclaimer.d.a()));
            this.f81355O0 = uVarD21;
            k kVar = new k(interfaceC28254b);
            C2416b c2416b = new C2416b(interfaceC28254b);
            this.f81361R0 = dagger.internal.g.d(new com.avito.android.advert_collection.k(this.f81415q0, this.f81417r0, this.f81419s0, uVarD21, this.f81413p0, kVar, this.f81397h0, c2416b));
            dagger.internal.l lVarA2 = dagger.internal.l.a(bool);
            i iVar = new i(interfaceC28254b);
            dagger.internal.u<com.avito.android.advert_collection.i> uVar2 = this.f81361R0;
            dagger.internal.u<E> uVar3 = this.f81403k0;
            this.f81365T0 = new com.avito.android.advert_collection.mvi.i(lVarA2, this.f81415q0, uVar2, iVar, uVar3);
            this.f81367U0 = dagger.internal.B.a(new com.avito.android.advert_collection_toast.e(uVar3, this.f81394g, new X7.c(this.f81398i), u.a.f81485a, this.f81345J0));
            this.f81369V0 = dagger.internal.g.d(new com.avito.android.advert_collection.n(this.f81424v));
            dagger.internal.u<com.avito.android.advert_collection.i> uVar4 = this.f81361R0;
            dagger.internal.u<com.avito.android.favorite.n> uVar5 = this.f81411o0;
            dagger.internal.u<com.avito.android.advert_collection_toast.c> uVar6 = this.f81367U0;
            com.avito.android.analytics.provider.f fVarA = com.avito.android.analytics.provider.f.a();
            dagger.internal.u<com.avito.android.advert_collection.l> uVar7 = this.f81369V0;
            this.f81371W0 = new com.avito.android.advert_collection.mvi.g(uVar4, uVar5, uVar6, fVarA, uVar7);
            this.f81375Y0 = new com.avito.android.advert_collection.mvi.q(uVar7, new n(interfaceC28254b), this.f81418s);
            this.f81377Z0 = new com.avito.android.advert_collection.mvi.n(uVar7);
            this.f81380a1 = new x(interfaceC30106l7);
            dagger.internal.u<C28478k> uVarD22 = dagger.internal.g.d(new com.avito.android.advert_collection.di.w(dagger.internal.l.a(rVar), this.f81335E0));
            this.f81383b1 = uVarD22;
            dagger.internal.u<ScreenPerformanceTracker> uVarI = com.avito.android.advert.item.delivery_suggests.l.i(this.f81380a1, uVarD22);
            this.f81386c1 = uVarI;
            this.f81389d1 = dagger.internal.l.a(new com.avito.android.advert_collection.C(new com.avito.android.advert_collection.B(new com.avito.android.advert_collection.mvi.l(this.f81365T0, this.f81371W0, this.f81375Y0, this.f81377Z0, uVarI))));
        }

        @Override // com.avito.android.advert_collection.di.InterfaceC28253a
        public final void a(AdvertCollectionFragment advertCollectionFragment) {
            advertCollectionFragment.f81199t0 = (com.avito.konveyor.adapter.j) this.f81387d.get();
            advertCollectionFragment.f81200u0 = this.f81366U.get();
            advertCollectionFragment.f81201v0 = this.f81420t.get();
            advertCollectionFragment.f81202w0 = this.f81432z.get();
            advertCollectionFragment.f81203x0 = this.f81328B.get();
            advertCollectionFragment.f81204y0 = this.f81332D.get();
            advertCollectionFragment.f81205z0 = this.f81340H.get();
            advertCollectionFragment.f81178A0 = new com.avito.android.advert_collection.adapter.a(this.f81378a, this.f81362S.get());
            advertCollectionFragment.f81179B0 = this.f81374Y.get();
            advertCollectionFragment.f81180C0 = this.f81391e0.get();
            advertCollectionFragment.f81181D0 = this.f81395g0.get();
            InterfaceC28254b interfaceC28254b = this.f81381b;
            advertCollectionFragment.f81182E0 = interfaceC28254b.h();
            advertCollectionFragment.f81183F0 = this.f81411o0.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f81384c.u4();
            dagger.internal.t.c(aVarU4);
            advertCollectionFragment.f81184G0 = aVarU4;
            E eI2 = interfaceC28254b.i();
            dagger.internal.t.c(eI2);
            advertCollectionFragment.f81185H0 = eI2;
            InterfaceC35745a5 interfaceC35745a5D = interfaceC28254b.d();
            dagger.internal.t.c(interfaceC35745a5D);
            advertCollectionFragment.f81186I0 = interfaceC35745a5D;
            advertCollectionFragment.f81187J0 = (A.a) this.f81389d1.f393949a;
            advertCollectionFragment.f81188K0 = this.f81367U0.get();
            advertCollectionFragment.f81189L0 = this.f81386c1.get();
            interfaceC28254b.W();
            com.avito.android.sales_items.m mVarT7 = interfaceC28254b.t7();
            dagger.internal.t.c(mVarT7);
            advertCollectionFragment.f81190M0 = mVarT7;
            M7.a aVarZ5 = interfaceC28254b.z5();
            dagger.internal.t.c(aVarZ5);
            advertCollectionFragment.f81191N0 = aVarZ5;
            interfaceC28254b.f4();
            advertCollectionFragment.f81192O0 = CollectionSharingReceiver.class;
        }
    }

    /* compiled from: DaggerAdvertCollectionComponent.java */
    public static final class c implements InterfaceC28253a.InterfaceC2417a {
        public c() {
        }

        @Override // com.avito.android.advert_collection.di.InterfaceC28253a.InterfaceC2417a
        public final InterfaceC28253a a(InterfaceC39417a interfaceC39417a, InterfaceC28254b interfaceC28254b, InterfaceC30106l7 interfaceC30106l7, com.avito.android.analytics.screens.r rVar, Resources resources, String str, String str2, String str3, AdvertCollectionFragment advertCollectionFragment, ActivityC22955m activityC22955m, AdvertCollectionFragment advertCollectionFragment2, S0 s02, boolean z12) {
            interfaceC39417a.getClass();
            str.getClass();
            str2.getClass();
            return new b(interfaceC28254b, interfaceC39417a, interfaceC30106l7, rVar, resources, str, str2, str3, advertCollectionFragment, activityC22955m, advertCollectionFragment2, s02, Boolean.valueOf(z12), null);
        }
    }

    public static InterfaceC28253a.InterfaceC2417a a() {
        return new c();
    }
}
