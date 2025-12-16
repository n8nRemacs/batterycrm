package com.avito.android.rating_ui.statistic;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingStatisticItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f250477a;

    public d(u uVar) {
        this.f250477a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((e) this.f250477a.get());
    }
}
