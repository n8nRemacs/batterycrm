package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/PostScreenshotResponse;", "", "status", "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PostScreenshotResponse {

    @k
    private final String status;

    public PostScreenshotResponse(@k String str) {
        this.status = str;
    }

    public static /* synthetic */ PostScreenshotResponse copy$default(PostScreenshotResponse postScreenshotResponse, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = postScreenshotResponse.status;
        }
        return postScreenshotResponse.copy(str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @k
    public final PostScreenshotResponse copy(@k String status) {
        return new PostScreenshotResponse(status);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PostScreenshotResponse) && L.f(this.status, ((PostScreenshotResponse) other).status);
    }

    @k
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    @k
    public String toString() {
        return C22026a.c(new StringBuilder("PostScreenshotResponse(status="), this.status, ')');
    }
}
