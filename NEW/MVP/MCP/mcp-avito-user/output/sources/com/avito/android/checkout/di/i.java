package com.avito.android.checkout.di;

import com.avito.android.checkout.deeplink.CheckoutDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: CheckoutFragmentMappingsModule_ProvideCheckoutFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<A50.a> {

    /* compiled from: CheckoutFragmentMappingsModule_ProvideCheckoutFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f118244a = new i();
    }

    public static i a() {
        return a.f118244a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h.f118243a.getClass();
        return new A50.a(m0.f406844a.b(CheckoutDeepLink.class), new com.avito.android.checkout.e());
    }
}
