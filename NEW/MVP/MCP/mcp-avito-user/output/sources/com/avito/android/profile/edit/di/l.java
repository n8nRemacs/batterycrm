package com.avito.android.profile.edit.di;

/* compiled from: EditProfileModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f222173a;

    public l(dagger.internal.u uVar) {
        this.f222173a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.b bVar = (com.avito.android.recycler.data_aware.b) this.f222173a.get();
        C33319d.f222158a.getClass();
        return new com.avito.android.recycler.data_aware.i(bVar, new com.avito.android.recycler.data_aware.j(), true, null, 8, null);
    }
}
