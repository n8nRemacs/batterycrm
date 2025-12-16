package com.avito.android.advert.item.recall_me;

import javax.inject.Provider;

/* compiled from: RecallMeBlockBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<n> f78479a;

    public i(Provider<n> provider) {
        this.f78479a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f78479a.get());
    }
}
