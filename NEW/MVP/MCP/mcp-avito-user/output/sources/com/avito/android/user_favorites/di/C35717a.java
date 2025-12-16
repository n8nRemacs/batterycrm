package com.avito.android.user_favorites.di;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.C36133w0;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bxcontent.N1;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.favorites.InterfaceC30662g1;
import com.avito.android.favorites.tracker.FavoritesScreen;
import com.avito.android.lib.deprecated_design.tab.TabPagerAdapter;
import com.avito.android.user_favorites.F;
import com.avito.android.user_favorites.H;
import com.avito.android.user_favorites.M;
import com.avito.android.user_favorites.UserFavoritesFragment;
import com.avito.android.user_favorites.adapter.FavoritesTab;
import com.avito.android.user_favorites.di.g;
import com.avito.android.user_favorites.di.n;
import com.avito.android.user_favorites.di.q;
import com.avito.android.user_viewed.feature.UserViewedTestGroup;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import dagger.internal.A;
import iE.C41273b;
import java.util.List;

/* compiled from: DaggerUserFavoritesComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.user_favorites.di.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35717a {

    /* compiled from: DaggerUserFavoritesComponent.java */
    /* renamed from: com.avito.android.user_favorites.di.a$b */
    public static final class b implements g.a {
        public b() {
        }

        @Override // com.avito.android.user_favorites.di.g.a
        public final g a(h hVar, BottomNavigationSpace bottomNavigationSpace, com.avito.android.analytics.screens.r rVar, Kundle kundle, UserFavoritesFragment userFavoritesFragment, M m12, int i12, Integer num) {
            m12.getClass();
            return new c(new DJ0.a(), new FJ0.a(), new GJ0.a(), new AJ0.a(), new IJ0.a(), hVar, bottomNavigationSpace, rVar, kundle, userFavoritesFragment, m12, Integer.valueOf(i12), num, null);
        }
    }

    /* compiled from: DaggerUserFavoritesComponent.java */
    /* renamed from: com.avito.android.user_favorites.di.a$c */
    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public final h f316866a;

        /* renamed from: b, reason: collision with root package name */
        public final BottomNavigationSpace f316867b;

        /* renamed from: c, reason: collision with root package name */
        public final Integer f316868c;

        /* renamed from: d, reason: collision with root package name */
        public final M f316869d;

        /* renamed from: e, reason: collision with root package name */
        public final Integer f316870e;

        /* renamed from: f, reason: collision with root package name */
        public final Kundle f316871f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f316872g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<Resources> f316873h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.lib.deprecated_design.tab.adapter.j<FavoritesTab>> f316874i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<Context> f316875j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_favorites.adapter.a<FavoritesTab>> f316876k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<FragmentManager> f316877l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30662g1> f316878m;

        /* renamed from: n, reason: collision with root package name */
        public final k f316879n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.lib.deprecated_design.tab.b<? extends FavoritesTab>> f316880o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.lib.deprecated_design.tab.b<? extends FavoritesTab>> f316881p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.lib.deprecated_design.tab.b<? extends FavoritesTab>> f316882q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.lib.deprecated_design.tab.b<? extends FavoritesTab>> f316883r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.lib.deprecated_design.tab.b<? extends FavoritesTab>> f316884s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.user_viewed.b> f316885t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.lib.deprecated_design.tab.b<? extends FavoritesTab>> f316886u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<TabPagerAdapter> f316887v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f316888w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f316889x;

        /* compiled from: DaggerUserFavoritesComponent.java */
        /* renamed from: com.avito.android.user_favorites.di.a$c$a, reason: collision with other inner class name */
        public static final class C9839a implements dagger.internal.u<InterfaceC30662g1> {

            /* renamed from: a, reason: collision with root package name */
            public final h f316890a;

            public C9839a(h hVar) {
                this.f316890a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f316890a.a4();
            }
        }

        /* compiled from: DaggerUserFavoritesComponent.java */
        /* renamed from: com.avito.android.user_favorites.di.a$c$b */
        public static final class b implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final h f316891a;

            public b(h hVar) {
                this.f316891a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f316891a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerUserFavoritesComponent.java */
        /* renamed from: com.avito.android.user_favorites.di.a$c$c, reason: collision with other inner class name */
        public static final class C9840c implements dagger.internal.u<com.avito.android.user_viewed.b> {

            /* renamed from: a, reason: collision with root package name */
            public final h f316892a;

            public C9840c(h hVar) {
                this.f316892a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f316892a.Oc();
            }
        }

        public c(DJ0.a aVar, FJ0.a aVar2, GJ0.a aVar3, AJ0.a aVar4, IJ0.a aVar5, h hVar, BottomNavigationSpace bottomNavigationSpace, com.avito.android.analytics.screens.r rVar, Kundle kundle, Fragment fragment, M m12, Integer num, Integer num2, C9838a c9838a) {
            this.f316866a = hVar;
            this.f316867b = bottomNavigationSpace;
            this.f316868c = num2;
            this.f316869d = m12;
            this.f316870e = num;
            this.f316871f = kundle;
            dagger.internal.l lVarA = dagger.internal.l.a(fragment);
            this.f316872g = lVarA;
            this.f316873h = dagger.internal.g.d(new m(lVarA));
            this.f316874i = dagger.internal.g.d(q.a.f316910a);
            dagger.internal.u<Context> uVarD = dagger.internal.g.d(new j(this.f316872g));
            this.f316875j = uVarD;
            this.f316876k = dagger.internal.g.d(new r(uVarD, this.f316874i));
            this.f316877l = dagger.internal.g.d(new l(this.f316872g));
            this.f316878m = new C9839a(hVar);
            k kVar = new k(dagger.internal.l.a(bottomNavigationSpace), this.f316878m);
            this.f316879n = kVar;
            this.f316880o = dagger.internal.g.d(new DJ0.b(aVar, kVar));
            this.f316881p = dagger.internal.g.d(new FJ0.b(aVar2, this.f316879n));
            this.f316882q = dagger.internal.g.d(new GJ0.b(aVar3));
            this.f316883r = dagger.internal.g.d(com.avito.android.user_favorites.adapter.comparison.di.b.a());
            this.f316884s = dagger.internal.g.d(new AJ0.b(aVar4));
            this.f316886u = dagger.internal.g.d(new IJ0.b(aVar5, new C9840c(hVar)));
            A.b bVarA = dagger.internal.A.a(6, 0);
            dagger.internal.u<com.avito.android.lib.deprecated_design.tab.b<? extends FavoritesTab>> uVar = this.f316880o;
            List<dagger.internal.u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f316881p);
            list.add(this.f316882q);
            list.add(this.f316883r);
            list.add(this.f316884s);
            list.add(this.f316886u);
            this.f316887v = dagger.internal.g.d(new p(this.f316877l, this.f316874i, bVarA.b()));
            this.f316888w = new b(hVar);
            this.f316889x = dagger.internal.g.d(new o(this.f316888w, n.a.f316903a, dagger.internal.l.a(rVar)));
        }

        @Override // com.avito.android.user_favorites.di.g
        public final void a(UserFavoritesFragment userFavoritesFragment) {
            h hVar = this.f316866a;
            G gW2 = hVar.w();
            dagger.internal.t.c(gW2);
            F f12 = new F(this.f316873h.get());
            com.avito.android.db.o oVarG2 = hVar.g2();
            com.avito.android.common.a aVarD4 = hVar.D4();
            dagger.internal.t.c(aVarD4);
            TV.f fVarC2 = hVar.c2();
            dagger.internal.t.c(fVarC2);
            C36133w0 c36133w0A4 = hVar.a4();
            int i12 = i.f316897a;
            BottomNavigationSpace bottomNavigationSpace = this.f316867b;
            FavoritesSpace favoritesSpaceA = c36133w0A4.a(bottomNavigationSpace);
            dagger.internal.t.d(favoritesSpaceA);
            AD.a aVarK2 = hVar.K2();
            InterfaceC28373a interfaceC28373aA = hVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            u3.g<UserViewedTestGroup> gVarPj = hVar.pj();
            com.avito.android.timestamp_storage.domain.d dVarX6 = hVar.X6();
            dagger.internal.t.c(dVarX6);
            com.avito.android.user_favorites.q qVar = new com.avito.android.user_favorites.q(gW2, f12, oVarG2, aVarD4, fVarC2, favoritesSpaceA, aVarK2, this.f316868c, interfaceC28373aA, gVarPj, dVarX6);
            InterfaceC35745a5 interfaceC35745a5D = hVar.d();
            dagger.internal.t.c(interfaceC35745a5D);
            R0 r0C = hVar.c();
            dagger.internal.t.c(r0C);
            com.avito.android.lib.deprecated_design.tab.adapter.j<FavoritesTab> jVar = this.f316874i.get();
            C41273b c41273bU5 = hVar.U5();
            InterfaceC28373a interfaceC28373aA2 = hVar.a();
            dagger.internal.t.c(interfaceC28373aA2);
            G gW3 = hVar.w();
            dagger.internal.t.c(gW3);
            int iIntValue = this.f316870e.intValue();
            N1 n1C3 = hVar.c3();
            dagger.internal.t.c(n1C3);
            com.avito.android.timestamp_storage.domain.d dVarX62 = hVar.X6();
            dagger.internal.t.c(dVarX62);
            userFavoritesFragment.f316806t0 = new com.avito.android.user_favorites.B(qVar, interfaceC35745a5D, r0C, jVar, c41273bU5, interfaceC28373aA2, gW3, this.f316869d, iIntValue, n1C3, dVarX62, hVar.J4(), this.f316871f);
            userFavoritesFragment.f316807u0 = this.f316876k.get();
            userFavoritesFragment.f316808v0 = this.f316887v.get();
            userFavoritesFragment.f316809w0 = hVar.X4();
            com.avito.android.lib.beduin_v2.feature.item.c cVarJ0 = hVar.j0();
            FavoritesScreen favoritesScreen = FavoritesScreen.f157546d;
            dagger.internal.t.d(favoritesScreen);
            userFavoritesFragment.f316810x0 = new H(cVarJ0, favoritesScreen, this.f316889x.get());
            FavoritesSpace favoritesSpaceA2 = hVar.a4().a(bottomNavigationSpace);
            dagger.internal.t.d(favoritesSpaceA2);
            userFavoritesFragment.f316811y0 = favoritesSpaceA2;
        }
    }

    public static g.a a() {
        return new b();
    }
}
