package com.avito.android.screens.bbip_private;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: BbipPrivateViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.screens.bbip_private.mvi.i f260559a;

    public i(com.avito.android.screens.bbip_private.mvi.i iVar) {
        this.f260559a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.screens.bbip_private.mvi.h hVar = (com.avito.android.screens.bbip_private.mvi.h) this.f260559a.get();
        i2.f411430a.getClass();
        return new h(hVar, i2.a.f411433c);
    }
}
