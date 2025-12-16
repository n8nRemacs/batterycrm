package com.avito.android.credits;

import android.content.res.Resources;

/* compiled from: CreditInfoResourcesProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f129079a;

    public z(dagger.internal.l lVar) {
        this.f129079a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new y((Resources) this.f129079a.f393949a);
    }
}
