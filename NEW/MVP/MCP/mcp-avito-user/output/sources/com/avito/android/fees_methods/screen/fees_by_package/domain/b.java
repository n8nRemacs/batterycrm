package com.avito.android.fees_methods.screen.fees_by_package.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetFeesByPackageUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f158005a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AE.a> f158006b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f158007c;

    public b(l lVar, Provider provider, Provider provider2) {
        this.f158005a = lVar;
        this.f158006b = provider;
        this.f158007c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f158005a.f393949a, this.f158006b.get(), this.f158007c.get());
    }
}
