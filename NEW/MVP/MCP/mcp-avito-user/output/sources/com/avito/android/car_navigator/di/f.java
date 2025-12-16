package com.avito.android.car_navigator.di;

import Am.C13053c;
import Am.C13056f;
import Am.InterfaceC13051a;
import Dm.InterfaceC13414a;
import Y41.l;
import android.webkit.CookieManager;
import com.avito.android.H0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.car_navigator.di.a;
import com.avito.android.car_navigator.di.d;
import com.avito.android.car_navigator.link.CarNavigatorSettings;
import com.avito.android.car_navigator.mvi.i;
import com.avito.android.car_navigator.presentation.CarNavigatorFragment;
import com.avito.android.car_navigator.presentation.h;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.util.C;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;
import rm0.InterfaceC47681a;

/* compiled from: DaggerCarNavigatorComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class f {

    /* compiled from: DaggerCarNavigatorComponent.java */
    public static final class b implements a.InterfaceC3356a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.car_navigator.di.b f115161a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f115162b;

        /* renamed from: c, reason: collision with root package name */
        public l<? super InterfaceC13414a, G0> f115163c;

        /* renamed from: d, reason: collision with root package name */
        public CarNavigatorSettings f115164d;

        public b() {
        }

        @Override // com.avito.android.car_navigator.di.a.InterfaceC3356a
        public final a.InterfaceC3356a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f115162b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.car_navigator.di.a.InterfaceC3356a
        public final a.InterfaceC3356a b(CarNavigatorSettings carNavigatorSettings) {
            carNavigatorSettings.getClass();
            this.f115164d = carNavigatorSettings;
            return this;
        }

        @Override // com.avito.android.car_navigator.di.a.InterfaceC3356a
        public final com.avito.android.car_navigator.di.a build() {
            t.a(com.avito.android.car_navigator.di.b.class, this.f115161a);
            t.a(cv.b.class, this.f115162b);
            t.a(l.class, this.f115163c);
            t.a(CarNavigatorSettings.class, this.f115164d);
            return new c(this.f115161a, this.f115162b, this.f115163c, this.f115164d, null);
        }

        @Override // com.avito.android.car_navigator.di.a.InterfaceC3356a
        public final a.InterfaceC3356a c(com.avito.android.car_navigator.di.b bVar) {
            this.f115161a = bVar;
            return this;
        }

        @Override // com.avito.android.car_navigator.di.a.InterfaceC3356a
        public final a.InterfaceC3356a w(l lVar) {
            this.f115163c = lVar;
            return this;
        }
    }

    /* compiled from: DaggerCarNavigatorComponent.java */
    public static final class c implements com.avito.android.car_navigator.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f115165a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.car_navigator.di.b f115166b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f115167c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f115168d;

        /* renamed from: e, reason: collision with root package name */
        public final u<x> f115169e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f115170f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC13051a> f115171g;

        /* renamed from: h, reason: collision with root package name */
        public final u<CookieManager> f115172h;

        /* renamed from: i, reason: collision with root package name */
        public final u<B0> f115173i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC47681a> f115174j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f115175k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.b> f115176l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C> f115177m;

        /* renamed from: n, reason: collision with root package name */
        public final u<H0> f115178n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.e> f115179o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.car_navigator.presentation.d> f115180p;

        /* renamed from: q, reason: collision with root package name */
        public final C13056f f115181q;

        /* compiled from: DaggerCarNavigatorComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.car_navigator.di.b f115182a;

            public a(com.avito.android.car_navigator.di.b bVar) {
                this.f115182a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f115182a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCarNavigatorComponent.java */
        public static final class b implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.car_navigator.di.b f115183a;

            public b(com.avito.android.car_navigator.di.b bVar) {
                this.f115183a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f115183a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerCarNavigatorComponent.java */
        /* renamed from: com.avito.android.car_navigator.di.f$c$c, reason: collision with other inner class name */
        public static final class C3357c implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.car_navigator.di.b f115184a;

            public C3357c(com.avito.android.car_navigator.di.b bVar) {
                this.f115184a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f115184a.t();
                t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerCarNavigatorComponent.java */
        public static final class d implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.car_navigator.di.b f115185a;

            public d(com.avito.android.car_navigator.di.b bVar) {
                this.f115185a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0M = this.f115185a.M();
                t.c(h0M);
                return h0M;
            }
        }

        /* compiled from: DaggerCarNavigatorComponent.java */
        public static final class e implements u<InterfaceC47681a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.car_navigator.di.b f115186a;

            public e(com.avito.android.car_navigator.di.b bVar) {
                this.f115186a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f115186a.n0();
            }
        }

        /* compiled from: DaggerCarNavigatorComponent.java */
        /* renamed from: com.avito.android.car_navigator.di.f$c$f, reason: collision with other inner class name */
        public static final class C3358f implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.car_navigator.di.b f115187a;

            public C3358f(com.avito.android.car_navigator.di.b bVar) {
                this.f115187a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f115187a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerCarNavigatorComponent.java */
        public static final class g implements u<B0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.car_navigator.di.b f115188a;

            public g(com.avito.android.car_navigator.di.b bVar) {
                this.f115188a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f115188a.s5();
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.car_navigator.di.b bVar, cv.b bVar2, l lVar, CarNavigatorSettings carNavigatorSettings, a aVar) {
            this.f115165a = bVar2;
            this.f115166b = bVar;
            this.f115167c = dagger.internal.l.a(carNavigatorSettings);
            this.f115168d = dagger.internal.l.a(lVar);
            this.f115169e = new C3357c(bVar);
            this.f115171g = dagger.internal.g.d(new C13053c(new a(bVar)));
            this.f115172h = dagger.internal.g.d(d.a.f115155a);
            this.f115173i = new g(bVar);
            this.f115174j = new e(bVar);
            u<com.avito.android.cookie_provider.b> uVarD = dagger.internal.g.d(new com.avito.android.cookie_provider.d(new C3358f(bVar)));
            this.f115176l = uVarD;
            u<com.avito.android.cookie_provider.e> uVarD2 = dagger.internal.g.d(new com.avito.android.car_navigator.di.e(uVarD, this.f115173i, this.f115174j, new b(bVar), new d(bVar)));
            this.f115179o = uVarD2;
            u<com.avito.android.car_navigator.presentation.d> uVarD3 = dagger.internal.g.d(new h(this.f115167c, this.f115168d, uVarD2, this.f115169e, this.f115171g, this.f115172h));
            this.f115180p = uVarD3;
            this.f115181q = new C13056f(new com.avito.android.car_navigator.mvi.e(new com.avito.android.car_navigator.mvi.b(uVarD3), com.avito.android.car_navigator.mvi.g.a(), i.a()));
        }

        @Override // com.avito.android.car_navigator.di.a
        public final void a(CarNavigatorFragment carNavigatorFragment) {
            carNavigatorFragment.f115217t0 = this.f115181q;
            cv.b bVar = this.f115165a;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            t.c(aVarU4);
            carNavigatorFragment.f115218u0 = aVarU4;
            InterfaceC28373a interfaceC28373aA = this.f115166b.a();
            t.c(interfaceC28373aA);
            carNavigatorFragment.f115219v0 = interfaceC28373aA;
            carNavigatorFragment.f115220w0 = this.f115180p.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU42 = bVar.u4();
            t.c(aVarU42);
            carNavigatorFragment.f115221x0 = aVarU42;
        }
    }

    public static a.InterfaceC3356a a() {
        return new b();
    }
}
