package com.avito.android.blueprint.date.single;

import com.avito.android.util.D0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishDatePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f105504a;

    public h(Provider<D0> provider) {
        this.f105504a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f105504a.get());
    }
}
