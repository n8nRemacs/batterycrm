package com.avito.android.sx_address.deeplink;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: SxAddressRevalidateDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class K implements dagger.internal.h<J> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.list.domain.b> f292797a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f292798b;

    public K(Provider<com.avito.android.sx_address.list.domain.b> provider, Provider<R0> provider2) {
        this.f292797a = provider;
        this.f292798b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new J(this.f292797a.get(), this.f292798b.get());
    }
}
