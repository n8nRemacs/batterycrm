package com.avito.android.historical_suggests.suggest.usecase;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DecodeJwtUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f162155a;

    public d(Provider<R0> provider) {
        this.f162155a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f162155a.get());
    }
}
