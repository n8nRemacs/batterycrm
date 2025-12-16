package com.avito.android.advert_details_items.imv_v4_cars;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvCarsAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f84842a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f84842a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f84842a.get());
    }
}
