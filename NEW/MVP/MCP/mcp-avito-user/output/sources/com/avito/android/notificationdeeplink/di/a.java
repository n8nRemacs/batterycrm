package com.avito.android.notificationdeeplink.di;

import Bk0.InterfaceC13158a;
import androidx.view.T0;
import com.avito.android.AnalyticParams;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.notification_center.counter.h;
import com.avito.android.notificationdeeplink.NotificationDeepLinkActivity;
import com.avito.android.notificationdeeplink.di.b;
import com.avito.android.notificationdeeplink.mvi.g;
import com.avito.android.remote.model.notification.Payload;
import com.avito.android.remote.notification.InterfaceC34350q;
import com.avito.android.remote.notification.NotificationIdentifier;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerNotificationDeepLinkComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerNotificationDeepLinkComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.notificationdeeplink.di.b.a
        public final com.avito.android.notificationdeeplink.di.b a(com.avito.android.notificationdeeplink.di.c cVar, InterfaceC39417a interfaceC39417a, NotificationDeepLinkActivity notificationDeepLinkActivity, DeepLink deepLink, NotificationIdentifier notificationIdentifier, Payload payload, AnalyticParams analyticParams, String str, boolean z12) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, notificationDeepLinkActivity, deepLink, notificationIdentifier, payload, analyticParams, str, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerNotificationDeepLinkComponent.java */
    public static final class c implements com.avito.android.notificationdeeplink.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f207765a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.notificationdeeplink.di.c f207766b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f207767c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.notification_center.push.c> f207768d;

        /* renamed from: e, reason: collision with root package name */
        public final u<h> f207769e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC34350q> f207770f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC13158a> f207771g;

        /* renamed from: h, reason: collision with root package name */
        public final l f207772h;

        /* renamed from: i, reason: collision with root package name */
        public final l f207773i;

        /* renamed from: j, reason: collision with root package name */
        public final l f207774j;

        /* renamed from: k, reason: collision with root package name */
        public final l f207775k;

        /* renamed from: l, reason: collision with root package name */
        public final l f207776l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.notificationdeeplink.mvi.b f207777m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.notificationdeeplink.h f207778n;

        /* compiled from: DaggerNotificationDeepLinkComponent.java */
        /* renamed from: com.avito.android.notificationdeeplink.di.a$c$a, reason: collision with other inner class name */
        public static final class C6199a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notificationdeeplink.di.c f207779a;

            public C6199a(com.avito.android.notificationdeeplink.di.c cVar) {
                this.f207779a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f207779a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerNotificationDeepLinkComponent.java */
        public static final class b implements u<com.avito.android.notification_center.push.c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notificationdeeplink.di.c f207780a;

            public b(com.avito.android.notificationdeeplink.di.c cVar) {
                this.f207780a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.notification_center.push.c cVarJ8 = this.f207780a.j8();
                t.c(cVarJ8);
                return cVarJ8;
            }
        }

        /* compiled from: DaggerNotificationDeepLinkComponent.java */
        /* renamed from: com.avito.android.notificationdeeplink.di.a$c$c, reason: collision with other inner class name */
        public static final class C6200c implements u<h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notificationdeeplink.di.c f207781a;

            public C6200c(com.avito.android.notificationdeeplink.di.c cVar) {
                this.f207781a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                h hVarG7 = this.f207781a.G7();
                t.c(hVarG7);
                return hVarG7;
            }
        }

        /* compiled from: DaggerNotificationDeepLinkComponent.java */
        public static final class d implements u<InterfaceC13158a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notificationdeeplink.di.c f207782a;

            public d(com.avito.android.notificationdeeplink.di.c cVar) {
                this.f207782a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13158a interfaceC13158aGa = this.f207782a.ga();
                t.c(interfaceC13158aGa);
                return interfaceC13158aGa;
            }
        }

        /* compiled from: DaggerNotificationDeepLinkComponent.java */
        public static final class e implements u<InterfaceC34350q> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.notificationdeeplink.di.c f207783a;

            public e(com.avito.android.notificationdeeplink.di.c cVar) {
                this.f207783a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34350q interfaceC34350qE3 = this.f207783a.E3();
                t.c(interfaceC34350qE3);
                return interfaceC34350qE3;
            }
        }

        public c(com.avito.android.notificationdeeplink.di.c cVar, cv.b bVar, T0 t02, DeepLink deepLink, NotificationIdentifier notificationIdentifier, Payload payload, AnalyticParams analyticParams, String str, Boolean bool, C6198a c6198a) {
            this.f207765a = bVar;
            this.f207766b = cVar;
            this.f207767c = new C6199a(cVar);
            this.f207768d = new b(cVar);
            this.f207769e = new C6200c(cVar);
            this.f207770f = new e(cVar);
            this.f207771g = new d(cVar);
            this.f207772h = l.b(deepLink);
            this.f207773i = l.b(notificationIdentifier);
            this.f207774j = l.b(payload);
            this.f207775k = l.b(analyticParams);
            this.f207776l = l.b(str);
            this.f207777m = new com.avito.android.notificationdeeplink.mvi.b(this.f207767c, this.f207768d, this.f207769e, this.f207770f, this.f207771g, this.f207772h, this.f207773i, this.f207774j, this.f207775k, this.f207776l, l.a(bool));
            this.f207778n = new com.avito.android.notificationdeeplink.h(new com.avito.android.notificationdeeplink.mvi.e(g.a(), this.f207777m));
        }

        @Override // com.avito.android.notificationdeeplink.di.b
        public final void a(NotificationDeepLinkActivity notificationDeepLinkActivity) {
            notificationDeepLinkActivity.f207737m = this.f207778n;
            cv.b bVar = this.f207765a;
            com.avito.android.deeplink_handler.view.d dVarC = bVar.c();
            t.c(dVarC);
            notificationDeepLinkActivity.f207739o = dVarC;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            t.c(aVarU4);
            notificationDeepLinkActivity.f207740p = aVarU4;
            com.avito.android.notificationdeeplink.di.c cVar = this.f207766b;
            notificationDeepLinkActivity.f207741q = cVar.O();
            notificationDeepLinkActivity.f207742r = cVar.o2();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            notificationDeepLinkActivity.f207743s = interfaceC28373aA;
        }
    }

    public static b.a a() {
        return new b();
    }
}
