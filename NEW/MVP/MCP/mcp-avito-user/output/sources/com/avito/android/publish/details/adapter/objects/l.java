package com.avito.android.publish.details.adapter.objects;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiStateObjectsModule_ProvideObjectsItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<b> f233344a;

    /* renamed from: b, reason: collision with root package name */
    public final u f233345b;

    /* renamed from: c, reason: collision with root package name */
    public final u f233346c;

    public l(u uVar, u uVar2, Provider provider) {
        this.f233344a = provider;
        this.f233345b = uVar;
        this.f233346c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = this.f233344a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f233345b.get();
        u3.l lVar = (u3.l) this.f233346c.get();
        k.f233343a.getClass();
        return new a(bVar, aVar, lVar);
    }
}
