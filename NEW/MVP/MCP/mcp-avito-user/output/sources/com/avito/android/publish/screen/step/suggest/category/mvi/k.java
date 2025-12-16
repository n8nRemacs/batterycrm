package com.avito.android.publish.screen.step.suggest.category.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestCategoryBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f242378a;

    public k(u uVar) {
        this.f242378a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.publish.screen.step.suggest.category.data.a) this.f242378a.get());
    }
}
