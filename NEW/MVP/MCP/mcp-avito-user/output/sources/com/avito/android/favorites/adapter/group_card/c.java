package com.avito.android.favorites.adapter.group_card;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GroupCardItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f156577a;

    public c(u uVar) {
        this.f156577a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((g) this.f156577a.get());
    }
}
