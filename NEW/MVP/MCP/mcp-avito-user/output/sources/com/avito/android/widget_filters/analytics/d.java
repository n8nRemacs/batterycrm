package com.avito.android.widget_filters.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.widget_filters.WidgetFiltersOpenParams;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WidgetFiltersAnalyticsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f329708a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f329709b;

    public d(dagger.internal.l lVar, Provider provider) {
        this.f329708a = lVar;
        this.f329709b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((WidgetFiltersOpenParams) this.f329708a.f393949a, this.f329709b.get());
    }
}
