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
import com.avito.android.player.di.j;
import com.avito.android.player.router.PlayerArguments;
import com.avito.android.player.tracker.PlayerFragmentScreen;
import com.avito.android.player.view.PlayerGalleryFragment;
import com.avito.android.remote.InterfaceC34332n;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPlayerGalleryFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class c {

    /* compiled from: DaggerPlayerGalleryFragmentComponent.java */
    public static final class b implements j.a {

        /* renamed from: a, reason: collision with root package name */
        public g f220092a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC30106l7 f220093b;

        /* renamed from: c, reason: collision with root package name */
        public PlayerGalleryFragment f220094c;

        /* renamed from: d, reason: collision with root package name */
        public PlayerFragmentScreen f220095d;

        /* renamed from: e, reason: collision with root package name */
        public Context f220096e;

        /* renamed from: f, reason: collision with root package name */
        public PlayerArguments f220097f;

        /* renamed from: g, reason: collision with root package name */
        public r f220098g;

        /* renamed from: h, reason: collision with root package name */
        public Resources f220099h;

        /* renamed from: i, reason: collision with root package name */
        public ExoPlayerController.State f220100i;

        /* renamed from: j, reason: collision with root package name */
        public PlayerAnalyticsInteractor.State f220101j;

        public b() {
        }

        @Override // com.avito.android.player.di.j.a
        public final j.a a(InterfaceC30106l7 interfaceC30106l7) {
            this.f220093b = interfaceC30106l7;
            return this;
        }

        @Override // com.avito.android.player.di.j.a
        public final j.a b(Resources resources) {
            this.f220099h = resources;
            return this;
        }

        @Override // com.avito.android.player.di.j.a
        public final j build() {
            t.a(g.class, this.f220092a);
            t.a(InterfaceC30106l7.class, this.f220093b);
            t.a(InterfaceC22983P.class, this.f220094c);
            t.a(Screen.class, this.f220095d);
            t.a(Context.class, this.f220096e);
            t.a(PlayerArguments.class, this.f220097f);
            t.a(r.class, this.f220098g);
            t.a(Resources.class, this.f220099h);
            return new C6619c(this.f220092a, this.f220093b, this.f220094c, this.f220095d, this.f220096e, this.f220097f, this.f220098g, this.f220099h, this.f220100i, this.f220101j, null);
        }

        @Override // com.avito.android.player.di.j.a
        public final j.a c(r rVar) {
            this.f220098g = rVar;
            return this;
        }

        @Override // com.avito.android.player.di.j.a
        public final j.a d(g gVar) {
            this.f220092a = gVar;
            return this;
        }

        @Override // com.avito.android.player.di.j.a
        public final j.a e(Context context) {
            this.f220096e = context;
            return this;
        }

        @Override // com.avito.android.player.di.j.a
        public final j.a f(PlayerAnalyticsInteractor.State state) {
            this.f220101j = state;
            return this;
        }

        @Override // com.avito.android.player.di.j.a
        public final j.a g(PlayerArguments playerArguments) {
            playerArguments.getClass();
            this.f220097f = playerArguments;
            return this;
        }

        @Override // com.avito.android.player.di.j.a
        public final j.a h(ExoPlayerController.State state) {
            this.f220100i = state;
            return this;
        }

        @Override // com.avito.android.player.di.j.a
        public final j.a i(PlayerGalleryFragment playerGalleryFragment) {
            this.f220094c = playerGalleryFragment;
            return this;
        }

        @Override // com.avito.android.player.di.j.a
        public final j.a j(PlayerFragmentScreen playerFragmentScreen) {
            playerFragmentScreen.getClass();
            this.f220095d = playerFragmentScreen;
            return this;
        }
    }

    /* compiled from: DaggerPlayerGalleryFragmentComponent.java */
    /* renamed from: com.avito.android.player.di.c$c, reason: collision with other inner class name */
    public static final class C6619c implements j {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.player.di.g f220102a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f220103b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f220104c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.player_holder.a> f220105d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ExoPlayerController> f220106e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.player.mvi.f f220107f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f220108g;

        /* renamed from: h, reason: collision with root package name */
        public final u<E> f220109h;

        /* renamed from: i, reason: collision with root package name */
        public final u<PlayerAnalyticsInteractor> f220110i;

        /* renamed from: j, reason: collision with root package name */
        public final u<J80.b> f220111j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.player.mvi.k f220112k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC34332n> f220113l;

        /* renamed from: m, reason: collision with root package name */
        public final u<F80.a> f220114m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.connection_quality.connectivity.a> f220115n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.player.mvi.m f220116o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC28481c> f220117p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.l f220118q;

        /* renamed from: r, reason: collision with root package name */
        public final u<C28478k> f220119r;

        /* renamed from: s, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f220120s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.player.view.k f220121t;

        /* compiled from: DaggerPlayerGalleryFragmentComponent.java */
        /* renamed from: com.avito.android.player.di.c$c$a */
        public static final class a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.player.di.g f220122a;

            public a(com.avito.android.player.di.g gVar) {
                this.f220122a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eB4 = this.f220122a.b4();
                t.c(eB4);
                return eB4;
            }
        }

        /* compiled from: DaggerPlayerGalleryFragmentComponent.java */
        /* renamed from: com.avito.android.player.di.c$c$b */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.player.di.g f220123a;

            public b(com.avito.android.player.di.g gVar) {
                this.f220123a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f220123a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPlayerGalleryFragmentComponent.java */
        /* renamed from: com.avito.android.player.di.c$c$c, reason: collision with other inner class name */
        public static final class C6620c implements u<InterfaceC34332n> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.player.di.g f220124a;

            public C6620c(com.avito.android.player.di.g gVar) {
                this.f220124a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f220124a.za();
            }
        }

        /* compiled from: DaggerPlayerGalleryFragmentComponent.java */
        /* renamed from: com.avito.android.player.di.c$c$d */
        public static final class d implements u<com.avito.android.connection_quality.connectivity.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.player.di.g f220125a;

            public d(com.avito.android.player.di.g gVar) {
                this.f220125a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.connection_quality.connectivity.a aVarU = this.f220125a.U();
                t.c(aVarU);
                return aVarU;
            }
        }

        /* compiled from: DaggerPlayerGalleryFragmentComponent.java */
        /* renamed from: com.avito.android.player.di.c$c$e */
        public static final class e implements u<com.avito.android.player_holder.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.player.di.g f220126a;

            public e(com.avito.android.player.di.g gVar) {
                this.f220126a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.player_holder.a aVarR0 = this.f220126a.r0();
                t.c(aVarR0);
                return aVarR0;
            }
        }

        /* compiled from: DaggerPlayerGalleryFragmentComponent.java */
        /* renamed from: com.avito.android.player.di.c$c$f */
        public static final class f implements u<J80.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.player.di.g f220127a;

            public f(com.avito.android.player.di.g gVar) {
                this.f220127a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J80.b bVarG7 = this.f220127a.g7();
                t.c(bVarG7);
                return bVarG7;
            }
        }

        /* compiled from: DaggerPlayerGalleryFragmentComponent.java */
        /* renamed from: com.avito.android.player.di.c$c$g */
        public static final class g implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.player.di.g f220128a;

            public g(com.avito.android.player.di.g gVar) {
                this.f220128a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f220128a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerPlayerGalleryFragmentComponent.java */
        /* renamed from: com.avito.android.player.di.c$c$h */
        public static final class h implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f220129a;

            public h(InterfaceC30106l7 interfaceC30106l7) {
                this.f220129a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f220129a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public C6619c(com.avito.android.player.di.g gVar, InterfaceC30106l7 interfaceC30106l7, InterfaceC22983P interfaceC22983P, Screen screen, Context context, PlayerArguments playerArguments, r rVar, Resources resources, ExoPlayerController.State state, PlayerAnalyticsInteractor.State state2, a aVar) {
            this.f220102a = gVar;
            this.f220103b = dagger.internal.l.a(playerArguments);
            this.f220104c = new g(gVar);
            this.f220105d = new e(gVar);
            u<ExoPlayerController> uVarD = dagger.internal.g.d(new com.avito.android.player.f(dagger.internal.l.b(state), this.f220104c, this.f220105d));
            this.f220106e = uVarD;
            this.f220107f = new com.avito.android.player.mvi.f(this.f220103b, uVarD);
            this.f220108g = new b(gVar);
            this.f220109h = new a(gVar);
            u<PlayerAnalyticsInteractor> uVarD2 = dagger.internal.g.d(new com.avito.android.player.analytics.b(this.f220103b, this.f220108g, this.f220109h, dagger.internal.l.b(state2)));
            this.f220110i = uVarD2;
            this.f220112k = new com.avito.android.player.mvi.k(uVarD2, new f(gVar), this.f220106e);
            u<F80.a> uVarD3 = dagger.internal.g.d(new F80.c(new C6620c(gVar)));
            this.f220114m = uVarD3;
            this.f220116o = new com.avito.android.player.mvi.m(uVarD3, new d(gVar));
            this.f220117p = new h(interfaceC30106l7);
            this.f220118q = dagger.internal.l.a(screen);
            u<C28478k> uVarD4 = dagger.internal.g.d(new i(this.f220118q, dagger.internal.l.a(rVar)));
            this.f220119r = uVarD4;
            this.f220120s = com.avito.android.advert.item.delivery_suggests.l.i(this.f220117p, uVarD4);
            this.f220121t = new com.avito.android.player.view.k(new com.avito.android.player.mvi.i(this.f220107f, com.avito.android.player.mvi.b.a(), this.f220112k, this.f220116o, this.f220120s), this.f220110i, this.f220106e);
        }

        @Override // com.avito.android.player.di.j
        public final void a(PlayerGalleryFragment playerGalleryFragment) {
            playerGalleryFragment.f220275n0 = this.f220121t;
            playerGalleryFragment.f220277p0 = this.f220120s.get();
            com.avito.android.player.di.g gVar = this.f220102a;
            InterfaceC28373a interfaceC28373aA = gVar.a();
            t.c(interfaceC28373aA);
            playerGalleryFragment.f220278q0 = interfaceC28373aA;
            com.avito.android.connection_quality.connectivity.a aVarU = gVar.U();
            t.c(aVarU);
            playerGalleryFragment.f220279r0 = aVarU;
        }
    }

    public static j.a a() {
        return new b();
    }
}
