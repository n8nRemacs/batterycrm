package com.avito.android.license.data;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LicenseRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f181514a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f181515b;

    public f(C30102l3 c30102l3, Provider provider) {
        this.f181514a = c30102l3;
        this.f181515b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Context) this.f181514a.get(), this.f181515b.get());
    }
}
