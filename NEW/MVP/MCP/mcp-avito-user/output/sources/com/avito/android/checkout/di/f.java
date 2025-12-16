package com.avito.android.checkout.di;

import com.avito.android.checkout.deeplink.CheckoutSaveV2DeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CheckoutDeeplinkMappingsModule_ProvideCheckoutSaveV2DeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.checkout.deeplink.handlers.l f118242a;

    public f(com.avito.android.checkout.deeplink.handlers.l lVar) {
        this.f118242a = lVar;
    }

    public static C43834a a(com.avito.android.checkout.deeplink.handlers.l lVar) {
        b.f118238a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CheckoutSaveV2DeepLink.class, new ro.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CheckoutSaveV2DeepLink.class), lVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f118242a);
    }
}
