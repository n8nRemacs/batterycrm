package com.avito.android.widget_filters.domain;

import com.google.gson.Gson;
import javax.inject.Provider;

/* compiled from: WidgetFiltersParametersBuilderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Gson> f329924a;

    public x(Provider<Gson> provider) {
        this.f329924a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w(this.f329924a.get());
    }
}
