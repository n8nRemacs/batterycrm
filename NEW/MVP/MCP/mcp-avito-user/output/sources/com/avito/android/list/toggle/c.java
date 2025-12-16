package com.avito.android.list.toggle;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestToggleBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f181661a;

    public c(u uVar) {
        this.f181661a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f181661a.get());
    }
}
