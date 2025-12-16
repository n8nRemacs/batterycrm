package com.avito.android.virtual_deal_room_client_creation.clients.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import com.avito.android.util.S3;
import com.avito.android.virtual_deal_room_client_creation.clients.ClientsFragment;
import com.avito.android.virtual_deal_room_client_creation.clients.K;
import com.avito.android.virtual_deal_room_client_creation.clients.di.a;
import com.avito.android.virtual_deal_room_client_creation.clients.model.ClientsArguments;
import com.avito.android.virtual_deal_room_client_creation.clients.mvi.h;
import com.avito.android.virtual_deal_room_client_creation.clients.mvi.j;
import com.avito.android.virtual_deal_room_client_creation.clients.mvi.l;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerClientsComponent.java */
@e
/* loaded from: classes5.dex */
public final class b {

    /* compiled from: DaggerClientsComponent.java */
    /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.di.b$b, reason: collision with other inner class name */
    public static final class C10095b implements com.avito.android.virtual_deal_room_client_creation.clients.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<UN0.a> f326524a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f326525b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.virtual_deal_room_client_creation.clients.interactor.a> f326526c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.virtual_deal_room_client_creation.clients.mvi.e f326527d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f326528e;

        /* renamed from: f, reason: collision with root package name */
        public final u<ON0.a> f326529f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.virtual_deal_room_client_creation.clients.mvi.c f326530g;

        /* renamed from: h, reason: collision with root package name */
        public final l f326531h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f326532i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f326533j;

        /* renamed from: k, reason: collision with root package name */
        public final K f326534k;

        /* compiled from: DaggerClientsComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.di.b$b$a */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final TN0.a f326535a;

            public a(TN0.a aVar) {
                this.f326535a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f326535a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerClientsComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.di.b$b$b, reason: collision with other inner class name */
        public static final class C10096b implements u<UN0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final TN0.a f326536a;

            public C10096b(TN0.a aVar) {
                this.f326536a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                UN0.a aVarLi = this.f326536a.Li();
                t.c(aVarLi);
                return aVarLi;
            }
        }

        /* compiled from: DaggerClientsComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.di.b$b$c */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final TN0.a f326537a;

            public c(TN0.a aVar) {
                this.f326537a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f326537a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerClientsComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.di.b$b$d */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final TN0.a f326538a;

            public d(TN0.a aVar) {
                this.f326538a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f326538a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public C10095b(TN0.a aVar, C28478k c28478k, ClientsArguments clientsArguments, a aVar2) {
            u<com.avito.android.virtual_deal_room_client_creation.clients.interactor.a> uVarD = g.d(new com.avito.android.virtual_deal_room_client_creation.clients.interactor.c(S3.f318734a, new C10096b(aVar), new c(aVar)));
            this.f326526c = uVarD;
            this.f326527d = new com.avito.android.virtual_deal_room_client_creation.clients.mvi.e(uVarD);
            u<ON0.a> uVarA = B.a(new ON0.c(new a(aVar)));
            this.f326529f = uVarA;
            this.f326530g = new com.avito.android.virtual_deal_room_client_creation.clients.mvi.c(uVarA, this.f326526c);
            this.f326531h = new l(com.avito.android.virtual_deal_room_client_creation.clients.mvi.builder.c.a());
            this.f326532i = new d(aVar);
            this.f326533j = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f326532i);
            this.f326534k = new K(new h(this.f326527d, this.f326530g, j.a(), this.f326531h, this.f326533j));
        }

        @Override // com.avito.android.virtual_deal_room_client_creation.clients.di.a
        public final void a(ClientsFragment clientsFragment) {
            clientsFragment.f326485n0 = this.f326534k;
            clientsFragment.f326487p0 = this.f326533j.get();
        }
    }

    /* compiled from: DaggerClientsComponent.java */
    public static final class c implements a.b {
        public c() {
        }

        @Override // com.avito.android.virtual_deal_room_client_creation.clients.di.a.b
        public final com.avito.android.virtual_deal_room_client_creation.clients.di.a a(TN0.a aVar, C28478k c28478k, ClientsArguments clientsArguments) {
            clientsArguments.getClass();
            return new C10095b(aVar, c28478k, clientsArguments, null);
        }
    }

    public static a.b a() {
        return new c();
    }
}
