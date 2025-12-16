package com.avito.android.esia_sdk.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EsiaSdkActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f148145a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f148146b;

    public e(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.android.deep_linking.x> provider2) {
        this.f148145a = provider;
        this.f148146b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f148145a.get(), this.f148146b.get());
    }
}
