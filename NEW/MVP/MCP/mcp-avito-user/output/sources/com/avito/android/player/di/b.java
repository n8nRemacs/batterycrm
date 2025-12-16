package com.avito.android.player.di;

import android.content.Context;
import android.content.res.Resources;
import androidx.view.InterfaceC22983P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.player.ExoPlayerController;
import com.avito.android.player.analytics.PlayerAnalyticsInteractor;
import com.avito.android.player.di.f;
import com.avito.android.player.router.PlayerArguments;
import com.avito.android.player.tracker.PlayerScreen;
import com.avito.android.player.view.PlayerFragment;
import com.avito.android.remote.InterfaceC34332n;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPlayerFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class b {

    /* compiled from: DaggerPlayerFragmentComponent.java */
    /* renamed from: com.avito.android.player.di.b$b, reason: collision with other inner class name */
    public static final class C6616b implements f.a {

        /* renamed from: a, reason: collision with root package name */
        public g f220054a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC30106l7 f220055b;

        /* renamed from: c, reason: collision with root package name */
        public PlayerFragment f220056c;

        /* renamed from: d, reason: collision with root package name */
        public PlayerScreen f220057d;

        /* renamed from: e, reason: collision with root package name */
        public Context f220058e;

        /* renamed from: f, reason: collision with root package name */
        public PlayerArguments f220059f;

        /* renamed from: g, reason: collision with root package name */
        public r f220060g;

        /* renamed from: h, reason: collision with root package name */
        public Resources f220061h;

        /* renamed from: i, reason: collision with root package name */
        public ExoPlayerController.State f220062i;

        /* renamed from: j, reason: collision with root package name */
        public PlayerAnalyticsInteractor.State f220063j;

        public C6616b() {
        }

        @Override // com.avito.android.player.di.f.a
        public final f.a a(InterfaceC30106l7 interfaceC30106l7) {
            this.f220055b = interfaceC30106l7;
            return this;
        }

        @Override // com.avito.android.player.di.f.a
        public final f.a b(Resources resources) {
            this.f220061h = resources;
            return this;
        }

        @Override // com.avito.android.player.di.f.a
        public final f build() {
            t.a(g.class, this.f220054a);
            t.a(InterfaceC30106l7.class, this.f220055b);
            t.a(InterfaceC22983P.class, this.f220056c);
            t.a(Screen.class, this.f220057d);
            t.a(Context.class, this.f220058e);
            t.a(PlayerArguments.class, this.f220059f);
            t.a(r.class, this.f220060g);
            t.a(Resources.class, this.f220061h);
            return new c(this.f220054a, this.f220055b, this.f220056c, this.f220057d, this.f220058e, this.f220059f, this.f220060g, this.f220061h, this.f220062i, this.f220063j, null);
        }

        @Override // com.avito.android.player.di.f.a
        public final f.a c(r rVar) {
            this.f220060g = rVar;
            return this;
        }

        @Override // com.avito.android.player.di.f.a
        public final f.a d(g gVar) {
            this.f220054a = gVar;
            return this;
        }

        @Override // com.avito.android.player.di.f.a
        public final f.a e(Context context) {
            this.f220058e = context;
            return this;
        }

        @Override // com.avito.android.player.di.f.a
        public final f.a f(PlayerAnalyticsInteractor.State state) {
            this.f220063j = state;
            return this;
        }

        @Override // com.avito.android.player.di.f.a
        public final f.a g(PlayerArguments playerArguments) {
            playerArguments.getClass();
            this.f220059f = playerArguments;
            return this;
        }

        @Override // com.avito.android.player.di.f.a
        public final f.a h(ExoPlayerController.State state) {
            this.f220062i = state;
            return this;
        }

        @Override // com.avito.android.player.di.f.a
        public final f.a i(PlayerFragment playerFragment) {
            this.f220056c = playerFragment;
            return this;
        }

        @Override // com.avito.android.player.di.f.a
        public final f.a j(PlayerScreen playerScreen) {
            playerScreen.getClass();
            this.f220057d = playerScreen;
            return this;
        }
    }

    /* compiled from: DaggerPlayerFragmentComponent.java */
    public static final class c implements com.avito.android.player.di.f {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.player.di.g f220064a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f220065b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f220066c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.player_holder.a> f220067d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ExoPlayerController> f220068e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.player.mvi.f f220069f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f220070g;

        /* renamed from: h, reason: collision with root package name */
        public final u<E> f220071h;

        /* renamed from: i, reason: collision with root package name */
        public final u<PlayerAnalyticsInteractor> f220072i;

        /* renamed from: j, reason: collision with root package name */
        public final u<J80.b> f220073j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.player.mvi.k f220074k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC34332n> f220075l;

        /* renamed from: m, reason: collision with root package name */
        public final u<F80.a> f220076m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.connection_quality.connectivity.a> f220077n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.player.mvi.m f220078o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC28481c> f220079p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.l f220080q;

        /* renamed from: r, reason: collision with root package name */
        public final u<C28478k> f220081r;

        /* renamed from: s, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f220082s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.player.view.k f220083t;

        /* compiled from: DaggerPlayerFragmentComponent.java */
        public static final class a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.player.di.g f220084a;

            public a(com.avito.android.player.di.g gVar) {
                this.f220084a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eB4 = this.f220084a.b4();
                t.c(eB4);
                return eB4;
            }
        }

        /* compiled from: DaggerPlayerFragmentComponent.java */
        /* renamed from: com.avito.android.player.di.b$c$b, reason: collision with other inner class name */
        public static final class C6617b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.player.di.g f220085a;

            public C6617b(com.avito.android.player.di.g gVar) {
                this.f220085a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f220085a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPlayerFragmentComponent.java */
        /* renamed from: com.avito.android.player.di.b$c$c, reason: collision with other inner class name */
        public static final class C6618c implements u<InterfaceC34332n> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.player.di.g f220086a;

            public C6618c(com.avito.android.player.di.g gVar) {
                this.f220086a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f220086a.za();
            }
        }

        /* compiled from: DaggerPlayerFragmentComponent.java */
        public static final class d implements u<com.avito.android.connection_quality.connectivity.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.player.di.g f220087a;

            public d(com.avito.android.player.di.g gVar) {
                this.f220087a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.connection_quality.connectivity.a aVarU = this.f220087a.U();
                t.c(aVarU);
                return aVarU;
            }
        }

        /* compiled from: DaggerPlayerFragmentComponent.java */
        public static final class e implements u<com.avito.android.player_holder.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.player.di.g f220088a;

            public e(com.avito.android.player.di.g gVar) {
                this.f220088a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.player_holder.a aVarR0 = this.f220088a.r0();
                t.c(aVarR0);
                return aVarR0;
            }
        }

        /* compiled from: DaggerPlayerFragmentComponent.java */
        public static final class f implements u<J80.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.player.di.g f220089a;

            public f(com.avito.android.player.di.g gVar) {
                this.f220089a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J80.b bVarG7 = this.f220089a.g7();
                t.c(bVarG7);
                return bVarG7;
            }
        }

        /* compiled from: DaggerPlayerFragmentComponent.java */
        public static final class g implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.player.di.g f220090a;

            public g(com.avito.android.player.di.g gVar) {
                this.f220090a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f220090a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerPlayerFragmentComponent.java */
        public static final class h implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f220091a;

            public h(InterfaceC30106l7 interfaceC30106l7) {
                this.f220091a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f220091a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.player.di.g gVar, InterfaceC30106l7 interfaceC30106l7, InterfaceC22983P interfaceC22983P, Screen screen, Context context, PlayerArguments playerArguments, r rVar, Resources resources, ExoPlayerController.State state, PlayerAnalyticsInteractor.State state2, a aVar) {
            this.f220064a = gVar;
            this.f220065b = dagger.internal.l.a(playerArguments);
            this.f220066c = new g(gVar);
            this.f220067d = new e(gVar);
            u<ExoPlayerController> uVarD = dagger.internal.g.d(new com.avito.android.player.f(dagger.internal.l.b(state), this.f220066c, this.f220067d));
            this.f220068e = uVarD;
            this.f220069f = new com.avito.android.player.mvi.f(this.f220065b, uVarD);
            this.f220070g = new C6617b(gVar);
            this.f220071h = new a(gVar);
            u<PlayerAnalyticsInteractor> uVarD2 = dagger.internal.g.d(new com.avito.android.player.analytics.b(this.f220065b, this.f220070g, this.f220071h, dagger.internal.l.b(state2)));
            this.f220072i = uVarD2;
            this.f220074k = new com.avito.android.player.mvi.k(uVarD2, new f(gVar), this.f220068e);
            u<F80.a> uVarD3 = dagger.internal.g.d(new F80.c(new C6618c(gVar)));
            this.f220076m = uVarD3;
            this.f220078o = new com.avito.android.player.mvi.m(uVarD3, new d(gVar));
            this.f220079p = new h(interfaceC30106l7);
            this.f220080q = dagger.internal.l.a(screen);
            u<C28478k> uVarD4 = dagger.internal.g.d(new i(this.f220080q, dagger.internal.l.a(rVar)));
            this.f220081r = uVarD4;
            this.f220082s = com.avito.android.advert.item.delivery_suggests.l.i(this.f220079p, uVarD4);
            this.f220083t = new com.avito.android.player.view.k(new com.avito.android.player.mvi.i(this.f220069f, com.avito.android.player.mvi.b.a(), this.f220074k, this.f220078o, this.f220082s), this.f220072i, this.f220068e);
        }

        @Override // com.avito.android.player.di.f
        public final void a(PlayerFragment playerFragment) {
            playerFragment.f220241t0 = this.f220083t;
            playerFragment.f220243v0 = this.f220082s.get();
            InterfaceC28373a interfaceC28373aA = this.f220064a.a();
            t.c(interfaceC28373aA);
            playerFragment.f220244w0 = interfaceC28373aA;
        }
    }

    public static f.a a() {
        return new C6616b();
    }
}
