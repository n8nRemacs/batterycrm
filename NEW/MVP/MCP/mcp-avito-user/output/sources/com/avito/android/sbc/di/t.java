package com.avito.android.sbc.di;

import So0.C15209a;
import com.avito.android.sbc.deeplink.DiscountDispatchVasDeepLink;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: SbcMappingsModule_ProvideDiscountDispatchFragmentMappingFactory.java */
@dagger.internal.e
@dagger.internal.x
@y
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<A50.a> {

    /* compiled from: SbcMappingsModule_ProvideDiscountDispatchFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final t f260027a = new t();
    }

    public static t a() {
        return a.f260027a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        s.f260026a.getClass();
        return new A50.a(m0.f406844a.b(DiscountDispatchVasDeepLink.class), new C15209a());
    }
}
