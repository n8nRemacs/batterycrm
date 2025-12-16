package com.avito.android.publish.objects.di;

import com.avito.android.publish.C0;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvideParametersFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class T implements dagger.internal.h<CategoryParameters> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f237669a;

    public T(Provider<C0> provider) {
        this.f237669a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0 c02 = this.f237669a.get();
        C33939w.f238031a.getClass();
        CategoryParameters categoryParameters = c02.f231873k0;
        if (categoryParameters != null) {
            return categoryParameters;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
