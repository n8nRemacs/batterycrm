package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import javax.inject.Provider;

/* compiled from: IacLogCleanerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30909p implements dagger.internal.h<C30908o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e> f168022a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f168023b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.s f168024c;

    public C30909p(com.avito.android.iac_dialer_watcher.impl_module.logging.s sVar, dagger.internal.u uVar, Provider provider) {
        this.f168022a = provider;
        this.f168023b = uVar;
        this.f168024c = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30908o(this.f168022a.get(), (com.avito.android.iac_dialer_watcher.impl_module.logging.f) this.f168023b.get(), (com.avito.android.iac_dialer_watcher.impl_module.logging.q) this.f168024c.get());
    }
}
