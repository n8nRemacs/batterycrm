package com.avito.android.installments.fakedoor;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InstallmentsFakedoorViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.installments.fakedoor.mvi.g f172561a;

    public m(com.avito.android.installments.fakedoor.mvi.g gVar) {
        this.f172561a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.installments.fakedoor.mvi.f) this.f172561a.get(), null, 2, null);
    }
}
