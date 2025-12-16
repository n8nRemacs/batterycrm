package com.avito.android.profile.edit.di;

/* compiled from: EditProfileModule_ProvideLocationItemBlueprint$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class w implements dagger.internal.h<com.avito.android.profile.edit.adapter.g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f222199a;

    public w(dagger.internal.u uVar) {
        this.f222199a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile.edit.adapter.h hVar = (com.avito.android.profile.edit.adapter.h) this.f222199a.get();
        C33319d.f222158a.getClass();
        return new com.avito.android.profile.edit.adapter.g(hVar);
    }
}
