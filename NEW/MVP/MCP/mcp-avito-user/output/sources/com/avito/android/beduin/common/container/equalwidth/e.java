package com.avito.android.beduin.common.container.equalwidth;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinEqualWidthContainerFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f103031a;

    public e(dagger.internal.f fVar) {
        this.f103031a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(dagger.internal.g.b(this.f103031a));
    }
}
