package com.avito.android.publish.details.adapter.objects;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiStateObjectsModule_ProvideObjectsPreviewBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<com.avito.android.publish.details.adapter.objects.re23.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.adapter.objects.re23.c> f233350a;

    /* renamed from: b, reason: collision with root package name */
    public final u f233351b;

    /* renamed from: c, reason: collision with root package name */
    public final u f233352c;

    public n(u uVar, u uVar2, Provider provider) {
        this.f233350a = provider;
        this.f233351b = uVar;
        this.f233352c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.details.adapter.objects.re23.c cVar = this.f233350a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f233351b.get();
        u3.l lVar = (u3.l) this.f233352c.get();
        k.f233343a.getClass();
        return new com.avito.android.publish.details.adapter.objects.re23.a(cVar, aVar, lVar);
    }
}
