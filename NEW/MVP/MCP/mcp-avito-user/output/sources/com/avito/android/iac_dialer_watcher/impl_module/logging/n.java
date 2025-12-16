package com.avito.android.iac_dialer_watcher.impl_module.logging;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacLogSessionProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f167888a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f167889b;

    /* renamed from: c, reason: collision with root package name */
    public final u f167890c;

    public n(u uVar, Provider provider, Provider provider2) {
        this.f167888a = provider;
        this.f167889b = provider2;
        this.f167890c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f167888a.get(), this.f167889b.get(), (com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e) this.f167890c.get());
    }
}
