package com.avito.android.bundles.vas_union.di;

import com.avito.android.vas_union.deeplink.VasUnionLink;
import lv.C43834a;

/* compiled from: VasUnionDeeplinkMappingsModule_ProvideVasUnionLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bundles.vas_union.deeplink.b f108540a;

    public l(com.avito.android.bundles.vas_union.deeplink.b bVar) {
        this.f108540a = bVar;
    }

    public static C43834a a(com.avito.android.bundles.vas_union.deeplink.b bVar) {
        k.f108539a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VasUnionLink.class, new com.avito.android.bundles.vas_union.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VasUnionLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f108540a);
    }
}
