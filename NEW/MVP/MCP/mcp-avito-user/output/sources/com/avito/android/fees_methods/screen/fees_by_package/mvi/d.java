package com.avito.android.fees_methods.screen.fees_by_package.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeesByPackageBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.fees_methods.screen.fees_by_package.domain.b f158011a;

    public d(com.avito.android.fees_methods.screen.fees_by_package.domain.b bVar) {
        this.f158011a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.fees_methods.screen.fees_by_package.domain.a) this.f158011a.get());
    }
}
