package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsPhotoModule_ProvidePhotoItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class A0 implements dagger.internal.h<com.avito.android.photo_list_view.blueprints.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_list_view.blueprints.c> f233606a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f233607b;

    public A0(dagger.internal.u uVar, Provider provider) {
        this.f233606a = provider;
        this.f233607b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.photo_list_view.blueprints.c cVar = this.f233606a.get();
        u3.l lVar = (u3.l) this.f233607b.get();
        y0.f234605a.getClass();
        return new com.avito.android.photo_list_view.blueprints.a(cVar, lVar);
    }
}
