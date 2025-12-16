package com.avito.android.category.di;

import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategoryModule_ProvideSearchParamsConverterFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<SearchParamsConverter> {

    /* compiled from: CategoryModule_ProvideSearchParamsConverterFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f116546a = new g();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = e.f116542a;
        return new SearchParamsConverterImpl();
    }
}
