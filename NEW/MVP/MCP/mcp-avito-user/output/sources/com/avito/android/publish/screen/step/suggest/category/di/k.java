package com.avito.android.publish.screen.step.suggest.category.di;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: SuggestCategoryModule_ProvideItemPresentersSetFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.wizard.d> f242338a;

    public k(Provider<com.avito.android.blueprints.publish.wizard.d> provider) {
        this.f242338a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.wizard.d dVar = this.f242338a.get();
        d.f242328a.getClass();
        return Collections.singleton(dVar);
    }
}
