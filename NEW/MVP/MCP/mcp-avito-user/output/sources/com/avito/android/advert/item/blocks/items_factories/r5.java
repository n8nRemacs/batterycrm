package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.ab_tests.configs.SparePartsGarageItemCompatV2RenaissanceTestGroup;
import javax.inject.Provider;

/* compiled from: GarageCompatibilityV2ItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class r5 implements dagger.internal.h<q5> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74021a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.f<SparePartsGarageItemCompatV2RenaissanceTestGroup>> f74022b;

    public r5(Provider<com.avito.android.advert.item.similars.j> provider, Provider<u3.f<SparePartsGarageItemCompatV2RenaissanceTestGroup>> provider2) {
        this.f74021a = provider;
        this.f74022b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q5(this.f74021a.get(), this.f74022b.get());
    }
}
