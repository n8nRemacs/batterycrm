package com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pM.InterfaceC46977a;

/* compiled from: IacAppStatusProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f167869a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.app_foreground_provider.util_module.a> f167870b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC46977a> f167871c;

    /* renamed from: d, reason: collision with root package name */
    public final u f167872d;

    public d(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f167869a = provider;
        this.f167870b = provider2;
        this.f167871c = provider3;
        this.f167872d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f167869a.get(), this.f167870b.get(), this.f167871c.get(), (PK.a) this.f167872d.get());
    }
}
