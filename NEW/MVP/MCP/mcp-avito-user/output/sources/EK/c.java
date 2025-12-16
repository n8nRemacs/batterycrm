package EK;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacInterAppCallPushReceiver.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"LEK/c;", "", "", FailedBinderCallBack.CALLER_ID, InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "", "isVideo", "scenario", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "d", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "c", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    @com.google.gson.annotations.c(FailedBinderCallBack.CALLER_ID)
    @k
    private final String callId;

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
    @k
    private final String from;

    @com.google.gson.annotations.c("isVideo")
    @l
    private final Boolean isVideo;

    @com.google.gson.annotations.c("scenario")
    @k
    private final String scenario;

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
    @k
    private final String to;

    public c(@k String str, @k String str2, @k String str3, @l Boolean bool, @k String str4) {
        this.callId = str;
        this.from = str2;
        this.to = str3;
        this.isVideo = bool;
        this.scenario = str4;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Boolean getIsVideo() {
        return this.isVideo;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.callId, cVar.callId) && L.f(this.from, cVar.from) && L.f(this.to, cVar.to) && L.f(this.isVideo, cVar.isVideo) && L.f(this.scenario, cVar.scenario);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.callId.hashCode() * 31, 31, this.from), 31, this.to);
        Boolean bool = this.isVideo;
        return this.scenario.hashCode() + ((iD2 + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InterAppCallPushData(callId=");
        sb2.append(this.callId);
        sb2.append(", from=");
        sb2.append(this.from);
        sb2.append(", to=");
        sb2.append(this.to);
        sb2.append(", isVideo=");
        sb2.append(this.isVideo);
        sb2.append(", scenario=");
        return C22026a.c(sb2, this.scenario, ')');
    }
}
