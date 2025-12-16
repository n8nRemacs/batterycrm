package com.avito.android.iac_dialer_watcher.impl_module.watcher;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacWatcherImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f168163a;

    /* renamed from: b, reason: collision with root package name */
    public final u f168164b;

    public b(u uVar, Provider provider) {
        this.f168163a = provider;
        this.f168164b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(dagger.internal.g.b(this.f168163a), (m) this.f168164b.get());
    }
}
