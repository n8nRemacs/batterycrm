package com.avito.android.model_card.screen.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ModelCardActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.model_card.screen.domain.c f198068a;

    public b(com.avito.android.model_card.screen.domain.c cVar) {
        this.f198068a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.model_card.screen.domain.a) this.f198068a.get());
    }
}
