package com.avito.android.imv_cars_details.domain;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvCarsDetailsPollInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f169965a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f169966b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f169967c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f169965a = uVar;
        this.f169966b = provider;
        this.f169967c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f169965a.get(), this.f169966b.get(), this.f169967c.get());
    }
}
