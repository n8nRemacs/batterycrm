package com.avito.android.social_management.di;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import bx0.C25735b;
import bx0.C25736c;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30065i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.social.C35011c;
import com.avito.android.social.C35019k;
import com.avito.android.social.C35033z;
import com.avito.android.social.D;
import com.avito.android.social.InterfaceC35009a;
import com.avito.android.social.InterfaceC35013e;
import com.avito.android.social.InterfaceC35017i;
import com.avito.android.social.InterfaceC35029v;
import com.avito.android.social.S;
import com.avito.android.social.V;
import com.avito.android.social.X;
import com.avito.android.social.Z;
import com.avito.android.social_management.C35050q;
import com.avito.android.social_management.InterfaceC35044k;
import com.avito.android.social_management.K;
import com.avito.android.social_management.M;
import com.avito.android.social_management.O;
import com.avito.android.social_management.SocialManagementActivity;
import com.avito.android.social_management.adapter.SocialItem;
import com.avito.android.social_management.di.e;
import com.avito.android.social_management.di.h;
import com.avito.android.social_management.di.l;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import cx0.C39432b;
import cx0.C39433c;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import dx0.C39823b;
import dx0.C39824c;
import fx0.C40494b;
import fx0.C40495c;
import hD.C40806a;
import hx0.InterfaceC41187a;
import java.util.List;
import java.util.Set;
import jx0.InterfaceC42441a;
import zz.C50648b;
import zz.C50650d;

