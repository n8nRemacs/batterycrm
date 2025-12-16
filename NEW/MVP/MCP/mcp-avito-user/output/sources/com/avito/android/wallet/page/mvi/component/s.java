package com.avito.android.wallet.page.mvi.component;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletPageViewStateBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class s implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f328172a;

    public s(Provider<com.avito.android.deep_linking.x> provider) {
        this.f328172a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f328172a.get());
    }
}
