package com.avito.android.rating_ui.button;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingButtonItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l41.g<a>> f249996a;

    public g(Provider<l41.g<a>> provider) {
        this.f249996a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f249996a.get());
    }
}
