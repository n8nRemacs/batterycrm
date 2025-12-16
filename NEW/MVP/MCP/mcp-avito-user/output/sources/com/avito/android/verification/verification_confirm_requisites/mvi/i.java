package com.avito.android.verification.verification_confirm_requisites.mvi;

import com.avito.android.verification.verification_confirm_requisites.VerificationConfirmRequisitesArgs;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfirmRequisitesBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f325001a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.verification.verification_confirm_requisites.c f325002b;

    public i(dagger.internal.l lVar, com.avito.android.verification.verification_confirm_requisites.c cVar) {
        this.f325001a = lVar;
        this.f325002b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((VerificationConfirmRequisitesArgs) this.f325001a.f393949a, (com.avito.android.verification.verification_confirm_requisites.b) this.f325002b.get());
    }
}
