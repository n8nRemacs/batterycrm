package com.avito.android.publish.screen.step.select.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f242210a;

    public i(u uVar) {
        this.f242210a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.publish.screen.step.select.loader.a) this.f242210a.get());
    }
}
