package com.avito.android.mortgage.consultation.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageAssignConsultationUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.consultation.data.e f198569a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f198570b;

    public b(com.avito.android.mortgage.consultation.data.e eVar, Provider provider) {
        this.f198569a = eVar;
        this.f198570b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.mortgage.consultation.data.a) this.f198569a.get(), this.f198570b.get());
    }
}
