package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: StorageBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class c0 implements dagger.internal.h<StorageBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<HK.a> f165347a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165348b;

    public c0(Provider<HK.a> provider, Provider<R0> provider2) {
        this.f165347a = provider;
        this.f165348b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new StorageBootstrap(this.f165347a.get(), this.f165348b.get());
    }
}
