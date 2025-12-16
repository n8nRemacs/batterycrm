package com.avito.android.imv_goods_advert.mvi;

import com.avito.android.imv_goods_advert.ImvGoodsAdvertParams;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvGoodsAdvertActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Gson> f170545a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f170546b;

    public d(dagger.internal.l lVar, Provider provider) {
        this.f170545a = provider;
        this.f170546b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f170545a.get(), (ImvGoodsAdvertParams) this.f170546b.f393949a);
    }
}
