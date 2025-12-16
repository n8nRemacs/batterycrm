package com.avito.android.device_orientation;

import android.view.Display;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RotationProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f139240a;

    public h(dagger.internal.l lVar) {
        this.f139240a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Display) this.f139240a.f393949a);
    }
}
