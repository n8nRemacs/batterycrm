package com.avito.android.advert.item.auto_media;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAutoMediaAnalyticsImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f72917a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f72917a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f72917a.get());
    }
}
