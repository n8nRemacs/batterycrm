package com.avito.android.publish.select.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectModule_ProvideTitleItemViewBlueprint$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<com.avito.android.select.title.f> {

    /* renamed from: a, reason: collision with root package name */
    public final c f242692a;

    /* renamed from: b, reason: collision with root package name */
    public final u f242693b;

    public k(c cVar, u uVar) {
        this.f242692a = cVar;
        this.f242693b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.select.title.b bVar = (com.avito.android.select.title.b) this.f242693b.get();
        this.f242692a.getClass();
        return new com.avito.android.select.title.g(bVar);
    }
}
