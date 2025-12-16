package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideMultiselectItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.f0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33722f0 implements dagger.internal.h<com.avito.android.blueprints.publish.multiselect.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.multiselect.c> f234545a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f234546b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f234547c;

    public C33722f0(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f234545a = provider;
        this.f234546b = uVar;
        this.f234547c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.multiselect.c cVar = this.f234545a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f234546b.get();
        u3.l lVar = (u3.l) this.f234547c.get();
        B.f233608a.getClass();
        return new com.avito.android.blueprints.publish.multiselect.a(cVar, aVar, lVar);
    }
}
