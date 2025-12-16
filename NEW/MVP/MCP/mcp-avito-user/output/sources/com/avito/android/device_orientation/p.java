package com.avito.android.device_orientation;

import android.content.Context;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StoppableRotationInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final u f139247a;

    public p(u uVar) {
        this.f139247a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((Context) this.f139247a.get());
    }
}
