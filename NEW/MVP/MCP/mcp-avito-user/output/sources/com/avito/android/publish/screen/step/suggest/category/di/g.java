package com.avito.android.publish.screen.step.suggest.category.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestCategoryModule_ProvideCategoryItemBluePrint$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<com.avito.android.blueprints.publish.wizard.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f242332a;

    public g(u uVar) {
        this.f242332a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.wizard.d dVar = (com.avito.android.blueprints.publish.wizard.d) this.f242332a.get();
        d.f242328a.getClass();
        return new com.avito.android.blueprints.publish.wizard.b(dVar);
    }
}
