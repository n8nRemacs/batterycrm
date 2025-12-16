package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideCheckBoxItemWithTextBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class G implements dagger.internal.h<com.avito.android.blueprints.checkbox_with_text.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.checkbox_with_text.c> f233630a;

    public G(Provider<com.avito.android.blueprints.checkbox_with_text.c> provider) {
        this.f233630a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.checkbox_with_text.c cVar = this.f233630a.get();
        B.f233608a.getClass();
        return new com.avito.android.blueprints.checkbox_with_text.a(cVar);
    }
}
