package com.avito.android.checkout.di;

import com.avito.android.checkout.deeplink.CheckoutRefreshDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import ro.C47695c;

/* compiled from: CheckoutDeeplinkMappingsModule_ProvideCheckoutRefreshDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.checkout.deeplink.handlers.i f118241a;

    public e(com.avito.android.checkout.deeplink.handlers.i iVar) {
        this.f118241a = iVar;
    }

    public static C43834a a(com.avito.android.checkout.deeplink.handlers.i iVar) {
        b.f118238a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CheckoutRefreshDeepLink.class, new C47695c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CheckoutRefreshDeepLink.class), iVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f118241a);
    }
}
