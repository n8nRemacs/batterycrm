package com.avito.android.installments.form.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InstallmentsFormOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f172796a;

    public l(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f172796a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f172796a.get());
    }
}
