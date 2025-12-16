package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class rp0 extends ProxySelector {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final rp0 f389602a = new rp0();

    private rp0() {
    }

    @Override // java.net.ProxySelector
    @Y61.k
    public final List<Proxy> select(@Y61.l URI uri) {
        if (uri != null) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(@Y61.l URI uri, @Y61.l SocketAddress socketAddress, @Y61.l IOException iOException) {
    }
}
