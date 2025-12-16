package com.avito.android.publish.screen.step.request.steps.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StepsRequestBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f242060a;

    public e(u uVar) {
        this.f242060a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.publish.screen.step.request.steps.loader.a) this.f242060a.get());
    }
}
