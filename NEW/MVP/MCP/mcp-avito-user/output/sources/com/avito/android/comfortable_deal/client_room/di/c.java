package com.avito.android.comfortable_deal.client_room.di;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.client_room.ClientRoomFragment;
import com.avito.android.comfortable_deal.client_room.G;
import com.avito.android.comfortable_deal.client_room.di.a;
import com.avito.android.comfortable_deal.client_room.model.ClientRoomArguments;
import com.avito.android.comfortable_deal.client_room.mvi.i;
import com.avito.android.comfortable_deal.client_room.mvi.k;
import com.avito.android.comfortable_deal.client_room.mvi.n;
import com.avito.android.comfortable_deal.client_room.mvi.p;
import com.avito.android.comfortable_deal.client_room.mvi.r;
import com.avito.android.comfortable_deal.client_room.s;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import ep.C40141c;
import ep.InterfaceC40139a;

/* compiled from: DaggerClientRoomComponent.java */
@e
/* loaded from: classes12.dex */
public final class c {

    /* compiled from: DaggerClientRoomComponent.java */
    public static final class b implements com.avito.android.comfortable_deal.client_room.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f119822a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28373a> f119823b;

        /* renamed from: c, reason: collision with root package name */
        public final l f119824c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC40139a> f119825d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.review.data_source.a> f119826e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Context> f119827f;

        /* renamed from: g, reason: collision with root package name */
        public final r f119828g;

        /* renamed from: h, reason: collision with root package name */
        public final G f119829h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f119830i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f119831j;

        /* compiled from: DaggerClientRoomComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.client_room.di.b f119832a;

            public a(com.avito.android.comfortable_deal.client_room.di.b bVar) {
                this.f119832a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f119832a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerClientRoomComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.client_room.di.c$b$b, reason: collision with other inner class name */
        public static final class C3519b implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.client_room.di.b f119833a;

            public C3519b(com.avito.android.comfortable_deal.client_room.di.b bVar) {
                this.f119833a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f119833a.g();
            }
        }

        /* compiled from: DaggerClientRoomComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.client_room.di.c$b$c, reason: collision with other inner class name */
        public static final class C3520c implements u<com.avito.android.review.data_source.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.client_room.di.b f119834a;

            public C3520c(com.avito.android.comfortable_deal.client_room.di.b bVar) {
                this.f119834a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f119834a.wi();
            }
        }

        /* compiled from: DaggerClientRoomComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.client_room.di.b f119835a;

            public d(com.avito.android.comfortable_deal.client_room.di.b bVar) {
                this.f119835a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f119835a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.comfortable_deal.client_room.di.b bVar, cv.b bVar2, C28478k c28478k, ClientRoomArguments clientRoomArguments, a aVar) {
            this.f119822a = bVar2;
            this.f119823b = new a(bVar);
            l lVarA = l.a(clientRoomArguments);
            this.f119824c = lVarA;
            u<InterfaceC40139a> uVarA = B.a(new C40141c(lVarA, this.f119823b));
            this.f119825d = uVarA;
            C3520c c3520c = new C3520c(bVar);
            C3519b c3519b = new C3519b(bVar);
            k kVar = new k(uVarA, c3520c, this.f119824c, new s(c3519b));
            i iVar = new i(uVarA);
            this.f119828g = new r(c3519b);
            this.f119829h = new G(new n(kVar, iVar, p.a(), this.f119828g));
            this.f119830i = new d(bVar);
            this.f119831j = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f119830i);
        }

        @Override // com.avito.android.comfortable_deal.client_room.di.a
        public final void a(ClientRoomFragment clientRoomFragment) {
            clientRoomFragment.f119787n0 = this.f119829h;
            clientRoomFragment.f119789p0 = this.f119831j.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f119822a.u4();
            t.c(aVarU4);
            clientRoomFragment.f119791r0 = aVarU4;
        }
    }

    /* compiled from: DaggerClientRoomComponent.java */
    /* renamed from: com.avito.android.comfortable_deal.client_room.di.c$c, reason: collision with other inner class name */
    public static final class C3521c implements a.b {
        public C3521c() {
        }

        @Override // com.avito.android.comfortable_deal.client_room.di.a.b
        public final com.avito.android.comfortable_deal.client_room.di.a a(com.avito.android.comfortable_deal.client_room.di.b bVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, ClientRoomArguments clientRoomArguments) {
            interfaceC39417a.getClass();
            clientRoomArguments.getClass();
            return new b(bVar, interfaceC39417a, c28478k, clientRoomArguments, null);
        }
    }

    public static a.b a() {
        return new C3521c();
    }
}
