package com.avito.android.select.mvi;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.select.g> f265610a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f265611b;

    public j(Provider<com.avito.android.select.g> provider, Provider<R0> provider2) {
        this.f265610a = provider;
        this.f265611b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f265610a.get(), this.f265611b.get());
    }
}
