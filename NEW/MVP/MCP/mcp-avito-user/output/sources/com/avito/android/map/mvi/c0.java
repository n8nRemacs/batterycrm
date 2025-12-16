package com.avito.android.map.mvi;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: MyLocationInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class c0 implements dagger.internal.h<b0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f185038a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f185039b;

    public c0(dagger.internal.u uVar, Provider provider) {
        this.f185038a = uVar;
        this.f185039b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b0((com.avito.android.permissions.q) this.f185038a.get(), this.f185039b.get());
    }
}
