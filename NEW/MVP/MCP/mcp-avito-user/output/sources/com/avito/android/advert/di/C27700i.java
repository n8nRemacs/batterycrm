package com.avito.android.advert.di;

import com.avito.android.deep_linking.links.AddItemToCartLink;
import lv.C43834a;

/* compiled from: AdvertDetailsMappingsModule_ProvideAddItemToCartDeeplinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.di.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27700i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert.deeplinks.h f69405a;

    public C27700i(com.avito.android.advert.deeplinks.h hVar) {
        this.f69405a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert.deeplinks.h hVar = this.f69405a;
        C27699h.f69403a.getClass();
        return new C43834a(AddItemToCartLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AddItemToCartLink.class), hVar));
    }
}
