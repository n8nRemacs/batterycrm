package com.avito.android.bbl.screens.configure.v2;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: BblConfigureV2ViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bbl.screens.configure.v2.mvi.i f99328a;

    public m(com.avito.android.bbl.screens.configure.v2.mvi.i iVar) {
        this.f99328a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.bbl.screens.configure.v2.mvi.h hVar = (com.avito.android.bbl.screens.configure.v2.mvi.h) this.f99328a.get();
        i2.f411430a.getClass();
        return new l(hVar, i2.a.f411433c);
    }
}
