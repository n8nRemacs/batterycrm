package com.avito.android.iac_dialer_watcher.impl_module.logging.repository;

import com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rL.C47560c;

/* compiled from: IacLogRepository_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class v implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final C47560c f167933a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f167934b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.s f167935c;

    public v(C47560c c47560c, Provider provider, com.avito.android.iac_dialer_watcher.impl_module.logging.s sVar) {
        this.f167933a = c47560c;
        this.f167934b = provider;
        this.f167935c = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((InterfaceC30891a) this.f167933a.get(), this.f167934b.get(), (com.avito.android.iac_dialer_watcher.impl_module.logging.q) this.f167935c.get());
    }
}
