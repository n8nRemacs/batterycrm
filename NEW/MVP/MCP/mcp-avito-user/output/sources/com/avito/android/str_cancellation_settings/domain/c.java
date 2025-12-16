package com.avito.android.str_cancellation_settings.domain;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrCancellationSettingsAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f288332a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f288333b;

    public c(Provider<InterfaceC28373a> provider, Provider<com.avito.android.analytics.provider.a> provider2) {
        this.f288332a = provider;
        this.f288333b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f288332a.get(), this.f288333b.get());
    }
}
