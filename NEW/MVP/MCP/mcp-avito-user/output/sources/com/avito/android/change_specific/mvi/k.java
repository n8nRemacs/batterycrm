package com.avito.android.change_specific.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileChangeSpecificReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f118042a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f118043b;

    public k(Provider<InterfaceC28373a> provider, Provider<E> provider2) {
        this.f118042a = provider;
        this.f118043b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f118043b.get(), this.f118042a.get());
    }
}
