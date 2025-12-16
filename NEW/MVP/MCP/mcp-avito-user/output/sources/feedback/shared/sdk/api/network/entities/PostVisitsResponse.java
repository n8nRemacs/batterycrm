package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/PostVisitsResponse;", "", "message", "", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Ljava/lang/String;I)V", "getMessage", "()Ljava/lang/String;", "getStatusCode", "()I", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PostVisitsResponse {

    @k
    private final String message;
    private final int statusCode;

    public PostVisitsResponse(@k String str, int i12) {
        this.message = str;
        this.statusCode = i12;
    }

    public static /* synthetic */ PostVisitsResponse copy$default(PostVisitsResponse postVisitsResponse, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = postVisitsResponse.message;
        }
        if ((i13 & 2) != 0) {
            i12 = postVisitsResponse.statusCode;
        }
        return postVisitsResponse.copy(str, i12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    @k
    public final PostVisitsResponse copy(@k String message, int statusCode) {
        return new PostVisitsResponse(message, statusCode);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostVisitsResponse)) {
            return false;
        }
        PostVisitsResponse postVisitsResponse = (PostVisitsResponse) other;
        return L.f(this.message, postVisitsResponse.message) && this.statusCode == postVisitsResponse.statusCode;
    }

    @k
    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return Integer.hashCode(this.statusCode) + (this.message.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PostVisitsResponse(message=");
        sb2.append(this.message);
        sb2.append(", statusCode=");
        return r.t(sb2, this.statusCode, ')');
    }
}
