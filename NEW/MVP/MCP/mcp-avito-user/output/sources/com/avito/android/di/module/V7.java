package com.avito.android.di.module;

import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SuggestParamsConverter;
import com.avito.android.remote.model.SuggestParamsConverterImpl;

/* compiled from: SerpInteractorModule_ProvideSuggestParamsConverter$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class V7 implements dagger.internal.h<SuggestParamsConverter> {

    /* renamed from: a, reason: collision with root package name */
    public final T7 f144161a;

    public V7(T7 t72) {
        this.f144161a = t72;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        SearchParamsConverter searchParamsConverter = (SearchParamsConverter) this.f144161a.get();
        int i12 = R7.f144121a;
        return new SuggestParamsConverterImpl(searchParamsConverter);
    }
}
