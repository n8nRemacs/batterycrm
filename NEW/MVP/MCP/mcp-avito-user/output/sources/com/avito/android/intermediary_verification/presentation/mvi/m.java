package com.avito.android.intermediary_verification.presentation.mvi;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: IntermediaryVerificationViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final g f173202a;

    public m(g gVar) {
        this.f173202a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f173202a.get();
        i2.f411430a.getClass();
        return new l(fVar, i2.a.f411433c);
    }
}
