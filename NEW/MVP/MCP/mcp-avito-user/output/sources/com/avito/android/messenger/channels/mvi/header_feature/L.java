package com.avito.android.messenger.channels.mvi.header_feature;

import javax.inject.Provider;

/* compiled from: ChannelsHeaderReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class L implements dagger.internal.h<K> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<GY.c> f187501a;

    public L(Provider<GY.c> provider) {
        this.f187501a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new K(this.f187501a.get());
    }
}
