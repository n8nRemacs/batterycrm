package com.avito.android.service_fee_conditions.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ou0.InterfaceC44941a;

/* compiled from: GetServiceFeeConditionsUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f278435a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC44941a> f278436b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f278437c;

    public b(l lVar, Provider provider, Provider provider2) {
        this.f278435a = lVar;
        this.f278436b = provider;
        this.f278437c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f278435a.f393949a, this.f278436b.get(), this.f278437c.get());
    }
}
