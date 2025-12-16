package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: TelecomBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class f0 implements dagger.internal.h<TelecomBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.telecom.d> f165379a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165380b;

    public f0(Provider<com.avito.android.iac_dialer.impl_module.telecom.d> provider, Provider<R0> provider2) {
        this.f165379a = provider;
        this.f165380b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new TelecomBootstrap(this.f165379a.get(), this.f165380b.get());
    }
}
