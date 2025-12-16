package com.avito.android.advert_core.price_list.preview;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertPriceListPreviewItemViewPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f84134a;

    public j(Provider<InterfaceC28373a> provider) {
        this.f84134a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f84134a.get());
    }
}
