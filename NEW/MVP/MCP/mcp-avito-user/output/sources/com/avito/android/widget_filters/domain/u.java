package com.avito.android.widget_filters.domain;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: WidgetFiltersOnboardingStorageImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f329907a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f329908b;

    public u(dagger.internal.u uVar, Provider provider) {
        this.f329907a = uVar;
        this.f329908b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f329908b.get(), dagger.internal.g.a(dagger.internal.w.a(this.f329907a)));
    }
}
