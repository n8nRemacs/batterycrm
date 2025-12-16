package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvidePublishSalaryRangeBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class k0 implements dagger.internal.h<com.avito.android.publish.slots.salary_range.item.publish.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.salary_range.item.publish.d> f234569a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f234570b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f234571c;

    public k0(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f234569a = provider;
        this.f234570b = uVar;
        this.f234571c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.salary_range.item.publish.d dVar = this.f234569a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f234570b.get();
        u3.l lVar = (u3.l) this.f234571c.get();
        B.f233608a.getClass();
        return new com.avito.android.publish.slots.salary_range.item.publish.a(dVar, aVar, lVar);
    }
}
