package com.avito.android.bbl.screens.limit_increase.di;

import com.avito.android.bbl.screens.limit_increase.deeplink.LimitIncreaseLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: LimitIncreaseFragmentMappingsModule_ProvideLimitIncreaseFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<A50.a> {

    /* compiled from: LimitIncreaseFragmentMappingsModule_ProvideLimitIncreaseFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f99758a = new i();
    }

    public static i a() {
        return a.f99758a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h.f99757a.getClass();
        return new A50.a(m0.f406844a.b(LimitIncreaseLink.class), new com.avito.android.bbl.screens.limit_increase.ui.e());
    }
}
