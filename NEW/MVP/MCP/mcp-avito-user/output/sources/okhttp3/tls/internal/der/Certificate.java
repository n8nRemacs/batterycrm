package okhttp3.tls.internal.der;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okio.C44802l;
import okio.C44802l.b;
import okio.C44805o;

/* compiled from: certificates.kt */
@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J'\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0006\u0010(\u001a\u00020)R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, d2 = {"Lokhttp3/tls/internal/der/Certificate;", "", "tbsCertificate", "Lokhttp3/tls/internal/der/TbsCertificate;", "signatureAlgorithm", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "signatureValue", "Lokhttp3/tls/internal/der/BitString;", "(Lokhttp3/tls/internal/der/TbsCertificate;Lokhttp3/tls/internal/der/AlgorithmIdentifier;Lokhttp3/tls/internal/der/BitString;)V", "basicConstraints", "Lokhttp3/tls/internal/der/Extension;", "getBasicConstraints", "()Lokhttp3/tls/internal/der/Extension;", "commonName", "getCommonName", "()Ljava/lang/Object;", "organizationalUnitName", "getOrganizationalUnitName", "getSignatureAlgorithm", "()Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "getSignatureValue", "()Lokhttp3/tls/internal/der/BitString;", "subjectAlternativeNames", "getSubjectAlternativeNames", "getTbsCertificate", "()Lokhttp3/tls/internal/der/TbsCertificate;", "checkSignature", "", "issuer", "Ljava/security/PublicKey;", "component1", "component2", "component3", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "", "toX509Certificate", "Ljava/security/cert/X509Certificate;", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Certificate {

    @k
    private final AlgorithmIdentifier signatureAlgorithm;

    @k
    private final BitString signatureValue;

    @k
    private final TbsCertificate tbsCertificate;

    public Certificate(@k TbsCertificate tbsCertificate, @k AlgorithmIdentifier algorithmIdentifier, @k BitString bitString) {
        this.tbsCertificate = tbsCertificate;
        this.signatureAlgorithm = algorithmIdentifier;
        this.signatureValue = bitString;
    }

    public static /* synthetic */ Certificate copy$default(Certificate certificate, TbsCertificate tbsCertificate, AlgorithmIdentifier algorithmIdentifier, BitString bitString, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            tbsCertificate = certificate.tbsCertificate;
        }
        if ((i12 & 2) != 0) {
            algorithmIdentifier = certificate.signatureAlgorithm;
        }
        if ((i12 & 4) != 0) {
            bitString = certificate.signatureValue;
        }
        return certificate.copy(tbsCertificate, algorithmIdentifier, bitString);
    }

    public final boolean checkSignature(@k PublicKey issuer) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        C44805o der = CertificateAdapters.INSTANCE.getTbsCertificate$okhttp_tls().toDer(this.tbsCertificate);
        Signature signature = Signature.getInstance(this.tbsCertificate.getSignatureAlgorithmName());
        signature.initVerify(issuer);
        signature.update(der.s());
        return signature.verify(this.signatureValue.getByteString().s());
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final TbsCertificate getTbsCertificate() {
        return this.tbsCertificate;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AlgorithmIdentifier getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final BitString getSignatureValue() {
        return this.signatureValue;
    }

    @k
    public final Certificate copy(@k TbsCertificate tbsCertificate, @k AlgorithmIdentifier signatureAlgorithm, @k BitString signatureValue) {
        return new Certificate(tbsCertificate, signatureAlgorithm, signatureValue);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Certificate)) {
            return false;
        }
        Certificate certificate = (Certificate) other;
        return L.f(this.tbsCertificate, certificate.tbsCertificate) && L.f(this.signatureAlgorithm, certificate.signatureAlgorithm) && L.f(this.signatureValue, certificate.signatureValue);
    }

    @k
    public final Extension getBasicConstraints() {
        for (Extension extension : this.tbsCertificate.getExtensions()) {
            if (L.f(extension.getId(), ObjectIdentifiers.basicConstraints)) {
                return extension;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @l
    public final Object getCommonName() {
        Object next;
        Iterator it = C42745f0.H(this.tbsCertificate.getSubject()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((AttributeTypeAndValue) next).getType(), ObjectIdentifiers.commonName)) {
                break;
            }
        }
        AttributeTypeAndValue attributeTypeAndValue = (AttributeTypeAndValue) next;
        if (attributeTypeAndValue != null) {
            return attributeTypeAndValue.getValue();
        }
        return null;
    }

    @l
    public final Object getOrganizationalUnitName() {
        Object next;
        Iterator it = C42745f0.H(this.tbsCertificate.getSubject()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((AttributeTypeAndValue) next).getType(), ObjectIdentifiers.organizationalUnitName)) {
                break;
            }
        }
        AttributeTypeAndValue attributeTypeAndValue = (AttributeTypeAndValue) next;
        if (attributeTypeAndValue != null) {
            return attributeTypeAndValue.getValue();
        }
        return null;
    }

    @k
    public final AlgorithmIdentifier getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    @k
    public final BitString getSignatureValue() {
        return this.signatureValue;
    }

    @l
    public final Extension getSubjectAlternativeNames() {
        Object next;
        Iterator<T> it = this.tbsCertificate.getExtensions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((Extension) next).getId(), ObjectIdentifiers.subjectAlternativeName)) {
                break;
            }
        }
        return (Extension) next;
    }

    @k
    public final TbsCertificate getTbsCertificate() {
        return this.tbsCertificate;
    }

    public int hashCode() {
        return this.signatureValue.hashCode() + ((this.signatureAlgorithm.hashCode() + (this.tbsCertificate.hashCode() * 31)) * 31);
    }

    @k
    public String toString() {
        return "Certificate(tbsCertificate=" + this.tbsCertificate + ", signatureAlgorithm=" + this.signatureAlgorithm + ", signatureValue=" + this.signatureValue + ')';
    }

    @k
    public final X509Certificate toX509Certificate() throws CertificateException {
        C44805o der = CertificateAdapters.INSTANCE.getCertificate$okhttp_tls().toDer(this);
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            C44802l c44802l = new C44802l();
            c44802l.B(der);
            return (X509Certificate) C42745f0.t0(certificateFactory.generateCertificates(c44802l.new b()));
        } catch (IllegalArgumentException e12) {
            throw new IllegalArgumentException("failed to decode certificate", e12);
        } catch (GeneralSecurityException e13) {
            throw new IllegalArgumentException("failed to decode certificate", e13);
        } catch (NoSuchElementException e14) {
            throw new IllegalArgumentException("failed to decode certificate", e14);
        }
    }
}
