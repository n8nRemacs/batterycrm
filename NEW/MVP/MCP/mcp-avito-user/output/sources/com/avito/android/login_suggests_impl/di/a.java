package com.avito.android.login_suggests_impl.di;

import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30065i;
import com.avito.android.login_suggests_impl.LoginSuggestsActivity;
import com.avito.android.login_suggests_impl.adapter.LoginSuggestsItem;
import com.avito.android.login_suggests_impl.di.b;
import com.avito.android.login_suggests_impl.di.f;
import com.avito.android.login_suggests_impl.di.g;
import com.avito.android.login_suggests_impl.k;
import com.avito.android.login_suggests_impl.m;
import com.avito.android.login_suggests_impl.w;
import com.avito.android.login_suggests_impl.y;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.S3;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import hD.C40806a;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerLoginSuggestsComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerLoginSuggestsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.login_suggests_impl.di.b.a
        public final com.avito.android.login_suggests_impl.di.b a(com.avito.android.login_suggests_impl.di.c cVar, r rVar, Resources resources, Kundle kundle, InterfaceC39417a interfaceC39417a, r rVar2) {
            interfaceC39417a.getClass();
            return new c(new DW.a(), new BW.a(), new CW.a(), cVar, interfaceC39417a, rVar, resources, kundle, rVar2, null);
        }
    }

    /* compiled from: DaggerLoginSuggestsComponent.java */
    public static final class c implements com.avito.android.login_suggests_impl.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.login_suggests_impl.di.c f182896a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f182897b = B.a(com.avito.android.konveyor_adapter_module.d.a());

        /* renamed from: c, reason: collision with root package name */
        public final u<com.jakewharton.rxrelay3.c<LoginSuggestsItem>> f182898c = dagger.internal.g.d(g.a.f182927a);

        /* renamed from: d, reason: collision with root package name */
        public final u<w> f182899d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.login_suggests_impl.adapter.suggest.b> f182900e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f182901f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.login_suggests_impl.adapter.common_login.b> f182902g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f182903h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.login_suggests_impl.adapter.progress.b> f182904i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f182905j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f182906k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f182907l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC34258d> f182908m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC35745a5> f182909n;

        /* renamed from: o, reason: collision with root package name */
        public final u<B3.c> f182910o;

        /* renamed from: p, reason: collision with root package name */
        public final u<C40806a> f182911p;

        /* renamed from: q, reason: collision with root package name */
        public final u<Set<String>> f182912q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.login_suggests_impl.g> f182913r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC28373a> f182914s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC28481c> f182915t;

        /* renamed from: u, reason: collision with root package name */
        public final u<C28478k> f182916u;

        /* renamed from: v, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f182917v;

        /* renamed from: w, reason: collision with root package name */
        public final u<m> f182918w;

        /* compiled from: DaggerLoginSuggestsComponent.java */
        /* renamed from: com.avito.android.login_suggests_impl.di.a$c$a, reason: collision with other inner class name */
        public static final class C5359a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.login_suggests_impl.di.c f182919a;

            public C5359a(com.avito.android.login_suggests_impl.di.c cVar) {
                this.f182919a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f182919a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerLoginSuggestsComponent.java */
        public static final class b implements u<InterfaceC34258d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.login_suggests_impl.di.c f182920a;

            public b(com.avito.android.login_suggests_impl.di.c cVar) {
                this.f182920a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34258d interfaceC34258dQ0 = this.f182920a.Q0();
                t.c(interfaceC34258dQ0);
                return interfaceC34258dQ0;
            }
        }

        /* compiled from: DaggerLoginSuggestsComponent.java */
        /* renamed from: com.avito.android.login_suggests_impl.di.a$c$c, reason: collision with other inner class name */
        public static final class C5360c implements u<C40806a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.login_suggests_impl.di.c f182921a;

            public C5360c(com.avito.android.login_suggests_impl.di.c cVar) {
                this.f182921a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f182921a.R();
            }
        }

        /* compiled from: DaggerLoginSuggestsComponent.java */
        public static final class d implements u<B3.c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.login_suggests_impl.di.c f182922a;

            public d(com.avito.android.login_suggests_impl.di.c cVar) {
                this.f182922a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f182922a.I2();
            }
        }

        /* compiled from: DaggerLoginSuggestsComponent.java */
        public static final class e implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.login_suggests_impl.di.c f182923a;

            public e(com.avito.android.login_suggests_impl.di.c cVar) {
                this.f182923a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f182923a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerLoginSuggestsComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.login_suggests_impl.di.c f182924a;

            public f(com.avito.android.login_suggests_impl.di.c cVar) {
                this.f182924a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f182924a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(DW.a aVar, BW.a aVar2, CW.a aVar3, com.avito.android.login_suggests_impl.di.c cVar, cv.b bVar, r rVar, Resources resources, Kundle kundle, r rVar2, C5358a c5358a) {
            this.f182896a = cVar;
            u<w> uVarD = dagger.internal.g.d(new y(l.a(resources)));
            this.f182899d = uVarD;
            u<com.avito.android.login_suggests_impl.adapter.suggest.b> uVarD2 = dagger.internal.g.d(new DW.c(aVar, this.f182898c, uVarD));
            this.f182900e = uVarD2;
            this.f182901f = dagger.internal.g.d(new DW.b(aVar, uVarD2));
            u<com.avito.android.login_suggests_impl.adapter.common_login.b> uVarD3 = dagger.internal.g.d(new BW.c(aVar2, this.f182898c));
            this.f182902g = uVarD3;
            this.f182903h = dagger.internal.g.d(new BW.b(aVar2, uVarD3));
            u<com.avito.android.login_suggests_impl.adapter.progress.b> uVarD4 = dagger.internal.g.d(new CW.c(aVar3));
            this.f182904i = uVarD4;
            this.f182905j = dagger.internal.g.d(new CW.b(aVar3, uVarD4));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f182897b);
            u<TV0.b<?, ?>> uVar = this.f182901f;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f182903h);
            list.add(this.f182905j);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f182906k = uVarK;
            this.f182907l = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f182908m = new b(cVar);
            this.f182909n = new e(cVar);
            this.f182910o = new d(cVar);
            this.f182911p = new C5360c(cVar);
            u<Set<String>> uVarD5 = dagger.internal.g.d(f.a.f182926a);
            this.f182912q = uVarD5;
            this.f182913r = dagger.internal.g.d(new k(uVarD5, this.f182908m, this.f182909n, this.f182910o, this.f182911p));
            this.f182914s = new C5359a(cVar);
            this.f182915t = new f(cVar);
            u<C28478k> uVarD6 = dagger.internal.g.d(new h(l.a(rVar2)));
            this.f182916u = uVarD6;
            this.f182917v = dagger.internal.g.d(new C30065i(this.f182915t, uVarD6));
            this.f182918w = dagger.internal.g.d(new com.avito.android.login_suggests_impl.u(S3.f318734a, l.b(kundle), this.f182913r, this.f182907l, this.f182898c, this.f182909n, this.f182914s, this.f182917v));
        }

        @Override // com.avito.android.login_suggests_impl.di.b
        public final void a(LoginSuggestsActivity loginSuggestsActivity) {
            loginSuggestsActivity.f182849m = this.f182907l.get();
            loginSuggestsActivity.f182850n = this.f182906k.get();
            loginSuggestsActivity.f182851o = this.f182918w.get();
            com.avito.android.ui.status_bar.e eVarB0 = this.f182896a.b0();
            t.c(eVarB0);
            loginSuggestsActivity.f182852p = eVarB0;
            loginSuggestsActivity.f182853q = this.f182917v.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
