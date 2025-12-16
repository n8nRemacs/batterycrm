package com.avito.android.universal_map.map.common.marker;

import android.content.Context;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClusterMarkerManagerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f304970a;

    /* renamed from: b, reason: collision with root package name */
    public final u f304971b;

    public c(dagger.internal.l lVar, u uVar) {
        this.f304970a = lVar;
        this.f304971b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f304970a.f393949a, (d) this.f304971b.get());
    }
}
