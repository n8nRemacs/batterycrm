package com.avito.android.map_core.view;

import android.app.Activity;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MarkerIconFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final l f185747a;

    public i(l lVar) {
        this.f185747a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((Activity) this.f185747a.f393949a);
    }
}
