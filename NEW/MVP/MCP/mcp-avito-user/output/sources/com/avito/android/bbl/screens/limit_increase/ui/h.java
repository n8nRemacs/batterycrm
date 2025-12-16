package com.avito.android.bbl.screens.limit_increase.ui;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: LimitIncreaseViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bbl.screens.limit_increase.mvi.g f99949a;

    public h(com.avito.android.bbl.screens.limit_increase.mvi.g gVar) {
        this.f99949a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.bbl.screens.limit_increase.mvi.f fVar = (com.avito.android.bbl.screens.limit_increase.mvi.f) this.f99949a.get();
        i2.f411430a.getClass();
        return new g(fVar, i2.a.f411433c);
    }
}
