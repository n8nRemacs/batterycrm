package com.avito.android.wallet.page.topup.form.mvi.component;

import aP0.InterfaceC19802a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TopUpFormInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19802a> f328411a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f328412b;

    public l(dagger.internal.l lVar, Provider provider) {
        this.f328411a = provider;
        this.f328412b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(dagger.internal.g.b(this.f328411a), (String) this.f328412b.f393949a);
    }
}
