package com.avito.android.publish.screen.objects.di;

import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;

/* compiled from: ObjectSupportModule_ProvideConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class A implements dagger.internal.h<CategoryParametersConverter> {

    /* renamed from: a, reason: collision with root package name */
    public final y f239547a;

    public A(y yVar) {
        this.f239547a = yVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f239547a.getClass();
        return new CategoryParametersConverter(null, null, null, 7, null);
    }
}
