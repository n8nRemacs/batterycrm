package okhttp3.tls;

import X41.i;
import Y61.k;
import androidx.compose.foundation.H;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.ranges.j;
import kotlin.ranges.s;
import okio.C44802l;
import okio.C44802l.b;
import okio.C44805o;

/* compiled from: Certificates.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u000b\u001a\u00020\n*\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "decodeCertificatePem", "(Ljava/lang/String;)Ljava/security/cert/X509Certificate;", "certificatePem", "(Ljava/security/cert/X509Certificate;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lokio/o;", "data", "Lkotlin/G0;", "encodeBase64Lines", "(Ljava/lang/StringBuilder;Lokio/o;)V", "okhttp-tls"}, k = 2, mv = {1, 8, 0}, xi = 48)
@i
/* loaded from: classes7.dex */
public final class Certificates {
    @k
    public static final String certificatePem(@k X509Certificate x509Certificate) {
        StringBuilder sbR = H.r("-----BEGIN CERTIFICATE-----\n");
        encodeBase64Lines(sbR, C44805o.a.d(C44805o.f420139e, x509Certificate.getEncoded()));
        sbR.append("-----END CERTIFICATE-----\n");
        return sbR.toString();
    }

    @k
    public static final X509Certificate decodeCertificatePem(@k String str) {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            C44802l c44802l = new C44802l();
            c44802l.O(str);
            return (X509Certificate) C42745f0.t0(certificateFactory.generateCertificates(c44802l.new b()));
        } catch (IllegalArgumentException e12) {
            throw new IllegalArgumentException("failed to decode certificate", e12);
        } catch (GeneralSecurityException e13) {
            throw new IllegalArgumentException("failed to decode certificate", e13);
        } catch (NoSuchElementException e14) {
            throw new IllegalArgumentException("failed to decode certificate", e14);
        }
    }

    public static final void encodeBase64Lines(@k StringBuilder sb2, @k C44805o c44805o) {
        String strA = c44805o.a();
        j jVarP = s.p(s.r(0, strA.length()), 64);
        int i12 = jVarP.f406905b;
        int i13 = jVarP.f406906c;
        int i14 = jVarP.f406907d;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return;
        }
        while (true) {
            sb2.append((CharSequence) strA, i12, Math.min(i12 + 64, strA.length()));
            sb2.append('\n');
            if (i12 == i13) {
                return;
            } else {
                i12 += i14;
            }
        }
    }
}
