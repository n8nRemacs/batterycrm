package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: MandatoryVerificationItemsModule_ProvideMandatoryVerificationAccountVerificationItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33732m implements dagger.internal.h<com.avito.android.mandatory_verification.items.accountVerification.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.mandatory_verification.items.accountVerification.e> f234575a;

    public C33732m(Provider<com.avito.android.mandatory_verification.items.accountVerification.e> provider) {
        this.f234575a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mandatory_verification.items.accountVerification.e eVar = this.f234575a.get();
        C33731l.f234572a.getClass();
        return new com.avito.android.mandatory_verification.items.accountVerification.c(eVar);
    }
}
