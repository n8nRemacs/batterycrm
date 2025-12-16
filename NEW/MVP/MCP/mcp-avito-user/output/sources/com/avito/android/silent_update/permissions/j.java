package com.avito.android.silent_update.permissions;

import android.content.Context;
import com.avito.android.permissions.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SilentUpdatePermissionChecker_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f283719a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u> f283720b;

    public j(Provider<Context> provider, Provider<u> provider2) {
        this.f283719a = provider;
        this.f283720b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f283719a.get(), this.f283720b.get());
    }
}
