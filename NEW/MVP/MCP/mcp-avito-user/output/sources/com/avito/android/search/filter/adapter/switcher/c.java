package com.avito.android.search.filter.adapter.switcher;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SwitcherItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f262608a;

    public c(u uVar) {
        this.f262608a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f262608a.get());
    }
}
