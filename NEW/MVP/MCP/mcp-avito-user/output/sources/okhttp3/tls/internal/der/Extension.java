package okhttp3.tls.internal.der;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: certificates.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lokhttp3/tls/internal/der/Extension;", "", "id", "", "critical", "", "value", "(Ljava/lang/String;ZLjava/lang/Object;)V", "getCritical", "()Z", "getId", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Extension {
    private final boolean critical;

    @k
    private final String id;

    @l
    private final Object value;

    public Extension(@k String str, boolean z12, @l Object obj) {
        this.id = str;
        this.critical = z12;
        this.value = obj;
    }

    public static /* synthetic */ Extension copy$default(Extension extension, String str, boolean z12, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            str = extension.id;
        }
        if ((i12 & 2) != 0) {
            z12 = extension.critical;
        }
        if ((i12 & 4) != 0) {
            obj = extension.value;
        }
        return extension.copy(str, z12, obj);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCritical() {
        return this.critical;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @k
    public final Extension copy(@k String id2, boolean critical, @l Object value) {
        return new Extension(id2, critical, value);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Extension)) {
            return false;
        }
        Extension extension = (Extension) other;
        return L.f(this.id, extension.id) && this.critical == extension.critical && L.f(this.value, extension.value);
    }

    public final boolean getCritical() {
        return this.critical;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final Object getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        boolean z12 = this.critical;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int i13 = (iHashCode + i12) * 31;
        Object obj = this.value;
        return i13 + (obj == null ? 0 : obj.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Extension(id=");
        sb2.append(this.id);
        sb2.append(", critical=");
        sb2.append(this.critical);
        sb2.append(", value=");
        return H.n(sb2, this.value, ')');
    }
}
