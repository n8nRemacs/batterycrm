package com.avito.android.publish.price_list.di;

import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectPriceListModule_ProvideConverterFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<CategoryParametersConverter> {

    /* compiled from: SelectPriceListModule_ProvideConverterFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final o f238519a = new o();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.f238518a.getClass();
        return new CategoryParametersConverter(null, null, null, 7, null);
    }
}
