package com.avito.android.favorite_sellers.di;

import Pz.C14860a;
import dagger.internal.x;
import dagger.internal.y;
import io.reactivex.rxjava3.core.z;
import javax.inject.Provider;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FavoriteSellersModule_ProvideNotificationSettingsFlow$_avito_favorite_sellers_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<InterfaceC43160i<C14860a>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<z<C14860a>> f155883a;

    public n(Provider<z<C14860a>> provider) {
        this.f155883a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        z<C14860a> zVar = this.f155883a.get();
        d.f155872a.getClass();
        return kotlinx.coroutines.rx3.y.a(zVar);
    }
}
