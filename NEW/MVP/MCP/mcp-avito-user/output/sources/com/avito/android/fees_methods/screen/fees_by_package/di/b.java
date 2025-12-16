package com.avito.android.fees_methods.screen.fees_by_package.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.fees_methods.screen.fees_by_package.di.c;
import com.avito.android.fees_methods.screen.fees_by_package.ui.FeesByPackageFragment;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import zE.InterfaceC50445a;

/* compiled from: DaggerFeesByPackageComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class b {

    /* compiled from: DaggerFeesByPackageComponent.java */
    /* renamed from: com.avito.android.fees_methods.screen.fees_by_package.di.b$b, reason: collision with other inner class name */
    public static final class C4618b implements c.a {
        public C4618b() {
        }

        @Override // com.avito.android.fees_methods.screen.fees_by_package.di.c.a
        public final com.avito.android.fees_methods.screen.fees_by_package.di.c a(InterfaceC50445a interfaceC50445a, InterfaceC39417a interfaceC39417a, String str, boolean z12, r rVar) {
            interfaceC39417a.getClass();
            return new c(interfaceC50445a, interfaceC39417a, str, Boolean.valueOf(z12), rVar, null);
        }
    }

    /* compiled from: DaggerFeesByPackageComponent.java */
    public static final class c implements com.avito.android.fees_methods.screen.fees_by_package.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f157980a;

        /* renamed from: b, reason: collision with root package name */
        public final u<AE.a> f157981b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f157982c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.fees_methods.screen.fees_by_package.mvi.d f157983d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.fees_methods.screen.fees_by_package.mvi.b f157984e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f157985f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f157986g;

        /* renamed from: h, reason: collision with root package name */
        public final l f157987h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.fees_methods.screen.fees_by_package.ui.j f157988i;

        /* compiled from: DaggerFeesByPackageComponent.java */
        public static final class a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC50445a f157989a;

            public a(InterfaceC50445a interfaceC50445a) {
                this.f157989a = interfaceC50445a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f157989a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerFeesByPackageComponent.java */
        /* renamed from: com.avito.android.fees_methods.screen.fees_by_package.di.b$c$b, reason: collision with other inner class name */
        public static final class C4619b implements u<AE.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC50445a f157990a;

            public C4619b(InterfaceC50445a interfaceC50445a) {
                this.f157990a = interfaceC50445a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                AE.a aVarQm = this.f157990a.qm();
                t.c(aVarQm);
                return aVarQm;
            }
        }

        /* compiled from: DaggerFeesByPackageComponent.java */
        /* renamed from: com.avito.android.fees_methods.screen.fees_by_package.di.b$c$c, reason: collision with other inner class name */
        public static final class C4620c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC50445a f157991a;

            public C4620c(InterfaceC50445a interfaceC50445a) {
                this.f157991a = interfaceC50445a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f157991a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(InterfaceC50445a interfaceC50445a, cv.b bVar, String str, Boolean bool, r rVar, a aVar) {
            this.f157980a = bVar;
            com.avito.android.fees_methods.screen.fees_by_package.domain.b bVar2 = new com.avito.android.fees_methods.screen.fees_by_package.domain.b(l.a(str), new C4619b(interfaceC50445a), new a(interfaceC50445a));
            this.f157983d = new com.avito.android.fees_methods.screen.fees_by_package.mvi.d(bVar2);
            this.f157984e = new com.avito.android.fees_methods.screen.fees_by_package.mvi.b(bVar2);
            this.f157985f = new C4620c(interfaceC50445a);
            this.f157986g = dagger.internal.g.d(new C30060h5(this.f157985f, new j(l.a(rVar))));
            this.f157987h = l.a(bool);
            this.f157988i = new com.avito.android.fees_methods.screen.fees_by_package.ui.j(new com.avito.android.fees_methods.screen.fees_by_package.mvi.g(this.f157983d, this.f157984e, com.avito.android.fees_methods.screen.fees_by_package.mvi.i.a(), com.avito.android.fees_methods.screen.fees_by_package.mvi.k.a(), this.f157986g, this.f157987h));
        }

        @Override // com.avito.android.fees_methods.screen.fees_by_package.di.c
        public final void a(FeesByPackageFragment feesByPackageFragment) {
            feesByPackageFragment.f158065n0 = this.f157988i;
            feesByPackageFragment.f158066o0 = this.f157986g.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f157980a.u4();
            t.c(aVarU4);
            feesByPackageFragment.f158067p0 = aVarU4;
        }
    }

    public static c.a a() {
        return new C4618b();
    }
}
