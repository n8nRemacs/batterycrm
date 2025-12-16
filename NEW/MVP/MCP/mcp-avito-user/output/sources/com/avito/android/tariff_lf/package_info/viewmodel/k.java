package com.avito.android.tariff_lf.package_info.viewmodel;

import android.content.res.Resources;
import dagger.internal.y;

/* compiled from: TariffPackageInfoResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f299287a;

    public k(dagger.internal.l lVar) {
        this.f299287a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Resources) this.f299287a.f393949a);
    }
}
