package com.avito.android.select.new_metro;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectMetroInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.geo_common.interactor.g> f266316a;

    public p(Provider<com.avito.android.geo_common.interactor.g> provider) {
        this.f266316a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f266316a.get());
    }
}
