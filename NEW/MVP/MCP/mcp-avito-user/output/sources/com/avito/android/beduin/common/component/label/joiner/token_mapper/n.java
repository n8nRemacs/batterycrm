package com.avito.android.beduin.common.component.label.joiner.token_mapper;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StorageTextTokenMapper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.storage.d> f101688a;

    public n(Provider<com.avito.android.beduin.common.storage.d> provider) {
        this.f101688a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f101688a.get());
    }
}
