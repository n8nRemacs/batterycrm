package com.avito.android.silent_update.permissions;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PermissionsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.silent_update.permissions.mvi.h f283716a;

    public h(com.avito.android.silent_update.permissions.mvi.h hVar) {
        this.f283716a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.silent_update.permissions.mvi.g) this.f283716a.get(), null, 2, null);
    }
}
