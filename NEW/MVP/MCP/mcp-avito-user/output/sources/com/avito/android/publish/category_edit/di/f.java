package com.avito.android.publish.category_edit.di;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: CategoryEditModule_ProvideItemPresentersSetFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.publish.checkable.d> f232353a;

    public f(Provider<com.avito.android.blueprints.publish.checkable.d> provider) {
        this.f232353a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.checkable.d dVar = this.f232353a.get();
        c.f232350a.getClass();
        return Collections.singleton(dVar);
    }
}
