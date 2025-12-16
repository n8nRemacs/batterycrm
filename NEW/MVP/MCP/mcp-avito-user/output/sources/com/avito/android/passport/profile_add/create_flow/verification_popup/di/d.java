package com.avito.android.passport.profile_add.create_flow.verification_popup.di;

import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupArguments;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationPopupModule_ProvideFlowFactory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<ProfileCreateExtendedFlow> {

    /* renamed from: a, reason: collision with root package name */
    public final l f212254a;

    public d(l lVar) {
        this.f212254a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        VerificationPopupArguments verificationPopupArguments = (VerificationPopupArguments) this.f212254a.f393949a;
        c.f212253a.getClass();
        ProfileCreateExtendedFlow profileCreateExtendedFlow = verificationPopupArguments.f212202d;
        t.d(profileCreateExtendedFlow);
        return profileCreateExtendedFlow;
    }
}
