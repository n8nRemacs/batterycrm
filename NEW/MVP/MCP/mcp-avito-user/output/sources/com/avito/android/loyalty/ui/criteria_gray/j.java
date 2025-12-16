package com.avito.android.loyalty.ui.criteria_gray;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: CriteriaGrayViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.loyalty.ui.criteria_gray.mvi.j f183601a;

    public j(com.avito.android.loyalty.ui.criteria_gray.mvi.j jVar) {
        this.f183601a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.loyalty.ui.criteria_gray.mvi.i iVar = (com.avito.android.loyalty.ui.criteria_gray.mvi.i) this.f183601a.get();
        i2.f411430a.getClass();
        return new i(iVar, i2.a.f411433c);
    }
}
