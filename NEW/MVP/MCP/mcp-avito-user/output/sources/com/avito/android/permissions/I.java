package com.avito.android.permissions;

import com.avito.android.di.module.C30214v6;

/* compiled from: PermissionStorageImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f215103a;

    public I(C30214v6 c30214v6) {
        this.f215103a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H((AK0.l) this.f215103a.get());
    }
}
