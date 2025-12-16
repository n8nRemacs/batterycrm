package com.avito.android.bundles.di;

import com.avito.android.bundles.deeplink.BundlesLink;
import kotlin.jvm.internal.m0;

/* compiled from: VasBundlesFragmentMappingsModule_ProvideVasBundlesFragmentMappingFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<A50.a> {

    /* compiled from: VasBundlesFragmentMappingsModule_ProvideVasBundlesFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final n f108309a = new n();
    }

    public static n a() {
        return a.f108309a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m.f108308a.getClass();
        return new A50.a(m0.f406844a.b(BundlesLink.class), new com.avito.android.bundles.e());
    }
}
