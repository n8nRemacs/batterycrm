package com.avito.android.bbl.screens.limit_increase.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LimitIncreaseBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bbl.screens.limit_increase.mvi.domain.b f99766a;

    public d(com.avito.android.bbl.screens.limit_increase.mvi.domain.b bVar) {
        this.f99766a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.bbl.screens.limit_increase.mvi.domain.a) this.f99766a.get());
    }
}
