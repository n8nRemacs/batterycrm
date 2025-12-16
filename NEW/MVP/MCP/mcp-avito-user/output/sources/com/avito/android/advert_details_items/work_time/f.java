package com.avito.android.advert_details_items.work_time;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsServicesWorkTimePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f85782a;

    public f(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f85782a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f85782a.get());
    }
}
