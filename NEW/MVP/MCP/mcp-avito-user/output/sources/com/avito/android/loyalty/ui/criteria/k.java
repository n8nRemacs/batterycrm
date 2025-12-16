package com.avito.android.loyalty.ui.criteria;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: CriteriaViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.loyalty.ui.criteria.mvi.j f183519a;

    public k(com.avito.android.loyalty.ui.criteria.mvi.j jVar) {
        this.f183519a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.loyalty.ui.criteria.mvi.i iVar = (com.avito.android.loyalty.ui.criteria.mvi.i) this.f183519a.get();
        i2.f411430a.getClass();
        return new j(iVar, i2.a.f411433c);
    }
}
