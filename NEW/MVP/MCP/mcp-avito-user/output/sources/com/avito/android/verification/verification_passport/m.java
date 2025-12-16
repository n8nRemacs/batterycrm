package com.avito.android.verification.verification_passport;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: VerificationPassportViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_passport.mvi.j f325710a;

    public m(com.avito.android.verification.verification_passport.mvi.j jVar) {
        this.f325710a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.verification_passport.mvi.i iVar = (com.avito.android.verification.verification_passport.mvi.i) this.f325710a.get();
        i2.f411430a.getClass();
        return new l(iVar, i2.a.f411433c);
    }
}
