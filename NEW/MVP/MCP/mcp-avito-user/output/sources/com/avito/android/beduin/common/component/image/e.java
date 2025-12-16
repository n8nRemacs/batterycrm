package com.avito.android.beduin.common.component.image;

import com.avito.android.AbstractC35201t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinImageComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AbstractC35201t> f101459a;

    public e(Provider<AbstractC35201t> provider) {
        this.f101459a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f101459a.get());
    }
}
