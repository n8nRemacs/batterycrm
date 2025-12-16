package com.avito.android.autoteka.items.choosingProduct;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FullscreenChoosingProductBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final m f96727a;

    public j(m mVar) {
        this.f96727a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((l) this.f96727a.get());
    }
}
