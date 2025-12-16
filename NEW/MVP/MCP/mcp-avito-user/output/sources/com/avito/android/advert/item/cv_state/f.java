package com.avito.android.advert.item.cv_state;

import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCvStatePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f75069a;

    public f(Provider<Context> provider) {
        this.f75069a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f75069a.get());
    }
}
