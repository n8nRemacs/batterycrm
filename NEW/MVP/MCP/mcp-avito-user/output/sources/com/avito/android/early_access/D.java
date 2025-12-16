package com.avito.android.early_access;

import com.avito.android.early_access.mvi.C30300q;

/* compiled from: EarlyAccessViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.early_access.mvi.r f145054a;

    public D(com.avito.android.early_access.mvi.r rVar) {
        this.f145054a = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C((C30300q) this.f145054a.get(), null, 2, null);
    }
}
