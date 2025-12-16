package com.avito.android.search.subscriptions.di;

import Go0.InterfaceC13902a;
import com.avito.android.geo_common.interactor.B;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl_Factory;
import com.avito.android.search.subscriptions.SearchSubscriptionSyncService;
import com.avito.android.search.subscriptions.di.n;
import com.avito.android.util.InterfaceC35745a5;

/* compiled from: DaggerSearchSubscriptionSyncServiceComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: DaggerSearchSubscriptionSyncServiceComponent.java */
    /* renamed from: com.avito.android.search.subscriptions.di.b$b, reason: collision with other inner class name */
    public static final class C7878b implements n.a {

        /* renamed from: a, reason: collision with root package name */
        public d f263938a;

        public C7878b() {
        }

        @Override // com.avito.android.search.subscriptions.di.n.a
        public final n.a a(d dVar) {
            this.f263938a = dVar;
            return this;
        }

        @Override // com.avito.android.search.subscriptions.di.n.a
        public final n build() {
            dagger.internal.t.a(d.class, this.f263938a);
            return new c(this.f263938a, null);
        }
    }

    /* compiled from: DaggerSearchSubscriptionSyncServiceComponent.java */
    public static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public final d f263939a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<SearchParamsConverter> f263940b = dagger.internal.g.d(SearchParamsConverterImpl_Factory.create());

        public c(d dVar, a aVar) {
            this.f263939a = dVar;
        }

        @Override // com.avito.android.search.subscriptions.di.n
        public final void a(SearchSubscriptionSyncService searchSubscriptionSyncService) {
            d dVar = this.f263939a;
            InterfaceC13902a interfaceC13902aH3 = dVar.H3();
            dagger.internal.t.c(interfaceC13902aH3);
            searchSubscriptionSyncService.f263849b = interfaceC13902aH3;
            B bQ3 = dVar.q3();
            dagger.internal.t.c(bQ3);
            searchSubscriptionSyncService.f263850c = bQ3;
            TV.c cVarG2 = dVar.G2();
            dagger.internal.t.c(cVarG2);
            searchSubscriptionSyncService.f263851d = cVarG2;
            searchSubscriptionSyncService.f263852e = dVar.pd();
            InterfaceC35745a5 interfaceC35745a5D = dVar.d();
            dagger.internal.t.c(interfaceC35745a5D);
            searchSubscriptionSyncService.f263853f = interfaceC35745a5D;
            searchSubscriptionSyncService.f263854g = this.f263940b.get();
            searchSubscriptionSyncService.f263855h = dVar.H();
            searchSubscriptionSyncService.f263856i = dVar.o1();
        }
    }

    public static n.a a() {
        return new C7878b();
    }
}
