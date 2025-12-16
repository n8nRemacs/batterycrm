package com.avito.android.bundles.vas_union.di;

import com.avito.android.vas_union.deeplink.VasUnionLink;
import kotlin.jvm.internal.m0;

/* compiled from: VasUnionFragmentMappingsModule_ProvideVasUnionFragmentMappingFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes11.dex */
public final class o implements dagger.internal.h<A50.a> {

    /* compiled from: VasUnionFragmentMappingsModule_ProvideVasUnionFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final o f108542a = new o();
    }

    public static o a() {
        return a.f108542a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        n.f108541a.getClass();
        return new A50.a(m0.f406844a.b(VasUnionLink.class), new com.avito.android.bundles.vas_union.j());
    }
}
