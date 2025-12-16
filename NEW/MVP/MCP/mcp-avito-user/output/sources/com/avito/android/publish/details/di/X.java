package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideItemInfoCarParamsItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class X implements dagger.internal.h<com.avito.android.publish.slots.item_info.item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.item_info.item.h> f233789a;

    public X(Provider<com.avito.android.publish.slots.item_info.item.h> provider) {
        this.f233789a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.item_info.item.h hVar = this.f233789a.get();
        B.f233608a.getClass();
        return new com.avito.android.publish.slots.item_info.item.a(hVar);
    }
}
