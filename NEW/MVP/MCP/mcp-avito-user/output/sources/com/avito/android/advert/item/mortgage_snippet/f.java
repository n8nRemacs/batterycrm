package com.avito.android.advert.item.mortgage_snippet;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageSnippetPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f77702a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage_calculator.data.b> f77703b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage_calculator.data.h> f77704c;

    public f(l lVar, Provider provider, Provider provider2) {
        this.f77702a = lVar;
        this.f77703b = provider;
        this.f77704c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((String) this.f77702a.f393949a, this.f77703b.get(), this.f77704c.get());
    }
}
