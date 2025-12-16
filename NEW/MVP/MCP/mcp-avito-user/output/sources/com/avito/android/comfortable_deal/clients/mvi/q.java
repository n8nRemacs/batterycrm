package com.avito.android.comfortable_deal.clients.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClientsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.clients.mvi.builder.c f120370a;

    public q(com.avito.android.comfortable_deal.clients.mvi.builder.c cVar) {
        this.f120370a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((com.avito.android.comfortable_deal.clients.mvi.builder.a) this.f120370a.get());
    }
}
