package okhttp3.tls.internal.der;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okio.C44805o;

/* compiled from: AnyValue.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010&R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010*R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010#\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0016¨\u0006/"}, d2 = {"Lokhttp3/tls/internal/der/AnyValue;", "", "", "tagClass", "", "tag", "", "constructed", "length", "Lokio/o;", "bytes", "<init>", "(IJZJLokio/o;)V", "hashCode", "()I", "component1", "component2", "()J", "component3", "()Z", "component4", "component5", "()Lokio/o;", "copy", "(IJZJLokio/o;)Lokhttp3/tls/internal/der/AnyValue;", "", "toString", "()Ljava/lang/String;", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "I", "getTagClass", "setTagClass", "(I)V", "J", "getTag", "setTag", "(J)V", "Z", "getConstructed", "setConstructed", "(Z)V", "getLength", "setLength", "Lokio/o;", "getBytes", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AnyValue {

    @k
    private final C44805o bytes;
    private boolean constructed;
    private long length;
    private long tag;
    private int tagClass;

    public AnyValue(int i12, long j12, boolean z12, long j13, @k C44805o c44805o) {
        this.tagClass = i12;
        this.tag = j12;
        this.constructed = z12;
        this.length = j13;
        this.bytes = c44805o;
    }

    public static /* synthetic */ AnyValue copy$default(AnyValue anyValue, int i12, long j12, boolean z12, long j13, C44805o c44805o, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = anyValue.tagClass;
        }
        if ((i13 & 2) != 0) {
            j12 = anyValue.tag;
        }
        long j14 = j12;
        if ((i13 & 4) != 0) {
            z12 = anyValue.constructed;
        }
        boolean z13 = z12;
        if ((i13 & 8) != 0) {
            j13 = anyValue.length;
        }
        long j15 = j13;
        if ((i13 & 16) != 0) {
            c44805o = anyValue.bytes;
        }
        return anyValue.copy(i12, j14, z13, j15, c44805o);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTagClass() {
        return this.tagClass;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTag() {
        return this.tag;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getConstructed() {
        return this.constructed;
    }

    /* renamed from: component4, reason: from getter */
    public final long getLength() {
        return this.length;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final C44805o getBytes() {
        return this.bytes;
    }

    @k
    public final AnyValue copy(int tagClass, long tag, boolean constructed, long length, @k C44805o bytes) {
        return new AnyValue(tagClass, tag, constructed, length, bytes);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnyValue)) {
            return false;
        }
        AnyValue anyValue = (AnyValue) other;
        return this.tagClass == anyValue.tagClass && this.tag == anyValue.tag && this.constructed == anyValue.constructed && this.length == anyValue.length && L.f(this.bytes, anyValue.bytes);
    }

    @k
    public final C44805o getBytes() {
        return this.bytes;
    }

    public final boolean getConstructed() {
        return this.constructed;
    }

    public final long getLength() {
        return this.length;
    }

    public final long getTag() {
        return this.tag;
    }

    public final int getTagClass() {
        return this.tagClass;
    }

    public int hashCode() {
        return this.bytes.hashCode() + (((((((this.tagClass * 31) + ((int) this.tag)) * 31) + (!this.constructed ? 1 : 0)) * 31) + ((int) this.length)) * 31);
    }

    public final void setConstructed(boolean z12) {
        this.constructed = z12;
    }

    public final void setLength(long j12) {
        this.length = j12;
    }

    public final void setTag(long j12) {
        this.tag = j12;
    }

    public final void setTagClass(int i12) {
        this.tagClass = i12;
    }

    @k
    public String toString() {
        return "AnyValue(tagClass=" + this.tagClass + ", tag=" + this.tag + ", constructed=" + this.constructed + ", length=" + this.length + ", bytes=" + this.bytes + ')';
    }

    public /* synthetic */ AnyValue(int i12, long j12, boolean z12, long j13, C44805o c44805o, int i13, C42822w c42822w) {
        this(i12, j12, (i13 & 4) != 0 ? false : z12, (i13 & 8) != 0 ? -1L : j13, c44805o);
    }
}
