package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: IacLogFileUploaderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30916x implements dagger.internal.h<C30915w> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f168062a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f168063b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.s f168064c;

    public C30916x(com.avito.android.iac_dialer_watcher.impl_module.logging.s sVar, dagger.internal.u uVar, Provider provider) {
        this.f168062a = uVar;
        this.f168063b = provider;
        this.f168064c = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30915w((com.avito.android.iac_dialer_watcher.impl_module.api.a) this.f168062a.get(), this.f168063b.get(), (com.avito.android.iac_dialer_watcher.impl_module.logging.q) this.f168064c.get());
    }
}
