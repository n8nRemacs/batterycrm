package com.avito.android.favorites.di;

import com.avito.android.favorites.C30684r0;
import com.avito.android.favorites.InterfaceC30683q0;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertsModule_ProvideFavoritesListPresenterListenerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<InterfaceC30683q0.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30683q0> f157348a;

    public p(Provider<InterfaceC30683q0> provider) {
        this.f157348a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC30683q0 interfaceC30683q0 = this.f157348a.get();
        C30647e.f157320a.getClass();
        C30684r0.C30689e f157500w0 = interfaceC30683q0.getF157500w0();
        dagger.internal.t.d(f157500w0);
        return f157500w0;
    }
}
