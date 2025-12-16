package com.avito.android.wallet.page.history.mvi.component;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentHistoryItemsConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.wallet.page.feature.a> f328051a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f328052b;

    public p(dagger.internal.l lVar, Provider provider) {
        this.f328051a = provider;
        this.f328052b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f328051a.get(), (String) this.f328052b.f393949a);
    }
}
