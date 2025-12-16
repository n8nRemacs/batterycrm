package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideMultiselectComposeItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.d0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33694d0 implements dagger.internal.h<com.avito.android.compose_items.multiselect.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.compose_items.multiselect.c> f233914a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f233915b;

    public C33694d0(dagger.internal.u uVar, Provider provider) {
        this.f233914a = provider;
        this.f233915b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.compose_items.multiselect.c cVar = this.f233914a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f233915b.get();
        B.f233608a.getClass();
        return new com.avito.android.compose_items.multiselect.a(cVar, aVar);
    }
}
