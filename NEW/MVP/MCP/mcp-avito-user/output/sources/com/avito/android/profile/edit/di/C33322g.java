package com.avito.android.profile.edit.di;

import com.avito.android.profile.edit.refactoring.adapter.InterfaceC33337a;

/* compiled from: EditProfileModule_ProvideAvatarItemBlueprint$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.profile.edit.di.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33322g implements dagger.internal.h<com.avito.android.profile.edit.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f222165a;

    public C33322g(dagger.internal.u uVar) {
        this.f222165a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33337a interfaceC33337a = (InterfaceC33337a) this.f222165a.get();
        C33319d.f222158a.getClass();
        return new com.avito.android.profile.edit.adapter.a(interfaceC33337a);
    }
}
