package com.avito.android.mortgage.consultation.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MortgageConsultationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.consultation.domain.d f198597a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage.consultation.domain.b f198598b;

    /* renamed from: c, reason: collision with root package name */
    public final UZ.c f198599c;

    public b(com.avito.android.mortgage.consultation.domain.d dVar, com.avito.android.mortgage.consultation.domain.b bVar, UZ.c cVar) {
        this.f198597a = dVar;
        this.f198598b = bVar;
        this.f198599c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.mortgage.consultation.domain.c) this.f198597a.get(), (com.avito.android.mortgage.consultation.domain.a) this.f198598b.get(), (UZ.a) this.f198599c.get());
    }
}
