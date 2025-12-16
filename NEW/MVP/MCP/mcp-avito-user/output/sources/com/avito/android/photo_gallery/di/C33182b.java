package com.avito.android.photo_gallery.di;

import Cd.F;
import Id.InterfaceC14060a;
import Uq.InterfaceC15558a;
import Zd.InterfaceC19542a;
import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import androidx.view.C22977J;
import androidx.view.InterfaceC22983P;
import androidx.view.S0;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.account.E;
import com.avito.android.advert_collection_toast.analytics.FromPageSource;
import com.avito.android.advert_core.contactbar.G;
import com.avito.android.advert_core.contactbar.InterfaceC28262a;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_core.contactbar.SourceScreen;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.photo_gallery.LegacyPhotoGalleryActivity;
import com.avito.android.photo_gallery.di.k;
import com.avito.android.photo_gallery.di.q;
import com.avito.android.photo_gallery.di.r;
import com.avito.android.photo_gallery.di.u;
import com.avito.android.photo_gallery.di.v;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.avito.android.remote.InterfaceC34398y;
import com.avito.android.util.C35865p;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import com.avito.android.util.S3;
import cv.InterfaceC39417a;
import dagger.internal.q;
import java.util.Locale;
import kotlinx.coroutines.T;
import lD.C43617a;
import ru.avito.messenger.MessengerApi;
import ur.InterfaceC49101b;
import wv.C49686b;
import xu.C50000c;

/* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
@dagger.internal.e
/* renamed from: com.avito.android.photo_gallery.di.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33182b {

    /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
    /* renamed from: com.avito.android.photo_gallery.di.b$b, reason: collision with other inner class name */
    public static final class C6496b implements k.a {

        /* renamed from: a, reason: collision with root package name */
        public LegacyPhotoGalleryActivity f216916a;

        /* renamed from: b, reason: collision with root package name */
        public Resources f216917b;

        /* renamed from: c, reason: collision with root package name */
        public TreeClickStreamParent f216918c;

        /* renamed from: d, reason: collision with root package name */
        public com.avito.android.analytics.screens.r f216919d;

        /* renamed from: e, reason: collision with root package name */
        public BannerPageSource f216920e;

        /* renamed from: f, reason: collision with root package name */
        public Kundle f216921f;

        /* renamed from: g, reason: collision with root package name */
        public C f216922g;

        /* renamed from: h, reason: collision with root package name */
        public InterfaceC39417a f216923h;

        /* renamed from: i, reason: collision with root package name */
        public S0 f216924i;

        /* renamed from: j, reason: collision with root package name */
        public C22977J f216925j;

        public C6496b() {
        }

        @Override // com.avito.android.photo_gallery.di.k.a
        public final k.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f216923h = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.photo_gallery.di.k.a
        public final k.a b(C c12) {
            this.f216922g = c12;
            return this;
        }

        @Override // com.avito.android.photo_gallery.di.k.a
        public final k build() {
            dagger.internal.t.a(androidx.view.n.class, this.f216916a);
            dagger.internal.t.a(Resources.class, this.f216917b);
            dagger.internal.t.a(com.avito.android.analytics.screens.r.class, this.f216919d);
            dagger.internal.t.a(BannerPageSource.class, this.f216920e);
            dagger.internal.t.a(C.class, this.f216922g);
            dagger.internal.t.a(cv.b.class, this.f216923h);
            dagger.internal.t.a(S0.class, this.f216924i);
            dagger.internal.t.a(T.class, this.f216925j);
            return new c(this.f216922g, this.f216923h, this.f216916a, this.f216917b, this.f216918c, this.f216919d, this.f216920e, this.f216921f, this.f216924i, this.f216925j, null);
        }

        @Override // com.avito.android.photo_gallery.di.k.a
        public final k.a c(com.avito.android.analytics.screens.r rVar) {
            this.f216919d = rVar;
            return this;
        }

        @Override // com.avito.android.photo_gallery.di.k.a
        public final k.a d(LegacyPhotoGalleryActivity legacyPhotoGalleryActivity) {
            this.f216916a = legacyPhotoGalleryActivity;
            return this;
        }

        @Override // com.avito.android.photo_gallery.di.k.a
        public final k.a e(Resources resources) {
            this.f216917b = resources;
            return this;
        }

        @Override // com.avito.android.photo_gallery.di.k.a
        public final k.a f(C22977J c22977j) {
            this.f216925j = c22977j;
            return this;
        }

        @Override // com.avito.android.photo_gallery.di.k.a
        public final k.a g(S0 s02) {
            this.f216924i = s02;
            return this;
        }

        @Override // com.avito.android.photo_gallery.di.k.a
        public final k.a h(TreeClickStreamParent treeClickStreamParent) {
            this.f216918c = treeClickStreamParent;
            return this;
        }

        @Override // com.avito.android.photo_gallery.di.k.a
        public final k.a i(Kundle kundle) {
            this.f216921f = kundle;
            return this;
        }

        @Override // com.avito.android.photo_gallery.di.k.a
        public final k.a s() {
            this.f216920e = BannerPageSource.f87779e;
            return this;
        }
    }

    /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
    /* renamed from: com.avito.android.photo_gallery.di.b$c */
    public static final class c implements com.avito.android.photo_gallery.di.k {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deal_confirmation.d> f216926A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f216927B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<SK0.b> f216928C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<W9.c> f216929D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<ProgressInfoToastBarPresenter> f216930E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<Application> f216931F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28262a> f216932G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_core.safedeal.trust_factors.a> f216933H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deep_linking.x> f216934I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<C43617a> f216935J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.credits.installments.d> f216936K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_core.price_with_delivery.c> f216937L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC49101b> f216938M;

        /* renamed from: N, reason: collision with root package name */
        public final G f216939N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.l f216940O;

        /* renamed from: P, reason: collision with root package name */
        public final com.avito.android.delayed_ux_feedback.g f216941P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<Cd.D> f216942Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<R0> f216943R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14060a> f216944S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.progress_info_toast_bar.interactor.g> f216945T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28265d> f216946U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35945t1<String>> f216947V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.l f216948W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC22983P> f216949X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<H> f216950Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28499v> f216951Z;

        /* renamed from: a, reason: collision with root package name */
        public final C f216952a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28501x> f216953a0;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f216954b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.screens.o> f216955b0;

        /* renamed from: c, reason: collision with root package name */
        public final Resources f216956c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<W70.f> f216957c0;

        /* renamed from: d, reason: collision with root package name */
        public final T f216958d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<Activity> f216959d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<C29640d> f216960e;

        /* renamed from: e0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.lib.deprecated_design.dialog.a> f216961e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<B2> f216962f;

        /* renamed from: f0, reason: collision with root package name */
        public final X7.c f216963f0;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f216964g;

        /* renamed from: g0, reason: collision with root package name */
        public final dagger.internal.u<FromPageSource> f216965g0;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<l90.n> f216966h;

        /* renamed from: h0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_collection_toast.c> f216967h0;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<E> f216968i;

        /* renamed from: i0, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC15558a> f216969i0;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.analytics.provider.e> f216970j;

        /* renamed from: j0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_core.analytics.sharing.a> f216971j0;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f216972k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.z> f216973l;

        /* renamed from: m, reason: collision with root package name */
        public final c8.f f216974m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_core.analytics.a> f216975n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<WL.a> f216976o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<MessengerApi> f216977p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f216978q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.advert_core.messenger.a> f216979r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<Locale> f216980s;

        /* renamed from: t, reason: collision with root package name */
        public final C35865p f216981t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<SourceScreen> f216982u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC34398y> f216983v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deal_confirmation.a> f216984w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f216985x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.l f216986y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f216987z;

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$a */
        public static final class a implements dagger.internal.u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final C f216988a;

            public a(C c12) {
                this.f216988a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f216988a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$b, reason: collision with other inner class name */
        public static final class C6497b implements dagger.internal.u<C29640d> {

            /* renamed from: a, reason: collision with root package name */
            public final C f216989a;

            public C6497b(C c12) {
                this.f216989a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f216989a.Q();
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$c, reason: collision with other inner class name */
        public static final class C6498c implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final C f216990a;

            public C6498c(C c12) {
                this.f216990a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f216990a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$d */
        public static final class d implements dagger.internal.u<InterfaceC49101b> {

            /* renamed from: a, reason: collision with root package name */
            public final C f216991a;

            public d(C c12) {
                this.f216991a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f216991a.G();
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$e */
        public static final class e implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final C f216992a;

            public e(C c12) {
                this.f216992a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f216992a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$f */
        public static final class f implements dagger.internal.u<InterfaceC14060a> {

            /* renamed from: a, reason: collision with root package name */
            public final C f216993a;

            public f(C c12) {
                this.f216993a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14060a interfaceC14060aK1 = this.f216993a.k1();
                dagger.internal.t.c(interfaceC14060aK1);
                return interfaceC14060aK1;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$g */
        public static final class g implements dagger.internal.u<C43617a> {

            /* renamed from: a, reason: collision with root package name */
            public final C f216994a;

            public g(C c12) {
                this.f216994a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f216994a.C0();
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$h */
        public static final class h implements dagger.internal.u<MessengerApi> {

            /* renamed from: a, reason: collision with root package name */
            public final C f216995a;

            public h(C c12) {
                this.f216995a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f216995a.K3();
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$i */
        public static final class i implements dagger.internal.u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final C f216996a;

            public i(C c12) {
                this.f216996a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarP = this.f216996a.p();
                dagger.internal.t.c(bVarP);
                return bVarP;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$j */
        public static final class j implements dagger.internal.u<WL.a> {

            /* renamed from: a, reason: collision with root package name */
            public final C f216997a;

            public j(C c12) {
                this.f216997a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                WL.a aVarA1 = this.f216997a.a1();
                dagger.internal.t.c(aVarA1);
                return aVarA1;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$k */
        public static final class k implements dagger.internal.u<InterfaceC15558a> {

            /* renamed from: a, reason: collision with root package name */
            public final C f216998a;

            public k(C c12) {
                this.f216998a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC15558a interfaceC15558aU1 = this.f216998a.U1();
                dagger.internal.t.c(interfaceC15558aU1);
                return interfaceC15558aU1;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$l */
        public static final class l implements dagger.internal.u<InterfaceC34398y> {

            /* renamed from: a, reason: collision with root package name */
            public final C f216999a;

            public l(C c12) {
                this.f216999a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34398y interfaceC34398yL2 = this.f216999a.l2();
                dagger.internal.t.c(interfaceC34398yL2);
                return interfaceC34398yL2;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$m */
        public static final class m implements dagger.internal.u<com.avito.android.deep_linking.x> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217000a;

            public m(C c12) {
                this.f217000a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deep_linking.x xVarT = this.f217000a.t();
                dagger.internal.t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$n */
        public static final class n implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f217001a;

            public n(cv.b bVar) {
                this.f217001a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f217001a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$o */
        public static final class o implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217002a;

            public o(C c12) {
                this.f217002a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f217002a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$p */
        public static final class p implements dagger.internal.u<com.avito.android.credits.installments.d> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217003a;

            public p(C c12) {
                this.f217003a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.credits.installments.d dVarV3 = this.f217003a.v3();
                dagger.internal.t.c(dVarV3);
                return dVarV3;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$q */
        public static final class q implements dagger.internal.u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217004a;

            public q(C c12) {
                this.f217004a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f217004a.locale();
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$r */
        public static final class r implements dagger.internal.u<com.avito.android.permissions.z> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217005a;

            public r(C c12) {
                this.f217005a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.permissions.z zVarA = this.f217005a.A();
                dagger.internal.t.c(zVarA);
                return zVarA;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$s */
        public static final class s implements dagger.internal.u<com.avito.android.advert_core.price_with_delivery.c> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217006a;

            public s(C c12) {
                this.f217006a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.advert_core.price_with_delivery.c cVarZ2 = this.f217006a.Z2();
                dagger.internal.t.c(cVarZ2);
                return cVarZ2;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$t */
        public static final class t implements dagger.internal.u<l90.n> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217007a;

            public t(C c12) {
                this.f217007a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                l90.n nVarE1 = this.f217007a.e1();
                dagger.internal.t.c(nVarE1);
                return nVarE1;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$u */
        public static final class u implements dagger.internal.u<ProgressInfoToastBarPresenter> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217008a;

            public u(C c12) {
                this.f217008a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f217008a.s1();
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$v */
        public static final class v implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217009a;

            public v(C c12) {
                this.f217009a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f217009a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$w */
        public static final class w implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217010a;

            public w(C c12) {
                this.f217010a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f217010a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$x */
        public static final class x implements dagger.internal.u<B2> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217011a;

            public x(C c12) {
                this.f217011a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f217011a.D();
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$y */
        public static final class y implements dagger.internal.u<com.avito.android.analytics.provider.e> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217012a;

            public y(C c12) {
                this.f217012a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f217012a.Z0();
            }
        }

        /* compiled from: DaggerLegacyPhotoGalleryActivityComponent.java */
        /* renamed from: com.avito.android.photo_gallery.di.b$c$z */
        public static final class z implements dagger.internal.u<com.avito.android.progress_info_toast_bar.interactor.g> {

            /* renamed from: a, reason: collision with root package name */
            public final C f217013a;

            public z(C c12) {
                this.f217013a = c12;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.progress_info_toast_bar.interactor.g gVarO3 = this.f217013a.O3();
                dagger.internal.t.c(gVarO3);
                return gVarO3;
            }
        }

        public c(C c12, cv.b bVar, androidx.view.n nVar, Resources resources, TreeClickStreamParent treeClickStreamParent, com.avito.android.analytics.screens.r rVar, BannerPageSource bannerPageSource, Kundle kundle, S0 s02, T t12, a aVar) {
            this.f216952a = c12;
            this.f216954b = bVar;
            this.f216956c = resources;
            this.f216958d = t12;
            this.f216960e = new C6497b(c12);
            this.f216962f = new x(c12);
            this.f216964g = new C6498c(c12);
            this.f216966h = new t(c12);
            this.f216968i = new a(c12);
            this.f216970j = new y(c12);
            this.f216972k = dagger.internal.l.b(treeClickStreamParent);
            this.f216973l = new r(c12);
            dagger.internal.u<InterfaceC28373a> uVar = this.f216964g;
            this.f216974m = new c8.f(uVar);
            com.avito.android.advertising.di.y yVarA = com.avito.android.advertising.di.y.a();
            dagger.internal.u<E> uVar2 = this.f216968i;
            dagger.internal.u<com.avito.android.analytics.provider.e> uVar3 = this.f216970j;
            dagger.internal.l lVar = this.f216972k;
            dagger.internal.u<C29640d> uVar4 = this.f216960e;
            dagger.internal.u<com.avito.android.permissions.z> uVar5 = this.f216973l;
            com.avito.android.advert_core.offers.analytics.e eVarA = com.avito.android.advert_core.offers.analytics.e.a();
            com.avito.android.photo_gallery.di.q qVar = q.a.f217066a;
            this.f216975n = dagger.internal.g.d(new com.avito.android.photo_gallery.di.o(uVar, yVarA, uVar2, uVar3, lVar, uVar4, uVar5, eVarA, qVar, this.f216974m));
            this.f216976o = new j(c12);
            h hVar = new h(c12);
            v vVar = new v(c12);
            this.f216978q = vVar;
            this.f216979r = dagger.internal.g.d(new com.avito.android.photo_gallery.di.p(hVar, this.f216968i, vVar));
            this.f216981t = new C35865p(new q(c12));
            this.f216982u = dagger.internal.g.d(v.a.f217071a);
            this.f216984w = dagger.internal.B.a(new com.avito.android.deal_confirmation.c(new l(c12), this.f216978q));
            this.f216985x = new w(c12);
            dagger.internal.l lVarA = dagger.internal.l.a(rVar);
            this.f216986y = lVarA;
            this.f216987z = dagger.internal.B.a(new C50000c(lVarA, this.f216985x));
            this.f216926A = dagger.internal.B.a(new com.avito.android.deal_confirmation.i(dagger.internal.l.b(kundle), this.f216984w, this.f216978q, this.f216968i, this.f216987z));
            this.f216927B = new n(bVar);
            i iVar = new i(c12);
            this.f216928C = iVar;
            this.f216929D = dagger.internal.g.d(new W9.e(iVar));
            this.f216930E = new u(c12);
            this.f216932G = dagger.internal.g.d(new com.avito.android.photo_gallery.di.m(new e(c12)));
            dagger.internal.u<com.avito.android.advert_core.safedeal.trust_factors.a> uVarD = dagger.internal.g.d(u.a.f217070a);
            this.f216933H = uVarD;
            m mVar = new m(c12);
            g gVar = new g(c12);
            this.f216935J = gVar;
            this.f216939N = new G(uVarD, mVar, gVar, new d(c12), this.f216932G, this.f216960e, new p(c12), new s(c12));
            this.f216940O = dagger.internal.l.a(s02);
            this.f216941P = new com.avito.android.delayed_ux_feedback.g(this.f216928C, this.f216935J);
            q.b bVarA = dagger.internal.q.a(1);
            bVarA.a(com.avito.android.delayed_ux_feedback.f.class, this.f216941P);
            dagger.internal.u<Cd.D> uVarA = dagger.internal.B.a(new F(bVarA.b()));
            this.f216942Q = uVarA;
            C49686b c49686b = new C49686b(uVarA, this.f216940O);
            o oVar = new o(c12);
            this.f216943R = oVar;
            this.f216946U = dagger.internal.g.d(new com.avito.android.photo_gallery.di.n(this.f216960e, this.f216962f, this.f216964g, this.f216966h, this.f216975n, this.f216976o, this.f216979r, this.f216968i, this.f216981t, this.f216978q, this.f216982u, this.f216926A, this.f216927B, this.f216929D, this.f216930E, this.f216939N, c49686b, oVar, this.f216933H, qVar, new f(c12), new z(c12)));
            this.f216947V = dagger.internal.g.d(new com.avito.android.photo_gallery.di.t(S3.f318734a));
            dagger.internal.l lVarA2 = dagger.internal.l.a(nVar);
            this.f216948W = lVarA2;
            this.f216949X = dagger.internal.g.d(lVarA2);
            dagger.internal.u<H> uVarD2 = dagger.internal.g.d(new A(this.f216986y, this.f216985x));
            this.f216950Y = uVarD2;
            this.f216951Z = dagger.internal.g.d(new com.avito.android.photo_gallery.di.x(uVarD2));
            this.f216953a0 = dagger.internal.g.d(new com.avito.android.photo_gallery.di.z(this.f216950Y));
            dagger.internal.u<com.avito.android.analytics.screens.o> uVarD3 = dagger.internal.g.d(new com.avito.android.photo_gallery.di.y(this.f216950Y));
            this.f216955b0 = uVarD3;
            this.f216957c0 = dagger.internal.g.d(new W70.h(uVarD3, this.f216949X, this.f216951Z, this.f216953a0));
            dagger.internal.u<Activity> uVarD4 = dagger.internal.g.d(this.f216948W);
            this.f216959d0 = uVarD4;
            this.f216961e0 = dagger.internal.B.a(new KU.b(uVarD4));
            this.f216963f0 = new X7.c(this.f216964g);
            dagger.internal.u<FromPageSource> uVarD5 = dagger.internal.g.d(r.a.f217067a);
            this.f216965g0 = uVarD5;
            this.f216967h0 = dagger.internal.B.a(new com.avito.android.advert_collection_toast.e(this.f216968i, this.f216927B, this.f216963f0, uVarD5, this.f216943R));
            this.f216969i0 = new k(c12);
            this.f216971j0 = dagger.internal.B.a(new com.avito.android.advert_core.analytics.sharing.e(this.f216964g, this.f216968i, this.f216978q, this.f216960e));
        }

        @Override // com.avito.android.photo_gallery.di.k
        public final void a(LegacyPhotoGalleryActivity legacyPhotoGalleryActivity) {
            C c12 = this.f216952a;
            legacyPhotoGalleryActivity.f216577t = c12.h();
            cv.b bVar = this.f216954b;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            dagger.internal.t.c(aVarU4);
            legacyPhotoGalleryActivity.f216578u = aVarU4;
            legacyPhotoGalleryActivity.f216579v = c12.s4();
            legacyPhotoGalleryActivity.f216580w = c12.G6();
            legacyPhotoGalleryActivity.f216581x = c12.Nj();
            legacyPhotoGalleryActivity.f216582y = c12.x();
            legacyPhotoGalleryActivity.f216583z = c12.A3();
            legacyPhotoGalleryActivity.f216532A = c12.Q();
            InterfaceC28373a interfaceC28373aA = c12.a();
            dagger.internal.t.c(interfaceC28373aA);
            legacyPhotoGalleryActivity.f216533B = interfaceC28373aA;
            legacyPhotoGalleryActivity.f216534C = this.f216946U.get();
            legacyPhotoGalleryActivity.f216535D = this.f216947V.get();
            InterfaceC35741a1 interfaceC35741a1N = c12.n();
            dagger.internal.t.c(interfaceC35741a1N);
            legacyPhotoGalleryActivity.f216536E = interfaceC35741a1N;
            legacyPhotoGalleryActivity.f216537F = this.f216957c0.get();
            com.avito.android.autoteka.data.a aVarT1 = c12.T1();
            dagger.internal.t.c(aVarT1);
            legacyPhotoGalleryActivity.f216538G = aVarT1;
            legacyPhotoGalleryActivity.f216539H = this.f216961e0.get();
            legacyPhotoGalleryActivity.f216540I = this.f216926A.get();
            R0 r0C = c12.c();
            dagger.internal.t.c(r0C);
            legacyPhotoGalleryActivity.f216541J = r0C;
            Activity activity = this.f216959d0.get();
            E eI2 = c12.i();
            dagger.internal.t.c(eI2);
            com.avito.android.advert_collection_toast.c cVar = this.f216967h0.get();
            InterfaceC28373a interfaceC28373aA2 = c12.a();
            dagger.internal.t.c(interfaceC28373aA2);
            InterfaceC19542a interfaceC19542aX = c12.x();
            h31.e eVarA = dagger.internal.g.a(this.f216969i0);
            com.avito.android.toggle_comparison_state.c cVar2 = new com.avito.android.toggle_comparison_state.c();
            InterfaceC35745a5 interfaceC35745a5D = c12.d();
            dagger.internal.t.c(interfaceC35745a5D);
            com.avito.android.toggle_comparison_state.l lVar = new com.avito.android.toggle_comparison_state.l(new com.avito.android.toggle_comparison_state.i(eVarA, cVar2, interfaceC35745a5D), c12.e2());
            com.avito.android.deeplink_handler.handler.composite.a aVarU42 = bVar.u4();
            dagger.internal.t.c(aVarU42);
            R0 r0C2 = c12.c();
            dagger.internal.t.c(r0C2);
            legacyPhotoGalleryActivity.f216542K = new com.avito.android.photo_gallery.nav_bar.a(activity, eI2, cVar, interfaceC28373aA2, interfaceC19542aX, lVar, aVarU42, r0C2, c12.P0(), c12.Q(), c12.h(), this.f216956c, this.f216958d, this.f216971j0.get(), c12.Z0());
            legacyPhotoGalleryActivity.f216543L = this.f216967h0.get();
            legacyPhotoGalleryActivity.f216544M = c12.G();
        }
    }

    public static k.a a() {
        return new C6496b();
    }
}
