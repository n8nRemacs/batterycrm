package com.avito.android.mortgage.applicant_type.mvi;

import com.avito.android.mortgage.applicant_type.model.ApplicantTypeSelectorArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ApplicantTypeSelectorBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f198317a;

    public d(l lVar) {
        this.f198317a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((ApplicantTypeSelectorArguments) this.f198317a.f393949a);
    }
}