/* compiled from: DaggerSocialManagementComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: DaggerSocialManagementComponent.java */
    /* renamed from: com.avito.android.social_management.di.b$b, reason: collision with other inner class name */
    public static final class C8507b implements e.a {
        public C8507b() {
        }

        @Override // com.avito.android.social_management.di.e.a
        public final e a(f fVar, InterfaceC39417a interfaceC39417a, SocialManagementActivity socialManagementActivity, Resources resources, Kundle kundle, com.avito.android.analytics.screens.r rVar) {
            interfaceC39417a.getClass();
            return new c(fVar, interfaceC39417a, socialManagementActivity, resources, kundle, rVar, null);
        }
    }

    /* compiled from: DaggerSocialManagementComponent.java */
    public static final class c implements com.avito.android.social_management.di.e {

        /* renamed from: A, reason: collision with root package name */
        public final u<InterfaceC42441a> f284582A;

        /* renamed from: B, reason: collision with root package name */
        public final u<InterfaceC35044k> f284583B;

        /* renamed from: C, reason: collision with root package name */
        public final u<Context> f284584C;

        /* renamed from: D, reason: collision with root package name */
        public final u<InterfaceC35029v> f284585D;

        /* renamed from: E, reason: collision with root package name */
        public final u<X> f284586E;

        /* renamed from: F, reason: collision with root package name */
        public final u<InterfaceC35017i> f284587F;

        /* renamed from: G, reason: collision with root package name */
        public final u<InterfaceC35009a> f284588G;

        /* renamed from: H, reason: collision with root package name */
        public final u<R0> f284589H;

        /* renamed from: I, reason: collision with root package name */
        public final u<S> f284590I;

        /* renamed from: J, reason: collision with root package name */
        public final u<InterfaceC35013e> f284591J;

        /* renamed from: K, reason: collision with root package name */
        public final u<C40806a> f284592K;

        /* renamed from: L, reason: collision with root package name */
        public final u<List<D>> f284593L;

        /* renamed from: M, reason: collision with root package name */
        public final u<List<D>> f284594M;

        /* renamed from: N, reason: collision with root package name */
        public final u<InterfaceC35741a1> f284595N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.l f284596O;

        /* renamed from: P, reason: collision with root package name */
        public final u<C50648b> f284597P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.l f284598Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f284599R;

        /* renamed from: S, reason: collision with root package name */
        public final u<InterfaceC30274a> f284600S;

        /* renamed from: T, reason: collision with root package name */
        public final u<M> f284601T;

        /* renamed from: U, reason: collision with root package name */
        public final u<InterfaceC28373a> f284602U;

        /* renamed from: V, reason: collision with root package name */
        public final u<com.avito.android.social.M> f284603V;

        /* renamed from: W, reason: collision with root package name */
        public final u<InterfaceC28481c> f284604W;

        /* renamed from: X, reason: collision with root package name */
        public final u<C28478k> f284605X;

        /* renamed from: Y, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f284606Y;

        /* renamed from: Z, reason: collision with root package name */
        public final u<com.avito.android.social_management.r> f284607Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.social_management.di.f f284608a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f284609b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.f f284610c = new dagger.internal.f();

        /* renamed from: d, reason: collision with root package name */
        public final u<com.jakewharton.rxrelay3.c<SocialItem>> f284611d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.social_management.adapter.connected.b> f284612e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f284613f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.social_management.adapter.header.b> f284614g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f284615h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.social_management.adapter.available.b> f284616i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f284617j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.social_management.adapter.vk_group.c> f284618k;

        /* renamed from: l, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f284619l;

        /* renamed from: m, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f284620m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.jakewharton.rxrelay3.c<com.avito.android.social_management.adapter.notification.j>> f284621n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.social_management.adapter.notification.c> f284622o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f284623p;

        /* renamed from: q, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f284624q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f284625r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f284626s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.b> f284627t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.f> f284628u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f284629v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.c> f284630w;

        /* renamed from: x, reason: collision with root package name */
        public final u<InterfaceC34401z0> f284631x;

        /* renamed from: y, reason: collision with root package name */
        public final u<InterfaceC41187a> f284632y;

        /* renamed from: z, reason: collision with root package name */
        public final u<InterfaceC35745a5> f284633z;

        /* compiled from: DaggerSocialManagementComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.social_management.di.f f284634a;

            public a(com.avito.android.social_management.di.f fVar) {
                this.f284634a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f284634a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSocialManagementComponent.java */
        /* renamed from: com.avito.android.social_management.di.b$c$b, reason: collision with other inner class name */
        public static final class C8508b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.social_management.di.f f284635a;

            public C8508b(com.avito.android.social_management.di.f fVar) {
                this.f284635a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f284635a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerSocialManagementComponent.java */
        /* renamed from: com.avito.android.social_management.di.b$c$c, reason: collision with other inner class name */
        public static final class C8509c implements u<C40806a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.social_management.di.f f284636a;

            public C8509c(com.avito.android.social_management.di.f fVar) {
                this.f284636a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f284636a.R();
            }
        }

        /* compiled from: DaggerSocialManagementComponent.java */
        public static final class d implements u<InterfaceC35013e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.social_management.di.f f284637a;

            public d(com.avito.android.social_management.di.f fVar) {
                this.f284637a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35013e interfaceC35013eG3 = this.f284637a.g3();
                t.c(interfaceC35013eG3);
                return interfaceC35013eG3;
            }
        }

        /* compiled from: DaggerSocialManagementComponent.java */
        public static final class e implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.social_management.di.f f284638a;

            public e(com.avito.android.social_management.di.f fVar) {
                this.f284638a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f284638a.g();
            }
        }

        /* compiled from: DaggerSocialManagementComponent.java */
        public static final class f implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.social_management.di.f f284639a;

            public f(com.avito.android.social_management.di.f fVar) {
                this.f284639a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0I0 = this.f284639a.i0();
                t.c(r0I0);
                return r0I0;
            }
        }

        /* compiled from: DaggerSocialManagementComponent.java */
        public static final class g implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.social_management.di.f f284640a;

            public g(com.avito.android.social_management.di.f fVar) {
                this.f284640a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f284640a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerSocialManagementComponent.java */
        public static final class h implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.social_management.di.f f284641a;

            public h(com.avito.android.social_management.di.f fVar) {
                this.f284641a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f284641a.B();
                t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        /* compiled from: DaggerSocialManagementComponent.java */
        public static final class i implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.social_management.di.f f284642a;

            public i(com.avito.android.social_management.di.f fVar) {
                this.f284642a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f284642a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerSocialManagementComponent.java */
        public static final class j implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.social_management.di.f f284643a;

            public j(com.avito.android.social_management.di.f fVar) {
                this.f284643a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f284643a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerSocialManagementComponent.java */
        public static final class k implements u<InterfaceC41187a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.social_management.di.f f284644a;

            public k(com.avito.android.social_management.di.f fVar) {
                this.f284644a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41187a interfaceC41187aWa = this.f284644a.wa();
                t.c(interfaceC41187aWa);
                return interfaceC41187aWa;
            }
        }

        /* compiled from: DaggerSocialManagementComponent.java */
        public static final class l implements u<InterfaceC42441a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.social_management.di.f f284645a;

            public l(com.avito.android.social_management.di.f fVar) {
                this.f284645a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f284645a.wh();
            }
        }

        /* compiled from: DaggerSocialManagementComponent.java */
        public static final class m implements u<com.avito.android.social.M> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.social_management.di.f f284646a;

            public m(com.avito.android.social_management.di.f fVar) {
                this.f284646a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.social.M mR2 = this.f284646a.R2();
                t.c(mR2);
                return mR2;
            }
        }

        public c(com.avito.android.social_management.di.f fVar, cv.b bVar, Activity activity, Resources resources, Kundle kundle, com.avito.android.analytics.screens.r rVar, a aVar) {
            this.f284608a = fVar;
            this.f284609b = bVar;
            u<com.jakewharton.rxrelay3.c<SocialItem>> uVarD = dagger.internal.g.d(h.a.f284648a);
            this.f284611d = uVarD;
            u<com.avito.android.social_management.adapter.connected.b> uVarD2 = dagger.internal.g.d(new C39433c(uVarD));
            this.f284612e = uVarD2;
            this.f284613f = dagger.internal.g.d(new C39432b(uVarD2));
            u<com.avito.android.social_management.adapter.header.b> uVarD3 = dagger.internal.g.d(new C39824c(this.f284611d));
            this.f284614g = uVarD3;
            this.f284615h = dagger.internal.g.d(new C39823b(uVarD3));
            u<com.avito.android.social_management.adapter.available.b> uVarD4 = dagger.internal.g.d(new C25736c(this.f284611d));
            this.f284616i = uVarD4;
            this.f284617j = dagger.internal.g.d(new C25735b(uVarD4));
            u<com.avito.android.social_management.adapter.vk_group.c> uVarD5 = dagger.internal.g.d(new C40495c(this.f284611d));
            this.f284618k = uVarD5;
            this.f284619l = dagger.internal.g.d(new C40494b(uVarD5));
            this.f284620m = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.jakewharton.rxrelay3.c<com.avito.android.social_management.adapter.notification.j>> uVarD6 = dagger.internal.g.d(l.a.f284659a);
            this.f284621n = uVarD6;
            u<com.avito.android.social_management.adapter.notification.c> uVarD7 = dagger.internal.g.d(new com.avito.android.social_management.adapter.notification.g(uVarD6));
            this.f284622o = uVarD7;
            this.f284624q = dagger.internal.g.d(new com.avito.android.social_management.adapter.notification.b(uVarD7, new C8508b(fVar)));
            A.b bVarA = A.a(5, 1);
            u<TV0.b<?, ?>> uVar = this.f284613f;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f284615h);
            list.add(this.f284617j);
            list.add(this.f284619l);
            bVarA.f393938b.add(this.f284620m);
            list.add(this.f284624q);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f284625r = uVarK;
            this.f284626s = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f284627t = dagger.internal.g.d(com.avito.android.social_management.adapter.b.a());
            u<com.avito.android.recycler.data_aware.f> uVarD8 = dagger.internal.g.d(com.avito.android.social_management.adapter.d.a());
            this.f284628u = uVarD8;
            u<com.avito.android.recycler.data_aware.e> uVarD9 = dagger.internal.g.d(new com.avito.android.social_management.di.k(uVarD8, this.f284627t));
            this.f284629v = uVarD9;
            u<com.avito.android.recycler.data_aware.c> uVarD10 = dagger.internal.g.d(new com.avito.android.social_management.di.j(this.f284610c, uVarD9, this.f284626s));
            this.f284630w = uVarD10;
            dagger.internal.f.a(this.f284610c, dagger.internal.g.d(new n(uVarD10, this.f284625r)));
            h hVar = new h(fVar);
            k kVar = new k(fVar);
            i iVar = new i(fVar);
            this.f284633z = iVar;
            this.f284583B = dagger.internal.g.d(new C35050q(hVar, kVar, iVar, new l(fVar)));
            e eVar = new e(fVar);
            this.f284584C = eVar;
            this.f284585D = dagger.internal.g.d(new C35033z(eVar));
            this.f284586E = B.a(Z.a());
            this.f284587F = B.a(new C35019k(this.f284584C));
            this.f284588G = B.a(C35011c.a());
            u<S> uVarA = B.a(new V(new f(fVar)));
            this.f284590I = uVarA;
            d dVar = new d(fVar);
            this.f284591J = dVar;
            C8509c c8509c = new C8509c(fVar);
            this.f284592K = c8509c;
            this.f284593L = dagger.internal.g.d(new o(uVarA, this.f284585D, this.f284586E, this.f284587F, this.f284588G, dVar, c8509c));
            this.f284594M = dagger.internal.g.d(new com.avito.android.social_management.di.i(this.f284585D, this.f284586E, this.f284590I, this.f284591J, this.f284592K));
            this.f284595N = new g(fVar);
            dagger.internal.l lVarA = dagger.internal.l.a(resources);
            this.f284596O = lVarA;
            this.f284597P = B.a(new C50650d(this.f284595N, lVarA));
            dagger.internal.l lVarA2 = dagger.internal.l.a(activity);
            this.f284598Q = lVarA2;
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA2 = B.a(new KU.b(lVarA2));
            this.f284599R = uVarA2;
            this.f284600S = B.a(new com.avito.android.dialog.o(uVarA2, this.f284598Q));
            this.f284601T = dagger.internal.g.d(new O(this.f284596O));
            this.f284602U = new a(fVar);
            this.f284603V = new m(fVar);
            this.f284604W = new j(fVar);
            u<C28478k> uVarD11 = dagger.internal.g.d(new com.avito.android.social_management.di.m(dagger.internal.l.a(rVar)));
            this.f284605X = uVarD11;
            this.f284606Y = dagger.internal.g.d(new C30065i(this.f284604W, uVarD11));
            this.f284607Z = dagger.internal.g.d(new K(this.f284583B, this.f284593L, this.f284594M, this.f284630w, this.f284611d, this.f284621n, this.f284597P, this.f284600S, this.f284601T, this.f284602U, this.f284633z, this.f284603V, this.f284606Y, dagger.internal.l.b(kundle)));
        }

        @Override // com.avito.android.social_management.di.e
        public final void a(SocialManagementActivity socialManagementActivity) {
            com.avito.android.social_management.di.f fVar = this.f284608a;
            socialManagementActivity.f284467m = fVar.t0();
            socialManagementActivity.f284468n = (com.avito.konveyor.adapter.j) this.f284610c.get();
            socialManagementActivity.f284469o = this.f284607Z.get();
            InterfaceC28373a interfaceC28373aA = fVar.a();
            t.c(interfaceC28373aA);
            socialManagementActivity.f284470p = interfaceC28373aA;
            com.avito.android.social.M mR2 = fVar.R2();
            t.c(mR2);
            socialManagementActivity.f284471q = mR2;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f284609b.u4();
            t.c(aVarU4);
            socialManagementActivity.f284472r = aVarU4;
            socialManagementActivity.f284473s = this.f284606Y.get();
        }
    }

    public static e.a a() {
        return new C8507b();
    }
}
