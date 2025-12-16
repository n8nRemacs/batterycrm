package com.avito.android.mortgage.landing.list.decoration;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FullscreenItemsDecoration_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f199643a;

    public b(u uVar) {
        this.f199643a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.konveyor.a) this.f199643a.get());
    }
}
