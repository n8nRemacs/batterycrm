package com.avito.android.publish.items.iac_devices;

import android.content.res.Resources;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacDevicesItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f236877a;

    /* renamed from: b, reason: collision with root package name */
    public final u f236878b;

    public h(l lVar, u uVar) {
        this.f236877a = lVar;
        this.f236878b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Resources) this.f236877a.f393949a, (OL.a) this.f236878b.get());
    }
}
