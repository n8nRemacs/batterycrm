package com.avito.android.esia_webview.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EsiaWebViewActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f148190a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f148191b;

    public i(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.android.deep_linking.x> provider2) {
        this.f148190a = provider;
        this.f148191b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f148190a.get(), this.f148191b.get());
    }
}
