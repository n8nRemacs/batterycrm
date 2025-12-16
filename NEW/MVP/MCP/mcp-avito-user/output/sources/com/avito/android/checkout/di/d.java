package com.avito.android.checkout.di;

import com.avito.android.checkout.deeplink.CheckoutPromoCodeV2DeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import ro.C47694b;

/* compiled from: CheckoutDeeplinkMappingsModule_ProvideCheckoutPromoCodeV2DeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.checkout.deeplink.handlers.f f118240a;

    public d(com.avito.android.checkout.deeplink.handlers.f fVar) {
        this.f118240a = fVar;
    }

    public static C43834a a(com.avito.android.checkout.deeplink.handlers.f fVar) {
        b.f118238a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CheckoutPromoCodeV2DeepLink.class, new C47694b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CheckoutPromoCodeV2DeepLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f118240a);
    }
}
