package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: DeleteApplicantUseCaseImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.mortgage.root.mvi.domain.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32699m implements dagger.internal.h<C32698l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f203099a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage.util.e f203100b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f203101c;

    public C32699m(Provider provider, com.avito.android.mortgage.util.e eVar, Provider provider2) {
        this.f203099a = provider;
        this.f203100b = eVar;
        this.f203101c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f203099a);
        this.f203100b.getClass();
        return new C32698l(eVarB, new com.avito.android.mortgage.util.d(), this.f203101c.get());
    }
}
