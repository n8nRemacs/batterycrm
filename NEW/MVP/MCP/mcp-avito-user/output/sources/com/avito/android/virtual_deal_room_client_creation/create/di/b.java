package com.avito.android.virtual_deal_room_client_creation.create.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import com.avito.android.util.S3;
import com.avito.android.virtual_deal_room_client_creation.create.CreateFragment;
import com.avito.android.virtual_deal_room_client_creation.create.H;
import com.avito.android.virtual_deal_room_client_creation.create.di.a;
import com.avito.android.virtual_deal_room_client_creation.create.model.CreateArguments;
import com.avito.android.virtual_deal_room_client_creation.create.mvi.i;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCreateComponent.java */
@e
/* loaded from: classes5.dex */
public final class b {

    /* compiled from: DaggerCreateComponent.java */
    /* renamed from: com.avito.android.virtual_deal_room_client_creation.create.di.b$b, reason: collision with other inner class name */
    public static final class C10110b implements com.avito.android.virtual_deal_room_client_creation.create.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<UN0.a> f326763a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.virtual_deal_room_client_creation.create.mvi.validator.a> f326764b = B.a(com.avito.android.virtual_deal_room_client_creation.create.mvi.validator.c.a());

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f326765c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ON0.a> f326766d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f326767e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.virtual_deal_room_client_creation.create.interactor.a> f326768f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.virtual_deal_room_client_creation.create.mvi.b f326769g;

        /* renamed from: h, reason: collision with root package name */
        public final i f326770h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f326771i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f326772j;

        /* renamed from: k, reason: collision with root package name */
        public final H f326773k;

        /* compiled from: DaggerCreateComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.create.di.b$b$a */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final TN0.a f326774a;

            public a(TN0.a aVar) {
                this.f326774a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f326774a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCreateComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.create.di.b$b$b, reason: collision with other inner class name */
        public static final class C10111b implements u<UN0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final TN0.a f326775a;

            public C10111b(TN0.a aVar) {
                this.f326775a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                UN0.a aVarLi = this.f326775a.Li();
                t.c(aVarLi);
                return aVarLi;
            }
        }

        /* compiled from: DaggerCreateComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.create.di.b$b$c */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final TN0.a f326776a;

            public c(TN0.a aVar) {
                this.f326776a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f326776a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCreateComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.create.di.b$b$d */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final TN0.a f326777a;

            public d(TN0.a aVar) {
                this.f326777a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f326777a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public C10110b(TN0.a aVar, C28478k c28478k, CreateArguments createArguments, a aVar2) {
            this.f326763a = new C10111b(aVar);
            u<ON0.a> uVarA = B.a(new ON0.c(new a(aVar)));
            this.f326766d = uVarA;
            u<com.avito.android.virtual_deal_room_client_creation.create.interactor.a> uVarD = g.d(new com.avito.android.virtual_deal_room_client_creation.create.interactor.c(this.f326763a, S3.f318734a, this.f326764b, uVarA, new c(aVar)));
            this.f326768f = uVarD;
            this.f326769g = new com.avito.android.virtual_deal_room_client_creation.create.mvi.b(uVarD, this.f326766d);
            this.f326770h = new i(com.avito.android.virtual_deal_room_client_creation.create.mvi.builder.c.a(), this.f326764b);
            this.f326771i = new d(aVar);
            this.f326772j = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f326771i);
            this.f326773k = new H(new com.avito.android.virtual_deal_room_client_creation.create.mvi.e(this.f326769g, com.avito.android.virtual_deal_room_client_creation.create.mvi.g.a(), this.f326770h, this.f326772j));
        }

        @Override // com.avito.android.virtual_deal_room_client_creation.create.di.a
        public final void a(CreateFragment createFragment) {
            createFragment.f326713n0 = this.f326773k;
            createFragment.f326715p0 = this.f326772j.get();
        }
    }

    /* compiled from: DaggerCreateComponent.java */
    public static final class c implements a.b {
        public c() {
        }

        @Override // com.avito.android.virtual_deal_room_client_creation.create.di.a.b
        public final com.avito.android.virtual_deal_room_client_creation.create.di.a a(TN0.a aVar, C28478k c28478k, CreateArguments createArguments) {
            createArguments.getClass();
            return new C10110b(aVar, c28478k, createArguments, null);
        }
    }

    public static a.b a() {
        return new c();
    }
}
