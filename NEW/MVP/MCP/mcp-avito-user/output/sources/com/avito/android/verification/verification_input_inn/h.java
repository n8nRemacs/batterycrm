package com.avito.android.verification.verification_input_inn;

import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationInputInnInteractorImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A1> f325616a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f325617b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f325618c;

    public h(Provider<A1> provider, Provider<InterfaceC35745a5> provider2, Provider<com.avito.android.remote.error.f> provider3) {
        this.f325616a = provider;
        this.f325617b = provider2;
        this.f325618c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f325616a.get(), this.f325617b.get(), this.f325618c.get());
    }
}
