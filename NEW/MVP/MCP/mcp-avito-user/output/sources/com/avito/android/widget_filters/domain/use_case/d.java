package com.avito.android.widget_filters.domain.use_case;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetSuggestedLocationsUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.geo_common.interactor.g> f329915a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f329916b;

    public d(Provider<com.avito.android.geo_common.interactor.g> provider, Provider<R0> provider2) {
        this.f329915a = provider;
        this.f329916b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f329915a.get(), this.f329916b.get());
    }
}
