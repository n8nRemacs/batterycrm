package com.avito.android.vas_union.di;

import com.avito.android.vas_union.deeplink.VasUnionV2Link;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: VasUnionV2FragmentMappingsModule_ProvideVasUnionV2FragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<A50.a> {

    /* compiled from: VasUnionV2FragmentMappingsModule_ProvideVasUnionV2FragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final p f323182a = new p();
    }

    public static p a() {
        return a.f323182a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        o.f323181a.getClass();
        return new A50.a(m0.f406844a.b(VasUnionV2Link.class), new com.avito.android.vas_union.f());
    }
}
