package com.avito.android.fees_methods.common.domain;

import com.avito.android.remote.K0;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaidPublishLimitsUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<K0> f157938a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f157939b;

    public c(Provider<K0> provider, Provider<R0> provider2) {
        this.f157938a = provider;
        this.f157939b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f157938a.get(), this.f157939b.get());
    }
}
