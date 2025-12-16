package com.avito.android.vas_performance.screens.visual_v2;

import com.avito.android.vas_performance.screens.visual_v2.mvi.j;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: VisualVasV2ViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final j f321243a;

    public i(j jVar) {
        this.f321243a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.screens.visual_v2.mvi.i iVar = (com.avito.android.vas_performance.screens.visual_v2.mvi.i) this.f321243a.get();
        i2.f411430a.getClass();
        return new h(iVar, i2.a.f411433c);
    }
}
