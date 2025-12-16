package com.avito.android.tariff.cpx.info.advance.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff.cpx.info.advance.TariffCpxInfoAdvanceDialogFragment;
import com.avito.android.tariff.cpx.info.advance.di.b;
import com.avito.android.tariff.cpx.info.advance.mvi.j;
import com.avito.android.tariff.cpx.info.advance.mvi.n;
import com.avito.android.tariff.deeplink.TariffCpxInfoAdvanceShowLinkBody;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import v50.g;

/* compiled from: DaggerTariffCpxInfoAdvanceComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffCpxInfoAdvanceComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff.cpx.info.advance.di.b.a
        public final com.avito.android.tariff.cpx.info.advance.di.b a(WA0.b bVar, InterfaceC39417a interfaceC39417a, r rVar, TariffCpxInfoAdvanceShowLinkBody tariffCpxInfoAdvanceShowLinkBody) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, bVar, rVar, tariffCpxInfoAdvanceShowLinkBody, null);
        }
    }

    /* compiled from: DaggerTariffCpxInfoAdvanceComponent.java */
    public static final class c implements com.avito.android.tariff.cpx.info.advance.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f296312a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f296313b;

        /* renamed from: c, reason: collision with root package name */
        public final u<C28478k> f296314c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f296315d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.info.advance.mvi.g f296316e;

        /* renamed from: f, reason: collision with root package name */
        public final u<g.b> f296317f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f296318g;

        /* renamed from: h, reason: collision with root package name */
        public final u<v50.g> f296319h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.info.advance.f f296320i;

        /* compiled from: DaggerTariffCpxInfoAdvanceComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.info.advance.di.a$c$a, reason: collision with other inner class name */
        public static final class C9019a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f296321a;

            public C9019a(cv.b bVar) {
                this.f296321a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f296321a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerTariffCpxInfoAdvanceComponent.java */
        public static final class b implements u<g.b> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296322a;

            public b(WA0.b bVar) {
                this.f296322a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f296322a.S1();
            }
        }

        /* compiled from: DaggerTariffCpxInfoAdvanceComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.info.advance.di.a$c$c, reason: collision with other inner class name */
        public static final class C9020c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296323a;

            public C9020c(WA0.b bVar) {
                this.f296323a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f296323a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(cv.b bVar, WA0.b bVar2, r rVar, TariffCpxInfoAdvanceShowLinkBody tariffCpxInfoAdvanceShowLinkBody, C9018a c9018a) {
            this.f296312a = bVar;
            this.f296313b = new C9020c(bVar2);
            u<C28478k> uVarD = dagger.internal.g.d(new h(l.a(rVar)));
            this.f296314c = uVarD;
            this.f296315d = com.avito.android.advert.item.delivery_suggests.l.i(this.f296313b, uVarD);
            this.f296316e = new com.avito.android.tariff.cpx.info.advance.mvi.g(l.a(tariffCpxInfoAdvanceShowLinkBody));
            u<v50.g> uVarD2 = dagger.internal.g.d(new g(new b(bVar2), new C9019a(bVar)));
            this.f296319h = uVarD2;
            this.f296320i = new com.avito.android.tariff.cpx.info.advance.f(new j(this.f296316e, new com.avito.android.tariff.cpx.info.advance.mvi.e(uVarD2), com.avito.android.tariff.cpx.info.advance.mvi.l.a(), n.a()));
        }

        @Override // com.avito.android.tariff.cpx.info.advance.di.b
        public final void a(TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f296312a.u4();
            t.c(aVarU4);
            tariffCpxInfoAdvanceDialogFragment.f296264h0 = aVarU4;
            tariffCpxInfoAdvanceDialogFragment.f296265i0 = this.f296315d.get();
            tariffCpxInfoAdvanceDialogFragment.f296266j0 = this.f296320i;
        }
    }

    public static b.a a() {
        return new b();
    }
}
