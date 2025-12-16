package com.avito.android.publish.details.di;

/* compiled from: PublishDetailsListModule_ProvideWarningBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class m0 implements dagger.internal.h<com.avito.android.publish.slots.salary_range.warning.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f234576a;

    public m0(dagger.internal.u uVar) {
        this.f234576a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.salary_range.warning.c cVar = (com.avito.android.publish.slots.salary_range.warning.c) this.f234576a.get();
        B.f233608a.getClass();
        return new com.avito.android.publish.slots.salary_range.warning.a(cVar);
    }
}
