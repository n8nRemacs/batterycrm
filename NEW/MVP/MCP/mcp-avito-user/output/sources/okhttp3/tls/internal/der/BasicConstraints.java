package okhttp3.tls.internal.der;

import Y61.k;
import Y61.l;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: certificates.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lokhttp3/tls/internal/der/BasicConstraints;", "", "ca", "", "maxIntermediateCas", "", "(ZLjava/lang/Long;)V", "getCa", "()Z", "getMaxIntermediateCas", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(ZLjava/lang/Long;)Lokhttp3/tls/internal/der/BasicConstraints;", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BasicConstraints {
    private final boolean ca;

    @l
    private final Long maxIntermediateCas;

    public BasicConstraints(boolean z12, @l Long l12) {
        this.ca = z12;
        this.maxIntermediateCas = l12;
    }

    public static /* synthetic */ BasicConstraints copy$default(BasicConstraints basicConstraints, boolean z12, Long l12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = basicConstraints.ca;
        }
        if ((i12 & 2) != 0) {
            l12 = basicConstraints.maxIntermediateCas;
        }
        return basicConstraints.copy(z12, l12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCa() {
        return this.ca;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Long getMaxIntermediateCas() {
        return this.maxIntermediateCas;
    }

    @k
    public final BasicConstraints copy(boolean ca2, @l Long maxIntermediateCas) {
        return new BasicConstraints(ca2, maxIntermediateCas);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicConstraints)) {
            return false;
        }
        BasicConstraints basicConstraints = (BasicConstraints) other;
        return this.ca == basicConstraints.ca && L.f(this.maxIntermediateCas, basicConstraints.maxIntermediateCas);
    }

    public final boolean getCa() {
        return this.ca;
    }

    @l
    public final Long getMaxIntermediateCas() {
        return this.maxIntermediateCas;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z12 = this.ca;
        ?? r02 = z12;
        if (z12) {
            r02 = 1;
        }
        int i12 = r02 * 31;
        Long l12 = this.maxIntermediateCas;
        return i12 + (l12 == null ? 0 : l12.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BasicConstraints(ca=");
        sb2.append(this.ca);
        sb2.append(", maxIntermediateCas=");
        return m.m(sb2, this.maxIntermediateCas, ')');
    }
}
