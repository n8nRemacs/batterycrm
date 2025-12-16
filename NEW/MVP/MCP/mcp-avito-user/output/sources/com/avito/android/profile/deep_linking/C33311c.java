package com.avito.android.profile.deep_linking;

import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: CloseInternalBannerRotationDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.profile.deep_linking.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33311c implements dagger.internal.h<C33310b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f221895a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f221896b;

    public C33311c(Provider<InterfaceC34401z0> provider, Provider<R0> provider2) {
        this.f221895a = provider;
        this.f221896b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33310b(this.f221895a.get(), this.f221896b.get());
    }
}
