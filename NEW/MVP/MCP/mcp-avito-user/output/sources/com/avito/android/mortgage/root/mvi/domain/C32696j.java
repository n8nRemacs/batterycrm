package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: CreateApplicantUseCaseImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.mortgage.root.mvi.domain.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32696j implements dagger.internal.h<C32695i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f203088a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage.util.e f203089b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f203090c;

    public C32696j(Provider provider, com.avito.android.mortgage.util.e eVar, Provider provider2) {
        this.f203088a = provider;
        this.f203089b = eVar;
        this.f203090c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f203088a);
        this.f203089b.getClass();
        return new C32695i(eVarB, new com.avito.android.mortgage.util.d(), this.f203090c.get());
    }
}
