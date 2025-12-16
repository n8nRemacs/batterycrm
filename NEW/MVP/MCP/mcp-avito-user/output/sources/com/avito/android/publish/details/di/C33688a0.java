package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideJobPremoderationItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.a0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33688a0 implements dagger.internal.h<com.avito.android.publish.slots.job_premoderation.item.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.job_premoderation.item.e> f233903a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f233904b;

    public C33688a0(dagger.internal.u uVar, Provider provider) {
        this.f233903a = provider;
        this.f233904b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.job_premoderation.item.e eVar = this.f233903a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f233904b.get();
        B.f233608a.getClass();
        return new com.avito.android.publish.slots.job_premoderation.item.c(eVar, aVar);
    }
}
