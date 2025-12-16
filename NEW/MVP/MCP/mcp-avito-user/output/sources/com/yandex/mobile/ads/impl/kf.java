package com.yandex.mobile.ads.impl;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes8.dex */
public final class kf extends ji {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ab1 f387122a;

    public kf(@Y61.k ab1 ab1Var) {
        this.f387122a = ab1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ji
    @Y61.k
    public final List a(@Y61.k String str, @Y61.k List list) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException, SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z12 = false;
        for (int i12 = 0; i12 < 9; i12++) {
            X509Certificate x509Certificate = (X509Certificate) androidx.appcompat.app.r.j(1, arrayList);
            X509Certificate x509CertificateA = this.f387122a.a(x509Certificate);
            if (x509CertificateA == null) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (kotlin.jvm.internal.L.f(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (z12) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateA)) {
                arrayList.add(x509CertificateA);
            }
            if (kotlin.jvm.internal.L.f(x509CertificateA.getIssuerDN(), x509CertificateA.getSubjectDN())) {
                try {
                    x509CertificateA.verify(x509CertificateA.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z12 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(@Y61.l Object obj) {
        return obj == this || ((obj instanceof kf) && kotlin.jvm.internal.L.f(((kf) obj).f387122a, this.f387122a));
    }

    public final int hashCode() {
        return this.f387122a.hashCode();
    }
}
