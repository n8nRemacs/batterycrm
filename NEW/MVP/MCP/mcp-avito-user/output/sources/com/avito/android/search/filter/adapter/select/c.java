package com.avito.android.search.filter.adapter.select;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f262576a;

    public c(u uVar) {
        this.f262576a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f262576a.get());
    }
}
