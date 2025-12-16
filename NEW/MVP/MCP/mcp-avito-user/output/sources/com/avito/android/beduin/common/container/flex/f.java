package com.avito.android.beduin.common.container.flex;

import com.avito.android.AbstractC35201t;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinFlexContainerFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f103055a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AbstractC35201t> f103056b;

    public f(dagger.internal.f fVar, Provider provider) {
        this.f103055a = fVar;
        this.f103056b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(dagger.internal.g.b(this.f103055a), this.f103056b.get());
    }
}
