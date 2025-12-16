package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: DateItemModule_ProvideDateItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.di.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33725h implements dagger.internal.h<com.avito.android.blueprints.publish.date.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.date.c> f234552a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f234553b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f234554c;

    public C33725h(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f234552a = provider;
        this.f234553b = uVar;
        this.f234554c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.date.c cVar = this.f234552a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f234553b.get();
        u3.l lVar = (u3.l) this.f234554c.get();
        C33723g.f234548a.getClass();
        return new com.avito.android.blueprints.publish.date.a(cVar, aVar, lVar);
    }
}
