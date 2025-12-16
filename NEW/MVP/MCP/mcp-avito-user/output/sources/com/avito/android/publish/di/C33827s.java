package com.avito.android.publish.di;

import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;

/* compiled from: PublishModule_ProvideConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.di.s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33827s implements dagger.internal.h<CategoryParametersConverter> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235282a;

    public C33827s(C33824o c33824o) {
        this.f235282a = c33824o;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f235282a.getClass();
        return new CategoryParametersConverter(null, null, null, 7, null);
    }
}
