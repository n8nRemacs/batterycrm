package com.avito.android.publish.items.alert_banner;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AlertBannerModule_ProvideAlertBannerBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f236760a;

    public k(Provider<c> provider) {
        this.f236760a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = this.f236760a.get();
        j.f236759a.getClass();
        return new a(cVar);
    }
}
