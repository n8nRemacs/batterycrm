package com.avito.android.mortgage.verification_flow.mvi;

import com.avito.android.mortgage.verification_flow.model.VerificationFlowArguments;
import com.avito.android.util.R0;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationFlowBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f203911a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<IZ.a> f203912b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.mortgage.util.e f203913c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f203914d;

    public e(dagger.internal.l lVar, Provider provider, com.avito.android.mortgage.util.e eVar, Provider provider2) {
        this.f203911a = lVar;
        this.f203912b = provider;
        this.f203913c = eVar;
        this.f203914d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        VerificationFlowArguments verificationFlowArguments = (VerificationFlowArguments) this.f203911a.f393949a;
        h31.e eVarA = dagger.internal.g.a(w.a(this.f203912b));
        this.f203913c.getClass();
        return new c(verificationFlowArguments, eVarA, new com.avito.android.mortgage.util.d(), this.f203914d.get());
    }
}
