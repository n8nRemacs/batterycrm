package com.avito.android.sbc.deeplink;

import com.avito.android.deep_linking.links.DiscountDispatchProxyDeepLink;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DiscountDispatchProxyDeepLinkHandler_Factory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class h<DeeplinkT extends DiscountDispatchProxyDeepLink> implements dagger.internal.h<g<DeeplinkT>> {

    /* compiled from: DiscountDispatchProxyDeepLinkHandler_Factory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f259961a = new h();
    }

    public static <DeeplinkT extends DiscountDispatchProxyDeepLink> h<DeeplinkT> a() {
        return a.f259961a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g();
    }
}
