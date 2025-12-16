package com.avito.android.change_specific;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: ExtendedProfileChangeSpecificViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.change_specific.mvi.g f118044a;

    public o(com.avito.android.change_specific.mvi.g gVar) {
        this.f118044a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.change_specific.mvi.f fVar = (com.avito.android.change_specific.mvi.f) this.f118044a.get();
        i2.f411430a.getClass();
        return new n(fVar, i2.a.f411433c);
    }
}
