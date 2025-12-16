package com.avito.android.mandatory_verification.presentation.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MandatoryVerificationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mandatory_verification.domain.p f184753a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mandatory_verification.domain.d f184754b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.mandatory_verification.domain.h f184755c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.mandatory_verification.domain.l f184756d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f184757e;

    public b(com.avito.android.mandatory_verification.domain.p pVar, com.avito.android.mandatory_verification.domain.d dVar, com.avito.android.mandatory_verification.domain.h hVar, com.avito.android.mandatory_verification.domain.l lVar, dagger.internal.l lVar2) {
        this.f184753a = pVar;
        this.f184754b = dVar;
        this.f184755c = hVar;
        this.f184756d = lVar;
        this.f184757e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.mandatory_verification.domain.o) this.f184753a.get(), (com.avito.android.mandatory_verification.domain.c) this.f184754b.get(), (com.avito.android.mandatory_verification.domain.g) this.f184755c.get(), (com.avito.android.mandatory_verification.domain.k) this.f184756d.get(), ((Long) this.f184757e.f393949a).longValue());
    }
}
