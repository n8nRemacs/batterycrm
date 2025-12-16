package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideDisclaimerBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class Q implements dagger.internal.h<com.avito.android.blueprints.publish.infomation.item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.infomation.item.d> f233650a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f233651b;

    public Q(dagger.internal.u uVar, Provider provider) {
        this.f233650a = provider;
        this.f233651b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.infomation.item.d dVar = this.f233650a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f233651b.get();
        B.f233608a.getClass();
        return new com.avito.android.blueprints.publish.infomation.item.a(dVar, aVar);
    }
}
