package okhttp3.tls.internal.der;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: certificates.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lokhttp3/tls/internal/der/Validity;", "", "notBefore", "", "notAfter", "(JJ)V", "getNotAfter", "()J", "getNotBefore", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Validity {
    private final long notAfter;
    private final long notBefore;

    public Validity(long j12, long j13) {
        this.notBefore = j12;
        this.notAfter = j13;
    }

    public static /* synthetic */ Validity copy$default(Validity validity, long j12, long j13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = validity.notBefore;
        }
        if ((i12 & 2) != 0) {
            j13 = validity.notAfter;
        }
        return validity.copy(j12, j13);
    }

    /* renamed from: component1, reason: from getter */
    public final long getNotBefore() {
        return this.notBefore;
    }

    /* renamed from: component2, reason: from getter */
    public final long getNotAfter() {
        return this.notAfter;
    }

    @k
    public final Validity copy(long notBefore, long notAfter) {
        return new Validity(notBefore, notAfter);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Validity)) {
            return false;
        }
        Validity validity = (Validity) other;
        return this.notBefore == validity.notBefore && this.notAfter == validity.notAfter;
    }

    public final long getNotAfter() {
        return this.notAfter;
    }

    public final long getNotBefore() {
        return this.notBefore;
    }

    public int hashCode() {
        return (((int) this.notBefore) * 31) + ((int) this.notAfter);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Validity(notBefore=");
        sb2.append(this.notBefore);
        sb2.append(", notAfter=");
        return r.u(sb2, this.notAfter, ')');
    }
}
