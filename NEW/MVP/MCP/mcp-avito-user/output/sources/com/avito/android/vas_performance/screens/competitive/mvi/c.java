package com.avito.android.vas_performance.screens.competitive.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompetitiveVasV2Actor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.competitive.domain.b f320440a;

    public c(com.avito.android.vas_performance.screens.competitive.domain.b bVar) {
        this.f320440a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.vas_performance.screens.competitive.domain.a) this.f320440a.get());
    }
}
