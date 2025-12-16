package com.avito.android.iac_dialer_watcher.impl_module.logging.writing;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: IacLogSaverImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class B implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.iac_dialer_watcher.impl_module.splitter.features.c f168067a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<e> f168068b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer_watcher.impl_module.logging.k> f168069c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e> f168070d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f168071e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f168072f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f168073g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.s f168074h;

    public B(com.avito.android.iac_dialer_watcher.impl_module.splitter.features.c cVar, Provider provider, Provider provider2, Provider provider3, dagger.internal.u uVar, Provider provider4, Provider provider5, com.avito.android.iac_dialer_watcher.impl_module.logging.s sVar) {
        this.f168067a = cVar;
        this.f168068b = provider;
        this.f168069c = provider2;
        this.f168070d = provider3;
        this.f168071e = uVar;
        this.f168072f = provider4;
        this.f168073g = provider5;
        this.f168074h = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a) this.f168067a.get(), this.f168068b.get(), this.f168069c.get(), this.f168070d.get(), (k) this.f168071e.get(), this.f168072f.get(), this.f168073g.get(), (com.avito.android.iac_dialer_watcher.impl_module.logging.q) this.f168074h.get());
    }
}
