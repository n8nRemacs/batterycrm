package com.avito.android.mortgage.pre_approval.form;

import com.avito.android.mortgage.pre_approval.form.mvi.i;
import com.avito.android.mortgage.pre_approval.form.mvi.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PreApprovalFormViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final j f201738a;

    public f(j jVar) {
        this.f201738a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((i) this.f201738a.get(), null, 2, null);
    }
}
