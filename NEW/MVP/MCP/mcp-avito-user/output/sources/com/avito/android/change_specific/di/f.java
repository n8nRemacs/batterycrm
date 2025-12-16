package com.avito.android.change_specific.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileChangeSpecificModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.change_specific.adapter.b f117969a;

    public f(com.avito.android.change_specific.adapter.b bVar) {
        this.f117969a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f117969a.getClass();
        com.avito.android.change_specific.adapter.a aVar = new com.avito.android.change_specific.adapter.a();
        d.f117965a.getClass();
        return new com.avito.android.recycler.data_aware.i(new com.avito.android.recycler.data_aware.g(), null, false, aVar, 6, null);
    }
}
