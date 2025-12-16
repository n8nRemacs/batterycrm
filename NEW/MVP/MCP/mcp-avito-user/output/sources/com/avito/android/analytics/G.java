package com.avito.android.analytics;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: MobileNetworkSignalStrengthProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class G implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f89652a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f89653b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f89654c;

    public G(C30102l3 c30102l3, Provider provider, Provider provider2) {
        this.f89652a = c30102l3;
        this.f89653b = provider;
        this.f89654c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F((Context) this.f89652a.get(), this.f89653b.get(), this.f89654c.get());
    }
}
