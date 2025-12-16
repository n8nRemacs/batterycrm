package com.avito.android.analytics.provider;

import com.avito.android.account.G;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CurrentUserIdProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<G> f90269a;

    public d(Provider<G> provider) {
        this.f90269a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f90269a.get());
    }
}
