package com.avito.android.tariff.cpx.info.sf.terms.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.tariff.cpx.info.sf.terms.TariffCpxInfoSfTermsDialogFragment;
import com.avito.android.tariff.cpx.info.sf.terms.di.b;
import com.avito.android.tariff.cpx.info.sf.terms.domain.TariffCpxInfoSfTermsContent;
import com.avito.android.tariff.cpx.info.sf.terms.mvi.i;
import com.avito.android.tariff.cpx.info.sf.terms.mvi.k;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTariffCpxInfoSfTermsComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffCpxInfoSfTermsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff.cpx.info.sf.terms.di.b.a
        public final com.avito.android.tariff.cpx.info.sf.terms.di.b a(WA0.b bVar, InterfaceC39417a interfaceC39417a, r rVar, TariffCpxInfoSfTermsContent tariffCpxInfoSfTermsContent) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, bVar, rVar, tariffCpxInfoSfTermsContent, null);
        }
    }

    /* compiled from: DaggerTariffCpxInfoSfTermsComponent.java */
    public static final class c implements com.avito.android.tariff.cpx.info.sf.terms.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f296845a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f296846b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f296847c;

        /* renamed from: d, reason: collision with root package name */
        public final u<RB0.a> f296848d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f296849e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.info.sf.terms.u f296850f;

        /* compiled from: DaggerTariffCpxInfoSfTermsComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.info.sf.terms.di.a$c$a, reason: collision with other inner class name */
        public static final class C9039a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296851a;

            public C9039a(WA0.b bVar) {
                this.f296851a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f296851a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTariffCpxInfoSfTermsComponent.java */
        public static final class b implements u<RB0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296852a;

            public b(WA0.b bVar) {
                this.f296852a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                RB0.a aVarB6 = this.f296852a.B6();
                t.c(aVarB6);
                return aVarB6;
            }
        }

        /* compiled from: DaggerTariffCpxInfoSfTermsComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.info.sf.terms.di.a$c$c, reason: collision with other inner class name */
        public static final class C9040c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296853a;

            public C9040c(WA0.b bVar) {
                this.f296853a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f296853a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(cv.b bVar, WA0.b bVar2, r rVar, TariffCpxInfoSfTermsContent tariffCpxInfoSfTermsContent, C9038a c9038a) {
            this.f296845a = bVar;
            this.f296846b = new C9040c(bVar2);
            this.f296847c = g.d(new C30060h5(this.f296846b, new f(l.a(rVar))));
            this.f296850f = new com.avito.android.tariff.cpx.info.sf.terms.u(new com.avito.android.tariff.cpx.info.sf.terms.mvi.g(new com.avito.android.tariff.cpx.info.sf.terms.mvi.d(l.a(tariffCpxInfoSfTermsContent)), new com.avito.android.tariff.cpx.info.sf.terms.mvi.b(new com.avito.android.tariff.cpx.info.sf.terms.domain.b(new b(bVar2), new C9039a(bVar2))), i.a(), k.a(), this.f296847c));
        }

        @Override // com.avito.android.tariff.cpx.info.sf.terms.di.b
        public final void a(TariffCpxInfoSfTermsDialogFragment tariffCpxInfoSfTermsDialogFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f296845a.u4();
            t.c(aVarU4);
            tariffCpxInfoSfTermsDialogFragment.f296816h0 = aVarU4;
            tariffCpxInfoSfTermsDialogFragment.f296817i0 = this.f296847c.get();
            tariffCpxInfoSfTermsDialogFragment.f296819k0 = this.f296850f;
        }
    }

    public static b.a a() {
        return new b();
    }
}
