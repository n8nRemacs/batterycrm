package okhttp3.tls.internal.der;

import Y41.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: CertificateAdapters.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lokhttp3/tls/internal/der/DerAdapter;", "typeHint", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CertificateAdapters$algorithmParameters$1 extends N implements l<Object, DerAdapter<?>> {
    public static final CertificateAdapters$algorithmParameters$1 INSTANCE = new CertificateAdapters$algorithmParameters$1();

    public CertificateAdapters$algorithmParameters$1() {
        super(1);
    }

    @Override // Y41.l
    @Y61.l
    public final DerAdapter<?> invoke(@Y61.l Object obj) {
        if (!L.f(obj, ObjectIdentifiers.sha256WithRSAEncryption) && !L.f(obj, ObjectIdentifiers.rsaEncryption)) {
            if (L.f(obj, ObjectIdentifiers.ecPublicKey)) {
                return Adapters.INSTANCE.getOBJECT_IDENTIFIER();
            }
            return null;
        }
        return Adapters.INSTANCE.getNULL();
    }
}
