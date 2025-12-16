package com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi;

import com.avito.android.advert_stats.p;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailStatsMVIBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f86095a;

    /* renamed from: b, reason: collision with root package name */
    public final u f86096b;

    public d(l lVar, u uVar) {
        this.f86095a = lVar;
        this.f86096b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f86095a.f393949a, (p) this.f86096b.get());
    }
}
