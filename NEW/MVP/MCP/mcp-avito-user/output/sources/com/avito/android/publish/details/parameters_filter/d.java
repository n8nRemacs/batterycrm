package com.avito.android.publish.details.parameters_filter;

import com.avito.android.publish.details.S0;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishParametersPaginationRepositoryFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f234879a;

    /* renamed from: b, reason: collision with root package name */
    public final u f234880b;

    /* renamed from: c, reason: collision with root package name */
    public final u f234881c;

    /* renamed from: d, reason: collision with root package name */
    public final u f234882d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<S0> f234883e;

    public d(u uVar, u uVar2, u uVar3, u uVar4, Provider provider) {
        this.f234879a = uVar;
        this.f234880b = uVar2;
        this.f234881c = uVar3;
        this.f234882d = uVar4;
        this.f234883e = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((H0) this.f234879a.get(), (CategoryParametersConverter) this.f234880b.get(), (AttributesTreeConverter) this.f234881c.get(), (C50213a) this.f234882d.get(), this.f234883e.get());
    }
}
