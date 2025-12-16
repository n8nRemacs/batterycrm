package com.avito.android.update.mvi_screen.mvi;

import com.avito.android.update.mvi_screen.mvi.entity.UpdateApplicationState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UpdateApplicationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f306698a;

    public g(d dVar) {
        this.f306698a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f306698a.getClass();
        c cVar = new c();
        UpdateApplicationState.f306696b.getClass();
        return new f("UpdateApplication", UpdateApplicationState.f306697c, new e(cVar));
    }
}
