package com.avito.android.mortgage.pre_approval.form.mvi.domain;

import com.avito.android.mortgage.pre_approval.form.mvi.builders.l;
import com.avito.android.mortgage.pre_approval.form.mvi.builders.n;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ValidationUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final n f201913a;

    public i(n nVar) {
        this.f201913a = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((l) this.f201913a.get());
    }
}
