package com.avito.android.imv_goods_advert.mvi;

import com.avito.android.imv_goods_advert.ImvGoodsAdvertParams;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvGoodsAdvertBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Gson> f170558a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f170559b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f170558a = provider;
        this.f170559b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f170558a.get(), (ImvGoodsAdvertParams) this.f170559b.f393949a);
    }
}
