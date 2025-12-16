package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import javax.inject.Provider;

/* compiled from: IacLogSenderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class U implements dagger.internal.h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer_watcher.impl_module.logging.k> f167979a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC30894a> f167980b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<X> f167981c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<A> f167982d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f167983e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e> f167984f;

    public U(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f167979a = provider;
        this.f167980b = provider2;
        this.f167981c = provider3;
        this.f167982d = provider4;
        this.f167983e = uVar;
        this.f167984f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new T(this.f167979a.get(), this.f167980b.get(), this.f167981c.get(), this.f167982d.get(), (InterfaceC30911s) this.f167983e.get(), this.f167984f.get());
    }
}
