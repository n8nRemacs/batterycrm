package com.avito.android.loyalty.ui.criteria;

import bX.InterfaceC25576a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CriteriaInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC25576a> f183445a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f183446b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f183447c;

    /* renamed from: d, reason: collision with root package name */
    public final f f183448d;

    public d(Provider provider, dagger.internal.l lVar, Provider provider2, f fVar) {
        this.f183445a = provider;
        this.f183446b = lVar;
        this.f183447c = provider2;
        this.f183448d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f183445a.get(), (CriteriaArgs) this.f183446b.f393949a, this.f183447c.get(), (e) this.f183448d.get());
    }
}
