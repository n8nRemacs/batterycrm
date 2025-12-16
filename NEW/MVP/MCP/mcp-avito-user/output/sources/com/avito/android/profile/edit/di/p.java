package com.avito.android.profile.edit.di;

/* compiled from: EditProfileModule_ProvideInputItemBlueprint$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<com.avito.android.profile.edit.adapter.f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f222177a;

    public p(dagger.internal.u uVar) {
        this.f222177a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile.edit.refactoring.adapter.l lVar = (com.avito.android.profile.edit.refactoring.adapter.l) this.f222177a.get();
        C33319d.f222158a.getClass();
        return new com.avito.android.profile.edit.adapter.f(lVar);
    }
}
