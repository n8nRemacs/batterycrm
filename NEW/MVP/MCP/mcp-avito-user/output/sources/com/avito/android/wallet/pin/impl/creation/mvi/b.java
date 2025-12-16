package com.avito.android.wallet.pin.impl.creation.mvi;

import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import gP0.InterfaceC40610a;
import javax.inject.Provider;

/* compiled from: WalletPinCreationInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40610a> f328512a;

    public b(Provider<InterfaceC40610a> provider) {
        this.f328512a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(dagger.internal.g.a(w.a(this.f328512a)));
    }
}
