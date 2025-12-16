package com.avito.android.favorites.ux_feedback;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoritesFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SK0.b> f157557a;

    public g(Provider<SK0.b> provider) {
        this.f157557a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f157557a.get());
    }
}
