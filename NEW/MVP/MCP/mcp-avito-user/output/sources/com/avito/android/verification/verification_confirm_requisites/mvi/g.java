package com.avito.android.verification.verification_confirm_requisites.mvi;

import com.avito.android.verification.verification_confirm_requisites.VerificationConfirmRequisitesArgs;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfirmRequisitesActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f324995a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f324996b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.verification.verification_confirm_requisites.c f324997c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.verification.inn.o f324998d;

    public g(dagger.internal.l lVar, Provider provider, com.avito.android.verification.verification_confirm_requisites.c cVar, com.avito.android.verification.inn.o oVar) {
        this.f324995a = lVar;
        this.f324996b = provider;
        this.f324997c = cVar;
        this.f324998d = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        VerificationConfirmRequisitesArgs verificationConfirmRequisitesArgs = (VerificationConfirmRequisitesArgs) this.f324995a.f393949a;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f324996b.get();
        com.avito.android.verification.verification_confirm_requisites.b bVar = (com.avito.android.verification.verification_confirm_requisites.b) this.f324997c.get();
        this.f324998d.getClass();
        return new a(verificationConfirmRequisitesArgs, aVar, bVar, new com.avito.android.verification.inn.n());
    }
}
