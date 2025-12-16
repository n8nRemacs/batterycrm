package com.avito.android.profile.edit.di;

import com.avito.android.profile.edit.di.C33316a;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: EditProfileModule_ProvideAvatarInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.profile.edit.di.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33321f implements dagger.internal.h<com.avito.android.profile.edit.avatar.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f222162a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f222163b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f222164c;

    public C33321f(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f222162a = provider;
        this.f222163b = uVar;
        this.f222164c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34401z0 interfaceC34401z0 = (InterfaceC34401z0) ((C33316a.c.i) this.f222162a).get();
        com.avito.android.photo_picker.converter.f fVar = (com.avito.android.photo_picker.converter.f) this.f222163b.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((C33316a.c.k) this.f222164c).get();
        C33319d.f222158a.getClass();
        return new com.avito.android.profile.edit.avatar.d(interfaceC34401z0, fVar, interfaceC35745a5);
    }
}
