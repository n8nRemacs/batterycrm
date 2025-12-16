package com.avito.android.verification.verification_disclaimer;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: VerificationDisclaimerMviViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_disclaimer.mvi.m f325072a;

    public l(com.avito.android.verification.verification_disclaimer.mvi.m mVar) {
        this.f325072a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.verification_disclaimer.mvi.l lVar = (com.avito.android.verification.verification_disclaimer.mvi.l) this.f325072a.get();
        i2.f411430a.getClass();
        return new k(lVar, i2.a.f411433c);
    }
}
