package com.avito.android.di.component;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.component.InterfaceC29904k;
import com.avito.android.home.bottom_navigation.BottomNavigationFragment;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import hz.InterfaceC41196a;
import rg.C47652a;

/* compiled from: DaggerBottomNavigationFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class q {

    /* compiled from: DaggerBottomNavigationFragmentComponent.java */
    public static final class b implements InterfaceC29904k {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC29903j f139304a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f139305b;

        /* renamed from: c, reason: collision with root package name */
        public final I f139306c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f139307d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.passport_lib.a> f139308e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.home.B> f139309f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<s90.b> f139310g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<gD.f> f139311h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC41196a> f139312i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.home.p> f139313j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.home.bottom_navigation.G f139314k;

        /* compiled from: DaggerBottomNavigationFragmentComponent.java */
        public static final class a implements dagger.internal.u<InterfaceC41196a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29903j f139315a;

            public a(InterfaceC29903j interfaceC29903j) {
                this.f139315a = interfaceC29903j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41196a interfaceC41196aE0 = this.f139315a.E0();
                dagger.internal.t.c(interfaceC41196aE0);
                return interfaceC41196aE0;
            }
        }

        /* compiled from: DaggerBottomNavigationFragmentComponent.java */
        /* renamed from: com.avito.android.di.component.q$b$b, reason: collision with other inner class name */
        public static final class C4203b implements dagger.internal.u<com.avito.android.home.p> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29903j f139316a;

            public C4203b(InterfaceC29903j interfaceC29903j) {
                this.f139316a = interfaceC29903j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.home.p pVarIj = this.f139316a.Ij();
                dagger.internal.t.c(pVarIj);
                return pVarIj;
            }
        }

        /* compiled from: DaggerBottomNavigationFragmentComponent.java */
        public static final class c implements dagger.internal.u<com.avito.android.passport_lib.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29903j f139317a;

            public c(InterfaceC29903j interfaceC29903j) {
                this.f139317a = interfaceC29903j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f139317a.il();
            }
        }

        /* compiled from: DaggerBottomNavigationFragmentComponent.java */
        public static final class d implements dagger.internal.u<s90.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29903j f139318a;

            public d(InterfaceC29903j interfaceC29903j) {
                this.f139318a = interfaceC29903j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f139318a.w2();
            }
        }

        /* compiled from: DaggerBottomNavigationFragmentComponent.java */
        public static final class e implements dagger.internal.u<gD.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29903j f139319a;

            public e(InterfaceC29903j interfaceC29903j) {
                this.f139319a = interfaceC29903j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f139319a.v1();
            }
        }

        /* compiled from: DaggerBottomNavigationFragmentComponent.java */
        public static final class f implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29903j f139320a;

            public f(InterfaceC29903j interfaceC29903j) {
                this.f139320a = interfaceC29903j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f139320a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerBottomNavigationFragmentComponent.java */
        public static final class g implements dagger.internal.u<com.avito.android.home.B> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29903j f139321a;

            public g(InterfaceC29903j interfaceC29903j) {
                this.f139321a = interfaceC29903j;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.home.B bHb = this.f139321a.hb();
                dagger.internal.t.c(bHb);
                return bHb;
            }
        }

        public b(InterfaceC29903j interfaceC29903j, cv.b bVar, I i12, Boolean bool, a aVar) {
            this.f139304a = interfaceC29903j;
            this.f139305b = bVar;
            this.f139306c = i12;
            this.f139314k = new com.avito.android.home.bottom_navigation.G(new f(interfaceC29903j), new c(interfaceC29903j), new g(interfaceC29903j), new d(interfaceC29903j), new e(interfaceC29903j), new a(interfaceC29903j), new C4203b(interfaceC29903j));
        }

        @Override // com.avito.android.di.component.InterfaceC29904k
        public final void a(BottomNavigationFragment bottomNavigationFragment) {
            InterfaceC29903j interfaceC29903j = this.f139304a;
            bottomNavigationFragment.f162266n0 = interfaceC29903j.x();
            bottomNavigationFragment.f162267o0 = interfaceC29903j.O();
            bottomNavigationFragment.f162268p0 = interfaceC29903j.rl();
            com.avito.android.ui.i iVarPe = interfaceC29903j.pe();
            dagger.internal.t.c(iVarPe);
            bottomNavigationFragment.f162269q0 = iVarPe;
            InterfaceC28373a interfaceC28373aA = interfaceC29903j.a();
            dagger.internal.t.c(interfaceC28373aA);
            bottomNavigationFragment.f162270r0 = interfaceC28373aA;
            bottomNavigationFragment.f162271s0 = interfaceC29903j.N4();
            InterfaceC35745a5 interfaceC35745a5D = interfaceC29903j.d();
            dagger.internal.t.c(interfaceC35745a5D);
            bottomNavigationFragment.f162272t0 = interfaceC35745a5D;
            bottomNavigationFragment.f162273u0 = this.f139314k;
            cv.b bVar = this.f139305b;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            dagger.internal.t.c(aVarU4);
            bottomNavigationFragment.f162275w0 = aVarU4;
            bottomNavigationFragment.f162276x0 = interfaceC29903j.xi();
            bottomNavigationFragment.f162277y0 = new com.avito.android.bottom_navigation.G(interfaceC29903j.G(), interfaceC29903j.J3(), interfaceC29903j.V3());
            interfaceC29903j.V3();
            bottomNavigationFragment.f162278z0 = interfaceC29903j.J3();
            bottomNavigationFragment.f162245A0 = interfaceC29903j.a4();
            com.avito.android.ui.status_bar.e eVarB0 = interfaceC29903j.b0();
            dagger.internal.t.c(eVarB0);
            bottomNavigationFragment.f162246B0 = eVarB0;
            I i12 = this.f139306c;
            bottomNavigationFragment.f162247C0 = i12.ih();
            SK0.b bVarP = interfaceC29903j.p();
            dagger.internal.t.c(bVarP);
            bottomNavigationFragment.f162248D0 = bVarP;
            com.avito.android.deeplink_handler.handler.composite.a aVarU42 = bVar.u4();
            dagger.internal.t.c(aVarU42);
            C47652a c47652aIh = i12.ih();
            InterfaceC28373a interfaceC28373aA2 = interfaceC29903j.a();
            dagger.internal.t.c(interfaceC28373aA2);
            bottomNavigationFragment.f162249E0 = new com.avito.android.home.navbar.i(aVarU42, c47652aIh, interfaceC28373aA2, i12.A5(), i12.z3(), interfaceC29903j.V3(), i12.W());
            bottomNavigationFragment.f162250F0 = interfaceC29903j.G();
        }
    }

    /* compiled from: DaggerBottomNavigationFragmentComponent.java */
    public static final class c implements InterfaceC29904k.a {
        public c() {
        }

        @Override // com.avito.android.di.component.InterfaceC29904k.a
        public final InterfaceC29904k a(boolean z12, InterfaceC29903j interfaceC29903j, InterfaceC39417a interfaceC39417a, I i12) {
            interfaceC39417a.getClass();
            return new b(interfaceC29903j, interfaceC39417a, i12, Boolean.valueOf(z12), null);
        }
    }

    public static InterfaceC29904k.a a() {
        return new c();
    }
}
