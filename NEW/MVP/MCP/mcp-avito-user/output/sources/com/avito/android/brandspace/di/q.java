package com.avito.android.brandspace.di;

import androidx.view.InterfaceC22983P;
import androidx.view.T0;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.brandspace.brandspace.BrandspaceFragmentMvi;
import com.avito.android.brandspace.di.b;
import com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor;
import com.avito.android.brandspace.view.BrandspaceFragment;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.C31149t0;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import dj.InterfaceC39737b;
import gj.InterfaceC40691b;
import java.util.Set;
import nk.InterfaceC44436a;
import pk.InterfaceC47104b;

/* compiled from: DaggerBrandspaceFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class q {

    /* compiled from: DaggerBrandspaceFragmentComponent.java */
    public static final class b implements com.avito.android.brandspace.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC30106l7 f107704a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.brandspace.di.c f107705b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f107706c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35745a5> f107707d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f107708e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f107709f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f107710g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC44436a> f107711h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Set<String>> f107712i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.brandspace.interactor.f f107713j;

        /* renamed from: k, reason: collision with root package name */
        public final u<gj.d> f107714k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f107715l;

        /* renamed from: m, reason: collision with root package name */
        public final u<a.b> f107716m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f107717n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC39737b> f107718o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC47104b> f107719p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC40691b> f107720q;

        /* renamed from: r, reason: collision with root package name */
        public final u<BrandspaceAnalyticsInteractor> f107721r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.brandspace.vm.d> f107722s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.brandspace.brandspace.mvi.d f107723t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.brandspace.brandspace.mvi.k f107724u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.brandspace.brandspace.mvi.m f107725v;

        /* renamed from: w, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f107726w;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.brandspace.brandspace.g f107727x;

        /* compiled from: DaggerBrandspaceFragmentComponent.java */
        public static final class a implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.brandspace.di.c f107728a;

            public a(com.avito.android.brandspace.di.c cVar) {
                this.f107728a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f107728a.El();
            }
        }

        /* compiled from: DaggerBrandspaceFragmentComponent.java */
        /* renamed from: com.avito.android.brandspace.di.q$b$b, reason: collision with other inner class name */
        public static final class C3222b implements u<InterfaceC39737b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.brandspace.di.c f107729a;

            public C3222b(com.avito.android.brandspace.di.c cVar) {
                this.f107729a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f107729a.Yb();
            }
        }

        /* compiled from: DaggerBrandspaceFragmentComponent.java */
        public static final class c implements u<InterfaceC44436a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.brandspace.di.c f107730a;

            public c(com.avito.android.brandspace.di.c cVar) {
                this.f107730a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44436a interfaceC44436aSa = this.f107730a.Sa();
                t.c(interfaceC44436aSa);
                return interfaceC44436aSa;
            }
        }

        /* compiled from: DaggerBrandspaceFragmentComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f107731a;

            public d(cv.b bVar) {
                this.f107731a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f107731a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerBrandspaceFragmentComponent.java */
        public static final class e implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f107732a;

            public e(cv.b bVar) {
                this.f107732a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f107732a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerBrandspaceFragmentComponent.java */
        public static final class f implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.brandspace.di.c f107733a;

            public f(com.avito.android.brandspace.di.c cVar) {
                this.f107733a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f107733a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerBrandspaceFragmentComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f107734a;

            public g(InterfaceC30106l7 interfaceC30106l7) {
                this.f107734a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f107734a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(C31138n0 c31138n0, com.avito.android.brandspace.di.c cVar, InterfaceC30106l7 interfaceC30106l7, cv.b bVar, String str, String str2, String str3, T0 t02, InterfaceC22983P interfaceC22983P, r rVar, a aVar) {
            this.f107704a = interfaceC30106l7;
            this.f107705b = cVar;
            this.f107706c = dagger.internal.l.a(t02);
            this.f107707d = new f(cVar);
            this.f107708e = dagger.internal.l.a(str);
            this.f107709f = dagger.internal.l.a(str2);
            this.f107710g = dagger.internal.l.b(str3);
            this.f107711h = new c(cVar);
            u<Set<String>> uVarA = B.a(C31149t0.a(c31138n0));
            this.f107712i = uVarA;
            this.f107713j = new com.avito.android.brandspace.interactor.f(this.f107708e, this.f107709f, this.f107710g, this.f107711h, this.f107707d, uVarA);
            this.f107714k = new a(cVar);
            this.f107715l = new d(bVar);
            this.f107716m = new e(bVar);
            this.f107717n = new g(interfaceC30106l7);
            this.f107718o = new C3222b(cVar);
            u<InterfaceC47104b> uVarD = dagger.internal.g.d(new com.avito.android.brandspace.di.f(dagger.internal.l.a(rVar), this.f107717n, this.f107718o));
            this.f107719p = uVarD;
            u<InterfaceC40691b> uVarD2 = dagger.internal.g.d(new com.avito.android.brandspace.di.e(uVarD, this.f107714k, this.f107715l, this.f107716m));
            this.f107720q = uVarD2;
            u<BrandspaceAnalyticsInteractor> uVarD3 = dagger.internal.g.d(new com.avito.android.brandspace.interactor.b(uVarD2, this.f107707d));
            this.f107721r = uVarD3;
            this.f107722s = dagger.internal.g.d(new i(this.f107706c, new com.avito.android.brandspace.vm.c(this.f107707d, this.f107713j, uVarD3, this.f107719p, this.f107720q)));
            com.avito.android.brandspace.interactor.f fVar = this.f107713j;
            u<InterfaceC40691b> uVar = this.f107720q;
            this.f107723t = new com.avito.android.brandspace.brandspace.mvi.d(fVar, uVar);
            this.f107724u = new com.avito.android.brandspace.brandspace.mvi.k(this.f107721r, uVar);
            u<InterfaceC35745a5> uVar2 = this.f107707d;
            u<InterfaceC47104b> uVar3 = this.f107719p;
            this.f107725v = new com.avito.android.brandspace.brandspace.mvi.m(uVar2, uVar, uVar3);
            this.f107726w = dagger.internal.g.d(new h(uVar3));
            this.f107727x = new com.avito.android.brandspace.brandspace.g(new com.avito.android.brandspace.brandspace.mvi.i(com.avito.android.brandspace.brandspace.mvi.f.a(), this.f107723t, this.f107724u, this.f107725v, this.f107726w), this.f107721r, this.f107720q, this.f107719p);
        }

        @Override // com.avito.android.brandspace.di.b
        public final void a(BrandspaceFragmentMvi brandspaceFragmentMvi) {
            brandspaceFragmentMvi.f107588t0 = this.f107727x;
            this.f107704a.N5();
            com.avito.android.brandspace.di.c cVar = this.f107705b;
            brandspaceFragmentMvi.f107590v0 = cVar.Ad();
            brandspaceFragmentMvi.f107591w0 = cVar.sd();
        }

        @Override // com.avito.android.brandspace.di.b
        public final void b(BrandspaceFragment brandspaceFragment) {
            brandspaceFragment.f107775t0 = this.f107722s.get();
            this.f107704a.N5();
            com.avito.android.brandspace.di.c cVar = this.f107705b;
            brandspaceFragment.f107776u0 = cVar.Ad();
            brandspaceFragment.f107777v0 = cVar.sd();
        }
    }

    /* compiled from: DaggerBrandspaceFragmentComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.brandspace.di.b.a
        public final com.avito.android.brandspace.di.b a(String str, String str2, String str3, TabBaseFragment tabBaseFragment, TabBaseFragment tabBaseFragment2, r rVar, C31138n0 c31138n0, com.avito.android.brandspace.di.c cVar, InterfaceC30106l7 interfaceC30106l7, InterfaceC39417a interfaceC39417a) {
            str.getClass();
            str2.getClass();
            c31138n0.getClass();
            interfaceC39417a.getClass();
            return new b(c31138n0, cVar, interfaceC30106l7, interfaceC39417a, str, str2, str3, tabBaseFragment, tabBaseFragment2, rVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
