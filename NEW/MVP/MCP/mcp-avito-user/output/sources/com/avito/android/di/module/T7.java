package com.avito.android.di.module;

import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl;

/* compiled from: SerpInteractorModule_ProvideSearchParamsConverter$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes13.dex */
public final class T7 implements dagger.internal.h<SearchParamsConverter> {

    /* compiled from: SerpInteractorModule_ProvideSearchParamsConverter$_avito_discouraged_avito_libs_serp_core_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final T7 f144142a = new T7();
    }

    public static T7 a() {
        return a.f144142a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = R7.f144121a;
        return new SearchParamsConverterImpl();
    }
}
