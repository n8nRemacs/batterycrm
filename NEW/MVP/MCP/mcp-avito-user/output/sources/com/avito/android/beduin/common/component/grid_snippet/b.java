package com.avito.android.beduin.common.component.grid_snippet;

import com.avito.android.C36135w2;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinConstructorAdvertConfig_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C36135w2> f101381a;

    public b(Provider<C36135w2> provider) {
        this.f101381a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f101381a.get());
    }
}
