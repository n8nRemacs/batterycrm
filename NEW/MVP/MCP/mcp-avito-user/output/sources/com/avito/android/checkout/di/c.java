package com.avito.android.checkout.di;

import com.avito.android.checkout.deeplink.CheckoutDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import ro.C47693a;

/* compiled from: CheckoutDeeplinkMappingsModule_ProvideCheckoutDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.checkout.deeplink.handlers.b f118239a;

    public c(com.avito.android.checkout.deeplink.handlers.b bVar) {
        this.f118239a = bVar;
    }

    public static C43834a a(com.avito.android.checkout.deeplink.handlers.b bVar) {
        b.f118238a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CheckoutDeepLink.class, new C47693a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CheckoutDeepLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f118239a);
    }
}
