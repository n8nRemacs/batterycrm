package com.avito.android.advert.di;

import com.avito.android.deep_linking.links.CustomChromeTabExternalLink;
import lv.C43834a;

/* compiled from: AdvertDetailsMappingsModule_ProvideCustomChromeTabDeeplinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.di.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27701j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert.deeplinks.chrome_tab.d f69408a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert.deeplinks.chrome_tab.b f69409b;

    public C27701j(com.avito.android.advert.deeplinks.chrome_tab.d dVar, com.avito.android.advert.deeplinks.chrome_tab.b bVar) {
        this.f69408a = dVar;
        this.f69409b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f69409b.getClass();
        com.avito.android.advert.deeplinks.chrome_tab.a aVar = new com.avito.android.advert.deeplinks.chrome_tab.a();
        com.avito.android.advert.deeplinks.chrome_tab.d dVar = this.f69408a;
        C27699h.f69403a.getClass();
        return new C43834a(CustomChromeTabExternalLink.class, aVar, new C43834a.b.C11809b(dVar));
    }
}
