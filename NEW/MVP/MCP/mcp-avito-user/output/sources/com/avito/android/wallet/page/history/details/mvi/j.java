package com.avito.android.wallet.page.history.details.mvi;

import aP0.InterfaceC19802a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentHistoryDetailsInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19802a> f327963a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<NO0.a> f327964b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f327965c;

    public j(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f327963a = provider;
        this.f327964b = provider2;
        this.f327965c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(dagger.internal.g.b(this.f327963a), dagger.internal.g.b(this.f327964b), (PaymentHistoryDetailsOpenParams) this.f327965c.f393949a);
    }
}
