package com.avito.android.widget_filters.domain.use_case;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WidgetFiltersUpdateCategoryWidgetStateUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.utils.b> f329918a;

    public g(Provider<com.avito.android.widget_filters.utils.b> provider) {
        this.f329918a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f329918a.get());
    }
}
