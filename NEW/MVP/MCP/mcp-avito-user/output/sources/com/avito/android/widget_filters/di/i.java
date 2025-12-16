package com.avito.android.widget_filters.di;

import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WidgetFiltersModule_ProvideSearchParamsConverter$_avito_widget_filters_implFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<SearchParamsConverter> {

    /* compiled from: WidgetFiltersModule_ProvideSearchParamsConverter$_avito_widget_filters_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f329836a = new i();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = h.f329835a;
        return new SearchParamsConverterImpl();
    }
}
