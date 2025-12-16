package com.avito.android.service.short_task.metrics;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: DarkThemeDetectionProvider_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<DarkThemeDetectionProvider> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f274079a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Context> f274080b;

    public f(Provider<InterfaceC28373a> provider, Provider<Context> provider2) {
        this.f274079a = provider;
        this.f274080b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new DarkThemeDetectionProvider(this.f274080b.get(), this.f274079a.get());
    }
}
