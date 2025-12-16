package com.avito.android.mandatory_verification.domain;

import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StartVerificationUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.mandatory_verification.data.d> f184591a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f184592b;

    public l(Provider<com.avito.android.mandatory_verification.data.d> provider, Provider<InterfaceC35741a1> provider2) {
        this.f184591a = provider;
        this.f184592b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f184591a.get(), this.f184592b.get());
    }
}
