package com.avito.android.verification.verification_input_bill_amount.mvi;

import com.avito.android.verification.verification_input_bill_amount.VerificationInputBillAmountArgs;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InputBillAmountBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f325576a;

    /* renamed from: b, reason: collision with root package name */
    public final u f325577b;

    public g(dagger.internal.l lVar, u uVar) {
        this.f325576a = lVar;
        this.f325577b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((VerificationInputBillAmountArgs) this.f325576a.f393949a, (com.avito.android.verification.verification_input_bill_amount.c) this.f325577b.get());
    }
}
