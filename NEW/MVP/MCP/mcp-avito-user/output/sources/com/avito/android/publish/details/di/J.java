package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideChipsSelectComposeItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class J implements dagger.internal.h<com.avito.android.compose_items.chips_select.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.compose_items.chips_select.c> f233639a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f233640b;

    public J(dagger.internal.u uVar, Provider provider) {
        this.f233639a = provider;
        this.f233640b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.compose_items.chips_select.c cVar = this.f233639a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f233640b.get();
        B.f233608a.getClass();
        return new com.avito.android.compose_items.chips_select.a(cVar, aVar);
    }
}
