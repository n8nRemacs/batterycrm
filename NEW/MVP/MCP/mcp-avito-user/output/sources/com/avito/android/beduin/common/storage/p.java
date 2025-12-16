package com.avito.android.beduin.common.storage;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinV1StorageAdapterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f103503a;

    public p(Provider<c> provider) {
        this.f103503a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f103503a.get());
    }
}
