package com.avito.android.vas_union;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: VasUnionV2ViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_union.mvi.g f323206a;

    public j(com.avito.android.vas_union.mvi.g gVar) {
        this.f323206a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_union.mvi.f fVar = (com.avito.android.vas_union.mvi.f) this.f323206a.get();
        i2.f411430a.getClass();
        return new i(fVar, i2.a.f411433c);
    }
}
