package okhttp3.tls.internal.der;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: certificates.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lokhttp3/tls/internal/der/AttributeTypeAndValue;", "", "type", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "getType", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "okhttp-tls"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AttributeTypeAndValue {

    @k
    private final String type;

    @l
    private final Object value;

    public AttributeTypeAndValue(@k String str, @l Object obj) {
        this.type = str;
        this.value = obj;
    }

    public static /* synthetic */ AttributeTypeAndValue copy$default(AttributeTypeAndValue attributeTypeAndValue, String str, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            str = attributeTypeAndValue.type;
        }
        if ((i12 & 2) != 0) {
            obj = attributeTypeAndValue.value;
        }
        return attributeTypeAndValue.copy(str, obj);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @k
    public final AttributeTypeAndValue copy(@k String type, @l Object value) {
        return new AttributeTypeAndValue(type, value);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributeTypeAndValue)) {
            return false;
        }
        AttributeTypeAndValue attributeTypeAndValue = (AttributeTypeAndValue) other;
        return L.f(this.type, attributeTypeAndValue.type) && L.f(this.value, attributeTypeAndValue.value);
    }

    @k
    public final String getType() {
        return this.type;
    }

    @l
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Object obj = this.value;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AttributeTypeAndValue(type=");
        sb2.append(this.type);
        sb2.append(", value=");
        return H.n(sb2, this.value, ')');
    }
}
