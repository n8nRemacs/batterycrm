package com.avito.android.service.short_task.metrics;

import javax.inject.Provider;

/* compiled from: PermissionInfoProvider_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.u> f274097a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<I30.d> f274098b;

    public s(Provider<com.avito.android.permissions.u> provider, Provider<I30.d> provider2) {
        this.f274097a = provider;
        this.f274098b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f274097a.get(), this.f274098b.get());
    }
}
