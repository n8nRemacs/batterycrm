package okhttp3.tls.internal.der;

import Y61.k;
import Y61.l;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.net.ProtocolException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import okhttp3.tls.internal.der.DerAdapter;
import okio.C44805o;

/* compiled from: CertificateAdapters.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0012R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u0012R2\u0010\u001c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u001d\u0010\tR2\u0010\u001f\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b0\u001e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\rR \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010\u0012R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\rR,\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001e0\u001e0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u0012R2\u0010(\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010\u0007\u001a\u0004\b)\u0010\tR \u0010+\u001a\b\u0012\u0004\u0012\u00020*0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010\r\u001a\u0004\b,\u0010\u0012R \u0010.\u001a\b\u0012\u0004\u0012\u00020-0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010\r\u001a\u0004\b/\u0010\u0012R \u00101\u001a\b\u0012\u0004\u0012\u0002000\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010\r\u001a\u0004\b2\u0010\u0012R \u00104\u001a\b\u0012\u0004\u0012\u0002030\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010\r\u001a\u0004\b5\u0010\u0012¨\u00066"}, d2 = {"Lokhttp3/tls/internal/der/CertificateAdapters;", "", "<init>", "()V", "Lokhttp3/tls/internal/der/DerAdapter;", "", CrashHianalyticsData.TIME, "Lokhttp3/tls/internal/der/DerAdapter;", "getTime$okhttp_tls", "()Lokhttp3/tls/internal/der/DerAdapter;", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "Lokhttp3/tls/internal/der/Validity;", "validity", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "algorithmParameters", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "algorithmIdentifier", "getAlgorithmIdentifier$okhttp_tls", "()Lokhttp3/tls/internal/der/BasicDerAdapter;", "Lokhttp3/tls/internal/der/BasicConstraints;", "basicConstraints", "", "generalNameDnsName", "getGeneralNameDnsName$okhttp_tls", "Lokio/o;", "generalNameIpAddress", "getGeneralNameIpAddress$okhttp_tls", "Lkotlin/Q;", "generalName", "getGeneralName$okhttp_tls", "", "subjectAlternativeName", "extensionValue", "Lokhttp3/tls/internal/der/Extension;", "extension", "getExtension$okhttp_tls", "Lokhttp3/tls/internal/der/AttributeTypeAndValue;", "attributeTypeAndValue", "rdnSequence", "getRdnSequence$okhttp_tls", "name", "getName$okhttp_tls", "Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "subjectPublicKeyInfo", "getSubjectPublicKeyInfo$okhttp_tls", "Lokhttp3/tls/internal/der/TbsCertificate;", "tbsCertificate", "getTbsCertificate$okhttp_tls", "Lokhttp3/tls/internal/der/Certificate;", "certificate", "getCertificate$okhttp_tls", "Lokhttp3/tls/internal/der/PrivateKeyInfo;", "privateKeyInfo", "getPrivateKeyInfo$okhttp_tls", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CertificateAdapters {

    @k
    public static final CertificateAdapters INSTANCE = new CertificateAdapters();

    @k
    private static final BasicDerAdapter<AlgorithmIdentifier> algorithmIdentifier;

    @k
    private static final DerAdapter<Object> algorithmParameters;

    @k
    private static final BasicDerAdapter<AttributeTypeAndValue> attributeTypeAndValue;

    @k
    private static final BasicDerAdapter<BasicConstraints> basicConstraints;

    @k
    private static final BasicDerAdapter<Certificate> certificate;

    @k
    private static final BasicDerAdapter<Extension> extension;

    @k
    private static final BasicDerAdapter<Object> extensionValue;

    @k
    private static final DerAdapter<Q<DerAdapter<?>, Object>> generalName;

    @k
    private static final BasicDerAdapter<String> generalNameDnsName;

    @k
    private static final BasicDerAdapter<C44805o> generalNameIpAddress;

    @k
    private static final DerAdapter<Q<DerAdapter<?>, Object>> name;

    @k
    private static final BasicDerAdapter<PrivateKeyInfo> privateKeyInfo;

    @k
    private static final BasicDerAdapter<List<List<AttributeTypeAndValue>>> rdnSequence;

    @k
    private static final BasicDerAdapter<List<Q<DerAdapter<?>, Object>>> subjectAlternativeName;

    @k
    private static final BasicDerAdapter<SubjectPublicKeyInfo> subjectPublicKeyInfo;

    @k
    private static final BasicDerAdapter<TbsCertificate> tbsCertificate;

    @k
    private static final DerAdapter<Long> time;

    @k
    private static final BasicDerAdapter<Validity> validity;

    static {
        DerAdapter<Long> derAdapter = new DerAdapter<Long>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$time$1
            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<List<Long>> asSequenceOf(@k String str, int i12, long j12) {
                return DerAdapter.DefaultImpls.asSequenceOf(this, str, i12, j12);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<List<Long>> asSetOf() {
                return DerAdapter.DefaultImpls.asSetOf(this);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public Long fromDer(@k C44805o c44805o) {
                return (Long) DerAdapter.DefaultImpls.fromDer(this, c44805o);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public boolean matches(@k DerHeader header) {
                Adapters adapters = Adapters.INSTANCE;
                return adapters.getUTC_TIME().matches(header) || adapters.getGENERALIZED_TIME().matches(header);
            }

            @k
            public C44805o toDer(long j12) {
                return DerAdapter.DefaultImpls.toDer(this, Long.valueOf(j12));
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public BasicDerAdapter<Long> withExplicitBox(int i12, long j12, @l Boolean bool) {
                return DerAdapter.DefaultImpls.withExplicitBox(this, i12, j12, bool);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public /* bridge */ /* synthetic */ C44805o toDer(Long l12) {
                return toDer(l12.longValue());
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public /* bridge */ /* synthetic */ void toDer(DerWriter derWriter, Long l12) {
                toDer(derWriter, l12.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.DerAdapter
            @k
            public Long fromDer(@k DerReader reader) throws ProtocolException {
                long jLongValue;
                DerHeader derHeaderPeekHeader = reader.peekHeader();
                if (derHeaderPeekHeader != null) {
                    int tagClass = derHeaderPeekHeader.getTagClass();
                    Adapters adapters = Adapters.INSTANCE;
                    if (tagClass == adapters.getUTC_TIME().getTagClass() && derHeaderPeekHeader.getTag() == adapters.getUTC_TIME().getTag()) {
                        jLongValue = adapters.getUTC_TIME().fromDer(reader).longValue();
                    } else {
                        if (derHeaderPeekHeader.getTagClass() != adapters.getGENERALIZED_TIME().getTagClass() || derHeaderPeekHeader.getTag() != adapters.getGENERALIZED_TIME().getTag()) {
                            throw new ProtocolException("expected time but was " + derHeaderPeekHeader + " at " + reader);
                        }
                        jLongValue = adapters.getGENERALIZED_TIME().fromDer(reader).longValue();
                    }
                    return Long.valueOf(jLongValue);
                }
                throw new ProtocolException("expected time but was exhausted at " + reader);
            }

            public void toDer(@k DerWriter writer, long value) {
                if (-631152000000L <= value && value < 2524608000000L) {
                    Adapters.INSTANCE.getUTC_TIME().toDer(writer, Long.valueOf(value));
                } else {
                    Adapters.INSTANCE.getGENERALIZED_TIME().toDer(writer, Long.valueOf(value));
                }
            }
        };
        time = derAdapter;
        Adapters adapters = Adapters.INSTANCE;
        BasicDerAdapter<Validity> basicDerAdapterSequence = adapters.sequence("Validity", new DerAdapter[]{derAdapter, derAdapter}, CertificateAdapters$validity$1.INSTANCE, CertificateAdapters$validity$2.INSTANCE);
        validity = basicDerAdapterSequence;
        DerAdapter<?> derAdapterUsingTypeHint = adapters.usingTypeHint(CertificateAdapters$algorithmParameters$1.INSTANCE);
        algorithmParameters = derAdapterUsingTypeHint;
        BasicDerAdapter<AlgorithmIdentifier> basicDerAdapterSequence2 = adapters.sequence("AlgorithmIdentifier", new DerAdapter[]{adapters.getOBJECT_IDENTIFIER().asTypeHint(), derAdapterUsingTypeHint}, CertificateAdapters$algorithmIdentifier$1.INSTANCE, CertificateAdapters$algorithmIdentifier$2.INSTANCE);
        algorithmIdentifier = basicDerAdapterSequence2;
        BasicDerAdapter<Boolean> basicDerAdapter = adapters.getBOOLEAN();
        Boolean bool = Boolean.FALSE;
        basicConstraints = adapters.sequence("BasicConstraints", new DerAdapter[]{basicDerAdapter.optional(bool), BasicDerAdapter.optional$default(adapters.getINTEGER_AS_LONG(), null, 1, null)}, CertificateAdapters$basicConstraints$1.INSTANCE, CertificateAdapters$basicConstraints$2.INSTANCE);
        BasicDerAdapter<String> basicDerAdapterWithTag$default = BasicDerAdapter.withTag$default(adapters.getIA5_STRING(), 0, 2L, 1, null);
        generalNameDnsName = basicDerAdapterWithTag$default;
        BasicDerAdapter<C44805o> basicDerAdapterWithTag$default2 = BasicDerAdapter.withTag$default(adapters.getOCTET_STRING(), 0, 7L, 1, null);
        generalNameIpAddress = basicDerAdapterWithTag$default2;
        DerAdapter<Q<DerAdapter<?>, Object>> derAdapterChoice = adapters.choice(basicDerAdapterWithTag$default, basicDerAdapterWithTag$default2, adapters.getANY_VALUE());
        generalName = derAdapterChoice;
        subjectAlternativeName = DerAdapter.DefaultImpls.asSequenceOf$default(derAdapterChoice, null, 0, 0L, 7, null);
        BasicDerAdapter<Object> basicDerAdapterWithExplicitBox = adapters.usingTypeHint(CertificateAdapters$extensionValue$1.INSTANCE).withExplicitBox(adapters.getOCTET_STRING().getTagClass(), adapters.getOCTET_STRING().getTag(), bool);
        extensionValue = basicDerAdapterWithExplicitBox;
        BasicDerAdapter<Extension> basicDerAdapterSequence3 = adapters.sequence("Extension", new DerAdapter[]{adapters.getOBJECT_IDENTIFIER().asTypeHint(), adapters.getBOOLEAN().optional(bool), basicDerAdapterWithExplicitBox}, CertificateAdapters$extension$1.INSTANCE, CertificateAdapters$extension$2.INSTANCE);
        extension = basicDerAdapterSequence3;
        BasicDerAdapter<String> object_identifier = adapters.getOBJECT_IDENTIFIER();
        n0 n0Var = m0.f406844a;
        BasicDerAdapter<AttributeTypeAndValue> basicDerAdapterSequence4 = adapters.sequence("AttributeTypeAndValue", new DerAdapter[]{object_identifier, Adapters.any$default(adapters, new Q[]{new Q(n0Var.b(String.class), adapters.getUTF8_STRING()), new Q(n0Var.b(Void.class), adapters.getPRINTABLE_STRING()), new Q(n0Var.b(AnyValue.class), adapters.getANY_VALUE())}, false, null, 6, null)}, CertificateAdapters$attributeTypeAndValue$1.INSTANCE, CertificateAdapters$attributeTypeAndValue$2.INSTANCE);
        attributeTypeAndValue = basicDerAdapterSequence4;
        BasicDerAdapter<List<List<AttributeTypeAndValue>>> basicDerAdapterAsSequenceOf$default = DerAdapter.DefaultImpls.asSequenceOf$default(basicDerAdapterSequence4.asSetOf(), null, 0, 0L, 7, null);
        rdnSequence = basicDerAdapterAsSequenceOf$default;
        DerAdapter<Q<DerAdapter<?>, Object>> derAdapterChoice2 = adapters.choice(basicDerAdapterAsSequenceOf$default);
        name = derAdapterChoice2;
        BasicDerAdapter<SubjectPublicKeyInfo> basicDerAdapterSequence5 = adapters.sequence("SubjectPublicKeyInfo", new DerAdapter[]{basicDerAdapterSequence2, adapters.getBIT_STRING()}, CertificateAdapters$subjectPublicKeyInfo$1.INSTANCE, CertificateAdapters$subjectPublicKeyInfo$2.INSTANCE);
        subjectPublicKeyInfo = basicDerAdapterSequence5;
        BasicDerAdapter<TbsCertificate> basicDerAdapterSequence6 = adapters.sequence("TBSCertificate", new DerAdapter[]{DerAdapter.DefaultImpls.withExplicitBox$default(adapters.getINTEGER_AS_LONG(), 0, 0L, null, 5, null).optional(0L), adapters.getINTEGER_AS_BIG_INTEGER(), basicDerAdapterSequence2, derAdapterChoice2, basicDerAdapterSequence, derAdapterChoice2, basicDerAdapterSequence5, BasicDerAdapter.optional$default(BasicDerAdapter.withTag$default(adapters.getBIT_STRING(), 0, 1L, 1, null), null, 1, null), BasicDerAdapter.optional$default(BasicDerAdapter.withTag$default(adapters.getBIT_STRING(), 0, 2L, 1, null), null, 1, null), DerAdapter.DefaultImpls.withExplicitBox$default(DerAdapter.DefaultImpls.asSequenceOf$default(basicDerAdapterSequence3, null, 0, 0L, 7, null), 0, 3L, null, 5, null).optional(C42784z0.f406748b)}, CertificateAdapters$tbsCertificate$1.INSTANCE, CertificateAdapters$tbsCertificate$2.INSTANCE);
        tbsCertificate = basicDerAdapterSequence6;
        certificate = adapters.sequence("Certificate", new DerAdapter[]{basicDerAdapterSequence6, basicDerAdapterSequence2, adapters.getBIT_STRING()}, CertificateAdapters$certificate$1.INSTANCE, CertificateAdapters$certificate$2.INSTANCE);
        privateKeyInfo = adapters.sequence("PrivateKeyInfo", new DerAdapter[]{adapters.getINTEGER_AS_LONG(), basicDerAdapterSequence2, adapters.getOCTET_STRING()}, CertificateAdapters$privateKeyInfo$1.INSTANCE, CertificateAdapters$privateKeyInfo$2.INSTANCE);
    }

    private CertificateAdapters() {
    }

    @k
    public final BasicDerAdapter<AlgorithmIdentifier> getAlgorithmIdentifier$okhttp_tls() {
        return algorithmIdentifier;
    }

    @k
    public final BasicDerAdapter<Certificate> getCertificate$okhttp_tls() {
        return certificate;
    }

    @k
    public final BasicDerAdapter<Extension> getExtension$okhttp_tls() {
        return extension;
    }

    @k
    public final DerAdapter<Q<DerAdapter<?>, Object>> getGeneralName$okhttp_tls() {
        return generalName;
    }

    @k
    public final BasicDerAdapter<String> getGeneralNameDnsName$okhttp_tls() {
        return generalNameDnsName;
    }

    @k
    public final BasicDerAdapter<C44805o> getGeneralNameIpAddress$okhttp_tls() {
        return generalNameIpAddress;
    }

    @k
    public final DerAdapter<Q<DerAdapter<?>, Object>> getName$okhttp_tls() {
        return name;
    }

    @k
    public final BasicDerAdapter<PrivateKeyInfo> getPrivateKeyInfo$okhttp_tls() {
        return privateKeyInfo;
    }

    @k
    public final BasicDerAdapter<List<List<AttributeTypeAndValue>>> getRdnSequence$okhttp_tls() {
        return rdnSequence;
    }

    @k
    public final BasicDerAdapter<SubjectPublicKeyInfo> getSubjectPublicKeyInfo$okhttp_tls() {
        return subjectPublicKeyInfo;
    }

    @k
    public final BasicDerAdapter<TbsCertificate> getTbsCertificate$okhttp_tls() {
        return tbsCertificate;
    }

    @k
    public final DerAdapter<Long> getTime$okhttp_tls() {
        return time;
    }
}
