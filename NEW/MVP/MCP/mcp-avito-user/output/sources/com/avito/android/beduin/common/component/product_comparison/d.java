package com.avito.android.beduin.common.component.product_comparison;

import com.avito.android.AbstractC35201t;
import com.avito.android.beduin.common.utils.m;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinProductComparisonComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Th.a> f102136a;

    /* renamed from: b, reason: collision with root package name */
    public final u f102137b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<AbstractC35201t> f102138c;

    public d(u uVar, Provider provider, Provider provider2) {
        this.f102136a = provider;
        this.f102137b = uVar;
        this.f102138c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f102136a.get(), (m) this.f102137b.get(), this.f102138c.get());
    }
}
