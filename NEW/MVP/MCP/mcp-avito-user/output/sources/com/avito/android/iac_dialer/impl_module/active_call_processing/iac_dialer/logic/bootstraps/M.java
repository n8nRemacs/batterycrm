package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;
import zK.InterfaceC50478a;

/* compiled from: MediaServiceBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class M implements dagger.internal.h<MediaServiceBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f165151a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165152b;

    public M(dagger.internal.u uVar, Provider provider) {
        this.f165151a = uVar;
        this.f165152b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new MediaServiceBootstrap((InterfaceC50478a) this.f165151a.get(), this.f165152b.get());
    }
}
