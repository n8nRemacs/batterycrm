package com.avito.android.verification.verification_confirm_requisites;

import com.avito.android.verification.verification_confirm_requisites.mvi.l;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: VerificationConfirmRequisitesViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final l f324955a;

    public k(l lVar) {
        this.f324955a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.verification_confirm_requisites.mvi.k kVar = (com.avito.android.verification.verification_confirm_requisites.mvi.k) this.f324955a.get();
        i2.f411430a.getClass();
        return new j(kVar, i2.a.f411433c);
    }
}
