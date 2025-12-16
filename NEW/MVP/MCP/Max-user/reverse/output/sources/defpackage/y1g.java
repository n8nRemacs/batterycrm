package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Locale;
import java.util.NoSuchElementException;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class y1g implements X509TrustManager {
    public final String a;
    public final String b;
    public final X509TrustManager c;
    public final bwf d;

    public y1g(String str) throws NoSuchAlgorithmException, KeyStoreException {
        this.a = str;
        String name = y1g.class.getName();
        this.b = name;
        this.d = new bwf(new kvf(3, this));
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "init, useX509Extension=true", null);
            }
        }
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        this.c = (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        String str2 = this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str2, wy1.h("checkClientTrusted, authType=", str), null);
            }
        }
        this.c.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        String str2;
        lg8 lg8Var = lg8.d;
        String str3 = this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str3, wy1.h("checkServerTrusted, authType=", str), null);
        }
        try {
            if (((X509TrustManagerExtensions) this.d.getValue()) != null && (str2 = this.a) != null && str2.length() != 0) {
                String str4 = this.b;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                    l6bVar2.c(lg8Var, str4, "checkServerTrusted, use X509 extension, host=" + this.a, null);
                }
                X509TrustManagerExtensions x509TrustManagerExtensions = (X509TrustManagerExtensions) this.d.getValue();
                if (x509TrustManagerExtensions != null) {
                    x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, this.a);
                    return;
                }
                return;
            }
            this.c.checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            wqi.e(this.b, "server certificate chain not trusted", e);
            if (x509CertificateArr != null) {
                String str5 = this.b;
                l6b l6bVar3 = wqi.a;
                if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                    StringBuilder sb = new StringBuilder("\n");
                    int length = x509CertificateArr.length;
                    for (int i = 0; i < length; i++) {
                        sb.append(i);
                        sb.append('.');
                        sb.append(' ');
                        jib.a(sb, x509CertificateArr[i]);
                    }
                    l6bVar3.c(lg8Var, str5, "server certificate chain: " + ((Object) sb), null);
                }
            }
            try {
                Locale locale = Locale.getDefault();
                StringBuilder sb2 = new StringBuilder();
                X509Certificate[] acceptedIssuers = this.c.getAcceptedIssuers();
                int i2 = 0;
                while (i2 < acceptedIssuers.length) {
                    int i3 = i2 + 1;
                    try {
                        X509Certificate x509Certificate = acceptedIssuers[i2];
                        Principal issuerDN = x509Certificate.getIssuerDN();
                        String name = issuerDN != null ? issuerDN.getName() : null;
                        Principal subjectDN = x509Certificate.getSubjectDN();
                        String name2 = subjectDN != null ? subjectDN.getName() : null;
                        if ((name != null && vmf.s(name.toLowerCase(locale), "comodo", false)) || (name2 != null && vmf.s(name2.toLowerCase(locale), "comodo", false))) {
                            jib.a(sb2, x509Certificate);
                        }
                        i2 = i3;
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw new NoSuchElementException(e2.getMessage());
                    }
                }
                String str6 = this.b;
                l6b l6bVar4 = wqi.a;
                if (l6bVar4 != null && l6bVar4.b(lg8Var)) {
                    l6bVar4.c(lg8Var, str6, "trusted store certificates: " + ((Object) sb2), null);
                }
            } catch (GeneralSecurityException e3) {
                wqi.e(this.b, "failed to log trusted store certificates", e3);
                throw e;
            }
            throw e;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.c.getAcceptedIssuers();
    }
}
