package com.avito.android.serp.adapter.reformulations;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReformulationsItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f270632a;

    public h(Provider<j> provider) {
        this.f270632a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f270632a.get());
    }
}
