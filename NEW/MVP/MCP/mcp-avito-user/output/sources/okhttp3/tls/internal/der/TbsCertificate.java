package okhttp3.tls.internal.der;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import java.math.BigInteger;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: certificates.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\t\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\t¢\u0006\u0002\u0010\u0015J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140\tHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\u0015\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\tHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\u0015\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\tHÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u008f\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\tHÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u00109\u001a\u00020:H\u0016J\t\u0010;\u001a\u00020 HÖ\u0001R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006<"}, d2 = {"Lokhttp3/tls/internal/der/TbsCertificate;", "", "version", "", "serialNumber", "Ljava/math/BigInteger;", "signature", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "issuer", "", "Lokhttp3/tls/internal/der/AttributeTypeAndValue;", "validity", "Lokhttp3/tls/internal/der/Validity;", "subject", "subjectPublicKeyInfo", "Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "issuerUniqueID", "Lokhttp3/tls/internal/der/BitString;", "subjectUniqueID", AttachMenuItem.File.EXTENSIONS, "Lokhttp3/tls/internal/der/Extension;", "(JLjava/math/BigInteger;Lokhttp3/tls/internal/der/AlgorithmIdentifier;Ljava/util/List;Lokhttp3/tls/internal/der/Validity;Ljava/util/List;Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;Lokhttp3/tls/internal/der/BitString;Lokhttp3/tls/internal/der/BitString;Ljava/util/List;)V", "getExtensions", "()Ljava/util/List;", "getIssuer", "getIssuerUniqueID", "()Lokhttp3/tls/internal/der/BitString;", "getSerialNumber", "()Ljava/math/BigInteger;", "getSignature", "()Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "signatureAlgorithmName", "", "getSignatureAlgorithmName", "()Ljava/lang/String;", "getSubject", "getSubjectPublicKeyInfo", "()Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "getSubjectUniqueID", "getValidity", "()Lokhttp3/tls/internal/der/Validity;", "getVersion", "()J", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TbsCertificate {

    @k
    private final List<Extension> extensions;

    @k
    private final List<List<AttributeTypeAndValue>> issuer;

    @l
    private final BitString issuerUniqueID;

    @k
    private final BigInteger serialNumber;

    @k
    private final AlgorithmIdentifier signature;

    @k
    private final List<List<AttributeTypeAndValue>> subject;

    @k
    private final SubjectPublicKeyInfo subjectPublicKeyInfo;

    @l
    private final BitString subjectUniqueID;

    @k
    private final Validity validity;
    private final long version;

    /* JADX WARN: Multi-variable type inference failed */
    public TbsCertificate(long j12, @k BigInteger bigInteger, @k AlgorithmIdentifier algorithmIdentifier, @k List<? extends List<AttributeTypeAndValue>> list, @k Validity validity, @k List<? extends List<AttributeTypeAndValue>> list2, @k SubjectPublicKeyInfo subjectPublicKeyInfo, @l BitString bitString, @l BitString bitString2, @k List<Extension> list3) {
        this.version = j12;
        this.serialNumber = bigInteger;
        this.signature = algorithmIdentifier;
        this.issuer = list;
        this.validity = validity;
        this.subject = list2;
        this.subjectPublicKeyInfo = subjectPublicKeyInfo;
        this.issuerUniqueID = bitString;
        this.subjectUniqueID = bitString2;
        this.extensions = list3;
    }

    /* renamed from: component1, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    @k
    public final List<Extension> component10() {
        return this.extensions;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final BigInteger getSerialNumber() {
        return this.serialNumber;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final AlgorithmIdentifier getSignature() {
        return this.signature;
    }

    @k
    public final List<List<AttributeTypeAndValue>> component4() {
        return this.issuer;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final Validity getValidity() {
        return this.validity;
    }

    @k
    public final List<List<AttributeTypeAndValue>> component6() {
        return this.subject;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.subjectPublicKeyInfo;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final BitString getIssuerUniqueID() {
        return this.issuerUniqueID;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final BitString getSubjectUniqueID() {
        return this.subjectUniqueID;
    }

    @k
    public final TbsCertificate copy(long version, @k BigInteger serialNumber, @k AlgorithmIdentifier signature, @k List<? extends List<AttributeTypeAndValue>> issuer, @k Validity validity, @k List<? extends List<AttributeTypeAndValue>> subject, @k SubjectPublicKeyInfo subjectPublicKeyInfo, @l BitString issuerUniqueID, @l BitString subjectUniqueID, @k List<Extension> extensions) {
        return new TbsCertificate(version, serialNumber, signature, issuer, validity, subject, subjectPublicKeyInfo, issuerUniqueID, subjectUniqueID, extensions);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TbsCertificate)) {
            return false;
        }
        TbsCertificate tbsCertificate = (TbsCertificate) other;
        return this.version == tbsCertificate.version && L.f(this.serialNumber, tbsCertificate.serialNumber) && L.f(this.signature, tbsCertificate.signature) && L.f(this.issuer, tbsCertificate.issuer) && L.f(this.validity, tbsCertificate.validity) && L.f(this.subject, tbsCertificate.subject) && L.f(this.subjectPublicKeyInfo, tbsCertificate.subjectPublicKeyInfo) && L.f(this.issuerUniqueID, tbsCertificate.issuerUniqueID) && L.f(this.subjectUniqueID, tbsCertificate.subjectUniqueID) && L.f(this.extensions, tbsCertificate.extensions);
    }

    @k
    public final List<Extension> getExtensions() {
        return this.extensions;
    }

    @k
    public final List<List<AttributeTypeAndValue>> getIssuer() {
        return this.issuer;
    }

    @l
    public final BitString getIssuerUniqueID() {
        return this.issuerUniqueID;
    }

    @k
    public final BigInteger getSerialNumber() {
        return this.serialNumber;
    }

    @k
    public final AlgorithmIdentifier getSignature() {
        return this.signature;
    }

    @k
    public final String getSignatureAlgorithmName() {
        String algorithm = this.signature.getAlgorithm();
        if (L.f(algorithm, ObjectIdentifiers.sha256WithRSAEncryption)) {
            return "SHA256WithRSA";
        }
        if (L.f(algorithm, ObjectIdentifiers.sha256withEcdsa)) {
            return "SHA256withECDSA";
        }
        throw new IllegalStateException(("unexpected signature algorithm: " + this.signature.getAlgorithm()).toString());
    }

    @k
    public final List<List<AttributeTypeAndValue>> getSubject() {
        return this.subject;
    }

    @k
    public final SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.subjectPublicKeyInfo;
    }

    @l
    public final BitString getSubjectUniqueID() {
        return this.subjectUniqueID;
    }

    @k
    public final Validity getValidity() {
        return this.validity;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = (this.subjectPublicKeyInfo.hashCode() + H.e((this.validity.hashCode() + H.e((this.signature.hashCode() + ((this.serialNumber.hashCode() + (((int) this.version) * 31)) * 31)) * 31, 31, this.issuer)) * 31, 31, this.subject)) * 31;
        BitString bitString = this.issuerUniqueID;
        int iHashCode2 = (iHashCode + (bitString != null ? bitString.hashCode() : 0)) * 31;
        BitString bitString2 = this.subjectUniqueID;
        return this.extensions.hashCode() + ((iHashCode2 + (bitString2 != null ? bitString2.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TbsCertificate(version=");
        sb2.append(this.version);
        sb2.append(", serialNumber=");
        sb2.append(this.serialNumber);
        sb2.append(", signature=");
        sb2.append(this.signature);
        sb2.append(", issuer=");
        sb2.append(this.issuer);
        sb2.append(", validity=");
        sb2.append(this.validity);
        sb2.append(", subject=");
        sb2.append(this.subject);
        sb2.append(", subjectPublicKeyInfo=");
        sb2.append(this.subjectPublicKeyInfo);
        sb2.append(", issuerUniqueID=");
        sb2.append(this.issuerUniqueID);
        sb2.append(", subjectUniqueID=");
        sb2.append(this.subjectUniqueID);
        sb2.append(", extensions=");
        return H.p(sb2, this.extensions, ')');
    }
}
