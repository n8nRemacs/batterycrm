package com.avito.android.fees_methods.screen.fees_by_package.di;

import com.avito.android.fees_methods.deeplink.FeesApplyByPackageV2Link;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: FeesByPackageDeeplinksMappingsModule_ProvideFeesApplyByPackageMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.fees_methods.screen.fees_by_package.deeplink.d f157993a;

    public e(com.avito.android.fees_methods.screen.fees_by_package.deeplink.d dVar) {
        this.f157993a = dVar;
    }

    public static C43834a a(com.avito.android.fees_methods.screen.fees_by_package.deeplink.d dVar) {
        d.f157992a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(FeesApplyByPackageV2Link.class, new com.avito.android.fees_methods.screen.fees_by_package.deeplink.e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(FeesApplyByPackageV2Link.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f157993a);
    }
}
