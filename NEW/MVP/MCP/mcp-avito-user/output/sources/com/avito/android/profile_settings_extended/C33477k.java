package com.avito.android.profile_settings_extended;

import com.avito.android.remote.InterfaceC34401z0;
import javax.inject.Provider;

/* compiled from: ExtendedProfilePromoBlockInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.profile_settings_extended.k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33477k implements dagger.internal.h<C33476j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f230373a;

    public C33477k(Provider<InterfaceC34401z0> provider) {
        this.f230373a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33476j(dagger.internal.g.a(dagger.internal.w.a(this.f230373a)));
    }
}
