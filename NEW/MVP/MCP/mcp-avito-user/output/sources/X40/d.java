package x40;

import Y61.k;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import okio.C44802l;
import okio.C44802l.b;
import okio.C44805o;
import okio.Y;

/* compiled from: ReadingUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_offlinization_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d {
    @k
    public static final List a(@k Y y12) throws IOException, CertificateException {
        int iB2 = b(y12);
        if (iB2 == -1) {
            return C42784z0.f406748b;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iB2);
            for (int i12 = 0; i12 < iB2; i12++) {
                String strX1 = y12.X1(Long.MAX_VALUE);
                C44802l c44802l = new C44802l();
                C44805o.f420139e.getClass();
                c44802l.B(C44805o.a.a(strX1));
                arrayList.add(certificateFactory.generateCertificate(c44802l.new b()));
            }
            return arrayList;
        } catch (CertificateException e12) {
            throw new IOException(e12.getMessage());
        }
    }

    public static final int b(@k Y y12) throws IOException {
        try {
            long jY2 = y12.Y2();
            String strX1 = y12.X1(Long.MAX_VALUE);
            if (jY2 >= 0 && jY2 <= 2147483647L && strX1.length() <= 0) {
                return (int) jY2;
            }
            throw new IOException("expected an int but was \"" + jY2 + strX1 + '\"');
        } catch (NumberFormatException e12) {
            throw new IOException(e12.getMessage());
        }
    }
}
