package com.avito.android.installments.form;

import dagger.internal.y;

/* compiled from: InstallmentsFormViewModel_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.installments.form.mvi.j f172822a;

    public u(com.avito.android.installments.form.mvi.j jVar) {
        this.f172822a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t((com.avito.android.installments.form.mvi.i) this.f172822a.get(), null, 2, null);
    }
}
