package com.avito.android.saved_searches.presentation.core;

import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SavedSearchResourceProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f258408a;

    public g(Provider<Context> provider) {
        this.f258408a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f258408a.get());
    }
}
