package com.avito.android.vas_union.di;

import com.avito.android.vas_union.deeplink.VasUnionContextLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VasUnionV2DeeplinkMappingsModule_ProvideVasUnionContextMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_union.deeplink.c f323179a;

    public l(com.avito.android.vas_union.deeplink.c cVar) {
        this.f323179a = cVar;
    }

    public static C43834a a(com.avito.android.vas_union.deeplink.c cVar) {
        k.f323178a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VasUnionContextLink.class, new com.avito.android.vas_union.deeplink.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VasUnionContextLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f323179a);
    }
}
