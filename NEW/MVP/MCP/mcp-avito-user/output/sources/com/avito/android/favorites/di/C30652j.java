package com.avito.android.favorites.di;

import com.avito.android.favorites.InterfaceC30683q0;
import iT.InterfaceC41342b;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertsModule_ProvideBeduinMetaStoragesProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.favorites.di.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30652j implements dagger.internal.h<InterfaceC41342b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30683q0> f157327a;

    public C30652j(Provider<InterfaceC30683q0> provider) {
        this.f157327a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC30683q0 interfaceC30683q0 = this.f157327a.get();
        C30647e.f157320a.getClass();
        return new com.avito.android.ai_assistant.screens.chat.a(interfaceC30683q0, 1);
    }
}
