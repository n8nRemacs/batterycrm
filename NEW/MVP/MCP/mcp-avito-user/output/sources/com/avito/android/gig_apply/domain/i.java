package com.avito.android.gig_apply.domain;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigSlotInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<HG.a> f159685a;

    public i(Provider<HG.a> provider) {
        this.f159685a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f159685a.get());
    }
}
