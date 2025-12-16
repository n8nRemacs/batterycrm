package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvidePublishDateIntervalBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.h0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33726h0 implements dagger.internal.h<com.avito.android.blueprint.date.interval.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.date.interval.c> f234555a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f234556b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f234557c;

    public C33726h0(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f234555a = provider;
        this.f234556b = uVar;
        this.f234557c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprint.date.interval.c cVar = this.f234555a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f234556b.get();
        u3.l lVar = (u3.l) this.f234557c.get();
        B.f233608a.getClass();
        return new com.avito.android.blueprint.date.interval.a(cVar, aVar, lVar);
    }
}
