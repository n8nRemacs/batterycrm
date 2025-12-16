package com.avito.android.publish.price_list.domain;

import com.avito.android.publish.C0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.x1;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: SelectPriceListInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<x1> f238561a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f238562b;

    /* renamed from: c, reason: collision with root package name */
    public final u f238563c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C50213a> f238564d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f238565e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f238566f;

    public i(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f238561a = provider;
        this.f238562b = provider2;
        this.f238563c = uVar;
        this.f238564d = provider3;
        this.f238565e = provider4;
        this.f238566f = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(dagger.internal.g.b(this.f238561a), this.f238562b.get(), (CategoryParametersConverter) this.f238563c.get(), this.f238564d.get(), this.f238565e.get(), this.f238566f.get());
    }
}
