package com.avito.android.mortgage.pre_approval.result;

import com.avito.android.mortgage.pre_approval.result.mvi.i;
import com.avito.android.mortgage.pre_approval.result.mvi.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: PreApprovalResultViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final j f202002a;

    public d(j jVar) {
        this.f202002a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f202002a.get();
        i2.f411430a.getClass();
        return new c(iVar, i2.a.f411433c);
    }
}
