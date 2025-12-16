package com.avito.android.tariff_lf_constructor.configure.level.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_lf_constructor.configure.level.ConstructorConfigureLevelFragment;
import com.avito.android.tariff_lf_constructor.configure.level.di.a;
import com.avito.android.tariff_lf_constructor.configure.level.h;
import com.avito.android.tariff_lf_constructor.configure.level.mvi.f;
import com.avito.android.tariff_lf_constructor.configure.level.mvi.i;
import com.avito.android.tariff_lf_constructor.configure.level.mvi.k;
import com.avito.android.tariff_lf_constructor.configure.level.mvi.m;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gD0.InterfaceC40574b;
import pD0.InterfaceC46937a;

/* compiled from: DaggerConstructorConfigureLevelComponent.java */
@e
/* loaded from: classes4.dex */
public final class d {

    /* compiled from: DaggerConstructorConfigureLevelComponent.java */
    public static final class b implements com.avito.android.tariff_lf_constructor.configure.level.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f299804a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC46937a> f299805b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f299806c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.level.domain.a> f299807d;

        /* renamed from: e, reason: collision with root package name */
        public final f f299808e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.tariff_lf_constructor.configure.level.mvi.d f299809f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f299810g;

        /* renamed from: h, reason: collision with root package name */
        public final u<C28478k> f299811h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f299812i;

        /* renamed from: j, reason: collision with root package name */
        public final h f299813j;

        /* compiled from: DaggerConstructorConfigureLevelComponent.java */
        public static final class a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f299814a;

            public a(InterfaceC40574b interfaceC40574b) {
                this.f299814a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f299814a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerConstructorConfigureLevelComponent.java */
        /* renamed from: com.avito.android.tariff_lf_constructor.configure.level.di.d$b$b, reason: collision with other inner class name */
        public static final class C9175b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f299815a;

            public C9175b(InterfaceC40574b interfaceC40574b) {
                this.f299815a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f299815a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerConstructorConfigureLevelComponent.java */
        public static final class c implements u<InterfaceC46937a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f299816a;

            public c(InterfaceC40574b interfaceC40574b) {
                this.f299816a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC46937a interfaceC46937aJd = this.f299816a.Jd();
                t.c(interfaceC46937aJd);
                return interfaceC46937aJd;
            }
        }

        public b(InterfaceC40574b interfaceC40574b, cv.b bVar, r rVar, String str, a aVar) {
            this.f299804a = bVar;
            u<com.avito.android.tariff_lf_constructor.configure.level.domain.a> uVarD = g.d(new com.avito.android.tariff_lf_constructor.configure.level.domain.c(l.a(str), new c(interfaceC40574b), new a(interfaceC40574b)));
            this.f299807d = uVarD;
            this.f299808e = new f(uVarD);
            this.f299809f = new com.avito.android.tariff_lf_constructor.configure.level.mvi.d(uVarD);
            this.f299810g = new C9175b(interfaceC40574b);
            u<C28478k> uVarD2 = g.d(new com.avito.android.tariff_lf_constructor.configure.level.di.c(l.a(rVar)));
            this.f299811h = uVarD2;
            this.f299812i = com.avito.android.advert.item.delivery_suggests.l.i(this.f299810g, uVarD2);
            this.f299813j = new h(new i(this.f299808e, this.f299809f, k.a(), m.a(), this.f299812i));
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.level.di.a
        public final void a(ConstructorConfigureLevelFragment constructorConfigureLevelFragment) {
            constructorConfigureLevelFragment.f299738n0 = this.f299813j;
            constructorConfigureLevelFragment.f299740p0 = this.f299812i.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f299804a.u4();
            t.c(aVarU4);
            constructorConfigureLevelFragment.f299742r0 = aVarU4;
        }
    }

    /* compiled from: DaggerConstructorConfigureLevelComponent.java */
    public static final class c implements a.InterfaceC9174a {
        public c() {
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.level.di.a.InterfaceC9174a
        public final com.avito.android.tariff_lf_constructor.configure.level.di.a a(InterfaceC40574b interfaceC40574b, InterfaceC39417a interfaceC39417a, r rVar, String str) {
            interfaceC39417a.getClass();
            return new b(interfaceC40574b, interfaceC39417a, rVar, str, null);
        }
    }

    public static a.InterfaceC9174a a() {
        return new c();
    }
}
