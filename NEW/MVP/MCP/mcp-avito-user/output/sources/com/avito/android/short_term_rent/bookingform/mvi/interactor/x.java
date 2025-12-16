package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import dagger.internal.y;

/* compiled from: ValidateInputsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.short_term_rent.bookingform.domain.validation.d f281960a;

    public x(com.avito.android.short_term_rent.bookingform.domain.validation.d dVar) {
        this.f281960a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w((com.avito.android.short_term_rent.bookingform.domain.validation.c) this.f281960a.get());
    }
}
