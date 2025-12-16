package com.avito.android.fees_methods.screen.fees_by_package.di;

import com.avito.android.fees_methods.deeplink.FeesByPackageDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: FeesByPackageDeeplinksMappingsModule_ProvideFeesByPackageMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.fees_methods.screen.fees_by_package.deeplink.g f157994a;

    public f(com.avito.android.fees_methods.screen.fees_by_package.deeplink.g gVar) {
        this.f157994a = gVar;
    }

    public static C43834a a(com.avito.android.fees_methods.screen.fees_by_package.deeplink.g gVar) {
        d.f157992a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(FeesByPackageDeeplink.class, new com.avito.android.fees_methods.screen.fees_by_package.deeplink.h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(FeesByPackageDeeplink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f157994a);
    }
}
