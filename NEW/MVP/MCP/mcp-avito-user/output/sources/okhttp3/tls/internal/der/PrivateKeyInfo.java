package okhttp3.tls.internal.der;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import okio.C44805o;

/* compiled from: certificates.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lokhttp3/tls/internal/der/PrivateKeyInfo;", "", "", "version", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "algorithmIdentifier", "Lokio/o;", "privateKey", "<init>", "(JLokhttp3/tls/internal/der/AlgorithmIdentifier;Lokio/o;)V", "", "hashCode", "()I", "component1", "()J", "component2", "()Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "component3", "()Lokio/o;", "copy", "(JLokhttp3/tls/internal/der/AlgorithmIdentifier;Lokio/o;)Lokhttp3/tls/internal/der/PrivateKeyInfo;", "", "toString", "()Ljava/lang/String;", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "J", "getVersion", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "getAlgorithmIdentifier", "Lokio/o;", "getPrivateKey", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PrivateKeyInfo {

    @k
    private final AlgorithmIdentifier algorithmIdentifier;

    @k
    private final C44805o privateKey;
    private final long version;

    public PrivateKeyInfo(long j12, @k AlgorithmIdentifier algorithmIdentifier, @k C44805o c44805o) {
        this.version = j12;
        this.algorithmIdentifier = algorithmIdentifier;
        this.privateKey = c44805o;
    }

    public static /* synthetic */ PrivateKeyInfo copy$default(PrivateKeyInfo privateKeyInfo, long j12, AlgorithmIdentifier algorithmIdentifier, C44805o c44805o, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = privateKeyInfo.version;
        }
        if ((i12 & 2) != 0) {
            algorithmIdentifier = privateKeyInfo.algorithmIdentifier;
        }
        if ((i12 & 4) != 0) {
            c44805o = privateKeyInfo.privateKey;
        }
        return privateKeyInfo.copy(j12, algorithmIdentifier, c44805o);
    }

    /* renamed from: component1, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final C44805o getPrivateKey() {
        return this.privateKey;
    }

    @k
    public final PrivateKeyInfo copy(long version, @k AlgorithmIdentifier algorithmIdentifier, @k C44805o privateKey) {
        return new PrivateKeyInfo(version, algorithmIdentifier, privateKey);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivateKeyInfo)) {
            return false;
        }
        PrivateKeyInfo privateKeyInfo = (PrivateKeyInfo) other;
        return this.version == privateKeyInfo.version && L.f(this.algorithmIdentifier, privateKeyInfo.algorithmIdentifier) && L.f(this.privateKey, privateKeyInfo.privateKey);
    }

    @k
    public final AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    @k
    public final C44805o getPrivateKey() {
        return this.privateKey;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.privateKey.hashCode() + ((this.algorithmIdentifier.hashCode() + (((int) this.version) * 31)) * 31);
    }

    @k
    public String toString() {
        return "PrivateKeyInfo(version=" + this.version + ", algorithmIdentifier=" + this.algorithmIdentifier + ", privateKey=" + this.privateKey + ')';
    }
}
