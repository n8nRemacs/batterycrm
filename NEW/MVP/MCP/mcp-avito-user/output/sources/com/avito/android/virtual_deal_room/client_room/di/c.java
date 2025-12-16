package com.avito.android.virtual_deal_room.client_room.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import com.avito.android.util.S3;
import com.avito.android.virtual_deal_room.client_room.ClientRoomFragment;
import com.avito.android.virtual_deal_room.client_room.di.a;
import com.avito.android.virtual_deal_room.client_room.model.ClientRoomArguments;
import com.avito.android.virtual_deal_room.client_room.mvi.f;
import com.avito.android.virtual_deal_room.client_room.mvi.h;
import com.avito.android.virtual_deal_room.client_room.mvi.k;
import com.avito.android.virtual_deal_room.client_room.mvi.m;
import com.avito.android.virtual_deal_room.client_room.mvi.o;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Map;

/* compiled from: DaggerClientRoomComponent.java */
@e
/* loaded from: classes5.dex */
public final class c {

    /* compiled from: DaggerClientRoomComponent.java */
    public static final class b implements com.avito.android.virtual_deal_room.client_room.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f326267a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.virtual_deal_room.client_room.di.b f326268b;

        /* renamed from: c, reason: collision with root package name */
        public final u<IN0.a> f326269c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f326270d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f326271e;

        /* renamed from: f, reason: collision with root package name */
        public final l f326272f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.virtual_deal_room.client_room.interactor.a> f326273g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.virtual_deal_room.client_room.interactor.e> f326274h;

        /* renamed from: i, reason: collision with root package name */
        public final h f326275i;

        /* renamed from: j, reason: collision with root package name */
        public final f f326276j;

        /* renamed from: k, reason: collision with root package name */
        public final o f326277k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f326278l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f326279m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.virtual_deal_room.client_room.o f326280n;

        /* compiled from: DaggerClientRoomComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.virtual_deal_room.client_room.di.b f326281a;

            public a(com.avito.android.virtual_deal_room.client_room.di.b bVar) {
                this.f326281a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f326281a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerClientRoomComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room.client_room.di.c$b$b, reason: collision with other inner class name */
        public static final class C10086b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.virtual_deal_room.client_room.di.b f326282a;

            public C10086b(com.avito.android.virtual_deal_room.client_room.di.b bVar) {
                this.f326282a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f326282a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerClientRoomComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room.client_room.di.c$b$c, reason: collision with other inner class name */
        public static final class C10087c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.virtual_deal_room.client_room.di.b f326283a;

            public C10087c(com.avito.android.virtual_deal_room.client_room.di.b bVar) {
                this.f326283a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f326283a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerClientRoomComponent.java */
        public static final class d implements u<IN0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.virtual_deal_room.client_room.di.b f326284a;

            public d(com.avito.android.virtual_deal_room.client_room.di.b bVar) {
                this.f326284a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IN0.a aVarCk = this.f326284a.ck();
                t.c(aVarCk);
                return aVarCk;
            }
        }

        public b(com.avito.android.virtual_deal_room.client_room.di.b bVar, cv.b bVar2, C28478k c28478k, ClientRoomArguments clientRoomArguments, a aVar) {
            this.f326267a = bVar2;
            this.f326268b = bVar;
            this.f326269c = new d(bVar);
            this.f326270d = new C10086b(bVar);
            this.f326271e = new a(bVar);
            l lVarA = l.a(clientRoomArguments);
            this.f326272f = lVarA;
            u<com.avito.android.virtual_deal_room.client_room.interactor.a> uVarA = B.a(new com.avito.android.virtual_deal_room.client_room.interactor.c(lVarA, this.f326271e));
            this.f326273g = uVarA;
            u<com.avito.android.virtual_deal_room.client_room.interactor.e> uVarA2 = B.a(new com.avito.android.virtual_deal_room.client_room.interactor.h(this.f326269c, this.f326270d, uVarA, this.f326272f, S3.f318734a));
            this.f326274h = uVarA2;
            this.f326275i = new h(uVarA2);
            this.f326276j = new f(uVarA2, this.f326273g);
            this.f326277k = new o(com.avito.android.virtual_deal_room.client_room.mvi.builder.c.a());
            this.f326278l = new C10087c(bVar);
            this.f326279m = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f326278l);
            this.f326280n = new com.avito.android.virtual_deal_room.client_room.o(new k(this.f326275i, this.f326276j, m.a(), this.f326277k, this.f326279m, this.f326272f));
        }

        @Override // com.avito.android.virtual_deal_room.client_room.di.a
        public final void a(ClientRoomFragment clientRoomFragment) {
            clientRoomFragment.f326249n0 = this.f326280n;
            clientRoomFragment.f326251p0 = this.f326279m.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f326267a.u4();
            t.c(aVarU4);
            clientRoomFragment.f326252q0 = aVarU4;
            Map<Category, zN0.b> mapOe = this.f326268b.Oe();
            t.c(mapOe);
            clientRoomFragment.f326253r0 = mapOe;
        }
    }

    /* compiled from: DaggerClientRoomComponent.java */
    /* renamed from: com.avito.android.virtual_deal_room.client_room.di.c$c, reason: collision with other inner class name */
    public static final class C10088c implements a.b {
        public C10088c() {
        }

        @Override // com.avito.android.virtual_deal_room.client_room.di.a.b
        public final com.avito.android.virtual_deal_room.client_room.di.a a(com.avito.android.virtual_deal_room.client_room.di.b bVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, ClientRoomArguments clientRoomArguments) {
            interfaceC39417a.getClass();
            clientRoomArguments.getClass();
            return new b(bVar, interfaceC39417a, c28478k, clientRoomArguments, null);
        }
    }

    public static a.b a() {
        return new C10088c();
    }
}
