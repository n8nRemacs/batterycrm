package sQ;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobInterviewInvitationResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LsQ/f;", "", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sQ.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C48096f {

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
    @k
    private final String from;

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
    @l
    private final String to;

    public C48096f(@k String str, @l String str2) {
        this.from = str;
        this.to = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48096f)) {
            return false;
        }
        C48096f c48096f = (C48096f) obj;
        return L.f(this.from, c48096f.from) && L.f(this.to, c48096f.to);
    }

    public final int hashCode() {
        int iHashCode = this.from.hashCode() * 31;
        String str = this.to;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(from=");
        sb2.append(this.from);
        sb2.append(", to=");
        return C22026a.c(sb2, this.to, ')');
    }
}
