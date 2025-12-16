package com.avito.android.installmentsblock.mvi;

import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InstallmentsBlockOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f173006a;

    public l(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f173006a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(dagger.internal.g.a(w.a(this.f173006a)));
    }
}
