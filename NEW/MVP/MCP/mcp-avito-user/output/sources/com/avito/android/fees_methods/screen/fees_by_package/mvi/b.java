package com.avito.android.fees_methods.screen.fees_by_package.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeesByPackageActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.fees_methods.screen.fees_by_package.domain.b f158009a;

    public b(com.avito.android.fees_methods.screen.fees_by_package.domain.b bVar) {
        this.f158009a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.fees_methods.screen.fees_by_package.domain.a) this.f158009a.get());
    }
}
