package com.avito.android.favorites.link;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetSimilarPushLinkUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WC.a> f157412a;

    public i(Provider<WC.a> provider) {
        this.f157412a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f157412a.get());
    }
}
