package com.avito.android.vas_performance.screens.competitive.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompetitiveVasV2Bootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.competitive.domain.b f320442a;

    public e(com.avito.android.vas_performance.screens.competitive.domain.b bVar) {
        this.f320442a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.vas_performance.screens.competitive.domain.a) this.f320442a.get());
    }
}
