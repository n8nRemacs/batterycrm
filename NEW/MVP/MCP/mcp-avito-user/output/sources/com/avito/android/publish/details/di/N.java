package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideDateIntervalItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class N implements dagger.internal.h<com.avito.android.blueprints.publish.date_interval.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.date_interval.c> f233646a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f233647b;

    public N(dagger.internal.u uVar, Provider provider) {
        this.f233646a = provider;
        this.f233647b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.date_interval.c cVar = this.f233646a.get();
        u3.l lVar = (u3.l) this.f233647b.get();
        B.f233608a.getClass();
        return new com.avito.android.blueprints.publish.date_interval.a(cVar, lVar);
    }
}
