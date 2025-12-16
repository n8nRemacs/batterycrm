package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: GsmBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class K implements dagger.internal.h<GsmBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<PK.a> f165149a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165150b;

    public K(Provider<PK.a> provider, Provider<R0> provider2) {
        this.f165149a = provider;
        this.f165150b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new GsmBootstrap(this.f165149a.get(), this.f165150b.get());
    }
}
