package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import javax.inject.Provider;

/* compiled from: IacLogFileWriterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.iac_dialer_watcher.impl_module.splitter.features.c f167955a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f167956b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e> f167957c;

    public E(com.avito.android.iac_dialer_watcher.impl_module.splitter.features.c cVar, dagger.internal.u uVar, Provider provider) {
        this.f167955a = cVar;
        this.f167956b = uVar;
        this.f167957c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f167955a.get();
        return new D((com.avito.android.iac_dialer_watcher.impl_module.logging.a) this.f167956b.get(), this.f167957c.get());
    }
}
