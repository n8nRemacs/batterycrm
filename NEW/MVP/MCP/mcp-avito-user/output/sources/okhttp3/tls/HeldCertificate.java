package okhttp3.tls;

import AK.c;
import X41.i;
import X41.n;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import java.math.BigInteger;
import java.net.InetAddress;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.InterfaceC43057n;
import okhttp3.internal.Util;
import okhttp3.tls.internal.der.AlgorithmIdentifier;
import okhttp3.tls.internal.der.AttributeTypeAndValue;
import okhttp3.tls.internal.der.BasicConstraints;
import okhttp3.tls.internal.der.BasicDerAdapter;
import okhttp3.tls.internal.der.BitString;
import okhttp3.tls.internal.der.Certificate;
import okhttp3.tls.internal.der.CertificateAdapters;
import okhttp3.tls.internal.der.Extension;
import okhttp3.tls.internal.der.ObjectIdentifiers;
import okhttp3.tls.internal.der.SubjectPublicKeyInfo;
import okhttp3.tls.internal.der.TbsCertificate;
import okhttp3.tls.internal.der.Validity;
import okio.C44805o;

/* compiled from: HeldCertificate.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\f¨\u0006\u0018"}, d2 = {"Lokhttp3/tls/HeldCertificate;", "", "Ljava/security/KeyPair;", "keyPair", "Ljava/security/cert/X509Certificate;", "certificate", "<init>", "(Ljava/security/KeyPair;Ljava/security/cert/X509Certificate;)V", "Lokio/o;", "pkcs1Bytes", "()Lokio/o;", "-deprecated_certificate", "()Ljava/security/cert/X509Certificate;", "-deprecated_keyPair", "()Ljava/security/KeyPair;", "", "certificatePem", "()Ljava/lang/String;", "privateKeyPkcs8Pem", "privateKeyPkcs1Pem", "Ljava/security/KeyPair;", "Ljava/security/cert/X509Certificate;", "Companion", "Builder", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HeldCertificate {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private static final C43059p PEM_REGEX = new C43059p("-----BEGIN ([!-,.-~ ]*)-----([^-]*)-----END \\1-----");

    @k
    private final X509Certificate certificate;

    @k
    private final KeyPair keyPair;

    /* compiled from: HeldCertificate.kt */
    @s0
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0005J\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0005J\u0016\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0000J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004H\u0002J\b\u0010 \u001a\u00020\tH\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0005J\u0006\u0010&\u001a\u00020\u0000J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eJ\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0014\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0+H\u0002J\b\u0010-\u001a\u00020.H\u0002J\u0016\u0010/\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lokhttp3/tls/HeldCertificate$Builder;", "", "()V", "altNames", "", "", "commonName", "keyAlgorithm", "keyPair", "Ljava/security/KeyPair;", "keySize", "", "maxIntermediateCas", "notAfter", "", "notBefore", "organizationalUnit", "serialNumber", "Ljava/math/BigInteger;", "signedBy", "Lokhttp3/tls/HeldCertificate;", "addSubjectAlternativeName", "altName", "build", "certificateAuthority", "cn", "duration", "unit", "Ljava/util/concurrent/TimeUnit;", "ecdsa256", AttachMenuItem.File.EXTENSIONS, "Lokhttp3/tls/internal/der/Extension;", "generateKeyPair", "publicKey", "Ljava/security/PublicKey;", "privateKey", "Ljava/security/PrivateKey;", "ou", "rsa2048", "signatureAlgorithm", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "signedByKeyPair", "subject", "", "Lokhttp3/tls/internal/der/AttributeTypeAndValue;", "validity", "Lokhttp3/tls/internal/der/Validity;", "validityInterval", "Companion", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private static final long DEFAULT_DURATION_MILLIS = 86400000;

        @l
        private String commonName;

        @l
        private String keyAlgorithm;

        @l
        private KeyPair keyPair;
        private int keySize;

        @l
        private String organizationalUnit;

        @l
        private BigInteger serialNumber;

        @l
        private HeldCertificate signedBy;
        private long notBefore = -1;
        private long notAfter = -1;

        @k
        private final List<String> altNames = new ArrayList();
        private int maxIntermediateCas = -1;

        public Builder() {
            ecdsa256();
        }

        private final List<Extension> extensions() {
            ArrayList arrayList = new ArrayList();
            int i12 = this.maxIntermediateCas;
            if (i12 != -1) {
                arrayList.add(new Extension(ObjectIdentifiers.basicConstraints, true, new BasicConstraints(true, Long.valueOf(i12))));
            }
            if (!this.altNames.isEmpty()) {
                List<String> list = this.altNames;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
                for (String str : list) {
                    arrayList2.add(Util.canParseAsIpAddress(str) ? new Q(CertificateAdapters.INSTANCE.getGeneralNameIpAddress$okhttp_tls(), C44805o.a.d(C44805o.f420139e, InetAddress.getByName(str).getAddress())) : new Q(CertificateAdapters.INSTANCE.getGeneralNameDnsName$okhttp_tls(), str));
                }
                arrayList.add(new Extension(ObjectIdentifiers.subjectAlternativeName, true, arrayList2));
            }
            return arrayList;
        }

        private final KeyPair generateKeyPair() throws NoSuchAlgorithmException {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(this.keyAlgorithm);
            keyPairGenerator.initialize(this.keySize, new SecureRandom());
            return keyPairGenerator.generateKeyPair();
        }

        private final AlgorithmIdentifier signatureAlgorithm(KeyPair signedByKeyPair) {
            return signedByKeyPair.getPrivate() instanceof RSAPrivateKey ? new AlgorithmIdentifier(ObjectIdentifiers.sha256WithRSAEncryption, null) : new AlgorithmIdentifier(ObjectIdentifiers.sha256withEcdsa, C44805o.f420140f);
        }

        private final List<List<AttributeTypeAndValue>> subject() {
            ArrayList arrayList = new ArrayList();
            String str = this.organizationalUnit;
            if (str != null) {
                arrayList.add(Collections.singletonList(new AttributeTypeAndValue(ObjectIdentifiers.organizationalUnitName, str)));
            }
            String string = this.commonName;
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            arrayList.add(Collections.singletonList(new AttributeTypeAndValue(ObjectIdentifiers.commonName, string)));
            return arrayList;
        }

        private final Validity validity() {
            long jCurrentTimeMillis = this.notBefore;
            if (jCurrentTimeMillis == -1) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            long j12 = this.notAfter;
            if (j12 == -1) {
                j12 = jCurrentTimeMillis + DEFAULT_DURATION_MILLIS;
            }
            return new Validity(jCurrentTimeMillis, j12);
        }

        @k
        public final Builder addSubjectAlternativeName(@k String altName) {
            this.altNames.add(altName);
            return this;
        }

        @k
        public final HeldCertificate build() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
            KeyPair keyPair;
            List<List<AttributeTypeAndValue>> listFromDer;
            KeyPair keyPairGenerateKeyPair = this.keyPair;
            if (keyPairGenerateKeyPair == null) {
                keyPairGenerateKeyPair = generateKeyPair();
            }
            CertificateAdapters certificateAdapters = CertificateAdapters.INSTANCE;
            BasicDerAdapter<SubjectPublicKeyInfo> subjectPublicKeyInfo$okhttp_tls = certificateAdapters.getSubjectPublicKeyInfo$okhttp_tls();
            C44805o.a aVar = C44805o.f420139e;
            SubjectPublicKeyInfo subjectPublicKeyInfoFromDer = subjectPublicKeyInfo$okhttp_tls.fromDer(C44805o.a.d(aVar, keyPairGenerateKeyPair.getPublic().getEncoded()));
            List<List<AttributeTypeAndValue>> listSubject = subject();
            HeldCertificate heldCertificate = this.signedBy;
            if (heldCertificate != null) {
                keyPair = heldCertificate.keyPair();
                listFromDer = certificateAdapters.getRdnSequence$okhttp_tls().fromDer(C44805o.a.d(aVar, this.signedBy.certificate().getSubjectX500Principal().getEncoded()));
            } else {
                keyPair = keyPairGenerateKeyPair;
                listFromDer = listSubject;
            }
            AlgorithmIdentifier algorithmIdentifierSignatureAlgorithm = signatureAlgorithm(keyPair);
            BigInteger bigInteger = this.serialNumber;
            if (bigInteger == null) {
                bigInteger = BigInteger.ONE;
            }
            TbsCertificate tbsCertificate = new TbsCertificate(2L, bigInteger, algorithmIdentifierSignatureAlgorithm, listFromDer, validity(), listSubject, subjectPublicKeyInfoFromDer, null, null, extensions());
            Signature signature = Signature.getInstance(tbsCertificate.getSignatureAlgorithmName());
            signature.initSign(keyPair.getPrivate());
            signature.update(certificateAdapters.getTbsCertificate$okhttp_tls().toDer(tbsCertificate).s());
            return new HeldCertificate(keyPairGenerateKeyPair, new Certificate(tbsCertificate, algorithmIdentifierSignatureAlgorithm, new BitString(C44805o.a.d(aVar, signature.sign()), 0)).toX509Certificate());
        }

        @k
        public final Builder certificateAuthority(int maxIntermediateCas) {
            if (maxIntermediateCas < 0) {
                throw new IllegalArgumentException(c.g(maxIntermediateCas, "maxIntermediateCas < 0: ").toString());
            }
            this.maxIntermediateCas = maxIntermediateCas;
            return this;
        }

        @k
        public final Builder commonName(@k String cn2) {
            this.commonName = cn2;
            return this;
        }

        @k
        public final Builder duration(long duration, @k TimeUnit unit) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            validityInterval(jCurrentTimeMillis, unit.toMillis(duration) + jCurrentTimeMillis);
            return this;
        }

        @k
        public final Builder ecdsa256() {
            this.keyAlgorithm = "EC";
            this.keySize = 256;
            return this;
        }

        @k
        public final Builder keyPair(@k KeyPair keyPair) {
            this.keyPair = keyPair;
            return this;
        }

        @k
        public final Builder organizationalUnit(@k String ou2) {
            this.organizationalUnit = ou2;
            return this;
        }

        @k
        public final Builder rsa2048() {
            this.keyAlgorithm = "RSA";
            this.keySize = 2048;
            return this;
        }

        @k
        public final Builder serialNumber(@k BigInteger serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        @k
        public final Builder signedBy(@l HeldCertificate signedBy) {
            this.signedBy = signedBy;
            return this;
        }

        @k
        public final Builder validityInterval(long notBefore, long notAfter) {
            if (notBefore <= notAfter) {
                if ((notBefore == -1) == (notAfter == -1)) {
                    this.notBefore = notBefore;
                    this.notAfter = notAfter;
                    return this;
                }
            }
            StringBuilder sbQ = H.q(notBefore, "invalid interval: ", "..");
            sbQ.append(notAfter);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }

        @k
        public final Builder keyPair(@k PublicKey publicKey, @k PrivateKey privateKey) {
            keyPair(new KeyPair(publicKey, privateKey));
            return this;
        }

        @k
        public final Builder serialNumber(long serialNumber) {
            serialNumber(BigInteger.valueOf(serialNumber));
            return this;
        }
    }

    /* compiled from: HeldCertificate.kt */
    @s0
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lokhttp3/tls/HeldCertificate$Companion;", "", "<init>", "()V", "", "certificatePem", "pkcs8Base64Text", "Lokhttp3/tls/HeldCertificate;", "decode", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/tls/HeldCertificate;", "Lokio/o;", "data", "keyAlgorithm", "Ljava/security/PrivateKey;", "decodePkcs8", "(Lokio/o;Ljava/lang/String;)Ljava/security/PrivateKey;", "certificateAndPrivateKeyPem", "(Ljava/lang/String;)Lokhttp3/tls/HeldCertificate;", "Lkotlin/text/p;", "PEM_REGEX", "Lkotlin/text/p;", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private final PrivateKey decodePkcs8(C44805o data, String keyAlgorithm) {
            try {
                return KeyFactory.getInstance(keyAlgorithm).generatePrivate(new PKCS8EncodedKeySpec(data.s()));
            } catch (GeneralSecurityException e12) {
                throw new IllegalArgumentException("failed to decode private key", e12);
            }
        }

        @n
        @k
        public final HeldCertificate decode(@k String certificateAndPrivateKeyPem) {
            String str = null;
            String str2 = null;
            for (InterfaceC43057n interfaceC43057n : C43059p.c(HeldCertificate.PEM_REGEX, certificateAndPrivateKeyPem)) {
                String str3 = interfaceC43057n.getF410617c().a(1).f410612a;
                if (str3.equals("CERTIFICATE")) {
                    if (str != null) {
                        throw new IllegalArgumentException("string includes multiple certificates");
                    }
                    str = interfaceC43057n.getF410617c().a(0).f410612a;
                } else {
                    if (!str3.equals("PRIVATE KEY")) {
                        throw new IllegalArgumentException("unexpected type: ".concat(str3));
                    }
                    if (str2 != null) {
                        throw new IllegalArgumentException("string includes multiple private keys");
                    }
                    str2 = interfaceC43057n.getF410617c().a(2).f410612a;
                }
            }
            if (str == null) {
                throw new IllegalArgumentException("string does not include a certificate");
            }
            if (str2 != null) {
                return decode(str, str2);
            }
            throw new IllegalArgumentException("string does not include a private key");
        }

        private Companion() {
        }

        private final HeldCertificate decode(String certificatePem, String pkcs8Base64Text) {
            String str;
            X509Certificate x509CertificateDecodeCertificatePem = Certificates.decodeCertificatePem(certificatePem);
            C44805o.f420139e.getClass();
            C44805o c44805oA = C44805o.a.a(pkcs8Base64Text);
            if (c44805oA != null) {
                PublicKey publicKey = x509CertificateDecodeCertificatePem.getPublicKey();
                if (publicKey instanceof ECPublicKey) {
                    str = "EC";
                } else {
                    if (!(publicKey instanceof RSAPublicKey)) {
                        throw new IllegalArgumentException("unexpected key type: " + x509CertificateDecodeCertificatePem.getPublicKey());
                    }
                    str = "RSA";
                }
                return new HeldCertificate(new KeyPair(x509CertificateDecodeCertificatePem.getPublicKey(), decodePkcs8(c44805oA, str)), x509CertificateDecodeCertificatePem);
            }
            throw new IllegalArgumentException("failed to decode private key");
        }
    }

    public HeldCertificate(@k KeyPair keyPair, @k X509Certificate x509Certificate) {
        this.keyPair = keyPair;
        this.certificate = x509Certificate;
    }

    @n
    @k
    public static final HeldCertificate decode(@k String str) {
        return INSTANCE.decode(str);
    }

    private final C44805o pkcs1Bytes() {
        return CertificateAdapters.INSTANCE.getPrivateKeyInfo$okhttp_tls().fromDer(C44805o.a.d(C44805o.f420139e, this.keyPair.getPrivate().getEncoded())).getPrivateKey();
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_certificate, reason: not valid java name and from getter */
    public final X509Certificate getCertificate() {
        return this.certificate;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_keyPair, reason: not valid java name and from getter */
    public final KeyPair getKeyPair() {
        return this.keyPair;
    }

    @i
    @k
    public final X509Certificate certificate() {
        return this.certificate;
    }

    @k
    public final String certificatePem() {
        return Certificates.certificatePem(this.certificate);
    }

    @i
    @k
    public final KeyPair keyPair() {
        return this.keyPair;
    }

    @k
    public final String privateKeyPkcs1Pem() {
        if (!(this.keyPair.getPrivate() instanceof RSAPrivateKey)) {
            throw new IllegalStateException("PKCS1 only supports RSA keys");
        }
        StringBuilder sbR = H.r("-----BEGIN RSA PRIVATE KEY-----\n");
        Certificates.encodeBase64Lines(sbR, pkcs1Bytes());
        sbR.append("-----END RSA PRIVATE KEY-----\n");
        return sbR.toString();
    }

    @k
    public final String privateKeyPkcs8Pem() {
        StringBuilder sbR = H.r("-----BEGIN PRIVATE KEY-----\n");
        Certificates.encodeBase64Lines(sbR, C44805o.a.d(C44805o.f420139e, this.keyPair.getPrivate().getEncoded()));
        sbR.append("-----END PRIVATE KEY-----\n");
        return sbR.toString();
    }
}
