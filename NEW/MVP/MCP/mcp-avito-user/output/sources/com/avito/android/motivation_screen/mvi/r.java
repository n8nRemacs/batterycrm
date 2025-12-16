package com.avito.android.motivation_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MotivationViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final j f206369a;

    public r(j jVar) {
        this.f206369a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((i) this.f206369a.get(), null, 2, null);
    }
}
