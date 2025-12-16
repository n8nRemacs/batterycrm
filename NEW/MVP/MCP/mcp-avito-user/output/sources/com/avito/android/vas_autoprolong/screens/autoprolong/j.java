package com.avito.android.vas_autoprolong.screens.autoprolong;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: AutoprolongViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_autoprolong.screens.autoprolong.mvi.i f319529a;

    public j(com.avito.android.vas_autoprolong.screens.autoprolong.mvi.i iVar) {
        this.f319529a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_autoprolong.screens.autoprolong.mvi.h hVar = (com.avito.android.vas_autoprolong.screens.autoprolong.mvi.h) this.f319529a.get();
        i2.f411430a.getClass();
        return new i(hVar, i2.a.f411433c);
    }
}
