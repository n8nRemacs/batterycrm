package com.avito.android.mortgage.consultation.mvi;

import com.avito.android.mortgage.consultation.model.ConsultationArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MortgageConsultationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f198607a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage.consultation.domain.d f198608b;

    /* renamed from: c, reason: collision with root package name */
    public final UZ.c f198609c;

    public d(l lVar, com.avito.android.mortgage.consultation.domain.d dVar, UZ.c cVar) {
        this.f198607a = lVar;
        this.f198608b = dVar;
        this.f198609c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((ConsultationArguments) this.f198607a.f393949a, (com.avito.android.mortgage.consultation.domain.c) this.f198608b.get(), (UZ.a) this.f198609c.get());
    }
}
