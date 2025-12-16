package com.avito.android.delivery_location_suggest.di;

import Gv.InterfaceC13920a;
import Mn0.InterfaceC14512b;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestFragment;
import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams;
import com.avito.android.delivery_location_suggest.di.d;
import com.avito.android.delivery_location_suggest.mvi.n;
import com.avito.android.delivery_location_suggest.q;
import com.avito.android.delivery_location_suggest.s;
import com.avito.android.location_picker.providers.InterfaceC31564a;
import com.avito.android.location_picker.providers.v;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;
import nF.C44245a;

/* compiled from: DaggerDeliveryLocationSuggestComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerDeliveryLocationSuggestComponent.java */
    public static final class b implements com.avito.android.delivery_location_suggest.di.d {

        /* renamed from: a, reason: collision with root package name */
        public final l f135070a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.geo_common.interactor.g> f135071b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC31564a> f135072c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35745a5> f135073d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f135074e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC14512b> f135075f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C44245a> f135076g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.delivery_location_suggest.l> f135077h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.delivery_location_suggest.mvi.g f135078i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.delivery_location_suggest.mvi.e f135079j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f135080k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f135081l;

        /* renamed from: m, reason: collision with root package name */
        public final s f135082m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.delivery_location_suggest.konveyor.suggest.b f135083n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f135084o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f135085p;

        /* compiled from: DaggerDeliveryLocationSuggestComponent.java */
        /* renamed from: com.avito.android.delivery_location_suggest.di.a$b$a, reason: collision with other inner class name */
        public static final class C4084a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.delivery_location_suggest.di.e f135086a;

            public C4084a(com.avito.android.delivery_location_suggest.di.e eVar) {
                this.f135086a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f135086a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerDeliveryLocationSuggestComponent.java */
        /* renamed from: com.avito.android.delivery_location_suggest.di.a$b$b, reason: collision with other inner class name */
        public static final class C4085b implements u<C44245a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.delivery_location_suggest.di.e f135087a;

            public C4085b(com.avito.android.delivery_location_suggest.di.e eVar) {
                this.f135087a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f135087a.R0();
            }
        }

        /* compiled from: DaggerDeliveryLocationSuggestComponent.java */
        public static final class c implements u<com.avito.android.geo_common.interactor.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.delivery_location_suggest.di.e f135088a;

            public c(com.avito.android.delivery_location_suggest.di.e eVar) {
                this.f135088a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo_common.interactor.g gVarU0 = this.f135088a.u0();
                t.c(gVarU0);
                return gVarU0;
            }
        }

        /* compiled from: DaggerDeliveryLocationSuggestComponent.java */
        public static final class d implements u<InterfaceC14512b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.delivery_location_suggest.di.e f135089a;

            public d(com.avito.android.delivery_location_suggest.di.e eVar) {
                this.f135089a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14512b interfaceC14512bD3 = this.f135089a.d3();
                t.c(interfaceC14512bD3);
                return interfaceC14512bD3;
            }
        }

        /* compiled from: DaggerDeliveryLocationSuggestComponent.java */
        public static final class e implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.delivery_location_suggest.di.e f135090a;

            public e(com.avito.android.delivery_location_suggest.di.e eVar) {
                this.f135090a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f135090a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerDeliveryLocationSuggestComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.delivery_location_suggest.di.e f135091a;

            public f(com.avito.android.delivery_location_suggest.di.e eVar) {
                this.f135091a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f135091a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.delivery_location_suggest.di.e eVar, DeliveryLocationSuggestParams deliveryLocationSuggestParams, C28478k c28478k, Y41.l lVar, C4083a c4083a) {
            this.f135070a = l.a(deliveryLocationSuggestParams);
            u<InterfaceC31564a> uVarD = dagger.internal.g.d(new v(new c(eVar)));
            this.f135072c = uVarD;
            e eVar2 = new e(eVar);
            C4084a c4084a = new C4084a(eVar);
            d dVar = new d(eVar);
            C4085b c4085b = new C4085b(eVar);
            this.f135076g = c4085b;
            u<com.avito.android.delivery_location_suggest.l> uVarD2 = dagger.internal.g.d(new q(uVarD, eVar2, c4084a, dVar, c4085b));
            this.f135077h = uVarD2;
            l lVar2 = this.f135070a;
            com.avito.android.delivery_location_suggest.mvi.useCase.g gVar = new com.avito.android.delivery_location_suggest.mvi.useCase.g(lVar2, uVarD2);
            this.f135078i = new com.avito.android.delivery_location_suggest.mvi.g(lVar2, gVar);
            this.f135079j = new com.avito.android.delivery_location_suggest.mvi.e(gVar, new com.avito.android.delivery_location_suggest.mvi.useCase.d(uVarD2), this.f135076g);
            this.f135080k = new f(eVar);
            this.f135081l = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f135080k);
            this.f135082m = new s(new com.avito.android.delivery_location_suggest.mvi.j(this.f135078i, this.f135079j, com.avito.android.delivery_location_suggest.mvi.l.a(), n.a(), this.f135081l, this.f135070a));
            this.f135083n = new com.avito.android.delivery_location_suggest.konveyor.suggest.b(new com.avito.android.delivery_location_suggest.konveyor.suggest.f(l.a(lVar)));
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new j(this.f135083n, new com.avito.android.delivery_location_suggest.konveyor.empty.b(com.avito.android.delivery_location_suggest.konveyor.empty.e.a())));
            this.f135084o = uVarD3;
            this.f135085p = dagger.internal.g.d(new h(uVarD3));
        }

        @Override // com.avito.android.delivery_location_suggest.di.d
        public final void a(DeliveryLocationSuggestFragment deliveryLocationSuggestFragment) {
            deliveryLocationSuggestFragment.f135020n0 = this.f135082m;
            deliveryLocationSuggestFragment.f135022p0 = this.f135081l.get();
            com.avito.konveyor.adapter.a aVar = this.f135085p.get();
            com.avito.konveyor.a aVar2 = this.f135084o.get();
            g.f135094a.getClass();
            deliveryLocationSuggestFragment.f135023q0 = new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
        }
    }

    /* compiled from: DaggerDeliveryLocationSuggestComponent.java */
    public static final class c implements d.a {
        public c() {
        }

        @Override // com.avito.android.delivery_location_suggest.di.d.a
        public final d a(DeliveryLocationSuggestParams deliveryLocationSuggestParams, C28478k c28478k, Y41.l<? super InterfaceC13920a, G0> lVar, e eVar) {
            deliveryLocationSuggestParams.getClass();
            return new b(eVar, deliveryLocationSuggestParams, c28478k, lVar, null);
        }
    }

    public static d.a a() {
        return new c();
    }
}
