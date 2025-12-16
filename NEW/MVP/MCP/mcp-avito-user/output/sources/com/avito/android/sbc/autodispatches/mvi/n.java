package com.avito.android.sbc.autodispatches.mvi;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: SbcAutoDispatchesViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final j f258946a;

    public n(j jVar) {
        this.f258946a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f258946a.get();
        i2.f411430a.getClass();
        return new m(iVar, i2.a.f411432b);
    }
}
