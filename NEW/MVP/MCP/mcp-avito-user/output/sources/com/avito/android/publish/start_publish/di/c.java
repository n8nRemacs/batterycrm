package com.avito.android.publish.start_publish.di;

import Zd0.InterfaceC19545c;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC23487e;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.analytics.C;
import com.avito.android.publish.analytics.C33523i;
import com.avito.android.publish.analytics.C33531q;
import com.avito.android.publish.analytics.C33533t;
import com.avito.android.publish.analytics.C33536w;
import com.avito.android.publish.analytics.C33539z;
import com.avito.android.publish.analytics.Q;
import com.avito.android.publish.analytics.Z;
import com.avito.android.publish.analytics.c0;
import com.avito.android.publish.analytics.f0;
import com.avito.android.publish.di.C33813d;
import com.avito.android.publish.start_publish.InterfaceC34126a;
import com.avito.android.publish.start_publish.L;
import com.avito.android.publish.start_publish.StartPublishFragment;
import com.avito.android.publish.start_publish.di.f;
import com.avito.android.publish.start_publish.z;
import com.avito.android.remote.H;
import com.avito.android.remote.H0;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import hz.InterfaceC41196a;
import yc.C50213a;

/* compiled from: DaggerStartPublishComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class c {

    /* compiled from: DaggerStartPublishComponent.java */
    public static final class b implements f.a {

        /* renamed from: a, reason: collision with root package name */
        public g f245367a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f245368b;

        /* renamed from: c, reason: collision with root package name */
        public Resources f245369c;

        /* renamed from: d, reason: collision with root package name */
        public StartPublishFragment f245370d;

        /* renamed from: e, reason: collision with root package name */
        public String f245371e;

        public b() {
        }

        @Override // com.avito.android.publish.start_publish.di.f.a
        public final f.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f245368b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.publish.start_publish.di.f.a
        public final f.a b(Resources resources) {
            this.f245369c = resources;
            return this;
        }

        @Override // com.avito.android.publish.start_publish.di.f.a
        public final f build() {
            t.a(g.class, this.f245367a);
            t.a(cv.b.class, this.f245368b);
            t.a(Resources.class, this.f245369c);
            t.a(Fragment.class, this.f245370d);
            return new C7353c(this.f245367a, this.f245368b, this.f245369c, this.f245370d, this.f245371e, null);
        }

        @Override // com.avito.android.publish.start_publish.di.f.a
        public final f.a c(String str) {
            this.f245371e = str;
            return this;
        }

        @Override // com.avito.android.publish.start_publish.di.f.a
        public final f.a d(g gVar) {
            this.f245367a = gVar;
            return this;
        }

        @Override // com.avito.android.publish.start_publish.di.f.a
        public final f.a e(StartPublishFragment startPublishFragment) {
            this.f245370d = startPublishFragment;
            return this;
        }
    }

    /* compiled from: DaggerStartPublishComponent.java */
    /* renamed from: com.avito.android.publish.start_publish.di.c$c, reason: collision with other inner class name */
    public static final class C7353c implements com.avito.android.publish.start_publish.di.f {

        /* renamed from: a, reason: collision with root package name */
        public final g f245372a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f245373b;

        /* renamed from: c, reason: collision with root package name */
        public final String f245374c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC23487e> f245375d;

        /* renamed from: e, reason: collision with root package name */
        public final u<H0> f245376e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC35745a5> f245377f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC34126a> f245378g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Q1> f245379h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC41196a> f245380i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Gson> f245381j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.publish.start_publish.t> f245382k;

        /* compiled from: DaggerStartPublishComponent.java */
        /* renamed from: com.avito.android.publish.start_publish.di.c$c$a */
        public static final class a implements u<InterfaceC34126a> {

            /* renamed from: a, reason: collision with root package name */
            public final g f245383a;

            public a(g gVar) {
                this.f245383a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34126a interfaceC34126aOb = this.f245383a.ob();
                t.c(interfaceC34126aOb);
                return interfaceC34126aOb;
            }
        }

        /* compiled from: DaggerStartPublishComponent.java */
        /* renamed from: com.avito.android.publish.start_publish.di.c$c$b */
        public static final class b implements u<InterfaceC41196a> {

            /* renamed from: a, reason: collision with root package name */
            public final g f245384a;

            public b(g gVar) {
                this.f245384a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41196a interfaceC41196aE0 = this.f245384a.E0();
                t.c(interfaceC41196aE0);
                return interfaceC41196aE0;
            }
        }

        /* compiled from: DaggerStartPublishComponent.java */
        /* renamed from: com.avito.android.publish.start_publish.di.c$c$c, reason: collision with other inner class name */
        public static final class C7354c implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final g f245385a;

            public C7354c(g gVar) {
                this.f245385a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f245385a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerStartPublishComponent.java */
        /* renamed from: com.avito.android.publish.start_publish.di.c$c$d */
        public static final class d implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final g f245386a;

            public d(g gVar) {
                this.f245386a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0I3 = this.f245386a.I3();
                t.c(h0I3);
                return h0I3;
            }
        }

        /* compiled from: DaggerStartPublishComponent.java */
        /* renamed from: com.avito.android.publish.start_publish.di.c$c$e */
        public static final class e implements u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final g f245387a;

            public e(g gVar) {
                this.f245387a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f245387a.z0();
            }
        }

        /* compiled from: DaggerStartPublishComponent.java */
        /* renamed from: com.avito.android.publish.start_publish.di.c$c$f */
        public static final class f implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final g f245388a;

            public f(g gVar) {
                this.f245388a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f245388a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public C7353c(g gVar, cv.b bVar, Resources resources, Fragment fragment, String str, a aVar) {
            this.f245372a = gVar;
            this.f245373b = bVar;
            this.f245374c = str;
            this.f245375d = dagger.internal.g.d(dagger.internal.l.a(fragment));
            this.f245382k = dagger.internal.g.d(new z(new d(gVar), new f(gVar), new a(gVar), new e(gVar), new b(gVar), new C7354c(gVar)));
        }

        @Override // com.avito.android.publish.start_publish.di.f
        public final void a(StartPublishFragment startPublishFragment) {
            InterfaceC23487e interfaceC23487e = this.f245375d.get();
            com.avito.android.publish.start_publish.t tVar = this.f245382k.get();
            g gVar = this.f245372a;
            C50213a c50213aD1 = gVar.D1();
            t.c(c50213aD1);
            InterfaceC19545c interfaceC19545cD5 = gVar.d5();
            t.c(interfaceC19545cD5);
            cv.b bVar = this.f245373b;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            t.c(aVarU4);
            com.avito.android.account.plugin.rx.a aVarEi = gVar.Ei();
            t.c(aVarEi);
            C33536w c33536wB = b();
            InterfaceC41196a interfaceC41196aE0 = gVar.E0();
            t.c(interfaceC41196aE0);
            startPublishFragment.f245291t0 = new L(interfaceC23487e, tVar, c50213aD1, interfaceC19545cD5, aVarU4, aVarEi, c33536wB, interfaceC41196aE0, gVar.z0(), this.f245374c);
            com.avito.android.deeplink_handler.handler.composite.a aVarU42 = bVar.u4();
            t.c(aVarU42);
            startPublishFragment.f245292u0 = aVarU42;
            startPublishFragment.f245293v0 = gVar.z0();
            InterfaceC28373a interfaceC28373aA = gVar.a();
            t.c(interfaceC28373aA);
            startPublishFragment.f245294w0 = interfaceC28373aA;
            startPublishFragment.f245295x0 = b();
            com.avito.android.ui.status_bar.e eVarB0 = gVar.b0();
            t.c(eVarB0);
            startPublishFragment.f245296y0 = eVarB0;
        }

        public final C33536w b() {
            g gVar = this.f245372a;
            InterfaceC28373a interfaceC28373aA = gVar.a();
            t.c(interfaceC28373aA);
            C50213a c50213aD1 = gVar.D1();
            t.c(c50213aD1);
            com.avito.android.analytics.provider.a aVarV = gVar.v();
            t.c(aVarV);
            Gson gsonB = C33813d.b();
            InterfaceC28373a interfaceC28373aA2 = gVar.a();
            t.c(interfaceC28373aA2);
            C50213a c50213aD12 = gVar.D1();
            t.c(c50213aD12);
            C33523i c33523i = new C33523i(interfaceC28373aA2, c50213aD12);
            InterfaceC28373a interfaceC28373aA3 = gVar.a();
            t.c(interfaceC28373aA3);
            C50213a c50213aD13 = gVar.D1();
            t.c(c50213aD13);
            com.avito.android.analytics.provider.a aVarV2 = gVar.v();
            t.c(aVarV2);
            C33533t c33533t = new C33533t(interfaceC28373aA3, c50213aD13, aVarV2);
            InterfaceC28373a interfaceC28373aA4 = gVar.a();
            t.c(interfaceC28373aA4);
            C50213a c50213aD14 = gVar.D1();
            t.c(c50213aD14);
            com.avito.android.analytics.provider.a aVarV3 = gVar.v();
            t.c(aVarV3);
            C33531q c33531q = new C33531q(interfaceC28373aA4, c50213aD14, aVarV3);
            InterfaceC28373a interfaceC28373aA5 = gVar.a();
            t.c(interfaceC28373aA5);
            C50213a c50213aD15 = gVar.D1();
            t.c(c50213aD15);
            c0 c0Var = new c0(interfaceC28373aA5, c50213aD15);
            InterfaceC28373a interfaceC28373aA6 = gVar.a();
            t.c(interfaceC28373aA6);
            C50213a c50213aD16 = gVar.D1();
            t.c(c50213aD16);
            Z z12 = new Z(interfaceC28373aA6, c50213aD16);
            InterfaceC28373a interfaceC28373aA7 = gVar.a();
            t.c(interfaceC28373aA7);
            C50213a c50213aD17 = gVar.D1();
            t.c(c50213aD17);
            H hK2 = gVar.K();
            t.c(hK2);
            f0 f0Var = new f0(interfaceC28373aA7, c50213aD17, hK2);
            InterfaceC28373a interfaceC28373aA8 = gVar.a();
            t.c(interfaceC28373aA8);
            C50213a c50213aD18 = gVar.D1();
            t.c(c50213aD18);
            C33539z c33539z = new C33539z(interfaceC28373aA8, c50213aD18);
            InterfaceC28373a interfaceC28373aA9 = gVar.a();
            t.c(interfaceC28373aA9);
            C50213a c50213aD19 = gVar.D1();
            t.c(c50213aD19);
            C c12 = new C(interfaceC28373aA9, c50213aD19);
            InterfaceC28373a interfaceC28373aA10 = gVar.a();
            t.c(interfaceC28373aA10);
            C50213a c50213aD110 = gVar.D1();
            t.c(c50213aD110);
            return new C33536w(interfaceC28373aA, c50213aD1, aVarV, gsonB, c33523i, c33533t, c33531q, c0Var, z12, f0Var, c33539z, c12, new Q(interfaceC28373aA10, c50213aD110));
        }
    }

    public static f.a a() {
        return new b();
    }
}
