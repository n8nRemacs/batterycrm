package com.avito.android.return_checkout;

import com.avito.android.remote.B;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryReturnCheckoutRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B> f255357a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f255358b;

    public n(Provider<B> provider, Provider<InterfaceC35745a5> provider2) {
        this.f255357a = provider;
        this.f255358b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f255358b.get(), dagger.internal.g.a(w.a(this.f255357a)));
    }
}
