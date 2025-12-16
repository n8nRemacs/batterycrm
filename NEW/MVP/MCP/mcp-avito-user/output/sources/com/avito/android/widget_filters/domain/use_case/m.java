package com.avito.android.widget_filters.domain.use_case;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WidgetFiltersUpdateGuestsWidgetStateUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.widget_filters.utils.b> f329921a;

    public m(Provider<com.avito.android.widget_filters.utils.b> provider) {
        this.f329921a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f329921a.get());
    }
}
