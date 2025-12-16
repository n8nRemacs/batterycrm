package com.avito.android.messenger.flower.domain;

import com.avito.android.remote.U;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FlowerRedirectUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f196341a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<U> f196342b;

    public d(Provider<R0> provider, Provider<U> provider2) {
        this.f196341a = provider;
        this.f196342b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f196341a.get(), this.f196342b.get());
    }
}
