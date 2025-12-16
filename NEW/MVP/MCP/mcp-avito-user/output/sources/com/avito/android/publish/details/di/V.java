package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideIntRangeItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class V implements dagger.internal.h<com.avito.android.publish.items.int_range.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.items.int_range.f> f233655a;

    public V(Provider<com.avito.android.publish.items.int_range.f> provider) {
        this.f233655a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.items.int_range.f fVar = this.f233655a.get();
        B.f233608a.getClass();
        return new com.avito.android.publish.items.int_range.c(fVar);
    }
}
