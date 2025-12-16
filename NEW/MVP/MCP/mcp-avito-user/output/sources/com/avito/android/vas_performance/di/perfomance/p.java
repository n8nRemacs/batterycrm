package com.avito.android.vas_performance.di.perfomance;

import com.avito.android.vas_performance.deeplink.PerformanceVasLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: PerformanceVasFragmentMappingsModule_ProvidePerformanceVasFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<A50.a> {

    /* compiled from: PerformanceVasFragmentMappingsModule_ProvidePerformanceVasFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final p f320046a = new p();
    }

    public static p a() {
        return a.f320046a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        o.f320045a.getClass();
        return new A50.a(m0.f406844a.b(PerformanceVasLink.class), new com.avito.android.vas_performance.n());
    }
}
