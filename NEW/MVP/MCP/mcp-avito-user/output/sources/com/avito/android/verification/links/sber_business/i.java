package com.avito.android.verification.links.sber_business;

import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SberBusinessLinkInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324434a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<A1> f324435b;

    public i(Provider<InterfaceC35745a5> provider, Provider<A1> provider2) {
        this.f324434a = provider;
        this.f324435b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f324435b.get(), this.f324434a.get());
    }
}
