package com.avito.android.rubricator.list.service.item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f255993a;

    public c(u uVar) {
        this.f255993a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f255993a.get());
    }
}
