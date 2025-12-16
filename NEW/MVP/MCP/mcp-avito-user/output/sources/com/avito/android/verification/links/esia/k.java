package com.avito.android.verification.links.esia;

import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationEsiaLinkInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324272a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<A1> f324273b;

    public k(Provider<InterfaceC35745a5> provider, Provider<A1> provider2) {
        this.f324272a = provider;
        this.f324273b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f324273b.get(), this.f324272a.get());
    }
}
