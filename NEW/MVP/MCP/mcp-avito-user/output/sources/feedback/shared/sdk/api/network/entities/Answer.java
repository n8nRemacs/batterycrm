package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Answer;", "", "answerId", "", "message", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getAnswerId", "()Ljava/lang/String;", "getMessage", "getStatusCode", "()I", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Answer {

    @k
    private final String answerId;

    @k
    private final String message;
    private final int statusCode;

    public Answer(@k String str, @k String str2, int i12) {
        this.answerId = str;
        this.message = str2;
        this.statusCode = i12;
    }

    public static /* synthetic */ Answer copy$default(Answer answer, String str, String str2, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = answer.answerId;
        }
        if ((i13 & 2) != 0) {
            str2 = answer.message;
        }
        if ((i13 & 4) != 0) {
            i12 = answer.statusCode;
        }
        return answer.copy(str, str2, i12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getAnswerId() {
        return this.answerId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    @k
    public final Answer copy(@k String answerId, @k String message, int statusCode) {
        return new Answer(answerId, message, statusCode);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Answer)) {
            return false;
        }
        Answer answer = (Answer) other;
        return L.f(this.answerId, answer.answerId) && L.f(this.message, answer.message) && this.statusCode == answer.statusCode;
    }

    @k
    public final String getAnswerId() {
        return this.answerId;
    }

    @k
    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return Integer.hashCode(this.statusCode) + H.d(this.answerId.hashCode() * 31, 31, this.message);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Answer(answerId=");
        sb2.append(this.answerId);
        sb2.append(", message=");
        sb2.append(this.message);
        sb2.append(", statusCode=");
        return r.t(sb2, this.statusCode, ')');
    }
}
