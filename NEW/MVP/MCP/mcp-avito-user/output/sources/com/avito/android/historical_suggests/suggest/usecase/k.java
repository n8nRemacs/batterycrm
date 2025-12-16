package com.avito.android.historical_suggests.suggest.usecase;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetIdFromJwtUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f162170a;

    /* renamed from: b, reason: collision with root package name */
    public final u f162171b;

    public k(u uVar, Provider provider) {
        this.f162170a = provider;
        this.f162171b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f162170a.get(), (f) this.f162171b.get());
    }
}
