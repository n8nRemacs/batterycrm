package com.avito.android.mortgage.phone_confirm.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfirmCodeUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f201624a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f201625b;

    public c(Provider<IZ.a> provider, Provider<R0> provider2) {
        this.f201624a = provider;
        this.f201625b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f201624a.get(), this.f201625b.get());
    }
}
