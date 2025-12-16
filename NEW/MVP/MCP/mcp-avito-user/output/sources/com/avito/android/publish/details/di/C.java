package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideAccordionSlotBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class C implements dagger.internal.h<com.avito.android.publish.slots.accordion.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.accordion.d> f233611a;

    public C(Provider<com.avito.android.publish.slots.accordion.d> provider) {
        this.f233611a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.accordion.d dVar = this.f233611a.get();
        B.f233608a.getClass();
        return new com.avito.android.publish.slots.accordion.a(dVar);
    }
}
