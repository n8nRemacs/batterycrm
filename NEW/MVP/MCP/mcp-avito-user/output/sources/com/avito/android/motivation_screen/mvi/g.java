package com.avito.android.motivation_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MotivationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final p f206355a;

    public g(p pVar) {
        this.f206355a = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((o) this.f206355a.get());
    }
}
