package com.avito.android.sbc.autodispatcheslist.mvi;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: SbcAutoDispatchesListViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final i f259147a;

    public m(i iVar) {
        this.f259147a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f259147a.get();
        i2.f411430a.getClass();
        return new l(hVar, i2.a.f411432b);
    }
}
