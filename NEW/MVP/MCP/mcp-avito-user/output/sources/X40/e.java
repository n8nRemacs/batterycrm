package x40;

import Y61.k;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okio.C44805o;
import okio.X;

/* compiled from: WritingUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_offlinization_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e {
    public static final void a(@k X x12, @k List list) throws IOException, CertificateEncodingException {
        try {
            x12.U0(list.size());
            x12.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x12.b2(C44805o.a.d(C44805o.f420139e, ((Certificate) it.next()).getEncoded()).a());
                x12.writeByte(10);
            }
        } catch (CertificateEncodingException e12) {
            throw new IOException(e12.getMessage());
        }
    }
}
