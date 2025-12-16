package com.huawei.secure.android.common.ssl;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes7.dex */
public class l implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f363737a = new ArrayList();

    public l(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("inputstream or trustPwd is null");
        }
        System.currentTimeMillis();
        try {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                KeyStore keyStore = KeyStore.getInstance("bks");
                keyStore.load(inputStream, "".toCharArray());
                trustManagerFactory.init(keyStore);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        this.f363737a.add((X509TrustManager) trustManager);
                    }
                }
                V01.h.a(inputStream);
            } finally {
                V01.h.a(inputStream);
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e12) {
            e12.getMessage();
        }
        System.currentTimeMillis();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        Iterator it = this.f363737a.iterator();
        while (it.hasNext()) {
            try {
                ((X509TrustManager) it.next()).checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e12) {
                e12.getMessage();
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        int length = x509CertificateArr.length;
        System.currentTimeMillis();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            Objects.toString(x509Certificate.getSubjectDN());
            Objects.toString(x509Certificate.getIssuerDN());
            Objects.toString(x509Certificate.getSerialNumber());
        }
        ArrayList arrayList = this.f363737a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                X509TrustManager x509TrustManager = (X509TrustManager) arrayList.get(i12);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    for (X509Certificate x509Certificate2 : acceptedIssuers) {
                        Objects.toString(x509Certificate2.getIssuerDN());
                    }
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                Objects.toString(x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e12) {
                e12.getMessage();
                if (i12 == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        Objects.toString(x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e12;
                }
            }
        }
        System.currentTimeMillis();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f363737a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(((X509TrustManager) it.next()).getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e12) {
            e12.getMessage();
            return new X509Certificate[0];
        }
    }
}
