package com.avito.android.passport.profile_add.create_flow.verification_popup.mvi;

import com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationPopupActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final M50.c f212269a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f212270b;

    public e(M50.c cVar, dagger.internal.l lVar) {
        this.f212269a = cVar;
        this.f212270b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((M50.a) this.f212269a.get(), (VerificationPopupArguments) this.f212270b.f393949a);
    }
}
