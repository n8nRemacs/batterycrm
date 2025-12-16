package com.avito.android.historical_suggests.suggest.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HistoricalSuggestsOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.historical_suggests.features.a> f162148a;

    public i(Provider<com.avito.android.historical_suggests.features.a> provider) {
        this.f162148a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f162148a.get());
    }
}
