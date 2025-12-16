package com.avito.android.early_access;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: EarlyAccessPaymentStatusChangedObserverImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class y implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f145583a;

    public y(Provider<R0> provider) {
        this.f145583a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new v(this.f145583a.get());
    }
}
