package com.avito.android.advertising.adapter.items.buzzoola.avl;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BuzzoolaAvlMediaBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<h> f87267a;

    public b(Provider<h> provider) {
        this.f87267a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f87267a.get());
    }
}
