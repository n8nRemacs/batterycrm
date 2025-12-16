package com.avito.android.timestamp_storage.domain;

import com.avito.android.account.E;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TimestampUserProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f301521a;

    public o(Provider<E> provider) {
        this.f301521a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f301521a.get());
    }
}
