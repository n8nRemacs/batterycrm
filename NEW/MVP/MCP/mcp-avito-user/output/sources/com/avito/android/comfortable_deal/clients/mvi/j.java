package com.avito.android.comfortable_deal.clients.mvi;

import com.avito.android.comfortable_deal.clients.model.ClientsArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClientsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.clients.interactor.b f120355a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f120356b;

    public j(com.avito.android.comfortable_deal.clients.interactor.b bVar, dagger.internal.l lVar) {
        this.f120355a = bVar;
        this.f120356b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.comfortable_deal.clients.interactor.a) this.f120355a.get(), (ClientsArguments) this.f120356b.f393949a);
    }
}
