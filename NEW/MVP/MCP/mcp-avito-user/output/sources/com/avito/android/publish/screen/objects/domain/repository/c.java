package com.avito.android.publish.screen.objects.domain.repository;

import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ObjectCategoryRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<CategoryParameters> f240013a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ObjectsParameter> f240014b;

    /* renamed from: c, reason: collision with root package name */
    public final u f240015c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f240013a = provider;
        this.f240014b = provider2;
        this.f240015c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.b(this.f240013a), dagger.internal.g.b(this.f240014b), (Integer) this.f240015c.get());
    }
}
