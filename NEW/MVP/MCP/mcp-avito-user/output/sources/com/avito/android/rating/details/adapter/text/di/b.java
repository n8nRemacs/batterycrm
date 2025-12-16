package com.avito.android.rating.details.adapter.text.di;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TextItemModule_ProvideBlueprint$_avito_rating_implFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f246570a;

    public b(u uVar) {
        this.f246570a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.rating.details.adapter.text.b bVar = (com.avito.android.rating.details.adapter.text.b) this.f246570a.get();
        int i12 = a.f246569a;
        return new com.avito.android.rating.details.adapter.text.a(bVar);
    }
}
