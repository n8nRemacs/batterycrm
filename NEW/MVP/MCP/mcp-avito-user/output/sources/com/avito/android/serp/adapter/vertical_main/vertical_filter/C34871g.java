package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: VerticalFilterAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34871g implements dagger.internal.h<C34870f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f273533a;

    public C34871g(Provider<InterfaceC28373a> provider) {
        this.f273533a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34870f(this.f273533a.get());
    }
}
