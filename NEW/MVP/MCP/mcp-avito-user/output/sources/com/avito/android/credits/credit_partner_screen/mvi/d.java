package com.avito.android.credits.credit_partner_screen.mvi;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CreditPartnerBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f128828a;

    /* renamed from: b, reason: collision with root package name */
    public final l f128829b;

    public d(l lVar, l lVar2) {
        this.f128828a = lVar;
        this.f128829b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f128828a.f393949a, ((Boolean) this.f128829b.f393949a).booleanValue());
    }
}
