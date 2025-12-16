package com.avito.android.motivation_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MotivationReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final b f206366a;

    public n(b bVar) {
        this.f206366a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f206366a.getClass();
        return new m(new a());
    }
}
