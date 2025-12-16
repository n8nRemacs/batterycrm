package com.avito.android.profile.edit.di;

/* compiled from: EditProfileModule_ProvidePhoneInputItemBlueprint$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class y implements dagger.internal.h<com.avito.android.profile.edit.adapter.k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f222201a;

    public y(dagger.internal.u uVar) {
        this.f222201a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile.edit.refactoring.adapter.p pVar = (com.avito.android.profile.edit.refactoring.adapter.p) this.f222201a.get();
        C33319d.f222158a.getClass();
        return new com.avito.android.profile.edit.adapter.k(pVar);
    }
}
