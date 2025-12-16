package com.avito.android.comfortable_deal.clients.mvi;

import ap.InterfaceC23648b;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClientsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.clients.interactor.b f120346a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.clients.use_case.b f120347b;

    /* renamed from: c, reason: collision with root package name */
    public final ap.d f120348c;

    public h(com.avito.android.comfortable_deal.clients.interactor.b bVar, com.avito.android.comfortable_deal.clients.use_case.b bVar2, ap.d dVar) {
        this.f120346a = bVar;
        this.f120347b = bVar2;
        this.f120348c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.comfortable_deal.clients.interactor.a) this.f120346a.get(), (com.avito.android.comfortable_deal.clients.use_case.a) this.f120347b.get(), (InterfaceC23648b) this.f120348c.get());
    }
}
