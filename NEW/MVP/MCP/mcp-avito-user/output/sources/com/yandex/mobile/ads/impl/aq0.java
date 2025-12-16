package com.yandex.mobile.ads.impl;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* loaded from: classes8.dex */
public final class aq0 implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final aq0 f383629a = new aq0();

    private aq0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(@Y61.k java.lang.String r9, @Y61.k java.security.cert.X509Certificate r10) throws java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.aq0.a(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(@Y61.k String str, @Y61.k SSLSession sSLSession) {
        if (str.length() != ((int) okio.k0.a(str))) {
            return false;
        }
        try {
            return a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    @Y61.k
    public static List a(@Y61.k X509Certificate x509Certificate) throws CertificateParsingException {
        return C42745f0.h0(a(x509Certificate, 2), a(x509Certificate, 7));
    }

    private static List a(X509Certificate x509Certificate, int i12) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C42784z0.f406748b;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && kotlin.jvm.internal.L.f(list.get(0), Integer.valueOf(i12)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C42784z0.f406748b;
        }
    }
}
