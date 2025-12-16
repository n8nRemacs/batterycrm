package com.avito.android.multigeo_flow.full_list.list;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AddressItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f206913a;

    public b(u uVar) {
        this.f206913a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f206913a.get());
    }
}
