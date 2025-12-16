package com.avito.android.notifications_settings.screen.di;

import Ek0.InterfaceC13498a;
import Pz.C14860a;
import Y41.l;
import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.notifications_settings.screen.NotificationsSettingsActivity;
import com.avito.android.notifications_settings.screen.di.b;
import com.avito.android.notifications_settings.screen.di.g;
import com.avito.android.notifications_settings.screen.i;
import com.avito.android.notifications_settings.screen.k;
import com.avito.android.notifications_settings.screen.l;
import com.avito.android.notifications_settings.screen.m;
import com.avito.android.notifications_settings.screen.mvi.p;
import com.avito.android.notifications_settings.screen.mvi.r;
import com.avito.android.notifications_settings.screen.mvi.t;
import com.avito.android.notifications_settings.screen.n;
import com.avito.android.notifications_settings.toggle.NotificationsSettingsToggleItem;
import com.avito.android.util.InterfaceC35741a1;
import cv.InterfaceC39417a;
import dagger.internal.u;

/* compiled from: DaggerNotificationsSettingsComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerNotificationsSettingsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.notifications_settings.screen.di.b.a
        public final com.avito.android.notifications_settings.screen.di.b a(com.avito.android.notifications_settings.screen.di.c cVar, InterfaceC39417a interfaceC39417a, Resources resources, boolean z12, C28478k c28478k, l lVar) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, resources, Boolean.valueOf(z12), c28478k, lVar, null);
        }
    }

    /* compiled from: DaggerNotificationsSettingsComponent.java */
    public static final class c implements com.avito.android.notifications_settings.screen.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.notifications_settings.screen.di.c f208058a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC13498a> f208059b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.notifications_settings.screen.mvi.l> f208060c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.notifications_settings.screen.mvi.h f208061d;

        /* renamed from: e, reason: collision with root package name */
        public final u<l41.g<C14860a>> f208062e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC35741a1> f208063f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.notifications_settings.screen.mvi.f f208064g;

        /* renamed from: h, reason: collision with root package name */
        public final u<i> f208065h;

        /* renamed from: i, reason: collision with root package name */
        public final u<I30.d> f208066i;

        /* renamed from: j, reason: collision with root package name */
        public final t f208067j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f208068k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f208069l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f208070m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.notifications_settings.info.c> f208071n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.notifications_settings.info.b f208072o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.notifications_settings.title.c> f208073p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.notifications_settings.title.b f208074q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.jakewharton.rxrelay3.d<NotificationsSettingsToggleItem>> f208075r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.notifications_settings.toggle.c> f208076s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f208077t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f208078u;

        /* compiled from: DaggerNotificationsSettingsComponent.java */
        /* renamed from: com.avito.android.notifications_settings.screen.di.a$c$a, reason: collision with other inner class name */
        public static final class C6212a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notifications_settings.screen.di.c f208079a;

            public C6212a(com.avito.android.notifications_settings.screen.di.c cVar) {
                this.f208079a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f208079a.f();
                dagger.internal.t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerNotificationsSettingsComponent.java */
        public static final class b implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notifications_settings.screen.di.c f208080a;

            public b(com.avito.android.notifications_settings.screen.di.c cVar) {
                this.f208080a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f208080a.n();
                dagger.internal.t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerNotificationsSettingsComponent.java */
        /* renamed from: com.avito.android.notifications_settings.screen.di.a$c$c, reason: collision with other inner class name */
        public static final class C6213c implements u<I30.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notifications_settings.screen.di.c f208081a;

            public C6213c(com.avito.android.notifications_settings.screen.di.c cVar) {
                this.f208081a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f208081a.o1();
            }
        }

        /* compiled from: DaggerNotificationsSettingsComponent.java */
        public static final class d implements u<l41.g<C14860a>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notifications_settings.screen.di.c f208082a;

            public d(com.avito.android.notifications_settings.screen.di.c cVar) {
                this.f208082a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                l41.g<C14860a> gVarS9 = this.f208082a.S9();
                dagger.internal.t.c(gVarS9);
                return gVarS9;
            }
        }

        /* compiled from: DaggerNotificationsSettingsComponent.java */
        public static final class e implements u<InterfaceC13498a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notifications_settings.screen.di.c f208083a;

            public e(com.avito.android.notifications_settings.screen.di.c cVar) {
                this.f208083a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13498a interfaceC13498aF6 = this.f208083a.f6();
                dagger.internal.t.c(interfaceC13498aF6);
                return interfaceC13498aF6;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.notifications_settings.screen.di.c cVar, cv.b bVar, Resources resources, Boolean bool, C28478k c28478k, l lVar, C6211a c6211a) {
            this.f208058a = cVar;
            this.f208060c = dagger.internal.g.d(new p(new e(cVar)));
            dagger.internal.l lVarA = dagger.internal.l.a(bool);
            u<com.avito.android.notifications_settings.screen.mvi.l> uVar = this.f208060c;
            this.f208061d = new com.avito.android.notifications_settings.screen.mvi.h(lVarA, uVar);
            d dVar = new d(cVar);
            b bVar2 = new b(cVar);
            this.f208063f = bVar2;
            this.f208064g = new com.avito.android.notifications_settings.screen.mvi.f(uVar, dVar, bVar2);
            u<i> uVarD = dagger.internal.g.d(k.a());
            this.f208065h = uVarD;
            this.f208067j = new t(uVarD, this.f208063f, new C6213c(cVar));
            this.f208068k = new C6212a(cVar);
            this.f208069l = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f208068k);
            this.f208070m = dagger.internal.l.a(new n(new m(new com.avito.android.notifications_settings.screen.mvi.k(this.f208061d, this.f208064g, r.a(), this.f208067j, this.f208069l))));
            u<com.avito.android.notifications_settings.info.c> uVarD2 = dagger.internal.g.d(com.avito.android.notifications_settings.info.e.a());
            this.f208071n = uVarD2;
            this.f208072o = new com.avito.android.notifications_settings.info.b(uVarD2);
            u<com.avito.android.notifications_settings.title.c> uVarD3 = dagger.internal.g.d(com.avito.android.notifications_settings.title.e.a());
            this.f208073p = uVarD3;
            this.f208074q = new com.avito.android.notifications_settings.title.b(uVarD3);
            this.f208075r = dagger.internal.g.d(g.a.f208089a);
            u<com.avito.android.notifications_settings.toggle.c> uVarD4 = dagger.internal.g.d(new com.avito.android.notifications_settings.toggle.f(dagger.internal.l.a(lVar), this.f208075r));
            this.f208076s = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new f(this.f208072o, this.f208074q, new com.avito.android.notifications_settings.toggle.b(uVarD4)));
            this.f208077t = uVarD5;
            this.f208078u = dagger.internal.g.d(new com.avito.android.notifications_settings.screen.di.e(uVarD5));
        }

        @Override // com.avito.android.notifications_settings.screen.di.b
        public final void a(NotificationsSettingsActivity notificationsSettingsActivity) {
            notificationsSettingsActivity.f208025m = (l.a) this.f208070m.f393949a;
            notificationsSettingsActivity.f208027o = this.f208069l.get();
            com.avito.android.notifications_settings.screen.di.c cVar = this.f208058a;
            notificationsSettingsActivity.f208028p = cVar.h();
            notificationsSettingsActivity.f208029q = this.f208077t.get();
            notificationsSettingsActivity.f208030r = this.f208078u.get();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            notificationsSettingsActivity.f208031s = interfaceC28373aA;
        }
    }

    public static b.a a() {
        return new b();
    }
}
