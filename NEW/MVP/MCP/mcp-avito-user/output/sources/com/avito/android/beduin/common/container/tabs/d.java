package com.avito.android.beduin.common.container.tabs;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinTabContainerFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f103227a;

    public d(dagger.internal.f fVar) {
        this.f103227a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(dagger.internal.g.b(this.f103227a));
    }
}
