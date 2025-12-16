package com.avito.android.developments_catalog.residential_complex_search;

import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lx.InterfaceC43844a;
import tx.C48734a;

/* compiled from: ResidentialComplexInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43844a> f139196a;

    /* renamed from: b, reason: collision with root package name */
    public final l f139197b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f139198c;

    public j(l lVar, Provider provider, Provider provider2) {
        this.f139196a = provider;
        this.f139197b = lVar;
        this.f139198c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f139196a.get(), (C48734a) this.f139197b.f393949a, this.f139198c.get());
    }
}
