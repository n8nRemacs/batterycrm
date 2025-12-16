package com.avito.android.rating.details.interactor.converter;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRatingsConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f247030a;

    public c(dagger.internal.f fVar) {
        this.f247030a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.deep_linking.x) this.f247030a.get());
    }
}
