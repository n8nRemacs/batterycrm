package com.avito.android.short_term_rent.bookingform.domain.validation;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InputsValidator_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f281443a;

    public d(Provider<R0> provider) {
        this.f281443a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f281443a.get());
    }
}
