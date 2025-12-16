package com.avito.android.verification.verification_input_bill_amount.mvi;

import com.avito.android.verification.inn.o;
import com.avito.android.verification.verification_input_bill_amount.VerificationInputBillAmountArgs;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InputBillAmountActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f325564a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f325565b;

    /* renamed from: c, reason: collision with root package name */
    public final u f325566c;

    /* renamed from: d, reason: collision with root package name */
    public final o f325567d;

    public e(dagger.internal.l lVar, Provider provider, u uVar, o oVar) {
        this.f325564a = lVar;
        this.f325565b = provider;
        this.f325566c = uVar;
        this.f325567d = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        VerificationInputBillAmountArgs verificationInputBillAmountArgs = (VerificationInputBillAmountArgs) this.f325564a.f393949a;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f325565b.get();
        com.avito.android.verification.verification_input_bill_amount.c cVar = (com.avito.android.verification.verification_input_bill_amount.c) this.f325566c.get();
        this.f325567d.getClass();
        return new d(verificationInputBillAmountArgs, aVar, cVar, new com.avito.android.verification.inn.n());
    }
}
