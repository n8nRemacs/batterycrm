package com.avito.android.publish.screen.step.suggest.category.data;

import com.avito.android.Q1;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: SuggestCategoryRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H0> f242287a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f242288b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<CategoryParametersConverter> f242289c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Q1> f242290d;

    public g(Provider<H0> provider, Provider<C50213a> provider2, Provider<CategoryParametersConverter> provider3, Provider<Q1> provider4) {
        this.f242287a = provider;
        this.f242288b = provider2;
        this.f242289c = provider3;
        this.f242290d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f242287a.get(), this.f242288b.get(), this.f242289c.get(), this.f242290d.get());
    }
}
