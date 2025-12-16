package defpackage;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import tech.kwik.agent15.alert.BadCertificateAlert;

/* loaded from: classes.dex */
public final class f72 extends h07 {
    public byte[] a;
    public X509Certificate b;
    public List c;
    public byte[] d;

    @Override // defpackage.h07
    public final byte[] a() {
        return this.d;
    }

    @Override // defpackage.h07
    public final lbg b() {
        return lbg.certificate;
    }

    public final void e(ByteBuffer byteBuffer) throws BadCertificateAlert {
        int i = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
        int i2 = 0;
        while (i > 0) {
            int i3 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
            byte[] bArr = new byte[i3];
            byteBuffer.get(bArr);
            if (i3 > 0) {
                try {
                    X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
                    if (i2 == 0) {
                        this.b = x509Certificate;
                    }
                    this.c.add(x509Certificate);
                } catch (CertificateException unused) {
                    throw new BadCertificateAlert("could not parse certificate");
                }
            }
            int i4 = i - (i3 + 3);
            i2++;
            int i5 = byteBuffer.getShort() & 65535;
            byteBuffer.get(new byte[i5]);
            i = i4 - (i5 + 2);
        }
    }
}
