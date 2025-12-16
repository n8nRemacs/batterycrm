package V01;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/* loaded from: classes7.dex */
public class d {
    public static boolean a(X509Certificate[] x509CertificateArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        Principal principal = null;
        int i12 = 0;
        while (i12 < x509CertificateArr.length) {
            X509Certificate x509Certificate = x509CertificateArr[i12];
            Principal issuerDN = x509Certificate.getIssuerDN();
            Principal subjectDN = x509Certificate.getSubjectDN();
            if (principal != null) {
                if (!issuerDN.equals(principal)) {
                    return false;
                }
                x509CertificateArr[i12].verify(x509CertificateArr[i12 - 1].getPublicKey());
            }
            i12++;
            principal = subjectDN;
        }
        X509Certificate x509Certificate2 = x509CertificateArr[0];
        throw null;
    }
}
