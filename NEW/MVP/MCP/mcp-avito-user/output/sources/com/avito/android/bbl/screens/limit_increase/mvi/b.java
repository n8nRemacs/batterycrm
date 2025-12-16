package com.avito.android.bbl.screens.limit_increase.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LimitIncreaseActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bbl.screens.limit_increase.mvi.domain.b f99763a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.bbl.screens.limit_increase.mvi.domain.d f99764b;

    public b(com.avito.android.bbl.screens.limit_increase.mvi.domain.b bVar, com.avito.android.bbl.screens.limit_increase.mvi.domain.d dVar) {
        this.f99763a = bVar;
        this.f99764b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.bbl.screens.limit_increase.mvi.domain.a) this.f99763a.get(), (com.avito.android.bbl.screens.limit_increase.mvi.domain.c) this.f99764b.get());
    }
}
