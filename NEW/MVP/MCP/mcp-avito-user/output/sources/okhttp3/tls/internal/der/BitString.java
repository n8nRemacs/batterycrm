package okhttp3.tls.internal.der;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import okio.C44805o;

/* compiled from: BitString.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\t¨\u0006\u001a"}, d2 = {"Lokhttp3/tls/internal/der/BitString;", "", "Lokio/o;", "byteString", "", "unusedBitsCount", "<init>", "(Lokio/o;I)V", "hashCode", "()I", "component1", "()Lokio/o;", "component2", "copy", "(Lokio/o;I)Lokhttp3/tls/internal/der/BitString;", "", "toString", "()Ljava/lang/String;", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lokio/o;", "getByteString", "I", "getUnusedBitsCount", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BitString {

    @k
    private final C44805o byteString;
    private final int unusedBitsCount;

    public BitString(@k C44805o c44805o, int i12) {
        this.byteString = c44805o;
        this.unusedBitsCount = i12;
    }

    public static /* synthetic */ BitString copy$default(BitString bitString, C44805o c44805o, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c44805o = bitString.byteString;
        }
        if ((i13 & 2) != 0) {
            i12 = bitString.unusedBitsCount;
        }
        return bitString.copy(c44805o, i12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final C44805o getByteString() {
        return this.byteString;
    }

    /* renamed from: component2, reason: from getter */
    public final int getUnusedBitsCount() {
        return this.unusedBitsCount;
    }

    @k
    public final BitString copy(@k C44805o byteString, int unusedBitsCount) {
        return new BitString(byteString, unusedBitsCount);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitString)) {
            return false;
        }
        BitString bitString = (BitString) other;
        return L.f(this.byteString, bitString.byteString) && this.unusedBitsCount == bitString.unusedBitsCount;
    }

    @k
    public final C44805o getByteString() {
        return this.byteString;
    }

    public final int getUnusedBitsCount() {
        return this.unusedBitsCount;
    }

    public int hashCode() {
        return (this.byteString.hashCode() * 31) + this.unusedBitsCount;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BitString(byteString=");
        sb2.append(this.byteString);
        sb2.append(", unusedBitsCount=");
        return r.t(sb2, this.unusedBitsCount, ')');
    }
}
