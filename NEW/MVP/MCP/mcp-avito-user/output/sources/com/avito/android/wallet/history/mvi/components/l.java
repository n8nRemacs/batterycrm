package com.avito.android.wallet.history.mvi.components;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletHistoryItemsConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f327608a;

    public l(Provider<com.avito.android.deep_linking.x> provider) {
        this.f327608a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f327608a.get());
    }
}
