package com.avito.android.favorites.adapter.group_card;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GroupCardItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f156583a;

    public j(u uVar) {
        this.f156583a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((d) this.f156583a.get());
    }
}
