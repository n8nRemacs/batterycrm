package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: PowerStatusBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class W implements dagger.internal.h<PowerStatusBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.device_status.power_status.a> f165327a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165328b;

    public W(Provider<com.avito.android.iac_dialer.impl_module.device_status.power_status.a> provider, Provider<R0> provider2) {
        this.f165327a = provider;
        this.f165328b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new PowerStatusBootstrap(this.f165327a.get(), this.f165328b.get());
    }
}
