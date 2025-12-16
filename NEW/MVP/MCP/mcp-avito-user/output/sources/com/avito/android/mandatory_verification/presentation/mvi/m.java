package com.avito.android.mandatory_verification.presentation.mvi;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: MandatoryVerificationViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final g f184806a;

    public m(g gVar) {
        this.f184806a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f184806a.get();
        i2.f411430a.getClass();
        return new l(fVar, i2.a.f411433c);
    }
}
