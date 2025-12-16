package com.avito.android.iac_dialer_watcher.impl_module.logging.writing;

import com.avito.android.InterfaceC32900o;
import com.avito.android.account.G;
import com.avito.android.remote.H;
import com.google.gson.Gson;
import javax.inject.Provider;

/* compiled from: IacLogHeaderFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<G> f168093a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<H> f168094b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f168095c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC32900o> f168096d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f168097e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<Gson> f168098f;

    public m(Provider<G> provider, Provider<H> provider2, Provider<com.avito.android.util.C> provider3, Provider<InterfaceC32900o> provider4, Provider<com.avito.android.server_time.f> provider5, Provider<Gson> provider6) {
        this.f168093a = provider;
        this.f168094b = provider2;
        this.f168095c = provider3;
        this.f168096d = provider4;
        this.f168097e = provider5;
        this.f168098f = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f168093a.get(), this.f168094b.get(), this.f168095c.get(), this.f168096d.get(), this.f168097e.get(), this.f168098f.get());
    }
}
