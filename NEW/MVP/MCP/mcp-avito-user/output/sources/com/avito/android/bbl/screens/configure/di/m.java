package com.avito.android.bbl.screens.configure.di;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bbl.screens.configure.BblConfigureFragment;
import com.avito.android.bbl.screens.configure.di.a;
import com.avito.android.bbl.screens.configure.mvi.n;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import lh.C43772c;
import lh.InterfaceC43770a;
import nh.InterfaceC44423b;
import wh.InterfaceC49621a;

/* compiled from: DaggerBblConfigureComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class m {

    /* compiled from: DaggerBblConfigureComponent.java */
    public static final class b implements com.avito.android.bbl.screens.configure.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC44423b f99159a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f99160b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC49621a> f99161c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f99162d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.bbl.screens.configure.mvi.domain.a> f99163e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f99164f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.bbl.screens.configure.mvi.f f99165g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f99166h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC43770a> f99167i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.bbl.screens.configure.mvi.d f99168j;

        /* renamed from: k, reason: collision with root package name */
        public final n f99169k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f99170l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C28478k> f99171m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f99172n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.bbl.screens.configure.j f99173o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.bbl.screens.configure.ui.items.header.d> f99174p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.bbl.screens.configure.ui.items.header.c f99175q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.bbl.screens.configure.ui.items.configs.c> f99176r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f99177s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f99178t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f99179u;

        /* compiled from: DaggerBblConfigureComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44423b f99180a;

            public a(InterfaceC44423b interfaceC44423b) {
                this.f99180a = interfaceC44423b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f99180a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerBblConfigureComponent.java */
        /* renamed from: com.avito.android.bbl.screens.configure.di.m$b$b, reason: collision with other inner class name */
        public static final class C2988b implements u<InterfaceC49621a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44423b f99181a;

            public C2988b(InterfaceC44423b interfaceC44423b) {
                this.f99181a = interfaceC44423b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49621a interfaceC49621aMc = this.f99181a.mc();
                t.c(interfaceC49621aMc);
                return interfaceC49621aMc;
            }
        }

        /* compiled from: DaggerBblConfigureComponent.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44423b f99182a;

            public c(InterfaceC44423b interfaceC44423b) {
                this.f99182a = interfaceC44423b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f99182a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerBblConfigureComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC44423b f99183a;

            public d(InterfaceC44423b interfaceC44423b) {
                this.f99183a = interfaceC44423b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f99183a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(InterfaceC44423b interfaceC44423b, cv.b bVar, Fragment fragment, r rVar, String str, Y41.l lVar, Y41.l lVar2, a aVar) {
            this.f99159a = interfaceC44423b;
            this.f99160b = bVar;
            this.f99163e = dagger.internal.g.d(new com.avito.android.bbl.screens.configure.mvi.domain.c(new C2988b(interfaceC44423b), new c(interfaceC44423b)));
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            this.f99164f = lVarA;
            this.f99165g = new com.avito.android.bbl.screens.configure.mvi.f(lVarA, this.f99163e);
            u<InterfaceC43770a> uVarD = dagger.internal.g.d(new C43772c(new a(interfaceC44423b)));
            this.f99167i = uVarD;
            this.f99168j = new com.avito.android.bbl.screens.configure.mvi.d(this.f99164f, uVarD, this.f99163e);
            this.f99169k = new n(uVarD);
            this.f99170l = new d(interfaceC44423b);
            u<C28478k> uVarD2 = dagger.internal.g.d(new l(dagger.internal.l.a(rVar)));
            this.f99171m = uVarD2;
            this.f99172n = com.avito.android.advert.item.delivery_suggests.l.i(this.f99170l, uVarD2);
            this.f99173o = new com.avito.android.bbl.screens.configure.j(new com.avito.android.bbl.screens.configure.mvi.i(this.f99165g, this.f99168j, com.avito.android.bbl.screens.configure.mvi.k.a(), this.f99169k, this.f99172n));
            u<com.avito.android.bbl.screens.configure.ui.items.header.d> uVarD3 = dagger.internal.g.d(new com.avito.android.bbl.screens.configure.ui.items.header.g(dagger.internal.l.a(lVar)));
            this.f99174p = uVarD3;
            this.f99175q = new com.avito.android.bbl.screens.configure.ui.items.header.c(uVarD3);
            u<com.avito.android.bbl.screens.configure.ui.items.configs.c> uVarD4 = dagger.internal.g.d(new com.avito.android.bbl.screens.configure.ui.items.configs.e(dagger.internal.l.a(lVar2)));
            this.f99176r = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new i(this.f99175q, new com.avito.android.bbl.screens.configure.ui.items.configs.b(uVarD4)));
            this.f99177s = uVarD5;
            u<com.avito.konveyor.adapter.a> uVarD6 = dagger.internal.g.d(new h(uVarD5));
            this.f99178t = uVarD6;
            this.f99179u = dagger.internal.g.d(new j(uVarD6, this.f99177s));
        }

        @Override // com.avito.android.bbl.screens.configure.di.a
        public final void a(BblConfigureFragment bblConfigureFragment) {
            bblConfigureFragment.f99097n0 = this.f99173o;
            bblConfigureFragment.f99099p0 = this.f99172n.get();
            bblConfigureFragment.f99100q0 = this.f99179u.get();
            InterfaceC44423b interfaceC44423b = this.f99159a;
            com.avito.android.util.text.a aVarE = interfaceC44423b.e();
            t.c(aVarE);
            bblConfigureFragment.f99101r0 = aVarE;
            InterfaceC28373a interfaceC28373aA = interfaceC44423b.a();
            t.c(interfaceC28373aA);
            bblConfigureFragment.f99102s0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f99160b.u4();
            t.c(aVarU4);
            bblConfigureFragment.f99103t0 = aVarU4;
        }
    }

    /* compiled from: DaggerBblConfigureComponent.java */
    public static final class c implements a.InterfaceC2987a {
        public c() {
        }

        @Override // com.avito.android.bbl.screens.configure.di.a.InterfaceC2987a
        public final com.avito.android.bbl.screens.configure.di.a a(InterfaceC44423b interfaceC44423b, BblConfigureFragment bblConfigureFragment, InterfaceC39417a interfaceC39417a, r rVar, String str, Y41.l lVar, Y41.l lVar2) {
            interfaceC39417a.getClass();
            return new b(interfaceC44423b, interfaceC39417a, bblConfigureFragment, rVar, str, lVar, lVar2, null);
        }
    }

    public static a.InterfaceC2987a a() {
        return new c();
    }
}
