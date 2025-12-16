package com.avito.android.verification.verification_passport;

import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PassportVerificationInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A1> f325692a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f325693b;

    public d(Provider<A1> provider, Provider<InterfaceC35745a5> provider2) {
        this.f325692a = provider;
        this.f325693b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f325692a.get(), this.f325693b.get());
    }
}
