package okhttp3.tls.internal.der;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: certificates.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "", "algorithm", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "subjectPublicKey", "Lokhttp3/tls/internal/der/BitString;", "(Lokhttp3/tls/internal/der/AlgorithmIdentifier;Lokhttp3/tls/internal/der/BitString;)V", "getAlgorithm", "()Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "getSubjectPublicKey", "()Lokhttp3/tls/internal/der/BitString;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SubjectPublicKeyInfo {

    @k
    private final AlgorithmIdentifier algorithm;

    @k
    private final BitString subjectPublicKey;

    public SubjectPublicKeyInfo(@k AlgorithmIdentifier algorithmIdentifier, @k BitString bitString) {
        this.algorithm = algorithmIdentifier;
        this.subjectPublicKey = bitString;
    }

    public static /* synthetic */ SubjectPublicKeyInfo copy$default(SubjectPublicKeyInfo subjectPublicKeyInfo, AlgorithmIdentifier algorithmIdentifier, BitString bitString, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            algorithmIdentifier = subjectPublicKeyInfo.algorithm;
        }
        if ((i12 & 2) != 0) {
            bitString = subjectPublicKeyInfo.subjectPublicKey;
        }
        return subjectPublicKeyInfo.copy(algorithmIdentifier, bitString);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AlgorithmIdentifier getAlgorithm() {
        return this.algorithm;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final BitString getSubjectPublicKey() {
        return this.subjectPublicKey;
    }

    @k
    public final SubjectPublicKeyInfo copy(@k AlgorithmIdentifier algorithm, @k BitString subjectPublicKey) {
        return new SubjectPublicKeyInfo(algorithm, subjectPublicKey);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubjectPublicKeyInfo)) {
            return false;
        }
        SubjectPublicKeyInfo subjectPublicKeyInfo = (SubjectPublicKeyInfo) other;
        return L.f(this.algorithm, subjectPublicKeyInfo.algorithm) && L.f(this.subjectPublicKey, subjectPublicKeyInfo.subjectPublicKey);
    }

    @k
    public final AlgorithmIdentifier getAlgorithm() {
        return this.algorithm;
    }

    @k
    public final BitString getSubjectPublicKey() {
        return this.subjectPublicKey;
    }

    public int hashCode() {
        return this.subjectPublicKey.hashCode() + (this.algorithm.hashCode() * 31);
    }

    @k
    public String toString() {
        return "SubjectPublicKeyInfo(algorithm=" + this.algorithm + ", subjectPublicKey=" + this.subjectPublicKey + ')';
    }
}
