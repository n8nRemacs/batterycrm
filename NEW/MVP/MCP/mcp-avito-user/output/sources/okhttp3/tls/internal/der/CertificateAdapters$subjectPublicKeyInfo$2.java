package okhttp3.tls.internal.der;

import Y41.l;
import Y61.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CertificateAdapters.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CertificateAdapters$subjectPublicKeyInfo$2 extends N implements l<List<?>, SubjectPublicKeyInfo> {
    public static final CertificateAdapters$subjectPublicKeyInfo$2 INSTANCE = new CertificateAdapters$subjectPublicKeyInfo$2();

    public CertificateAdapters$subjectPublicKeyInfo$2() {
        super(1);
    }

    @Override // Y41.l
    @k
    public final SubjectPublicKeyInfo invoke(@k List<?> list) {
        return new SubjectPublicKeyInfo((AlgorithmIdentifier) list.get(0), (BitString) list.get(1));
    }
}
