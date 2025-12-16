package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bq0;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes8.dex */
public final class cq0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private static final ConcurrentHashMap<dq0, bq0> f384385a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private static final za1 f384386b = new za1();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f384387c = 0;

    @Y61.k
    public static bq0 a(int i12, int i13, @Y61.l SSLSocketFactory sSLSocketFactory) throws NoSuchAlgorithmException, KeyStoreException {
        X509TrustManager x509TrustManagerA = f384386b.a();
        dq0 dq0Var = new dq0(i12, i13, (sSLSocketFactory == null || x509TrustManagerA == null) ? null : sSLSocketFactory);
        ConcurrentHashMap<dq0, bq0> concurrentHashMap = f384385a;
        if (!concurrentHashMap.containsKey(dq0Var)) {
            bq0.a aVar = new bq0.a();
            long j12 = i12;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bq0.a aVarA = aVar.a(j12, timeUnit).b(i13, timeUnit).a();
            if (sSLSocketFactory != null && x509TrustManagerA != null) {
                aVarA = aVarA.a(sSLSocketFactory, x509TrustManagerA);
            }
            concurrentHashMap.put(dq0Var, new bq0(aVarA));
        }
        bq0 bq0Var = concurrentHashMap.get(dq0Var);
        if (bq0Var != null) {
            return bq0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
