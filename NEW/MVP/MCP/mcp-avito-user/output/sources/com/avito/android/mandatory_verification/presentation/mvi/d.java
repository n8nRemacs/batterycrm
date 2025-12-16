package com.avito.android.mandatory_verification.presentation.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MandatoryVerificationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final cv.e f184775a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mandatory_verification.domain.h f184776b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f184777c;

    public d(cv.e eVar, com.avito.android.mandatory_verification.domain.h hVar, dagger.internal.l lVar) {
        this.f184775a = eVar;
        this.f184776b = hVar;
        this.f184777c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.deeplink_handler.handler.composite.a) this.f184775a.get(), (com.avito.android.mandatory_verification.domain.g) this.f184776b.get(), ((Long) this.f184777c.f393949a).longValue());
    }
}
