package com.avito.android.mall.di;

import Cj.InterfaceC13310a;
import android.app.Activity;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.Z0;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.bxcontent.BxContentIntentFactory;
import com.avito.android.deep_linking.x;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.C31175s;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.C31180x;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.H;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31158a;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31164g;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.P;
import com.avito.android.mall.MallFragment;
import com.avito.android.mall.di.b;
import com.avito.android.mall.di.e;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl_Factory;
import com.avito.android.remote.model.SuggestParamsConverter;
import com.avito.android.remote.model.SuggestParamsConverterImpl_Factory;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import mU.C44012a;
import nU.C44333c;
import nU.InterfaceC44331a;
import ur.InterfaceC49101b;

/* compiled from: DaggerMallComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerMallComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.mall.di.c f184270a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f184271b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC44331a f184272c;

        /* renamed from: d, reason: collision with root package name */
        public MallFragment f184273d;

        /* renamed from: e, reason: collision with root package name */
        public ActivityC22955m f184274e;

        public b() {
        }

        @Override // com.avito.android.mall.di.b.a
        public final b.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f184271b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.mall.di.b.a
        public final b.a b(InterfaceC44331a interfaceC44331a) {
            this.f184272c = interfaceC44331a;
            return this;
        }

        @Override // com.avito.android.mall.di.b.a
        public final com.avito.android.mall.di.b build() {
            t.a(com.avito.android.mall.di.c.class, this.f184270a);
            t.a(cv.b.class, this.f184271b);
            t.a(InterfaceC44331a.class, this.f184272c);
            t.a(Fragment.class, this.f184273d);
            t.a(Activity.class, this.f184274e);
            return new c(this.f184271b, this.f184270a, this.f184272c, this.f184273d, this.f184274e, null);
        }

        @Override // com.avito.android.mall.di.b.a
        public final b.a c(ActivityC22955m activityC22955m) {
            this.f184274e = activityC22955m;
            return this;
        }

        @Override // com.avito.android.mall.di.b.a
        public final b.a d(MallFragment mallFragment) {
            this.f184273d = mallFragment;
            return this;
        }

        @Override // com.avito.android.mall.di.b.a
        public final b.a e(com.avito.android.mall.di.c cVar) {
            this.f184270a = cVar;
            return this;
        }
    }

    /* compiled from: DaggerMallComponent.java */
    public static final class c implements com.avito.android.mall.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<R0> f184275A;

        /* renamed from: B, reason: collision with root package name */
        public final u<InterfaceC31164g> f184276B;

        /* renamed from: C, reason: collision with root package name */
        public final u<Z0> f184277C;

        /* renamed from: D, reason: collision with root package name */
        public final u<N> f184278D;

        /* renamed from: E, reason: collision with root package name */
        public final u<SuggestParamsConverter> f184279E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.search.m> f184280F;

        /* renamed from: G, reason: collision with root package name */
        public final u<LX.a> f184281G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.android.mall.webview.a> f184282H;

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC44331a f184283a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.mall.di.c f184284b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f184285c;

        /* renamed from: d, reason: collision with root package name */
        public final u<BxContentIntentFactory> f184286d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f184287e;

        /* renamed from: f, reason: collision with root package name */
        public final u<MX.a> f184288f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC35745a5> f184289g;

        /* renamed from: h, reason: collision with root package name */
        public final u<V0> f184290h;

        /* renamed from: i, reason: collision with root package name */
        public final u<SearchParamsConverter> f184291i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC49101b> f184292j;

        /* renamed from: k, reason: collision with root package name */
        public final u<x> f184293k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.search.h> f184294l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28373a> f184295m;

        /* renamed from: n, reason: collision with root package name */
        public final u<C44012a> f184296n;

        /* renamed from: o, reason: collision with root package name */
        public final u<KX.b> f184297o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.jakewharton.rxrelay3.c<LX.b>> f184298p;

        /* renamed from: q, reason: collision with root package name */
        public final u<Gson> f184299q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.mall.webview.b> f184300r;

        /* renamed from: s, reason: collision with root package name */
        public final u<P0.c> f184301s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.mall.viewmodel.a> f184302t;

        /* renamed from: u, reason: collision with root package name */
        public final u<T0> f184303u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC13310a> f184304v;

        /* renamed from: w, reason: collision with root package name */
        public final u<AK0.l> f184305w;

        /* renamed from: x, reason: collision with root package name */
        public final u<InterfaceC31158a> f184306x;

        /* renamed from: y, reason: collision with root package name */
        public final H f184307y;

        /* renamed from: z, reason: collision with root package name */
        public final u<E> f184308z;

        /* compiled from: DaggerMallComponent.java */
        /* renamed from: com.avito.android.mall.di.a$c$a, reason: collision with other inner class name */
        public static final class C5405a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44331a f184309a;

            public C5405a(InterfaceC44331a interfaceC44331a) {
                this.f184309a = interfaceC44331a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f184309a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerMallComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44331a f184310a;

            public b(InterfaceC44331a interfaceC44331a) {
                this.f184310a = interfaceC44331a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f184310a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerMallComponent.java */
        /* renamed from: com.avito.android.mall.di.a$c$c, reason: collision with other inner class name */
        public static final class C5406c implements u<InterfaceC49101b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mall.di.c f184311a;

            public C5406c(com.avito.android.mall.di.c cVar) {
                this.f184311a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f184311a.G();
            }
        }

        /* compiled from: DaggerMallComponent.java */
        public static final class d implements u<InterfaceC31164g> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44331a f184312a;

            public d(InterfaceC44331a interfaceC44331a) {
                this.f184312a = interfaceC44331a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC31164g interfaceC31164gVa = this.f184312a.va();
                t.c(interfaceC31164gVa);
                return interfaceC31164gVa;
            }
        }

        /* compiled from: DaggerMallComponent.java */
        public static final class e implements u<InterfaceC31158a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44331a f184313a;

            public e(InterfaceC44331a interfaceC44331a) {
                this.f184313a = interfaceC44331a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC31158a interfaceC31158aW7 = this.f184313a.W7();
                t.c(interfaceC31158aW7);
                return interfaceC31158aW7;
            }
        }

        /* compiled from: DaggerMallComponent.java */
        public static final class f implements u<C44012a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mall.di.c f184314a;

            public f(com.avito.android.mall.di.c cVar) {
                this.f184314a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f184314a.A5();
            }
        }

        /* compiled from: DaggerMallComponent.java */
        public static final class g implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mall.di.c f184315a;

            public g(com.avito.android.mall.di.c cVar) {
                this.f184315a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f184315a.t();
                t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerMallComponent.java */
        public static final class h implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f184316a;

            public h(cv.b bVar) {
                this.f184316a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f184316a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerMallComponent.java */
        public static final class i implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44331a f184317a;

            public i(InterfaceC44331a interfaceC44331a) {
                this.f184317a = interfaceC44331a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f184317a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerMallComponent.java */
        public static final class j implements u<InterfaceC13310a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44331a f184318a;

            public j(InterfaceC44331a interfaceC44331a) {
                this.f184318a = interfaceC44331a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13310a interfaceC13310aW9 = this.f184318a.w9();
                t.c(interfaceC13310aW9);
                return interfaceC13310aW9;
            }
        }

        /* compiled from: DaggerMallComponent.java */
        public static final class k implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mall.di.c f184319a;

            public k(com.avito.android.mall.di.c cVar) {
                this.f184319a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f184319a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerMallComponent.java */
        public static final class l implements u<Z0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44331a f184320a;

            public l(InterfaceC44331a interfaceC44331a) {
                this.f184320a = interfaceC44331a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f184320a.W();
            }
        }

        /* compiled from: DaggerMallComponent.java */
        public static final class m implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44331a f184321a;

            public m(InterfaceC44331a interfaceC44331a) {
                this.f184321a = interfaceC44331a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f184321a.r();
            }
        }

        /* compiled from: DaggerMallComponent.java */
        public static final class n implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44331a f184322a;

            public n(InterfaceC44331a interfaceC44331a) {
                this.f184322a = interfaceC44331a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f184322a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerMallComponent.java */
        public static final class o implements u<V0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mall.di.c f184323a;

            public o(com.avito.android.mall.di.c cVar) {
                this.f184323a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                V0 v0Z = this.f184323a.Z();
                t.c(v0Z);
                return v0Z;
            }
        }

        /* compiled from: DaggerMallComponent.java */
        public static final class p implements u<BxContentIntentFactory> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mall.di.c f184324a;

            public p(com.avito.android.mall.di.c cVar) {
                this.f184324a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f184324a.X4();
            }
        }

        public c(cv.b bVar, com.avito.android.mall.di.c cVar, InterfaceC44331a interfaceC44331a, Fragment fragment, Activity activity, C5404a c5404a) {
            this.f184283a = interfaceC44331a;
            this.f184284b = cVar;
            this.f184285c = dagger.internal.l.a(fragment);
            this.f184288f = dagger.internal.g.d(new MX.c(dagger.internal.l.a(activity), new p(cVar), new h(bVar)));
            this.f184289g = new n(interfaceC44331a);
            this.f184290h = new o(cVar);
            u<SearchParamsConverter> uVarD = dagger.internal.g.d(SearchParamsConverterImpl_Factory.create());
            this.f184291i = uVarD;
            C5406c c5406c = new C5406c(cVar);
            this.f184292j = c5406c;
            g gVar = new g(cVar);
            this.f184293k = gVar;
            this.f184294l = dagger.internal.g.d(new com.avito.android.search.k(uVarD, this.f184290h, this.f184289g, c5406c, gVar));
            this.f184297o = dagger.internal.g.d(new KX.d(new b(interfaceC44331a), new f(cVar)));
            this.f184298p = dagger.internal.g.d(e.a.f184326a);
            this.f184299q = new k(cVar);
            u<com.avito.android.mall.webview.b> uVarD2 = dagger.internal.g.d(com.avito.android.mall.webview.d.a());
            this.f184300r = uVarD2;
            u<MX.a> uVar = this.f184288f;
            u<InterfaceC35745a5> uVar2 = this.f184289g;
            u<com.avito.android.search.h> uVar3 = this.f184294l;
            u<KX.b> uVar4 = this.f184297o;
            u<P0.c> uVarD3 = dagger.internal.g.d(new com.avito.android.mall.viewmodel.c(uVarD2, uVar, uVar2, uVar3, uVar4, this.f184298p, this.f184293k, uVar4, this.f184299q));
            this.f184301s = uVarD3;
            this.f184302t = dagger.internal.g.d(new com.avito.android.mall.di.g(this.f184285c, uVarD3));
            this.f184303u = dagger.internal.g.d(this.f184285c);
            this.f184304v = new j(interfaceC44331a);
            H hA2 = H.a(new m(interfaceC44331a), new e(interfaceC44331a));
            this.f184307y = hA2;
            C5405a c5405a = new C5405a(interfaceC44331a);
            this.f184308z = c5405a;
            this.f184278D = B.a(C44333c.a(this.f184303u, P.a(this.f184289g, C31175s.a(C31180x.a(this.f184304v, this.f184289g, hA2, c5405a), this.f184307y, this.f184308z, new i(interfaceC44331a)), new d(interfaceC44331a), new l(interfaceC44331a))));
            u<SuggestParamsConverter> uVarD4 = dagger.internal.g.d(SuggestParamsConverterImpl_Factory.create(this.f184291i));
            this.f184279E = uVarD4;
            this.f184280F = dagger.internal.g.d(new com.avito.android.mall.suggests.d(uVarD4, this.f184290h, this.f184289g));
            this.f184281G = dagger.internal.g.d(new LX.d(this.f184298p));
            this.f184282H = dagger.internal.g.d(new com.avito.android.mall.di.f(this.f184298p, this.f184292j));
        }

        @Override // com.avito.android.mall.di.b
        public final void a(MallFragment mallFragment) {
            mallFragment.f184242v0 = this.f184302t.get();
            InterfaceC44331a interfaceC44331a = this.f184283a;
            InterfaceC35745a5 interfaceC35745a5D = interfaceC44331a.d();
            t.c(interfaceC35745a5D);
            mallFragment.f184243w0 = interfaceC35745a5D;
            mallFragment.f184244x0 = this.f184278D.get();
            mallFragment.f184245y0 = this.f184280F.get();
            mallFragment.f184246z0 = this.f184281G.get();
            mallFragment.f184237A0 = this.f184282H.get();
            InterfaceC28373a interfaceC28373aA = interfaceC44331a.a();
            t.c(interfaceC28373aA);
            mallFragment.f184238B0 = interfaceC28373aA;
            com.avito.android.util.text.a aVarE = this.f184284b.e();
            t.c(aVarE);
            mallFragment.f184239C0 = aVarE;
        }
    }

    public static b.a a() {
        return new b();
    }
}
