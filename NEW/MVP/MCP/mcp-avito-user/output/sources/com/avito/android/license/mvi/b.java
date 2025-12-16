package com.avito.android.license.mvi;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LicenseBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.license.data.f f181528a;

    public b(com.avito.android.license.data.f fVar) {
        this.f181528a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.license.data.b) this.f181528a.get());
    }
}
