package com.avito.android.tariff.cpx.info.sf.menu.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.tariff.cpx.info.sf.menu.TariffCpxInfoSfMenuDialogFragment;
import com.avito.android.tariff.cpx.info.sf.menu.di.b;
import com.avito.android.tariff.cpx.info.sf.menu.domain.TariffCpxInfoSfMenuContent;
import com.avito.android.tariff.cpx.info.sf.menu.mvi.i;
import com.avito.android.tariff.cpx.info.sf.menu.mvi.k;
import com.avito.android.tariff.cpx.info.sf.menu.n;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTariffCpxInfoSfMenuComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffCpxInfoSfMenuComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff.cpx.info.sf.menu.di.b.a
        public final com.avito.android.tariff.cpx.info.sf.menu.di.b a(WA0.b bVar, InterfaceC39417a interfaceC39417a, r rVar, TariffCpxInfoSfMenuContent tariffCpxInfoSfMenuContent) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, bVar, rVar, tariffCpxInfoSfMenuContent, null);
        }
    }

    /* compiled from: DaggerTariffCpxInfoSfMenuComponent.java */
    public static final class c implements com.avito.android.tariff.cpx.info.sf.menu.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f296775a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f296776b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f296777c;

        /* renamed from: d, reason: collision with root package name */
        public final n f296778d;

        /* compiled from: DaggerTariffCpxInfoSfMenuComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.info.sf.menu.di.a$c$a, reason: collision with other inner class name */
        public static final class C9037a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296779a;

            public C9037a(WA0.b bVar) {
                this.f296779a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f296779a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(cv.b bVar, WA0.b bVar2, r rVar, TariffCpxInfoSfMenuContent tariffCpxInfoSfMenuContent, C9036a c9036a) {
            this.f296775a = bVar;
            this.f296776b = new C9037a(bVar2);
            this.f296777c = g.d(new C30060h5(this.f296776b, new f(l.a(rVar))));
            this.f296778d = new n(new com.avito.android.tariff.cpx.info.sf.menu.mvi.g(new com.avito.android.tariff.cpx.info.sf.menu.mvi.d(l.a(tariffCpxInfoSfMenuContent)), com.avito.android.tariff.cpx.info.sf.menu.mvi.b.a(), i.a(), k.a(), this.f296777c));
        }

        @Override // com.avito.android.tariff.cpx.info.sf.menu.di.b
        public final void a(TariffCpxInfoSfMenuDialogFragment tariffCpxInfoSfMenuDialogFragment) {
            cv.b bVar = this.f296775a;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            t.c(aVarU4);
            tariffCpxInfoSfMenuDialogFragment.f296744h0 = aVarU4;
            tariffCpxInfoSfMenuDialogFragment.f296745i0 = this.f296777c.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU42 = bVar.u4();
            t.c(aVarU42);
            tariffCpxInfoSfMenuDialogFragment.f296747k0 = aVarU42;
            tariffCpxInfoSfMenuDialogFragment.f296748l0 = this.f296778d;
        }
    }

    public static b.a a() {
        return new b();
    }
}
