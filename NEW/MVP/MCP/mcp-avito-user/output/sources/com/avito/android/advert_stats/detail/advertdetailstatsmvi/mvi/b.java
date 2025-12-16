package com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi;

import com.avito.android.advert_stats.p;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailStatsMVIActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f86091a;

    /* renamed from: b, reason: collision with root package name */
    public final u f86092b;

    public b(l lVar, u uVar) {
        this.f86091a = lVar;
        this.f86092b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f86091a.f393949a, (p) this.f86092b.get());
    }
}
