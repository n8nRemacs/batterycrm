package com.avito.android.safety.sessions.info.di;

import android.content.res.Resources;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.auth.SessionsInfoLink;
import com.avito.android.safety.sessions.info.SessionsInfoFragment;
import com.avito.android.safety.sessions.info.di.b;
import com.avito.android.safety.sessions.info.h;
import com.avito.android.safety.sessions.info.m;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSessionsInfoComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSessionsInfoComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.safety.sessions.info.di.b.a
        public final com.avito.android.safety.sessions.info.di.b a(SessionsInfoLink.SessionsInfoParams sessionsInfoParams, r rVar, Resources resources, com.avito.android.safety.sessions.info.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(new d(), cVar, interfaceC39417a, sessionsInfoParams, rVar, resources, null);
        }
    }

    /* compiled from: DaggerSessionsInfoComponent.java */
    public static final class c implements com.avito.android.safety.sessions.info.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.safety.sessions.info.di.c f257955a;

        /* renamed from: b, reason: collision with root package name */
        public final l f257956b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f257957c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.safety.sessions.info.b> f257958d;

        /* renamed from: e, reason: collision with root package name */
        public final u<E> f257959e;

        /* renamed from: f, reason: collision with root package name */
        public final u<h> f257960f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f257961g;

        /* renamed from: h, reason: collision with root package name */
        public final u<C28478k> f257962h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f257963i;

        /* compiled from: DaggerSessionsInfoComponent.java */
        /* renamed from: com.avito.android.safety.sessions.info.di.a$c$a, reason: collision with other inner class name */
        public static final class C7742a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.sessions.info.di.c f257964a;

            public C7742a(com.avito.android.safety.sessions.info.di.c cVar) {
                this.f257964a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f257964a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerSessionsInfoComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f257965a;

            public b(cv.b bVar) {
                this.f257965a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f257965a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSessionsInfoComponent.java */
        /* renamed from: com.avito.android.safety.sessions.info.di.a$c$c, reason: collision with other inner class name */
        public static final class C7743c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.sessions.info.di.c f257966a;

            public C7743c(com.avito.android.safety.sessions.info.di.c cVar) {
                this.f257966a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f257966a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(d dVar, com.avito.android.safety.sessions.info.di.c cVar, cv.b bVar, SessionsInfoLink.SessionsInfoParams sessionsInfoParams, r rVar, Resources resources, C7741a c7741a) {
            this.f257955a = cVar;
            this.f257956b = l.a(sessionsInfoParams);
            this.f257957c = new b(bVar);
            u<com.avito.android.safety.sessions.info.b> uVarD = g.d(new com.avito.android.safety.sessions.info.d(l.a(resources)));
            this.f257958d = uVarD;
            this.f257960f = g.d(new m(this.f257956b, uVarD, this.f257957c, new C7742a(cVar)));
            this.f257961g = new C7743c(cVar);
            u<C28478k> uVarD2 = g.d(new e(dVar, l.a(rVar)));
            this.f257962h = uVarD2;
            this.f257963i = com.avito.android.advert.item.delivery_suggests.l.i(this.f257961g, uVarD2);
        }

        @Override // com.avito.android.safety.sessions.info.di.b
        public final void a(SessionsInfoFragment sessionsInfoFragment) {
            sessionsInfoFragment.f257944n0 = this.f257960f.get();
            com.avito.android.safety.sessions.info.di.c cVar = this.f257955a;
            sessionsInfoFragment.f257945o0 = cVar.g4();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            sessionsInfoFragment.f257946p0 = interfaceC28373aA;
            sessionsInfoFragment.f257947q0 = this.f257963i.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
