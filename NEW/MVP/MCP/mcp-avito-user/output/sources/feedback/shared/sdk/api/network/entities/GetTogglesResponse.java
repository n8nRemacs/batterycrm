package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/GetTogglesResponse;", "", "togglesStatus", "", "(Z)V", "getTogglesStatus", "()Z", "component1", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class GetTogglesResponse {
    private final boolean togglesStatus;

    public GetTogglesResponse(boolean z12) {
        this.togglesStatus = z12;
    }

    public static /* synthetic */ GetTogglesResponse copy$default(GetTogglesResponse getTogglesResponse, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = getTogglesResponse.togglesStatus;
        }
        return getTogglesResponse.copy(z12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getTogglesStatus() {
        return this.togglesStatus;
    }

    @k
    public final GetTogglesResponse copy(boolean togglesStatus) {
        return new GetTogglesResponse(togglesStatus);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetTogglesResponse) && this.togglesStatus == ((GetTogglesResponse) other).togglesStatus;
    }

    public final boolean getTogglesStatus() {
        return this.togglesStatus;
    }

    public int hashCode() {
        boolean z12 = this.togglesStatus;
        if (z12) {
            return 1;
        }
        return z12 ? 1 : 0;
    }

    @k
    public String toString() {
        return r.x(new StringBuilder("GetTogglesResponse(togglesStatus="), this.togglesStatus, ')');
    }
}
