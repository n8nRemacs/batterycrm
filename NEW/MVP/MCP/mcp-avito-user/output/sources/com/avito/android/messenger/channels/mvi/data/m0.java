package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.messenger.di.V1;
import com.avito.android.persistence.messenger.Q2;
import javax.inject.Provider;

/* compiled from: UserRepoImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class m0 implements dagger.internal.h<g0> {

    /* renamed from: a, reason: collision with root package name */
    public final V1 f187238a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<c0> f187239b;

    public m0(V1 v12, Provider provider) {
        this.f187238a = v12;
        this.f187239b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g0((Q2) this.f187238a.get(), this.f187239b.get());
    }
}
