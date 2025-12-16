package com.avito.android.mortgage.consultation.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageLoadConsultationFormUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.consultation.data.e f198576a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f198577b;

    public d(com.avito.android.mortgage.consultation.data.e eVar, Provider provider) {
        this.f198576a = eVar;
        this.f198577b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.mortgage.consultation.data.a) this.f198576a.get(), this.f198577b.get());
    }
}
