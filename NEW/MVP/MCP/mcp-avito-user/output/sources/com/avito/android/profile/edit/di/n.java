package com.avito.android.profile.edit.di;

/* compiled from: EditProfileModule_ProvideErrorBlockItemBlueprint$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<com.avito.android.profile.edit.adapter.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f222175a;

    public n(dagger.internal.u uVar) {
        this.f222175a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile.edit.refactoring.adapter.j jVar = (com.avito.android.profile.edit.refactoring.adapter.j) this.f222175a.get();
        C33319d.f222158a.getClass();
        return new com.avito.android.profile.edit.adapter.e(jVar);
    }
}
