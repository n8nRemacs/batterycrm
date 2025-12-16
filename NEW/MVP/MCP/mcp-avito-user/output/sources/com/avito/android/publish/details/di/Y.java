package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideItemInfoItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class Y implements dagger.internal.h<com.avito.android.publish.slots.item_info.item.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.item_info.item.h> f233790a;

    public Y(Provider<com.avito.android.publish.slots.item_info.item.h> provider) {
        this.f233790a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.item_info.item.h hVar = this.f233790a.get();
        B.f233608a.getClass();
        return new com.avito.android.publish.slots.item_info.item.e(hVar);
    }
}
