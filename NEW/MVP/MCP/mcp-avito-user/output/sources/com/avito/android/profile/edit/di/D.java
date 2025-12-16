package com.avito.android.profile.edit.di;

/* compiled from: EditProfileModule_ProvideSubLocationItemBlueprint$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class D implements dagger.internal.h<com.avito.android.profile.edit.adapter.l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f222092a;

    public D(dagger.internal.u uVar) {
        this.f222092a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile.edit.refactoring.adapter.w wVar = (com.avito.android.profile.edit.refactoring.adapter.w) this.f222092a.get();
        C33319d.f222158a.getClass();
        return new com.avito.android.profile.edit.adapter.l(wVar);
    }
}
