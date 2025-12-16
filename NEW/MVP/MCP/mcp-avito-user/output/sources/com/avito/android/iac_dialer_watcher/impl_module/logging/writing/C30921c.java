package com.avito.android.iac_dialer_watcher.impl_module.logging.writing;

import javax.inject.Provider;

/* compiled from: IacLogBufferInitializerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.writing.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30921c implements dagger.internal.h<C30920b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer_watcher.public_module.logging.logger.a> f168076a;

    public C30921c(Provider<com.avito.android.iac_dialer_watcher.public_module.logging.logger.a> provider) {
        this.f168076a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30920b(dagger.internal.g.b(this.f168076a));
    }
}
