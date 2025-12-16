package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvidePublishMultiselectBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.i0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33728i0 implements dagger.internal.h<com.avito.android.blueprint.multiselect.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.multiselect.c> f234559a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f234560b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f234561c;

    public C33728i0(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f234559a = provider;
        this.f234560b = uVar;
        this.f234561c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprint.multiselect.c cVar = this.f234559a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f234560b.get();
        u3.l lVar = (u3.l) this.f234561c.get();
        B.f233608a.getClass();
        return new com.avito.android.blueprint.multiselect.a(cVar, aVar, lVar);
    }
}
