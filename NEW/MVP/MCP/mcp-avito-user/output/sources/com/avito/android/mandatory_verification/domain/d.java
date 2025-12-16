package com.avito.android.mandatory_verification.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeleteFileUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mandatory_verification.domain.file_uploader.k f184495a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f184496b;

    public d(com.avito.android.mandatory_verification.domain.file_uploader.k kVar, Provider provider) {
        this.f184495a = kVar;
        this.f184496b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.mandatory_verification.domain.file_uploader.c) this.f184495a.get(), this.f184496b.get());
    }
}
