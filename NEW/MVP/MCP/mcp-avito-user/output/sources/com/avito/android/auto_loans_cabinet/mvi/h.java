package com.avito.android.auto_loans_cabinet.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoLoansCabinetBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.auto_loans_cabinet.domain.c f95492a;

    public h(com.avito.android.auto_loans_cabinet.domain.c cVar) {
        this.f95492a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.auto_loans_cabinet.domain.a) this.f95492a.get());
    }
}
