package com.avito.android.mortgage.pre_approval.form.mvi.domain;

import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InitializationUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f201882a;

    /* renamed from: b, reason: collision with root package name */
    public final l f201883b;

    public b(l lVar, Provider provider) {
        this.f201882a = provider;
        this.f201883b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(dagger.internal.g.b(this.f201882a), (PreApprovalArguments) this.f201883b.f393949a);
    }
}
