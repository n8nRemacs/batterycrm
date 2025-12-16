package com.avito.android.tariff.cpx.limit.sheet.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff.cpx.limit.sheet.TariffCpxLimitFragment;
import com.avito.android.tariff.cpx.limit.sheet.di.b;
import com.avito.android.tariff.cpx.limit.sheet.domain.TariffCpxLimitContent;
import com.avito.android.tariff.cpx.limit.sheet.mvi.i;
import com.avito.android.tariff.cpx.limit.sheet.mvi.m;
import com.avito.android.tariff.cpx.limit.sheet.mvi.o;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Locale;

/* compiled from: DaggerTariffCpxLimitComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffCpxLimitComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff.cpx.limit.sheet.di.b.a
        public final com.avito.android.tariff.cpx.limit.sheet.di.b a(r rVar, WA0.b bVar, InterfaceC39417a interfaceC39417a, TariffCpxLimitContent tariffCpxLimitContent) {
            interfaceC39417a.getClass();
            return new c(bVar, interfaceC39417a, rVar, tariffCpxLimitContent, null);
        }
    }

    /* compiled from: DaggerTariffCpxLimitComponent.java */
    public static final class c implements com.avito.android.tariff.cpx.limit.sheet.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final WA0.b f297275a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f297276b;

        /* renamed from: c, reason: collision with root package name */
        public final i f297277c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f297278d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.limit.sheet.mvi.g f297279e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Locale> f297280f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.limit.sheet.mvi.r f297281g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f297282h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C28478k> f297283i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f297284j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.limit.sheet.f f297285k;

        /* compiled from: DaggerTariffCpxLimitComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.limit.sheet.di.a$c$a, reason: collision with other inner class name */
        public static final class C9068a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f297286a;

            public C9068a(cv.b bVar) {
                this.f297286a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f297286a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerTariffCpxLimitComponent.java */
        public static final class b implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f297287a;

            public b(WA0.b bVar) {
                this.f297287a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f297287a.locale();
            }
        }

        /* compiled from: DaggerTariffCpxLimitComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.limit.sheet.di.a$c$c, reason: collision with other inner class name */
        public static final class C9069c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f297288a;

            public C9069c(WA0.b bVar) {
                this.f297288a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f297288a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(WA0.b bVar, cv.b bVar2, r rVar, TariffCpxLimitContent tariffCpxLimitContent, C9067a c9067a) {
            this.f297275a = bVar;
            this.f297276b = bVar2;
            this.f297277c = new i(l.a(tariffCpxLimitContent));
            this.f297279e = new com.avito.android.tariff.cpx.limit.sheet.mvi.g(new C9068a(bVar2));
            this.f297281g = new com.avito.android.tariff.cpx.limit.sheet.mvi.r(new b(bVar));
            this.f297282h = new C9069c(bVar);
            u<C28478k> uVarD = dagger.internal.g.d(new e(l.a(rVar)));
            this.f297283i = uVarD;
            this.f297284j = com.avito.android.advert.item.delivery_suggests.l.i(this.f297282h, uVarD);
            this.f297285k = new com.avito.android.tariff.cpx.limit.sheet.f(new m(this.f297277c, this.f297279e, o.a(), this.f297281g, this.f297284j));
        }

        @Override // com.avito.android.tariff.cpx.limit.sheet.di.b
        public final void a(TariffCpxLimitFragment tariffCpxLimitFragment) {
            tariffCpxLimitFragment.f297227h0 = this.f297285k;
            tariffCpxLimitFragment.f297229j0 = this.f297284j.get();
            InterfaceC28373a interfaceC28373aA = this.f297275a.a();
            t.c(interfaceC28373aA);
            tariffCpxLimitFragment.f297230k0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f297276b.u4();
            t.c(aVarU4);
            tariffCpxLimitFragment.f297231l0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
