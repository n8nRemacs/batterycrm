package com.avito.android.rating.details.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingDetailsModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.rating.details.adapter.b f246994a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.rating.details.adapter.d f246995b;

    public j(com.avito.android.rating.details.adapter.b bVar, com.avito.android.rating.details.adapter.d dVar) {
        this.f246994a = bVar;
        this.f246995b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f246994a.getClass();
        com.avito.android.rating.details.adapter.a aVar = new com.avito.android.rating.details.adapter.a();
        this.f246995b.getClass();
        com.avito.android.rating.details.adapter.c cVar = new com.avito.android.rating.details.adapter.c();
        e.f246981a.getClass();
        return new com.avito.android.recycler.data_aware.i(aVar, null, false, cVar, 6, null);
    }
}
