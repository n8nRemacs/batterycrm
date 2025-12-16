package com.avito.android.publish.screen.objects.di;

import com.avito.android.publish.C0;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import javax.inject.Provider;

/* compiled from: ObjectSupportModule_ProvideParametersFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class J implements dagger.internal.h<CategoryParameters> {

    /* renamed from: a, reason: collision with root package name */
    public final y f239562a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f239563b;

    public J(y yVar, Provider<C0> provider) {
        this.f239562a = yVar;
        this.f239563b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0 c02 = this.f239563b.get();
        this.f239562a.getClass();
        CategoryParameters categoryParameters = c02.f231873k0;
        if (categoryParameters != null) {
            return categoryParameters;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
