package com.avito.android.vas_union.di;

import com.avito.android.vas_union.deeplink.VasUnionV2Link;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VasUnionV2DeeplinkMappingsModule_ProvideVasUnionV2MappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_union.deeplink.f f323180a;

    public m(com.avito.android.vas_union.deeplink.f fVar) {
        this.f323180a = fVar;
    }

    public static C43834a a(com.avito.android.vas_union.deeplink.f fVar) {
        k.f323178a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VasUnionV2Link.class, new com.avito.android.vas_union.deeplink.g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VasUnionV2Link.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f323180a);
    }
}
