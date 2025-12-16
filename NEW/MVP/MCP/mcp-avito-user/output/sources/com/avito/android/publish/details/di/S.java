package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideEditCategoryItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class S implements dagger.internal.h<com.avito.android.publish.details.adapter.edit_category.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.adapter.edit_category.b> f233652a;

    public S(Provider<com.avito.android.publish.details.adapter.edit_category.b> provider) {
        this.f233652a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.details.adapter.edit_category.b bVar = this.f233652a.get();
        B.f233608a.getClass();
        return new com.avito.android.publish.details.adapter.edit_category.a(bVar);
    }
}
