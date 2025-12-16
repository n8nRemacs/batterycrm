package com.avito.android.advert_stats;

import android.app.Application;

/* compiled from: AdvertStatsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class o implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f86830a;

    public o(dagger.internal.l lVar) {
        this.f86830a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((Application) this.f86830a.f393949a);
    }
}
