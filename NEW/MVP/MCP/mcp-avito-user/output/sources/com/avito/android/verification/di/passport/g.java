package com.avito.android.verification.di.passport;

import com.avito.android.deep_linking.links.VerificationSumsubLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VerificationCyberityLinkHandlerModule_ProvideVerificationSumSubLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_passport.f f323821a;

    public g(com.avito.android.verification.verification_passport.f fVar) {
        this.f323821a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.verification_passport.f fVar = this.f323821a;
        f.f323820a.getClass();
        return new C43834a(VerificationSumsubLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VerificationSumsubLink.class), fVar));
    }
}
