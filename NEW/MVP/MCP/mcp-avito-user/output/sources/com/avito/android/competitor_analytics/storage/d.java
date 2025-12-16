package com.avito.android.competitor_analytics.storage;

import AK0.l;
import com.avito.android.util.R0;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CompetitorAnalyticsStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f124572a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f124573b;

    public d(Provider<l> provider, Provider<R0> provider2) {
        this.f124572a = provider;
        this.f124573b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f124573b.get(), g.a(w.a(this.f124572a)));
    }
}
