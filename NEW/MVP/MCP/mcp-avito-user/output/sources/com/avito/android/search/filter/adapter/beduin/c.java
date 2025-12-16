package com.avito.android.search.filter.adapter.beduin;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f261980a;

    public c(u uVar) {
        this.f261980a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f261980a.get());
    }
}
