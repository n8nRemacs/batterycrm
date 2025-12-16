package okhttp3.tls.internal.der;

import Y41.l;
import Y61.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: CertificateAdapters.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CertificateAdapters$algorithmIdentifier$1 extends N implements l<AlgorithmIdentifier, List<?>> {
    public static final CertificateAdapters$algorithmIdentifier$1 INSTANCE = new CertificateAdapters$algorithmIdentifier$1();

    public CertificateAdapters$algorithmIdentifier$1() {
        super(1);
    }

    @Override // Y41.l
    @k
    public final List<?> invoke(@k AlgorithmIdentifier algorithmIdentifier) {
        return C42745f0.U(algorithmIdentifier.getAlgorithm(), algorithmIdentifier.getParameters());
    }
}
