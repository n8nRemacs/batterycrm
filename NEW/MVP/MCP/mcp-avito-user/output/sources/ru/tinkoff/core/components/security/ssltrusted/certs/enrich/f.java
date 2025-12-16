package ru.tinkoff.core.components.security.ssltrusted.certs.enrich;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MediatorTrustManager.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/tinkoff/core/components/security/ssltrusted/certs/enrich/f;", "Ljavax/net/ssl/X509TrustManager;", "ru.tinkoff.core.components.security.ssl-trusted-certs"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"CustomX509TrustManager"})
/* loaded from: classes9.dex */
public final class f implements X509TrustManager {
    public final synchronized List<X509TrustManager> a() {
        throw null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(@l X509Certificate[] x509CertificateArr, @l String str) {
        synchronized (this) {
            a();
            throw null;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(@l X509Certificate[] x509CertificateArr, @l String str) {
        synchronized (this) {
            a();
            throw null;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    @k
    public final X509Certificate[] getAcceptedIssuers() {
        throw null;
    }
}
