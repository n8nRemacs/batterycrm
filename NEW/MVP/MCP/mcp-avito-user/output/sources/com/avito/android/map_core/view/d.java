package com.avito.android.map_core.view;

import com.avito.android.avito_map.AvitoMapAttachHelper;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MapAsyncProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f185698a;

    public d(u uVar) {
        this.f185698a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((AvitoMapAttachHelper) this.f185698a.get());
    }
}
