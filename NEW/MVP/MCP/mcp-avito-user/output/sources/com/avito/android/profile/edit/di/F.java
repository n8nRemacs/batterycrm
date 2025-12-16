package com.avito.android.profile.edit.di;

/* compiled from: EditProfileModule_ProvideTextItemBlueprint$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class F implements dagger.internal.h<com.avito.android.profile.edit.adapter.m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f222094a;

    public F(dagger.internal.u uVar) {
        this.f222094a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile.edit.refactoring.adapter.z zVar = (com.avito.android.profile.edit.refactoring.adapter.z) this.f222094a.get();
        C33319d.f222158a.getClass();
        return new com.avito.android.profile.edit.adapter.m(zVar);
    }
}
