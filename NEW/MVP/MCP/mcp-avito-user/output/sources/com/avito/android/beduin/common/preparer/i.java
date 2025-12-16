package com.avito.android.beduin.common.preparer;

import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GridLayoutModelPreparer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f103457a;

    public i(Provider<Context> provider) {
        this.f103457a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f103457a.get());
    }
}
