package com.avito.android.publish.imv;

import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: ServicesInstantMarketValueInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f236077a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34155z> f236078b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<CategoryParametersConverter> f236079c;

    /* renamed from: d, reason: collision with root package name */
    public final u f236080d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f236081e;

    public j(u uVar, u uVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f236077a = uVar;
        this.f236078b = provider;
        this.f236079c = provider2;
        this.f236080d = uVar2;
        this.f236081e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((H0) this.f236077a.get(), this.f236078b.get(), this.f236079c.get(), (C50213a) this.f236080d.get(), this.f236081e.get());
    }
}
