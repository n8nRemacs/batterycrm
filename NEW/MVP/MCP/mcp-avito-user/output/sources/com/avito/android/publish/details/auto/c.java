package com.avito.android.publish.details.auto;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RollbackValuesInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f233497a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.publish.details.auto.storage.factory.c f233498b;

    public c(Provider provider, com.avito.android.publish.details.auto.storage.factory.c cVar) {
        this.f233497a = provider;
        this.f233498b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.details.a aVar = this.f233497a.get();
        this.f233498b.getClass();
        return new b(aVar, new com.avito.android.publish.details.auto.storage.factory.b());
    }
}
