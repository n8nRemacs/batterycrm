package com.avito.android.notification_center.list.di;

import Ek0.InterfaceC13498a;
import Y41.l;
import android.content.res.Resources;
import androidx.view.S0;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.di.module.C30065i;
import com.avito.android.notification_center.list.NotificationCenterListActivity;
import com.avito.android.notification_center.list.di.b;
import com.avito.android.notification_center.list.di.i;
import com.avito.android.notification_center.list.item.NotificationCenterListItem;
import com.avito.android.notification_center.list.item.m;
import com.avito.android.notification_center.list.item.q;
import com.avito.android.notification_center.list.mvi.p;
import com.avito.android.notification_center.list.n;
import com.avito.android.notification_center.list.t;
import com.avito.android.notification_center.list.v;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.remote.model.notification.NotificationResponseMapper_Factory;
import com.avito.android.remote.model.notification.NotificationsResponse;
import com.avito.android.remote.notification.InterfaceC34350q;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35741a1;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Locale;
import kotlin.G0;

/* compiled from: DaggerNotificationCenterListComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerNotificationCenterListComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.notification_center.list.di.b.a
        public final com.avito.android.notification_center.list.di.b a(com.avito.android.notification_center.list.di.c cVar, InterfaceC39417a interfaceC39417a, Resources resources, boolean z12, C28478k c28478k, l lVar, S0 s02) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, resources, Boolean.valueOf(z12), c28478k, lVar, s02, null);
        }
    }

    /* compiled from: DaggerNotificationCenterListComponent.java */
    public static final class c implements com.avito.android.notification_center.list.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final com.avito.android.notification_center.list.item.k f207537A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.jakewharton.rxrelay3.c<NotificationCenterListItem.ErrorSnippet>> f207538B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.notification_center.list.item.c> f207539C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f207540D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f207541E;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.notification_center.list.di.c f207542a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f207543b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC13498a> f207544c;

        /* renamed from: d, reason: collision with root package name */
        public final u<x> f207545d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.notification_center.list.j> f207546e;

        /* renamed from: f, reason: collision with root package name */
        public final E30.c f207547f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C> f207548g;

        /* renamed from: h, reason: collision with root package name */
        public final u<PreloadingPromiseTestGroup> f207549h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f207550i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28373a> f207551j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f207552k;

        /* renamed from: l, reason: collision with root package name */
        public final u<AbstractC33302a<G0, NotificationsResponse>> f207553l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC34350q> f207554m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.notification_center.push.b> f207555n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.notification_center.counter.b> f207556o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.notification_center.counter.h> f207557p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.notification_center.list.mvi.i f207558q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.notification_center.list.f> f207559r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC35741a1> f207560s;

        /* renamed from: t, reason: collision with root package name */
        public final p f207561t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC28481c> f207562u;

        /* renamed from: v, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f207563v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.l f207564w;

        /* renamed from: x, reason: collision with root package name */
        public final u<Locale> f207565x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.l f207566y;

        /* renamed from: z, reason: collision with root package name */
        public final u<m> f207567z;

        /* compiled from: DaggerNotificationCenterListComponent.java */
        /* renamed from: com.avito.android.notification_center.list.di.a$c$a, reason: collision with other inner class name */
        public static final class C6192a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notification_center.list.di.c f207568a;

            public C6192a(com.avito.android.notification_center.list.di.c cVar) {
                this.f207568a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f207568a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerNotificationCenterListComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notification_center.list.di.c f207569a;

            public b(com.avito.android.notification_center.list.di.c cVar) {
                this.f207569a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f207569a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerNotificationCenterListComponent.java */
        /* renamed from: com.avito.android.notification_center.list.di.a$c$c, reason: collision with other inner class name */
        public static final class C6193c implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notification_center.list.di.c f207570a;

            public C6193c(com.avito.android.notification_center.list.di.c cVar) {
                this.f207570a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f207570a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerNotificationCenterListComponent.java */
        public static final class d implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notification_center.list.di.c f207571a;

            public d(com.avito.android.notification_center.list.di.c cVar) {
                this.f207571a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f207571a.t();
                t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerNotificationCenterListComponent.java */
        public static final class e implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notification_center.list.di.c f207572a;

            public e(com.avito.android.notification_center.list.di.c cVar) {
                this.f207572a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f207572a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerNotificationCenterListComponent.java */
        public static final class f implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notification_center.list.di.c f207573a;

            public f(com.avito.android.notification_center.list.di.c cVar) {
                this.f207573a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f207573a.locale();
            }
        }

        /* compiled from: DaggerNotificationCenterListComponent.java */
        public static final class g implements u<com.avito.android.notification_center.push.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notification_center.list.di.c f207574a;

            public g(com.avito.android.notification_center.list.di.c cVar) {
                this.f207574a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.notification_center.push.b bVarDb = this.f207574a.db();
                t.c(bVarDb);
                return bVarDb;
            }
        }

        /* compiled from: DaggerNotificationCenterListComponent.java */
        public static final class h implements u<com.avito.android.notification_center.counter.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notification_center.list.di.c f207575a;

            public h(com.avito.android.notification_center.list.di.c cVar) {
                this.f207575a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.notification_center.counter.b bVarKb = this.f207575a.Kb();
                t.c(bVarKb);
                return bVarKb;
            }
        }

        /* compiled from: DaggerNotificationCenterListComponent.java */
        public static final class i implements u<com.avito.android.notification_center.counter.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notification_center.list.di.c f207576a;

            public i(com.avito.android.notification_center.list.di.c cVar) {
                this.f207576a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.notification_center.counter.h hVarG7 = this.f207576a.G7();
                t.c(hVarG7);
                return hVarG7;
            }
        }

        /* compiled from: DaggerNotificationCenterListComponent.java */
        public static final class j implements u<InterfaceC34350q> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notification_center.list.di.c f207577a;

            public j(com.avito.android.notification_center.list.di.c cVar) {
                this.f207577a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34350q interfaceC34350qE3 = this.f207577a.E3();
                t.c(interfaceC34350qE3);
                return interfaceC34350qE3;
            }
        }

        /* compiled from: DaggerNotificationCenterListComponent.java */
        public static final class k implements u<InterfaceC13498a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notification_center.list.di.c f207578a;

            public k(com.avito.android.notification_center.list.di.c cVar) {
                this.f207578a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13498a interfaceC13498aF6 = this.f207578a.f6();
                t.c(interfaceC13498aF6);
                return interfaceC13498aF6;
            }
        }

        /* compiled from: DaggerNotificationCenterListComponent.java */
        public static final class l implements u<PreloadingPromiseTestGroup> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notification_center.list.di.c f207579a;

            public l(com.avito.android.notification_center.list.di.c cVar) {
                this.f207579a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f207579a.Y1();
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.notification_center.list.di.c cVar, cv.b bVar, Resources resources, Boolean bool, C28478k c28478k, Y41.l lVar, S0 s02, C6191a c6191a) {
            this.f207542a = cVar;
            this.f207543b = bVar;
            this.f207544c = new k(cVar);
            u<com.avito.android.notification_center.list.j> uVarD = dagger.internal.g.d(new n(this.f207544c, NotificationResponseMapper_Factory.create(new d(cVar))));
            this.f207546e = uVarD;
            this.f207547f = new E30.c(uVarD);
            this.f207548g = new C6193c(cVar);
            this.f207549h = new l(cVar);
            this.f207550i = dagger.internal.l.a(s02);
            this.f207551j = new C6192a(cVar);
            dagger.internal.l lVarA = dagger.internal.l.a(c28478k);
            this.f207552k = lVarA;
            u<AbstractC33302a<G0, NotificationsResponse>> uVarD2 = dagger.internal.g.d(new com.avito.android.notification_center.list.di.h(this.f207547f, this.f207548g, this.f207549h, this.f207550i, this.f207551j, lVarA));
            this.f207553l = uVarD2;
            this.f207558q = new com.avito.android.notification_center.list.mvi.i(uVarD2, this.f207551j, this.f207546e, new j(cVar), new g(cVar), new h(cVar), new i(cVar));
            u<com.avito.android.notification_center.list.f> uVarD3 = dagger.internal.g.d(com.avito.android.notification_center.list.i.a());
            this.f207559r = uVarD3;
            this.f207561t = new p(uVarD3, new e(cVar));
            this.f207563v = dagger.internal.g.d(new C30065i(new b(cVar), this.f207552k));
            this.f207564w = dagger.internal.l.a(new v(new com.avito.android.notification_center.list.u(new com.avito.android.notification_center.list.mvi.l(this.f207558q, com.avito.android.notification_center.list.mvi.n.a(), this.f207561t, this.f207563v))));
            this.f207565x = new f(cVar);
            this.f207566y = dagger.internal.l.a(resources);
            u<m> uVarD4 = dagger.internal.g.d(new q(this.f207566y, dagger.internal.l.a(lVar), this.f207565x));
            this.f207567z = uVarD4;
            this.f207537A = new com.avito.android.notification_center.list.item.k(uVarD4);
            u<com.jakewharton.rxrelay3.c<NotificationCenterListItem.ErrorSnippet>> uVarD5 = dagger.internal.g.d(i.a.f207595a);
            this.f207538B = uVarD5;
            u<com.avito.android.notification_center.list.item.c> uVarD6 = dagger.internal.g.d(new com.avito.android.notification_center.list.item.g(uVarD5));
            this.f207539C = uVarD6;
            u<com.avito.konveyor.a> uVarD7 = dagger.internal.g.d(new com.avito.android.notification_center.list.di.g(this.f207537A, new com.avito.android.notification_center.list.item.b(uVarD6)));
            this.f207540D = uVarD7;
            this.f207541E = dagger.internal.g.d(new com.avito.android.notification_center.list.di.f(uVarD7));
        }

        @Override // com.avito.android.notification_center.list.di.b
        public final void a(NotificationCenterListActivity notificationCenterListActivity) {
            this.f207553l.get();
            notificationCenterListActivity.getClass();
            notificationCenterListActivity.f207505m = (t.a) this.f207564w.f393949a;
            notificationCenterListActivity.f207507o = this.f207563v.get();
            com.avito.android.notification_center.list.di.c cVar = this.f207542a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            notificationCenterListActivity.f207508p = interfaceC28373aA;
            notificationCenterListActivity.f207509q = this.f207541E.get();
            notificationCenterListActivity.f207510r = this.f207540D.get();
            notificationCenterListActivity.f207511s = this.f207538B.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f207543b.u4();
            dagger.internal.t.c(aVarU4);
            notificationCenterListActivity.f207512t = aVarU4;
            notificationCenterListActivity.f207513u = cVar.M0();
        }
    }

    public static b.a a() {
        return new b();
    }
}
