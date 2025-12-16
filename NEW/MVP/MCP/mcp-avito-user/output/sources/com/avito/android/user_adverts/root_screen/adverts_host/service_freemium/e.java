package com.avito.android.user_adverts.root_screen.adverts_host.service_freemium;

import com.avito.android.account.E;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceFreemiumViewModelImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f313848a;

    /* renamed from: b, reason: collision with root package name */
    public final u f313849b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f313850c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f313848a = provider;
        this.f313849b = uVar;
        this.f313850c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f313848a.get(), (com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.b) this.f313849b.get(), this.f313850c.get());
    }
}
