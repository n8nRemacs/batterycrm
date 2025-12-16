package com.avito.android.settings;

import Nv0.InterfaceC14616a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SettingsMviViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.settings.mvi.k f280890a;

    public j(com.avito.android.settings.mvi.k kVar) {
        this.f280890a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = new i((com.avito.android.settings.mvi.j) this.f280890a.get(), null, 2, null);
        iVar.accept(InterfaceC14616a.b.f11811a);
        return iVar;
    }
}
