package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideChipsMultiselectComposeItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class H implements dagger.internal.h<com.avito.android.compose_items.chips_multiselect.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.compose_items.chips_multiselect.c> f233631a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f233632b;

    public H(dagger.internal.u uVar, Provider provider) {
        this.f233631a = provider;
        this.f233632b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.compose_items.chips_multiselect.c cVar = this.f233631a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f233632b.get();
        B.f233608a.getClass();
        return new com.avito.android.compose_items.chips_multiselect.a(cVar, aVar);
    }
}
