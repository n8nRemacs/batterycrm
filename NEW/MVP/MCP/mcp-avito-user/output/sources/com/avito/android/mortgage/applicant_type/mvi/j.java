package com.avito.android.mortgage.applicant_type.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ApplicantTypeSelectorReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final OZ.d f198334a;

    public j(OZ.d dVar) {
        this.f198334a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((OZ.b) this.f198334a.get());
    }
}
