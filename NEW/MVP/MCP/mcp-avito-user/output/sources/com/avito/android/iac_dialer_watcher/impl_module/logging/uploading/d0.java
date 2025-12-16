package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import javax.inject.Provider;

/* compiled from: IacLogSessionHistoryUpdaterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class d0 implements dagger.internal.h<Y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e> f167997a;

    public d0(Provider<com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e> provider) {
        this.f167997a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Y(this.f167997a.get());
    }
}
