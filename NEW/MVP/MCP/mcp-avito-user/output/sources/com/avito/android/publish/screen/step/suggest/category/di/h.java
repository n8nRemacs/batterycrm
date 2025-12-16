package com.avito.android.publish.screen.step.suggest.category.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestCategoryModule_ProvideCheckableItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.android.blueprints.publish.checkable.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f242333a;

    public h(u uVar) {
        this.f242333a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.checkable.d dVar = (com.avito.android.blueprints.publish.checkable.d) this.f242333a.get();
        d.f242328a.getClass();
        return new com.avito.android.blueprints.publish.checkable.b(dVar);
    }
}
