package com.avito.android.bbl.screens.configure;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: BblConfigureViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bbl.screens.configure.mvi.i f99185a;

    public j(com.avito.android.bbl.screens.configure.mvi.i iVar) {
        this.f99185a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.bbl.screens.configure.mvi.h hVar = (com.avito.android.bbl.screens.configure.mvi.h) this.f99185a.get();
        i2.f411430a.getClass();
        return new i(hVar, i2.a.f411433c);
    }
}
