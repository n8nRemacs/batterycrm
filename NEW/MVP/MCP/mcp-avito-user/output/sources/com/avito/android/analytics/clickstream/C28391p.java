package com.avito.android.analytics.clickstream;

import com.avito.android.analytics.clickstream.C28379d;
import javax.inject.Provider;

/* compiled from: ClickStreamCommonModule_ProvideProhibitedEventsFilters$_common_analytics_clickstream_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.analytics.clickstream.p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28391p implements dagger.internal.h<C28379d.f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.I> f89823a;

    public C28391p(Provider<com.avito.android.I> provider) {
        this.f89823a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.I i12 = this.f89823a.get();
        C28379d.f89781a.getClass();
        return new c0(i12);
    }
}
