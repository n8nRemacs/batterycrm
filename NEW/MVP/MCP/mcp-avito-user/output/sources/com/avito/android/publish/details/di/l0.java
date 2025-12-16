package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideSalaryRangeBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class l0 implements dagger.internal.h<com.avito.android.publish.slots.salary_range.item.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.salary_range.item.g> f234573a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f234574b;

    public l0(dagger.internal.u uVar, Provider provider) {
        this.f234573a = provider;
        this.f234574b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.salary_range.item.g gVar = this.f234573a.get();
        u3.l lVar = (u3.l) this.f234574b.get();
        B.f233608a.getClass();
        return new com.avito.android.publish.slots.salary_range.item.b(gVar, lVar);
    }
}
