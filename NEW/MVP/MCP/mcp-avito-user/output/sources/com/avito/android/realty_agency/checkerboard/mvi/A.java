package com.avito.android.realty_agency.checkerboard.mvi;

import bi0.InterfaceC25655a;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: CheckerboardInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC25655a> f251220a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f251221b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f251222c;

    public A(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f251220a = provider;
        this.f251221b = provider2;
        this.f251222c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new z(this.f251220a.get(), this.f251221b.get(), (SearchParamsConverter) this.f251222c.get());
    }
}
