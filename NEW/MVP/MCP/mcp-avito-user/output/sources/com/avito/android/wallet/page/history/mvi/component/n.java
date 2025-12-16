package com.avito.android.wallet.page.history.mvi.component;

import aP0.InterfaceC19802a;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentHistoryInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19802a> f328047a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f328048b;

    public n(dagger.internal.l lVar, Provider provider) {
        this.f328047a = provider;
        this.f328048b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(dagger.internal.g.a(w.a(this.f328047a)), (String) this.f328048b.f393949a);
    }
}
