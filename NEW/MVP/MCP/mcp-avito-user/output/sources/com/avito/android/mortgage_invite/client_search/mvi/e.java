package com.avito.android.mortgage_invite.client_search.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClientSearchActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage_invite.client_search.domain.c f205428a;

    public e(com.avito.android.mortgage_invite.client_search.domain.c cVar) {
        this.f205428a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.mortgage_invite.client_search.domain.b) this.f205428a.get());
    }
}
