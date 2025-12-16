package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: AppForegroundStatusBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30838f implements dagger.internal.h<AppForegroundStatusBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.app_foreground_provider.util_module.a> f165377a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165378b;

    public C30838f(Provider<com.avito.android.app_foreground_provider.util_module.a> provider, Provider<R0> provider2) {
        this.f165377a = provider;
        this.f165378b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new AppForegroundStatusBootstrap(this.f165377a.get(), this.f165378b.get());
    }
}
