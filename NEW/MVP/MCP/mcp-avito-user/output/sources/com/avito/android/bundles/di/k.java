package com.avito.android.bundles.di;

import com.avito.android.bundles.deeplink.BundlesLink;
import lv.C43834a;

/* compiled from: VasBundlesDeeplinkMappingsModule_ProvideVasBundlesLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bundles.deeplink.b f108307a;

    public k(com.avito.android.bundles.deeplink.b bVar) {
        this.f108307a = bVar;
    }

    public static C43834a a(com.avito.android.bundles.deeplink.b bVar) {
        j.f108306a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(BundlesLink.class, new com.avito.android.bundles.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BundlesLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f108307a);
    }
}
