package com.avito.android.publish.drafts.di;

import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishDraftsModule_ProvideCategoryParametersConverterFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<CategoryParametersConverter> {

    /* compiled from: PublishDraftsModule_ProvideCategoryParametersConverterFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f235352a = new k();
    }

    public static k a() {
        return a.f235352a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = h.f235345a;
        return new CategoryParametersConverter(null, null, null, 7, null);
    }
}
