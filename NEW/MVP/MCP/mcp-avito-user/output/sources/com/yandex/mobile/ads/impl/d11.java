package com.yandex.mobile.ads.impl;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes8.dex */
public final class d11 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final X509TrustManager f384505a;

    public d11(@Y61.k oo1 oo1Var) {
        this.f384505a = oo1Var;
    }

    @Y61.k
    public final SSLContext a() throws NoSuchAlgorithmException, KeyManagementException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{this.f384505a}, null);
            return sSLContext;
        } catch (KeyManagementException e12) {
            throw new IllegalStateException("Failed to initialize SSLContext", e12);
        } catch (NoSuchAlgorithmException e13) {
            throw new IllegalStateException("No system TLS", e13);
        }
    }
}
