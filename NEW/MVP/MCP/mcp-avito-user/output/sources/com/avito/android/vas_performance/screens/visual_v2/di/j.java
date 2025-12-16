package com.avito.android.vas_performance.screens.visual_v2.di;

import com.avito.android.vas_performance.deeplink.VisualVasV2Link;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: VisualVasV2FragmentMappingsModule_ProvideVisualVasV2FragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<A50.a> {

    /* compiled from: VisualVasV2FragmentMappingsModule_ProvideVisualVasV2FragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f321207a = new j();
    }

    public static j a() {
        return a.f321207a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i.f321206a.getClass();
        return new A50.a(m0.f406844a.b(VisualVasV2Link.class), new com.avito.android.vas_performance.screens.visual_v2.e());
    }
}
