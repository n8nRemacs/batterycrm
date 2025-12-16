package com.avito.android.publish.screen.step.select.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectModule_ProvideTitleItemViewBlueprint$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<com.avito.android.select.title.f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f242163a;

    /* renamed from: b, reason: collision with root package name */
    public final u f242164b;

    public l(d dVar, u uVar) {
        this.f242163a = dVar;
        this.f242164b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.select.title.b bVar = (com.avito.android.select.title.b) this.f242164b.get();
        this.f242163a.getClass();
        return new com.avito.android.select.title.g(bVar);
    }
}
