package com.avito.android.tariff.cpx.info.items.level_header;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxInfoLevelHeaderItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f296550a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f296551b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f296552c;

    public k(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f296550a = lVar;
        this.f296551b = lVar2;
        this.f296552c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Y41.l) this.f296550a.f393949a, (Y41.l) this.f296551b.f393949a, this.f296552c.get());
    }
}
