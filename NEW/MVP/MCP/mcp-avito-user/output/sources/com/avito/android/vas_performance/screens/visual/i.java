package com.avito.android.vas_performance.screens.visual;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: VisualVasViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.visual.mvi.i f321041a;

    public i(com.avito.android.vas_performance.screens.visual.mvi.i iVar) {
        this.f321041a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.screens.visual.mvi.h hVar = (com.avito.android.vas_performance.screens.visual.mvi.h) this.f321041a.get();
        i2.f411430a.getClass();
        return new h(hVar, i2.a.f411433c);
    }
}
