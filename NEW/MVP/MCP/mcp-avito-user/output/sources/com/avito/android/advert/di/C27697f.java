package com.avito.android.advert.di;

import com.avito.android.deep_linking.links.AdvertDetailsLink;
import lv.C43834a;

/* compiled from: AdvertDetailsDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.di.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27697f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert.deeplinks.k f69395a;

    public C27697f(com.avito.android.advert.deeplinks.k kVar) {
        this.f69395a = kVar;
    }

    public static C43834a a(com.avito.android.advert.deeplinks.k kVar) {
        C27696e.f69394a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AdvertDetailsLink.class, new com.avito.android.advert.deeplinks.l(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AdvertDetailsLink.class), kVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f69395a);
    }
}
