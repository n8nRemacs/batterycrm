package com.avito.android.fees_methods.screen.fees_by_package.di;

import com.avito.android.fees_methods.deeplink.FeesByPackageDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: FeesByPackageFragmentMappingsModule_ProvideFeesByPackageFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<A50.a> {

    /* compiled from: FeesByPackageFragmentMappingsModule_ProvideFeesByPackageFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f157996a = new h();
    }

    public static h a() {
        return a.f157996a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g.f157995a.getClass();
        return new A50.a(m0.f406844a.b(FeesByPackageDeeplink.class), new com.avito.android.fees_methods.screen.fees_by_package.ui.f());
    }
}
