package com.avito.android.mortgage.pre_approval.result.mvi;

import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PreApprovalResultBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f202118a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.pre_approval.result.mvi.domain.d> f202119b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.pre_approval.result.mvi.domain.f> f202120c;

    public e(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f202118a = lVar;
        this.f202119b = provider;
        this.f202120c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((PreApprovalArguments) this.f202118a.f393949a, this.f202119b.get(), this.f202120c.get());
    }
}
