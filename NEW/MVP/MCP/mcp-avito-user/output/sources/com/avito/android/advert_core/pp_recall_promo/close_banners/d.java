package com.avito.android.advert_core.pp_recall_promo.close_banners;

import com.avito.android.remote.InterfaceC34401z0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RemoteCloseBannerInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f83960a;

    public d(Provider<InterfaceC34401z0> provider) {
        this.f83960a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f83960a.get());
    }
}
