package com.avito.android.search.filter.adapter.multiselect;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MultiselectItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f262539a;

    public c(u uVar) {
        this.f262539a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f262539a.get());
    }
}
