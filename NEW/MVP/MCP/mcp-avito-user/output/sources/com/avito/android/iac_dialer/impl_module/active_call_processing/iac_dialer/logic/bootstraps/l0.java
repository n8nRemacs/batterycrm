package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: WatcherBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class l0 implements dagger.internal.h<WatcherBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<BL.a> f165391a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165392b;

    public l0(Provider<BL.a> provider, Provider<R0> provider2) {
        this.f165391a = provider;
        this.f165392b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new WatcherBootstrap(this.f165391a.get(), this.f165392b.get());
    }
}
