package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/CheckAttributesResponse;", "", "checkAttributes", "", Navigation.ATTRIBUTES, "", "", "(ZLjava/util/Map;)V", "getAttributes", "()Ljava/util/Map;", "getCheckAttributes", "()Z", "component1", "component2", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CheckAttributesResponse {

    @k
    private final Map<String, Boolean> attributes;
    private final boolean checkAttributes;

    public CheckAttributesResponse(boolean z12, @k Map<String, Boolean> map) {
        this.checkAttributes = z12;
        this.attributes = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckAttributesResponse copy$default(CheckAttributesResponse checkAttributesResponse, boolean z12, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = checkAttributesResponse.checkAttributes;
        }
        if ((i12 & 2) != 0) {
            map = checkAttributesResponse.attributes;
        }
        return checkAttributesResponse.copy(z12, map);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCheckAttributes() {
        return this.checkAttributes;
    }

    @k
    public final Map<String, Boolean> component2() {
        return this.attributes;
    }

    @k
    public final CheckAttributesResponse copy(boolean checkAttributes, @k Map<String, Boolean> attributes) {
        return new CheckAttributesResponse(checkAttributes, attributes);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckAttributesResponse)) {
            return false;
        }
        CheckAttributesResponse checkAttributesResponse = (CheckAttributesResponse) other;
        return this.checkAttributes == checkAttributesResponse.checkAttributes && L.f(this.attributes, checkAttributesResponse.attributes);
    }

    @k
    public final Map<String, Boolean> getAttributes() {
        return this.attributes;
    }

    public final boolean getCheckAttributes() {
        return this.checkAttributes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public int hashCode() {
        boolean z12 = this.checkAttributes;
        ?? r02 = z12;
        if (z12) {
            r02 = 1;
        }
        return this.attributes.hashCode() + (r02 * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CheckAttributesResponse(checkAttributes=");
        sb2.append(this.checkAttributes);
        sb2.append(", attributes=");
        return r.w(sb2, this.attributes, ')');
    }
}
