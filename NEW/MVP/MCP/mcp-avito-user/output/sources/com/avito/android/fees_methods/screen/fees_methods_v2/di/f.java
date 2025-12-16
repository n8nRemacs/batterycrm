package com.avito.android.fees_methods.screen.fees_methods_v2.di;

import com.avito.android.fees_methods.deeplink.FeesMethodsV3DeepLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: FeesMethodsV2FragmentMappingsModule_ProvideFeesMethodsV2FragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<A50.a> {

    /* compiled from: FeesMethodsV2FragmentMappingsModule_ProvideFeesMethodsV2FragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f158243a = new f();
    }

    public static f a() {
        return a.f158243a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f158242a.getClass();
        return new A50.a(m0.f406844a.b(FeesMethodsV3DeepLink.class), new com.avito.android.fees_methods.screen.fees_methods_v2.c());
    }
}
