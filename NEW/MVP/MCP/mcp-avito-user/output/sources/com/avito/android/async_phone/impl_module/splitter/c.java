package com.avito.android.async_phone.impl_module.splitter;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AsyncPhoneFeaturesImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f92201a;

    public c(g gVar) {
        this.f92201a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f92201a.get());
    }
}
