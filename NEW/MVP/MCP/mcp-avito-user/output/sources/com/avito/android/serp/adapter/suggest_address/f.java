package com.avito.android.serp.adapter.suggest_address;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AddAddressSuggestItemInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.geo_common.interactor.g> f272394a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f272395b;

    public f(Provider<com.avito.android.geo_common.interactor.g> provider, Provider<InterfaceC35745a5> provider2) {
        this.f272394a = provider;
        this.f272395b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f272394a.get(), this.f272395b.get());
    }
}
