package com.avito.android.profile_settings_basic;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: AvatarInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.profile_settings_basic.i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33464i implements dagger.internal.h<C33461f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f228844a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f228845b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f228846c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.photo_picker.converter.f> f228847d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC33456a> f228848e;

    public C33464i(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, Provider provider, Provider provider2) {
        this.f228844a = uVar;
        this.f228845b = uVar2;
        this.f228846c = uVar3;
        this.f228847d = provider;
        this.f228848e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33461f(dagger.internal.g.b(this.f228844a), dagger.internal.g.b(this.f228845b), (R0) this.f228846c.get(), this.f228847d.get(), this.f228848e.get());
    }
}
