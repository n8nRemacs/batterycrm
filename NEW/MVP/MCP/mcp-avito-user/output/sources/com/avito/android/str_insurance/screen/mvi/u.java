package com.avito.android.str_insurance.screen.mvi;

import Xy0.AbstractC17061a;

/* compiled from: StrInsuranceOneTimeEventProducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f288786a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f288787b;

    public u(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f288786a = uVar;
        this.f288787b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new t((x) this.f288786a.get(), (AbstractC17061a) this.f288787b.f393949a);
    }
}
