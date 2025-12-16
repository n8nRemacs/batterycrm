package com.avito.android.tariff_lf_constructor.configure.header_item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfigureHeaderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f299620a;

    public c(u uVar) {
        this.f299620a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f299620a.get());
    }
}
