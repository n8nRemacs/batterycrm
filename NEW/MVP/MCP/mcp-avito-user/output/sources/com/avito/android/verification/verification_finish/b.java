package com.avito.android.verification.verification_finish;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: FinishViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_finish.mvi.i f325243a;

    public b(com.avito.android.verification.verification_finish.mvi.i iVar) {
        this.f325243a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.verification_finish.mvi.h hVar = (com.avito.android.verification.verification_finish.mvi.h) this.f325243a.get();
        i2.f411430a.getClass();
        return new a(hVar, i2.a.f411433c);
    }
}
