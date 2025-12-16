package com.avito.android.beduin.common.container.layered;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinLayeredContainerFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f103149a;

    public g(dagger.internal.f fVar) {
        this.f103149a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(dagger.internal.g.b(this.f103149a));
    }
}
