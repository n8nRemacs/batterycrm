package com.avito.android.favorite_sellers;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: TabOpenAnalyticsImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class W implements dagger.internal.h<TabOpenAnalyticsImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f155486a;

    public W(Provider<InterfaceC28373a> provider) {
        this.f155486a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new TabOpenAnalyticsImpl(this.f155486a.get());
    }
}
