package com.avito.android.mortgage.sign.files;

import android.content.Context;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SignStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f203656a;

    public e(Provider<Context> provider) {
        this.f203656a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f203656a.get());
    }
}
